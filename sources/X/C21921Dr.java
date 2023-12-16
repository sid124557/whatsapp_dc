package X;

/* renamed from: X.1Dr  reason: invalid class name and case insensitive filesystem */
public final class C21921Dr extends C130786cX implements C181378mf {
    public static final int ACCURACY_IN_METERS_FIELD_NUMBER = 3;
    public static final int CAPTION_FIELD_NUMBER = 6;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final C21921Dr DEFAULT_INSTANCE;
    public static final int DEGREES_CLOCKWISE_FROM_MAGNETIC_NORTH_FIELD_NUMBER = 5;
    public static final int DEGREES_LATITUDE_FIELD_NUMBER = 1;
    public static final int DEGREES_LONGITUDE_FIELD_NUMBER = 2;
    public static final int JPEG_THUMBNAIL_FIELD_NUMBER = 16;
    public static volatile C178978iP PARSER = null;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 7;
    public static final int SPEED_IN_MPS_FIELD_NUMBER = 4;
    public static final int TIME_OFFSET_FIELD_NUMBER = 8;
    public int accuracyInMeters_;
    public int bitField0_;
    public String caption_ = "";
    public AnonymousClass1EF contextInfo_;
    public int degreesClockwiseFromMagneticNorth_;
    public double degreesLatitude_;
    public double degreesLongitude_;
    public C172548Lq jpegThumbnail_ = C172548Lq.A01;
    public long sequenceNumber_;
    public float speedInMps_;
    public int timeOffset_;

    static {
        C21921Dr r1 = new C21921Dr();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21921Dr.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[11];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "degreesLatitude_";
                objArr[2] = "degreesLongitude_";
                objArr[3] = "accuracyInMeters_";
                objArr[4] = "speedInMps_";
                objArr[5] = "degreesClockwiseFromMagneticNorth_";
                objArr[6] = "caption_";
                objArr[7] = "sequenceNumber_";
                objArr[8] = "timeOffset_";
                objArr[9] = "jpegThumbnail_";
                objArr[10] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဋ\u0007\u0010ည\b\u0011ဉ\t", objArr);
            case 3:
                return new C21921Dr();
            case 4:
                return new AnonymousClass172();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21921Dr.class) {
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
