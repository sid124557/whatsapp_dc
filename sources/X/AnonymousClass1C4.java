package X;

/* renamed from: X.1C4  reason: invalid class name */
public final class AnonymousClass1C4 extends C130786cX implements C181378mf {
    public static final AnonymousClass1C4 DEFAULT_INSTANCE;
    public static final int ENC_IV_FIELD_NUMBER = 3;
    public static final int ENC_PAYLOAD_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int TARGET_MESSAGE_KEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public C172548Lq encIv_;
    public C172548Lq encPayload_;
    public AnonymousClass1ET targetMessageKey_;

    static {
        AnonymousClass1C4 r1 = new AnonymousClass1C4();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1C4.class);
    }

    public AnonymousClass1C4() {
        C172548Lq r0 = C172548Lq.A01;
        this.encPayload_ = r0;
        this.encIv_ = r0;
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
                A1X[1] = "targetMessageKey_";
                A1X[2] = "encPayload_";
                A1X[3] = "encIv_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", A1X);
            case 3:
                return new AnonymousClass1C4();
            case 4:
                return new AnonymousClass16Z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1C4.class) {
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
