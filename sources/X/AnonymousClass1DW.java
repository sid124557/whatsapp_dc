package X;

/* renamed from: X.1DW  reason: invalid class name */
public final class AnonymousClass1DW extends C130786cX implements C181378mf {
    public static final AnonymousClass1DW DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 2;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 6;
    public static final int FILE_SHA256_FIELD_NUMBER = 5;
    public static final int FILE_SIZE_BYTES_FIELD_NUMBER = 4;
    public static final int HANDLE_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String directPath_ = "";
    public C172548Lq fileEncSha256_;
    public C172548Lq fileSha256_;
    public long fileSizeBytes_;
    public String handle_ = "";
    public C172548Lq mediaKey_;

    static {
        AnonymousClass1DW r1 = new AnonymousClass1DW();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DW.class);
    }

    public AnonymousClass1DW() {
        C172548Lq r1 = C172548Lq.A01;
        this.mediaKey_ = r1;
        this.fileSha256_ = r1;
        this.fileEncSha256_ = r1;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "mediaKey_";
                objArr[2] = "directPath_";
                objArr[3] = "handle_";
                objArr[4] = "fileSizeBytes_";
                objArr[5] = "fileSha256_";
                objArr[6] = "fileEncSha256_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ည\u0004\u0006ည\u0005", objArr);
            case 3:
                return new AnonymousClass1DW();
            case 4:
                return new AnonymousClass183();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DW.class) {
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
