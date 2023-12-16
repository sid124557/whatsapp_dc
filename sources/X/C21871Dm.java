package X;

/* renamed from: X.1Dm  reason: invalid class name and case insensitive filesystem */
public final class C21871Dm extends C130786cX implements C181378mf {
    public static final int ACCEPT_END_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AMOUNT_FIELD_NUMBER = 2;
    public static final int AMOUNT_RULE_FIELD_NUMBER = 4;
    public static final C21871Dm DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int MANDATE_UPDATE_INFO_FIELD_NUMBER = 7;
    public static volatile C178978iP PARSER = null;
    public static final int SEQ_NO_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 8;
    public long acceptEndTimestamp_;
    public int action_;
    public int amountRule_;
    public AnonymousClass1CI amount_;
    public int bitField0_;
    public String errorCode_ = "";
    public String mandateUpdateInfo_ = "";
    public byte memoizedIsInitialized = 2;
    public String seqNo_ = "";
    public int status_;

    static {
        C21871Dm r1 = new C21871Dm();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21871Dm.class);
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r5.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ᔄ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bᔄ\u0007", new Object[]{"bitField0_", "action_", "amount_", "acceptEndTimestamp_", "amountRule_", "errorCode_", "seqNo_", "mandateUpdateInfo_", "status_"});
            case 3:
                return new C21871Dm();
            case 4:
                return new AnonymousClass180();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21871Dm.class) {
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
