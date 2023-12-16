package X;

/* renamed from: X.7m8  reason: invalid class name and case insensitive filesystem */
public class C159587m8 {
    public static C183798qf A00;

    public static boolean A01(String str) {
        C183798qf r0;
        synchronized (C159587m8.class) {
            r0 = A00;
            if (r0 == null) {
                throw AnonymousClass001.A0e("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return r0.BJs(str, 0);
    }

    public static void A00(String str) {
        A01(str);
    }
}
