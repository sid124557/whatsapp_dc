package X;

/* renamed from: X.1D3  reason: invalid class name */
public final class AnonymousClass1D3 extends C130786cX implements C181378mf {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final AnonymousClass1D3 DEFAULT_INSTANCE;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 5;
    public static final int KEY_INDEX_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public int accountType_;
    public int bitField0_;
    public int deviceType_;
    public int keyIndex_;
    public int rawId_;
    public long timestamp_;

    static {
        AnonymousClass1D3 r1 = new AnonymousClass1D3();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D3.class);
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        switch (r5.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[8];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "rawId_";
                objArr[2] = "timestamp_";
                objArr[3] = "keyIndex_";
                objArr[4] = "accountType_";
                C181368me r2 = AnonymousClass3B6.A00;
                objArr[5] = r2;
                objArr[6] = "deviceType_";
                objArr[7] = r2;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", objArr);
            case 3:
                return new AnonymousClass1D3();
            case 4:
                return new AnonymousClass15g();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D3.class) {
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
