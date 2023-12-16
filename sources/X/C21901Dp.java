package X;

/* renamed from: X.1Dp  reason: invalid class name and case insensitive filesystem */
public final class C21901Dp extends C130786cX implements C181378mf {
    public static final C21901Dp DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int RECEIVER_ACCOUNT_TYPE_FIELD_NUMBER = 11;
    public static final int RECIPIENT_KEY_HASH_FIELD_NUMBER = 8;
    public static final int RECIPIENT_KEY_INDEXES_FIELD_NUMBER = 10;
    public static final int RECIPIENT_TIMESTAMP_FIELD_NUMBER = 9;
    public static final int SENDER_ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final int SENDER_KEY_HASH_FIELD_NUMBER = 1;
    public static final int SENDER_KEY_INDEXES_FIELD_NUMBER = 3;
    public static final int SENDER_TIMESTAMP_FIELD_NUMBER = 2;
    public int bitField0_;
    public int receiverAccountType_;
    public C172548Lq recipientKeyHash_;
    public int recipientKeyIndexesMemoizedSerializedSize = -1;
    public C85224Fk recipientKeyIndexes_;
    public long recipientTimestamp_;
    public int senderAccountType_;
    public C172548Lq senderKeyHash_;
    public int senderKeyIndexesMemoizedSerializedSize = -1;
    public C85224Fk senderKeyIndexes_;
    public long senderTimestamp_;

    static {
        C21901Dp r1 = new C21901Dp();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21901Dp.class);
    }

    public C21901Dp() {
        C172548Lq r1 = C172548Lq.A01;
        this.senderKeyHash_ = r1;
        C130176bX r0 = C130176bX.A02;
        this.senderKeyIndexes_ = r0;
        this.recipientKeyHash_ = r1;
        this.recipientKeyIndexes_ = r0;
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        switch (r5.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[11];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "senderKeyHash_";
                objArr[2] = "senderTimestamp_";
                objArr[3] = "senderKeyIndexes_";
                objArr[4] = "senderAccountType_";
                C181368me r2 = AnonymousClass3B6.A00;
                objArr[5] = r2;
                objArr[6] = "recipientKeyHash_";
                objArr[7] = "recipientTimestamp_";
                objArr[8] = "recipientKeyIndexes_";
                objArr[9] = "receiverAccountType_";
                objArr[10] = r2;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0002\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003+\u0004ဌ\u0002\bည\u0003\tဃ\u0004\n+\u000bဌ\u0005", objArr);
            case 3:
                return new C21901Dp();
            case 4:
                return new AnonymousClass162();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21901Dp.class) {
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
