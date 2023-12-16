package X;

/* renamed from: X.1EE  reason: invalid class name */
public final class AnonymousClass1EE extends C130786cX implements C181378mf {
    public static final int ANNOTATIONS_FIELD_NUMBER = 30;
    public static final int CAPTION_FIELD_NUMBER = 3;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1EE DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 11;
    public static final int EXPERIMENT_GROUP_ID_FIELD_NUMBER = 20;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 9;
    public static final int FILE_LENGTH_FIELD_NUMBER = 5;
    public static final int FILE_SHA256_FIELD_NUMBER = 4;
    public static final int FIRST_SCAN_LENGTH_FIELD_NUMBER = 19;
    public static final int FIRST_SCAN_SIDECAR_FIELD_NUMBER = 18;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int INTERACTIVE_ANNOTATIONS_FIELD_NUMBER = 10;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_KEY_FIELD_NUMBER = 8;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int MID_QUALITY_FILE_ENC_SHA256_FIELD_NUMBER = 24;
    public static final int MID_QUALITY_FILE_SHA256_FIELD_NUMBER = 23;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int SCANS_SIDECAR_FIELD_NUMBER = 21;
    public static final int SCAN_LENGTHS_FIELD_NUMBER = 22;
    public static final int STATIC_URL_FIELD_NUMBER = 29;
    public static final int THUMBNAIL_DIRECT_PATH_FIELD_NUMBER = 26;
    public static final int THUMBNAIL_ENC_SHA256_FIELD_NUMBER = 28;
    public static final int THUMBNAIL_SHA256_FIELD_NUMBER = 27;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 25;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public C188248ya annotations_;
    public int bitField0_;
    public String caption_ = "";
    public AnonymousClass1EF contextInfo_;
    public String directPath_;
    public int experimentGroupId_;
    public C172548Lq fileEncSha256_;
    public long fileLength_;
    public C172548Lq fileSha256_;
    public int firstScanLength_;
    public C172548Lq firstScanSidecar_;
    public int height_;
    public C188248ya interactiveAnnotations_;
    public C172548Lq jpegThumbnail_;
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;
    public C172548Lq midQualityFileEncSha256_;
    public C172548Lq midQualityFileSha256_;
    public String mimetype_ = "";
    public C85224Fk scanLengths_;
    public C172548Lq scansSidecar_;
    public String staticUrl_;
    public String thumbnailDirectPath_;
    public C172548Lq thumbnailEncSha256_;
    public C172548Lq thumbnailSha256_;
    public String url_ = "";
    public boolean viewOnce_;
    public int width_;

    static {
        AnonymousClass1EE r1 = new AnonymousClass1EE();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EE.class);
    }

    public AnonymousClass1EE() {
        C172548Lq r2 = C172548Lq.A01;
        this.fileSha256_ = r2;
        this.mediaKey_ = r2;
        this.fileEncSha256_ = r2;
        C130236bd r1 = C130236bd.A02;
        this.interactiveAnnotations_ = r1;
        this.directPath_ = "";
        this.jpegThumbnail_ = r2;
        this.firstScanSidecar_ = r2;
        this.scansSidecar_ = r2;
        this.scanLengths_ = C130176bX.A02;
        this.midQualityFileSha256_ = r2;
        this.midQualityFileEncSha256_ = r2;
        this.thumbnailDirectPath_ = "";
        this.thumbnailSha256_ = r2;
        this.thumbnailEncSha256_ = r2;
        this.staticUrl_ = "";
        this.annotations_ = r1;
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        switch (r5.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[30];
                AnonymousClass0x2.A1R(objArr);
                AnonymousClass0x7.A1O(objArr);
                objArr[3] = "caption_";
                objArr[4] = "fileSha256_";
                objArr[5] = "fileLength_";
                objArr[6] = "height_";
                objArr[7] = "width_";
                objArr[8] = "mediaKey_";
                objArr[9] = "fileEncSha256_";
                objArr[10] = "interactiveAnnotations_";
                Class<C21571Ci> cls = C21571Ci.class;
                objArr[11] = cls;
                objArr[12] = "directPath_";
                objArr[13] = "mediaKeyTimestamp_";
                objArr[14] = "jpegThumbnail_";
                objArr[15] = "contextInfo_";
                objArr[16] = "firstScanSidecar_";
                objArr[17] = "firstScanLength_";
                objArr[18] = "experimentGroupId_";
                objArr[19] = "scansSidecar_";
                objArr[20] = "scanLengths_";
                objArr[21] = "midQualityFileSha256_";
                objArr[22] = "midQualityFileEncSha256_";
                objArr[23] = "viewOnce_";
                objArr[24] = "thumbnailDirectPath_";
                objArr[25] = "thumbnailSha256_";
                objArr[26] = "thumbnailEncSha256_";
                objArr[27] = "staticUrl_";
                objArr[28] = "annotations_";
                objArr[29] = cls;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001\u001e\u001b\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bည\u0007\tည\b\n\u001b\u000bဈ\t\fဂ\n\u0010ည\u000b\u0011ဉ\f\u0012ည\r\u0013ဋ\u000e\u0014ဋ\u000f\u0015ည\u0010\u0016\u001d\u0017ည\u0011\u0018ည\u0012\u0019ဇ\u0013\u001aဈ\u0014\u001bည\u0015\u001cည\u0016\u001dဈ\u0017\u001e\u001b", objArr);
            case 3:
                return new AnonymousClass1EE();
            case 4:
                return new C207219b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EE.class) {
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
