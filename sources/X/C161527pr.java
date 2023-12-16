package X;

/* renamed from: X.7pr  reason: invalid class name and case insensitive filesystem */
public class C161527pr {
    public static C166557yt A01(Object obj, String str) {
        return new C166557yt(AnonymousClass3QD.A00(), String.class, obj, str);
    }

    public static boolean A02(C166557yt r1) {
        if (r1 == null || r1.A01()) {
            return true;
        }
        return false;
    }

    public static boolean A03(C166557yt r1) {
        if (r1 == null || r1.A00 == null) {
            return true;
        }
        return false;
    }

    public static C166557yt A00(Object obj, String str) {
        return new C166557yt(AnonymousClass3QD.A00(), obj.getClass(), obj, str);
    }
}
