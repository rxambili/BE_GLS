/*
 * generated by Xtext 2.12.0
 */
grammar InternalPDL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.n7.simplepdl.txt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.n7.simplepdl.txt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;

}

@parser::members {

 	private PDLGrammarAccess grammarAccess;

    public InternalPDLParser(TokenStream input, PDLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Process";
   	}

   	@Override
   	protected PDLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProcess
entryRuleProcess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessRule()); }
	iv_ruleProcess=ruleProcess
	{ $current=$iv_ruleProcess.current; }
	EOF;

// Rule Process
ruleProcess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProcessAccess().getProcessAction_0(),
					$current);
			}
		)
		otherlv_1='process'
		{
			newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.n7.simplepdl.txt.PDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProcessAccess().getProcessElementProcessElementParserRuleCall_4_0());
				}
				lv_processElement_4_0=ruleProcessElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcessRule());
					}
					add(
						$current,
						"processElement",
						lv_processElement_4_0,
						"fr.n7.simplepdl.txt.PDL.ProcessElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleProcessElement
entryRuleProcessElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcessElementRule()); }
	iv_ruleProcessElement=ruleProcessElement
	{ $current=$iv_ruleProcessElement.current; }
	EOF;

// Rule ProcessElement
ruleProcessElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0());
		}
		this_WorkDefinition_0=ruleWorkDefinition
		{
			$current = $this_WorkDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1());
		}
		this_WorkSequence_1=ruleWorkSequence
		{
			$current = $this_WorkSequence_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2());
		}
		this_Guidance_2=ruleGuidance
		{
			$current = $this_Guidance_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3());
		}
		this_Ressource_3=ruleRessource
		{
			$current = $this_Ressource_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleWorkDefinition
entryRuleWorkDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkDefinitionRule()); }
	iv_ruleWorkDefinition=ruleWorkDefinition
	{ $current=$iv_ruleWorkDefinition.current; }
	EOF;

// Rule WorkDefinition
ruleWorkDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='wd'
		{
			newLeafNode(otherlv_1, grammarAccess.getWorkDefinitionAccess().getWdKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"fr.n7.simplepdl.txt.PDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getAllocationAllocationParserRuleCall_3_1_0());
					}
					lv_allocation_4_0=ruleAllocation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
						}
						add(
							$current,
							"allocation",
							lv_allocation_4_0,
							"fr.n7.simplepdl.txt.PDL.Allocation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getWorkDefinitionAccess().getAllocationAllocationParserRuleCall_3_2_1_0());
						}
						lv_allocation_6_0=ruleAllocation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
							}
							add(
								$current,
								"allocation",
								lv_allocation_6_0,
								"fr.n7.simplepdl.txt.PDL.Allocation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_3_3());
			}
		)?
	)
;

// Entry rule entryRuleWorkSequence
entryRuleWorkSequence returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWorkSequenceRule()); }
	iv_ruleWorkSequence=ruleWorkSequence
	{ $current=$iv_ruleWorkSequence.current; }
	EOF;

// Rule WorkSequence
ruleWorkSequence returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ws'
		{
			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0());
				}
				lv_linkType_1_0=ruleWorkSequenceType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
					}
					set(
						$current,
						"linkType",
						lv_linkType_1_0,
						"fr.n7.simplepdl.txt.PDL.WorkSequenceType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='from'
		{
			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0());
				}
			)
		)
		otherlv_4='to'
		{
			newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getWorkSequenceRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0());
				}
			)
		)
	)
;

// Entry rule entryRuleGuidance
entryRuleGuidance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGuidanceRule()); }
	iv_ruleGuidance=ruleGuidance
	{ $current=$iv_ruleGuidance.current; }
	EOF;

// Rule Guidance
ruleGuidance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGuidanceAccess().getGuidanceAction_0(),
					$current);
			}
		)
		otherlv_1='note'
		{
			newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getNoteKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='text'
			{
				newLeafNode(otherlv_3, grammarAccess.getGuidanceAccess().getTextKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_1_0());
					}
					lv_text_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGuidanceRule());
						}
						set(
							$current,
							"text",
							lv_text_4_0,
							"fr.n7.simplepdl.txt.PDL.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='elements'
			{
				newLeafNode(otherlv_5, grammarAccess.getGuidanceAccess().getElementsKeyword_4_0());
			}
			otherlv_6='('
			{
				newLeafNode(otherlv_6, grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGuidanceRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0());
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getGuidanceRule());
							}
						}
						otherlv_9=RULE_ID
						{
							newLeafNode(otherlv_9, grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0());
						}
					)
				)
			)*
			otherlv_10=')'
			{
				newLeafNode(otherlv_10, grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4());
			}
		)?
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleRessource
entryRuleRessource returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRessourceRule()); }
	iv_ruleRessource=ruleRessource
	{ $current=$iv_ruleRessource.current; }
	EOF;

// Rule Ressource
ruleRessource returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ressource'
		{
			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getRessourceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRessourceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"fr.n7.simplepdl.txt.PDL.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRessourceAccess().getCountEIntParserRuleCall_2_0());
				}
				lv_count_2_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRessourceRule());
					}
					set(
						$current,
						"count",
						lv_count_2_0,
						"fr.n7.simplepdl.txt.PDL.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAllocation
entryRuleAllocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAllocationRule()); }
	iv_ruleAllocation=ruleAllocation
	{ $current=$iv_ruleAllocation.current; }
	EOF;

// Rule Allocation
ruleAllocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='allocation'
		{
			newLeafNode(otherlv_0, grammarAccess.getAllocationAccess().getAllocationKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='needed'
		{
			newLeafNode(otherlv_2, grammarAccess.getAllocationAccess().getNeededKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAllocationAccess().getNeededEIntParserRuleCall_3_0());
				}
				lv_needed_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAllocationRule());
					}
					set(
						$current,
						"needed",
						lv_needed_3_0,
						"fr.n7.simplepdl.txt.PDL.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='ressource'
		{
			newLeafNode(otherlv_4, grammarAccess.getAllocationAccess().getRessourceKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAllocationRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getAllocationAccess().getRessourceRessourceCrossReference_5_0());
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule WorkSequenceType
ruleWorkSequenceType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='s2s'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='f2s'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='s2f'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='f2f'
			{
				$current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
