package X;

/* renamed from: X.1AB  reason: invalid class name */
public final class AnonymousClass1AB extends C130786cX implements C181378mf {
    public static final AnonymousClass1AB DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SORTED_LABEL_IDS_FIELD_NUMBER = 1;
    public C85224Fk sortedLabelIds_ = C130176bX.A02;

    static {
        AnonymousClass1AB r1 = new AnonymousClass1AB();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1AB.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"sortedLabelIds_"});
            case 3:
                return new AnonymousClass1AB();
            case 4:
                return new AnonymousClass18U();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1AB.class) {
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
