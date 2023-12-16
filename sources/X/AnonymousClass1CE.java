package X;

/* renamed from: X.1CE  reason: invalid class name */
public final class AnonymousClass1CE extends C130786cX implements C181378mf {
    public static final AnonymousClass1CE DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass1ET key_;
    public long senderTimestampMs_;
    public int type_;

    static {
        AnonymousClass1CE r1 = new AnonymousClass1CE();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CE.class);
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
                A1Y[1] = "key_";
                A1Y[2] = "type_";
                A1Y[3] = C63843Bc.A00;
                A1Y[4] = "senderTimestampMs_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", A1Y);
            case 3:
                return new AnonymousClass1CE();
            case 4:
                return new AnonymousClass17G();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CE.class) {
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
