package X;

/* renamed from: X.1E0  reason: invalid class name */
public final class AnonymousClass1E0 extends C130786cX implements C181378mf {
    public static final int AMOUNT_1000_FIELD_NUMBER = 2;
    public static final int CURRENCY_DEPRECATED_FIELD_NUMBER = 1;
    public static final int CURRENCY_FIELD_NUMBER = 9;
    public static final AnonymousClass1E0 DEFAULT_INSTANCE;
    public static final int EXCHANGE_AMOUNT_FIELD_NUMBER = 13;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 7;
    public static final int FUTUREPROOFED_FIELD_NUMBER = 8;
    public static volatile C178978iP PARSER = null;
    public static final int PRIMARY_AMOUNT_FIELD_NUMBER = 12;
    public static final int RECEIVER_JID_FIELD_NUMBER = 3;
    public static final int REQUEST_MESSAGE_KEY_FIELD_NUMBER = 6;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int TRANSACTION_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int TXN_STATUS_FIELD_NUMBER = 10;
    public static final int USE_NOVI_FIAT_FORMAT_FIELD_NUMBER = 11;
    public long amount1000_;
    public int bitField0_;
    public int currencyDeprecated_;
    public String currency_ = "";
    public AnonymousClass1CI exchangeAmount_;
    public long expiryTimestamp_;
    public boolean futureproofed_;
    public AnonymousClass1CI primaryAmount_;
    public String receiverJid_ = "";
    public AnonymousClass1ET requestMessageKey_;
    public int status_;
    public long transactionTimestamp_;
    public int txnStatus_;
    public boolean useNoviFiatFormat_;

    static {
        AnonymousClass1E0 r1 = new AnonymousClass1E0();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E0.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[17];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "currencyDeprecated_";
                objArr[2] = AnonymousClass3C7.A00;
                objArr[3] = "amount1000_";
                objArr[4] = "receiverJid_";
                objArr[5] = "status_";
                objArr[6] = AnonymousClass3C8.A00;
                objArr[7] = "transactionTimestamp_";
                objArr[8] = "requestMessageKey_";
                objArr[9] = "expiryTimestamp_";
                objArr[10] = "futureproofed_";
                objArr[11] = "currency_";
                objArr[12] = "txnStatus_";
                objArr[13] = AnonymousClass3C9.A00;
                objArr[14] = "useNoviFiatFormat_";
                objArr[15] = "primaryAmount_";
                objArr[16] = "exchangeAmount_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဃ\u0004\u0006ဉ\u0005\u0007ဃ\u0006\bဇ\u0007\tဈ\b\nဌ\t\u000bဇ\n\fဉ\u000b\rဉ\f", objArr);
            case 3:
                return new AnonymousClass1E0();
            case 4:
                return new AnonymousClass199();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E0.class) {
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
