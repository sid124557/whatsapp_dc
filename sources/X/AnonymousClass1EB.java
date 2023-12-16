package X;

/* renamed from: X.1EB  reason: invalid class name */
public final class AnonymousClass1EB extends C130786cX implements C181378mf {
    public static final int CAPTION_FIELD_NUMBER = 20;
    public static final int CONTACT_VCARD_FIELD_NUMBER = 12;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1EB DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 10;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_NAME_FIELD_NUMBER = 8;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 7;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static final int PAGE_COUNT_FIELD_NUMBER = 6;
    public static volatile C178978iP PARSER = null;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 13;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 15;
    public static final int THUMBNAIL_HEIGHT_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 14;
    public static final int THUMBNAIL_WIDTH_FIELD_NUMBER = 19;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public String caption_;
    public boolean contactVcard_;
    public AnonymousClass1EF contextInfo_;
    public String directPath_;
    public C172548Lq fileEncSha256_;
    public long fileLength_;
    public String fileName_;
    public C172548Lq fileSha256_;
    public C172548Lq jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;
    public String mimetype_ = "";
    public int pageCount_;
    public String thumbnailDirectPath_;
    public C172548Lq thumbnailEncSha256_;
    public int thumbnailHeight_;
    public C172548Lq thumbnailSha256_;
    public int thumbnailWidth_;
    public String title_ = "";
    public String url_ = "";

    static {
        AnonymousClass1EB r1 = new AnonymousClass1EB();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EB.class);
    }

    public AnonymousClass1EB() {
        C172548Lq r0 = C172548Lq.A01;
        this.fileSha256_ = r0;
        this.mediaKey_ = r0;
        this.fileName_ = "";
        this.fileEncSha256_ = r0;
        this.directPath_ = "";
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = r0;
        this.thumbnailEncSha256_ = r0;
        this.jpegThumbnail_ = r0;
        this.caption_ = "";
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[21];
                AnonymousClass0x2.A1R(objArr);
                AnonymousClass0x7.A1O(objArr);
                objArr[3] = "title_";
                objArr[4] = "fileSha256_";
                objArr[5] = "fileLength_";
                objArr[6] = "pageCount_";
                objArr[7] = "mediaKey_";
                objArr[8] = "fileName_";
                objArr[9] = "fileEncSha256_";
                objArr[10] = "directPath_";
                objArr[11] = "mediaKeyTimestamp_";
                objArr[12] = "contactVcard_";
                objArr[13] = "thumbnailDirectPath_";
                objArr[14] = "thumbnailSha256_";
                objArr[15] = "thumbnailEncSha256_";
                objArr[16] = "jpegThumbnail_";
                objArr[17] = "contextInfo_";
                objArr[18] = "thumbnailHeight_";
                objArr[19] = "thumbnailWidth_";
                objArr[20] = "caption_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ည\u0006\bဈ\u0007\tည\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဈ\f\u000eည\r\u000fည\u000e\u0010ည\u000f\u0011ဉ\u0010\u0012ဋ\u0011\u0013ဋ\u0012\u0014ဈ\u0013", objArr);
            case 3:
                return new AnonymousClass1EB();
            case 4:
                return new AnonymousClass19Z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EB.class) {
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
