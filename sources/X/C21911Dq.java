package X;

/* renamed from: X.1Dq  reason: invalid class name and case insensitive filesystem */
public final class C21911Dq extends C130786cX implements C181378mf {
    public static final int ACCEPT_END_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int ACCEPT_START_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int AMOUNT_RULE_FIELD_NUMBER = 3;
    public static final C21911Dq DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 4;
    public static final int FREQUENCY_RULE_FIELD_NUMBER = 5;
    public static final int IS_REVOCABLE_FIELD_NUMBER = 6;
    public static final int MANDATE_INFO_FIELD_NUMBER = 7;
    public static final int MANDATE_NO_FIELD_NUMBER = 8;
    public static final int ORIGINAL_AMOUNT_FIELD_NUMBER = 9;
    public static volatile C178978iP PARSER;
    public long acceptEndTimestamp_;
    public long acceptStartTimestamp_;
    public int amountRule_;
    public int bitField0_;
    public String errorCode_ = "";
    public String frequencyRule_ = "";
    public boolean isRevocable_;
    public String mandateInfo_ = "";
    public String mandateNo_ = "";
    public byte memoizedIsInitialized = 2;
    public AnonymousClass1CI originalAmount_;

    static {
        C21911Dq r1 = new C21911Dq();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21911Dq.class);
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
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0005\u0001ᔂ\u0000\u0002ᔂ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ᔇ\u0005\u0007ဈ\u0006\bဈ\u0007\tᔉ\b", new Object[]{"bitField0_", "acceptEndTimestamp_", "acceptStartTimestamp_", "amountRule_", "errorCode_", "frequencyRule_", "isRevocable_", "mandateInfo_", "mandateNo_", "originalAmount_"});
            case 3:
                return new C21911Dq();
            case 4:
                return new C204417z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21911Dq.class) {
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
