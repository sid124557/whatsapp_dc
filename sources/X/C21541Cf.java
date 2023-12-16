package X;

/* renamed from: X.1Cf  reason: invalid class name and case insensitive filesystem */
public final class C21541Cf extends C130786cX implements C181378mf {
    public static final int ACCOUNT_SIGNATURE_FIELD_NUMBER = 3;
    public static final int ACCOUNT_SIGNATURE_KEY_FIELD_NUMBER = 2;
    public static final C21541Cf DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static final int DEVICE_SIGNATURE_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER;
    public C172548Lq accountSignatureKey_;
    public C172548Lq accountSignature_;
    public int bitField0_;
    public C172548Lq details_;
    public C172548Lq deviceSignature_;

    static {
        C21541Cf r1 = new C21541Cf();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21541Cf.class);
    }

    public C21541Cf() {
        C172548Lq r0 = C172548Lq.A01;
        this.details_ = r0;
        this.accountSignatureKey_ = r0;
        this.accountSignature_ = r0;
        this.deviceSignature_ = r0;
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
                A1Y[1] = "details_";
                A1Y[2] = "accountSignatureKey_";
                A1Y[3] = "accountSignature_";
                A1Y[4] = "deviceSignature_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A1Y);
            case 3:
                return new C21541Cf();
            case 4:
                return new AnonymousClass15i();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21541Cf.class) {
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
