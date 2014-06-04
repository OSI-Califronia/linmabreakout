package de.linma.breakout.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.linma.breakout.services.PersistenceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistenceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BOOLEAN", "RULE_TYPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PersistenceModel'", "'{'", "'}'", "'PersistenceEntity'", "'persistenceName'", "'idProperty'", "'Property'", "'isNullable'", "'type'"
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
    public String getGrammarFileName() { return "../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g"; }



     	private PersistenceGrammarAccess grammarAccess;
     	
        public InternalPersistenceParser(TokenStream input, PersistenceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PersistenceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:76:1: ruleModel returns [EObject current=null] : this_PersistenceModel_0= rulePersistenceModel ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_PersistenceModel_0 = null;


         enterRule(); 
            
        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:79:28: (this_PersistenceModel_0= rulePersistenceModel )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:81:5: this_PersistenceModel_0= rulePersistenceModel
            {
             
                    newCompositeNode(grammarAccess.getModelAccess().getPersistenceModelParserRuleCall()); 
                
            pushFollow(FOLLOW_rulePersistenceModel_in_ruleModel131);
            this_PersistenceModel_0=rulePersistenceModel();

            state._fsp--;

             
                    current = this_PersistenceModel_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePersistenceModel"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:97:1: entryRulePersistenceModel returns [EObject current=null] : iv_rulePersistenceModel= rulePersistenceModel EOF ;
    public final EObject entryRulePersistenceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceModel = null;


        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:98:2: (iv_rulePersistenceModel= rulePersistenceModel EOF )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:99:2: iv_rulePersistenceModel= rulePersistenceModel EOF
            {
             newCompositeNode(grammarAccess.getPersistenceModelRule()); 
            pushFollow(FOLLOW_rulePersistenceModel_in_entryRulePersistenceModel165);
            iv_rulePersistenceModel=rulePersistenceModel();

            state._fsp--;

             current =iv_rulePersistenceModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceModel175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersistenceModel"


    // $ANTLR start "rulePersistenceModel"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:106:1: rulePersistenceModel returns [EObject current=null] : (otherlv_0= 'PersistenceModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )* otherlv_4= '}' ) ;
    public final EObject rulePersistenceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_persistenceEntities_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:109:28: ( (otherlv_0= 'PersistenceModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )* otherlv_4= '}' ) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:110:1: (otherlv_0= 'PersistenceModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )* otherlv_4= '}' )
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:110:1: (otherlv_0= 'PersistenceModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )* otherlv_4= '}' )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:110:3: otherlv_0= 'PersistenceModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulePersistenceModel212); 

                	newLeafNode(otherlv_0, grammarAccess.getPersistenceModelAccess().getPersistenceModelKeyword_0());
                
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:114:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:115:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:115:1: (lv_name_1_0= RULE_ID )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:116:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersistenceModel229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPersistenceModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersistenceModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePersistenceModel246); 

                	newLeafNode(otherlv_2, grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:136:1: ( (lv_persistenceEntities_3_0= rulePersistenceEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:137:1: (lv_persistenceEntities_3_0= rulePersistenceEntity )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:137:1: (lv_persistenceEntities_3_0= rulePersistenceEntity )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:138:3: lv_persistenceEntities_3_0= rulePersistenceEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePersistenceEntity_in_rulePersistenceModel267);
            	    lv_persistenceEntities_3_0=rulePersistenceEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersistenceModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"persistenceEntities",
            	            		lv_persistenceEntities_3_0, 
            	            		"PersistenceEntity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePersistenceModel280); 

                	newLeafNode(otherlv_4, grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersistenceModel"


    // $ANTLR start "entryRulePersistenceEntity"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:166:1: entryRulePersistenceEntity returns [EObject current=null] : iv_rulePersistenceEntity= rulePersistenceEntity EOF ;
    public final EObject entryRulePersistenceEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersistenceEntity = null;


        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:167:2: (iv_rulePersistenceEntity= rulePersistenceEntity EOF )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:168:2: iv_rulePersistenceEntity= rulePersistenceEntity EOF
            {
             newCompositeNode(grammarAccess.getPersistenceEntityRule()); 
            pushFollow(FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity316);
            iv_rulePersistenceEntity=rulePersistenceEntity();

            state._fsp--;

             current =iv_rulePersistenceEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersistenceEntity326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersistenceEntity"


    // $ANTLR start "rulePersistenceEntity"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:175:1: rulePersistenceEntity returns [EObject current=null] : (otherlv_0= 'PersistenceEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) ) ) otherlv_9= '}' ) ;
    public final EObject rulePersistenceEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_hasPersistenceName_4_0=null;
        Token lv_persistenceName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_idProperty_7_0 = null;

        EObject lv_property_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:178:28: ( (otherlv_0= 'PersistenceEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) ) ) otherlv_9= '}' ) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:179:1: (otherlv_0= 'PersistenceEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) ) ) otherlv_9= '}' )
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:179:1: (otherlv_0= 'PersistenceEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) ) ) otherlv_9= '}' )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:179:3: otherlv_0= 'PersistenceEntity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePersistenceEntity363); 

                	newLeafNode(otherlv_0, grammarAccess.getPersistenceEntityAccess().getPersistenceEntityKeyword_0());
                
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:183:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:184:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:184:1: (lv_name_1_0= RULE_ID )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:185:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePersistenceEntity380); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPersistenceEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_rulePersistenceEntity397); 

                	newLeafNode(otherlv_2, grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:205:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) ) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:207:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) )
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:207:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:208:2: ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            	
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:211:2: ( ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?)
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:212:3: ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+ {...}?
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:212:3: ( ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( (LA3_0==19||LA3_0==21) && getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:214:4: ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:214:4: ({...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:215:5: {...}? => ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:215:114: ( ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:216:6: ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:219:6: ({...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:219:7: {...}? => ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceEntity", "true");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:219:16: ( ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:219:17: ( (lv_hasPersistenceName_4_0= 'persistenceName' ) ) ( (lv_persistenceName_5_0= RULE_STRING ) )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:219:17: ( (lv_hasPersistenceName_4_0= 'persistenceName' ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:220:1: (lv_hasPersistenceName_4_0= 'persistenceName' )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:220:1: (lv_hasPersistenceName_4_0= 'persistenceName' )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:221:3: lv_hasPersistenceName_4_0= 'persistenceName'
            	    {
            	    lv_hasPersistenceName_4_0=(Token)match(input,17,FOLLOW_17_in_rulePersistenceEntity461); 

            	            newLeafNode(lv_hasPersistenceName_4_0, grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPersistenceEntityRule());
            	    	        }
            	           		setWithLastConsumed(current, "hasPersistenceName", true, "persistenceName");
            	    	    

            	    }


            	    }

            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:234:2: ( (lv_persistenceName_5_0= RULE_STRING ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:235:1: (lv_persistenceName_5_0= RULE_STRING )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:235:1: (lv_persistenceName_5_0= RULE_STRING )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:236:3: lv_persistenceName_5_0= RULE_STRING
            	    {
            	    lv_persistenceName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePersistenceEntity491); 

            	    			newLeafNode(lv_persistenceName_5_0, grammarAccess.getPersistenceEntityAccess().getPersistenceNameSTRINGTerminalRuleCall_3_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPersistenceEntityRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"persistenceName",
            	            		lv_persistenceName_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:259:4: ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:259:4: ({...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:260:5: {...}? => ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:260:114: ( ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:261:6: ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:264:6: ({...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:264:7: {...}? => (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceEntity", "true");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:264:16: (otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:264:18: otherlv_6= 'idProperty' ( (lv_idProperty_7_0= ruleProperty ) )
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePersistenceEntity564); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPersistenceEntityAccess().getIdPropertyKeyword_3_1_0());
            	        
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:268:1: ( (lv_idProperty_7_0= ruleProperty ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:269:1: (lv_idProperty_7_0= ruleProperty )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:269:1: (lv_idProperty_7_0= ruleProperty )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:270:3: lv_idProperty_7_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPersistenceEntityAccess().getIdPropertyPropertyParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePersistenceEntity585);
            	    lv_idProperty_7_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPersistenceEntityRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"idProperty",
            	            		lv_idProperty_7_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:293:4: ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:293:4: ({...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:294:5: {...}? => ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePersistenceEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:294:114: ( ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+ )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:295:6: ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:298:6: ({...}? => ( (lv_property_8_0= ruleProperty ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==19) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }
            	        else if ( (LA2_0==21) ) {
            	            int LA2_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:298:7: {...}? => ( (lv_property_8_0= ruleProperty ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePersistenceEntity", "true");
            	    	    }
            	    	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:298:16: ( (lv_property_8_0= ruleProperty ) )
            	    	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:299:1: (lv_property_8_0= ruleProperty )
            	    	    {
            	    	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:299:1: (lv_property_8_0= ruleProperty )
            	    	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:300:3: lv_property_8_0= ruleProperty
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getPersistenceEntityAccess().getPropertyPropertyParserRuleCall_3_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleProperty_in_rulePersistenceEntity661);
            	    	    lv_property_8_0=ruleProperty();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getPersistenceEntityRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"property",
            	    	            		lv_property_8_0, 
            	    	            		"Property");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rulePersistenceEntity", "getUnorderedGroupHelper().canLeave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
            	

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_rulePersistenceEntity720); 

                	newLeafNode(otherlv_9, grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersistenceEntity"


    // $ANTLR start "entryRuleProperty"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:343:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:344:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:345:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty756);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty766); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:352:1: ruleProperty returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_isNullable_4_0=null;
        Token lv_nullable_5_0=null;
        Token otherlv_6=null;
        Token lv_type_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:355:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:356:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:356:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:358:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:358:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:359:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPropertyAccess().getUnorderedGroup());
            	
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:362:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:363:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:363:3: ( ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    int LA5_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==21) ) {
                    int LA5_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1) ) {
                        alt5=2;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:365:4: ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:365:4: ({...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:366:5: {...}? => ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:366:103: ( ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:367:6: ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:370:6: ({...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:370:7: {...}? => (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:370:16: (otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )? )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:370:18: otherlv_1= 'Property' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleProperty848); 

            	        	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_0_0());
            	        
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:374:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:375:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:375:1: (lv_name_2_0= RULE_ID )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:376:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty865); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleProperty882); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_0_2());
            	        
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:396:1: ( ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) ) )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==20) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:396:2: ( (lv_isNullable_4_0= 'isNullable' ) ) ( (lv_nullable_5_0= RULE_BOOLEAN ) )
            	            {
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:396:2: ( (lv_isNullable_4_0= 'isNullable' ) )
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:397:1: (lv_isNullable_4_0= 'isNullable' )
            	            {
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:397:1: (lv_isNullable_4_0= 'isNullable' )
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:398:3: lv_isNullable_4_0= 'isNullable'
            	            {
            	            lv_isNullable_4_0=(Token)match(input,20,FOLLOW_20_in_ruleProperty901); 

            	                    newLeafNode(lv_isNullable_4_0, grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPropertyRule());
            	            	        }
            	                   		setWithLastConsumed(current, "isNullable", true, "isNullable");
            	            	    

            	            }


            	            }

            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:411:2: ( (lv_nullable_5_0= RULE_BOOLEAN ) )
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:412:1: (lv_nullable_5_0= RULE_BOOLEAN )
            	            {
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:412:1: (lv_nullable_5_0= RULE_BOOLEAN )
            	            // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:413:3: lv_nullable_5_0= RULE_BOOLEAN
            	            {
            	            lv_nullable_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleProperty931); 

            	            			newLeafNode(lv_nullable_5_0, grammarAccess.getPropertyAccess().getNullableBOOLEANTerminalRuleCall_0_3_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getPropertyRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"nullable",
            	                    		lv_nullable_5_0, 
            	                    		"BOOLEAN");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:436:4: ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:436:4: ({...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:437:5: {...}? => ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:437:103: ( ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:438:6: ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:441:6: ({...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:441:7: {...}? => ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:441:16: ( (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}' )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:441:17: (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) ) otherlv_8= '}'
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:441:17: (otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:441:19: otherlv_6= 'type' ( (lv_type_7_0= RULE_TYPE ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleProperty1007); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getTypeKeyword_1_0_0());
            	        
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:445:1: ( (lv_type_7_0= RULE_TYPE ) )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:446:1: (lv_type_7_0= RULE_TYPE )
            	    {
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:446:1: (lv_type_7_0= RULE_TYPE )
            	    // ../de.linma.breakout.generated/src-gen/de/linma/breakout/parser/antlr/internal/InternalPersistence.g:447:3: lv_type_7_0= RULE_TYPE
            	    {
            	    lv_type_7_0=(Token)match(input,RULE_TYPE,FOLLOW_RULE_TYPE_in_ruleProperty1024); 

            	    			newLeafNode(lv_type_7_0, grammarAccess.getPropertyAccess().getTypeTYPETerminalRuleCall_1_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"type",
            	            		lv_type_7_0, 
            	            		"TYPE");
            	    	    

            	    }


            	    }


            	    }

            	    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleProperty1042); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_1_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPropertyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canLeave(grammarAccess.getPropertyAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPropertyAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceModel_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceModel_in_entryRulePersistenceModel165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceModel175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePersistenceModel212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersistenceModel229 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePersistenceModel246 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_rulePersistenceModel267 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePersistenceModel280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePersistenceEntity_in_entryRulePersistenceEntity316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersistenceEntity326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePersistenceEntity363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePersistenceEntity380 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePersistenceEntity397 = new BitSet(new long[]{0x00000000002E0000L});
    public static final BitSet FOLLOW_17_in_rulePersistenceEntity461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePersistenceEntity491 = new BitSet(new long[]{0x00000000002E8000L});
    public static final BitSet FOLLOW_18_in_rulePersistenceEntity564 = new BitSet(new long[]{0x00000000002E0000L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePersistenceEntity585 = new BitSet(new long[]{0x00000000002E8000L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePersistenceEntity661 = new BitSet(new long[]{0x00000000002E8000L});
    public static final BitSet FOLLOW_15_in_rulePersistenceEntity720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleProperty848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty865 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProperty882 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_20_in_ruleProperty901 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleProperty931 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_21_in_ruleProperty1007 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TYPE_in_ruleProperty1024 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProperty1042 = new BitSet(new long[]{0x0000000000280002L});

}
