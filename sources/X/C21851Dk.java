package X;

/* renamed from: X.1Dk  reason: invalid class name and case insensitive filesystem */
public final class C21851Dk extends C130786cX implements C181378mf {
    public static final int BOT_MESSAGE_SECRET_FIELD_NUMBER = 6;
    public static final int BOT_METADATA_FIELD_NUMBER = 7;
    public static final C21851Dk DEFAULT_INSTANCE;
    public static final int DEVICE_LIST_METADATA_FIELD_NUMBER = 1;
    public static final int DEVICE_LIST_METADATA_VERSION_FIELD_NUMBER = 2;
    public static final int MESSAGE_ADD_ON_DURATION_IN_SECS_FIELD_NUMBER = 5;
    public static final int MESSAGE_SECRET_FIELD_NUMBER = 3;
    public static final int PADDING_BYTES_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int REPORTING_TOKEN_VERSION_FIELD_NUMBER = 8;
    public int bitField0_;
    public C172548Lq botMessageSecret_;
    public AnonymousClass1D8 botMetadata_;
    public int deviceListMetadataVersion_;
    public C21901Dp deviceListMetadata_;
    public int messageAddOnDurationInSecs_;
    public C172548Lq messageSecret_;
    public C172548Lq paddingBytes_;
    public int reportingTokenVersion_;

    static {
        C21851Dk r1 = new C21851Dk();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21851Dk.class);
    }

    public C21851Dk() {
        C172548Lq r0 = C172548Lq.A01;
        this.messageSecret_ = r0;
        this.paddingBytes_ = r0;
        this.botMessageSecret_ = r0;
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
                objArr[1] = "deviceListMetadata_";
                objArr[2] = "deviceListMetadataVersion_";
                objArr[3] = "messageSecret_";
                objArr[4] = "paddingBytes_";
                objArr[5] = "messageAddOnDurationInSecs_";
                objArr[6] = "botMessageSecret_";
                objArr[7] = "botMetadata_";
                objArr[8] = "reportingTokenVersion_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004\u0006ည\u0005\u0007ဉ\u0006\bင\u0007", objArr);
            case 3:
                return new C21851Dk();
            case 4:
                return new AnonymousClass17V();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21851Dk.class) {
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
