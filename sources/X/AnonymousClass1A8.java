package X;

/* renamed from: X.1A8  reason: invalid class name */
public final class AnonymousClass1A8 extends C130786cX implements C181378mf {
    public static final AnonymousClass1A8 DEFAULT_INSTANCE;
    public static final int KEYS_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public C188248ya keys_ = C130236bd.A02;

    static {
        AnonymousClass1A8 r1 = new AnonymousClass1A8();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1A8.class);
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        switch (r5.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = "keys_";
                A0M[1] = AnonymousClass1BA.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", A0M);
            case 3:
                return new AnonymousClass1A8();
            case 4:
                return new AnonymousClass16G();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1A8.class) {
                    r0 = PARSER;
                    if (r0 == null) {
                        r0 = C18320x8.A0B(DEFAULT_INSTANCE);
                        PARSER = r0;
                    }
                }
                return r0;
            default:
                throw C18320x8.A0m();
        }
    }
}
