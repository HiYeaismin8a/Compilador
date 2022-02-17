/* The following code was generated by JFlex 1.4.3 on 26/06/21 14:31 */

package codigo;
import java_cup.runtime.Symbol;
import codigo.JFprincipal;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 26/06/21 14:31 from the specification file
 * <tt>D:/ITT/Lenguajes y Automatas/V14/Analizador lexico/src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 44, 45,  0,  0, 44,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    44,  0,  0, 33,  0,  0,  0,  0, 38, 39, 37, 28, 36, 27, 29, 35, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 34, 46, 30, 32, 31,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 42,  0, 43,  0, 22, 
     0,  6, 16,  5, 10,  9, 24, 21, 18,  3,  1,  1, 19, 12,  4, 11, 
    15, 25,  7, 20, 14, 17,  8,  1, 23, 26, 13, 40,  0, 41,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\16\2\1\1\1\2\1\4"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\2\1\27\21\2\1\30\3\2\1\31"+
    "\3\2\1\32\1\33\1\32\1\34\1\35\1\24\1\36"+
    "\1\37\1\3\1\26\20\2\1\40\1\41\7\2\1\42"+
    "\4\2\1\43\4\2\1\32\1\0\13\2\1\44\3\2"+
    "\1\45\6\2\1\46\13\2\1\0\4\2\1\47\1\50"+
    "\3\2\1\51\12\2\1\52\16\2\1\24\11\2\1\53"+
    "\5\2\1\54\1\55\1\56\2\2\1\57\5\2\1\60"+
    "\1\61\3\2\1\62\1\2\1\63\5\2\1\64\1\65"+
    "\1\66\1\2\1\67\1\70\3\2\1\71\1\72\1\2"+
    "\1\73\1\2\1\74\1\75\2\2\1\76\4\2\1\77"+
    "\1\2\1\100\3\2\1\101\1\102\10\2\1\103\4\2"+
    "\1\104\1\105\1\106\1\107\1\110\2\2\1\111\5\2"+
    "\1\112";

  private static int [] zzUnpackAction() {
    int [] result = new int[281];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03ac\0\57\0\u03db"+
    "\0\u040a\0\u0439\0\57\0\u0468\0\57\0\u0497\0\57\0\57"+
    "\0\57\0\57\0\57\0\57\0\u04c6\0\u04f5\0\u0524\0\u0553"+
    "\0\136\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c"+
    "\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814"+
    "\0\u0843\0\u0872\0\136\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d"+
    "\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a19\0\u0a19\0\u0a77"+
    "\0\u0aa6\0\57\0\u0524\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91"+
    "\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09"+
    "\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4\0\136\0\u0e23\0\u0e52"+
    "\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\136\0\u0f6c\0\u0f9b"+
    "\0\u0fca\0\u0ff9\0\136\0\u1028\0\u1057\0\u1086\0\u10b5\0\u0a19"+
    "\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0\0\u11cf\0\u11fe\0\u122d"+
    "\0\u125c\0\u128b\0\u12ba\0\u12e9\0\136\0\u1318\0\u1347\0\u1376"+
    "\0\136\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490\0\136"+
    "\0\u14bf\0\u14ee\0\u151d\0\u154c\0\u157b\0\u15aa\0\u15d9\0\u1608"+
    "\0\u1637\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u1722\0\u1751\0\u1780"+
    "\0\136\0\136\0\u17af\0\u17de\0\u180d\0\136\0\u183c\0\u186b"+
    "\0\u189a\0\u18c9\0\u18f8\0\u1927\0\u1956\0\u1985\0\u19b4\0\u19e3"+
    "\0\136\0\u1a12\0\u1a41\0\u1a70\0\u1a9f\0\u1ace\0\u1afd\0\u1b2c"+
    "\0\u1b5b\0\u1b8a\0\u1bb9\0\u1be8\0\u1c17\0\u1c46\0\u1c75\0\57"+
    "\0\u1ca4\0\u1cd3\0\u1d02\0\u1d31\0\u1d60\0\u1d8f\0\u1dbe\0\u1ded"+
    "\0\u1e1c\0\136\0\u1e4b\0\u1e7a\0\u1ea9\0\u1ed8\0\u1f07\0\136"+
    "\0\136\0\136\0\u1f36\0\u1f65\0\136\0\u1f94\0\u1fc3\0\u1ff2"+
    "\0\u2021\0\u2050\0\136\0\136\0\u207f\0\u20ae\0\u20dd\0\136"+
    "\0\u210c\0\136\0\u213b\0\u216a\0\u2199\0\u21c8\0\u21f7\0\136"+
    "\0\136\0\136\0\u2226\0\136\0\136\0\u2255\0\u2284\0\u22b3"+
    "\0\136\0\136\0\u22e2\0\136\0\u2311\0\136\0\136\0\u2340"+
    "\0\u236f\0\136\0\u239e\0\u23cd\0\u23fc\0\u242b\0\136\0\u245a"+
    "\0\136\0\u2489\0\u24b8\0\u24e7\0\136\0\136\0\u2516\0\u2545"+
    "\0\u2574\0\u25a3\0\u25d2\0\u2601\0\u2630\0\u265f\0\136\0\u268e"+
    "\0\u26bd\0\u26ec\0\u271b\0\136\0\136\0\136\0\u274a\0\136"+
    "\0\u2779\0\u27a8\0\136\0\u27d7\0\u2806\0\u2835\0\u2864\0\u2893"+
    "\0\136";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[281];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"+
    "\1\11\1\12\1\13\1\3\1\14\1\3\1\15\1\16"+
    "\2\3\1\17\1\20\1\21\1\22\1\23\1\3\1\24"+
    "\2\3\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\27\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\2\45\1\2\60\0\32\3\25\0\1\46"+
    "\1\4\23\46\1\0\4\46\2\0\1\47\22\0\3\3"+
    "\1\50\26\3\25\0\12\3\1\51\17\3\25\0\12\3"+
    "\1\52\17\3\25\0\2\3\1\53\5\3\1\54\7\3"+
    "\1\55\11\3\25\0\5\3\1\56\4\3\1\57\17\3"+
    "\25\0\13\3\1\60\16\3\25\0\10\3\1\61\7\3"+
    "\1\62\11\3\25\0\2\3\1\63\2\3\1\64\2\3"+
    "\1\65\7\3\1\66\11\3\25\0\2\3\1\67\5\3"+
    "\1\70\21\3\25\0\5\3\1\71\4\3\1\72\17\3"+
    "\25\0\6\3\1\73\11\3\1\74\11\3\25\0\2\3"+
    "\1\75\15\3\1\76\11\3\25\0\2\3\1\77\5\3"+
    "\1\100\21\3\25\0\6\3\1\101\23\3\25\0\1\46"+
    "\1\0\23\46\1\0\4\46\25\0\10\3\1\102\21\3"+
    "\26\0\1\4\112\0\1\103\1\0\1\104\55\0\1\105"+
    "\1\106\56\0\1\107\61\0\1\110\1\0\1\111\54\0"+
    "\1\112\67\0\2\45\2\0\32\46\25\0\1\46\1\113"+
    "\23\46\1\0\4\46\2\0\1\114\22\0\2\3\1\115"+
    "\1\3\1\116\2\3\1\117\22\3\25\0\3\3\1\120"+
    "\2\3\1\121\4\3\1\122\16\3\25\0\10\3\1\123"+
    "\21\3\25\0\16\3\1\124\13\3\25\0\15\3\1\125"+
    "\14\3\25\0\21\3\1\126\10\3\25\0\22\3\1\127"+
    "\7\3\25\0\16\3\1\130\13\3\25\0\4\3\1\131"+
    "\1\3\1\132\6\3\1\133\14\3\25\0\6\3\1\134"+
    "\23\3\25\0\3\3\1\135\26\3\25\0\23\3\1\136"+
    "\2\3\1\137\3\3\25\0\3\3\1\140\26\3\25\0"+
    "\23\3\1\141\6\3\25\0\16\3\1\142\13\3\25\0"+
    "\6\3\1\143\4\3\1\144\16\3\25\0\20\3\1\145"+
    "\11\3\25\0\6\3\1\146\14\3\1\147\6\3\25\0"+
    "\13\3\1\150\16\3\25\0\30\3\1\151\1\3\25\0"+
    "\13\3\1\152\1\153\15\3\25\0\10\3\1\154\21\3"+
    "\25\0\4\3\1\155\25\3\25\0\5\3\1\156\24\3"+
    "\25\0\6\3\1\157\23\3\62\0\1\103\1\0\1\160"+
    "\56\0\1\160\55\0\1\105\1\160\16\0\55\110\1\0"+
    "\1\110\1\0\25\161\1\0\14\161\3\0\11\161\1\0"+
    "\1\46\1\114\23\46\1\0\4\46\2\0\1\114\22\0"+
    "\4\3\1\162\25\3\25\0\6\3\1\163\23\3\25\0"+
    "\10\3\1\164\21\3\25\0\15\3\1\165\14\3\25\0"+
    "\11\3\1\166\20\3\25\0\10\3\1\167\5\3\1\170"+
    "\13\3\25\0\24\3\1\171\5\3\25\0\6\3\1\172"+
    "\1\3\1\173\21\3\25\0\2\3\1\174\27\3\25\0"+
    "\12\3\1\175\17\3\25\0\20\3\1\176\11\3\25\0"+
    "\10\3\1\177\21\3\25\0\6\3\1\200\23\3\25\0"+
    "\12\3\1\201\17\3\25\0\10\3\1\202\21\3\25\0"+
    "\5\3\1\203\24\3\25\0\2\3\1\204\27\3\25\0"+
    "\2\3\1\205\27\3\25\0\12\3\1\206\17\3\25\0"+
    "\2\3\1\207\27\3\25\0\12\3\1\210\17\3\25\0"+
    "\13\3\1\211\16\3\25\0\16\3\1\212\13\3\25\0"+
    "\23\3\1\213\6\3\25\0\2\3\1\214\27\3\25\0"+
    "\10\3\1\215\21\3\25\0\20\3\1\216\11\3\25\0"+
    "\2\3\1\217\27\3\25\0\13\3\1\220\16\3\25\0"+
    "\15\3\1\221\14\3\25\0\11\3\1\222\20\3\25\0"+
    "\15\3\1\223\14\3\25\0\25\161\1\0\14\161\2\0"+
    "\1\224\11\161\1\0\2\3\1\225\27\3\25\0\10\3"+
    "\1\226\21\3\25\0\6\3\1\227\23\3\25\0\2\3"+
    "\1\230\27\3\25\0\26\3\1\231\2\3\1\232\25\0"+
    "\3\3\1\233\26\3\25\0\6\3\1\234\13\3\1\235"+
    "\7\3\25\0\12\3\1\236\17\3\25\0\12\3\1\237"+
    "\17\3\25\0\15\3\1\240\14\3\25\0\3\3\1\241"+
    "\26\3\25\0\13\3\1\242\16\3\25\0\14\3\1\243"+
    "\15\3\25\0\10\3\1\244\21\3\25\0\3\3\1\245"+
    "\26\3\25\0\3\3\1\246\26\3\25\0\13\3\1\247"+
    "\16\3\25\0\13\3\1\250\16\3\25\0\23\3\1\251"+
    "\6\3\25\0\4\3\1\252\25\3\25\0\2\3\1\253"+
    "\27\3\25\0\10\3\1\254\21\3\25\0\5\3\1\255"+
    "\24\3\25\0\4\3\1\256\25\3\25\0\11\3\1\257"+
    "\20\3\25\0\2\3\1\260\27\3\25\0\3\3\1\261"+
    "\26\3\25\0\16\3\1\262\13\3\25\0\12\3\1\263"+
    "\17\3\25\0\12\3\1\264\17\3\25\0\2\3\1\265"+
    "\17\3\1\266\1\267\6\3\67\0\1\270\14\0\5\3"+
    "\1\271\24\3\25\0\13\3\1\272\16\3\25\0\3\3"+
    "\1\273\26\3\25\0\3\3\1\274\26\3\25\0\14\3"+
    "\1\275\15\3\25\0\12\3\1\276\17\3\25\0\10\3"+
    "\1\277\21\3\25\0\11\3\1\300\20\3\25\0\2\3"+
    "\1\301\27\3\25\0\5\3\1\302\24\3\25\0\10\3"+
    "\1\303\21\3\25\0\5\3\1\304\24\3\25\0\13\3"+
    "\1\305\16\3\25\0\10\3\1\306\21\3\25\0\15\3"+
    "\1\307\14\3\25\0\12\3\1\310\17\3\25\0\12\3"+
    "\1\311\17\3\25\0\5\3\1\312\24\3\25\0\3\3"+
    "\1\313\26\3\25\0\6\3\1\314\23\3\25\0\6\3"+
    "\1\315\23\3\25\0\2\3\1\316\27\3\25\0\5\3"+
    "\1\317\24\3\25\0\11\3\1\320\20\3\25\0\12\3"+
    "\1\321\17\3\25\0\6\3\1\322\23\3\25\0\6\3"+
    "\1\323\23\3\25\0\23\3\1\324\6\3\25\0\22\3"+
    "\1\325\7\3\25\0\2\3\1\326\27\3\25\0\12\3"+
    "\1\327\17\3\25\0\6\3\1\330\23\3\25\0\10\3"+
    "\1\331\21\3\25\0\5\3\1\332\24\3\25\0\20\3"+
    "\1\333\11\3\25\0\5\3\1\334\24\3\25\0\17\3"+
    "\1\335\12\3\25\0\13\3\1\336\16\3\25\0\20\3"+
    "\1\337\11\3\25\0\6\3\1\340\23\3\25\0\3\3"+
    "\1\341\26\3\25\0\6\3\1\342\23\3\25\0\10\3"+
    "\1\343\21\3\25\0\6\3\1\344\23\3\25\0\10\3"+
    "\1\345\21\3\25\0\5\3\1\346\24\3\25\0\5\3"+
    "\1\347\24\3\25\0\12\3\1\350\17\3\25\0\11\3"+
    "\1\351\20\3\25\0\12\3\1\352\17\3\25\0\23\3"+
    "\1\353\6\3\25\0\10\3\1\354\21\3\25\0\2\3"+
    "\1\355\27\3\25\0\30\3\1\356\1\3\25\0\22\3"+
    "\1\357\7\3\25\0\3\3\1\360\26\3\25\0\5\3"+
    "\1\361\24\3\25\0\6\3\1\362\23\3\25\0\5\3"+
    "\1\363\24\3\25\0\10\3\1\364\21\3\25\0\4\3"+
    "\1\365\25\3\25\0\3\3\1\366\26\3\25\0\6\3"+
    "\1\367\23\3\25\0\15\3\1\370\14\3\25\0\3\3"+
    "\1\371\26\3\25\0\2\3\1\372\27\3\25\0\14\3"+
    "\1\373\15\3\25\0\15\3\1\374\14\3\25\0\6\3"+
    "\1\375\23\3\25\0\6\3\1\376\23\3\25\0\3\3"+
    "\1\377\26\3\25\0\2\3\1\u0100\27\3\25\0\15\3"+
    "\1\u0101\14\3\25\0\20\3\1\u0102\11\3\25\0\11\3"+
    "\1\u0103\20\3\25\0\5\3\1\u0104\24\3\25\0\5\3"+
    "\1\u0105\24\3\25\0\15\3\1\u0106\14\3\25\0\6\3"+
    "\1\u0107\23\3\25\0\5\3\1\u0108\24\3\25\0\6\3"+
    "\1\u0109\23\3\25\0\5\3\1\u010a\24\3\25\0\3\3"+
    "\1\u010b\26\3\25\0\6\3\1\u010c\23\3\25\0\12\3"+
    "\1\u010d\17\3\25\0\6\3\1\u010e\23\3\25\0\5\3"+
    "\1\u010f\24\3\25\0\11\3\1\u0110\20\3\25\0\15\3"+
    "\1\u0111\14\3\25\0\25\3\1\u0112\4\3\25\0\10\3"+
    "\1\u0113\21\3\25\0\5\3\1\u0114\24\3\25\0\4\3"+
    "\1\u0115\25\3\25\0\15\3\1\u0116\14\3\25\0\20\3"+
    "\1\u0117\11\3\25\0\5\3\1\u0118\24\3\25\0\22\3"+
    "\1\u0119\7\3\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10434];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\24\1\1\11\3\1\1\11\1\1\1\11"+
    "\1\1\6\11\45\1\1\11\46\1\1\0\42\1\1\0"+
    "\43\1\1\11\141\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[281];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }

    public int numero;
    InformacionAnalisis c= new InformacionAnalisis();



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 52: 
          { return new Symbol(sym.Repetir, yychar, yyline, yytext());
          }
        case 75: break;
        case 54: 
          { return new Symbol(sym.Empezar, yychar, yyline, yytext());
          }
        case 76: break;
        case 43: 
          { return new Symbol(sym.Rutina, yychar, yyline, yytext());
          }
        case 77: break;
        case 50: 
          { return new Symbol(sym.Iniciar, yychar, yyline, yytext());
          }
        case 78: break;
        case 32: 
          { return new Symbol(sym.Min, yychar, yyline, yytext());
          }
        case 79: break;
        case 7: 
          { return new Symbol(sym.Menor_que, yychar, yyline, yytext());
          }
        case 80: break;
        case 36: 
          { return new Symbol(sym.Vaho, yychar, yyline, yytext());
          }
        case 81: break;
        case 69: 
          { return new Symbol(sym.Complemento, yychar, yyline, yytext());
          }
        case 82: break;
        case 14: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 83: break;
        case 47: 
          { return new Symbol(sym.Pausar, yychar, yyline, yytext());
          }
        case 84: break;
        case 25: 
          { return new Symbol(sym.Si, yychar, yyline, yytext());
          }
        case 85: break;
        case 30: 
          { String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: falta cierre de comentario '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
          }
        case 86: break;
        case 56: 
          { return new Symbol(sym.Durante, yychar, yyline, yytext());
          }
        case 87: break;
        case 74: 
          { return new Symbol(sym.Temperatura_actual, yychar, yyline, yytext());
          }
        case 88: break;
        case 26: 
          { String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: operador de asignacion no valida '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
          }
        case 89: break;
        case 6: 
          { return new Symbol(sym.Signo_Puntuacion, yychar, yyline, yytext());
          }
        case 90: break;
        case 49: 
          { return new Symbol(sym.Grados, yychar, yyline, yytext());
          }
        case 91: break;
        case 20: 
          { /*Ignore*/
          }
        case 92: break;
        case 48: 
          { return new Symbol(sym.Sector, yychar, yyline, yytext());
          }
        case 93: break;
        case 37: 
          { return new Symbol(sym.Dero, yychar, yyline, yytext());
          }
        case 94: break;
        case 12: 
          { return new Symbol(sym.COMA, yychar, yyline, yytext());
          }
        case 95: break;
        case 66: 
          { return new Symbol(sym.Comprobar, yychar, yyline, yytext());
          }
        case 96: break;
        case 33: 
          { return new Symbol(sym.Mas, yychar, yyline, yytext());
          }
        case 97: break;
        case 35: 
          { return new Symbol(sym.Luz, yychar, yyline, yytext());
          }
        case 98: break;
        case 70: 
          { return new Symbol(sym.Decrementar, yychar, yyline, yytext());
          }
        case 99: break;
        case 13: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 100: break;
        case 63: 
          { return new Symbol(sym.Terminar, yychar, yyline, yytext());
          }
        case 101: break;
        case 23: 
          { return new Symbol(sym.No, yychar, yyline, yytext());
          }
        case 102: break;
        case 39: 
          { return new Symbol(sym.Cordx, yychar, yyline, yytext());
          }
        case 103: break;
        case 31: 
          { String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: falta apertura de comentario '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
          }
        case 104: break;
        case 16: 
          { return new Symbol(sym.Llaves_a, yychar, yyline, yytext());
          }
        case 105: break;
        case 53: 
          { return new Symbol(sym.Volumen, yychar, yyline, yytext());
          }
        case 106: break;
        case 9: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 107: break;
        case 29: 
          { return new Symbol(sym.Igual_igual, yychar, yyline, yytext());
          }
        case 108: break;
        case 21: 
          { String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: Cadena no valida '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
          }
        case 109: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 110: break;
        case 19: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 111: break;
        case 8: 
          { return new Symbol(sym.Mayor_que, yychar, yyline, yytext());
          }
        case 112: break;
        case 5: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 113: break;
        case 73: 
          { return new Symbol(sym.Fertilizante, yychar, yyline, yytext());
          }
        case 114: break;
        case 24: 
          { return new Symbol(sym.Hr, yychar, yyline, yytext());
          }
        case 115: break;
        case 10: 
          { return new Symbol(sym.CaracterEs, yychar, yyline, yytext());
          }
        case 116: break;
        case 62: 
          { return new Symbol(sym.Comenzar, yychar, yyline, yytext());
          }
        case 117: break;
        case 55: 
          { return new Symbol(sym.Detener, yychar, yyline, yytext());
          }
        case 118: break;
        case 65: 
          { return new Symbol(sym.Continuar, yychar, yyline, yytext());
          }
        case 119: break;
        case 51: 
          { return new Symbol(sym.Inverna, yychar, yyline, yytext());
          }
        case 120: break;
        case 1: 
          { String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: Caracter no valido '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
          }
        case 121: break;
        case 71: 
          { return new Symbol(sym.Temperatura, yychar, yyline, yytext());
          }
        case 122: break;
        case 46: 
          { return new Symbol(sym.Musica, yychar, yyline, yytext());
          }
        case 123: break;
        case 28: 
          { return new Symbol(sym.Mayor_igual, yychar, yyline, yytext());
          }
        case 124: break;
        case 15: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 125: break;
        case 72: 
          { return new Symbol(sym.Luminosidad, yychar, yyline, yytext());
          }
        case 126: break;
        case 40: 
          { return new Symbol(sym.Cordy, yychar, yyline, yytext());
          }
        case 127: break;
        case 59: 
          { return new Symbol(sym.Siempre, yychar, yyline, yytext());
          }
        case 128: break;
        case 42: 
          { return new Symbol(sym.Menos, yychar, yyline, yytext());
          }
        case 129: break;
        case 58: 
          { return new Symbol(sym.Liquido, yychar, yyline, yytext());
          }
        case 130: break;
        case 11: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 131: break;
        case 41: 
          { return new Symbol(sym.Riego, yychar, yyline, yytext());
          }
        case 132: break;
        case 4: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 133: break;
        case 45: 
          { return new Symbol(sym.Maximo, yychar, yyline, yytext());
          }
        case 134: break;
        case 27: 
          { return new Symbol(sym.Menor_igual, yychar, yyline, yytext());
          }
        case 135: break;
        case 61: 
          { return new Symbol(sym.Fertsol, yychar, yyline, yytext());
          }
        case 136: break;
        case 44: 
          { return new Symbol(sym.Minimo, yychar, yyline, yytext());
          }
        case 137: break;
        case 64: 
          { return new Symbol(sym.Posicion, yychar, yyline, yytext());
          }
        case 138: break;
        case 60: 
          { return new Symbol(sym.Fertliq, yychar, yyline, yytext());
          }
        case 139: break;
        case 57: 
          { return new Symbol(sym.Humedad, yychar, yyline, yytext());
          }
        case 140: break;
        case 68: 
          { return new Symbol(sym.Incrementar, yychar, yyline, yytext());
          }
        case 141: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 142: break;
        case 17: 
          { return new Symbol(sym.Llaves_c, yychar, yyline, yytext());
          }
        case 143: break;
        case 22: 
          { String errLex = "Error lexico, linea: "+(yyline+1)+"\n \t Error: numero no valido '"+yytext()+"'"+"\n------------------------------------------------------------------------------";
                                                    JFprincipal.notificar_er(errLex);
          }
        case 144: break;
        case 67: 
          { return new Symbol(sym.Reproducir, yychar, yyline, yytext());
          }
        case 145: break;
        case 34: 
          { return new Symbol(sym.Por, yychar, yyline, yytext());
          }
        case 146: break;
        case 38: 
          { return new Symbol(sym.Tipo, yychar, yyline, yytext());
          }
        case 147: break;
        case 18: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 148: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
