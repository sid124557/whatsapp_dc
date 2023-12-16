package X;

/* renamed from: X.1EN  reason: invalid class name */
public final class AnonymousClass1EN extends C130786cX implements C181378mf {
    public static final int CONNECT_ATTEMPT_COUNT_FIELD_NUMBER = 16;
    public static final int CONNECT_REASON_FIELD_NUMBER = 13;
    public static final int CONNECT_TYPE_FIELD_NUMBER = 12;
    public static final AnonymousClass1EN DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 18;
    public static final int DEVICE_PAIRING_DATA_FIELD_NUMBER = 19;
    public static final int DNS_SOURCE_FIELD_NUMBER = 15;
    public static final int FB_APP_ID_FIELD_NUMBER = 31;
    public static final int FB_CAT_FIELD_NUMBER = 21;
    public static final int FB_DEVICE_ID_FIELD_NUMBER = 32;
    public static final int FB_USER_AGENT_FIELD_NUMBER = 22;
    public static final int INTEROP_DATA_FIELD_NUMBER = 38;
    public static final int IOS_APP_EXTENSION_FIELD_NUMBER = 30;
    public static final int LC_FIELD_NUMBER = 24;
    public static final int MEM_CLASS_FIELD_NUMBER = 37;
    public static final int OC_FIELD_NUMBER = 23;
    public static final int PADDING_BYTES_FIELD_NUMBER = 34;
    public static volatile C178978iP PARSER = null;
    public static final int PASSIVE_FIELD_NUMBER = 3;
    public static final int PRODUCT_FIELD_NUMBER = 20;
    public static final int PULL_FIELD_NUMBER = 33;
    public static final int PUSH_NAME_FIELD_NUMBER = 7;
    public static final int SESSION_ID_FIELD_NUMBER = 9;
    public static final int SHARDS_FIELD_NUMBER = 14;
    public static final int SHORT_CONNECT_FIELD_NUMBER = 10;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_AGENT_FIELD_NUMBER = 5;
    public static final int WEB_INFO_FIELD_NUMBER = 6;
    public static final int YEAR_CLASS_FIELD_NUMBER = 36;
    public int bitField0_;
    public int connectAttemptCount_;
    public int connectReason_;
    public int connectType_;
    public C21861Dl devicePairingData_;
    public int device_;
    public C21311Bi dnsSource_;
    public long fbAppId_;
    public C172548Lq fbCat_;
    public C172548Lq fbDeviceId_;
    public C172548Lq fbUserAgent_;
    public AnonymousClass1CR interopData_;
    public int iosAppExtension_;
    public int lc_;
    public int memClass_;
    public boolean oc_;
    public C172548Lq paddingBytes_;
    public boolean passive_;
    public int product_;
    public boolean pull_;
    public String pushName_ = "";
    public int sessionId_;
    public C85224Fk shards_ = C130176bX.A02;
    public boolean shortConnect_;
    public AnonymousClass1E7 userAgent_;
    public long username_;
    public AnonymousClass1EQ webInfo_;
    public int yearClass_;

    static {
        AnonymousClass1EN r1 = new AnonymousClass1EN();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EN.class);
    }

    public AnonymousClass1EQ A0M() {
        AnonymousClass1EQ r0 = this.webInfo_;
        if (r0 == null) {
            return AnonymousClass1EQ.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public AnonymousClass1EN() {
        C172548Lq r0 = C172548Lq.A01;
        this.fbCat_ = r0;
        this.fbUserAgent_ = r0;
        this.fbDeviceId_ = r0;
        this.paddingBytes_ = r0;
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[32];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "username_";
                objArr[2] = "passive_";
                objArr[3] = "userAgent_";
                objArr[4] = "webInfo_";
                objArr[5] = "pushName_";
                objArr[6] = "sessionId_";
                objArr[7] = "shortConnect_";
                objArr[8] = "connectType_";
                objArr[9] = C64073Bz.A00;
                objArr[10] = "connectReason_";
                objArr[11] = C64063By.A00;
                objArr[12] = "shards_";
                objArr[13] = "dnsSource_";
                objArr[14] = "connectAttemptCount_";
                objArr[15] = "device_";
                objArr[16] = "devicePairingData_";
                objArr[17] = "product_";
                objArr[18] = AnonymousClass3C2.A00;
                objArr[19] = "fbCat_";
                objArr[20] = "fbUserAgent_";
                objArr[21] = "oc_";
                objArr[22] = "lc_";
                objArr[23] = "iosAppExtension_";
                objArr[24] = AnonymousClass3C1.A00;
                objArr[25] = "fbAppId_";
                objArr[26] = "fbDeviceId_";
                objArr[27] = "pull_";
                objArr[28] = "paddingBytes_";
                objArr[29] = "yearClass_";
                objArr[30] = "memClass_";
                objArr[31] = "interopData_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u001b\u0000\u0001\u0001&\u001b\u0000\u0001\u0000\u0001ဃ\u0000\u0003ဇ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဈ\u0004\tဍ\u0005\nဇ\u0006\fဌ\u0007\rဌ\b\u000e\u0016\u000fဉ\t\u0010ဋ\n\u0012ဋ\u000b\u0013ဉ\f\u0014ဌ\r\u0015ည\u000e\u0016ည\u000f\u0017ဇ\u0010\u0018င\u0011\u001eဌ\u0012\u001fဃ\u0013 ည\u0014!ဇ\u0015\"ည\u0016$င\u0017%င\u0018&ဉ\u0019", objArr);
            case 3:
                return new AnonymousClass1EN();
            case 4:
                return new C206418t();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EN.class) {
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
