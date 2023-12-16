package X;

/* renamed from: X.1EJ  reason: invalid class name */
public final class AnonymousClass1EJ extends C130786cX implements C181378mf {
    public static final int BUTTONS_FIELD_NUMBER = 8;
    public static final int CONTENT_FIELD_NUMBER = 6;
    public static final AnonymousClass1EJ DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 1;
    public static final int FOOTER_FIELD_NUMBER = 7;
    public static final int HIGHLY_STRUCTURED_MESSAGE_FIELD_NUMBER = 2;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 4;
    public int bitField0_;
    public C188248ya buttons_ = C130236bd.A02;
    public C21881Dn content_;
    public C21881Dn footer_;
    public int titleCase_ = 0;
    public Object title_;

    static {
        AnonymousClass1EJ r1 = new AnonymousClass1EJ();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EJ.class);
    }

    public AnonymousClass208 A0M() {
        int i = this.titleCase_;
        if (i == 0) {
            return AnonymousClass208.TITLE_NOT_SET;
        }
        if (i == 1) {
            return AnonymousClass208.DOCUMENT_MESSAGE;
        }
        if (i == 2) {
            return AnonymousClass208.HIGHLY_STRUCTURED_MESSAGE;
        }
        if (i == 3) {
            return AnonymousClass208.IMAGE_MESSAGE;
        }
        if (i == 4) {
            return AnonymousClass208.VIDEO_MESSAGE;
        }
        if (i != 5) {
            return null;
        }
        return AnonymousClass208.LOCATION_MESSAGE;
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
                objArr[4] = C21881Dn.class;
                objArr[5] = AnonymousClass1EE.class;
                objArr[6] = AnonymousClass1ED.class;
                objArr[7] = C21991Dy.class;
                objArr[8] = "content_";
                objArr[9] = "footer_";
                objArr[10] = "buttons_";
                objArr[11] = C21501Cb.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0001\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဉ\u0005\u0007ဉ\u0006\b\u001b", objArr);
            case 3:
                return new AnonymousClass1EJ();
            case 4:
                return new AnonymousClass17U();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EJ.class) {
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
