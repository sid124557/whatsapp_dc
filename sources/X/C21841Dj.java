package X;

/* renamed from: X.1Dj  reason: invalid class name and case insensitive filesystem */
public final class C21841Dj extends C130786cX implements C181378mf {
    public static final int CANONICAL_URL_FIELD_NUMBER = 5;
    public static final C21841Dj DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int HQ_THUMBNAIL_FIELD_NUMBER = 8;
    public static final int MATCH_TEXT_FIELD_NUMBER = 6;
    public static volatile C178978iP PARSER = null;
    public static final int PREVIEW_TYPE_FIELD_NUMBER = 7;
    public static final int THUMB_DATA_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URL_FIELD_NUMBER = 1;
    public int bitField0_;
    public String canonicalUrl_ = "";
    public String description_ = "";
    public C21771Dc hqThumbnail_;
    public String matchText_ = "";
    public String previewType_ = "";
    public C172548Lq thumbData_ = C172548Lq.A01;
    public String title_ = "";
    public String url_ = "";

    static {
        C21841Dj r1 = new C21841Dj();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21841Dj.class);
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
                objArr[1] = "url_";
                objArr[2] = "title_";
                objArr[3] = "description_";
                objArr[4] = "thumbData_";
                objArr[5] = "canonicalUrl_";
                objArr[6] = "matchText_";
                objArr[7] = "previewType_";
                objArr[8] = "hqThumbnail_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007", objArr);
            case 3:
                return new C21841Dj();
            case 4:
                return new AnonymousClass17D();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21841Dj.class) {
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
