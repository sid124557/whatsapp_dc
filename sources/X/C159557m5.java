package X;

import java.util.Map;

/* renamed from: X.7m5  reason: invalid class name and case insensitive filesystem */
public class C159557m5 {
    public static volatile C180478l8 A00;

    public static C180478l8 A00() {
        if (A00 == null) {
            synchronized (C159557m5.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass84F();
                }
            }
        }
        return A00;
    }

    public static void A01(C141226vE r7, String str, String str2) {
        A00().Bjb(r7, str, str2, (Throwable) null, (Map) null, 0);
    }
}
