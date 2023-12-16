package X;

/* renamed from: X.1DI  reason: invalid class name */
public final class AnonymousClass1DI extends C130786cX implements C181378mf {
    public static final AnonymousClass1DI DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 5;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 4;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 1;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String directPath_ = "";
    public C172548Lq fileEncSha256_;
    public C172548Lq fileSha256_;
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;

    static {
        AnonymousClass1DI r1 = new AnonymousClass1DI();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DI.class);
    }

    public AnonymousClass1DI() {
        C172548Lq r0 = C172548Lq.A01;
        this.mediaKey_ = r0;
        this.fileSha256_ = r0;
        this.fileEncSha256_ = r0;
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
                A1Z[1] = "mediaKey_";
                A1Z[2] = "mediaKeyTimestamp_";
                A1Z[3] = "fileSha256_";
                A1Z[4] = "fileEncSha256_";
                A1Z[5] = "directPath_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004", A1Z);
            case 3:
                return new AnonymousClass1DI();
            case 4:
                return new AnonymousClass17Y();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DI.class) {
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
