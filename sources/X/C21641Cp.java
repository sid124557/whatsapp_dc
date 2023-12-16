package X;

/* renamed from: X.1Cp  reason: invalid class name and case insensitive filesystem */
public final class C21641Cp extends C130786cX implements C181378mf {
    public static final C21641Cp DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int X_DEPRECATED_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_DEPRECATED_FIELD_NUMBER = 2;
    public static final int Y_FIELD_NUMBER = 4;
    public int bitField0_;
    public int xDeprecated_;
    public double x_;
    public int yDeprecated_;
    public double y_;

    static {
        C21641Cp r1 = new C21641Cp();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21641Cp.class);
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
                A1Y[1] = "xDeprecated_";
                A1Y[2] = "yDeprecated_";
                A1Y[3] = "x_";
                A1Y[4] = "y_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003က\u0002\u0004က\u0003", A1Y);
            case 3:
                return new C21641Cp();
            case 4:
                return new AnonymousClass17Z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21641Cp.class) {
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
