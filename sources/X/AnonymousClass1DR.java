package X;

/* renamed from: X.1DR  reason: invalid class name */
public final class AnonymousClass1DR extends C130786cX implements C181378mf {
    public static final AnonymousClass1DR DEFAULT_INSTANCE;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 3;
    public static final int HAS_MEDIA_ATTACHMENT_FIELD_NUMBER = 5;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 4;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 6;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 8;
    public static volatile C178978iP PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 7;
    public int bitField0_;
    public boolean hasMediaAttachment_;
    public int mediaCase_ = 0;
    public Object media_;
    public String subtitle_ = "";
    public String title_ = "";

    static {
        AnonymousClass1DR r1 = new AnonymousClass1DR();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DR.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[10];
                objArr[0] = "media_";
                AnonymousClass0x2.A1W(objArr, "mediaCase_");
                objArr[3] = "title_";
                objArr[4] = "subtitle_";
                objArr[5] = AnonymousClass1EB.class;
                objArr[6] = AnonymousClass1EE.class;
                objArr[7] = "hasMediaAttachment_";
                objArr[8] = AnonymousClass1ED.class;
                objArr[9] = C21991Dy.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဇ\u0007\u0006ွ\u0000\u0007ြ\u0000\bြ\u0000", objArr);
            case 3:
                return new AnonymousClass1DR();
            case 4:
                return new C209319w();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DR.class) {
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
