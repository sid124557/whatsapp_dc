package X;

/* renamed from: X.1E5  reason: invalid class name */
public final class AnonymousClass1E5 extends C130786cX implements C181378mf {
    public static final int BACKGROUND_ARGB_FIELD_NUMBER = 20;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1E5 DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 9;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 8;
    public static final int FILE_LENGTH_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 7;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 10;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int PTT_FIELD_NUMBER = 6;
    public static final int SECONDS_FIELD_NUMBER = 5;
    public static final int STREAMING_SIDECAR_FIELD_NUMBER = 18;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int VIEW_ONCE_FIELD_NUMBER = 21;
    public static final int WAVEFORM_FIELD_NUMBER = 19;
    public int backgroundArgb_;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public String directPath_;
    public C172548Lq fileEncSha256_;
    public long fileLength_;
    public C172548Lq fileSha256_;
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;
    public String mimetype_ = "";
    public boolean ptt_;
    public int seconds_;
    public C172548Lq streamingSidecar_;
    public String url_ = "";
    public boolean viewOnce_;
    public C172548Lq waveform_;

    static {
        AnonymousClass1E5 r1 = new AnonymousClass1E5();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E5.class);
    }

    public AnonymousClass1E5() {
        C172548Lq r0 = C172548Lq.A01;
        this.fileSha256_ = r0;
        this.mediaKey_ = r0;
        this.fileEncSha256_ = r0;
        this.directPath_ = "";
        this.streamingSidecar_ = r0;
        this.waveform_ = r0;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[16];
                AnonymousClass0x2.A1R(objArr);
                AnonymousClass0x7.A1O(objArr);
                objArr[3] = "fileSha256_";
                objArr[4] = "fileLength_";
                objArr[5] = "seconds_";
                objArr[6] = "ptt_";
                objArr[7] = "mediaKey_";
                objArr[8] = "fileEncSha256_";
                objArr[9] = "directPath_";
                objArr[10] = "mediaKeyTimestamp_";
                objArr[11] = "contextInfo_";
                objArr[12] = "streamingSidecar_";
                objArr[13] = "waveform_";
                objArr[14] = "backgroundArgb_";
                objArr[15] = "viewOnce_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဇ\u0005\u0007ည\u0006\bည\u0007\tဈ\b\nဂ\t\u0011ဉ\n\u0012ည\u000b\u0013ည\f\u0014ဆ\r\u0015ဇ\u000e", objArr);
            case 3:
                return new AnonymousClass1E5();
            case 4:
                return new AnonymousClass16H();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E5.class) {
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
