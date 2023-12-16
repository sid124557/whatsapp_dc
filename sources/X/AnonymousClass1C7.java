package X;

/* renamed from: X.1C7  reason: invalid class name */
public final class AnonymousClass1C7 extends C130786cX implements C181378mf {
    public static final int BUTTONS_FIELD_NUMBER = 1;
    public static final AnonymousClass1C7 DEFAULT_INSTANCE;
    public static final int MESSAGE_PARAMS_JSON_FIELD_NUMBER = 2;
    public static final int MESSAGE_VERSION_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C188248ya buttons_ = C130236bd.A02;
    public String messageParamsJson_ = "";
    public int messageVersion_ = 1;

    static {
        AnonymousClass1C7 r1 = new AnonymousClass1C7();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1C7.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = C18270x1.A1Y();
                A1Y[1] = "buttons_";
                A1Y[2] = AnonymousClass1BH.class;
                A1Y[3] = "messageParamsJson_";
                A1Y[4] = "messageVersion_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003င\u0001", A1Y);
            case 3:
                return new AnonymousClass1C7();
            case 4:
                return new C200516m();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1C7.class) {
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
