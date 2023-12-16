package X;

/* renamed from: X.1DT  reason: invalid class name */
public final class AnonymousClass1DT extends C130786cX implements C181378mf {
    public static final AnonymousClass1DT DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int PLUGIN_TYPE_FIELD_NUMBER = 2;
    public static final int PROFILE_PHOTO_CDN_URL_FIELD_NUMBER = 4;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    public static final int REFERENCE_INDEX_FIELD_NUMBER = 6;
    public static final int SEARCH_PROVIDER_URL_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_CDN_URL_FIELD_NUMBER = 3;
    public int bitField0_;
    public int pluginType_ = 1;
    public String profilePhotoCdnUrl_ = "";
    public int provider_ = 1;
    public int referenceIndex_;
    public String searchProviderUrl_ = "";
    public String thumbnailCdnUrl_ = "";

    static {
        AnonymousClass1DT r1 = new AnonymousClass1DT();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DT.class);
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
                objArr[1] = "provider_";
                objArr[2] = AnonymousClass3B9.A00;
                objArr[3] = "pluginType_";
                objArr[4] = AnonymousClass3B8.A00;
                objArr[5] = "thumbnailCdnUrl_";
                objArr[6] = "profilePhotoCdnUrl_";
                objArr[7] = "searchProviderUrl_";
                objArr[8] = "referenceIndex_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဋ\u0005", objArr);
            case 3:
                return new AnonymousClass1DT();
            case 4:
                return new C199015u();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DT.class) {
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
