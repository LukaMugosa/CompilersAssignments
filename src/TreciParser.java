// Generated from .\Treci.g4 by ANTLR 4.9.2

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TreciParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_IME_ILI_PREZIME_ILI_BOJA=1, T_JMBG=2, T_DOUBLE=3, HASH=4, NL=5, WS=6;
	public static final int
		RULE_prog = 0, RULE_rows = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "rows"
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

	@Override
	public String getGrammarFileName() { return "Treci.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    class Korisnik{
	        public String ime;
	        public String prezime;
	        public String jmbg;
	        public double cijena;
	        public String boja;
	        public int brojKupovina = 1;
	        public Korisnik(){}

	        public String toString(){
	            return "\n Ime: " + this.ime +
	                    "\n Prezime: " + this.prezime +
	                    "\n JMBG: " + this.jmbg +
	                    "\n Cijena: " + this.cijena +
	                    "\n Broj kupovina: " + this.brojKupovina +
	                    "\n Boja: " + this.boja;
	        }
	    }
	    List<Korisnik> korisnici = new ArrayList<Korisnik>();

	public TreciParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<RowsContext> rows() {
			return getRuleContexts(RowsContext.class);
		}
		public RowsContext rows(int i) {
			return getRuleContext(RowsContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreciListener ) ((TreciListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreciListener ) ((TreciListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				rows();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_IME_ILI_PREZIME_ILI_BOJA );
			}
			_ctx.stop = _input.LT(-1);

			        korisnici.forEach((newKorisnik) -> {
			            System.out.println(newKorisnik);
			        });
			    
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowsContext extends ParserRuleContext {
		public Token T_IME_ILI_PREZIME_ILI_BOJA;
		public Token T_JMBG;
		public Token T_DOUBLE;
		public List<TerminalNode> T_IME_ILI_PREZIME_ILI_BOJA() { return getTokens(TreciParser.T_IME_ILI_PREZIME_ILI_BOJA); }
		public TerminalNode T_IME_ILI_PREZIME_ILI_BOJA(int i) {
			return getToken(TreciParser.T_IME_ILI_PREZIME_ILI_BOJA, i);
		}
		public List<TerminalNode> HASH() { return getTokens(TreciParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(TreciParser.HASH, i);
		}
		public TerminalNode T_JMBG() { return getToken(TreciParser.T_JMBG, 0); }
		public TerminalNode T_DOUBLE() { return getToken(TreciParser.T_DOUBLE, 0); }
		public TerminalNode NL() { return getToken(TreciParser.NL, 0); }
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreciListener ) ((TreciListener)listener).enterRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreciListener ) ((TreciListener)listener).exitRows(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		RowsContext _localctx = new RowsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rows);

		        Korisnik newKorisnik = new Korisnik();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA = match(T_IME_ILI_PREZIME_ILI_BOJA);

			        System.out.println((((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA!=null?((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA.getText():null));
			        newKorisnik.ime = (((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA!=null?((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA.getText():null);
			    
			setState(11);
			match(HASH);

			        System.out.println("Naletio na hash");
			    
			setState(13);
			((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA = match(T_IME_ILI_PREZIME_ILI_BOJA);

			        System.out.println((((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA!=null?((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA.getText():null));
			        newKorisnik.prezime = (((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA!=null?((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA.getText():null);
			    
			setState(15);
			match(HASH);

			        System.out.println("Naletio na hash");
			    
			setState(17);
			((RowsContext)_localctx).T_JMBG = match(T_JMBG);

			        System.out.println((((RowsContext)_localctx).T_JMBG!=null?((RowsContext)_localctx).T_JMBG.getText():null));
			        newKorisnik.jmbg = (((RowsContext)_localctx).T_JMBG!=null?((RowsContext)_localctx).T_JMBG.getText():null);
			    
			setState(19);
			match(HASH);

			        System.out.println("Naletio na hash");
			    
			setState(21);
			((RowsContext)_localctx).T_DOUBLE = match(T_DOUBLE);

			        System.out.println((((RowsContext)_localctx).T_DOUBLE!=null?((RowsContext)_localctx).T_DOUBLE.getText():null));
			        newKorisnik.cijena = Double.parseDouble((((RowsContext)_localctx).T_DOUBLE!=null?((RowsContext)_localctx).T_DOUBLE.getText():null));
			    
			setState(23);
			match(HASH);

			        System.out.println("Naletio na hash");
			    
			setState(25);
			((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA = match(T_IME_ILI_PREZIME_ILI_BOJA);

			        System.out.println((((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA!=null?((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA.getText():null));
			        newKorisnik.boja = (((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA!=null?((RowsContext)_localctx).T_IME_ILI_PREZIME_ILI_BOJA.getText():null);
			    
			setState(27);
			match(NL);
			setState(28);
			rows();
			}
			_ctx.stop = _input.LT(-1);

			        boolean nePostoji = true;
			        for(Korisnik korisnik : korisnici) {
			            if(korisnik.jmbg.equals(newKorisnik.jmbg)){
			                System.out.println("postoji");
			                korisnik.cijena += newKorisnik.cijena;
			                korisnik.brojKupovina += 1;
			                nePostoji = false;
			                break;
			            }
			        }
			        if(nePostoji){
			            System.out.println("ne postoji");
			            korisnici.add(newKorisnik);
			        }
			    
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b!\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\37\2\7"+
		"\3\2\2\2\4\13\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2"+
		"\t\n\3\2\2\2\n\3\3\2\2\2\13\f\7\3\2\2\f\r\b\3\1\2\r\16\7\6\2\2\16\17\b"+
		"\3\1\2\17\20\7\3\2\2\20\21\b\3\1\2\21\22\7\6\2\2\22\23\b\3\1\2\23\24\7"+
		"\4\2\2\24\25\b\3\1\2\25\26\7\6\2\2\26\27\b\3\1\2\27\30\7\5\2\2\30\31\b"+
		"\3\1\2\31\32\7\6\2\2\32\33\b\3\1\2\33\34\7\3\2\2\34\35\b\3\1\2\35\36\7"+
		"\7\2\2\36\37\5\4\3\2\37\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}