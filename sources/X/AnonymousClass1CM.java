package X;

/* renamed from: X.1CM  reason: invalid class name */
public final class AnonymousClass1CM extends C130786cX implements C181378mf {
    public static final AnonymousClass1CM DEFAULT_INSTANCE;
    public static final int FIRST_NAME_FIELD_NUMBER = 2;
    public static final int FULL_NAME_FIELD_NUMBER = 1;
    public static final int LID_JID_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String firstName_ = "";
    public String fullName_ = "";
    public String lidJid_ = "";

    static {
        AnonymousClass1CM r1 = new AnonymousClass1CM();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CM.class);
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
                A1X[1] = "fullName_";
                A1X[2] = "firstName_";
                A1X[3] = "lidJid_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", A1X);
            case 3:
                return new AnonymousClass1CM();
            case 4:
                return new AnonymousClass18O();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CM.class) {
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
