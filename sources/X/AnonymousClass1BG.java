package X;

/* renamed from: X.1BG  reason: invalid class name */
public final class AnonymousClass1BG extends C130786cX implements C181378mf {
    public static final int CARDS_FIELD_NUMBER = 1;
    public static final AnonymousClass1BG DEFAULT_INSTANCE;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C188248ya cards_ = C130236bd.A02;
    public int messageVersion_ = 1;

    static {
        AnonymousClass1BG r1 = new AnonymousClass1BG();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BG.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = C18270x1.A1X();
                A1X[1] = "cards_";
                A1X[2] = AnonymousClass1ER.class;
                A1X[3] = "messageVersion_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", A1X);
            case 3:
                return new AnonymousClass1BG();
            case 4:
                return new C200216j();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BG.class) {
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
