package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7nA  reason: invalid class name and case insensitive filesystem */
public abstract class C160177nA {
    public static Map A00 = AnonymousClass001.A0t();

    public abstract int A03(double d, int i, int i2, long j, long j2, long j3);

    public static AnonymousClass90A A00(int i) {
        return new AnonymousClass90A(i);
    }

    public static void A01(C160177nA r8, String str) {
        for (String str2 : str.split(" ")) {
            Map map = A00;
            map.put(str2, r8);
            if ("pt_PT".equals(str2)) {
                Iterator it = AnonymousClass799.A00.iterator();
                while (it.hasNext()) {
                    map.put(AnonymousClass000.A0V("pt_", AnonymousClass001.A0m(it), AnonymousClass001.A0o()), r8);
                }
            }
        }
    }

    public static void A02(Object obj, Object obj2) {
        A00.put(obj, obj2);
    }

    static {
        A01(A00(10), "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt lo ms my nqo osa root sah ses sg su th to vi wo yo yue zh");
        A01(A00(21), "am as bn fa gu hi kn zu");
        A01(A00(29), "ff fr hy kab");
        A02("pt", A00(30));
        A01(A00(31), "ast ca de en et fi fy gl ia io it ji nl pt_PT sc scn sv sw ur yi");
        A02("si", A00(32));
        A01(A00(33), "ak bho guw ln mg nso pa ti wa");
        A02("tzm", A00(34));
        A01(A00(35), "af an asa az bem bez bg brx ce cgg chr ckb dv ee el eo es eu fo fur gsw ha haw hu jgo jmc ka kaj kcg kk kkj kl ks ksb ku ky lb lg mas mgo ml mn mr nah nb nd ne nn nnh no nr ny nyn om or os pap ps rm rof rwk saq sd sdh seh sn so sq ss ssy st syr ta te teo tig tk tn tr ts ug uz ve vo vun wae xh xog");
        A02("da", A00(0));
        A02("is", A00(1));
        A02("mk", A00(2));
        A01(A00(3), "ceb fil tl");
        A01(A00(4), "lv prg");
        A02("lag", A00(5));
        A02("ksh", A00(6));
        A01(A00(7), "iu naq se sma smi smj smn sms");
        A02("shi", A00(8));
        A01(A00(9), "mo ro");
        A01(A00(11), "bs hr sh sr");
        A02("gd", A00(12));
        A02("sl", A00(13));
        A01(A00(14), "dsb hsb");
        A01(A00(15), "he iw");
        A01(A00(16), "cs sk");
        A02("pl", A00(17));
        A02("be", A00(18));
        A02("lt", A00(19));
        A02("mt", A00(20));
        A01(A00(22), "ru uk");
        A02("br", A00(23));
        A02("ga", A00(24));
        A02("gv", A00(25));
        A02("kw", A00(26));
        A01(A00(27), "ar ars");
        A02("cy", A00(28));
    }
}
