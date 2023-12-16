package X;

/* renamed from: X.1BL  reason: invalid class name */
public final class AnonymousClass1BL extends C130786cX implements C181378mf {
    public static final AnonymousClass1BL DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int ROWS_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public C188248ya rows_ = C130236bd.A02;
    public String title_ = "";

    static {
        AnonymousClass1BL r1 = new AnonymousClass1BL();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BL.class);
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
                A1X[1] = "title_";
                A1X[2] = "rows_";
                A1X[3] = AnonymousClass1CC.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", A1X);
            case 3:
                return new AnonymousClass1BL();
            case 4:
                return new C201816z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BL.class) {
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
