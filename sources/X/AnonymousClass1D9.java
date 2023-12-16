package X;

/* renamed from: X.1D9  reason: invalid class name */
public final class AnonymousClass1D9 extends C130786cX implements C181378mf {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 5;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    public static final AnonymousClass1D9 DEFAULT_INSTANCE;
    public static final int NEWSLETTER_JID_FIELD_NUMBER = 1;
    public static final int NEWSLETTER_NAME_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int SERVER_MESSAGE_ID_FIELD_NUMBER = 2;
    public String accessibilityText_ = "";
    public int bitField0_;
    public int contentType_ = 1;
    public String newsletterJid_ = "";
    public String newsletterName_ = "";
    public int serverMessageId_;

    static {
        AnonymousClass1D9 r1 = new AnonymousClass1D9();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D9.class);
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
                objArr[1] = "newsletterJid_";
                objArr[2] = "serverMessageId_";
                objArr[3] = "newsletterName_";
                objArr[4] = "contentType_";
                objArr[5] = AnonymousClass3BC.A00;
                objArr[6] = "accessibilityText_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004", objArr);
            case 3:
                return new AnonymousClass1D9();
            case 4:
                return new AnonymousClass161();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D9.class) {
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
