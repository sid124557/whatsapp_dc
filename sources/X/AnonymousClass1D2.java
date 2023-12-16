package X;

/* renamed from: X.1D2  reason: invalid class name */
public final class AnonymousClass1D2 extends C130786cX implements C181378mf {
    public static final AnonymousClass1D2 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int INCENTIVE_TRANSACTION_ID_FIELD_NUMBER = 3;
    public static final int OFFER_ID_FIELD_NUMBER = 1;
    public static final int PARENT_TRANSACTION_ID_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public long id_;
    public String incentiveTransactionId_ = "";
    public byte memoizedIsInitialized = 2;
    public long offerId_;
    public String parentTransactionId_ = "";

    static {
        AnonymousClass1D2 r1 = new AnonymousClass1D2();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D2.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r4.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] objArr = new Object[5];
                objArr[0] = "bitField0_";
                C18320x8.A1S(objArr, "offerId_");
                objArr[3] = "incentiveTransactionId_";
                objArr[4] = "parentTransactionId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", objArr);
            case 3:
                return new AnonymousClass1D2();
            case 4:
                return new C204017v();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D2.class) {
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
