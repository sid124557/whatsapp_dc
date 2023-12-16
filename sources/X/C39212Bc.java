package X;

/* renamed from: X.2Bc  reason: invalid class name and case insensitive filesystem */
public final class C39212Bc {
    public static final C84824Dv A00;

    static {
        C84824Dv r1;
        boolean z = false;
        try {
            String property = System.getProperty("kotlinx.coroutines.main.delay");
            if (property != null) {
                z = Boolean.parseBoolean(property);
                if (z) {
                    AnonymousClass46A r12 = AnonymousClass788.A00;
                    if (!(r12.A04() instanceof C831546i) && (r12 instanceof C84824Dv)) {
                        r1 = (C84824Dv) r12;
                        A00 = r1;
                    }
                }
            }
        } catch (SecurityException unused) {
        }
        r1 = AnonymousClass46K.A01;
        A00 = r1;
    }
}
