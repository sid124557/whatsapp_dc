package X;

/* renamed from: X.1ED  reason: invalid class name */
public final class AnonymousClass1ED extends C130786cX implements C181378mf {
    public static final int ANNOTATIONS_FIELD_NUMBER = 25;
    public static final int CAPTION_FIELD_NUMBER = 7;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1ED DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 13;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 11;
    public static final int FILE_LENGTH_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int GIF_ATTRIBUTION_FIELD_NUMBER = 19;
    public static final int GIF_PLAYBACK_FIELD_NUMBER = 8;
    public static final int HEIGHT_FIELD_NUMBER = 9;
    public static final int INTERACTIVE_ANNOTATIONS_FIELD_NUMBER = 12;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 6;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STATIC_URL_FIELD_NUMBER = 24;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 21;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 23;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 22;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 20;
    public static final int WIDTH_FIELD_NUMBER = 10;
    public C188248ya annotations_;
    public int bitField0_;
    public String caption_;
    public AnonymousClass1EF contextInfo_;
    public String directPath_;
    public C172548Lq fileEncSha256_;
    public long fileLength_;
    public C172548Lq fileSha256_;
    public int gifAttribution_;
    public boolean gifPlayback_;
    public int height_;
    public C188248ya interactiveAnnotations_;
    public C172548Lq jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;
    public String mimetype_ = "";
    public int seconds_;
    public String staticUrl_;
    public C172548Lq streamingSidecar_;
    public String thumbnailDirectPath_;
    public C172548Lq thumbnailEncSha256_;
    public C172548Lq thumbnailSha256_;
    public String url_ = "";
    public boolean viewOnce_;
    public int width_;

    static {
        AnonymousClass1ED r1 = new AnonymousClass1ED();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1ED.class);
    }

    public AnonymousClass1ED() {
        C172548Lq r1 = C172548Lq.A01;
        this.fileSha256_ = r1;
        this.mediaKey_ = r1;
        this.caption_ = "";
        this.fileEncSha256_ = r1;
        C130236bd r0 = C130236bd.A02;
        this.interactiveAnnotations_ = r0;
        this.directPath_ = "";
        this.jpegThumbnail_ = r1;
        this.streamingSidecar_ = r1;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = r1;
        this.thumbnailEncSha256_ = r1;
        this.staticUrl_ = "";
        this.annotations_ = r0;
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        switch (r5.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[28];
                AnonymousClass0x2.A1R(objArr);
                AnonymousClass0x7.A1O(objArr);
                objArr[3] = "fileSha256_";
                objArr[4] = "fileLength_";
                objArr[5] = "seconds_";
                objArr[6] = "mediaKey_";
                objArr[7] = "caption_";
                objArr[8] = "gifPlayback_";
                objArr[9] = "height_";
                objArr[10] = "width_";
                objArr[11] = "fileEncSha256_";
                objArr[12] = "interactiveAnnotations_";
                Class<C21571Ci> cls = C21571Ci.class;
                objArr[13] = cls;
                objArr[14] = "directPath_";
                objArr[15] = "mediaKeyTimestamp_";
                objArr[16] = "jpegThumbnail_";
                objArr[17] = "contextInfo_";
                objArr[18] = "streamingSidecar_";
                objArr[19] = "gifAttribution_";
                objArr[20] = C63883Bg.A00;
                objArr[21] = "viewOnce_";
                objArr[22] = "thumbnailDirectPath_";
                objArr[23] = "thumbnailSha256_";
                objArr[24] = "thumbnailEncSha256_";
                objArr[25] = "staticUrl_";
                objArr[26] = "annotations_";
                objArr[27] = cls;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ည\u0005\u0007ဈ\u0006\bဇ\u0007\tဋ\b\nဋ\t\u000bည\n\f\u001b\rဈ\u000b\u000eဂ\f\u0010ည\r\u0011ဉ\u000e\u0012ည\u000f\u0013ဌ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ည\u0013\u0017ည\u0014\u0018ဈ\u0015\u0019\u001b", objArr);
            case 3:
                return new AnonymousClass1ED();
            case 4:
                return new C209519y();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1ED.class) {
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
