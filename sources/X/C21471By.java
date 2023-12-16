package X;

/* renamed from: X.1By  reason: invalid class name and case insensitive filesystem */
public final class C21471By extends C130786cX implements C181378mf {
    public static final C21471By DEFAULT_INSTANCE;
    public static final int FINGERPRINT_FIELD_NUMBER = 2;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    public int bitField0_;
    public C21511Cc fingerprint_;
    public C172548Lq keyData_ = C172548Lq.A01;
    public long timestamp_;

    static {
        C21471By r1 = new C21471By();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21471By.class);
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
                A1X[1] = "keyData_";
                A1X[2] = "fingerprint_";
                A1X[3] = "timestamp_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဂ\u0002", A1X);
            case 3:
                return new C21471By();
            case 4:
                return new AnonymousClass16C();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21471By.class) {
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
