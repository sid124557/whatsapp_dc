package X;

/* renamed from: X.1Bv  reason: invalid class name and case insensitive filesystem */
public final class C21441Bv extends C130786cX implements C181378mf {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 3;
    public static final C21441Bv DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 1;
    public static final int HMAC_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int accountType_;
    public int bitField0_;
    public C172548Lq details_;
    public C172548Lq hmac_;

    static {
        C21441Bv r1 = new C21441Bv();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21441Bv.class);
    }

    public C21441Bv() {
        C172548Lq r0 = C172548Lq.A01;
        this.details_ = r0;
        this.hmac_ = r0;
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
                A1Y[2] = "hmac_";
                A1Y[3] = "accountType_";
                A1Y[4] = AnonymousClass3B6.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဌ\u0002", A1Y);
            case 3:
                return new C21441Bv();
            case 4:
                return new AnonymousClass15j();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21441Bv.class) {
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
