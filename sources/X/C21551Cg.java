package X;

/* renamed from: X.1Cg  reason: invalid class name and case insensitive filesystem */
public final class C21551Cg extends C130786cX implements C181378mf {
    public static final int ADVERTISER_NAME_FIELD_NUMBER = 1;
    public static final int CAPTION_FIELD_NUMBER = 17;
    public static final C21551Cg DEFAULT_INSTANCE;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public String advertiserName_ = "";
    public int bitField0_;
    public String caption_ = "";
    public C172548Lq jpegThumbnail_ = C172548Lq.A01;
    public int mediaType_;

    static {
        C21551Cg r1 = new C21551Cg();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21551Cg.class);
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
                A1Z[1] = "advertiserName_";
                A1Z[2] = "mediaType_";
                A1Z[3] = AnonymousClass3BA.A00;
                A1Z[4] = "jpegThumbnail_";
                A1Z[5] = "caption_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0010ည\u0002\u0011ဈ\u0003", A1Z);
            case 3:
                return new C21551Cg();
            case 4:
                return new C199215w();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21551Cg.class) {
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
