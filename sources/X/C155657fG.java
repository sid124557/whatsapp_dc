package X;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: X.7fG  reason: invalid class name and case insensitive filesystem */
public class C155657fG {
    public static Pattern A00 = Pattern.compile("^[a-z0-9\\-]+$");
    public static final SparseArray A01;
    public static final C150517Rb A02;
    public static final HashSet A03;
    public static final HashSet A04 = C18280x3.A0h(new String[]{"AM", "AZ", "BY", "BA", "BG", "GE", "KZ", "XK", "KG", "MK", "MD", "MN", "ME", "RU", "RS", "TJ", "TM", "UA", "UZ"});
    public static final HashSet A05 = C18280x3.A0h(new String[]{"abq", "ab", "ady", "av", "az", "ba", "be", "bs", "bg", "bua", "ce", "ckt", "cu", "cv", "crh", "dar", "dng", "myv", "evn", "gag", "inh", "kbd", "xal", "krc", "kaa", "kk", "kjh", "kca", "ky", "kv", "koi", "kpy", "kum", "lbe", "lez", "mk", "mns", "chm", "mdf", "mn", "ttt", "gld", "yrk", "nog", "os", "ru", "rue", "sr", "sh", "cjs", "alt", "tab", "tg", "tt", "tkr", "tk", "tyv", "ude", "udm", "uk", "uz", "mrj", "sah"});

