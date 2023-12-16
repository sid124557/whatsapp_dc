package X;

/* renamed from: X.1Di  reason: invalid class name and case insensitive filesystem */
public final class C21831Di extends C130786cX implements C181378mf {
    public static final int CONTEXT_INFO_FIELD_NUMBER = 9;
    public static final C21831Di DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 7;
    public static final int FILE_ENC_SHA256_FIELD_NUMBER = 6;
    public static final int FILE_SHA256_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 5;
    public static final int MEDIA_KEY_TIMESTAMP_FIELD_NUMBER = 8;
    public static final int MIMETYPE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public AnonymousClass1EF contextInfo_;
    public String directPath_;
    public C172548Lq fileEncSha256_;
    public C172548Lq fileSha256_;
    public long mediaKeyTimestamp_;
    public C172548Lq mediaKey_;
    public String mimetype_ = "";
    public String url_ = "";

    static {
        C21831Di r1 = new C21831Di();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21831Di.class);
    }

    public C21831Di() {
        C172548Lq r0 = C172548Lq.A01;
        this.fileSha256_ = r0;
        this.mediaKey_ = r0;
        this.fileEncSha256_ = r0;
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
                Object[] objArr = new Object[9];
                AnonymousClass0x2.A1R(objArr);
                AnonymousClass0x7.A1O(objArr);
                objArr[3] = "fileSha256_";
                objArr[4] = "mediaKey_";
                objArr[5] = "fileEncSha256_";
                objArr[6] = "directPath_";
                objArr[7] = "mediaKeyTimestamp_";
                objArr[8] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0005ည\u0003\u0006ည\u0004\u0007ဈ\u0005\bဂ\u0006\tဉ\u0007", objArr);
            case 3:
                return new C21831Di();
            case 4:
                return new AnonymousClass174();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21831Di.class) {
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
