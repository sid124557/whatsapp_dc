package X;

/* renamed from: X.1Cy  reason: invalid class name and case insensitive filesystem */
public final class C21731Cy extends C130786cX implements C181378mf {
    public static final int CIPHERKEY_FIELD_NUMBER = 2;
    public static final C21731Cy DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int IV_FIELD_NUMBER = 4;
    public static final int MACKEY_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C172548Lq cipherKey_;
    public int index_;
    public C172548Lq iv_;
    public C172548Lq macKey_;

    static {
        C21731Cy r1 = new C21731Cy();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21731Cy.class);
    }

    public C21731Cy() {
        C172548Lq r0 = C172548Lq.A01;
        this.cipherKey_ = r0;
        this.macKey_ = r0;
        this.iv_ = r0;
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
                A1Y[1] = "index_";
                A1Y[2] = "cipherKey_";
                A1Y[3] = "macKey_";
                A1Y[4] = "iv_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", A1Y);
            case 3:
                return new C21731Cy();
            case 4:
                return new AnonymousClass19X();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21731Cy.class) {
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
