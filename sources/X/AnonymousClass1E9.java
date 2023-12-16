package X;

/* renamed from: X.1E9  reason: invalid class name */
public final class AnonymousClass1E9 extends C130786cX implements C181378mf {
    public static final int AMOUNT_FIELD_NUMBER = 1;
    public static final int COLLECT_REQUEST_ID_FIELD_NUMBER = 2;
    public static final int COUNTER_FIELD_NUMBER = 3;
    public static final AnonymousClass1E9 DEFAULT_INSTANCE;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int LAST_STATUS_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int LOCAL_TRANSACTION_ID_FIELD_NUMBER = 6;
    public static final int MARKET_METADATA_FIELD_NUMBER = 15;
    public static final int MESSAGE_CONTAINS_BACKGROUND_FIELD_NUMBER = 20;
    public static final int MESSAGE_KEY_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 19;
    public static final int OFFER_CLAIM_FIELD_NUMBER = 18;
    public static final int ORDER_FIELD_NUMBER = 17;
    public static volatile C178978iP PARSER = null;
    public static final int PREVIOUS_STATUS_FIELD_NUMBER = 8;
    public static final int PREVIOUS_TYPE_FIELD_NUMBER = 9;
    public static final int REFERENCE_MESSAGE_ID_FIELD_NUMBER = 11;
    public static final int SENDER_ALIAS_FIELD_NUMBER = 21;
    public static final int SERVICE_FIELD_NUMBER = 13;
    public static final int VERSION_FIELD_NUMBER = 14;
    public AnonymousClass1CI amount_;
    public int bitField0_;
    public String collectRequestId_ = "";
    public String counter_ = "";
    public long expiryTimestamp_;
    public long lastStatusTimestamp_;
    public String localTransactionId_ = "";
    public C21421Bt marketMetadata_;
    public byte memoizedIsInitialized = 2;
    public boolean messageContainsBackground_;
    public AnonymousClass1ET messageKey_;
    public int messageType_;
    public AnonymousClass1D2 offerClaim_;
    public AnonymousClass1BZ order_;
    public long previousStatus_;
    public long previousType_;
    public String referenceMessageID_ = "";
    public String senderAlias_ = "";
    public String service_ = "";
    public int version_;

    static {
        AnonymousClass1E9 r1 = new AnonymousClass1E9();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E9.class);
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
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0000\u0005\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bᔂ\u0007\tᔂ\b\u000bဈ\t\rဈ\n\u000eᔄ\u000b\u000fᔉ\f\u0011ဉ\r\u0012ᐉ\u000e\u0013ဌ\u000f\u0014ဇ\u0010\u0015ဈ\u0011", new Object[]{"bitField0_", "amount_", "collectRequestId_", "counter_", "expiryTimestamp_", "lastStatusTimestamp_", "localTransactionId_", "messageKey_", "previousStatus_", "previousType_", "referenceMessageID_", "service_", "version_", "marketMetadata_", "order_", "offerClaim_", "messageType_", C63973Bp.A00, "messageContainsBackground_", "senderAlias_"});
            case 3:
                return new AnonymousClass1E9();
            case 4:
                return new C203917u();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E9.class) {
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
