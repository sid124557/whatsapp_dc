package X;

/* renamed from: X.1BM  reason: invalid class name */
public final class AnonymousClass1BM extends C130786cX implements C181378mf {
    public static final AnonymousClass1BM DEFAULT_INSTANCE;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int SERVICE_TYPE_FIELD_NUMBER = 1;
    public int bitField0_;
    public long expiryTimestamp_;
    public int serviceType_;

    static {
        AnonymousClass1BM r1 = new AnonymousClass1BM();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BM.class);
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
                A1X[1] = "serviceType_";
                A1X[2] = C63823Ba.A00;
                A1X[3] = "expiryTimestamp_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", A1X);
            case 3:
                return new AnonymousClass1BM();
            case 4:
                return new AnonymousClass177();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BM.class) {
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
