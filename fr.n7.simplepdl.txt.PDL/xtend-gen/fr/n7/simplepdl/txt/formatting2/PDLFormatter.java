/**
 * generated by Xtext 2.12.0
 */
package fr.n7.simplepdl.txt.formatting2;

import com.google.inject.Inject;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import simplepdl.Allocation;
import simplepdl.ProcessElement;
import simplepdl.WorkDefinition;

@SuppressWarnings("all")
public class PDLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private PDLGrammarAccess _pDLGrammarAccess;
  
  protected void _format(final simplepdl.Process process, @Extension final IFormattableDocument document) {
    EList<ProcessElement> _processElement = process.getProcessElement();
    for (final ProcessElement processElement : _processElement) {
      document.<ProcessElement>format(processElement);
    }
  }
  
  protected void _format(final WorkDefinition workDefinition, @Extension final IFormattableDocument document) {
    EList<Allocation> _allocation = workDefinition.getAllocation();
    for (final Allocation allocation : _allocation) {
      document.<Allocation>format(allocation);
    }
  }
  
  public void format(final Object workDefinition, final IFormattableDocument document) {
    if (workDefinition instanceof XtextResource) {
      _format((XtextResource)workDefinition, document);
      return;
    } else if (workDefinition instanceof WorkDefinition) {
      _format((WorkDefinition)workDefinition, document);
      return;
    } else if (workDefinition instanceof simplepdl.Process) {
      _format((simplepdl.Process)workDefinition, document);
      return;
    } else if (workDefinition instanceof EObject) {
      _format((EObject)workDefinition, document);
      return;
    } else if (workDefinition == null) {
      _format((Void)null, document);
      return;
    } else if (workDefinition != null) {
      _format(workDefinition, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(workDefinition, document).toString());
    }
  }
}