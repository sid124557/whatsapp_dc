package X;

/* renamed from: X.1Bi  reason: invalid class name and case insensitive filesystem */
public final class C21311Bi extends C130786cX implements C181378mf {
    public static final int APP_CACHED_FIELD_NUMBER = 16;
    public static final C21311Bi DEFAULT_INSTANCE;
    public static final int DNS_METHOD_FIELD_NUMBER = 15;
    public static volatile C178978iP PARSER;
    public boolean appCached_;
    public int bitField0_;
    public int dnsMethod_;

    static {
        C21311Bi r1 = new C21311Bi();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21311Bi.class);
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
                A1X[1] = "dnsMethod_";
                A1X[2] = AnonymousClass3C0.A00;
                A1X[3] = "appCached_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u000f\u0010\u0002\u0000\u0000\u0000\u000fဌ\u0000\u0010ဇ\u0001", A1X);
            case 3:
                return new C21311Bi();
            case 4:
                return new C206518u();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21311Bi.class) {
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
