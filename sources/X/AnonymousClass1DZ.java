package X;

/* renamed from: X.1DZ  reason: invalid class name */
public final class AnonymousClass1DZ extends C130786cX implements C181378mf {
    public static final AnonymousClass1DZ DEFAULT_INSTANCE;
    public static final int INVOICE_URL_FIELD_NUMBER = 4;
    public static final int MANDATE_DETAILS_FIELD_NUMBER = 5;
    public static final int MANDATE_UPDATES_FIELD_NUMBER = 6;
    public static volatile C178978iP PARSER = null;
    public static final int RECEIVER_HANDLE_FIELD_NUMBER = 2;
    public static final int SENDER_HANDLE_FIELD_NUMBER = 3;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 1;
    public int bitField0_;
    public String invoiceUrl_ = "";
    public C21911Dq mandateDetails_;
    public C21871Dm mandateUpdates_;
    public byte memoizedIsInitialized = 2;
    public String receiverHandle_ = "";
    public String senderHandle_ = "";
    public long startTimestamp_;

    static {
        AnonymousClass1DZ r1 = new AnonymousClass1DZ();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DZ.class);
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
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"bitField0_", "startTimestamp_", "receiverHandle_", "senderHandle_", "invoiceUrl_", "mandateDetails_", "mandateUpdates_"});
            case 3:
                return new AnonymousClass1DZ();
            case 4:
                return new C204317y();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DZ.class) {
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
