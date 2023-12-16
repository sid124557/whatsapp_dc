package X;

/* renamed from: X.1EA  reason: invalid class name */
public final class AnonymousClass1EA extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1EA DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 8;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int FILE_LENGTH_FIELD_NUMBER = 9;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int FIRST_FRAME_LENGTH_FIELD_NUMBER = 11;
    public static final int FIRST_FRAME_SIDECAR_FIELD_NUMBER = 12;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int IS_AI_STICKER_FIELD_NUMBER = 20;
    public static final int IS_ANIMATED_FIELD_NUMBER = 13;
    public static final int IS_AVATAR_FIELD_NUMBER = 19;
    public static final int IS_LOTTIE_FIELD_NUMBER = 21;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int PNG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int STICKER_SENT_TS_FIELD_NUMBER = 18;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public String directPath_;
    public C172548Lq fileEncSha256_;
    public long fileLength_;
    public C172548Lq fileSha256_;
    public int firstFrameLength_;
    public C172548Lq firstFrameSidecar_;
    public int height_;
    public boolean isAiSticker_;
    public boolean isAnimated_;
    public boolean isAvatar_;
    public boolean isLottie_;
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;
    public String mimetype_;
    public C172548Lq pngThumbnail_;
    public long stickerSentTs_;
    public String url_ = "";
    public int width_;

    static {
        AnonymousClass1EA r1 = new AnonymousClass1EA();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EA.class);
    }

    public AnonymousClass1EA() {
        C172548Lq r0 = C172548Lq.A01;
        this.fileSha256_ = r0;
        this.fileEncSha256_ = r0;
        this.mediaKey_ = r0;
        this.mimetype_ = "";
        this.directPath_ = "";
        this.firstFrameSidecar_ = r0;
        this.pngThumbnail_ = r0;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[20];
                AnonymousClass0x2.A1R(objArr);
                C18300x5.A1Q(objArr);
                objArr[10] = "mediaKeyTimestamp_";
                objArr[11] = "firstFrameLength_";
                objArr[12] = "firstFrameSidecar_";
                objArr[13] = "isAnimated_";
                objArr[14] = "pngThumbnail_";
                objArr[15] = "contextInfo_";
                objArr[16] = "stickerSentTs_";
                objArr[17] = "isAvatar_";
                objArr[18] = "isAiSticker_";
                objArr[19] = "isLottie_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဃ\b\nဂ\t\u000bဋ\n\fည\u000b\rဇ\f\u0010ည\r\u0011ဉ\u000e\u0012ဂ\u000f\u0013ဇ\u0010\u0014ဇ\u0011\u0015ဇ\u0012", objArr);
            case 3:
                return new AnonymousClass1EA();
            case 4:
                return new C208519o();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EA.class) {
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
