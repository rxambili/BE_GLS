package fr.n7.simplepdl.txt.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'f2s'", "'s2f'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "','", "'ws'", "'from'", "'to'", "'note'", "'text'", "'elements'", "'('", "')'", "'ressource'", "'allocation'", "'needed'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPDL.g"; }


    	private PDLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PDLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProcess"
    // InternalPDL.g:53:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalPDL.g:54:1: ( ruleProcess EOF )
            // InternalPDL.g:55:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPDL.g:62:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:66:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalPDL.g:67:2: ( ( rule__Process__Group__0 ) )
            // InternalPDL.g:68:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalPDL.g:69:3: ( rule__Process__Group__0 )
            // InternalPDL.g:69:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // InternalPDL.g:78:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // InternalPDL.g:79:1: ( ruleProcessElement EOF )
            // InternalPDL.g:80:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FOLLOW_1);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // InternalPDL.g:87:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:91:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            {
            // InternalPDL.g:92:2: ( ( rule__ProcessElement__Alternatives ) )
            // InternalPDL.g:93:3: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // InternalPDL.g:94:3: ( rule__ProcessElement__Alternatives )
            // InternalPDL.g:94:4: rule__ProcessElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // InternalPDL.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPDL.g:104:1: ( ruleEString EOF )
            // InternalPDL.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPDL.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPDL.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalPDL.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPDL.g:119:3: ( rule__EString__Alternatives )
            // InternalPDL.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalPDL.g:128:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // InternalPDL.g:129:1: ( ruleWorkDefinition EOF )
            // InternalPDL.g:130:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalPDL.g:137:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:141:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // InternalPDL.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // InternalPDL.g:142:2: ( ( rule__WorkDefinition__Group__0 ) )
            // InternalPDL.g:143:3: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // InternalPDL.g:144:3: ( rule__WorkDefinition__Group__0 )
            // InternalPDL.g:144:4: rule__WorkDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalPDL.g:153:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // InternalPDL.g:154:1: ( ruleWorkSequence EOF )
            // InternalPDL.g:155:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalPDL.g:162:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:166:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // InternalPDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            {
            // InternalPDL.g:167:2: ( ( rule__WorkSequence__Group__0 ) )
            // InternalPDL.g:168:3: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // InternalPDL.g:169:3: ( rule__WorkSequence__Group__0 )
            // InternalPDL.g:169:4: rule__WorkSequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // InternalPDL.g:178:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // InternalPDL.g:179:1: ( ruleGuidance EOF )
            // InternalPDL.g:180:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FOLLOW_1);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // InternalPDL.g:187:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:191:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // InternalPDL.g:192:2: ( ( rule__Guidance__Group__0 ) )
            {
            // InternalPDL.g:192:2: ( ( rule__Guidance__Group__0 ) )
            // InternalPDL.g:193:3: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // InternalPDL.g:194:3: ( rule__Guidance__Group__0 )
            // InternalPDL.g:194:4: rule__Guidance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessource"
    // InternalPDL.g:203:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalPDL.g:204:1: ( ruleRessource EOF )
            // InternalPDL.g:205:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalPDL.g:212:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:216:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalPDL.g:217:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalPDL.g:217:2: ( ( rule__Ressource__Group__0 ) )
            // InternalPDL.g:218:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalPDL.g:219:3: ( rule__Ressource__Group__0 )
            // InternalPDL.g:219:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRuleAllocation"
    // InternalPDL.g:228:1: entryRuleAllocation : ruleAllocation EOF ;
    public final void entryRuleAllocation() throws RecognitionException {
        try {
            // InternalPDL.g:229:1: ( ruleAllocation EOF )
            // InternalPDL.g:230:1: ruleAllocation EOF
            {
             before(grammarAccess.getAllocationRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocation();

            state._fsp--;

             after(grammarAccess.getAllocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllocation"


    // $ANTLR start "ruleAllocation"
    // InternalPDL.g:237:1: ruleAllocation : ( ( rule__Allocation__Group__0 ) ) ;
    public final void ruleAllocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:241:2: ( ( ( rule__Allocation__Group__0 ) ) )
            // InternalPDL.g:242:2: ( ( rule__Allocation__Group__0 ) )
            {
            // InternalPDL.g:242:2: ( ( rule__Allocation__Group__0 ) )
            // InternalPDL.g:243:3: ( rule__Allocation__Group__0 )
            {
             before(grammarAccess.getAllocationAccess().getGroup()); 
            // InternalPDL.g:244:3: ( rule__Allocation__Group__0 )
            // InternalPDL.g:244:4: rule__Allocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocation"


    // $ANTLR start "entryRuleEInt"
    // InternalPDL.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPDL.g:254:1: ( ruleEInt EOF )
            // InternalPDL.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPDL.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPDL.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPDL.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalPDL.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPDL.g:269:3: ( rule__EInt__Group__0 )
            // InternalPDL.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalPDL.g:278:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:282:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // InternalPDL.g:283:2: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // InternalPDL.g:283:2: ( ( rule__WorkSequenceType__Alternatives ) )
            // InternalPDL.g:284:3: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // InternalPDL.g:285:3: ( rule__WorkSequenceType__Alternatives )
            // InternalPDL.g:285:4: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // InternalPDL.g:293:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:297:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessource ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalPDL.g:298:2: ( ruleWorkDefinition )
                    {
                    // InternalPDL.g:298:2: ( ruleWorkDefinition )
                    // InternalPDL.g:299:3: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:304:2: ( ruleWorkSequence )
                    {
                    // InternalPDL.g:304:2: ( ruleWorkSequence )
                    // InternalPDL.g:305:3: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:310:2: ( ruleGuidance )
                    {
                    // InternalPDL.g:310:2: ( ruleGuidance )
                    // InternalPDL.g:311:3: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:316:2: ( ruleRessource )
                    {
                    // InternalPDL.g:316:2: ( ruleRessource )
                    // InternalPDL.g:317:3: ruleRessource
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRessource();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPDL.g:326:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:330:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPDL.g:331:2: ( RULE_STRING )
                    {
                    // InternalPDL.g:331:2: ( RULE_STRING )
                    // InternalPDL.g:332:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:337:2: ( RULE_ID )
                    {
                    // InternalPDL.g:337:2: ( RULE_ID )
                    // InternalPDL.g:338:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // InternalPDL.g:347:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:351:1: ( ( ( 's2s' ) ) | ( ( 'f2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2f' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalPDL.g:352:2: ( ( 's2s' ) )
                    {
                    // InternalPDL.g:352:2: ( ( 's2s' ) )
                    // InternalPDL.g:353:3: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // InternalPDL.g:354:3: ( 's2s' )
                    // InternalPDL.g:354:4: 's2s'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPDL.g:358:2: ( ( 'f2s' ) )
                    {
                    // InternalPDL.g:358:2: ( ( 'f2s' ) )
                    // InternalPDL.g:359:3: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 
                    // InternalPDL.g:360:3: ( 'f2s' )
                    // InternalPDL.g:360:4: 'f2s'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPDL.g:364:2: ( ( 's2f' ) )
                    {
                    // InternalPDL.g:364:2: ( ( 's2f' ) )
                    // InternalPDL.g:365:3: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 
                    // InternalPDL.g:366:3: ( 's2f' )
                    // InternalPDL.g:366:4: 's2f'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPDL.g:370:2: ( ( 'f2f' ) )
                    {
                    // InternalPDL.g:370:2: ( ( 'f2f' ) )
                    // InternalPDL.g:371:3: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // InternalPDL.g:372:3: ( 'f2f' )
                    // InternalPDL.g:372:4: 'f2f'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // InternalPDL.g:380:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:384:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalPDL.g:385:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalPDL.g:392:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:396:1: ( ( () ) )
            // InternalPDL.g:397:1: ( () )
            {
            // InternalPDL.g:397:1: ( () )
            // InternalPDL.g:398:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // InternalPDL.g:399:2: ()
            // InternalPDL.g:399:3: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalPDL.g:407:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:411:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalPDL.g:412:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalPDL.g:419:1: rule__Process__Group__1__Impl : ( 'process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:423:1: ( ( 'process' ) )
            // InternalPDL.g:424:1: ( 'process' )
            {
            // InternalPDL.g:424:1: ( 'process' )
            // InternalPDL.g:425:2: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalPDL.g:434:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:438:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalPDL.g:439:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalPDL.g:446:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:450:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // InternalPDL.g:451:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // InternalPDL.g:451:1: ( ( rule__Process__NameAssignment_2 ) )
            // InternalPDL.g:452:2: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // InternalPDL.g:453:2: ( rule__Process__NameAssignment_2 )
            // InternalPDL.g:453:3: rule__Process__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalPDL.g:461:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:465:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalPDL.g:466:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalPDL.g:473:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:477:1: ( ( '{' ) )
            // InternalPDL.g:478:1: ( '{' )
            {
            // InternalPDL.g:478:1: ( '{' )
            // InternalPDL.g:479:2: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalPDL.g:488:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:492:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalPDL.g:493:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalPDL.g:500:1: rule__Process__Group__4__Impl : ( ( rule__Process__ProcessElementAssignment_4 )* ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:504:1: ( ( ( rule__Process__ProcessElementAssignment_4 )* ) )
            // InternalPDL.g:505:1: ( ( rule__Process__ProcessElementAssignment_4 )* )
            {
            // InternalPDL.g:505:1: ( ( rule__Process__ProcessElementAssignment_4 )* )
            // InternalPDL.g:506:2: ( rule__Process__ProcessElementAssignment_4 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementAssignment_4()); 
            // InternalPDL.g:507:2: ( rule__Process__ProcessElementAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==20||LA4_0==23||LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPDL.g:507:3: rule__Process__ProcessElementAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Process__ProcessElementAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalPDL.g:515:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:519:1: ( rule__Process__Group__5__Impl )
            // InternalPDL.g:520:2: rule__Process__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalPDL.g:526:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:530:1: ( ( '}' ) )
            // InternalPDL.g:531:1: ( '}' )
            {
            // InternalPDL.g:531:1: ( '}' )
            // InternalPDL.g:532:2: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // InternalPDL.g:542:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:546:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // InternalPDL.g:547:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // InternalPDL.g:554:1: rule__WorkDefinition__Group__0__Impl : ( () ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:558:1: ( ( () ) )
            // InternalPDL.g:559:1: ( () )
            {
            // InternalPDL.g:559:1: ( () )
            // InternalPDL.g:560:2: ()
            {
             before(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 
            // InternalPDL.g:561:2: ()
            // InternalPDL.g:561:3: 
            {
            }

             after(grammarAccess.getWorkDefinitionAccess().getWorkDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // InternalPDL.g:569:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:573:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // InternalPDL.g:574:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // InternalPDL.g:581:1: rule__WorkDefinition__Group__1__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:585:1: ( ( 'wd' ) )
            // InternalPDL.g:586:1: ( 'wd' )
            {
            // InternalPDL.g:586:1: ( 'wd' )
            // InternalPDL.g:587:2: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // InternalPDL.g:596:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:600:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // InternalPDL.g:601:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // InternalPDL.g:608:1: rule__WorkDefinition__Group__2__Impl : ( ( rule__WorkDefinition__NameAssignment_2 ) ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:612:1: ( ( ( rule__WorkDefinition__NameAssignment_2 ) ) )
            // InternalPDL.g:613:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            {
            // InternalPDL.g:613:1: ( ( rule__WorkDefinition__NameAssignment_2 ) )
            // InternalPDL.g:614:2: ( rule__WorkDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 
            // InternalPDL.g:615:2: ( rule__WorkDefinition__NameAssignment_2 )
            // InternalPDL.g:615:3: rule__WorkDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // InternalPDL.g:623:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:627:1: ( rule__WorkDefinition__Group__3__Impl )
            // InternalPDL.g:628:2: rule__WorkDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // InternalPDL.g:634:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__Group_3__0 )? ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:638:1: ( ( ( rule__WorkDefinition__Group_3__0 )? ) )
            // InternalPDL.g:639:1: ( ( rule__WorkDefinition__Group_3__0 )? )
            {
            // InternalPDL.g:639:1: ( ( rule__WorkDefinition__Group_3__0 )? )
            // InternalPDL.g:640:2: ( rule__WorkDefinition__Group_3__0 )?
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_3()); 
            // InternalPDL.g:641:2: ( rule__WorkDefinition__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPDL.g:641:3: rule__WorkDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WorkDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__0"
    // InternalPDL.g:650:1: rule__WorkDefinition__Group_3__0 : rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1 ;
    public final void rule__WorkDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:654:1: ( rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1 )
            // InternalPDL.g:655:2: rule__WorkDefinition__Group_3__0__Impl rule__WorkDefinition__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__0"


    // $ANTLR start "rule__WorkDefinition__Group_3__0__Impl"
    // InternalPDL.g:662:1: rule__WorkDefinition__Group_3__0__Impl : ( '{' ) ;
    public final void rule__WorkDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:666:1: ( ( '{' ) )
            // InternalPDL.g:667:1: ( '{' )
            {
            // InternalPDL.g:667:1: ( '{' )
            // InternalPDL.g:668:2: '{'
            {
             before(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__1"
    // InternalPDL.g:677:1: rule__WorkDefinition__Group_3__1 : rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2 ;
    public final void rule__WorkDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:681:1: ( rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2 )
            // InternalPDL.g:682:2: rule__WorkDefinition__Group_3__1__Impl rule__WorkDefinition__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__WorkDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__1"


    // $ANTLR start "rule__WorkDefinition__Group_3__1__Impl"
    // InternalPDL.g:689:1: rule__WorkDefinition__Group_3__1__Impl : ( ( rule__WorkDefinition__AllocationAssignment_3_1 ) ) ;
    public final void rule__WorkDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:693:1: ( ( ( rule__WorkDefinition__AllocationAssignment_3_1 ) ) )
            // InternalPDL.g:694:1: ( ( rule__WorkDefinition__AllocationAssignment_3_1 ) )
            {
            // InternalPDL.g:694:1: ( ( rule__WorkDefinition__AllocationAssignment_3_1 ) )
            // InternalPDL.g:695:2: ( rule__WorkDefinition__AllocationAssignment_3_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getAllocationAssignment_3_1()); 
            // InternalPDL.g:696:2: ( rule__WorkDefinition__AllocationAssignment_3_1 )
            // InternalPDL.g:696:3: rule__WorkDefinition__AllocationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__AllocationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getAllocationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__2"
    // InternalPDL.g:704:1: rule__WorkDefinition__Group_3__2 : rule__WorkDefinition__Group_3__2__Impl rule__WorkDefinition__Group_3__3 ;
    public final void rule__WorkDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:708:1: ( rule__WorkDefinition__Group_3__2__Impl rule__WorkDefinition__Group_3__3 )
            // InternalPDL.g:709:2: rule__WorkDefinition__Group_3__2__Impl rule__WorkDefinition__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__WorkDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__2"


    // $ANTLR start "rule__WorkDefinition__Group_3__2__Impl"
    // InternalPDL.g:716:1: rule__WorkDefinition__Group_3__2__Impl : ( ( rule__WorkDefinition__Group_3_2__0 )* ) ;
    public final void rule__WorkDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:720:1: ( ( ( rule__WorkDefinition__Group_3_2__0 )* ) )
            // InternalPDL.g:721:1: ( ( rule__WorkDefinition__Group_3_2__0 )* )
            {
            // InternalPDL.g:721:1: ( ( rule__WorkDefinition__Group_3_2__0 )* )
            // InternalPDL.g:722:2: ( rule__WorkDefinition__Group_3_2__0 )*
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup_3_2()); 
            // InternalPDL.g:723:2: ( rule__WorkDefinition__Group_3_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPDL.g:723:3: rule__WorkDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__WorkDefinition__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getWorkDefinitionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3__3"
    // InternalPDL.g:731:1: rule__WorkDefinition__Group_3__3 : rule__WorkDefinition__Group_3__3__Impl ;
    public final void rule__WorkDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:735:1: ( rule__WorkDefinition__Group_3__3__Impl )
            // InternalPDL.g:736:2: rule__WorkDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__3"


    // $ANTLR start "rule__WorkDefinition__Group_3__3__Impl"
    // InternalPDL.g:742:1: rule__WorkDefinition__Group_3__3__Impl : ( '}' ) ;
    public final void rule__WorkDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:746:1: ( ( '}' ) )
            // InternalPDL.g:747:1: ( '}' )
            {
            // InternalPDL.g:747:1: ( '}' )
            // InternalPDL.g:748:2: '}'
            {
             before(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3_2__0"
    // InternalPDL.g:758:1: rule__WorkDefinition__Group_3_2__0 : rule__WorkDefinition__Group_3_2__0__Impl rule__WorkDefinition__Group_3_2__1 ;
    public final void rule__WorkDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:762:1: ( rule__WorkDefinition__Group_3_2__0__Impl rule__WorkDefinition__Group_3_2__1 )
            // InternalPDL.g:763:2: rule__WorkDefinition__Group_3_2__0__Impl rule__WorkDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
            rule__WorkDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3_2__0"


    // $ANTLR start "rule__WorkDefinition__Group_3_2__0__Impl"
    // InternalPDL.g:770:1: rule__WorkDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__WorkDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:774:1: ( ( ',' ) )
            // InternalPDL.g:775:1: ( ',' )
            {
            // InternalPDL.g:775:1: ( ',' )
            // InternalPDL.g:776:2: ','
            {
             before(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_3_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWorkDefinitionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group_3_2__1"
    // InternalPDL.g:785:1: rule__WorkDefinition__Group_3_2__1 : rule__WorkDefinition__Group_3_2__1__Impl ;
    public final void rule__WorkDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:789:1: ( rule__WorkDefinition__Group_3_2__1__Impl )
            // InternalPDL.g:790:2: rule__WorkDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3_2__1"


    // $ANTLR start "rule__WorkDefinition__Group_3_2__1__Impl"
    // InternalPDL.g:796:1: rule__WorkDefinition__Group_3_2__1__Impl : ( ( rule__WorkDefinition__AllocationAssignment_3_2_1 ) ) ;
    public final void rule__WorkDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:800:1: ( ( ( rule__WorkDefinition__AllocationAssignment_3_2_1 ) ) )
            // InternalPDL.g:801:1: ( ( rule__WorkDefinition__AllocationAssignment_3_2_1 ) )
            {
            // InternalPDL.g:801:1: ( ( rule__WorkDefinition__AllocationAssignment_3_2_1 ) )
            // InternalPDL.g:802:2: ( rule__WorkDefinition__AllocationAssignment_3_2_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getAllocationAssignment_3_2_1()); 
            // InternalPDL.g:803:2: ( rule__WorkDefinition__AllocationAssignment_3_2_1 )
            // InternalPDL.g:803:3: rule__WorkDefinition__AllocationAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkDefinition__AllocationAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getAllocationAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // InternalPDL.g:812:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:816:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // InternalPDL.g:817:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // InternalPDL.g:824:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:828:1: ( ( 'ws' ) )
            // InternalPDL.g:829:1: ( 'ws' )
            {
            // InternalPDL.g:829:1: ( 'ws' )
            // InternalPDL.g:830:2: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // InternalPDL.g:839:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:843:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // InternalPDL.g:844:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // InternalPDL.g:851:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:855:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // InternalPDL.g:856:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // InternalPDL.g:856:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // InternalPDL.g:857:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // InternalPDL.g:858:2: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // InternalPDL.g:858:3: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // InternalPDL.g:866:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:870:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // InternalPDL.g:871:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // InternalPDL.g:878:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:882:1: ( ( 'from' ) )
            // InternalPDL.g:883:1: ( 'from' )
            {
            // InternalPDL.g:883:1: ( 'from' )
            // InternalPDL.g:884:2: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // InternalPDL.g:893:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:897:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // InternalPDL.g:898:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // InternalPDL.g:905:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:909:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // InternalPDL.g:910:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // InternalPDL.g:910:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // InternalPDL.g:911:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // InternalPDL.g:912:2: ( rule__WorkSequence__PredecessorAssignment_3 )
            // InternalPDL.g:912:3: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // InternalPDL.g:920:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:924:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // InternalPDL.g:925:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // InternalPDL.g:932:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:936:1: ( ( 'to' ) )
            // InternalPDL.g:937:1: ( 'to' )
            {
            // InternalPDL.g:937:1: ( 'to' )
            // InternalPDL.g:938:2: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // InternalPDL.g:947:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:951:1: ( rule__WorkSequence__Group__5__Impl )
            // InternalPDL.g:952:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // InternalPDL.g:958:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:962:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // InternalPDL.g:963:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // InternalPDL.g:963:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // InternalPDL.g:964:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // InternalPDL.g:965:2: ( rule__WorkSequence__SuccessorAssignment_5 )
            // InternalPDL.g:965:3: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // InternalPDL.g:974:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:978:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // InternalPDL.g:979:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // InternalPDL.g:986:1: rule__Guidance__Group__0__Impl : ( () ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:990:1: ( ( () ) )
            // InternalPDL.g:991:1: ( () )
            {
            // InternalPDL.g:991:1: ( () )
            // InternalPDL.g:992:2: ()
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 
            // InternalPDL.g:993:2: ()
            // InternalPDL.g:993:3: 
            {
            }

             after(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // InternalPDL.g:1001:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1005:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // InternalPDL.g:1006:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // InternalPDL.g:1013:1: rule__Guidance__Group__1__Impl : ( 'note' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1017:1: ( ( 'note' ) )
            // InternalPDL.g:1018:1: ( 'note' )
            {
            // InternalPDL.g:1018:1: ( 'note' )
            // InternalPDL.g:1019:2: 'note'
            {
             before(grammarAccess.getGuidanceAccess().getNoteKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getNoteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__Guidance__Group__2"
    // InternalPDL.g:1028:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl rule__Guidance__Group__3 ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1032:1: ( rule__Guidance__Group__2__Impl rule__Guidance__Group__3 )
            // InternalPDL.g:1033:2: rule__Guidance__Group__2__Impl rule__Guidance__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Guidance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // InternalPDL.g:1040:1: rule__Guidance__Group__2__Impl : ( '{' ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1044:1: ( ( '{' ) )
            // InternalPDL.g:1045:1: ( '{' )
            {
            // InternalPDL.g:1045:1: ( '{' )
            // InternalPDL.g:1046:2: '{'
            {
             before(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__Guidance__Group__3"
    // InternalPDL.g:1055:1: rule__Guidance__Group__3 : rule__Guidance__Group__3__Impl rule__Guidance__Group__4 ;
    public final void rule__Guidance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1059:1: ( rule__Guidance__Group__3__Impl rule__Guidance__Group__4 )
            // InternalPDL.g:1060:2: rule__Guidance__Group__3__Impl rule__Guidance__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Guidance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3"


    // $ANTLR start "rule__Guidance__Group__3__Impl"
    // InternalPDL.g:1067:1: rule__Guidance__Group__3__Impl : ( ( rule__Guidance__Group_3__0 )? ) ;
    public final void rule__Guidance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1071:1: ( ( ( rule__Guidance__Group_3__0 )? ) )
            // InternalPDL.g:1072:1: ( ( rule__Guidance__Group_3__0 )? )
            {
            // InternalPDL.g:1072:1: ( ( rule__Guidance__Group_3__0 )? )
            // InternalPDL.g:1073:2: ( rule__Guidance__Group_3__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_3()); 
            // InternalPDL.g:1074:2: ( rule__Guidance__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPDL.g:1074:3: rule__Guidance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__3__Impl"


    // $ANTLR start "rule__Guidance__Group__4"
    // InternalPDL.g:1082:1: rule__Guidance__Group__4 : rule__Guidance__Group__4__Impl rule__Guidance__Group__5 ;
    public final void rule__Guidance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1086:1: ( rule__Guidance__Group__4__Impl rule__Guidance__Group__5 )
            // InternalPDL.g:1087:2: rule__Guidance__Group__4__Impl rule__Guidance__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Guidance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4"


    // $ANTLR start "rule__Guidance__Group__4__Impl"
    // InternalPDL.g:1094:1: rule__Guidance__Group__4__Impl : ( ( rule__Guidance__Group_4__0 )? ) ;
    public final void rule__Guidance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1098:1: ( ( ( rule__Guidance__Group_4__0 )? ) )
            // InternalPDL.g:1099:1: ( ( rule__Guidance__Group_4__0 )? )
            {
            // InternalPDL.g:1099:1: ( ( rule__Guidance__Group_4__0 )? )
            // InternalPDL.g:1100:2: ( rule__Guidance__Group_4__0 )?
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4()); 
            // InternalPDL.g:1101:2: ( rule__Guidance__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPDL.g:1101:3: rule__Guidance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guidance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuidanceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__4__Impl"


    // $ANTLR start "rule__Guidance__Group__5"
    // InternalPDL.g:1109:1: rule__Guidance__Group__5 : rule__Guidance__Group__5__Impl ;
    public final void rule__Guidance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1113:1: ( rule__Guidance__Group__5__Impl )
            // InternalPDL.g:1114:2: rule__Guidance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5"


    // $ANTLR start "rule__Guidance__Group__5__Impl"
    // InternalPDL.g:1120:1: rule__Guidance__Group__5__Impl : ( '}' ) ;
    public final void rule__Guidance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1124:1: ( ( '}' ) )
            // InternalPDL.g:1125:1: ( '}' )
            {
            // InternalPDL.g:1125:1: ( '}' )
            // InternalPDL.g:1126:2: '}'
            {
             before(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group_3__0"
    // InternalPDL.g:1136:1: rule__Guidance__Group_3__0 : rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1 ;
    public final void rule__Guidance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1140:1: ( rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1 )
            // InternalPDL.g:1141:2: rule__Guidance__Group_3__0__Impl rule__Guidance__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Guidance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__0"


    // $ANTLR start "rule__Guidance__Group_3__0__Impl"
    // InternalPDL.g:1148:1: rule__Guidance__Group_3__0__Impl : ( 'text' ) ;
    public final void rule__Guidance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1152:1: ( ( 'text' ) )
            // InternalPDL.g:1153:1: ( 'text' )
            {
            // InternalPDL.g:1153:1: ( 'text' )
            // InternalPDL.g:1154:2: 'text'
            {
             before(grammarAccess.getGuidanceAccess().getTextKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getTextKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__0__Impl"


    // $ANTLR start "rule__Guidance__Group_3__1"
    // InternalPDL.g:1163:1: rule__Guidance__Group_3__1 : rule__Guidance__Group_3__1__Impl ;
    public final void rule__Guidance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1167:1: ( rule__Guidance__Group_3__1__Impl )
            // InternalPDL.g:1168:2: rule__Guidance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__1"


    // $ANTLR start "rule__Guidance__Group_3__1__Impl"
    // InternalPDL.g:1174:1: rule__Guidance__Group_3__1__Impl : ( ( rule__Guidance__TextAssignment_3_1 ) ) ;
    public final void rule__Guidance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1178:1: ( ( ( rule__Guidance__TextAssignment_3_1 ) ) )
            // InternalPDL.g:1179:1: ( ( rule__Guidance__TextAssignment_3_1 ) )
            {
            // InternalPDL.g:1179:1: ( ( rule__Guidance__TextAssignment_3_1 ) )
            // InternalPDL.g:1180:2: ( rule__Guidance__TextAssignment_3_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_3_1()); 
            // InternalPDL.g:1181:2: ( rule__Guidance__TextAssignment_3_1 )
            // InternalPDL.g:1181:3: rule__Guidance__TextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_3__1__Impl"


    // $ANTLR start "rule__Guidance__Group_4__0"
    // InternalPDL.g:1190:1: rule__Guidance__Group_4__0 : rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 ;
    public final void rule__Guidance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1194:1: ( rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1 )
            // InternalPDL.g:1195:2: rule__Guidance__Group_4__0__Impl rule__Guidance__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Guidance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__0"


    // $ANTLR start "rule__Guidance__Group_4__0__Impl"
    // InternalPDL.g:1202:1: rule__Guidance__Group_4__0__Impl : ( 'elements' ) ;
    public final void rule__Guidance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1206:1: ( ( 'elements' ) )
            // InternalPDL.g:1207:1: ( 'elements' )
            {
            // InternalPDL.g:1207:1: ( 'elements' )
            // InternalPDL.g:1208:2: 'elements'
            {
             before(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4__1"
    // InternalPDL.g:1217:1: rule__Guidance__Group_4__1 : rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 ;
    public final void rule__Guidance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1221:1: ( rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2 )
            // InternalPDL.g:1222:2: rule__Guidance__Group_4__1__Impl rule__Guidance__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__Guidance__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__1"


    // $ANTLR start "rule__Guidance__Group_4__1__Impl"
    // InternalPDL.g:1229:1: rule__Guidance__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Guidance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1233:1: ( ( '(' ) )
            // InternalPDL.g:1234:1: ( '(' )
            {
            // InternalPDL.g:1234:1: ( '(' )
            // InternalPDL.g:1235:2: '('
            {
             before(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__1__Impl"


    // $ANTLR start "rule__Guidance__Group_4__2"
    // InternalPDL.g:1244:1: rule__Guidance__Group_4__2 : rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 ;
    public final void rule__Guidance__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1248:1: ( rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3 )
            // InternalPDL.g:1249:2: rule__Guidance__Group_4__2__Impl rule__Guidance__Group_4__3
            {
            pushFollow(FOLLOW_19);
            rule__Guidance__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__2"


    // $ANTLR start "rule__Guidance__Group_4__2__Impl"
    // InternalPDL.g:1256:1: rule__Guidance__Group_4__2__Impl : ( ( rule__Guidance__ElementsAssignment_4_2 ) ) ;
    public final void rule__Guidance__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1260:1: ( ( ( rule__Guidance__ElementsAssignment_4_2 ) ) )
            // InternalPDL.g:1261:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            {
            // InternalPDL.g:1261:1: ( ( rule__Guidance__ElementsAssignment_4_2 ) )
            // InternalPDL.g:1262:2: ( rule__Guidance__ElementsAssignment_4_2 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 
            // InternalPDL.g:1263:2: ( rule__Guidance__ElementsAssignment_4_2 )
            // InternalPDL.g:1263:3: rule__Guidance__ElementsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__2__Impl"


    // $ANTLR start "rule__Guidance__Group_4__3"
    // InternalPDL.g:1271:1: rule__Guidance__Group_4__3 : rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 ;
    public final void rule__Guidance__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1275:1: ( rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4 )
            // InternalPDL.g:1276:2: rule__Guidance__Group_4__3__Impl rule__Guidance__Group_4__4
            {
            pushFollow(FOLLOW_19);
            rule__Guidance__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__3"


    // $ANTLR start "rule__Guidance__Group_4__3__Impl"
    // InternalPDL.g:1283:1: rule__Guidance__Group_4__3__Impl : ( ( rule__Guidance__Group_4_3__0 )* ) ;
    public final void rule__Guidance__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1287:1: ( ( ( rule__Guidance__Group_4_3__0 )* ) )
            // InternalPDL.g:1288:1: ( ( rule__Guidance__Group_4_3__0 )* )
            {
            // InternalPDL.g:1288:1: ( ( rule__Guidance__Group_4_3__0 )* )
            // InternalPDL.g:1289:2: ( rule__Guidance__Group_4_3__0 )*
            {
             before(grammarAccess.getGuidanceAccess().getGroup_4_3()); 
            // InternalPDL.g:1290:2: ( rule__Guidance__Group_4_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPDL.g:1290:3: rule__Guidance__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Guidance__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGuidanceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__3__Impl"


    // $ANTLR start "rule__Guidance__Group_4__4"
    // InternalPDL.g:1298:1: rule__Guidance__Group_4__4 : rule__Guidance__Group_4__4__Impl ;
    public final void rule__Guidance__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1302:1: ( rule__Guidance__Group_4__4__Impl )
            // InternalPDL.g:1303:2: rule__Guidance__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__4"


    // $ANTLR start "rule__Guidance__Group_4__4__Impl"
    // InternalPDL.g:1309:1: rule__Guidance__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Guidance__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1313:1: ( ( ')' ) )
            // InternalPDL.g:1314:1: ( ')' )
            {
            // InternalPDL.g:1314:1: ( ')' )
            // InternalPDL.g:1315:2: ')'
            {
             before(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4__4__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__0"
    // InternalPDL.g:1325:1: rule__Guidance__Group_4_3__0 : rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 ;
    public final void rule__Guidance__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1329:1: ( rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1 )
            // InternalPDL.g:1330:2: rule__Guidance__Group_4_3__0__Impl rule__Guidance__Group_4_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Guidance__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__0"


    // $ANTLR start "rule__Guidance__Group_4_3__0__Impl"
    // InternalPDL.g:1337:1: rule__Guidance__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Guidance__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1341:1: ( ( ',' ) )
            // InternalPDL.g:1342:1: ( ',' )
            {
            // InternalPDL.g:1342:1: ( ',' )
            // InternalPDL.g:1343:2: ','
            {
             before(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__0__Impl"


    // $ANTLR start "rule__Guidance__Group_4_3__1"
    // InternalPDL.g:1352:1: rule__Guidance__Group_4_3__1 : rule__Guidance__Group_4_3__1__Impl ;
    public final void rule__Guidance__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1356:1: ( rule__Guidance__Group_4_3__1__Impl )
            // InternalPDL.g:1357:2: rule__Guidance__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__1"


    // $ANTLR start "rule__Guidance__Group_4_3__1__Impl"
    // InternalPDL.g:1363:1: rule__Guidance__Group_4_3__1__Impl : ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) ;
    public final void rule__Guidance__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1367:1: ( ( ( rule__Guidance__ElementsAssignment_4_3_1 ) ) )
            // InternalPDL.g:1368:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            {
            // InternalPDL.g:1368:1: ( ( rule__Guidance__ElementsAssignment_4_3_1 ) )
            // InternalPDL.g:1369:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            {
             before(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 
            // InternalPDL.g:1370:2: ( rule__Guidance__ElementsAssignment_4_3_1 )
            // InternalPDL.g:1370:3: rule__Guidance__ElementsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Guidance__ElementsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getElementsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group_4_3__1__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalPDL.g:1379:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1383:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalPDL.g:1384:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalPDL.g:1391:1: rule__Ressource__Group__0__Impl : ( 'ressource' ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1395:1: ( ( 'ressource' ) )
            // InternalPDL.g:1396:1: ( 'ressource' )
            {
            // InternalPDL.g:1396:1: ( 'ressource' )
            // InternalPDL.g:1397:2: 'ressource'
            {
             before(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getRessourceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalPDL.g:1406:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1410:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalPDL.g:1411:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalPDL.g:1418:1: rule__Ressource__Group__1__Impl : ( ( rule__Ressource__NameAssignment_1 ) ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1422:1: ( ( ( rule__Ressource__NameAssignment_1 ) ) )
            // InternalPDL.g:1423:1: ( ( rule__Ressource__NameAssignment_1 ) )
            {
            // InternalPDL.g:1423:1: ( ( rule__Ressource__NameAssignment_1 ) )
            // InternalPDL.g:1424:2: ( rule__Ressource__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceAccess().getNameAssignment_1()); 
            // InternalPDL.g:1425:2: ( rule__Ressource__NameAssignment_1 )
            // InternalPDL.g:1425:3: rule__Ressource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalPDL.g:1433:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1437:1: ( rule__Ressource__Group__2__Impl )
            // InternalPDL.g:1438:2: rule__Ressource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalPDL.g:1444:1: rule__Ressource__Group__2__Impl : ( ( rule__Ressource__CountAssignment_2 ) ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1448:1: ( ( ( rule__Ressource__CountAssignment_2 ) ) )
            // InternalPDL.g:1449:1: ( ( rule__Ressource__CountAssignment_2 ) )
            {
            // InternalPDL.g:1449:1: ( ( rule__Ressource__CountAssignment_2 ) )
            // InternalPDL.g:1450:2: ( rule__Ressource__CountAssignment_2 )
            {
             before(grammarAccess.getRessourceAccess().getCountAssignment_2()); 
            // InternalPDL.g:1451:2: ( rule__Ressource__CountAssignment_2 )
            // InternalPDL.g:1451:3: rule__Ressource__CountAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__CountAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getCountAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__Allocation__Group__0"
    // InternalPDL.g:1460:1: rule__Allocation__Group__0 : rule__Allocation__Group__0__Impl rule__Allocation__Group__1 ;
    public final void rule__Allocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1464:1: ( rule__Allocation__Group__0__Impl rule__Allocation__Group__1 )
            // InternalPDL.g:1465:2: rule__Allocation__Group__0__Impl rule__Allocation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Allocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__0"


    // $ANTLR start "rule__Allocation__Group__0__Impl"
    // InternalPDL.g:1472:1: rule__Allocation__Group__0__Impl : ( 'allocation' ) ;
    public final void rule__Allocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1476:1: ( ( 'allocation' ) )
            // InternalPDL.g:1477:1: ( 'allocation' )
            {
            // InternalPDL.g:1477:1: ( 'allocation' )
            // InternalPDL.g:1478:2: 'allocation'
            {
             before(grammarAccess.getAllocationAccess().getAllocationKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getAllocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__0__Impl"


    // $ANTLR start "rule__Allocation__Group__1"
    // InternalPDL.g:1487:1: rule__Allocation__Group__1 : rule__Allocation__Group__1__Impl rule__Allocation__Group__2 ;
    public final void rule__Allocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1491:1: ( rule__Allocation__Group__1__Impl rule__Allocation__Group__2 )
            // InternalPDL.g:1492:2: rule__Allocation__Group__1__Impl rule__Allocation__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Allocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__1"


    // $ANTLR start "rule__Allocation__Group__1__Impl"
    // InternalPDL.g:1499:1: rule__Allocation__Group__1__Impl : ( '{' ) ;
    public final void rule__Allocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1503:1: ( ( '{' ) )
            // InternalPDL.g:1504:1: ( '{' )
            {
            // InternalPDL.g:1504:1: ( '{' )
            // InternalPDL.g:1505:2: '{'
            {
             before(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__1__Impl"


    // $ANTLR start "rule__Allocation__Group__2"
    // InternalPDL.g:1514:1: rule__Allocation__Group__2 : rule__Allocation__Group__2__Impl rule__Allocation__Group__3 ;
    public final void rule__Allocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1518:1: ( rule__Allocation__Group__2__Impl rule__Allocation__Group__3 )
            // InternalPDL.g:1519:2: rule__Allocation__Group__2__Impl rule__Allocation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Allocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__2"


    // $ANTLR start "rule__Allocation__Group__2__Impl"
    // InternalPDL.g:1526:1: rule__Allocation__Group__2__Impl : ( 'needed' ) ;
    public final void rule__Allocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1530:1: ( ( 'needed' ) )
            // InternalPDL.g:1531:1: ( 'needed' )
            {
            // InternalPDL.g:1531:1: ( 'needed' )
            // InternalPDL.g:1532:2: 'needed'
            {
             before(grammarAccess.getAllocationAccess().getNeededKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getNeededKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__2__Impl"


    // $ANTLR start "rule__Allocation__Group__3"
    // InternalPDL.g:1541:1: rule__Allocation__Group__3 : rule__Allocation__Group__3__Impl rule__Allocation__Group__4 ;
    public final void rule__Allocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1545:1: ( rule__Allocation__Group__3__Impl rule__Allocation__Group__4 )
            // InternalPDL.g:1546:2: rule__Allocation__Group__3__Impl rule__Allocation__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Allocation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__3"


    // $ANTLR start "rule__Allocation__Group__3__Impl"
    // InternalPDL.g:1553:1: rule__Allocation__Group__3__Impl : ( ( rule__Allocation__NeededAssignment_3 ) ) ;
    public final void rule__Allocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1557:1: ( ( ( rule__Allocation__NeededAssignment_3 ) ) )
            // InternalPDL.g:1558:1: ( ( rule__Allocation__NeededAssignment_3 ) )
            {
            // InternalPDL.g:1558:1: ( ( rule__Allocation__NeededAssignment_3 ) )
            // InternalPDL.g:1559:2: ( rule__Allocation__NeededAssignment_3 )
            {
             before(grammarAccess.getAllocationAccess().getNeededAssignment_3()); 
            // InternalPDL.g:1560:2: ( rule__Allocation__NeededAssignment_3 )
            // InternalPDL.g:1560:3: rule__Allocation__NeededAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__NeededAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getNeededAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__3__Impl"


    // $ANTLR start "rule__Allocation__Group__4"
    // InternalPDL.g:1568:1: rule__Allocation__Group__4 : rule__Allocation__Group__4__Impl rule__Allocation__Group__5 ;
    public final void rule__Allocation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1572:1: ( rule__Allocation__Group__4__Impl rule__Allocation__Group__5 )
            // InternalPDL.g:1573:2: rule__Allocation__Group__4__Impl rule__Allocation__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Allocation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__4"


    // $ANTLR start "rule__Allocation__Group__4__Impl"
    // InternalPDL.g:1580:1: rule__Allocation__Group__4__Impl : ( 'ressource' ) ;
    public final void rule__Allocation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1584:1: ( ( 'ressource' ) )
            // InternalPDL.g:1585:1: ( 'ressource' )
            {
            // InternalPDL.g:1585:1: ( 'ressource' )
            // InternalPDL.g:1586:2: 'ressource'
            {
             before(grammarAccess.getAllocationAccess().getRessourceKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getRessourceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__4__Impl"


    // $ANTLR start "rule__Allocation__Group__5"
    // InternalPDL.g:1595:1: rule__Allocation__Group__5 : rule__Allocation__Group__5__Impl rule__Allocation__Group__6 ;
    public final void rule__Allocation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1599:1: ( rule__Allocation__Group__5__Impl rule__Allocation__Group__6 )
            // InternalPDL.g:1600:2: rule__Allocation__Group__5__Impl rule__Allocation__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Allocation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Allocation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__5"


    // $ANTLR start "rule__Allocation__Group__5__Impl"
    // InternalPDL.g:1607:1: rule__Allocation__Group__5__Impl : ( ( rule__Allocation__RessourceAssignment_5 ) ) ;
    public final void rule__Allocation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1611:1: ( ( ( rule__Allocation__RessourceAssignment_5 ) ) )
            // InternalPDL.g:1612:1: ( ( rule__Allocation__RessourceAssignment_5 ) )
            {
            // InternalPDL.g:1612:1: ( ( rule__Allocation__RessourceAssignment_5 ) )
            // InternalPDL.g:1613:2: ( rule__Allocation__RessourceAssignment_5 )
            {
             before(grammarAccess.getAllocationAccess().getRessourceAssignment_5()); 
            // InternalPDL.g:1614:2: ( rule__Allocation__RessourceAssignment_5 )
            // InternalPDL.g:1614:3: rule__Allocation__RessourceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__RessourceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAllocationAccess().getRessourceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__5__Impl"


    // $ANTLR start "rule__Allocation__Group__6"
    // InternalPDL.g:1622:1: rule__Allocation__Group__6 : rule__Allocation__Group__6__Impl ;
    public final void rule__Allocation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1626:1: ( rule__Allocation__Group__6__Impl )
            // InternalPDL.g:1627:2: rule__Allocation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Allocation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__6"


    // $ANTLR start "rule__Allocation__Group__6__Impl"
    // InternalPDL.g:1633:1: rule__Allocation__Group__6__Impl : ( '}' ) ;
    public final void rule__Allocation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1637:1: ( ( '}' ) )
            // InternalPDL.g:1638:1: ( '}' )
            {
            // InternalPDL.g:1638:1: ( '}' )
            // InternalPDL.g:1639:2: '}'
            {
             before(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__Group__6__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPDL.g:1649:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1653:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPDL.g:1654:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalPDL.g:1661:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1665:1: ( ( ( '-' )? ) )
            // InternalPDL.g:1666:1: ( ( '-' )? )
            {
            // InternalPDL.g:1666:1: ( ( '-' )? )
            // InternalPDL.g:1667:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPDL.g:1668:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPDL.g:1668:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalPDL.g:1676:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1680:1: ( rule__EInt__Group__1__Impl )
            // InternalPDL.g:1681:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalPDL.g:1687:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1691:1: ( ( RULE_INT ) )
            // InternalPDL.g:1692:1: ( RULE_INT )
            {
            // InternalPDL.g:1692:1: ( RULE_INT )
            // InternalPDL.g:1693:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // InternalPDL.g:1703:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1707:1: ( ( ruleEString ) )
            // InternalPDL.g:1708:2: ( ruleEString )
            {
            // InternalPDL.g:1708:2: ( ruleEString )
            // InternalPDL.g:1709:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__ProcessElementAssignment_4"
    // InternalPDL.g:1718:1: rule__Process__ProcessElementAssignment_4 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1722:1: ( ( ruleProcessElement ) )
            // InternalPDL.g:1723:2: ( ruleProcessElement )
            {
            // InternalPDL.g:1723:2: ( ruleProcessElement )
            // InternalPDL.g:1724:3: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementProcessElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementProcessElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ProcessElementAssignment_4"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_2"
    // InternalPDL.g:1733:1: rule__WorkDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1737:1: ( ( ruleEString ) )
            // InternalPDL.g:1738:2: ( ruleEString )
            {
            // InternalPDL.g:1738:2: ( ruleEString )
            // InternalPDL.g:1739:3: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__NameAssignment_2"


    // $ANTLR start "rule__WorkDefinition__AllocationAssignment_3_1"
    // InternalPDL.g:1748:1: rule__WorkDefinition__AllocationAssignment_3_1 : ( ruleAllocation ) ;
    public final void rule__WorkDefinition__AllocationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1752:1: ( ( ruleAllocation ) )
            // InternalPDL.g:1753:2: ( ruleAllocation )
            {
            // InternalPDL.g:1753:2: ( ruleAllocation )
            // InternalPDL.g:1754:3: ruleAllocation
            {
             before(grammarAccess.getWorkDefinitionAccess().getAllocationAllocationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocation();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getAllocationAllocationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__AllocationAssignment_3_1"


    // $ANTLR start "rule__WorkDefinition__AllocationAssignment_3_2_1"
    // InternalPDL.g:1763:1: rule__WorkDefinition__AllocationAssignment_3_2_1 : ( ruleAllocation ) ;
    public final void rule__WorkDefinition__AllocationAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1767:1: ( ( ruleAllocation ) )
            // InternalPDL.g:1768:2: ( ruleAllocation )
            {
            // InternalPDL.g:1768:2: ( ruleAllocation )
            // InternalPDL.g:1769:3: ruleAllocation
            {
             before(grammarAccess.getWorkDefinitionAccess().getAllocationAllocationParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAllocation();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getAllocationAllocationParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkDefinition__AllocationAssignment_3_2_1"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // InternalPDL.g:1778:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1782:1: ( ( ruleWorkSequenceType ) )
            // InternalPDL.g:1783:2: ( ruleWorkSequenceType )
            {
            // InternalPDL.g:1783:2: ( ruleWorkSequenceType )
            // InternalPDL.g:1784:3: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // InternalPDL.g:1793:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1797:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1798:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1798:2: ( ( RULE_ID ) )
            // InternalPDL.g:1799:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // InternalPDL.g:1800:3: ( RULE_ID )
            // InternalPDL.g:1801:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // InternalPDL.g:1812:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1816:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1817:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1817:2: ( ( RULE_ID ) )
            // InternalPDL.g:1818:3: ( RULE_ID )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // InternalPDL.g:1819:3: ( RULE_ID )
            // InternalPDL.g:1820:4: RULE_ID
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TextAssignment_3_1"
    // InternalPDL.g:1831:1: rule__Guidance__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Guidance__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1835:1: ( ( ruleEString ) )
            // InternalPDL.g:1836:2: ( ruleEString )
            {
            // InternalPDL.g:1836:2: ( ruleEString )
            // InternalPDL.g:1837:3: ruleEString
            {
             before(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuidanceAccess().getTextEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__TextAssignment_3_1"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_2"
    // InternalPDL.g:1846:1: rule__Guidance__ElementsAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1850:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1851:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1851:2: ( ( RULE_ID ) )
            // InternalPDL.g:1852:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 
            // InternalPDL.g:1853:3: ( RULE_ID )
            // InternalPDL.g:1854:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_2"


    // $ANTLR start "rule__Guidance__ElementsAssignment_4_3_1"
    // InternalPDL.g:1865:1: rule__Guidance__ElementsAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Guidance__ElementsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1869:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1870:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1870:2: ( ( RULE_ID ) )
            // InternalPDL.g:1871:3: ( RULE_ID )
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 
            // InternalPDL.g:1872:3: ( RULE_ID )
            // InternalPDL.g:1873:4: RULE_ID
            {
             before(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGuidanceAccess().getElementsProcessElementIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getGuidanceAccess().getElementsProcessElementCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__ElementsAssignment_4_3_1"


    // $ANTLR start "rule__Ressource__NameAssignment_1"
    // InternalPDL.g:1884:1: rule__Ressource__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Ressource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1888:1: ( ( ruleEString ) )
            // InternalPDL.g:1889:2: ( ruleEString )
            {
            // InternalPDL.g:1889:2: ( ruleEString )
            // InternalPDL.g:1890:3: ruleEString
            {
             before(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__NameAssignment_1"


    // $ANTLR start "rule__Ressource__CountAssignment_2"
    // InternalPDL.g:1899:1: rule__Ressource__CountAssignment_2 : ( ruleEInt ) ;
    public final void rule__Ressource__CountAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1903:1: ( ( ruleEInt ) )
            // InternalPDL.g:1904:2: ( ruleEInt )
            {
            // InternalPDL.g:1904:2: ( ruleEInt )
            // InternalPDL.g:1905:3: ruleEInt
            {
             before(grammarAccess.getRessourceAccess().getCountEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getCountEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__CountAssignment_2"


    // $ANTLR start "rule__Allocation__NeededAssignment_3"
    // InternalPDL.g:1914:1: rule__Allocation__NeededAssignment_3 : ( ruleEInt ) ;
    public final void rule__Allocation__NeededAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1918:1: ( ( ruleEInt ) )
            // InternalPDL.g:1919:2: ( ruleEInt )
            {
            // InternalPDL.g:1919:2: ( ruleEInt )
            // InternalPDL.g:1920:3: ruleEInt
            {
             before(grammarAccess.getAllocationAccess().getNeededEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAllocationAccess().getNeededEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__NeededAssignment_3"


    // $ANTLR start "rule__Allocation__RessourceAssignment_5"
    // InternalPDL.g:1929:1: rule__Allocation__RessourceAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Allocation__RessourceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPDL.g:1933:1: ( ( ( RULE_ID ) ) )
            // InternalPDL.g:1934:2: ( ( RULE_ID ) )
            {
            // InternalPDL.g:1934:2: ( ( RULE_ID ) )
            // InternalPDL.g:1935:3: ( RULE_ID )
            {
             before(grammarAccess.getAllocationAccess().getRessourceRessourceCrossReference_5_0()); 
            // InternalPDL.g:1936:3: ( RULE_ID )
            // InternalPDL.g:1937:4: RULE_ID
            {
             before(grammarAccess.getAllocationAccess().getRessourceRessourceIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAllocationAccess().getRessourceRessourceIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAllocationAccess().getRessourceRessourceCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Allocation__RessourceAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010960000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010940002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000020000L});

}