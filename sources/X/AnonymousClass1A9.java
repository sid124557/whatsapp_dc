package X;

/* renamed from: X.1A9  reason: invalid class name */
public final class AnonymousClass1A9 extends C130786cX implements C181378mf {
    public static final AnonymousClass1A9 DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SELECTED_OPTIONS_FIELD_NUMBER = 1;
    public C188248ya selectedOptions_ = C130236bd.A02;

    static {
        AnonymousClass1A9 r1 = new AnonymousClass1A9();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1A9.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"selectedOptions_"});
            case 3:
                return new AnonymousClass1A9();
            case 4:
                return new C207619f();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1A9.class) {
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
