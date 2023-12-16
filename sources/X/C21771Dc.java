package X;

/* renamed from: X.1Dc  reason: invalid class name and case insensitive filesystem */
public final class C21771Dc extends C130786cX implements C181378mf {
    public static final C21771Dc DEFAULT_INSTANCE;
    public static final int DIRECT_PATH_FIELD_NUMBER = 1;
    public static final int ENC_THUMB_HASH_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_KEY_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int THUMB_HASH_FIELD_NUMBER = 2;
    public static final int THUMB_HEIGHT_FIELD_NUMBER = 7;
    public static final int THUMB_WIDTH_FIELD_NUMBER = 6;
    public int bitField0_;
    public String directPath_ = "";
    public String encThumbHash_ = "";
    public long mediaKeyTimestampMs_;
    public C172548Lq mediaKey_ = C172548Lq.A01;
    public String thumbHash_ = "";
    public int thumbHeight_;
    public int thumbWidth_;

    static {
        C21771Dc r1 = new C21771Dc();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21771Dc.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[8];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "directPath_";
                objArr[2] = "thumbHash_";
                objArr[3] = "encThumbHash_";
                objArr[4] = "mediaKey_";
                objArr[5] = "mediaKeyTimestampMs_";
                objArr[6] = "thumbWidth_";
                objArr[7] = "thumbHeight_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006", objArr);
            case 3:
                return new C21771Dc();
            case 4:
                return new AnonymousClass17E();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21771Dc.class) {
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
