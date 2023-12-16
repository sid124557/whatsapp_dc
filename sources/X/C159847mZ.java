package X;

import java.util.HashSet;

/* renamed from: X.7mZ  reason: invalid class name and case insensitive filesystem */
public final class C159847mZ {
    public static String A00 = "goog.exo.core";
    public static boolean A01 = true;
    public static final HashSet A02 = AnonymousClass002.A0K();

    public static synchronized void A00(String str) {
        synchronized (C159847mZ.class) {
            if (A02.add(str)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(A00);
                A00 = AnonymousClass000.A0V(", ", str, A0o);
            }
        }
    }
}
