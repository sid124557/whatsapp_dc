package X;

/* renamed from: X.1Df  reason: invalid class name and case insensitive filesystem */
public final class C21801Df extends C130786cX implements C181378mf {
    public static final int BUTTONS_FIELD_NUMBER = 9;
    public static final int CONTENT_TEXT_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 8;
    public static final C21801Df DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 2;
    public static final int FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int HEADER_TYPE_FIELD_NUMBER = 10;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public C188248ya buttons_ = C130236bd.A02;
    public String contentText_ = "";
    public AnonymousClass1EF contextInfo_;
    public String footerText_ = "";
    public int headerCase_ = 0;
    public int headerType_;
    public Object header_;

    static {
        C21801Df r1 = new C21801Df();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21801Df.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[14];
                objArr[0] = "header_";
                AnonymousClass0x2.A1W(objArr, "headerCase_");
                objArr[3] = AnonymousClass1EB.class;
                objArr[4] = AnonymousClass1EE.class;
                objArr[5] = AnonymousClass1ED.class;
                objArr[6] = C21991Dy.class;
                objArr[7] = "contentText_";
                objArr[8] = "footerText_";
                objArr[9] = "contextInfo_";
                objArr[10] = "buttons_";
                objArr[11] = C21591Ck.class;
                objArr[12] = "headerType_";
                objArr[13] = AnonymousClass3BK.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0001\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007\t\u001b\nဌ\b", objArr);
            case 3:
                return new C21801Df();
            case 4:
                return new C208319m();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21801Df.class) {
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