    static {
        C150517Rb r0 = new C150517Rb();
        A02 = r0;
        r0.A00("fub", "CM", "TD", "NG");
        r0.A00("af", "NA", "ZA");
        A01(r0, "CM", "agq");
        A01(r0, "NG", "yay");
        A01(r0, "CM", "bss");
        r0.A00("agg", "PG");
        r0.A00("ast", "ES");
        r0.A00("avu", "CD", "SS");
        r0.A00("az", "AZ");
        r0.A00("bkc", "CM", "GA");
        A01(r0, "CM", "ksf");
        A01(r0, "CM", "bfd");
        r0.A00("bjt", "SN");
        A01(r0, "NG", "bcn");
        A01(r0, "CM", "bas");
        r0.A00("bsq", "LR");
        A01(r0, "NG", "bkv");
        A01(r0, "NG", "bom");
        A01(r0, "NG", "btt");
        A01(r0, "NG", "bin");
        r0.A00("bmq", "BF", "ML");
        r0.A00("bs", "BA", "HR", "XK", "ME", "RS");
        r0.A00("fue", "BJ", "TG");
        r0.A00("br", "FR");
        A01(r0, "NG", "bys");
        A01(r0, "NG", "bwr");
        A01(r0, "NG", "cky");
        r0.A00("ca", "AD", "FR", "IT", "ES");
        r0.A00("tzm", "MA");
        A01(r0, "NG", "fuq");
        A01(r0, "NG", "ckl");
        A01(r0, "NG", "asg");
        A02(r0, "FR", "IT", "co");
        r0.A00("crh", "RU");
        r0.A00("hr", "BA", "HR", "XK", "ME", "RS");
        A01(r0, "NG", "mfn");
        r0.A00("cs", "CZ", "SK");
        A02(r0, "CM", "NG", "dbq");
        r0.A00("dnj", "CI", "LR");
        r0.A00("dzg", "TD", "NE");
        A01(r0, "BJ", "ddn");
        A01(r0, "NG", "dgh");
        A01(r0, "CM", "dow");
        A01(r0, "CM", "dua");
        r0.A00("nl", "AW", "BE", "CW", "NL", "SX", "SR");
        A01(r0, "NG", "igb");
        A01(r0, "PG", "etr");
        A01(r0, "NG", "enn");
        A01(r0, "PG", "kjy");
        r0.A00("et", "EE");
        A01(r0, "NG", "ich");
        r0.A00("ee", "BJ", "GH", "TG");
        A01(r0, "CM", "ewo");
        r0.A00("fo", "FO");
        A01(r0, "CM", "fmp");
        r0.A00("fi", "FI", "SE");
        r0.A00("fr", "BE", "BJ", "BF", "BI", "CM", "CA", "CF", "CG", "CD", "TD", "KM", "DJ", "GQ", "FR", "GA", "HT", "CI", "LU", "MG", "ML", "MC", "NE", "RW", "SN", "SC", "CH", "TG", "VU");
        A01(r0, "IT", "fur");
        r0.A00("ff", "CM", "GN", "MR", "SN");
        A01(r0, "PG", "gaj");
        A01(r0, "ES", "gl");
        A01(r0, "NG", "gby");
        r0.A00("gba", "CF");
        A01(r0, "CM", "gmm");
        r0.A00("de", "AT", "BE", "DE", "LI", "LU", "CH");
        A01(r0, "PG", "tof");
        r0.A00("god", "CI");
        A01(r0, "NG", "ank");
        A01(r0, "NG", "gkn");
        r0.A00("gux", "BJ", "BF", "NE", "TG");
        A02(r0, "CM", "NG", "gde");
        r0.A00("gkp", "GN");
        r0.A00("kl", "GL");
        A01(r0, "NG", "jgk");
        r0.A00("ha", "BJ", "CM", "TD", "GH", "CI", "NE", "NG", "SD", "TG");
        r0.A00("haw", "US");
        A01(r0, "NG", "hbb");
        r0.A00("hu", "HU");
        A01(r0, "NG", "dud");
        A01(r0, "NG", "jab");
        A01(r0, "NG", "iby");
        r0.A00("is", "IS");
        A01(r0, "NG", "idu");
        r0.A00("ig", "GQ");
        A01(r0, "NG", "ige");
        r0.A00("ikx", "UG");
        A01(r0, "NG", "ikk");
        A01(r0, "NG", "ikw");
        r0.A00("smn", "FI");
        r0.A00("ga", "IE", "GB");
        A01(r0, "NG", "atg");
        A01(r0, "NG", "izi");
        r0.A00("dyo", "GM", "SN");
        A02(r0, "CM", "NG", "jbu");
        r0.A00("kab", "DZ");
        r0.A00("kea", "CV");
        A01(r0, "PG", "tbd");
        A01(r0, "NG", "hig");
        A01(r0, "NG", "kai");
        r0.A00("kkj", "CM", "CF", "CG");
        A02(r0, "CM", "TD", "kzr");
        r0.A00("naq", "NA");
        A01(r0, "PG", "geb");
        A01(r0, "NG", "okr");
        r0.A00("ksh", "DE");
        A01(r0, "ML", "ses");
        A01(r0, "ML", "khq");
        r0.A00("kun", "ER", "ET");
        A01(r0, "PG", "kup");
        A02(r0, "CM", "NG", "kub");
        r0.A00("kpe", "GN", "LR");
        r0.A00("nmg", "CM", "GQ");
        r0.A00("ku", "SY", "TR");
        r0.A00("lkt", "US");
        A01(r0, "NG", "hia");
        r0.A00("lag", "TZ");
        r0.A00("lv", "LV");
        A01(r0, "CM", "lmp");
        r0.A00("ln", "CG", "CD");
        r0.A00("liv", new String[0]);
        r0.A00("lt", "LT");
        A01(r0, "NG", "yaz");
        r0.A00("nds", "BR", "DE", "NL");
        A01(r0, "DE", "dsb");
        A01(r0, "CD", "lu");
        r0.A00("lb", "BE", "FR", "DE", "LU");
        A01(r0, "NG", "mda");
        r0.A00("mg", "MG");
        r0.A00("mt", "MT");
        r0.A00("mi", "NZ");
        r0.A00("arn", "CL");
        r0.A00("mas", "KE", "TZ");
        A01(r0, "ML", "bin");
        A02(r0, "BJ", "TG", "mql");
        A01(r0, "CM", "mbo");
        A01(r0, "NG", "mbu");
        A01(r0, "CM", "mif");
        A01(r0, "NG", "mzm");
        A02(r0, "CM", "TD", "mua");
        A01(r0, "NG", "sur");
        r0.A00("nv", "US");
        A01(r0, "NG", "anc");
        A01(r0, "CM", "nnh");
        A01(r0, "CM", "jgo");
        A02(r0, "CM", "NG", "fuv");
        A01(r0, "NG", "nin");
        A01(r0, "BF", "dgi");
        r0.A00("se", "FI", "SE", "NO");
        r0.A00("nso", "ZA");
        A01(r0, "NG", "ann");
        r0.A00("oc", "FR", "IT", "MC", "ES");
        A01(r0, "CM", "pbi");
        A01(r0, "NG", "pip");
        r0.A00("pl", "PL");
        r0.A00("pt", "AO", "BR", "CV", "GQ", "GW", "MO", "MZ", "PT", "ST", "TL");
        r0.A00("prg", new String[0]);
        r0.A00("fuf", "GN", "ML", "SN", "SL");
        r0.A00("qu", "AR", "BO", "CO", "EC", "PE");
        r0.A00("ro", "MD", "RO");
        A01(r0, "NG", "cla");
        A01(r0, "SN", "sav");
        r0.A00("sg", "CF", "TD", "CD");
        r0.A00("gd", "GB");
        r0.A00("seh", "MZ");
        String str = "BA";
        String str2 = "HR";
        String str3 = "XK";
        r0.A00("sr", str, str2, str3, "ME", "RS");
        r0.A00("sh", str, str2, str3, "ME", "RS");
        r0.A00("srr", "GM", "SN");
        A01(r0, "IT", "scn");
        A01(r0, "BF", "sld");
        r0.A00("sms", "FI");
        r0.A00("sk", "CZ", "SK");
        r0.A00("sl", "SI");
        A01(r0, "TD", "sok");
        r0.A00("es", "AR", "BZ", "BO", "IC", "EA", "CL", "CO", "CR", "CU", "DO", "EC", "SV", "GQ", "GT", "HN", "MX", "NI", "PA", "PY", "PE", "PR", "ES", "US", "UY", "VE");
        r0.A00("srn", "SR");
        r0.A00("gsw", "AT", "FR", "DE", "LI", "CH");
        r0.A00("shi", "MA");
        A01(r0, "NG", "tal");
        A01(r0, "ML", "tmh");
        A02(r0, "BF", "ML", "taq");
        A01(r0, "NG", "tan");
        A01(r0, "NE", "twq");
        r0.A00("blt", "LA", "VN");
        A01(r0, "NG", "yer");
        r0.A00("tuq", "TD", "LY", "NE", "NG");
        A01(r0, "NG", "ttr");
        A01(r0, "CM", "tik");
        r0.A00("to", "TO");
        A01(r0, "ML", "dts");
        A01(r0, "NG", "kdl");
        A01(r0, "NG", "tsw");
        r0.A00("tr", "TR");
        r0.A00("tk", "TM");
        A01(r0, "DE", "hsb");
        r0.A00("vai", "LR", "SL");
        r0.A00("vi", "KH", "VN");
        r0.A00("vo", new String[0]);
        A02(r0, "CM", "NG", "vut");
        A01(r0, "NG", "wja");
        r0.A00("wa", "BE");
        r0.A00("wae", "AT", "IT", "LI", "CH");
        A01(r0, "NG", "wji");
        r0.A00("cy", "GB");
        r0.A00("fy", "NL");
        r0.A00("fuh", "BJ", "BF", "NE");
        A01(r0, "NG", "yba");
        A01(r0, "CM", "yav");
        A01(r0, "PG", "yle");
        A01(r0, "PG", "yll");
        A02(r0, "BJ", "NG", "yo");
        A01(r0, "NE", "dje");
        A01(r0, "CM", "gnd");
        SparseArray A0I = AnonymousClass6CA.A0I();
        A01 = A0I;
        String str4 = "fr";
        String str5 = "kkj";
        A0I.append(237, new AnonymousClass5HZ("ast", "ksf", "bas", "ca", "cs", "dua", "nl", "ee", "ewo", "fo", str4, "gl", "kl", "hu", "is", "ga", "dyo", "kea", str5, "nmg", "lkt", "lag", "ln", "lu", "mas", "nnh", "jgo", "pt", "qu", "seh", "sk", "es", "to", "vai", "vi", "wae", "cy", "fy", "yav", "yo"));
        String str6 = "nl";
        A0I.append(238, new AnonymousClass5HZ("af", "agq", "bss", "bfd", "bas", "bkv", "btt", str6, "igb", "ewo", str4, "fur", "gaj", "gby", "kl", "jab", "atg", "jbu", str5, "naq", "ksh", "ku", "nmg", "lmp", "ln", "mda", "mg", "mas", "mzm", "jgo", "nin", "ann", "ro", "sg", "scn", "srn", "yer", "tr", "wa", "cy", "yav", "yle"));
        A0I.append(267, A00(A0I, new AnonymousClass5HZ("agg", "ast", "az", "br", "ca", "co", "cs", str6, "etr", "et", str4, "gl", "de", "tof", "god", "hu", "tbd", "geb", "ksh", "kup", "nds", "lb", "arn", "oc", "sg", "sk", "es", "gsw", "dts", "tr", "tk", "vo", "wa", "wae", "fy", "yll"), "mt", 252));
        A0I.append(299, new AnonymousClass5HZ("agq", "bss", "bfd", "bas", "bkv", "btt", "ddn", "igb", "kjy", "ich", "gux", "haw", "jab", "iby", "idu", "jbu", "kub", "nmg", "lv", "mda", "mi", "mas", "mql", "nin", "prg", "gd", "to", "yba", "yav"));
        A0I.append(316, A00(A0I, new AnonymousClass5HZ("az", "crh", "tr"), "lv", 305));
        String str7 = "dsb";
        A0I.append(322, new AnonymousClass5HZ(str7, "nv", "pl", "hsb"));
        A0I.append(353, new AnonymousClass5HZ("bs", "hr", "cs", "dzg", "et", "fi", "smn", "geb", "khq", "ses", "kun", "lkt", "lv", "lt", str7, "se", "nso", "prg", "sr", "sh", "sms", "sk", "sl", "taq", "twq", "tuq", "hsb", "wae", "dje"));
        String str8 = "naq";
        A0I.append(559, A00(A0I, A00(A0I, A00(A0I, new AnonymousClass5HZ("ckl", "ank", "ha", "ikx", "kai", "hia", "mbu", "anc", "nin", "pip", "tal", "tan", "wja", "wji"), str8, 409), str8, 448), "liv", 449));
        A0I.append(593, new AnonymousClass5HZ("fmp", "dud", "tmh"));
        A0I.append(595, new AnonymousClass5HZ("fub", "yay", "bkc", "bjt", "bcn", "bas", "bsq", "bmq", "fue", "bys", "bwr", "cky", "fuq", "ckl", "asg", "dbq", "dnj", "dgh", "dow", "dua", "enn", "ff", "gby", "gba", "gmm", "ank", "gde", "gkp", "jgk", "ha", "hbb", "ikx", "kkj", "hig", "kzr", "kai", "kpe", "nmg", "hia", "bin", "mbo", "mbu", "mif", "mzm", "mua", "sur", "anc", "fuv", "nin", "dgi", "pbi", "pip", "fuf", "cla", "sav", "srr", "sld", "sok", "tal", "tan", "yer", "ttr", "tik", "kdl", "tsw", "vai", "vut", "wja", "wji", "fuh", "gnd"));
        String str9 = "tzm";
        String str10 = "kab";
        String str11 = "okr";
        A0I.append(7693, new AnonymousClass5HZ(str9, str10, str11, "shi", "tmh", "taq"));
        A0I.append(7771, new AnonymousClass5HZ(str9, str10, "shi"));
        A0I.append(7789, new AnonymousClass5HZ(str9, str10, "shi", "tmh", "taq"));
        A0I.append(7817, new AnonymousClass5HZ(new String[0]));
        A0I.append(7841, new AnonymousClass5HZ("izi", "yaz", "blt", "vi"));
        A0I.append(7865, new AnonymousClass5HZ("yay", "bom", "bin", "mfn", "dzg", "igb", "enn", "gkn", "iby", "ikk", "ikw", "izi", str11, "yaz", "blt", "tan", "tuq", "vi", "yo"));
        A0I.append(7883, new AnonymousClass5HZ("avu", "mfn", "igb", "enn", "iby", "ig", "ige", "ikk", "ikw", "izi", "okr", "blt", "tan", "vi"));
        Integer[] numArr = new Integer[29];
        AnonymousClass000.A1L(numArr, 1072);
        AnonymousClass000.A1M(numArr, 1074);
        AnonymousClass000.A1N(numArr, 1075);
        AnonymousClass000.A1O(numArr, 1077);
        C18280x3.A1P(numArr, 1082);
        C18310x6.A1U(numArr, 1084);
        C18290x4.A1U(numArr, 1085);
        numArr[7] = 1086;
        numArr[8] = 1088;
        numArr[9] = 1089;
        numArr[10] = 1090;
        numArr[11] = 1091;
        numArr[12] = 1093;
        numArr[13] = 1096;
        numArr[14] = 1097;
        numArr[15] = 1100;
        numArr[16] = 1109;
        numArr[17] = 1110;
        numArr[18] = 1112;
        numArr[19] = 1121;
        numArr[20] = 1141;
        numArr[21] = 1199;
        numArr[22] = 1211;
        numArr[23] = 1231;
        numArr[24] = 1281;
        numArr[25] = 1307;
        numArr[26] = 1309;
        numArr[27] = 1319;
        numArr[28] = 42649;
        A03 = C18280x3.A0h(numArr);
    }

    public static AnonymousClass5HZ A00(SparseArray sparseArray, Object obj, String str, int i) {
        sparseArray.append(i, obj);
        return new AnonymousClass5HZ(str);
    }

    public static void A01(C150517Rb r1, String str, String str2) {
        r1.A00(str2, str);
    }

    public static void A02(C150517Rb r1, String str, String str2, String str3) {
        r1.A00(str3, str, str2);
    }
}
