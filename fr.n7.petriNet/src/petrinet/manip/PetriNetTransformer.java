package petrinet.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import PetriNet.Arc;
import PetriNet.PetriNetFactory;
import PetriNet.PetriNetPackage;
import PetriNet.Place;
import PetriNet.ReseauPetri;
import PetriNet.Transition;
import PetriNet.Noeud;
import simplepdl.Process;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;



public class PetriNetTransformer {
	public static void main(String[] args) {
		
		// Chargement du package PetriNet afin de l'enregistrer dans le registre d'Eclipse.
		PetriNetPackage packagePetriNetInstance = PetriNetPackage.eINSTANCE;
		
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageSimplePdlInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle de processus)
		ResourceSet resProcessSet = new ResourceSetImpl();
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle de petri)
		ResourceSet resPetriSet = new ResourceSetImpl();
		
		// Charger la ressource (notre modÃ¨le de processus)
		URI modelProcessURI = URI.createURI("models/ProcessusModel.xmi");
		Resource resourceProcess = resProcessSet.getResource(modelProcessURI, true);
		// DÃ©finir la ressource (le modÃ¨le de petri)
		URI modelPetriNetURI = URI.createURI("models/PetriNet_Created_Model.xmi");
		Resource resourcePetriNet = resPetriSet.createResource(modelPetriNetURI);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de PetriNet
	    PetriNetFactory myFactory = PetriNetFactory.eINSTANCE;
	    
	    
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le de processus (Ã©lÃ©ment racine)
		Process process = (Process) resourceProcess.getContents().get(0);
		
		// CrÃ©er un Ã©lÃ©ment ReseauPetri
	    ReseauPetri reseauPetri = myFactory.createReseauPetri();
	    reseauPetri.setName(process.getName());
	    
	    // Ajouter le reseauPetri dans le modÃ¨le de petri
	 	resourcePetriNet.getContents().add(reseauPetri);
		
	 	HashMap<String, Noeud> noeuds = new HashMap<String,Noeud>();
	 	// Tranformation des workdefinitions
	 	for (Object o : process.getProcessElement()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				// Création place ready
				Place placeReady = myFactory.createPlace();
				String nom=wd.getName() + "_Ready";
				placeReady.setName(nom);
				placeReady.setJeton(1);
				reseauPetri.getPetrielement().add(placeReady);
				noeuds.put(nom, placeReady);
				
				// Création place EnCours
				Place placeEnCours = myFactory.createPlace();
				nom=wd.getName() + "_EnCours";
				placeEnCours.setName(nom);
				placeEnCours.setJeton(0);
				reseauPetri.getPetrielement().add(placeEnCours);
				noeuds.put(nom, placeEnCours);
				
				// Création place Finish
				Place placeFinish = myFactory.createPlace();
				nom=wd.getName() + "_Finish";
				placeFinish.setName(nom);
				placeFinish.setJeton(0);
				reseauPetri.getPetrielement().add(placeFinish);
				noeuds.put(nom, placeFinish);
				
				// Création place started
				Place placeStarted = myFactory.createPlace();
				nom=wd.getName() + "_Started";
				placeStarted.setName(nom);
				placeStarted.setJeton(0);
				reseauPetri.getPetrielement().add(placeStarted);
				noeuds.put(nom, placeStarted);
				
				// Création transition start
				Transition transitionStart = myFactory.createTransition();
				nom = "Start_" + wd.getName();
				transitionStart.setName(nom);
				reseauPetri.getPetrielement().add(transitionStart);
				noeuds.put(nom, transitionStart);
				
				// Création transition Finish
				Transition transitionFinish = myFactory.createTransition();
				nom = "Finish_" + wd.getName();
				transitionFinish.setName(nom);
				reseauPetri.getPetrielement().add(transitionFinish);
				noeuds.put(nom, transitionFinish);
				
				// Création arcs
				Arc Arc1 = myFactory.createArc();
				Arc1.setPredecessor(placeReady);
				Arc1.setSuccessor(transitionStart);
				Arc1.setPoids(1);
				reseauPetri.getPetrielement().add(Arc1);
				
				Arc Arc2 = myFactory.createArc();
				Arc2.setPredecessor(transitionStart);
				Arc2.setSuccessor(placeEnCours);
				Arc2.setPoids(1);
				reseauPetri.getPetrielement().add(Arc2);
				
				Arc Arc3 = myFactory.createArc();
				Arc3.setPredecessor(placeEnCours);
				Arc3.setSuccessor(transitionFinish);
				Arc3.setPoids(1);
				reseauPetri.getPetrielement().add(Arc3);
				
				Arc Arc4 = myFactory.createArc();
				Arc4.setPredecessor(transitionFinish);
				Arc4.setSuccessor(placeFinish);
				Arc4.setPoids(1);
				reseauPetri.getPetrielement().add(Arc4);
				
				Arc Arc5 = myFactory.createArc();
				Arc5.setPredecessor(transitionStart);
				Arc5.setSuccessor(placeStarted);
				Arc5.setPoids(1);
				reseauPetri.getPetrielement().add(Arc5);
			}
	 	}
	 	
	 	// Transformation worksequence
	 	for (Object o : process.getProcessElement()) {
			if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				Place prede;
				Transition succ;
				if(ws.getLinkType().equals(WorkSequenceType.FINISH_TO_START)) {
					Arc arcf2s = myFactory.createArc();
					arcf2s.setIsReadArc(true);
					arcf2s.setPoids(1);
					prede = (Place) noeuds.get(ws.getPredecessor().getName() + "_Finish");
					arcf2s.setPredecessor(prede);
					succ = (Transition) noeuds.get("Start_" + ws.getSuccessor().getName());
					arcf2s.setSuccessor(succ);
					reseauPetri.getPetrielement().add(arcf2s);
				} else if(ws.getLinkType().equals(WorkSequenceType.START_TO_FINISH)) {
					Arc arcs2f = myFactory.createArc();
					arcs2f.setIsReadArc(true);
					arcs2f.setPoids(1);
					prede = (Place) noeuds.get(ws.getPredecessor().getName() + "_Started");
					arcs2f.setPredecessor(prede);
					succ = (Transition) noeuds.get("Finish_" + ws.getSuccessor().getName());
					arcs2f.setSuccessor(succ);
					reseauPetri.getPetrielement().add(arcs2f);
				} else if(ws.getLinkType().equals(WorkSequenceType.START_TO_START)) {
					Arc arcs2s = myFactory.createArc();
					arcs2s.setIsReadArc(true);
					arcs2s.setPoids(1);
					prede = (Place) noeuds.get(ws.getPredecessor().getName() + "_Started");
					arcs2s.setPredecessor(prede);
					succ = (Transition) noeuds.get("Start_" + ws.getSuccessor().getName());
					arcs2s.setSuccessor(succ);
					reseauPetri.getPetrielement().add(arcs2s);
				} else if(ws.getLinkType().equals(WorkSequenceType.FINISH_TO_FINISH)) {
					Arc arcf2f = myFactory.createArc();
					arcf2f.setIsReadArc(true);
					arcf2f.setPoids(1);
					prede = (Place) noeuds.get(ws.getPredecessor().getName() + "_Finish");
					arcf2f.setPredecessor(prede);
					succ = (Transition) noeuds.get("Finish_" + ws.getSuccessor().getName());
					arcf2f.setSuccessor(succ);
					reseauPetri.getPetrielement().add(arcf2f);
				}
			}
	 	}
	 	// Sauver la ressource
	    try {
	    	resourcePetriNet.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	 	
		    
	}

}

