package X;

/* renamed from: X.1Cw  reason: invalid class name and case insensitive filesystem */
public final class C21711Cw extends C130786cX implements C181378mf {
    public static final int CIPHERTEXT_FIELD_NUMBER = 4;
    public static final int COUNTER_FIELD_NUMBER = 2;
    public static final C21711Cw DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int PREVIOUSCOUNTER_FIELD_NUMBER = 3;
    public static final int RATCHETKEY_FIELD_NUMBER = 1;
    public int bitField0_;
    public C172548Lq ciphertext_;
    public int counter_;
    public int previousCounter_;
    public C172548Lq ratchetKey_;

    static {
        C21711Cw r1 = new C21711Cw();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21711Cw.class);
    }

    public C21711Cw() {
        C172548Lq r0 = C172548Lq.A01;
        this.ratchetKey_ = r0;
        this.ciphertext_ = r0;
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
                A1Y[1] = "ratchetKey_";
                A1Y[2] = "counter_";
                A1Y[3] = "previousCounter_";
                A1Y[4] = "ciphertext_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ည\u0003", A1Y);
            case 3:
                return new C21711Cw();
            case 4:
                return new AnonymousClass19Q();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21711Cw.class) {
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
