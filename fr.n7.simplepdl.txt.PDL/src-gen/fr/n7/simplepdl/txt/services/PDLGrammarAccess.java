/*
 * generated by Xtext 2.12.0
 */
package fr.n7.simplepdl.txt.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PDLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProcessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.Process");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProcessAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProcessKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cProcessElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cProcessElementProcessElementParserRuleCall_4_0 = (RuleCall)cProcessElementAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Process:
		//	{Process}
		//	'process'
		//	name=EString
		//	'{'
		//	processElement+=ProcessElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Process} 'process' name=EString '{' processElement+=ProcessElement* '}'
		public Group getGroup() { return cGroup; }
		
		//{Process}
		public Action getProcessAction_0() { return cProcessAction_0; }
		
		//'process'
		public Keyword getProcessKeyword_1() { return cProcessKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//processElement+=ProcessElement*
		public Assignment getProcessElementAssignment_4() { return cProcessElementAssignment_4; }
		
		//ProcessElement
		public RuleCall getProcessElementProcessElementParserRuleCall_4_0() { return cProcessElementProcessElementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ProcessElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.ProcessElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWorkDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWorkSequenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGuidanceParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRessourceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ProcessElement:
		//	WorkDefinition | WorkSequence | Guidance | Ressource;
		@Override public ParserRule getRule() { return rule; }
		
		//WorkDefinition | WorkSequence | Guidance | Ressource
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//WorkDefinition
		public RuleCall getWorkDefinitionParserRuleCall_0() { return cWorkDefinitionParserRuleCall_0; }
		
		//WorkSequence
		public RuleCall getWorkSequenceParserRuleCall_1() { return cWorkSequenceParserRuleCall_1; }
		
		//Guidance
		public RuleCall getGuidanceParserRuleCall_2() { return cGuidanceParserRuleCall_2; }
		
		//Ressource
		public RuleCall getRessourceParserRuleCall_3() { return cRessourceParserRuleCall_3; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class WorkDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.WorkDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWorkDefinitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWdKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAllocationAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAllocationAllocationParserRuleCall_3_1_0 = (RuleCall)cAllocationAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cAllocationAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cAllocationAllocationParserRuleCall_3_2_1_0 = (RuleCall)cAllocationAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		
		//WorkDefinition:
		//	{WorkDefinition}
		//	'wd'
		//	name=EString ('{' allocation+=Allocation ("," allocation+=Allocation)* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//{WorkDefinition} 'wd' name=EString ('{' allocation+=Allocation ("," allocation+=Allocation)* '}')?
		public Group getGroup() { return cGroup; }
		
		//{WorkDefinition}
		public Action getWorkDefinitionAction_0() { return cWorkDefinitionAction_0; }
		
		//'wd'
		public Keyword getWdKeyword_1() { return cWdKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//('{' allocation+=Allocation ("," allocation+=Allocation)* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_0() { return cLeftCurlyBracketKeyword_3_0; }
		
		//allocation+=Allocation
		public Assignment getAllocationAssignment_3_1() { return cAllocationAssignment_3_1; }
		
		//Allocation
		public RuleCall getAllocationAllocationParserRuleCall_3_1_0() { return cAllocationAllocationParserRuleCall_3_1_0; }
		
		//("," allocation+=Allocation)*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//allocation+=Allocation
		public Assignment getAllocationAssignment_3_2_1() { return cAllocationAssignment_3_2_1; }
		
		//Allocation
		public RuleCall getAllocationAllocationParserRuleCall_3_2_1_0() { return cAllocationAllocationParserRuleCall_3_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }
	}
	public class WorkSequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.WorkSequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLinkTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkTypeWorkSequenceTypeEnumRuleCall_1_0 = (RuleCall)cLinkTypeAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPredecessorAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPredecessorWorkDefinitionCrossReference_3_0 = (CrossReference)cPredecessorAssignment_3.eContents().get(0);
		private final RuleCall cPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1 = (RuleCall)cPredecessorWorkDefinitionCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSuccessorAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSuccessorWorkDefinitionCrossReference_5_0 = (CrossReference)cSuccessorAssignment_5.eContents().get(0);
		private final RuleCall cSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1 = (RuleCall)cSuccessorWorkDefinitionCrossReference_5_0.eContents().get(1);
		
		//WorkSequence:
		//	'ws'
		//	linkType=WorkSequenceType
		//	'from' predecessor=[WorkDefinition]
		//	'to' successor=[WorkDefinition];
		@Override public ParserRule getRule() { return rule; }
		
		//'ws' linkType=WorkSequenceType 'from' predecessor=[WorkDefinition] 'to' successor=[WorkDefinition]
		public Group getGroup() { return cGroup; }
		
		//'ws'
		public Keyword getWsKeyword_0() { return cWsKeyword_0; }
		
		//linkType=WorkSequenceType
		public Assignment getLinkTypeAssignment_1() { return cLinkTypeAssignment_1; }
		
		//WorkSequenceType
		public RuleCall getLinkTypeWorkSequenceTypeEnumRuleCall_1_0() { return cLinkTypeWorkSequenceTypeEnumRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//predecessor=[WorkDefinition]
		public Assignment getPredecessorAssignment_3() { return cPredecessorAssignment_3; }
		
		//[WorkDefinition]
		public CrossReference getPredecessorWorkDefinitionCrossReference_3_0() { return cPredecessorWorkDefinitionCrossReference_3_0; }
		
		//ID
		public RuleCall getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1() { return cPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//successor=[WorkDefinition]
		public Assignment getSuccessorAssignment_5() { return cSuccessorAssignment_5; }
		
		//[WorkDefinition]
		public CrossReference getSuccessorWorkDefinitionCrossReference_5_0() { return cSuccessorWorkDefinitionCrossReference_5_0; }
		
		//ID
		public RuleCall getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1() { return cSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1; }
	}
	public class GuidanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.Guidance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGuidanceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNoteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTextKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTextAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTextEStringParserRuleCall_3_1_0 = (RuleCall)cTextAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cElementsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cElementsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final CrossReference cElementsProcessElementCrossReference_4_2_0 = (CrossReference)cElementsAssignment_4_2.eContents().get(0);
		private final RuleCall cElementsProcessElementIDTerminalRuleCall_4_2_0_1 = (RuleCall)cElementsProcessElementCrossReference_4_2_0.eContents().get(1);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cElementsAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final CrossReference cElementsProcessElementCrossReference_4_3_1_0 = (CrossReference)cElementsAssignment_4_3_1.eContents().get(0);
		private final RuleCall cElementsProcessElementIDTerminalRuleCall_4_3_1_0_1 = (RuleCall)cElementsProcessElementCrossReference_4_3_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Guidance:
		//	{Guidance}
		//	'note'
		//	'{' ('text' text=EString)? ('elements' '(' elements+=[ProcessElement] ("," elements+=[ProcessElement])* ')')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Guidance} 'note' '{' ('text' text=EString)? ('elements' '(' elements+=[ProcessElement] (","
		//elements+=[ProcessElement])* ')')? '}'
		public Group getGroup() { return cGroup; }
		
		//{Guidance}
		public Action getGuidanceAction_0() { return cGuidanceAction_0; }
		
		//'note'
		public Keyword getNoteKeyword_1() { return cNoteKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('text' text=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'text'
		public Keyword getTextKeyword_3_0() { return cTextKeyword_3_0; }
		
		//text=EString
		public Assignment getTextAssignment_3_1() { return cTextAssignment_3_1; }
		
		//EString
		public RuleCall getTextEStringParserRuleCall_3_1_0() { return cTextEStringParserRuleCall_3_1_0; }
		
		//('elements' '(' elements+=[ProcessElement] ("," elements+=[ProcessElement])* ')')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'elements'
		public Keyword getElementsKeyword_4_0() { return cElementsKeyword_4_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4_1() { return cLeftParenthesisKeyword_4_1; }
		
		//elements+=[ProcessElement]
		public Assignment getElementsAssignment_4_2() { return cElementsAssignment_4_2; }
		
		//[ProcessElement]
		public CrossReference getElementsProcessElementCrossReference_4_2_0() { return cElementsProcessElementCrossReference_4_2_0; }
		
		//ID
		public RuleCall getElementsProcessElementIDTerminalRuleCall_4_2_0_1() { return cElementsProcessElementIDTerminalRuleCall_4_2_0_1; }
		
		//("," elements+=[ProcessElement])*
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }
		
		//elements+=[ProcessElement]
		public Assignment getElementsAssignment_4_3_1() { return cElementsAssignment_4_3_1; }
		
		//[ProcessElement]
		public CrossReference getElementsProcessElementCrossReference_4_3_1_0() { return cElementsProcessElementCrossReference_4_3_1_0; }
		
		//ID
		public RuleCall getElementsProcessElementIDTerminalRuleCall_4_3_1_0_1() { return cElementsProcessElementIDTerminalRuleCall_4_3_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4_4() { return cRightParenthesisKeyword_4_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class RessourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.Ressource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRessourceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cCountAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCountEIntParserRuleCall_2_0 = (RuleCall)cCountAssignment_2.eContents().get(0);
		
		//Ressource:
		//	'ressource'
		//	name=EString
		//	count=EInt;
		@Override public ParserRule getRule() { return rule; }
		
		//'ressource' name=EString count=EInt
		public Group getGroup() { return cGroup; }
		
		//'ressource'
		public Keyword getRessourceKeyword_0() { return cRessourceKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//count=EInt
		public Assignment getCountAssignment_2() { return cCountAssignment_2; }
		
		//EInt
		public RuleCall getCountEIntParserRuleCall_2_0() { return cCountEIntParserRuleCall_2_0; }
	}
	public class AllocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.Allocation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAllocationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cNeededKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNeededAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNeededEIntParserRuleCall_3_0 = (RuleCall)cNeededAssignment_3.eContents().get(0);
		private final Keyword cRessourceKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRessourceAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cRessourceRessourceCrossReference_5_0 = (CrossReference)cRessourceAssignment_5.eContents().get(0);
		private final RuleCall cRessourceRessourceIDTerminalRuleCall_5_0_1 = (RuleCall)cRessourceRessourceCrossReference_5_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Allocation:
		//	'allocation'
		//	'{'
		//	'needed' needed=EInt
		//	'ressource' ressource=[Ressource]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'allocation' '{' 'needed' needed=EInt 'ressource' ressource=[Ressource] '}'
		public Group getGroup() { return cGroup; }
		
		//'allocation'
		public Keyword getAllocationKeyword_0() { return cAllocationKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'needed'
		public Keyword getNeededKeyword_2() { return cNeededKeyword_2; }
		
		//needed=EInt
		public Assignment getNeededAssignment_3() { return cNeededAssignment_3; }
		
		//EInt
		public RuleCall getNeededEIntParserRuleCall_3_0() { return cNeededEIntParserRuleCall_3_0; }
		
		//'ressource'
		public Keyword getRessourceKeyword_4() { return cRessourceKeyword_4; }
		
		//ressource=[Ressource]
		public Assignment getRessourceAssignment_5() { return cRessourceAssignment_5; }
		
		//[Ressource]
		public CrossReference getRessourceRessourceCrossReference_5_0() { return cRessourceRessourceCrossReference_5_0; }
		
		//ID
		public RuleCall getRessourceRessourceIDTerminalRuleCall_5_0_1() { return cRessourceRessourceIDTerminalRuleCall_5_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	public class WorkSequenceTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "fr.n7.simplepdl.txt.PDL.WorkSequenceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStartToStartEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStartToStartS2sKeyword_0_0 = (Keyword)cStartToStartEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFinishToStartEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFinishToStartF2sKeyword_1_0 = (Keyword)cFinishToStartEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cStartToFinishEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cStartToFinishS2fKeyword_2_0 = (Keyword)cStartToFinishEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cFinishToFinishEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cFinishToFinishF2fKeyword_3_0 = (Keyword)cFinishToFinishEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum WorkSequenceType:
		//	startToStart='s2s' | finishToStart='f2s' | startToFinish='s2f' | finishToFinish='f2f';
		public EnumRule getRule() { return rule; }
		
		//startToStart='s2s' | finishToStart='f2s' | startToFinish='s2f' | finishToFinish='f2f'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//startToStart='s2s'
		public EnumLiteralDeclaration getStartToStartEnumLiteralDeclaration_0() { return cStartToStartEnumLiteralDeclaration_0; }
		
		//'s2s'
		public Keyword getStartToStartS2sKeyword_0_0() { return cStartToStartS2sKeyword_0_0; }
		
		//finishToStart='f2s'
		public EnumLiteralDeclaration getFinishToStartEnumLiteralDeclaration_1() { return cFinishToStartEnumLiteralDeclaration_1; }
		
		//'f2s'
		public Keyword getFinishToStartF2sKeyword_1_0() { return cFinishToStartF2sKeyword_1_0; }
		
		//startToFinish='s2f'
		public EnumLiteralDeclaration getStartToFinishEnumLiteralDeclaration_2() { return cStartToFinishEnumLiteralDeclaration_2; }
		
		//'s2f'
		public Keyword getStartToFinishS2fKeyword_2_0() { return cStartToFinishS2fKeyword_2_0; }
		
		//finishToFinish='f2f'
		public EnumLiteralDeclaration getFinishToFinishEnumLiteralDeclaration_3() { return cFinishToFinishEnumLiteralDeclaration_3; }
		
		//'f2f'
		public Keyword getFinishToFinishF2fKeyword_3_0() { return cFinishToFinishF2fKeyword_3_0; }
	}
	
	private final ProcessElements pProcess;
	private final ProcessElementElements pProcessElement;
	private final EStringElements pEString;
	private final WorkDefinitionElements pWorkDefinition;
	private final WorkSequenceElements pWorkSequence;
	private final GuidanceElements pGuidance;
	private final RessourceElements pRessource;
	private final AllocationElements pAllocation;
	private final EIntElements pEInt;
	private final WorkSequenceTypeElements eWorkSequenceType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PDLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProcess = new ProcessElements();
		this.pProcessElement = new ProcessElementElements();
		this.pEString = new EStringElements();
		this.pWorkDefinition = new WorkDefinitionElements();
		this.pWorkSequence = new WorkSequenceElements();
		this.pGuidance = new GuidanceElements();
		this.pRessource = new RessourceElements();
		this.pAllocation = new AllocationElements();
		this.pEInt = new EIntElements();
		this.eWorkSequenceType = new WorkSequenceTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.n7.simplepdl.txt.PDL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Process:
	//	{Process}
	//	'process'
	//	name=EString
	//	'{'
	//	processElement+=ProcessElement*
	//	'}';
	public ProcessElements getProcessAccess() {
		return pProcess;
	}
	
	public ParserRule getProcessRule() {
		return getProcessAccess().getRule();
	}
	
	//ProcessElement:
	//	WorkDefinition | WorkSequence | Guidance | Ressource;
	public ProcessElementElements getProcessElementAccess() {
		return pProcessElement;
	}
	
	public ParserRule getProcessElementRule() {
		return getProcessElementAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//WorkDefinition:
	//	{WorkDefinition}
	//	'wd'
	//	name=EString ('{' allocation+=Allocation ("," allocation+=Allocation)* '}')?;
	public WorkDefinitionElements getWorkDefinitionAccess() {
		return pWorkDefinition;
	}
	
	public ParserRule getWorkDefinitionRule() {
		return getWorkDefinitionAccess().getRule();
	}
	
	//WorkSequence:
	//	'ws'
	//	linkType=WorkSequenceType
	//	'from' predecessor=[WorkDefinition]
	//	'to' successor=[WorkDefinition];
	public WorkSequenceElements getWorkSequenceAccess() {
		return pWorkSequence;
	}
	
	public ParserRule getWorkSequenceRule() {
		return getWorkSequenceAccess().getRule();
	}
	
	//Guidance:
	//	{Guidance}
	//	'note'
	//	'{' ('text' text=EString)? ('elements' '(' elements+=[ProcessElement] ("," elements+=[ProcessElement])* ')')?
	//	'}';
	public GuidanceElements getGuidanceAccess() {
		return pGuidance;
	}
	
	public ParserRule getGuidanceRule() {
		return getGuidanceAccess().getRule();
	}
	
	//Ressource:
	//	'ressource'
	//	name=EString
	//	count=EInt;
	public RessourceElements getRessourceAccess() {
		return pRessource;
	}
	
	public ParserRule getRessourceRule() {
		return getRessourceAccess().getRule();
	}
	
	//Allocation:
	//	'allocation'
	//	'{'
	//	'needed' needed=EInt
	//	'ressource' ressource=[Ressource]
	//	'}';
	public AllocationElements getAllocationAccess() {
		return pAllocation;
	}
	
	public ParserRule getAllocationRule() {
		return getAllocationAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//enum WorkSequenceType:
	//	startToStart='s2s' | finishToStart='f2s' | startToFinish='s2f' | finishToFinish='f2f';
	public WorkSequenceTypeElements getWorkSequenceTypeAccess() {
		return eWorkSequenceType;
	}
	
	public EnumRule getWorkSequenceTypeRule() {
		return getWorkSequenceTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
