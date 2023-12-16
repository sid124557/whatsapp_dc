package X;

/* renamed from: X.1A6  reason: invalid class name */
public final class AnonymousClass1A6 extends C130786cX implements C181378mf {
    public static final AnonymousClass1A6 DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER;

    static {
        AnonymousClass1A6 r1 = new AnonymousClass1A6();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1A6.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
            case 3:
                return new AnonymousClass1A6();
            case 4:
                return new AnonymousClass17K();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1A6.class) {
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
