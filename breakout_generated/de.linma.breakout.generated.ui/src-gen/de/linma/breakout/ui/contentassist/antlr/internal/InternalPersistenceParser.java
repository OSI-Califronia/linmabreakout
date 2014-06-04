package de.linma.breakout.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.linma.breakout.services.PersistenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPersistenceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_TYPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PersistenceModel'", "'{'", "'}'", "'PersistenceEntity'", "'idProperty'", "'Property'", "'type'", "'persistenceName'", "'isNullable'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int RULE_TYPE=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalPersistenceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPersistenceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPersistenceParser.tokenNames; }
    public String getGrammarFileName() { return "../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g"; }


     
     	private PersistenceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PersistenceGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:61:1: ( ruleModel EOF )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:62:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:69:1: ruleModel : ( rulePersistenceModel ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:73:2: ( ( rulePersistenceModel ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:74:1: ( rulePersistenceModel )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:74:1: ( rulePersistenceModel )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:75:1: rulePersistenceModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPersistenceModelParserRuleCall()); 
            }
            pushFollow(FOLLOW_rulePersistenceModel_in_ruleModel94);
            rulePersistenceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPersistenceModelParserRuleCall()); 
            }

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePersistenceModel"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:88:1: entryRulePersistenceModel : rulePersistenceModel EOF ;
    public final void entryRulePersistenceModel() throws RecognitionException {
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:89:1: ( rulePersistenceModel EOF )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:90:1: rulePersistenceModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelRule()); 
            }
            pushFollow(FOLLOW_rulePersistenceModel_in_entryRulePersistenceModel120);
            rulePersistenceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceModel127); if (state.failed) return ;

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
    // $ANTLR end "entryRulePersistenceModel"


    // $ANTLR start "rulePersistenceModel"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:97:1: rulePersistenceModel : ( ( rule__PersistenceModel__Group__0 ) ) ;
    public final void rulePersistenceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:101:2: ( ( ( rule__PersistenceModel__Group__0 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:102:1: ( ( rule__PersistenceModel__Group__0 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:102:1: ( ( rule__PersistenceModel__Group__0 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:103:1: ( rule__PersistenceModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getGroup()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:104:1: ( rule__PersistenceModel__Group__0 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:104:2: rule__PersistenceModel__Group__0
            {
            pushFollow(FOLLOW_rule__PersistenceModel__Group__0_in_rulePersistenceModel153);
            rule__PersistenceModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePersistenceModel"


    // $ANTLR start "entryRulePersistenceEntity"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:116:1: entryRulePersistenceEntity : rulePersistenceEntity EOF ;
    public final void entryRulePersistenceEntity() throws RecognitionException {
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:117:1: ( rulePersistenceEntity EOF )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:118:1: rulePersistenceEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityRule()); 
            }
            pushFollow(FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity180);
            rulePersistenceEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceEntity187); if (state.failed) return ;

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
    // $ANTLR end "entryRulePersistenceEntity"


    // $ANTLR start "rulePersistenceEntity"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:125:1: rulePersistenceEntity : ( ( rule__PersistenceEntity__Group__0 ) ) ;
    public final void rulePersistenceEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:129:2: ( ( ( rule__PersistenceEntity__Group__0 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:130:1: ( ( rule__PersistenceEntity__Group__0 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:130:1: ( ( rule__PersistenceEntity__Group__0 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:131:1: ( rule__PersistenceEntity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getGroup()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:132:1: ( rule__PersistenceEntity__Group__0 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:132:2: rule__PersistenceEntity__Group__0
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__0_in_rulePersistenceEntity213);
            rule__PersistenceEntity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getGroup()); 
            }

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
    // $ANTLR end "rulePersistenceEntity"


    // $ANTLR start "entryRuleProperty"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:144:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:145:1: ( ruleProperty EOF )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:146:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty240);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty247); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:153:1: ruleProperty : ( ( rule__Property__UnorderedGroup ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:157:2: ( ( ( rule__Property__UnorderedGroup ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:158:1: ( ( rule__Property__UnorderedGroup ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:158:1: ( ( rule__Property__UnorderedGroup ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:159:1: ( rule__Property__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getUnorderedGroup()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:160:1: ( rule__Property__UnorderedGroup )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:160:2: rule__Property__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Property__UnorderedGroup_in_ruleProperty273);
            rule__Property__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getUnorderedGroup()); 
            }

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "rule__PersistenceModel__Group__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:174:1: rule__PersistenceModel__Group__0 : rule__PersistenceModel__Group__0__Impl rule__PersistenceModel__Group__1 ;
    public final void rule__PersistenceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:178:1: ( rule__PersistenceModel__Group__0__Impl rule__PersistenceModel__Group__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:179:2: rule__PersistenceModel__Group__0__Impl rule__PersistenceModel__Group__1
            {
            pushFollow(FOLLOW_rule__PersistenceModel__Group__0__Impl_in_rule__PersistenceModel__Group__0307);
            rule__PersistenceModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceModel__Group__1_in_rule__PersistenceModel__Group__0310);
            rule__PersistenceModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceModel__Group__0"


    // $ANTLR start "rule__PersistenceModel__Group__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:186:1: rule__PersistenceModel__Group__0__Impl : ( 'PersistenceModel' ) ;
    public final void rule__PersistenceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:190:1: ( ( 'PersistenceModel' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:191:1: ( 'PersistenceModel' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:191:1: ( 'PersistenceModel' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:192:1: 'PersistenceModel'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getPersistenceModelKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__PersistenceModel__Group__0__Impl338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getPersistenceModelKeyword_0()); 
            }

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
    // $ANTLR end "rule__PersistenceModel__Group__0__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:205:1: rule__PersistenceModel__Group__1 : rule__PersistenceModel__Group__1__Impl rule__PersistenceModel__Group__2 ;
    public final void rule__PersistenceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:209:1: ( rule__PersistenceModel__Group__1__Impl rule__PersistenceModel__Group__2 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:210:2: rule__PersistenceModel__Group__1__Impl rule__PersistenceModel__Group__2
            {
            pushFollow(FOLLOW_rule__PersistenceModel__Group__1__Impl_in_rule__PersistenceModel__Group__1369);
            rule__PersistenceModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceModel__Group__2_in_rule__PersistenceModel__Group__1372);
            rule__PersistenceModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceModel__Group__1"


    // $ANTLR start "rule__PersistenceModel__Group__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:217:1: rule__PersistenceModel__Group__1__Impl : ( ( rule__PersistenceModel__NameAssignment_1 ) ) ;
    public final void rule__PersistenceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:221:1: ( ( ( rule__PersistenceModel__NameAssignment_1 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:222:1: ( ( rule__PersistenceModel__NameAssignment_1 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:222:1: ( ( rule__PersistenceModel__NameAssignment_1 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:223:1: ( rule__PersistenceModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getNameAssignment_1()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:224:1: ( rule__PersistenceModel__NameAssignment_1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:224:2: rule__PersistenceModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PersistenceModel__NameAssignment_1_in_rule__PersistenceModel__Group__1__Impl399);
            rule__PersistenceModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__PersistenceModel__Group__1__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__2"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:234:1: rule__PersistenceModel__Group__2 : rule__PersistenceModel__Group__2__Impl rule__PersistenceModel__Group__3 ;
    public final void rule__PersistenceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:238:1: ( rule__PersistenceModel__Group__2__Impl rule__PersistenceModel__Group__3 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:239:2: rule__PersistenceModel__Group__2__Impl rule__PersistenceModel__Group__3
            {
            pushFollow(FOLLOW_rule__PersistenceModel__Group__2__Impl_in_rule__PersistenceModel__Group__2429);
            rule__PersistenceModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceModel__Group__3_in_rule__PersistenceModel__Group__2432);
            rule__PersistenceModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceModel__Group__2"


    // $ANTLR start "rule__PersistenceModel__Group__2__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:246:1: rule__PersistenceModel__Group__2__Impl : ( '{' ) ;
    public final void rule__PersistenceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:250:1: ( ( '{' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:251:1: ( '{' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:251:1: ( '{' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:252:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__PersistenceModel__Group__2__Impl460); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2()); 
            }

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
    // $ANTLR end "rule__PersistenceModel__Group__2__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__3"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:265:1: rule__PersistenceModel__Group__3 : rule__PersistenceModel__Group__3__Impl rule__PersistenceModel__Group__4 ;
    public final void rule__PersistenceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:269:1: ( rule__PersistenceModel__Group__3__Impl rule__PersistenceModel__Group__4 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:270:2: rule__PersistenceModel__Group__3__Impl rule__PersistenceModel__Group__4
            {
            pushFollow(FOLLOW_rule__PersistenceModel__Group__3__Impl_in_rule__PersistenceModel__Group__3491);
            rule__PersistenceModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceModel__Group__4_in_rule__PersistenceModel__Group__3494);
            rule__PersistenceModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceModel__Group__3"


    // $ANTLR start "rule__PersistenceModel__Group__3__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:277:1: rule__PersistenceModel__Group__3__Impl : ( ( rule__PersistenceModel__PersistenceEntitiesAssignment_3 )* ) ;
    public final void rule__PersistenceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:281:1: ( ( ( rule__PersistenceModel__PersistenceEntitiesAssignment_3 )* ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:282:1: ( ( rule__PersistenceModel__PersistenceEntitiesAssignment_3 )* )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:282:1: ( ( rule__PersistenceModel__PersistenceEntitiesAssignment_3 )* )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:283:1: ( rule__PersistenceModel__PersistenceEntitiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesAssignment_3()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:284:1: ( rule__PersistenceModel__PersistenceEntitiesAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:284:2: rule__PersistenceModel__PersistenceEntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PersistenceModel__PersistenceEntitiesAssignment_3_in_rule__PersistenceModel__Group__3__Impl521);
            	    rule__PersistenceModel__PersistenceEntitiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesAssignment_3()); 
            }

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
    // $ANTLR end "rule__PersistenceModel__Group__3__Impl"


    // $ANTLR start "rule__PersistenceModel__Group__4"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:294:1: rule__PersistenceModel__Group__4 : rule__PersistenceModel__Group__4__Impl ;
    public final void rule__PersistenceModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:298:1: ( rule__PersistenceModel__Group__4__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:299:2: rule__PersistenceModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceModel__Group__4__Impl_in_rule__PersistenceModel__Group__4552);
            rule__PersistenceModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceModel__Group__4"


    // $ANTLR start "rule__PersistenceModel__Group__4__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:305:1: rule__PersistenceModel__Group__4__Impl : ( '}' ) ;
    public final void rule__PersistenceModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:309:1: ( ( '}' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:310:1: ( '}' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:310:1: ( '}' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:311:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__PersistenceModel__Group__4__Impl580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__PersistenceModel__Group__4__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:334:1: rule__PersistenceEntity__Group__0 : rule__PersistenceEntity__Group__0__Impl rule__PersistenceEntity__Group__1 ;
    public final void rule__PersistenceEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:338:1: ( rule__PersistenceEntity__Group__0__Impl rule__PersistenceEntity__Group__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:339:2: rule__PersistenceEntity__Group__0__Impl rule__PersistenceEntity__Group__1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__0__Impl_in_rule__PersistenceEntity__Group__0621);
            rule__PersistenceEntity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__1_in_rule__PersistenceEntity__Group__0624);
            rule__PersistenceEntity__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group__0"


    // $ANTLR start "rule__PersistenceEntity__Group__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:346:1: rule__PersistenceEntity__Group__0__Impl : ( 'PersistenceEntity' ) ;
    public final void rule__PersistenceEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:350:1: ( ( 'PersistenceEntity' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:351:1: ( 'PersistenceEntity' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:351:1: ( 'PersistenceEntity' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:352:1: 'PersistenceEntity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getPersistenceEntityKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__PersistenceEntity__Group__0__Impl652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getPersistenceEntityKeyword_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group__0__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:365:1: rule__PersistenceEntity__Group__1 : rule__PersistenceEntity__Group__1__Impl rule__PersistenceEntity__Group__2 ;
    public final void rule__PersistenceEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:369:1: ( rule__PersistenceEntity__Group__1__Impl rule__PersistenceEntity__Group__2 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:370:2: rule__PersistenceEntity__Group__1__Impl rule__PersistenceEntity__Group__2
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__1__Impl_in_rule__PersistenceEntity__Group__1683);
            rule__PersistenceEntity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__2_in_rule__PersistenceEntity__Group__1686);
            rule__PersistenceEntity__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group__1"


    // $ANTLR start "rule__PersistenceEntity__Group__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:377:1: rule__PersistenceEntity__Group__1__Impl : ( ( rule__PersistenceEntity__NameAssignment_1 ) ) ;
    public final void rule__PersistenceEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:381:1: ( ( ( rule__PersistenceEntity__NameAssignment_1 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:382:1: ( ( rule__PersistenceEntity__NameAssignment_1 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:382:1: ( ( rule__PersistenceEntity__NameAssignment_1 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:383:1: ( rule__PersistenceEntity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getNameAssignment_1()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:384:1: ( rule__PersistenceEntity__NameAssignment_1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:384:2: rule__PersistenceEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__NameAssignment_1_in_rule__PersistenceEntity__Group__1__Impl713);
            rule__PersistenceEntity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group__1__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__2"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:394:1: rule__PersistenceEntity__Group__2 : rule__PersistenceEntity__Group__2__Impl rule__PersistenceEntity__Group__3 ;
    public final void rule__PersistenceEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:398:1: ( rule__PersistenceEntity__Group__2__Impl rule__PersistenceEntity__Group__3 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:399:2: rule__PersistenceEntity__Group__2__Impl rule__PersistenceEntity__Group__3
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__2__Impl_in_rule__PersistenceEntity__Group__2743);
            rule__PersistenceEntity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__3_in_rule__PersistenceEntity__Group__2746);
            rule__PersistenceEntity__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group__2"


    // $ANTLR start "rule__PersistenceEntity__Group__2__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:406:1: rule__PersistenceEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__PersistenceEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:410:1: ( ( '{' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:411:1: ( '{' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:411:1: ( '{' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:412:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__PersistenceEntity__Group__2__Impl774); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group__2__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__3"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:425:1: rule__PersistenceEntity__Group__3 : rule__PersistenceEntity__Group__3__Impl rule__PersistenceEntity__Group__4 ;
    public final void rule__PersistenceEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:429:1: ( rule__PersistenceEntity__Group__3__Impl rule__PersistenceEntity__Group__4 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:430:2: rule__PersistenceEntity__Group__3__Impl rule__PersistenceEntity__Group__4
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__3__Impl_in_rule__PersistenceEntity__Group__3805);
            rule__PersistenceEntity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__4_in_rule__PersistenceEntity__Group__3808);
            rule__PersistenceEntity__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group__3"


    // $ANTLR start "rule__PersistenceEntity__Group__3__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:437:1: rule__PersistenceEntity__Group__3__Impl : ( ( rule__PersistenceEntity__UnorderedGroup_3 ) ) ;
    public final void rule__PersistenceEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:441:1: ( ( ( rule__PersistenceEntity__UnorderedGroup_3 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:442:1: ( ( rule__PersistenceEntity__UnorderedGroup_3 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:442:1: ( ( rule__PersistenceEntity__UnorderedGroup_3 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:443:1: ( rule__PersistenceEntity__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:444:1: ( rule__PersistenceEntity__UnorderedGroup_3 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:444:2: rule__PersistenceEntity__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__UnorderedGroup_3_in_rule__PersistenceEntity__Group__3__Impl835);
            rule__PersistenceEntity__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group__3__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group__4"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:454:1: rule__PersistenceEntity__Group__4 : rule__PersistenceEntity__Group__4__Impl ;
    public final void rule__PersistenceEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:458:1: ( rule__PersistenceEntity__Group__4__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:459:2: rule__PersistenceEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group__4__Impl_in_rule__PersistenceEntity__Group__4865);
            rule__PersistenceEntity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group__4"


    // $ANTLR start "rule__PersistenceEntity__Group__4__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:465:1: rule__PersistenceEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__PersistenceEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:469:1: ( ( '}' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:470:1: ( '}' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:470:1: ( '}' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:471:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_15_in_rule__PersistenceEntity__Group__4__Impl893); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group__4__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group_3_0__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:494:1: rule__PersistenceEntity__Group_3_0__0 : rule__PersistenceEntity__Group_3_0__0__Impl rule__PersistenceEntity__Group_3_0__1 ;
    public final void rule__PersistenceEntity__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:498:1: ( rule__PersistenceEntity__Group_3_0__0__Impl rule__PersistenceEntity__Group_3_0__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:499:2: rule__PersistenceEntity__Group_3_0__0__Impl rule__PersistenceEntity__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_0__0__Impl_in_rule__PersistenceEntity__Group_3_0__0934);
            rule__PersistenceEntity__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_0__1_in_rule__PersistenceEntity__Group_3_0__0937);
            rule__PersistenceEntity__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_0__0"


    // $ANTLR start "rule__PersistenceEntity__Group_3_0__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:506:1: rule__PersistenceEntity__Group_3_0__0__Impl : ( ( rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0 ) ) ;
    public final void rule__PersistenceEntity__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:510:1: ( ( ( rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:511:1: ( ( rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:511:1: ( ( rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:512:1: ( rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNameAssignment_3_0_0()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:513:1: ( rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:513:2: rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0_in_rule__PersistenceEntity__Group_3_0__0__Impl964);
            rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNameAssignment_3_0_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_0__0__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group_3_0__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:523:1: rule__PersistenceEntity__Group_3_0__1 : rule__PersistenceEntity__Group_3_0__1__Impl ;
    public final void rule__PersistenceEntity__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:527:1: ( rule__PersistenceEntity__Group_3_0__1__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:528:2: rule__PersistenceEntity__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_0__1__Impl_in_rule__PersistenceEntity__Group_3_0__1994);
            rule__PersistenceEntity__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_0__1"


    // $ANTLR start "rule__PersistenceEntity__Group_3_0__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:534:1: rule__PersistenceEntity__Group_3_0__1__Impl : ( ( rule__PersistenceEntity__PersistenceNameAssignment_3_0_1 ) ) ;
    public final void rule__PersistenceEntity__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:538:1: ( ( ( rule__PersistenceEntity__PersistenceNameAssignment_3_0_1 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:539:1: ( ( rule__PersistenceEntity__PersistenceNameAssignment_3_0_1 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:539:1: ( ( rule__PersistenceEntity__PersistenceNameAssignment_3_0_1 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:540:1: ( rule__PersistenceEntity__PersistenceNameAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getPersistenceNameAssignment_3_0_1()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:541:1: ( rule__PersistenceEntity__PersistenceNameAssignment_3_0_1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:541:2: rule__PersistenceEntity__PersistenceNameAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__PersistenceNameAssignment_3_0_1_in_rule__PersistenceEntity__Group_3_0__1__Impl1021);
            rule__PersistenceEntity__PersistenceNameAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getPersistenceNameAssignment_3_0_1()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_0__1__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group_3_1__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:555:1: rule__PersistenceEntity__Group_3_1__0 : rule__PersistenceEntity__Group_3_1__0__Impl rule__PersistenceEntity__Group_3_1__1 ;
    public final void rule__PersistenceEntity__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:559:1: ( rule__PersistenceEntity__Group_3_1__0__Impl rule__PersistenceEntity__Group_3_1__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:560:2: rule__PersistenceEntity__Group_3_1__0__Impl rule__PersistenceEntity__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_1__0__Impl_in_rule__PersistenceEntity__Group_3_1__01055);
            rule__PersistenceEntity__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_1__1_in_rule__PersistenceEntity__Group_3_1__01058);
            rule__PersistenceEntity__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_1__0"


    // $ANTLR start "rule__PersistenceEntity__Group_3_1__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:567:1: rule__PersistenceEntity__Group_3_1__0__Impl : ( 'idProperty' ) ;
    public final void rule__PersistenceEntity__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:571:1: ( ( 'idProperty' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:572:1: ( 'idProperty' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:572:1: ( 'idProperty' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:573:1: 'idProperty'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getIdPropertyKeyword_3_1_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__PersistenceEntity__Group_3_1__0__Impl1086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getIdPropertyKeyword_3_1_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_1__0__Impl"


    // $ANTLR start "rule__PersistenceEntity__Group_3_1__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:586:1: rule__PersistenceEntity__Group_3_1__1 : rule__PersistenceEntity__Group_3_1__1__Impl ;
    public final void rule__PersistenceEntity__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:590:1: ( rule__PersistenceEntity__Group_3_1__1__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:591:2: rule__PersistenceEntity__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_1__1__Impl_in_rule__PersistenceEntity__Group_3_1__11117);
            rule__PersistenceEntity__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_1__1"


    // $ANTLR start "rule__PersistenceEntity__Group_3_1__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:597:1: rule__PersistenceEntity__Group_3_1__1__Impl : ( ( rule__PersistenceEntity__IdPropertyAssignment_3_1_1 ) ) ;
    public final void rule__PersistenceEntity__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:601:1: ( ( ( rule__PersistenceEntity__IdPropertyAssignment_3_1_1 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:602:1: ( ( rule__PersistenceEntity__IdPropertyAssignment_3_1_1 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:602:1: ( ( rule__PersistenceEntity__IdPropertyAssignment_3_1_1 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:603:1: ( rule__PersistenceEntity__IdPropertyAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getIdPropertyAssignment_3_1_1()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:604:1: ( rule__PersistenceEntity__IdPropertyAssignment_3_1_1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:604:2: rule__PersistenceEntity__IdPropertyAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__IdPropertyAssignment_3_1_1_in_rule__PersistenceEntity__Group_3_1__1__Impl1144);
            rule__PersistenceEntity__IdPropertyAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getIdPropertyAssignment_3_1_1()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__Group_3_1__1__Impl"


    // $ANTLR start "rule__Property__Group_0__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:618:1: rule__Property__Group_0__0 : rule__Property__Group_0__0__Impl rule__Property__Group_0__1 ;
    public final void rule__Property__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:622:1: ( rule__Property__Group_0__0__Impl rule__Property__Group_0__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:623:2: rule__Property__Group_0__0__Impl rule__Property__Group_0__1
            {
            pushFollow(FOLLOW_rule__Property__Group_0__0__Impl_in_rule__Property__Group_0__01178);
            rule__Property__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0__1_in_rule__Property__Group_0__01181);
            rule__Property__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_0__0"


    // $ANTLR start "rule__Property__Group_0__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:630:1: rule__Property__Group_0__0__Impl : ( 'Property' ) ;
    public final void rule__Property__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:634:1: ( ( 'Property' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:635:1: ( 'Property' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:635:1: ( 'Property' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:636:1: 'Property'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getPropertyKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Property__Group_0__0__Impl1209); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getPropertyKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__Property__Group_0__0__Impl"


    // $ANTLR start "rule__Property__Group_0__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:649:1: rule__Property__Group_0__1 : rule__Property__Group_0__1__Impl rule__Property__Group_0__2 ;
    public final void rule__Property__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:653:1: ( rule__Property__Group_0__1__Impl rule__Property__Group_0__2 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:654:2: rule__Property__Group_0__1__Impl rule__Property__Group_0__2
            {
            pushFollow(FOLLOW_rule__Property__Group_0__1__Impl_in_rule__Property__Group_0__11240);
            rule__Property__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0__2_in_rule__Property__Group_0__11243);
            rule__Property__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_0__1"


    // $ANTLR start "rule__Property__Group_0__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:661:1: rule__Property__Group_0__1__Impl : ( ( rule__Property__NameAssignment_0_1 ) ) ;
    public final void rule__Property__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:665:1: ( ( ( rule__Property__NameAssignment_0_1 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:666:1: ( ( rule__Property__NameAssignment_0_1 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:666:1: ( ( rule__Property__NameAssignment_0_1 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:667:1: ( rule__Property__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_0_1()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:668:1: ( rule__Property__NameAssignment_0_1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:668:2: rule__Property__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_0_1_in_rule__Property__Group_0__1__Impl1270);
            rule__Property__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__Property__Group_0__1__Impl"


    // $ANTLR start "rule__Property__Group_0__2"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:678:1: rule__Property__Group_0__2 : rule__Property__Group_0__2__Impl rule__Property__Group_0__3 ;
    public final void rule__Property__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:682:1: ( rule__Property__Group_0__2__Impl rule__Property__Group_0__3 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:683:2: rule__Property__Group_0__2__Impl rule__Property__Group_0__3
            {
            pushFollow(FOLLOW_rule__Property__Group_0__2__Impl_in_rule__Property__Group_0__21300);
            rule__Property__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0__3_in_rule__Property__Group_0__21303);
            rule__Property__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_0__2"


    // $ANTLR start "rule__Property__Group_0__2__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:690:1: rule__Property__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Property__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:694:1: ( ( '{' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:695:1: ( '{' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:695:1: ( '{' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:696:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_0_2()); 
            }
            match(input,14,FOLLOW_14_in_rule__Property__Group_0__2__Impl1331); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_0_2()); 
            }

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
    // $ANTLR end "rule__Property__Group_0__2__Impl"


    // $ANTLR start "rule__Property__Group_0__3"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:709:1: rule__Property__Group_0__3 : rule__Property__Group_0__3__Impl ;
    public final void rule__Property__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:713:1: ( rule__Property__Group_0__3__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:714:2: rule__Property__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_0__3__Impl_in_rule__Property__Group_0__31362);
            rule__Property__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_0__3"


    // $ANTLR start "rule__Property__Group_0__3__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:720:1: rule__Property__Group_0__3__Impl : ( ( rule__Property__Group_0_3__0 )? ) ;
    public final void rule__Property__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:724:1: ( ( ( rule__Property__Group_0_3__0 )? ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:725:1: ( ( rule__Property__Group_0_3__0 )? )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:725:1: ( ( rule__Property__Group_0_3__0 )? )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:726:1: ( rule__Property__Group_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_0_3()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:727:1: ( rule__Property__Group_0_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:727:2: rule__Property__Group_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_0_3__0_in_rule__Property__Group_0__3__Impl1389);
                    rule__Property__Group_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup_0_3()); 
            }

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
    // $ANTLR end "rule__Property__Group_0__3__Impl"


    // $ANTLR start "rule__Property__Group_0_3__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:745:1: rule__Property__Group_0_3__0 : rule__Property__Group_0_3__0__Impl rule__Property__Group_0_3__1 ;
    public final void rule__Property__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:749:1: ( rule__Property__Group_0_3__0__Impl rule__Property__Group_0_3__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:750:2: rule__Property__Group_0_3__0__Impl rule__Property__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Property__Group_0_3__0__Impl_in_rule__Property__Group_0_3__01428);
            rule__Property__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_0_3__1_in_rule__Property__Group_0_3__01431);
            rule__Property__Group_0_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_0_3__0"


    // $ANTLR start "rule__Property__Group_0_3__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:757:1: rule__Property__Group_0_3__0__Impl : ( ( rule__Property__IsNullableAssignment_0_3_0 ) ) ;
    public final void rule__Property__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:761:1: ( ( ( rule__Property__IsNullableAssignment_0_3_0 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:762:1: ( ( rule__Property__IsNullableAssignment_0_3_0 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:762:1: ( ( rule__Property__IsNullableAssignment_0_3_0 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:763:1: ( rule__Property__IsNullableAssignment_0_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getIsNullableAssignment_0_3_0()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:764:1: ( rule__Property__IsNullableAssignment_0_3_0 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:764:2: rule__Property__IsNullableAssignment_0_3_0
            {
            pushFollow(FOLLOW_rule__Property__IsNullableAssignment_0_3_0_in_rule__Property__Group_0_3__0__Impl1458);
            rule__Property__IsNullableAssignment_0_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getIsNullableAssignment_0_3_0()); 
            }

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
    // $ANTLR end "rule__Property__Group_0_3__0__Impl"


    // $ANTLR start "rule__Property__Group_0_3__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:774:1: rule__Property__Group_0_3__1 : rule__Property__Group_0_3__1__Impl ;
    public final void rule__Property__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:778:1: ( rule__Property__Group_0_3__1__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:779:2: rule__Property__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_0_3__1__Impl_in_rule__Property__Group_0_3__11488);
            rule__Property__Group_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_0_3__1"


    // $ANTLR start "rule__Property__Group_0_3__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:785:1: rule__Property__Group_0_3__1__Impl : ( ( rule__Property__NullableAssignment_0_3_1 ) ) ;
    public final void rule__Property__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:789:1: ( ( ( rule__Property__NullableAssignment_0_3_1 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:790:1: ( ( rule__Property__NullableAssignment_0_3_1 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:790:1: ( ( rule__Property__NullableAssignment_0_3_1 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:791:1: ( rule__Property__NullableAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNullableAssignment_0_3_1()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:792:1: ( rule__Property__NullableAssignment_0_3_1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:792:2: rule__Property__NullableAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Property__NullableAssignment_0_3_1_in_rule__Property__Group_0_3__1__Impl1515);
            rule__Property__NullableAssignment_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNullableAssignment_0_3_1()); 
            }

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
    // $ANTLR end "rule__Property__Group_0_3__1__Impl"


    // $ANTLR start "rule__Property__Group_1__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:806:1: rule__Property__Group_1__0 : rule__Property__Group_1__0__Impl rule__Property__Group_1__1 ;
    public final void rule__Property__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:810:1: ( rule__Property__Group_1__0__Impl rule__Property__Group_1__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:811:2: rule__Property__Group_1__0__Impl rule__Property__Group_1__1
            {
            pushFollow(FOLLOW_rule__Property__Group_1__0__Impl_in_rule__Property__Group_1__01549);
            rule__Property__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_1__1_in_rule__Property__Group_1__01552);
            rule__Property__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_1__0"


    // $ANTLR start "rule__Property__Group_1__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:818:1: rule__Property__Group_1__0__Impl : ( ( rule__Property__Group_1_0__0 ) ) ;
    public final void rule__Property__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:822:1: ( ( ( rule__Property__Group_1_0__0 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:823:1: ( ( rule__Property__Group_1_0__0 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:823:1: ( ( rule__Property__Group_1_0__0 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:824:1: ( rule__Property__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_1_0()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:825:1: ( rule__Property__Group_1_0__0 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:825:2: rule__Property__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Property__Group_1_0__0_in_rule__Property__Group_1__0__Impl1579);
            rule__Property__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__Property__Group_1__0__Impl"


    // $ANTLR start "rule__Property__Group_1__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:835:1: rule__Property__Group_1__1 : rule__Property__Group_1__1__Impl ;
    public final void rule__Property__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:839:1: ( rule__Property__Group_1__1__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:840:2: rule__Property__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_1__1__Impl_in_rule__Property__Group_1__11609);
            rule__Property__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_1__1"


    // $ANTLR start "rule__Property__Group_1__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:846:1: rule__Property__Group_1__1__Impl : ( '}' ) ;
    public final void rule__Property__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:850:1: ( ( '}' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:851:1: ( '}' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:851:1: ( '}' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:852:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Property__Group_1__1__Impl1637); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_1_1()); 
            }

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
    // $ANTLR end "rule__Property__Group_1__1__Impl"


    // $ANTLR start "rule__Property__Group_1_0__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:869:1: rule__Property__Group_1_0__0 : rule__Property__Group_1_0__0__Impl rule__Property__Group_1_0__1 ;
    public final void rule__Property__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:873:1: ( rule__Property__Group_1_0__0__Impl rule__Property__Group_1_0__1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:874:2: rule__Property__Group_1_0__0__Impl rule__Property__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Property__Group_1_0__0__Impl_in_rule__Property__Group_1_0__01672);
            rule__Property__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Property__Group_1_0__1_in_rule__Property__Group_1_0__01675);
            rule__Property__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_1_0__0"


    // $ANTLR start "rule__Property__Group_1_0__0__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:881:1: rule__Property__Group_1_0__0__Impl : ( 'type' ) ;
    public final void rule__Property__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:885:1: ( ( 'type' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:886:1: ( 'type' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:886:1: ( 'type' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:887:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeKeyword_1_0_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Property__Group_1_0__0__Impl1703); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeKeyword_1_0_0()); 
            }

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
    // $ANTLR end "rule__Property__Group_1_0__0__Impl"


    // $ANTLR start "rule__Property__Group_1_0__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:900:1: rule__Property__Group_1_0__1 : rule__Property__Group_1_0__1__Impl ;
    public final void rule__Property__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:904:1: ( rule__Property__Group_1_0__1__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:905:2: rule__Property__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group_1_0__1__Impl_in_rule__Property__Group_1_0__11734);
            rule__Property__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__Group_1_0__1"


    // $ANTLR start "rule__Property__Group_1_0__1__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:911:1: rule__Property__Group_1_0__1__Impl : ( ( rule__Property__TypeAssignment_1_0_1 ) ) ;
    public final void rule__Property__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:915:1: ( ( ( rule__Property__TypeAssignment_1_0_1 ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:916:1: ( ( rule__Property__TypeAssignment_1_0_1 ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:916:1: ( ( rule__Property__TypeAssignment_1_0_1 ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:917:1: ( rule__Property__TypeAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeAssignment_1_0_1()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:918:1: ( rule__Property__TypeAssignment_1_0_1 )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:918:2: rule__Property__TypeAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Property__TypeAssignment_1_0_1_in_rule__Property__Group_1_0__1__Impl1761);
            rule__Property__TypeAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeAssignment_1_0_1()); 
            }

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
    // $ANTLR end "rule__Property__Group_1_0__1__Impl"


    // $ANTLR start "rule__PersistenceEntity__UnorderedGroup_3"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:933:1: rule__PersistenceEntity__UnorderedGroup_3 : rule__PersistenceEntity__UnorderedGroup_3__0 {...}?;
    public final void rule__PersistenceEntity__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:938:1: ( rule__PersistenceEntity__UnorderedGroup_3__0 {...}?)
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:939:2: rule__PersistenceEntity__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__0_in_rule__PersistenceEntity__UnorderedGroup_31796);
            rule__PersistenceEntity__UnorderedGroup_3__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__PersistenceEntity__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersistenceEntity__UnorderedGroup_3"


    // $ANTLR start "rule__PersistenceEntity__UnorderedGroup_3__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:950:1: rule__PersistenceEntity__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) ) ) ) ;
    public final void rule__PersistenceEntity__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:955:1: ( ( ({...}? => ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) ) ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:956:3: ( ({...}? => ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) ) ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:956:3: ( ({...}? => ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( LA4_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1) ) {
                alt4=2;
            }
            else if ( LA4_0 >=18 && LA4_0<=19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2) ) {
                alt4=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:958:4: ({...}? => ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) ) )
                    {
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:958:4: ({...}? => ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:959:5: {...}? => ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__PersistenceEntity__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:959:114: ( ( ( rule__PersistenceEntity__Group_3_0__0 ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:960:6: ( ( rule__PersistenceEntity__Group_3_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:966:6: ( ( rule__PersistenceEntity__Group_3_0__0 ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:968:7: ( rule__PersistenceEntity__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPersistenceEntityAccess().getGroup_3_0()); 
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:969:7: ( rule__PersistenceEntity__Group_3_0__0 )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:969:8: rule__PersistenceEntity__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_0__0_in_rule__PersistenceEntity__UnorderedGroup_3__Impl1885);
                    rule__PersistenceEntity__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPersistenceEntityAccess().getGroup_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:975:4: ({...}? => ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) ) )
                    {
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:975:4: ({...}? => ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:976:5: {...}? => ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__PersistenceEntity__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:976:114: ( ( ( rule__PersistenceEntity__Group_3_1__0 ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:977:6: ( ( rule__PersistenceEntity__Group_3_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:983:6: ( ( rule__PersistenceEntity__Group_3_1__0 ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:985:7: ( rule__PersistenceEntity__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPersistenceEntityAccess().getGroup_3_1()); 
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:986:7: ( rule__PersistenceEntity__Group_3_1__0 )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:986:8: rule__PersistenceEntity__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__PersistenceEntity__Group_3_1__0_in_rule__PersistenceEntity__UnorderedGroup_3__Impl1976);
                    rule__PersistenceEntity__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPersistenceEntityAccess().getGroup_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:992:4: ({...}? => ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) ) )
                    {
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:992:4: ({...}? => ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:993:5: {...}? => ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__PersistenceEntity__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:993:114: ( ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:994:6: ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1000:6: ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1001:6: ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) ) ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* )
                    {
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1001:6: ( ( rule__PersistenceEntity__PropertyAssignment_3_2 ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1002:7: ( rule__PersistenceEntity__PropertyAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); 
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1003:7: ( rule__PersistenceEntity__PropertyAssignment_3_2 )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1003:8: rule__PersistenceEntity__PropertyAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__PersistenceEntity__PropertyAssignment_3_2_in_rule__PersistenceEntity__UnorderedGroup_3__Impl2068);
                    rule__PersistenceEntity__PropertyAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); 
                    }

                    }

                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1006:6: ( ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )* )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1007:7: ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); 
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1008:7: ( ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            int LA3_2 = input.LA(2);

                            if ( (LA3_2==RULE_ID) ) {
                                int LA3_4 = input.LA(3);

                                if ( (LA3_4==14) ) {
                                    int LA3_6 = input.LA(4);

                                    if ( (synpred1_InternalPersistence()) ) {
                                        alt3=1;
                                    }


                                }


                            }


                        }
                        else if ( (LA3_0==19) ) {
                            int LA3_3 = input.LA(2);

                            if ( (LA3_3==RULE_TYPE) ) {
                                int LA3_5 = input.LA(3);

                                if ( (LA3_5==15) ) {
                                    int LA3_7 = input.LA(4);

                                    if ( (synpred1_InternalPersistence()) ) {
                                        alt3=1;
                                    }


                                }


                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1008:8: ( rule__PersistenceEntity__PropertyAssignment_3_2 )=> rule__PersistenceEntity__PropertyAssignment_3_2
                    	    {
                    	    pushFollow(FOLLOW_rule__PersistenceEntity__PropertyAssignment_3_2_in_rule__PersistenceEntity__UnorderedGroup_3__Impl2112);
                    	    rule__PersistenceEntity__PropertyAssignment_3_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PersistenceEntity__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__PersistenceEntity__UnorderedGroup_3__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1023:1: rule__PersistenceEntity__UnorderedGroup_3__0 : rule__PersistenceEntity__UnorderedGroup_3__Impl ( rule__PersistenceEntity__UnorderedGroup_3__1 )? ;
    public final void rule__PersistenceEntity__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1027:1: ( rule__PersistenceEntity__UnorderedGroup_3__Impl ( rule__PersistenceEntity__UnorderedGroup_3__1 )? )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1028:2: rule__PersistenceEntity__UnorderedGroup_3__Impl ( rule__PersistenceEntity__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__Impl_in_rule__PersistenceEntity__UnorderedGroup_3__02178);
            rule__PersistenceEntity__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1029:2: ( rule__PersistenceEntity__UnorderedGroup_3__1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1) ) {
                alt5=1;
            }
            else if ( LA5_0 >=18 && LA5_0<=19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1029:2: rule__PersistenceEntity__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__1_in_rule__PersistenceEntity__UnorderedGroup_3__02181);
                    rule__PersistenceEntity__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__PersistenceEntity__UnorderedGroup_3__0"


    // $ANTLR start "rule__PersistenceEntity__UnorderedGroup_3__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1036:1: rule__PersistenceEntity__UnorderedGroup_3__1 : rule__PersistenceEntity__UnorderedGroup_3__Impl ( rule__PersistenceEntity__UnorderedGroup_3__2 )? ;
    public final void rule__PersistenceEntity__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1040:1: ( rule__PersistenceEntity__UnorderedGroup_3__Impl ( rule__PersistenceEntity__UnorderedGroup_3__2 )? )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1041:2: rule__PersistenceEntity__UnorderedGroup_3__Impl ( rule__PersistenceEntity__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__Impl_in_rule__PersistenceEntity__UnorderedGroup_3__12206);
            rule__PersistenceEntity__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1042:2: ( rule__PersistenceEntity__UnorderedGroup_3__2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 >=18 && LA6_0<=19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1042:2: rule__PersistenceEntity__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__2_in_rule__PersistenceEntity__UnorderedGroup_3__12209);
                    rule__PersistenceEntity__UnorderedGroup_3__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__PersistenceEntity__UnorderedGroup_3__1"


    // $ANTLR start "rule__PersistenceEntity__UnorderedGroup_3__2"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1049:1: rule__PersistenceEntity__UnorderedGroup_3__2 : rule__PersistenceEntity__UnorderedGroup_3__Impl ;
    public final void rule__PersistenceEntity__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1053:1: ( rule__PersistenceEntity__UnorderedGroup_3__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1054:2: rule__PersistenceEntity__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__Impl_in_rule__PersistenceEntity__UnorderedGroup_3__22234);
            rule__PersistenceEntity__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PersistenceEntity__UnorderedGroup_3__2"


    // $ANTLR start "rule__Property__UnorderedGroup"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1067:1: rule__Property__UnorderedGroup : rule__Property__UnorderedGroup__0 {...}?;
    public final void rule__Property__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPropertyAccess().getUnorderedGroup());
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1072:1: ( rule__Property__UnorderedGroup__0 {...}?)
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1073:2: rule__Property__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Property__UnorderedGroup__0_in_rule__Property__UnorderedGroup2264);
            rule__Property__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPropertyAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Property__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getPropertyAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPropertyAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__UnorderedGroup"


    // $ANTLR start "rule__Property__UnorderedGroup__Impl"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1084:1: rule__Property__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Property__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Property__Group_1__0 ) ) ) ) ) ;
    public final void rule__Property__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1089:1: ( ( ({...}? => ( ( ( rule__Property__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Property__Group_1__0 ) ) ) ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1090:3: ( ({...}? => ( ( ( rule__Property__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Property__Group_1__0 ) ) ) ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1090:3: ( ({...}? => ( ( ( rule__Property__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Property__Group_1__0 ) ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1092:4: ({...}? => ( ( ( rule__Property__Group_0__0 ) ) ) )
                    {
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1092:4: ({...}? => ( ( ( rule__Property__Group_0__0 ) ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1093:5: {...}? => ( ( ( rule__Property__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Property__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0)");
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1093:103: ( ( ( rule__Property__Group_0__0 ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1094:6: ( ( rule__Property__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1100:6: ( ( rule__Property__Group_0__0 ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1102:7: ( rule__Property__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_0()); 
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1103:7: ( rule__Property__Group_0__0 )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1103:8: rule__Property__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_0__0_in_rule__Property__UnorderedGroup__Impl2353);
                    rule__Property__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getGroup_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1109:4: ({...}? => ( ( ( rule__Property__Group_1__0 ) ) ) )
                    {
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1109:4: ({...}? => ( ( ( rule__Property__Group_1__0 ) ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1110:5: {...}? => ( ( ( rule__Property__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Property__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1)");
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1110:103: ( ( ( rule__Property__Group_1__0 ) ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1111:6: ( ( rule__Property__Group_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1117:6: ( ( rule__Property__Group_1__0 ) )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1119:7: ( rule__Property__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_1()); 
                    }
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1120:7: ( rule__Property__Group_1__0 )
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1120:8: rule__Property__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_1__0_in_rule__Property__UnorderedGroup__Impl2444);
                    rule__Property__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getGroup_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__UnorderedGroup__Impl"


    // $ANTLR start "rule__Property__UnorderedGroup__0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1135:1: rule__Property__UnorderedGroup__0 : rule__Property__UnorderedGroup__Impl ( rule__Property__UnorderedGroup__1 )? ;
    public final void rule__Property__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1139:1: ( rule__Property__UnorderedGroup__Impl ( rule__Property__UnorderedGroup__1 )? )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1140:2: rule__Property__UnorderedGroup__Impl ( rule__Property__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Property__UnorderedGroup__Impl_in_rule__Property__UnorderedGroup__02503);
            rule__Property__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1141:2: ( rule__Property__UnorderedGroup__1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==14) ) {
                        int LA8_6 = input.LA(4);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0) ) {
                            alt8=1;
                        }
                    }
                }
            }
            else if ( (LA8_0==19) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_TYPE) ) {
                    int LA8_5 = input.LA(3);

                    if ( (LA8_5==15) ) {
                        int LA8_7 = input.LA(4);

                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1) ) {
                            alt8=1;
                        }
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1141:2: rule__Property__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Property__UnorderedGroup__1_in_rule__Property__UnorderedGroup__02506);
                    rule__Property__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // $ANTLR end "rule__Property__UnorderedGroup__0"


    // $ANTLR start "rule__Property__UnorderedGroup__1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1148:1: rule__Property__UnorderedGroup__1 : rule__Property__UnorderedGroup__Impl ;
    public final void rule__Property__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1152:1: ( rule__Property__UnorderedGroup__Impl )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1153:2: rule__Property__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Property__UnorderedGroup__Impl_in_rule__Property__UnorderedGroup__12531);
            rule__Property__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Property__UnorderedGroup__1"


    // $ANTLR start "rule__PersistenceModel__NameAssignment_1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1164:1: rule__PersistenceModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PersistenceModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1168:1: ( ( RULE_ID ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1169:1: ( RULE_ID )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1169:1: ( RULE_ID )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1170:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PersistenceModel__NameAssignment_12563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__PersistenceModel__NameAssignment_1"


    // $ANTLR start "rule__PersistenceModel__PersistenceEntitiesAssignment_3"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1179:1: rule__PersistenceModel__PersistenceEntitiesAssignment_3 : ( rulePersistenceEntity ) ;
    public final void rule__PersistenceModel__PersistenceEntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1183:1: ( ( rulePersistenceEntity ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1184:1: ( rulePersistenceEntity )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1184:1: ( rulePersistenceEntity )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1185:1: rulePersistenceEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePersistenceEntity_in_rule__PersistenceModel__PersistenceEntitiesAssignment_32594);
            rulePersistenceEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__PersistenceModel__PersistenceEntitiesAssignment_3"


    // $ANTLR start "rule__PersistenceEntity__NameAssignment_1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1194:1: rule__PersistenceEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PersistenceEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1198:1: ( ( RULE_ID ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1199:1: ( RULE_ID )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1199:1: ( RULE_ID )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1200:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PersistenceEntity__NameAssignment_12625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__NameAssignment_1"


    // $ANTLR start "rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1209:1: rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0 : ( ( 'persistenceName' ) ) ;
    public final void rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1213:1: ( ( ( 'persistenceName' ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1214:1: ( ( 'persistenceName' ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1214:1: ( ( 'persistenceName' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1215:1: ( 'persistenceName' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1216:1: ( 'persistenceName' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1217:1: 'persistenceName'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_02661); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0"


    // $ANTLR start "rule__PersistenceEntity__PersistenceNameAssignment_3_0_1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1232:1: rule__PersistenceEntity__PersistenceNameAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__PersistenceEntity__PersistenceNameAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1236:1: ( ( RULE_STRING ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1237:1: ( RULE_STRING )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1237:1: ( RULE_STRING )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1238:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getPersistenceNameSTRINGTerminalRuleCall_3_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PersistenceEntity__PersistenceNameAssignment_3_0_12700); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getPersistenceNameSTRINGTerminalRuleCall_3_0_1_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__PersistenceNameAssignment_3_0_1"


    // $ANTLR start "rule__PersistenceEntity__IdPropertyAssignment_3_1_1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1247:1: rule__PersistenceEntity__IdPropertyAssignment_3_1_1 : ( ruleProperty ) ;
    public final void rule__PersistenceEntity__IdPropertyAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1251:1: ( ( ruleProperty ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1252:1: ( ruleProperty )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1252:1: ( ruleProperty )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1253:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getIdPropertyPropertyParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__PersistenceEntity__IdPropertyAssignment_3_1_12731);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getIdPropertyPropertyParserRuleCall_3_1_1_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__IdPropertyAssignment_3_1_1"


    // $ANTLR start "rule__PersistenceEntity__PropertyAssignment_3_2"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1262:1: rule__PersistenceEntity__PropertyAssignment_3_2 : ( ruleProperty ) ;
    public final void rule__PersistenceEntity__PropertyAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1266:1: ( ( ruleProperty ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1267:1: ( ruleProperty )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1267:1: ( ruleProperty )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1268:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPersistenceEntityAccess().getPropertyPropertyParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__PersistenceEntity__PropertyAssignment_3_22762);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPersistenceEntityAccess().getPropertyPropertyParserRuleCall_3_2_0()); 
            }

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
    // $ANTLR end "rule__PersistenceEntity__PropertyAssignment_3_2"


    // $ANTLR start "rule__Property__NameAssignment_0_1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1277:1: rule__Property__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1281:1: ( ( RULE_ID ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1282:1: ( RULE_ID )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1282:1: ( RULE_ID )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1283:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__NameAssignment_0_12793); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }

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
    // $ANTLR end "rule__Property__NameAssignment_0_1"


    // $ANTLR start "rule__Property__IsNullableAssignment_0_3_0"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1292:1: rule__Property__IsNullableAssignment_0_3_0 : ( ( 'isNullable' ) ) ;
    public final void rule__Property__IsNullableAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1296:1: ( ( ( 'isNullable' ) ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1297:1: ( ( 'isNullable' ) )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1297:1: ( ( 'isNullable' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1298:1: ( 'isNullable' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); 
            }
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1299:1: ( 'isNullable' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1300:1: 'isNullable'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Property__IsNullableAssignment_0_3_02829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); 
            }

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
    // $ANTLR end "rule__Property__IsNullableAssignment_0_3_0"


    // $ANTLR start "rule__Property__NullableAssignment_0_3_1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1315:1: rule__Property__NullableAssignment_0_3_1 : ( RULE_BOOLEAN ) ;
    public final void rule__Property__NullableAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1319:1: ( ( RULE_BOOLEAN ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1320:1: ( RULE_BOOLEAN )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1320:1: ( RULE_BOOLEAN )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1321:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNullableBOOLEANTerminalRuleCall_0_3_1_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Property__NullableAssignment_0_3_12868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getNullableBOOLEANTerminalRuleCall_0_3_1_0()); 
            }

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
    // $ANTLR end "rule__Property__NullableAssignment_0_3_1"


    // $ANTLR start "rule__Property__TypeAssignment_1_0_1"
    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1330:1: rule__Property__TypeAssignment_1_0_1 : ( RULE_TYPE ) ;
    public final void rule__Property__TypeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1334:1: ( ( RULE_TYPE ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1335:1: ( RULE_TYPE )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1335:1: ( RULE_TYPE )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1336:1: RULE_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeTYPETerminalRuleCall_1_0_1_0()); 
            }
            match(input,RULE_TYPE,FOLLOW_RULE_TYPE_in_rule__Property__TypeAssignment_1_0_12899); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getTypeTYPETerminalRuleCall_1_0_1_0()); 
            }

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
    // $ANTLR end "rule__Property__TypeAssignment_1_0_1"

    // $ANTLR start synpred1_InternalPersistence
    public final void synpred1_InternalPersistence_fragment() throws RecognitionException {   
        // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1008:8: ( rule__PersistenceEntity__PropertyAssignment_3_2 )
        // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1008:9: rule__PersistenceEntity__PropertyAssignment_3_2
        {
        pushFollow(FOLLOW_rule__PersistenceEntity__PropertyAssignment_3_2_in_synpred1_InternalPersistence2109);
        rule__PersistenceEntity__PropertyAssignment_3_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalPersistence

    // Delegated rules

    public final boolean synpred1_InternalPersistence() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPersistence_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceModel_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceModel_in_entryRulePersistenceModel120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceModel127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__0_in_rulePersistenceModel153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceEntity187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__0_in_rulePersistenceEntity213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__UnorderedGroup_in_ruleProperty273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__0__Impl_in_rule__PersistenceModel__Group__0307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__1_in_rule__PersistenceModel__Group__0310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PersistenceModel__Group__0__Impl338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__1__Impl_in_rule__PersistenceModel__Group__1369 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__2_in_rule__PersistenceModel__Group__1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__NameAssignment_1_in_rule__PersistenceModel__Group__1__Impl399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__2__Impl_in_rule__PersistenceModel__Group__2429 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__3_in_rule__PersistenceModel__Group__2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PersistenceModel__Group__2__Impl460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__3__Impl_in_rule__PersistenceModel__Group__3491 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__4_in_rule__PersistenceModel__Group__3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__PersistenceEntitiesAssignment_3_in_rule__PersistenceModel__Group__3__Impl521 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__PersistenceModel__Group__4__Impl_in_rule__PersistenceModel__Group__4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PersistenceModel__Group__4__Impl580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__0__Impl_in_rule__PersistenceEntity__Group__0621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__1_in_rule__PersistenceEntity__Group__0624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PersistenceEntity__Group__0__Impl652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__1__Impl_in_rule__PersistenceEntity__Group__1683 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__2_in_rule__PersistenceEntity__Group__1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__NameAssignment_1_in_rule__PersistenceEntity__Group__1__Impl713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__2__Impl_in_rule__PersistenceEntity__Group__2743 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__3_in_rule__PersistenceEntity__Group__2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PersistenceEntity__Group__2__Impl774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__3__Impl_in_rule__PersistenceEntity__Group__3805 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__4_in_rule__PersistenceEntity__Group__3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__UnorderedGroup_3_in_rule__PersistenceEntity__Group__3__Impl835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group__4__Impl_in_rule__PersistenceEntity__Group__4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PersistenceEntity__Group__4__Impl893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_0__0__Impl_in_rule__PersistenceEntity__Group_3_0__0934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_0__1_in_rule__PersistenceEntity__Group_3_0__0937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0_in_rule__PersistenceEntity__Group_3_0__0__Impl964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_0__1__Impl_in_rule__PersistenceEntity__Group_3_0__1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__PersistenceNameAssignment_3_0_1_in_rule__PersistenceEntity__Group_3_0__1__Impl1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_1__0__Impl_in_rule__PersistenceEntity__Group_3_1__01055 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_1__1_in_rule__PersistenceEntity__Group_3_1__01058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PersistenceEntity__Group_3_1__0__Impl1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_1__1__Impl_in_rule__PersistenceEntity__Group_3_1__11117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__IdPropertyAssignment_3_1_1_in_rule__PersistenceEntity__Group_3_1__1__Impl1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__0__Impl_in_rule__Property__Group_0__01178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group_0__1_in_rule__Property__Group_0__01181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Property__Group_0__0__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__1__Impl_in_rule__Property__Group_0__11240 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Property__Group_0__2_in_rule__Property__Group_0__11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_0_1_in_rule__Property__Group_0__1__Impl1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__2__Impl_in_rule__Property__Group_0__21300 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Property__Group_0__3_in_rule__Property__Group_0__21303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Property__Group_0__2__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__3__Impl_in_rule__Property__Group_0__31362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_3__0_in_rule__Property__Group_0__3__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_3__0__Impl_in_rule__Property__Group_0_3__01428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Property__Group_0_3__1_in_rule__Property__Group_0_3__01431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__IsNullableAssignment_0_3_0_in_rule__Property__Group_0_3__0__Impl1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0_3__1__Impl_in_rule__Property__Group_0_3__11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NullableAssignment_0_3_1_in_rule__Property__Group_0_3__1__Impl1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1__0__Impl_in_rule__Property__Group_1__01549 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Property__Group_1__1_in_rule__Property__Group_1__01552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1_0__0_in_rule__Property__Group_1__0__Impl1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1__1__Impl_in_rule__Property__Group_1__11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Property__Group_1__1__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1_0__0__Impl_in_rule__Property__Group_1_0__01672 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Property__Group_1_0__1_in_rule__Property__Group_1_0__01675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Property__Group_1_0__0__Impl1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1_0__1__Impl_in_rule__Property__Group_1_0__11734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__TypeAssignment_1_0_1_in_rule__Property__Group_1_0__1__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__0_in_rule__PersistenceEntity__UnorderedGroup_31796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_0__0_in_rule__PersistenceEntity__UnorderedGroup_3__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__Group_3_1__0_in_rule__PersistenceEntity__UnorderedGroup_3__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__PropertyAssignment_3_2_in_rule__PersistenceEntity__UnorderedGroup_3__Impl2068 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__PropertyAssignment_3_2_in_rule__PersistenceEntity__UnorderedGroup_3__Impl2112 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__Impl_in_rule__PersistenceEntity__UnorderedGroup_3__02178 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__1_in_rule__PersistenceEntity__UnorderedGroup_3__02181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__Impl_in_rule__PersistenceEntity__UnorderedGroup_3__12206 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__2_in_rule__PersistenceEntity__UnorderedGroup_3__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__UnorderedGroup_3__Impl_in_rule__PersistenceEntity__UnorderedGroup_3__22234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__UnorderedGroup__0_in_rule__Property__UnorderedGroup2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_0__0_in_rule__Property__UnorderedGroup__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group_1__0_in_rule__Property__UnorderedGroup__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__UnorderedGroup__Impl_in_rule__Property__UnorderedGroup__02503 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__Property__UnorderedGroup__1_in_rule__Property__UnorderedGroup__02506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__UnorderedGroup__Impl_in_rule__Property__UnorderedGroup__12531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PersistenceModel__NameAssignment_12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_rule__PersistenceModel__PersistenceEntitiesAssignment_32594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PersistenceEntity__NameAssignment_12625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_02661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PersistenceEntity__PersistenceNameAssignment_3_0_12700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PersistenceEntity__IdPropertyAssignment_3_1_12731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__PersistenceEntity__PropertyAssignment_3_22762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__NameAssignment_0_12793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Property__IsNullableAssignment_0_3_02829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Property__NullableAssignment_0_3_12868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TYPE_in_rule__Property__TypeAssignment_1_0_12899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PersistenceEntity__PropertyAssignment_3_2_in_synpred1_InternalPersistence2109 = new BitSet(new long[]{0x0000000000000002L});

}
