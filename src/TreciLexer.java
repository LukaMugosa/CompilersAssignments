// Generated from .\Treci.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TreciLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_IME_ILI_PREZIME_ILI_BOJA=1, T_JMBG=2, T_DOUBLE=3, HASH=4, NL=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_IME_ILI_PREZIME_ILI_BOJA", "T_JMBG", "T_DOUBLE", "HASH", "NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'#'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_IME_ILI_PREZIME_ILI_BOJA", "T_JMBG", "T_DOUBLE", "HASH", "NL", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TreciLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Treci.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\65\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\21\n\2\r\2\16\2\22\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4$\n\4\r"+
		"\4\16\4%\3\4\3\4\6\4*\n\4\r\4\16\4+\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\2"+
		"\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\5\4\2C\\c|\3\2\62;\5\2\13\13\17\17\""+
		"\"\2\67\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\3\20\3\2\2\2\5\24\3\2\2\2\7#\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2"+
		"\r\61\3\2\2\2\17\21\t\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2"+
		"\22\23\3\2\2\2\23\4\3\2\2\2\24\25\t\3\2\2\25\26\t\3\2\2\26\27\t\3\2\2"+
		"\27\30\t\3\2\2\30\31\t\3\2\2\31\32\t\3\2\2\32\33\t\3\2\2\33\34\t\3\2\2"+
		"\34\35\t\3\2\2\35\36\t\3\2\2\36\37\t\3\2\2\37 \t\3\2\2 !\t\3\2\2!\6\3"+
		"\2\2\2\"$\t\3\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2"+
		"\')\7\60\2\2(*\t\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\b\3\2"+
		"\2\2-.\7%\2\2.\n\3\2\2\2/\60\7\f\2\2\60\f\3\2\2\2\61\62\t\4\2\2\62\63"+
		"\3\2\2\2\63\64\b\7\2\2\64\16\3\2\2\2\6\2\22%+\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}