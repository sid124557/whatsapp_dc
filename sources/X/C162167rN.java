package X;

import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7rN  reason: invalid class name and case insensitive filesystem */
public class C162167rN {
    public static final String A08 = A02("xｘ#＃~～");
    public static final Map A09;
    public static final Map A0A;
    public static final Logger A0B = AnonymousClass6C8.A0m(C162167rN.class);
    public static final Pattern A0C = Pattern.compile("(\\p{Nd})");
    public static final Pattern A0D = Pattern.compile("\\$CC");
    public static final Pattern A0E;
    public static final Pattern A0F = Pattern.compile("\\$FG");
    public static final Pattern A0G = Pattern.compile("\\(?\\$1\\)?");
    public static final Pattern A0H = Pattern.compile("(\\$\\d)");
    public static final Pattern A0I = Pattern.compile("(\\D+)");
    public static final Pattern A0J = Pattern.compile("\\$NP");
    public static final Pattern A0K = Pattern.compile("[+＋]+");
    public static final Pattern A0L = Pattern.compile("[\\\\/] *x");
    public static final Pattern A0M = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    public static final Pattern A0N = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    public static final Pattern A0O = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    public static final Pattern A0P;
    public static final Pattern A0Q = Pattern.compile("[+＋\\p{Nd}]");
    public static volatile C162167rN A0R;
    public AnonymousClass7RS A00 = new AnonymousClass7RS(100);
    public C106175Xx A01;
    public Map A02 = null;
    public final Map A03 = AnonymousClass0x7.A0y();
    public final Map A04 = AnonymousClass0x7.A0y();
    public final Set A05 = AnonymousClass002.A0K();
    public final Set A06 = new HashSet(35);
    public final Set A07 = new HashSet(320);

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put('0', '0');
        A0t.put('1', '1');
        A0t.put('2', '2');
        A0t.put('3', '3');
        A0t.put('4', '4');
        A0t.put('5', '5');
        A0t.put('6', '6');
        A0t.put('7', '7');
        A0t.put('8', '8');
        A0t.put('9', '9');
        HashMap hashMap = new HashMap(40);
        A05('2', hashMap, 'A');
        A05('2', hashMap, 'B');
        A05('2', hashMap, 'C');
        A05('3', hashMap, 'D');
        A05('3', hashMap, 'E');
        A05('3', hashMap, 'F');
        A05('4', hashMap, 'G');
        A05('4', hashMap, 'H');
        A05('4', hashMap, 'I');
        A05('5', hashMap, 'J');
        A05('5', hashMap, 'K');
        A05('5', hashMap, 'L');
        A05('6', hashMap, 'M');
        A05('6', hashMap, 'N');
        A05('6', hashMap, 'O');
        A05('7', hashMap, 'P');
        A05('7', hashMap, 'Q');
        A05('7', hashMap, 'R');
        A05('7', hashMap, 'S');
        A05('8', hashMap, 'T');
        A05('8', hashMap, 'U');
        A05('8', hashMap, 'V');
        A05('9', hashMap, 'W');
        A05('9', hashMap, 'X');
        A05('9', hashMap, 'Y');
        A05('9', hashMap, 'Z');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        A09 = unmodifiableMap;
        HashMap hashMap2 = new HashMap(100);
        hashMap2.putAll(unmodifiableMap);
        hashMap2.putAll(A0t);
        A0A = Collections.unmodifiableMap(hashMap2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(Arrays.toString(unmodifiableMap.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        String A0X = AnonymousClass000.A0X(Arrays.toString(unmodifiableMap.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""), A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        A0o2.append(A0X);
        A0o2.append("\\p{Nd}");
        String A0X2 = AnonymousClass000.A0X("]*", A0o2);
        StringBuilder A0o3 = AnonymousClass001.A0o();
        C18320x8.A1K(A0o3);
        String A022 = A02(AnonymousClass000.A0X("xｘ#＃~～", A0o3));
        StringBuilder A0o4 = AnonymousClass001.A0o();
        A0o4.append("(?:");
        A0o4.append(A022);
        A0E = Pattern.compile(AnonymousClass000.A0X(")$", A0o4), 66);
        StringBuilder A0o5 = AnonymousClass001.A0o();
        AnonymousClass001.A1K(A0X2, "(?:", A022, A0o5);
        A0P = Pattern.compile(AnonymousClass000.A0X(")?", A0o5), 66);
    }

    public C162167rN(C106175Xx r9) {
        HashMap hashMap = new HashMap(286);
        ArrayList A0I2 = AnonymousClass002.A0I(25);
        A0I2.add("US");
        A0I2.add("AG");
        A0I2.add("AI");
        A0I2.add("AS");
        A0I2.add("BB");
        A0I2.add("BM");
        A0I2.add("BS");
        A0I2.add("CA");
        A0I2.add("DM");
        A0I2.add("DO");
        A0I2.add("GD");
        A0I2.add("GU");
        A0I2.add("JM");
        A0I2.add("KN");
        A0I2.add("KY");
        A0I2.add("LC");
        A0I2.add("MP");
        A0I2.add("MS");
        A0I2.add("PR");
        A0I2.add("SX");
        A0I2.add("TC");
        A0I2.add("TT");
        A0I2.add("VC");
        A0I2.add("VG");
        A0I2.add("VI");
        hashMap.put(1, A0I2);
        ArrayList A0I3 = AnonymousClass002.A0I(2);
        A0I3.add("RU");
        A0I3.add("KZ");
        ArrayList A042 = A04(A0I3, hashMap, 7, 1);
        A042.add("EG");
        ArrayList A043 = A04(A042, hashMap, 20, 1);
        A043.add("ZA");
        ArrayList A044 = A04(A043, hashMap, 27, 1);
        A044.add("GR");
        ArrayList A045 = A04(A044, hashMap, 30, 1);
        A045.add("NL");
        ArrayList A046 = A04(A045, hashMap, 31, 1);
        A046.add("BE");
        ArrayList A047 = A04(A046, hashMap, 32, 1);
        A047.add("FR");
        ArrayList A048 = A04(A047, hashMap, 33, 1);
        A048.add("ES");
        ArrayList A049 = A04(A048, hashMap, 34, 1);
        A049.add("HU");
        ArrayList A0410 = A04(A049, hashMap, 36, 1);
        A0410.add("IT");
        ArrayList A0411 = A04(A0410, hashMap, 39, 1);
        A0411.add("RO");
        ArrayList A0412 = A04(A0411, hashMap, 40, 1);
        A0412.add("CH");
        ArrayList A0413 = A04(A0412, hashMap, 41, 1);
        A0413.add("AT");
        AnonymousClass0x2.A1H(A0413, hashMap, 43);
        ArrayList A0I4 = AnonymousClass002.A0I(4);
        A0I4.add("GB");
        A0I4.add("GG");
        A0I4.add("IM");
        A0I4.add("JE");
        ArrayList A0414 = A04(A0I4, hashMap, 44, 1);
        A0414.add("DK");
        ArrayList A0415 = A04(A0414, hashMap, 45, 1);
        A0415.add("SE");
        ArrayList A0416 = A04(A0415, hashMap, 46, 2);
        A0416.add("NO");
        A0416.add("SJ");
        ArrayList A0417 = A04(A0416, hashMap, 47, 1);
        A0417.add("PL");
        ArrayList A0418 = A04(A0417, hashMap, 48, 1);
        A0418.add("DE");
        ArrayList A0419 = A04(A0418, hashMap, 49, 1);
        A0419.add("PE");
        ArrayList A0420 = A04(A0419, hashMap, 51, 1);
        A0420.add("MX");
        ArrayList A0421 = A04(A0420, hashMap, 52, 1);
        A0421.add("CU");
        ArrayList A0422 = A04(A0421, hashMap, 53, 1);
        A0422.add("AR");
        ArrayList A0423 = A04(A0422, hashMap, 54, 1);
        A0423.add("BR");
        ArrayList A0424 = A04(A0423, hashMap, 55, 1);
        A0424.add("CL");
        ArrayList A0425 = A04(A0424, hashMap, 56, 1);
        A0425.add("CO");
        ArrayList A0426 = A04(A0425, hashMap, 57, 1);
        A0426.add("VE");
        ArrayList A0427 = A04(A0426, hashMap, 58, 1);
        A0427.add("MY");
        AnonymousClass0x2.A1H(A0427, hashMap, 60);
        ArrayList A0I5 = AnonymousClass002.A0I(3);
        A0I5.add("AU");
        A0I5.add("CC");
        A0I5.add("CX");
        ArrayList A0428 = A04(A0I5, hashMap, 61, 1);
        A0428.add("ID");
        ArrayList A0429 = A04(A0428, hashMap, 62, 1);
        A0429.add("PH");
        ArrayList A0430 = A04(A0429, hashMap, 63, 1);
        A0430.add("NZ");
        ArrayList A0431 = A04(A0430, hashMap, 64, 1);
        A0431.add("SG");
        ArrayList A0432 = A04(A0431, hashMap, 65, 1);
        A0432.add("TH");
        ArrayList A0433 = A04(A0432, hashMap, 66, 1);
        A0433.add("JP");
        ArrayList A0434 = A04(A0433, hashMap, 81, 1);
        A0434.add("KR");
        ArrayList A0435 = A04(A0434, hashMap, 82, 1);
        A0435.add("VN");
        ArrayList A0436 = A04(A0435, hashMap, 84, 1);
        A0436.add("CN");
        ArrayList A0437 = A04(A0436, hashMap, 86, 1);
        A0437.add("TR");
        ArrayList A0438 = A04(A0437, hashMap, 90, 1);
        A0438.add("IN");
        ArrayList A0439 = A04(A0438, hashMap, 91, 1);
        A0439.add("PK");
        ArrayList A0440 = A04(A0439, hashMap, 92, 1);
        A0440.add("AF");
        ArrayList A0441 = A04(A0440, hashMap, 93, 1);
        A0441.add("LK");
        ArrayList A0442 = A04(A0441, hashMap, 94, 1);
        A0442.add("MM");
        ArrayList A0443 = A04(A0442, hashMap, 95, 1);
        A0443.add("IR");
        ArrayList A0444 = A04(A0443, hashMap, 98, 1);
        A0444.add("SS");
        ArrayList A0445 = A04(A0444, hashMap, 211, 2);
        A0445.add("MA");
        A0445.add("EH");
        ArrayList A0446 = A04(A0445, hashMap, 212, 1);
        A0446.add("DZ");
        ArrayList A0447 = A04(A0446, hashMap, 213, 1);
        A0447.add("TN");
        ArrayList A0448 = A04(A0447, hashMap, 216, 1);
        A0448.add("LY");
        ArrayList A0449 = A04(A0448, hashMap, 218, 1);
        A0449.add("GM");
        ArrayList A0450 = A04(A0449, hashMap, 220, 1);
        A0450.add("SN");
        ArrayList A0451 = A04(A0450, hashMap, 221, 1);
        A0451.add("MR");
        ArrayList A0452 = A04(A0451, hashMap, 222, 1);
        A0452.add("ML");
        ArrayList A0453 = A04(A0452, hashMap, 223, 1);
        A0453.add("GN");
        ArrayList A0454 = A04(A0453, hashMap, 224, 1);
        A0454.add("CI");
        ArrayList A0455 = A04(A0454, hashMap, 225, 1);
        A0455.add("BF");
        ArrayList A0456 = A04(A0455, hashMap, 226, 1);
        A0456.add("NE");
        ArrayList A0457 = A04(A0456, hashMap, 227, 1);
        A0457.add("TG");
        ArrayList A0458 = A04(A0457, hashMap, 228, 1);
        A0458.add("BJ");
        ArrayList A0459 = A04(A0458, hashMap, 229, 1);
        A0459.add("MU");
        ArrayList A0460 = A04(A0459, hashMap, 230, 1);
        A0460.add("LR");
        ArrayList A0461 = A04(A0460, hashMap, 231, 1);
        A0461.add("SL");
        ArrayList A0462 = A04(A0461, hashMap, 232, 1);
        A0462.add("GH");
        ArrayList A0463 = A04(A0462, hashMap, 233, 1);
        A0463.add("NG");
        ArrayList A0464 = A04(A0463, hashMap, 234, 1);
        A0464.add("TD");
        ArrayList A0465 = A04(A0464, hashMap, 235, 1);
        A0465.add("CF");
        ArrayList A0466 = A04(A0465, hashMap, 236, 1);
        A0466.add("CM");
        ArrayList A0467 = A04(A0466, hashMap, 237, 1);
        A0467.add("CV");
        ArrayList A0468 = A04(A0467, hashMap, 238, 1);
        A0468.add("ST");
        ArrayList A0469 = A04(A0468, hashMap, 239, 1);
        A0469.add("GQ");
        ArrayList A0470 = A04(A0469, hashMap, 240, 1);
        A0470.add("GA");
        ArrayList A0471 = A04(A0470, hashMap, 241, 1);
        A0471.add("CG");
        ArrayList A0472 = A04(A0471, hashMap, 242, 1);
        A0472.add("CD");
        ArrayList A0473 = A04(A0472, hashMap, 243, 1);
        A0473.add("AO");
        ArrayList A0474 = A04(A0473, hashMap, 244, 1);
        A0474.add("GW");
        ArrayList A0475 = A04(A0474, hashMap, 245, 1);
        A0475.add("IO");
        ArrayList A0476 = A04(A0475, hashMap, 246, 1);
        A0476.add("AC");
        ArrayList A0477 = A04(A0476, hashMap, 247, 1);
        A0477.add("SC");
        ArrayList A0478 = A04(A0477, hashMap, 248, 1);
        A0478.add("SD");
        ArrayList A0479 = A04(A0478, hashMap, 249, 1);
        A0479.add("RW");
        ArrayList A0480 = A04(A0479, hashMap, 250, 1);
        A0480.add("ET");
        ArrayList A0481 = A04(A0480, hashMap, 251, 1);
        A0481.add("SO");
        ArrayList A0482 = A04(A0481, hashMap, 252, 1);
        A0482.add("DJ");
        ArrayList A0483 = A04(A0482, hashMap, 253, 1);
        A0483.add("KE");
        ArrayList A0484 = A04(A0483, hashMap, 254, 1);
        A0484.add("TZ");
        ArrayList A0485 = A04(A0484, hashMap, 255, 1);
        A0485.add("UG");
        ArrayList A0486 = A04(A0485, hashMap, 256, 1);
        A0486.add("BI");
        ArrayList A0487 = A04(A0486, hashMap, 257, 1);
        A0487.add("MZ");
        ArrayList A0488 = A04(A0487, hashMap, 258, 1);
        A0488.add("ZM");
        ArrayList A0489 = A04(A0488, hashMap, 260, 1);
        A0489.add("MG");
        ArrayList A0490 = A04(A0489, hashMap, 261, 2);
        A0490.add("RE");
        A0490.add("YT");
        ArrayList A0491 = A04(A0490, hashMap, 262, 1);
        A0491.add("ZW");
        ArrayList A0492 = A04(A0491, hashMap, 263, 1);
        A0492.add("NA");
        ArrayList A0493 = A04(A0492, hashMap, 264, 1);
        A0493.add("MW");
        ArrayList A0494 = A04(A0493, hashMap, 265, 1);
        A0494.add("LS");
        ArrayList A0495 = A04(A0494, hashMap, 266, 1);
        A0495.add("BW");
        ArrayList A0496 = A04(A0495, hashMap, 267, 1);
        A0496.add("SZ");
        ArrayList A0497 = A04(A0496, hashMap, 268, 1);
        A0497.add("KM");
        ArrayList A0498 = A04(A0497, hashMap, 269, 1);
        A0498.add("SH");
        ArrayList A0499 = A04(A0498, hashMap, 290, 1);
        A0499.add("ER");
        ArrayList A04100 = A04(A0499, hashMap, 291, 1);
        A04100.add("AW");
        ArrayList A04101 = A04(A04100, hashMap, 297, 1);
        A04101.add("FO");
        ArrayList A04102 = A04(A04101, hashMap, 298, 1);
        A04102.add("GL");
        ArrayList A04103 = A04(A04102, hashMap, 299, 1);
        A04103.add("GI");
        ArrayList A04104 = A04(A04103, hashMap, 350, 1);
        A04104.add("PT");
        ArrayList A04105 = A04(A04104, hashMap, 351, 1);
        A04105.add("LU");
        ArrayList A04106 = A04(A04105, hashMap, 352, 1);
        A04106.add("IE");
        ArrayList A04107 = A04(A04106, hashMap, 353, 1);
        A04107.add("IS");
        ArrayList A04108 = A04(A04107, hashMap, 354, 1);
        A04108.add("AL");
        ArrayList A04109 = A04(A04108, hashMap, 355, 1);
        A04109.add("MT");
        ArrayList A04110 = A04(A04109, hashMap, 356, 1);
        A04110.add("CY");
        ArrayList A04111 = A04(A04110, hashMap, 357, 2);
        A04111.add("FI");
        A04111.add("AX");
        ArrayList A04112 = A04(A04111, hashMap, 358, 1);
        A04112.add("BG");
        ArrayList A04113 = A04(A04112, hashMap, 359, 1);
        A04113.add("LT");
        ArrayList A04114 = A04(A04113, hashMap, 370, 1);
        A04114.add("LV");
        ArrayList A04115 = A04(A04114, hashMap, 371, 1);
        A04115.add("EE");
        ArrayList A04116 = A04(A04115, hashMap, 372, 1);
        A04116.add("MD");
        ArrayList A04117 = A04(A04116, hashMap, 373, 1);
        A04117.add("AM");
        ArrayList A04118 = A04(A04117, hashMap, 374, 1);
        A04118.add("BY");
        ArrayList A04119 = A04(A04118, hashMap, 375, 1);
        A04119.add("AD");
        ArrayList A04120 = A04(A04119, hashMap, 376, 1);
        A04120.add("MC");
        ArrayList A04121 = A04(A04120, hashMap, 377, 1);
        A04121.add("SM");
        ArrayList A04122 = A04(A04121, hashMap, 378, 1);
        A04122.add("VA");
        ArrayList A04123 = A04(A04122, hashMap, 379, 1);
        A04123.add("UA");
        ArrayList A04124 = A04(A04123, hashMap, 380, 1);
        A04124.add("RS");
        ArrayList A04125 = A04(A04124, hashMap, 381, 1);
        A04125.add("ME");
        ArrayList A04126 = A04(A04125, hashMap, 382, 1);
        A04126.add("HR");
        ArrayList A04127 = A04(A04126, hashMap, 385, 1);
        A04127.add("SI");
        ArrayList A04128 = A04(A04127, hashMap, 386, 1);
        A04128.add("BA");
        ArrayList A04129 = A04(A04128, hashMap, 387, 1);
        A04129.add("MK");
        ArrayList A04130 = A04(A04129, hashMap, 389, 1);
        A04130.add("CZ");
        ArrayList A04131 = A04(A04130, hashMap, 420, 1);
        A04131.add("SK");
        ArrayList A04132 = A04(A04131, hashMap, 421, 1);
        A04132.add("LI");
        ArrayList A04133 = A04(A04132, hashMap, 423, 1);
        A04133.add("FK");
        ArrayList A04134 = A04(A04133, hashMap, 500, 1);
        A04134.add("BZ");
        ArrayList A04135 = A04(A04134, hashMap, 501, 1);
        A04135.add("GT");
        ArrayList A04136 = A04(A04135, hashMap, 502, 1);
        A04136.add("SV");
        ArrayList A04137 = A04(A04136, hashMap, 503, 1);
        A04137.add("HN");
        ArrayList A04138 = A04(A04137, hashMap, 504, 1);
        A04138.add("NI");
        ArrayList A04139 = A04(A04138, hashMap, 505, 1);
        A04139.add("CR");
        ArrayList A04140 = A04(A04139, hashMap, 506, 1);
        A04140.add("PA");
        ArrayList A04141 = A04(A04140, hashMap, 507, 1);
        A04141.add("PM");
        ArrayList A04142 = A04(A04141, hashMap, 508, 1);
        A04142.add("HT");
        ArrayList A04143 = A04(A04142, hashMap, 509, 3);
        A04143.add("GP");
        A04143.add("BL");
        A04143.add("MF");
        ArrayList A04144 = A04(A04143, hashMap, 590, 1);
        A04144.add("BO");
        ArrayList A04145 = A04(A04144, hashMap, 591, 1);
        A04145.add("GY");
        ArrayList A04146 = A04(A04145, hashMap, 592, 1);
        A04146.add("EC");
        ArrayList A04147 = A04(A04146, hashMap, 593, 1);
        A04147.add("GF");
        ArrayList A04148 = A04(A04147, hashMap, 594, 1);
        A04148.add("PY");
        ArrayList A04149 = A04(A04148, hashMap, 595, 1);
        A04149.add("MQ");
        ArrayList A04150 = A04(A04149, hashMap, 596, 1);
        A04150.add("SR");
        ArrayList A04151 = A04(A04150, hashMap, 597, 1);
        A04151.add("UY");
        ArrayList A04152 = A04(A04151, hashMap, 598, 2);
        A04152.add("CW");
        A04152.add("BQ");
        ArrayList A04153 = A04(A04152, hashMap, 599, 1);
        A04153.add("TL");
        ArrayList A04154 = A04(A04153, hashMap, 670, 1);
        A04154.add("NF");
        ArrayList A04155 = A04(A04154, hashMap, 672, 1);
        A04155.add("BN");
        ArrayList A04156 = A04(A04155, hashMap, 673, 1);
        A04156.add("NR");
        ArrayList A04157 = A04(A04156, hashMap, 674, 1);
        A04157.add("PG");
        ArrayList A04158 = A04(A04157, hashMap, 675, 1);
        A04158.add("TO");
        ArrayList A04159 = A04(A04158, hashMap, 676, 1);
        A04159.add("SB");
        ArrayList A04160 = A04(A04159, hashMap, 677, 1);
        A04160.add("VU");
        ArrayList A04161 = A04(A04160, hashMap, 678, 1);
        A04161.add("FJ");
        ArrayList A04162 = A04(A04161, hashMap, 679, 1);
        A04162.add("PW");
        ArrayList A04163 = A04(A04162, hashMap, 680, 1);
        A04163.add("WF");
        ArrayList A04164 = A04(A04163, hashMap, 681, 1);
        A04164.add("CK");
        ArrayList A04165 = A04(A04164, hashMap, 682, 1);
        A04165.add("NU");
        ArrayList A04166 = A04(A04165, hashMap, 683, 1);
        A04166.add("WS");
        ArrayList A04167 = A04(A04166, hashMap, 685, 1);
        A04167.add("KI");
        ArrayList A04168 = A04(A04167, hashMap, 686, 1);
        A04168.add("NC");
        ArrayList A04169 = A04(A04168, hashMap, 687, 1);
        A04169.add("TV");
        ArrayList A04170 = A04(A04169, hashMap, 688, 1);
        A04170.add("PF");
        ArrayList A04171 = A04(A04170, hashMap, 689, 1);
        A04171.add("TK");
        ArrayList A04172 = A04(A04171, hashMap, 690, 1);
        A04172.add("FM");
        ArrayList A04173 = A04(A04172, hashMap, 691, 1);
        A04173.add("MH");
        ArrayList A04174 = A04(A04173, hashMap, 692, 1);
        A04174.add("001");
        ArrayList A04175 = A04(A04174, hashMap, 800, 1);
        A04175.add("001");
        ArrayList A04176 = A04(A04175, hashMap, 808, 1);
        A04176.add("KP");
        ArrayList A04177 = A04(A04176, hashMap, 850, 1);
        A04177.add("HK");
        ArrayList A04178 = A04(A04177, hashMap, 852, 1);
        A04178.add("MO");
        ArrayList A04179 = A04(A04178, hashMap, 853, 1);
        A04179.add("KH");
        ArrayList A04180 = A04(A04179, hashMap, 855, 1);
        A04180.add("LA");
        ArrayList A04181 = A04(A04180, hashMap, 856, 1);
        A04181.add("001");
        ArrayList A04182 = A04(A04181, hashMap, 870, 1);
        A04182.add("001");
        ArrayList A04183 = A04(A04182, hashMap, 878, 1);
        A04183.add("BD");
        ArrayList A04184 = A04(A04183, hashMap, 880, 1);
        A04184.add("001");
        ArrayList A04185 = A04(A04184, hashMap, 881, 1);
        A04185.add("001");
        ArrayList A04186 = A04(A04185, hashMap, 882, 1);
        A04186.add("001");
        ArrayList A04187 = A04(A04186, hashMap, 883, 1);
        A04187.add("TW");
        ArrayList A04188 = A04(A04187, hashMap, 886, 1);
        A04188.add("001");
        ArrayList A04189 = A04(A04188, hashMap, 888, 1);
        A04189.add("MV");
        ArrayList A04190 = A04(A04189, hashMap, 960, 1);
        A04190.add("LB");
        ArrayList A04191 = A04(A04190, hashMap, 961, 1);
        A04191.add("JO");
        ArrayList A04192 = A04(A04191, hashMap, 962, 1);
        A04192.add("SY");
        ArrayList A04193 = A04(A04192, hashMap, 963, 1);
        A04193.add("IQ");
        ArrayList A04194 = A04(A04193, hashMap, 964, 1);
        A04194.add("KW");
        ArrayList A04195 = A04(A04194, hashMap, 965, 1);
        A04195.add("SA");
        ArrayList A04196 = A04(A04195, hashMap, 966, 1);
        A04196.add("YE");
        ArrayList A04197 = A04(A04196, hashMap, 967, 1);
        A04197.add("OM");
        ArrayList A04198 = A04(A04197, hashMap, 968, 1);
        A04198.add("PS");
        ArrayList A04199 = A04(A04198, hashMap, 970, 1);
        A04199.add("AE");
        ArrayList A04200 = A04(A04199, hashMap, 971, 1);
        A04200.add("IL");
        ArrayList A04201 = A04(A04200, hashMap, 972, 1);
        A04201.add("BH");
        ArrayList A04202 = A04(A04201, hashMap, 973, 1);
        A04202.add("QA");
        ArrayList A04203 = A04(A04202, hashMap, 974, 1);
        A04203.add("BT");
        ArrayList A04204 = A04(A04203, hashMap, 975, 1);
        A04204.add("MN");
        ArrayList A04205 = A04(A04204, hashMap, 976, 1);
        A04205.add("NP");
        ArrayList A04206 = A04(A04205, hashMap, 977, 1);
        A04206.add("001");
        ArrayList A04207 = A04(A04206, hashMap, 979, 1);
        A04207.add("TJ");
        ArrayList A04208 = A04(A04207, hashMap, 992, 1);
        A04208.add("TM");
        ArrayList A04209 = A04(A04208, hashMap, 993, 1);
        A04209.add("AZ");
        ArrayList A04210 = A04(A04209, hashMap, 994, 1);
        A04210.add("GE");
        ArrayList A04211 = A04(A04210, hashMap, 995, 1);
        A04211.add("KG");
        ArrayList A04212 = A04(A04211, hashMap, 996, 1);
        A04212.add("UZ");
        AnonymousClass0x2.A1H(A04212, hashMap, 998);
        this.A01 = r9;
        this.A02 = hashMap;
        Iterator A0u = AnonymousClass001.A0u(hashMap);
        while (A0u.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0u);
            List list = (List) A0w.getValue();
            if (list.size() != 1 || !"001".equals(C18290x4.A0k(list))) {
                this.A07.addAll(list);
            } else {
                this.A05.add(A0w.getKey());
            }
        }
        if (this.A07.remove("001")) {
            A0B.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.A06.addAll((Collection) hashMap.get(1));
    }

    public static C162167rN A00() {
        if (A0R == null) {
            synchronized (C162167rN.class) {
                if (A0R == null) {
                    A0R = new C162167rN(C106175Xx.A00());
                }
            }
        }
        return A0R;
    }

    public static String A01(AnonymousClass8LC r4) {
        String str = "0";
        String str2 = "";
        if (r4.italianLeadingZero_) {
            str2 = str;
        }
        StringBuilder A0A2 = C18330xA.A0A(str2);
        if (!r4.secondLeadingZero_) {
            str = "";
        }
        A0A2.append(str);
        return AnonymousClass001.A0k(A0A2, r4.nationalNumber_);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r2 == r1) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C140886ug A09(X.AnonymousClass8LC r6, X.AnonymousClass8LC r7) {
        /*
            r5 = this;
            X.8LC r4 = new X.8LC
            r4.<init>()
            r4.A00(r6)
            X.8LC r3 = new X.8LC
            r3.<init>()
            r3.A00(r7)
            r1 = 0
            r4.hasRawInput = r1
            java.lang.String r2 = ""
            r4.rawInput_ = r2
            r4.hasCountryCodeSource = r1
            X.6w0 r0 = X.C141706w0.FROM_NUMBER_WITH_PLUS_SIGN
            r4.countryCodeSource_ = r0
            r4.hasPreferredDomesticCarrierCode = r1
            r4.preferredDomesticCarrierCode_ = r2
            r3.hasRawInput = r1
            r3.rawInput_ = r2
            r3.hasCountryCodeSource = r1
            r3.countryCodeSource_ = r0
            r3.hasPreferredDomesticCarrierCode = r1
            r3.preferredDomesticCarrierCode_ = r2
            boolean r0 = r4.hasExtension
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r4.extension_
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003d
            r4.hasExtension = r1
            r4.extension_ = r2
        L_0x003d:
            boolean r1 = r3.hasExtension
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = r3.extension_
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004e
            r1 = 0
            r3.hasExtension = r1
            r3.extension_ = r2
        L_0x004e:
            boolean r0 = r4.hasExtension
            if (r0 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = r4.extension_
            java.lang.String r0 = r3.extension_
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
        L_0x005e:
            X.6ug r0 = X.C140886ug.NO_MATCH
            return r0
        L_0x0061:
            int r2 = r4.countryCode_
            int r1 = r3.countryCode_
            if (r2 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0080
            X.6ug r0 = X.C140886ug.EXACT_MATCH
            return r0
        L_0x0072:
            r0 = 1
            r4.hasCountryCode = r0
            r4.countryCode_ = r1
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0082
            X.6ug r0 = X.C140886ug.NSN_MATCH
            return r0
        L_0x0080:
            if (r2 != r1) goto L_0x005e
        L_0x0082:
            long r0 = r4.nationalNumber_
            java.lang.String r2 = java.lang.String.valueOf(r0)
            long r0 = r3.nationalNumber_
            java.lang.String r1 = java.lang.String.valueOf(r0)
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r1.endsWith(r2)
            if (r0 == 0) goto L_0x005e
        L_0x009a:
            X.6ug r0 = X.C140886ug.SHORT_NSN_MATCH
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162167rN.A09(X.8LC, X.8LC):X.6ug");
    }

    public C140886ug A0A(AnonymousClass8LC r10, String str) {
        String str2 = str;
        try {
            return A09(r10, A0F(str, "ZZ"));
        } catch (C143616zC e) {
            if (e.errorType == C141916wL.INVALID_COUNTRY_CODE) {
                String A0G2 = A0G(r10.countryCode_);
                try {
                    if (!A0G2.equals("ZZ")) {
                        C140886ug A092 = A09(r10, A0F(str, A0G2));
                        if (A092 == C140886ug.EXACT_MATCH) {
                            return C140886ug.NSN_MATCH;
                        }
                        return A092;
                    }
                    AnonymousClass8LC r4 = new AnonymousClass8LC();
                    A0I(r4, str2, (String) null, false, false);
                    return A09(r10, r4);
                } catch (C143616zC unused) {
                    return C140886ug.NOT_A_NUMBER;
                }
            }
            return C140886ug.NOT_A_NUMBER;
        }
    }

    public final C141066uy A0B(C172308Km r3, String str) {
        C172288Kk r1 = r3.generalDesc_;
        if (r1.hasNationalNumberPattern && A0L(r1, str)) {
            if (A0L(r3.personalNumber_, str)) {
                return C141066uy.PERSONAL_NUMBER;
            }
            if (A0L(r3.tollFree_, str)) {
                return C141066uy.TOLL_FREE;
            }
            if (A0L(r3.sharedCost_, str)) {
                return C141066uy.SHARED_COST;
            }
            if (A0L(r3.voip_, str)) {
                return C141066uy.VOIP;
            }
            if (A0L(r3.premiumRate_, str)) {
                return C141066uy.PREMIUM_RATE;
            }
            if (A0L(r3.pager_, str)) {
                return C141066uy.PAGER;
            }
            if (A0L(r3.uan_, str)) {
                return C141066uy.UAN;
            }
            if (A0L(r3.voicemail_, str)) {
                return C141066uy.VOICEMAIL;
            }
            boolean A0L2 = A0L(r3.fixedLine_, str);
            boolean z = r3.sameMobileAndFixedLinePattern_;
            if (A0L2) {
                if (z || A0L(r3.mobile_, str)) {
                    return C141066uy.FIXED_LINE_OR_MOBILE;
                }
                return C141066uy.FIXED_LINE;
            } else if (!z && A0L(r3.mobile_, str)) {
                return C141066uy.MOBILE;
            }
        }
        return C141066uy.UNKNOWN;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return (X.C172308Km) r2.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C172308Km A0D(int r4) {
        /*
            r3 = this;
            java.util.Map r2 = r3.A03
            monitor-enter(r2)
            java.util.Map r0 = r3.A02     // Catch:{ all -> 0x0025 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            r0 = 0
            return r0
        L_0x0012:
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "001"
            r3.A0J(r0, r4)     // Catch:{ all -> 0x0025 }
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r2.get(r1)
            X.8Km r0 = (X.C172308Km) r0
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162167rN.A0D(int):X.8Km");
    }

    public C172308Km A0E(String str) {
        if (str == null || !this.A07.contains(str)) {
            return null;
        }
        Map map = this.A04;
        C172308Km r0 = (C172308Km) map.get(str);
        if (r0 != null) {
            return r0;
        }
        synchronized (map) {
            if (!map.containsKey(str)) {
                A0J(str, 0);
            }
        }
        return (C172308Km) map.get(str);
    }

    public AnonymousClass8LC A0F(String str, String str2) {
        AnonymousClass8LC r1 = new AnonymousClass8LC();
        A0I(r1, str, str2, false, true);
        return r1;
    }

    public String A0G(int i) {
        List list = (List) AnonymousClass001.A0i(this.A02, i);
        if (list == null) {
            return "ZZ";
        }
        return (String) C18290x4.A0k(list);
    }

    public String A0H(C141026uu r8, AnonymousClass8LC r9) {
        C172308Km A0E2;
        List list;
        int ordinal;
        String str;
        if (r9.nationalNumber_ == 0 && r9.hasRawInput) {
            String str2 = r9.rawInput_;
            if (str2.length() > 0) {
                return str2;
            }
        }
        StringBuilder A0Y = AnonymousClass6CA.A0Y(20);
        A0Y.setLength(0);
        int i = r9.countryCode_;
        String A012 = A01(r9);
        if (r8 == C141026uu.E164) {
            A0Y.append(A012);
            ordinal = 0;
        } else if (!this.A02.containsKey(Integer.valueOf(i))) {
            A0Y.append(A012);
            return A0Y.toString();
        } else {
            String A0G2 = A0G(i);
            if ("001".equals(A0G2)) {
                A0E2 = A0D(i);
            } else {
                A0E2 = A0E(A0G2);
            }
            C626936e.A06(A0E2);
            if (A0E2.intlNumberFormat_.size() != 0) {
                list = A0E2.intlNumberFormat_;
            } else {
                list = A0E2.numberFormat_;
            }
            C172298Kl A0C2 = A0C(A012, list);
            if (A0C2 != null) {
                A012 = this.A00.A00(A0C2.pattern_).matcher(A012).replaceAll(A0C2.format_);
            }
            A0Y.append(A012);
            if (r9.hasExtension) {
                String str3 = r9.extension_;
                if (str3.length() > 0) {
                    if (A0E2.hasPreferredExtnPrefix) {
                        str = A0E2.preferredExtnPrefix_;
                    } else {
                        str = " ext. ";
                    }
                    A0Y.append(str);
                    A0Y.append(str3);
                }
            }
            ordinal = r8.ordinal();
        }
        if (ordinal != 0) {
            A0Y.insert(0, " ");
        }
        A0Y.insert(0, i);
        A0Y.insert(0, '+');
        return A0Y.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.AnonymousClass8LC r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0241
            int r1 = r14.length()
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 > r0) goto L_0x0237
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = ";phone-context="
            int r4 = r14.indexOf(r0)
            if (r4 <= 0) goto L_0x00f7
            int r2 = r4 + 15
            char r1 = r14.charAt(r2)
            r0 = 43
            if (r1 != r0) goto L_0x002f
            r0 = 59
            int r0 = r14.indexOf(r0, r2)
            if (r0 <= 0) goto L_0x00f1
            java.lang.String r0 = r14.substring(r2, r0)
        L_0x002c:
            r3.append(r0)
        L_0x002f:
            java.lang.String r0 = "tel:"
            int r0 = r14.indexOf(r0)
            int r0 = r0 + 4
            java.lang.String r6 = r14.substring(r0, r4)
        L_0x003b:
            r3.append(r6)
            java.lang.String r0 = ";isub="
            int r1 = r3.indexOf(r0)
            if (r1 <= 0) goto L_0x004d
            int r0 = r3.length()
            r3.delete(r1, r0)
        L_0x004d:
            java.lang.String r2 = r3.toString()
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto L_0x022d
            java.util.regex.Pattern r4 = A0P
            boolean r0 = X.C18280x3.A1X(r2, r4)
            if (r0 == 0) goto L_0x022d
            r6 = r12
            if (r17 == 0) goto L_0x0071
            java.lang.String r1 = r3.toString()
            if (r15 == 0) goto L_0x00d3
            java.util.Set r0 = r12.A07
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L_0x00d3
        L_0x0071:
            r8 = r13
            r11 = r16
            if (r16 == 0) goto L_0x007b
            r0 = 1
            r13.hasRawInput = r0
            r13.rawInput_ = r14
        L_0x007b:
            java.util.regex.Pattern r0 = A0E
            java.util.regex.Matcher r5 = r0.matcher(r3)
            boolean r0 = r5.find()
            if (r0 == 0) goto L_0x00d0
            r1 = 0
            int r0 = r5.start()
            java.lang.String r2 = r3.substring(r1, r0)
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto L_0x00d0
            boolean r0 = X.C18280x3.A1X(r2, r4)
            if (r0 == 0) goto L_0x00d0
            int r2 = r5.groupCount()
            r1 = 1
        L_0x00a2:
            if (r1 > r2) goto L_0x00d0
            java.lang.String r0 = r5.group(r1)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r2 = r5.group(r1)
            int r1 = r5.start()
            int r0 = r3.length()
            r3.delete(r1, r0)
        L_0x00b9:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00c4
            r0 = 1
            r13.hasExtension = r0
            r13.extension_ = r2
        L_0x00c4:
            X.8Km r7 = r12.A0E(r15)
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()
            goto L_0x014b
        L_0x00cd:
            int r1 = r1 + 1
            goto L_0x00a2
        L_0x00d0:
            java.lang.String r2 = ""
            goto L_0x00b9
        L_0x00d3:
            if (r1 == 0) goto L_0x00e7
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00e7
            java.util.regex.Pattern r0 = A0K
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.lookingAt()
            if (r0 != 0) goto L_0x0071
        L_0x00e7:
            X.6wL r2 = X.C141916wL.INVALID_COUNTRY_CODE
            java.lang.String r1 = "Missing or invalid default region."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x00f1:
            java.lang.String r0 = r14.substring(r2)
            goto L_0x002c
        L_0x00f7:
            java.util.regex.Pattern r0 = A0Q
            java.util.regex.Matcher r1 = r0.matcher(r14)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0147
            int r0 = r1.start()
            java.lang.String r6 = r14.substring(r0)
            java.util.regex.Pattern r0 = A0N
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            r5 = 0
            if (r0 == 0) goto L_0x0131
            int r0 = r1.start()
            java.lang.String r6 = r6.substring(r5, r0)
            java.util.logging.Logger r4 = A0B
            java.util.logging.Level r2 = java.util.logging.Level.FINER
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Stripped trailing characters: "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r1)
            r4.log(r2, r0)
        L_0x0131:
            java.util.regex.Pattern r0 = A0L
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x003b
            int r0 = r1.start()
            java.lang.String r6 = r6.substring(r5, r0)
            goto L_0x003b
        L_0x0147:
            java.lang.String r6 = ""
            goto L_0x003b
        L_0x014b:
            java.lang.String r9 = r3.toString()     // Catch:{ 6zC -> 0x016f }
            int r4 = r6.A07(r7, r8, r9, r10, r11)     // Catch:{ 6zC -> 0x016f }
            if (r4 != 0) goto L_0x019c
            A06(r3)
            r10.append(r3)
            if (r15 == 0) goto L_0x0165
            int r1 = r7.countryCode_
            r0 = 1
            r13.hasCountryCode = r0
            r13.countryCode_ = r1
            goto L_0x01b2
        L_0x0165:
            if (r16 == 0) goto L_0x01b2
            r0 = 0
            r13.hasCountryCodeSource = r0
            X.6w0 r0 = X.C141706w0.FROM_NUMBER_WITH_PLUS_SIGN
            r13.countryCodeSource_ = r0
            goto L_0x01b2
        L_0x016f:
            r4 = move-exception
            java.util.regex.Pattern r1 = A0K
            java.lang.String r0 = r3.toString()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            X.6wL r0 = r4.errorType
            X.6wL r2 = X.C141916wL.INVALID_COUNTRY_CODE
            if (r0 != r2) goto L_0x0221
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0221
            int r0 = r1.end()
            java.lang.String r9 = r3.substring(r0)
            int r4 = r6.A07(r7, r8, r9, r10, r11)
            if (r4 != 0) goto L_0x019c
            java.lang.String r1 = "Could not interpret numbers after plus-sign."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x019c:
            java.lang.String r1 = r12.A0G(r4)
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0202
            X.8Km r7 = r12.A0D(r4)
        L_0x01b2:
            int r0 = r10.length()
            java.lang.String r3 = "The string supplied is too short to be a phone number."
            r2 = 2
            if (r0 < r2) goto L_0x0219
            if (r7 == 0) goto L_0x01d2
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            r12.A0K(r7, r10, r0)
            if (r16 == 0) goto L_0x01d2
            java.lang.String r1 = r0.toString()
            r1.getClass()
            r0 = 1
            r13.hasPreferredDomesticCarrierCode = r0
            r13.preferredDomesticCarrierCode_ = r1
        L_0x01d2:
            int r1 = r10.length()
            if (r1 < r2) goto L_0x0211
            r0 = 16
            if (r1 > r0) goto L_0x0207
            r0 = 0
            char r0 = r10.charAt(r0)
            r2 = 48
            if (r0 != r2) goto L_0x01f4
            r1 = 1
            r13.hasItalianLeadingZero = r1
            r13.italianLeadingZero_ = r1
            char r0 = r10.charAt(r1)
            if (r0 != r2) goto L_0x01f4
            r13.hasSecondLeadingZero = r1
            r13.secondLeadingZero_ = r1
        L_0x01f4:
            java.lang.String r0 = r10.toString()
            long r1 = java.lang.Long.parseLong(r0)
            r0 = 1
            r13.hasNationalNumber = r0
            r13.nationalNumber_ = r1
            return
        L_0x0202:
            X.8Km r7 = r12.A0E(r1)
            goto L_0x01b2
        L_0x0207:
            X.6wL r2 = X.C141916wL.TOO_LONG
            java.lang.String r1 = "The string supplied is too long to be a phone number."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x0211:
            X.6wL r1 = X.C141916wL.TOO_SHORT_NSN
            X.6zC r0 = new X.6zC
            r0.<init>(r1, r3)
            throw r0
        L_0x0219:
            X.6wL r1 = X.C141916wL.TOO_SHORT_NSN
            X.6zC r0 = new X.6zC
            r0.<init>(r1, r3)
            throw r0
        L_0x0221:
            X.6wL r2 = r4.errorType
            java.lang.String r1 = r4.getMessage()
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x022d:
            X.6wL r2 = X.C141916wL.NOT_A_NUMBER
            java.lang.String r1 = "The string supplied did not seem to be a phone number."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x0237:
            X.6wL r2 = X.C141916wL.TOO_LONG
            java.lang.String r1 = "The string supplied was too long to parse."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x0241:
            X.6wL r2 = X.C141916wL.NOT_A_NUMBER
            java.lang.String r1 = "The phone number supplied was null."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162167rN.A0I(X.8LC, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public void A0J(String str, int i) {
        Map map;
        Object obj;
        String str2;
        boolean equals = "001".equals(str);
        C103905Ow A012 = this.A01.A01(str);
        if (A012 == null) {
            A0B.log(Level.WARNING, AnonymousClass000.A0V("phonenumberutil/empty metadata: ", str, AnonymousClass001.A0o()));
            return;
        }
        C172308Km r3 = new C172308Km();
        String str3 = A012.A02;
        r3.hasId = true;
        r3.id_ = str3;
        int i2 = A012.A00;
        r3.hasCountryCode = true;
        r3.countryCode_ = i2;
        String str4 = A012.A01;
        r3.hasInternationalPrefix = true;
        r3.internationalPrefix_ = str4;
        LinkedList A18 = AnonymousClass0x9.A18();
        String[] strArr = A012.A09;
        if (strArr != null) {
            for (int i3 = 0; i3 < strArr.length; i3++) {
                C172298Kl r9 = new C172298Kl();
                String str5 = strArr[i3];
                r9.hasPattern = true;
                r9.pattern_ = str5;
                String str6 = A012.A07[i3];
                r9.hasFormat = true;
                r9.format_ = str6;
                String[] strArr2 = A012.A08;
                if (strArr2 != null && i3 < strArr2.length && (str2 = strArr2[i3]) != null && !str2.equals("N/A")) {
                    for (String str7 : TextUtils.split(strArr2[i3], "#")) {
                        str7.getClass();
                        r9.leadingDigitsPattern_.add(str7);
                    }
                }
                r3.intlNumberFormat_.add(r9);
                r3.numberFormat_.add(r9);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("(");
                A0o.append(r9.pattern_);
                A18.add(AnonymousClass000.A0e(A0o));
            }
        }
        C172288Kk r2 = new C172288Kk();
        String join = TextUtils.join("|", A18);
        r2.hasNationalNumberPattern = true;
        r2.nationalNumberPattern_ = join;
        r2.hasPossibleNumberPattern = true;
        r2.possibleNumberPattern_ = join;
        r3.hasGeneralDesc = true;
        r3.generalDesc_ = r2;
        r3.hasPersonalNumber = true;
        r3.personalNumber_ = r2;
        if (equals) {
            map = this.A03;
            obj = Integer.valueOf(i);
        } else {
            map = this.A04;
            obj = str;
        }
        map.put(obj, r3);
    }

    public final boolean A0L(C172288Kk r4, String str) {
        AnonymousClass7RS r1 = this.A00;
        Matcher matcher = r1.A00(r4.possibleNumberPattern_).matcher(str);
        Matcher matcher2 = r1.A00(r4.nationalNumberPattern_).matcher(str);
        if (!matcher.matches() || !matcher2.matches()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r1 != r0.countryCode_) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(X.AnonymousClass8LC r7) {
        /*
            r6 = this;
            int r5 = r7.countryCode_
            java.util.Map r0 = r6.A02
            java.lang.Object r2 = X.AnonymousClass001.A0i(r0, r5)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x006d
            java.lang.String r4 = A01(r7)
            java.util.logging.Logger r3 = A0B
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Missing/invalid country_code ("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ") for number "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r4, r1)
            r3.log(r2, r0)
        L_0x0029:
            r5 = 0
        L_0x002a:
            int r1 = r7.countryCode_
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0068
            X.8Km r3 = r6.A0D(r1)
        L_0x0038:
            r2 = 0
            if (r3 == 0) goto L_0x0047
            if (r0 != 0) goto L_0x0048
            X.8Km r0 = r6.A0E(r5)
            if (r0 == 0) goto L_0x00b4
            int r0 = r0.countryCode_
            if (r1 == r0) goto L_0x0048
        L_0x0047:
            return r2
        L_0x0048:
            X.8Kk r0 = r3.generalDesc_
            java.lang.String r1 = A01(r7)
            boolean r0 = r0.hasNationalNumberPattern
            if (r0 != 0) goto L_0x005f
            int r1 = r1.length()
            r0 = 2
            if (r1 <= r0) goto L_0x0047
            r0 = 16
            if (r1 > r0) goto L_0x0047
        L_0x005d:
            r2 = 1
            return r2
        L_0x005f:
            X.6uy r1 = r6.A0B(r3, r1)
            X.6uy r0 = X.C141066uy.UNKNOWN
            if (r1 == r0) goto L_0x0047
            goto L_0x005d
        L_0x0068:
            X.8Km r3 = r6.A0E(r5)
            goto L_0x0038
        L_0x006d:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x007b
            java.lang.Object r5 = X.C18290x4.A0k(r2)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x002a
        L_0x007b:
            java.lang.String r4 = A01(r7)
            java.util.Iterator r3 = r2.iterator()
        L_0x0083:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.String r5 = X.AnonymousClass001.A0m(r3)
            X.8Km r2 = r6.A0E(r5)
            if (r2 == 0) goto L_0x0083
            boolean r0 = r2.hasLeadingDigits
            if (r0 == 0) goto L_0x00aa
            X.7RS r1 = r6.A00
            java.lang.String r0 = r2.leadingDigits_
            java.util.regex.Pattern r0 = r1.A00(r0)
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.lookingAt()
            if (r0 == 0) goto L_0x0083
            goto L_0x002a
        L_0x00aa:
            X.6uy r1 = r6.A0B(r2, r4)
            X.6uy r0 = X.C141066uy.UNKNOWN
            if (r1 == r0) goto L_0x0083
            goto L_0x002a
        L_0x00b4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid region code: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162167rN.A0M(X.8LC):boolean");
    }

    public static String A02(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[");
        A0o.append(str);
        A0o.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*");
        A0o.append("(\\p{Nd}{1,7})");
        A0o.append("#?|[- ]+(");
        A0o.append("\\p{Nd}");
        return AnonymousClass000.A0X("{1,5})#", A0o);
    }

    public static String A03(String str) {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                A0Y.append(digit2);
            }
        }
        return A0Y.toString();
    }

    public static ArrayList A04(Object obj, AbstractMap abstractMap, int i, int i2) {
        abstractMap.put(Integer.valueOf(i), obj);
        return new ArrayList(i2);
    }

    public static void A05(Object obj, AbstractMap abstractMap, char c) {
        abstractMap.put(Character.valueOf(c), obj);
    }

    public static void A06(StringBuilder sb) {
        String str;
        String obj = sb.toString();
        if (C18280x3.A1X(obj, A0O)) {
            Map map = A0A;
            int length = obj.length();
            StringBuilder A0Y = AnonymousClass6CA.A0Y(length);
            for (int i = 0; i < length; i++) {
                Object obj2 = map.get(Character.valueOf(Character.toUpperCase(obj.charAt(i))));
                if (obj2 != null) {
                    A0Y.append(obj2);
                }
            }
            str = A0Y.toString();
        } else {
            str = A03(obj);
        }
        sb.replace(0, sb.length(), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f1, code lost:
        if (r1 == X.C140866ue.A02) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.C172308Km r9, X.AnonymousClass8LC r10, java.lang.String r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r11.length()
            r4 = 0
            if (r0 == 0) goto L_0x0116
            java.lang.StringBuilder r5 = X.C18330xA.A0A(r11)
            if (r9 == 0) goto L_0x0093
            java.lang.String r2 = r9.internationalPrefix_
        L_0x000f:
            int r0 = r5.length()
            if (r0 == 0) goto L_0x008a
            java.util.regex.Pattern r0 = A0K
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0052
            int r0 = r1.end()
            r5.delete(r4, r0)
            A06(r5)
            X.6w0 r1 = X.C141706w0.FROM_NUMBER_WITH_PLUS_SIGN
        L_0x002d:
            if (r13 == 0) goto L_0x0037
            r1.getClass()
            r0 = 1
            r10.hasCountryCodeSource = r0
            r10.countryCodeSource_ = r1
        L_0x0037:
            X.6w0 r0 = X.C141706w0.FROM_DEFAULT_COUNTRY
            if (r1 == r0) goto L_0x00a1
            int r1 = r5.length()
            r0 = 2
            if (r1 <= r0) goto L_0x0097
            int r2 = r8.A08(r5, r12)
            if (r2 != 0) goto L_0x00ff
            X.6wL r2 = X.C141916wL.INVALID_COUNTRY_CODE
            java.lang.String r1 = "Country calling code supplied was not recognised."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x0052:
            X.7RS r0 = r8.A00
            java.util.regex.Pattern r0 = r0.A00(r2)
            A06(r5)
            java.util.regex.Matcher r1 = r0.matcher(r5)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x008a
            int r3 = r1.end()
            java.util.regex.Pattern r1 = A0C
            java.lang.String r0 = r5.substring(r3)
            java.util.regex.Matcher r2 = r1.matcher(r0)
            boolean r1 = r2.find()
            r0 = 1
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = r2.group(r0)
            java.lang.String r1 = A03(r0)
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008d
        L_0x008a:
            X.6w0 r1 = X.C141706w0.FROM_DEFAULT_COUNTRY
            goto L_0x002d
        L_0x008d:
            r5.delete(r4, r3)
            X.6w0 r1 = X.C141706w0.FROM_NUMBER_WITH_IDD
            goto L_0x002d
        L_0x0093:
            java.lang.String r2 = "NonMatch"
            goto L_0x000f
        L_0x0097:
            X.6wL r2 = X.C141916wL.TOO_SHORT_AFTER_IDD
            java.lang.String r1 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            X.6zC r0 = new X.6zC
            r0.<init>(r2, r1)
            throw r0
        L_0x00a1:
            if (r9 == 0) goto L_0x0111
            int r2 = r9.countryCode_
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r5.toString()
            boolean r0 = r1.startsWith(r3)
            if (r0 == 0) goto L_0x0111
            int r0 = r3.length()
            java.lang.String r0 = r1.substring(r0)
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r0)
            X.8Kk r7 = r9.generalDesc_
            X.7RS r1 = r8.A00
            java.lang.String r0 = r7.nationalNumberPattern_
            java.util.regex.Pattern r6 = r1.A00(r0)
            r0 = 0
            r8.A0K(r9, r3, r0)
            java.lang.String r0 = r7.possibleNumberPattern_
            java.util.regex.Pattern r1 = r1.A00(r0)
            boolean r0 = X.C18280x3.A1X(r5, r6)
            if (r0 != 0) goto L_0x00df
            boolean r0 = X.C18280x3.A1X(r3, r6)
            if (r0 != 0) goto L_0x00f3
        L_0x00df:
            java.lang.String r0 = r5.toString()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x0105
            X.6ue r1 = X.C140866ue.IS_POSSIBLE
        L_0x00ef:
            X.6ue r0 = X.C140866ue.TOO_LONG
            if (r1 != r0) goto L_0x0111
        L_0x00f3:
            r12.append(r3)
            if (r13 == 0) goto L_0x00ff
            X.6w0 r1 = X.C141706w0.FROM_NUMBER_WITHOUT_PLUS_SIGN
            r0 = 1
            r10.hasCountryCodeSource = r0
            r10.countryCodeSource_ = r1
        L_0x00ff:
            r0 = 1
            r10.hasCountryCode = r0
            r10.countryCode_ = r2
            return r2
        L_0x0105:
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x010e
            X.6ue r1 = X.C140866ue.TOO_LONG
            goto L_0x00ef
        L_0x010e:
            X.6ue r1 = X.C140866ue.TOO_SHORT
            goto L_0x00ef
        L_0x0111:
            r0 = 1
            r10.hasCountryCode = r0
            r10.countryCode_ = r4
        L_0x0116:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162167rN.A07(X.8Km, X.8LC, java.lang.String, java.lang.StringBuilder, boolean):int");
    }

    public int A08(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i = 1;
            while (i <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (!this.A02.containsKey(Integer.valueOf(parseInt))) {
                    i++;
                    if (i > 3) {
                        break;
                    }
                } else {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public C172298Kl A0C(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C172298Kl r3 = (C172298Kl) it.next();
            int size = r3.leadingDigitsPattern_.size();
            if (size != 0) {
                if (!this.A00.A00(AnonymousClass001.A0n(r3.leadingDigitsPattern_, size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (C18280x3.A1X(str, this.A00.A00(r3.pattern_))) {
                return r3;
            }
        }
        return null;
    }

    public boolean A0K(C172308Km r11, StringBuilder sb, StringBuilder sb2) {
        int length = sb.length();
        String str = r11.nationalPrefixForParsing_;
        if (!(length == 0 || str.length() == 0)) {
            AnonymousClass7RS r2 = this.A00;
            Matcher matcher = r2.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A002 = r2.A00(r11.generalDesc_.nationalNumberPattern_);
                boolean A1X = C18280x3.A1X(sb, A002);
                int groupCount = matcher.groupCount();
                String str2 = r11.nationalPrefixTransformRule_;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!A1X || C18280x3.A1X(sb3.toString(), A002)) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                } else if (A1X && !C18280x3.A1X(sb.substring(matcher.end()), A002)) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }
}
