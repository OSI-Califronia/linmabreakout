package de.linma.breakout.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPersistenceLexer extends Lexer {
    public static final int T__19=19;
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int RULE_TYPE=7;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__20=20;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators

    public InternalPersistenceLexer() {;} 
    public InternalPersistenceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPersistenceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:11:7: ( 'PersistenceModel' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:11:9: 'PersistenceModel'
            {
            match("PersistenceModel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:12:7: ( '{' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:13:7: ( '}' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:14:7: ( 'PersistenceEntity' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:14:9: 'PersistenceEntity'
            {
            match("PersistenceEntity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:15:7: ( 'idProperty' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:15:9: 'idProperty'
            {
            match("idProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:16:7: ( 'Property' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:16:9: 'Property'
            {
            match("Property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:17:7: ( 'type' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:17:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:18:7: ( 'persistenceName' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:18:9: 'persistenceName'
            {
            match("persistenceName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:19:7: ( 'isNullable' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:19:9: 'isNullable'
            {
            match("isNullable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1346:11: ( ( 'String' | 'Boolean' | 'Integer' | 'Byte' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1346:13: ( 'String' | 'Boolean' | 'Integer' | 'Byte' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1346:13: ( 'String' | 'Boolean' | 'Integer' | 'Byte' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt1=1;
                }
                break;
            case 'B':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='o') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='y') ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'I':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1346:14: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 2 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1346:23: 'Boolean'
                    {
                    match("Boolean"); 


                    }
                    break;
                case 3 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1346:33: 'Integer'
                    {
                    match("Integer"); 


                    }
                    break;
                case 4 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1346:43: 'Byte'
                    {
                    match("Byte"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1348:14: ( ( 'true' | 'false' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1348:16: ( 'true' | 'false' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1348:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1348:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1348:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1350:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1350:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1350:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1350:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1350:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1352:10: ( ( '0' .. '9' )+ )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1352:12: ( '0' .. '9' )+
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1352:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1352:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1354:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1356:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1356:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1356:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1356:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:41: ( '\\r' )? '\\n'
                    {
                    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1358:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1360:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1360:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1360:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1362:16: ( . )
            // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1362:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_TYPE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=18;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:64: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 11 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:74: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 12 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:87: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:95: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:104: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:116: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:132: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:148: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../de.linma.breakout.generated.ui/src-gen/de/linma/breakout/ui/contentassist/antlr/internal/InternalPersistence.g:1:156: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\25\2\uffff\7\25\1\22\2\uffff\3\22\2\uffff\2\25\3\uffff"+
        "\12\25\5\uffff\20\25\1\103\1\104\3\25\1\110\6\25\2\uffff\3\25\1"+
        "\uffff\1\25\1\104\5\25\1\110\7\25\2\110\1\25\1\140\4\25\1\uffff"+
        "\4\25\1\151\1\152\2\25\2\uffff\14\25\1\172\1\173\1\25\2\uffff\1"+
        "\175\1\uffff";
    static final String DFA14_eofS =
        "\176\uffff";
    static final String DFA14_minS =
        "\1\0\1\145\2\uffff\1\144\1\162\1\145\1\164\1\157\1\156\1\141\1"+
        "\101\2\uffff\2\0\1\52\2\uffff\1\162\1\157\3\uffff\1\120\1\116\1"+
        "\160\1\165\2\162\1\157\2\164\1\154\5\uffff\1\163\1\160\1\162\1\165"+
        "\2\145\1\163\1\151\1\154\2\145\1\163\1\151\1\145\1\157\1\154\2\60"+
        "\1\151\1\156\1\145\1\60\1\147\1\145\1\163\1\162\1\160\1\154\2\uffff"+
        "\1\163\1\147\1\141\1\uffff\1\145\1\60\2\164\1\145\1\141\1\164\1"+
        "\60\1\156\1\162\1\145\1\171\1\162\1\142\1\145\2\60\1\156\1\60\1"+
        "\164\1\154\1\156\1\143\1\uffff\1\171\1\145\1\143\1\145\2\60\1\145"+
        "\1\105\2\uffff\1\116\1\157\1\156\1\141\1\144\1\164\1\155\1\145\1"+
        "\151\1\145\1\154\1\164\2\60\1\171\2\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\162\2\uffff\1\163\1\171\1\145\1\164\1\171\1\156\1\141"+
        "\1\172\2\uffff\2\uffff\1\57\2\uffff\1\162\1\157\3\uffff\1\120\1"+
        "\116\1\160\1\165\2\162\1\157\2\164\1\154\5\uffff\1\163\1\160\1\162"+
        "\1\165\2\145\1\163\1\151\1\154\2\145\1\163\1\151\1\145\1\157\1\154"+
        "\2\172\1\151\1\156\1\145\1\172\1\147\1\145\1\163\1\162\1\160\1\154"+
        "\2\uffff\1\163\1\147\1\141\1\uffff\1\145\1\172\2\164\1\145\1\141"+
        "\1\164\1\172\1\156\1\162\1\145\1\171\1\162\1\142\1\145\2\172\1\156"+
        "\1\172\1\164\1\154\1\156\1\143\1\uffff\1\171\1\145\1\143\1\145\2"+
        "\172\1\145\1\115\2\uffff\1\116\1\157\1\156\1\141\1\144\1\164\1\155"+
        "\1\145\1\151\1\145\1\154\1\164\2\172\1\171\2\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\10\uffff\1\14\1\15\3\uffff\1\21\1\22\2\uffff\1"+
        "\14\1\2\1\3\12\uffff\1\15\1\16\1\17\1\20\1\21\34\uffff\1\7\1\13"+
        "\3\uffff\1\12\27\uffff\1\6\10\uffff\1\5\1\11\17\uffff\1\10\1\1\1"+
        "\uffff\1\4";
    static final String DFA14_specialS =
        "\1\1\15\uffff\1\0\1\2\156\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\22\1\16\4\22\1\17\7\22\1"+
            "\20\12\15\7\22\1\14\1\10\6\14\1\11\6\14\1\1\2\14\1\7\7\14\3"+
            "\22\1\13\1\14\1\22\5\14\1\12\2\14\1\4\6\14\1\6\3\14\1\5\6\14"+
            "\1\2\1\22\1\3\uff82\22",
            "\1\23\14\uffff\1\24",
            "",
            "",
            "\1\30\16\uffff\1\31",
            "\1\33\6\uffff\1\32",
            "\1\34",
            "\1\35",
            "\1\36\11\uffff\1\37",
            "\1\40",
            "\1\41",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\0\43",
            "\0\43",
            "\1\44\4\uffff\1\45",
            "",
            "",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\137",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\153",
            "\1\155\7\uffff\1\154",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\174",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_TYPE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( ((LA14_14>='\u0000' && LA14_14<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='P') ) {s = 1;}

                        else if ( (LA14_0=='{') ) {s = 2;}

                        else if ( (LA14_0=='}') ) {s = 3;}

                        else if ( (LA14_0=='i') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='p') ) {s = 6;}

                        else if ( (LA14_0=='S') ) {s = 7;}

                        else if ( (LA14_0=='B') ) {s = 8;}

                        else if ( (LA14_0=='I') ) {s = 9;}

                        else if ( (LA14_0=='f') ) {s = 10;}

                        else if ( (LA14_0=='^') ) {s = 11;}

                        else if ( (LA14_0=='A'||(LA14_0>='C' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 12;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 13;}

                        else if ( (LA14_0=='\"') ) {s = 14;}

                        else if ( (LA14_0=='\'') ) {s = 15;}

                        else if ( (LA14_0=='/') ) {s = 16;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 17;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 35;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}