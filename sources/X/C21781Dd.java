package X;

/* renamed from: X.1Dd  reason: invalid class name and case insensitive filesystem */
public final class C21781Dd extends C130786cX implements C181378mf {
    public static final int AMOUNT_1000_FIELD_NUMBER = 2;
    public static final int AMOUNT_FIELD_NUMBER = 6;
    public static final int BACKGROUND_FIELD_NUMBER = 7;
    public static final int CURRENCY_CODE_ISO4217_FIELD_NUMBER = 1;
    public static final C21781Dd DEFAULT_INSTANCE;
    public static final int EXPIRY_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int NOTE_MESSAGE_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int REQUEST_FROM_FIELD_NUMBER = 3;
    public long amount1000_;
    public AnonymousClass1CI amount_;
    public C21931Ds background_;
    public int bitField0_;
    public String currencyCodeIso4217_ = "";
    public long expiryTimestamp_;
    public AnonymousClass1EU noteMessage_;
    public String requestFrom_ = "";

    static {
        C21781Dd r1 = new C21781Dd();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21781Dd.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[8];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "currencyCodeIso4217_";
                objArr[2] = "amount1000_";
                objArr[3] = "requestFrom_";
                objArr[4] = "noteMessage_";
                objArr[5] = "expiryTimestamp_";
                objArr[6] = "amount_";
                objArr[7] = "background_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဃ\u0002\u0003ဈ\u0003\u0004ဉ\u0000\u0005ဂ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", objArr);
            case 3:
                return new C21781Dd();
            case 4:
                return new AnonymousClass17P();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21781Dd.class) {
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
