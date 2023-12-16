package X;

/* renamed from: X.1EK  reason: invalid class name */
public final class AnonymousClass1EK extends C130786cX implements C181378mf {
    public static final AnonymousClass1EK DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 1;
    public static final int HYDRATED_BUTTONS_FIELD_NUMBER = 8;
    public static final int HYDRATED_CONTENT_TEXT_FIELD_NUMBER = 6;
    public static final int HYDRATED_FOOTER_TEXT_FIELD_NUMBER = 7;
    public static final int HYDRATED_TITLE_TEXT_FIELD_NUMBER = 2;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int TEMPLATE_ID_FIELD_NUMBER = 9;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public C188248ya hydratedButtons_ = C130236bd.A02;
    public String hydratedContentText_ = "";
    public String hydratedFooterText_ = "";
    public String templateId_ = "";
    public int titleCase_ = 0;
    public Object title_;

    static {
        AnonymousClass1EK r1 = new AnonymousClass1EK();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EK.class);
    }

    public AnonymousClass209 A0M() {
        int i = this.titleCase_;
        if (i == 0) {
            return AnonymousClass209.TITLE_NOT_SET;
        }
        if (i == 1) {
            return AnonymousClass209.DOCUMENT_MESSAGE;
        }
        if (i == 2) {
            return AnonymousClass209.HYDRATED_TITLE_TEXT;
        }
        if (i == 3) {
            return AnonymousClass209.IMAGE_MESSAGE;
        }
        if (i == 4) {
            return AnonymousClass209.VIDEO_MESSAGE;
        }
        if (i != 5) {
            return null;
        }
        return AnonymousClass209.LOCATION_MESSAGE;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[12];
                objArr[0] = "title_";
                AnonymousClass0x2.A1W(objArr, "titleCase_");
                objArr[3] = AnonymousClass1EB.class;
                objArr[4] = AnonymousClass1EE.class;
                objArr[5] = AnonymousClass1ED.class;
                objArr[6] = C21991Dy.class;
                objArr[7] = "hydratedContentText_";
                objArr[8] = "hydratedFooterText_";
                objArr[9] = "hydratedButtons_";
                objArr[10] = AnonymousClass1EH.class;
                objArr[11] = "templateId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဈ\u0005\u0007ဈ\u0006\b\u001b\tဈ\u0007", objArr);
            case 3:
                return new AnonymousClass1EK();
            case 4:
                return new C208719q();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EK.class) {
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
