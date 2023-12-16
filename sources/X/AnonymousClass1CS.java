package X;

/* renamed from: X.1CS  reason: invalid class name */
public final class AnonymousClass1CS extends C130786cX implements C181378mf {
    public static final AnonymousClass1CS DEFAULT_INSTANCE;
    public static final int EPHEMERAL_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 3;
    public static final int STATIC_FIELD_NUMBER = 2;
    public int bitField0_;
    public C172548Lq ephemeral_;
    public C172548Lq payload_;
    public C172548Lq static_;

    static {
        AnonymousClass1CS r1 = new AnonymousClass1CS();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CS.class);
    }

    public AnonymousClass1CS() {
        C172548Lq r0 = C172548Lq.A01;
        this.ephemeral_ = r0;
        this.static_ = r0;
        this.payload_ = r0;
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
                A1X[1] = "ephemeral_";
                A1X[2] = "static_";
                A1X[3] = "payload_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", A1X);
            case 3:
                return new AnonymousClass1CS();
            case 4:
                return new AnonymousClass192();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CS.class) {
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
