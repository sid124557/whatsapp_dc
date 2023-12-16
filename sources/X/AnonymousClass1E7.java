package X;

/* renamed from: X.1E7  reason: invalid class name */
public final class AnonymousClass1E7 extends C130786cX implements C181378mf {
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final AnonymousClass1E7 DEFAULT_INSTANCE;
    public static final int DEVICE_BOARD_FIELD_NUMBER = 13;
    public static final int DEVICE_EXP_ID_FIELD_NUMBER = 14;
    public static final int DEVICE_FIELD_NUMBER = 7;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 15;
    public static final int LOCALE_COUNTRY_ISO_3166_1_ALPHA_2_FIELD_NUMBER = 12;
    public static final int LOCALE_LANGUAGE_ISO_639_1_FIELD_NUMBER = 11;
    public static final int MANUFACTURER_FIELD_NUMBER = 6;
    public static final int MCC_FIELD_NUMBER = 3;
    public static final int MNC_FIELD_NUMBER = 4;
    public static final int OS_BUILD_NUMBER_FIELD_NUMBER = 8;
    public static final int OS_VERSION_FIELD_NUMBER = 5;
    public static volatile C178978iP PARSER = null;
    public static final int PHONE_ID_FIELD_NUMBER = 9;
    public static final int PLATFORM_FIELD_NUMBER = 1;
    public static final int RELEASE_CHANNEL_FIELD_NUMBER = 10;
    public AnonymousClass1DM appVersion_;
    public int bitField0_;
    public String deviceBoard_ = "";
    public String deviceExpId_ = "";
    public int deviceType_;
    public String device_ = "";
    public String localeCountryIso31661Alpha2_ = "";
    public String localeLanguageIso6391_ = "";
    public String manufacturer_ = "";
    public String mcc_ = "";
    public String mnc_ = "";
    public String osBuildNumber_ = "";
    public String osVersion_ = "";
    public String phoneId_ = "";
    public int platform_;
    public int releaseChannel_;

    static {
        AnonymousClass1E7 r1 = new AnonymousClass1E7();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E7.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[19];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "platform_";
                objArr[2] = AnonymousClass3C4.A00;
                objArr[3] = "appVersion_";
                objArr[4] = "mcc_";
                objArr[5] = "mnc_";
                objArr[6] = "osVersion_";
                objArr[7] = "manufacturer_";
                objArr[8] = "device_";
                objArr[9] = "osBuildNumber_";
                objArr[10] = "phoneId_";
                objArr[11] = "releaseChannel_";
                objArr[12] = AnonymousClass3C5.A00;
                objArr[13] = "localeLanguageIso6391_";
                objArr[14] = "localeCountryIso31661Alpha2_";
                objArr[15] = "deviceBoard_";
                objArr[16] = "deviceExpId_";
                objArr[17] = "deviceType_";
                objArr[18] = AnonymousClass3C3.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဌ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဌ\u000e", objArr);
            case 3:
                return new AnonymousClass1E7();
            case 4:
                return new C206918y();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E7.class) {
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
