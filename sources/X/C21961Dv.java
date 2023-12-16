package X;

/* renamed from: X.1Dv  reason: invalid class name and case insensitive filesystem */
public final class C21961Dv extends C130786cX implements C181378mf {
    public static final C21961Dv DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 8;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 3;
    public static final int FILE_LENGTH_FIELD_NUMBER = 9;
    public static final int FILE_SHA256_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int LAST_STICKER_SENT_TS_FIELD_NUMBER = 11;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MIMETYPE_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WEIGHT_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 7;
    public int bitField0_;
    public String directPath_;
    public C172548Lq fileEncSha256_;
    public long fileLength_;
    public C172548Lq fileSha256_;
    public int height_;
    public long lastStickerSentTs_;
    public C172548Lq mediaKey_;
    public String mimetype_;
    public String url_ = "";
    public float weight_;
    public int width_;

    static {
        C21961Dv r1 = new C21961Dv();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21961Dv.class);
    }

    public C21961Dv() {
        C172548Lq r0 = C172548Lq.A01;
        this.fileSha256_ = r0;
        this.fileEncSha256_ = r0;
        this.mediaKey_ = r0;
        this.mimetype_ = "";
        this.directPath_ = "";
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[12];
                AnonymousClass0x2.A1R(objArr);
                C18300x5.A1Q(objArr);
                objArr[10] = "weight_";
                objArr[11] = "lastStickerSentTs_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဈ\u0007\tဃ\b\nခ\t\u000bဂ\n", objArr);
            case 3:
                return new C21961Dv();
            case 4:
                return new C203417p();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21961Dv.class) {
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
