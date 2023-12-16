package X;

import java.util.HashMap;

/* renamed from: X.2C2  reason: invalid class name */
public class AnonymousClass2C2 {
    public static final HashMap A00;
    public static final HashMap A01;
    public static final HashMap A02;

    static {
        HashMap A0t = AnonymousClass001.A0t();
        A02 = A0t;
        HashMap A0t2 = AnonymousClass001.A0t();
        A01 = A0t2;
        HashMap A0t3 = AnonymousClass001.A0t();
        A00 = A0t3;
        A0t.put("IN", A0t2);
        Integer A0E = C18270x1.A0E("BR", A0t3, A0t);
        A0t3.put("stable_release", C18270x1.A0D("stable_release", A0E, A0t2));
        A0t3.put("feature_bip", A0E);
    }
}
