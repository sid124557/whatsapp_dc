package X;

/* renamed from: X.1E4  reason: invalid class name */
public final class AnonymousClass1E4 extends C130786cX implements C181378mf {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CLICK_TO_WHATSAPP_CALL_FIELD_NUMBER = 15;
    public static final int CONTAINS_AUTO_REPLY_FIELD_NUMBER = 10;
    public static final int CTWA_CLID_FIELD_NUMBER = 13;
    public static final AnonymousClass1E4 DEFAULT_INSTANCE;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
    public static final int MEDIA_URL_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int REF_FIELD_NUMBER = 14;
    public static final int RENDER_LARGER_THUMBNAIL_FIELD_NUMBER = 11;
    public static final int SHOW_AD_ATTRIBUTION_FIELD_NUMBER = 12;
    public static final int SOURCE_ID_FIELD_NUMBER = 8;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 7;
    public static final int SOURCE_URL_FIELD_NUMBER = 9;
    public static final int THUMBNAIL_FIELD_NUMBER = 6;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public int bitField0_;
    public String body_ = "";
    public boolean clickToWhatsappCall_;
    public boolean containsAutoReply_;
    public String ctwaClid_ = "";
    public int mediaType_;
    public String mediaUrl_ = "";
    public String ref_ = "";
    public boolean renderLargerThumbnail_;
    public boolean showAdAttribution_;
    public String sourceId_ = "";
    public String sourceType_ = "";
    public String sourceUrl_ = "";
    public String thumbnailUrl_ = "";
    public C172548Lq thumbnail_ = C172548Lq.A01;
    public String title_ = "";

    static {
        AnonymousClass1E4 r1 = new AnonymousClass1E4();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E4.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[17];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "title_";
                objArr[2] = "body_";
                objArr[3] = "mediaType_";
                objArr[4] = AnonymousClass3BB.A00;
                objArr[5] = "thumbnailUrl_";
                objArr[6] = "mediaUrl_";
                objArr[7] = "thumbnail_";
                objArr[8] = "sourceType_";
                objArr[9] = "sourceId_";
                objArr[10] = "sourceUrl_";
                objArr[11] = "containsAutoReply_";
                objArr[12] = "renderLargerThumbnail_";
                objArr[13] = "showAdAttribution_";
                objArr[14] = "ctwaClid_";
                objArr[15] = "ref_";
                objArr[16] = "clickToWhatsappCall_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဈ\f\u000eဈ\r\u000fဇ\u000e", objArr);
            case 3:
                return new AnonymousClass1E4();
            case 4:
                return new AnonymousClass160();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E4.class) {
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
