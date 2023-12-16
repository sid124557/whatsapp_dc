package X;

/* renamed from: X.1Bx  reason: invalid class name and case insensitive filesystem */
public final class C21461Bx extends C130786cX implements C181378mf {
    public static final C21461Bx DEFAULT_INSTANCE;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public String name_ = "";

    static {
        C21461Bx r1 = new C21461Bx();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21461Bx.class);
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
                A1X[1] = "degreesLatitude_";
                A1X[2] = "degreesLongitude_";
                A1X[3] = "name_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002", A1X);
            case 3:
                return new C21461Bx();
            case 4:
                return new AnonymousClass169();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21461Bx.class) {
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
