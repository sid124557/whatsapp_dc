package X;

/* renamed from: X.1BU  reason: invalid class name */
public final class AnonymousClass1BU extends C130786cX implements C181378mf {
    public static final AnonymousClass1BU DEFAULT_INSTANCE;
    public static final int FBID_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    public int bitField0_;
    public String fbid_ = "";
    public String password_ = "";

    static {
        AnonymousClass1BU r1 = new AnonymousClass1BU();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BU.class);
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
                A1W[1] = "fbid_";
                A1W[2] = "password_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", A1W);
            case 3:
                return new AnonymousClass1BU();
            case 4:
                return new C202617h();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BU.class) {
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
