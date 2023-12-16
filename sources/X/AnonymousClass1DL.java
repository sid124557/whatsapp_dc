package X;

/* renamed from: X.1DL  reason: invalid class name */
public final class AnonymousClass1DL extends C130786cX implements C181378mf {
    public static final AnonymousClass1DL DEFAULT_INSTANCE;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int ISSUE_TIME_FIELD_NUMBER = 10;
    public static final int LOCALIZED_NAMES_FIELD_NUMBER = 8;
    public static volatile C178978iP PARSER = null;
    public static final int SERIAL_FIELD_NUMBER = 1;
    public static final int VERIFIED_NAME_FIELD_NUMBER = 4;
    public int bitField0_;
    public long issueTime_;
    public String issuer_ = "";
    public C188248ya localizedNames_ = C130236bd.A02;
    public long serial_;
    public String verifiedName_ = "";

    static {
        AnonymousClass1DL r1 = new AnonymousClass1DL();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DL.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "serial_";
                objArr[2] = "issuer_";
                objArr[3] = "verifiedName_";
                objArr[4] = "localizedNames_";
                objArr[5] = AnonymousClass1CP.class;
                objArr[6] = "issueTime_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\b\u001b\nဃ\u0003", objArr);
            case 3:
                return new AnonymousClass1DL();
            case 4:
                return new C206318s();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DL.class) {
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
