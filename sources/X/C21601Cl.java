package X;

/* renamed from: X.1Cl  reason: invalid class name and case insensitive filesystem */
public final class C21601Cl extends C130786cX implements C181378mf {
    public static final int CALL_KEY_FIELD_NUMBER = 1;
    public static final int CONVERSION_DATA_FIELD_NUMBER = 3;
    public static final int CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 4;
    public static final int CONVERSION_SOURCE_FIELD_NUMBER = 2;
    public static final C21601Cl DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C172548Lq callKey_;
    public C172548Lq conversionData_;
    public int conversionDelaySeconds_;
    public String conversionSource_ = "";

    static {
        C21601Cl r1 = new C21601Cl();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21601Cl.class);
    }

    public C21601Cl() {
        C172548Lq r1 = C172548Lq.A01;
        this.callKey_ = r1;
        this.conversionData_ = r1;
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
                A1Y[1] = "callKey_";
                A1Y[2] = "conversionSource_";
                A1Y[3] = "conversionData_";
                A1Y[4] = "conversionDelaySeconds_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဋ\u0003", A1Y);
            case 3:
                return new C21601Cl();
            case 4:
                return new AnonymousClass16O();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21601Cl.class) {
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
