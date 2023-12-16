package X;

/* renamed from: X.1Bf  reason: invalid class name and case insensitive filesystem */
public final class C21281Bf extends C130786cX implements C181378mf {
    public static final C21281Bf DEFAULT_INSTANCE;
    public static final int MESSAGE_RANGE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int READ_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass1CO messageRange_;
    public boolean read_;

    static {
        C21281Bf r1 = new C21281Bf();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21281Bf.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1W = C18270x1.A1W();
                A1W[1] = "read_";
                A1W[2] = "messageRange_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", A1W);
            case 3:
                return new C21281Bf();
            case 4:
                return new AnonymousClass18W();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21281Bf.class) {
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
