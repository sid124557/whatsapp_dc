package X;

/* renamed from: X.1Ch  reason: invalid class name and case insensitive filesystem */
public final class C21561Ch extends C130786cX implements C181378mf {
    public static final int CONSENTED_USERS_URL_FIELD_NUMBER = 3;
    public static final C21561Ch DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int WEBVIEW_PRESENTATION_FIELD_NUMBER = 4;
    public int bitField0_;
    public String consentedUsersUrl_ = "";
    public String displayText_ = "";
    public String url_ = "";
    public int webviewPresentation_ = 1;

    static {
        C21561Ch r1 = new C21561Ch();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21561Ch.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C18270x1.A1Z();
                A1Z[1] = "displayText_";
                A1Z[2] = "url_";
                A1Z[3] = "consentedUsersUrl_";
                A1Z[4] = "webviewPresentation_";
                A1Z[5] = AnonymousClass3BF.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", A1Z);
            case 3:
                return new C21561Ch();
            case 4:
                return new AnonymousClass167();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21561Ch.class) {
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
