package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.7pM  reason: invalid class name and case insensitive filesystem */
public class C161287pM {
    public static final C161287pM A01 = new C161287pM(true);
    public static volatile C161287pM A02;
    public static volatile C161287pM A03;
    public final Map A00;

    public static C161287pM A00() {
        C161287pM r0;
        C161287pM r02 = A02;
        if (r02 != null) {
            return r02;
        }
        synchronized (C161287pM.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = A01;
                A02 = r0;
            }
        }
        return r0;
    }

    public C161287pM(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public C161287pM() {
        this.A00 = AnonymousClass001.A0t();
    }
}
