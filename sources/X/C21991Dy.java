package X;

/* renamed from: X.1Dy  reason: invalid class name and case insensitive filesystem */
public final class C21991Dy extends C130786cX implements C181378mf {
    public static final int ACCURACY_IN_METERS_FIELD_NUMBER = 7;
    public static final int ADDRESS_FIELD_NUMBER = 4;
    public static final int COMMENT_FIELD_NUMBER = 11;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C21991Dy DEFAULT_INSTANCE;
    public static final int DEGREES_CLOCKWISE_FROM_MAGNETIC_NORTH_FIELD_NUMBER = 9;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int IS_LIVE_FIELD_NUMBER = 6;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static final int NAME_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int SPEED_IN_MPS_FIELD_NUMBER = 8;
    public static final int URL_FIELD_NUMBER = 5;
    public int accuracyInMeters_;
    public String address_ = "";
    public int bitField0_;
    public String comment_ = "";
    public AnonymousClass1EF contextInfo_;
    public int degreesClockwiseFromMagneticNorth_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public boolean isLive_;
    public C172548Lq jpegThumbnail_ = C172548Lq.A01;
    public String name_ = "";
    public float speedInMps_;
    public String url_ = "";

    static {
        C21991Dy r1 = new C21991Dy();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21991Dy.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[13];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "degreesLatitude_";
                objArr[2] = "degreesLongitude_";
                objArr[3] = "name_";
                objArr[4] = "address_";
                objArr[5] = "url_";
                objArr[6] = "isLive_";
                objArr[7] = "accuracyInMeters_";
                objArr[8] = "speedInMps_";
                objArr[9] = "degreesClockwiseFromMagneticNorth_";
                objArr[10] = "comment_";
                objArr[11] = "jpegThumbnail_";
                objArr[12] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဋ\u0006\bခ\u0007\tဋ\b\u000bဈ\t\u0010ည\n\u0011ဉ\u000b", objArr);
            case 3:
                return new C21991Dy();
            case 4:
                return new AnonymousClass173();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21991Dy.class) {
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
