package X;

/* renamed from: X.1E3  reason: invalid class name */
public final class AnonymousClass1E3 extends C130786cX implements C181378mf {
    public static final int AMOUNT_1000_FIELD_NUMBER = 1;
    public static final int BANK_TRANSACTION_ID_FIELD_NUMBER = 2;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 3;
    public static final int CURRENCY_FIELD_NUMBER = 4;
    public static final AnonymousClass1E3 DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int GROUP_JID_FIELD_NUMBER = 6;
    public static final int MESSAGE_STANZA_ID_FIELD_NUMBER = 7;
    public static final int METADATA_FIELD_NUMBER = 14;
    public static volatile C178978iP PARSER = null;
    public static final int RECIEVER_JID_FIELD_NUMBER = 8;
    public static final int SENDER_JID_FIELD_NUMBER = 9;
    public static final int STATUS_FIELD_NUMBER = 10;
    public static final int TIMESTAMP_FIELD_NUMBER = 11;
    public static final int TRANSACTION_ID_FIELD_NUMBER = 12;
    public static final int TYPE_FIELD_NUMBER = 13;
    public long amount1000_;
    public String bankTransactionId_ = "";
    public int bitField0_;
    public String credentialId_ = "";
    public String currency_ = "";
    public String errorCode_ = "";
    public String groupJid_ = "";
    public byte memoizedIsInitialized = 2;
    public String messageStanzaId_ = "";
    public AnonymousClass1E9 metadata_;
    public String recieverJid_ = "";
    public String senderJid_ = "";
    public long status_;
    public long timestamp_;
    public String transactionId_ = "";
    public int type_;

    static {
        AnonymousClass1E3 r1 = new AnonymousClass1E3();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E3.class);
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
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဃ\t\u000bဂ\n\fဈ\u000b\rင\f\u000eᐉ\r", new Object[]{"bitField0_", "amount1000_", "bankTransactionId_", "credentialId_", "currency_", "errorCode_", "groupJid_", "messageStanzaId_", "recieverJid_", "senderJid_", "status_", "timestamp_", "transactionId_", "type_", "metadata_"});
            case 3:
                return new AnonymousClass1E3();
            case 4:
                return new AnonymousClass19A();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E3.class) {
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
