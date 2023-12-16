package X;

/* renamed from: X.1Cd  reason: invalid class name and case insensitive filesystem */
public final class C21521Cd extends C130786cX implements C181378mf {
    public static final int BODY_FIELD_NUMBER = 1;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 15;
    public static final C21521Cd DEFAULT_INSTANCE;
    public static final int NATIVE_FLOW_RESPONSE_MESSAGE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public AnonymousClass1BI body_;
    public AnonymousClass1EF contextInfo_;
    public int interactiveResponseMessageCase_ = 0;
    public Object interactiveResponseMessage_;

    static {
        C21521Cd r1 = new C21521Cd();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21521Cd.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[6];
                objArr[0] = "interactiveResponseMessage_";
                AnonymousClass0x2.A1W(objArr, "interactiveResponseMessageCase_");
                objArr[3] = "body_";
                objArr[4] = AnonymousClass1C9.class;
                objArr[5] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0001\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u000fဉ\u0002", objArr);
            case 3:
                return new C21521Cd();
            case 4:
                return new C200916q();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21521Cd.class) {
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
