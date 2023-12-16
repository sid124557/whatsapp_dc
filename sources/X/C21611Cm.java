package X;

/* renamed from: X.1Cm  reason: invalid class name and case insensitive filesystem */
public final class C21611Cm extends C130786cX implements C181378mf {
    public static final C21611Cm DEFAULT_INSTANCE;
    public static final int LINK_PREVIEW_RESPONSE_FIELD_NUMBER = 3;
    public static final int MEDIA_UPLOAD_RESULT_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PLACEHOLDER_MESSAGE_RESEND_RESPONSE_FIELD_NUMBER = 4;
    public static final int STICKER_MESSAGE_FIELD_NUMBER = 2;
    public int bitField0_;
    public C21841Dj linkPreviewResponse_;
    public int mediaUploadResult_;
    public AnonymousClass1AT placeholderMessageResendResponse_;
    public AnonymousClass1EA stickerMessage_;

    static {
        C21611Cm r1 = new C21611Cm();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21611Cm.class);
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
                A1Z[1] = "mediaUploadResult_";
                A1Z[2] = C63963Bo.A00;
                A1Z[3] = "stickerMessage_";
                A1Z[4] = "linkPreviewResponse_";
                A1Z[5] = "placeholderMessageResendResponse_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", A1Z);
            case 3:
                return new C21611Cm();
            case 4:
                return new C207419d();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21611Cm.class) {
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
