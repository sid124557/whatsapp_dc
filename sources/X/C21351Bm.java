package X;

/* renamed from: X.1Bm  reason: invalid class name and case insensitive filesystem */
public final class C21351Bm extends C130786cX implements C181378mf {
    public static final int CURRENTSESSION_FIELD_NUMBER = 1;
    public static final C21351Bm DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int PREVIOUSSESSIONS_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass1E1 currentSession_;
    public C188248ya previousSessions_ = C130236bd.A02;

    static {
        C21351Bm r1 = new C21351Bm();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21351Bm.class);
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
                A1X[1] = "currentSession_";
                A1X[2] = "previousSessions_";
                A1X[3] = AnonymousClass1E1.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", A1X);
            case 3:
                return new C21351Bm();
            case 4:
                return new C208019j();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21351Bm.class) {
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
