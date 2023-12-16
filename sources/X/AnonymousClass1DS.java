package X;

/* renamed from: X.1DS  reason: invalid class name */
public final class AnonymousClass1DS extends C130786cX implements C181378mf {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 5;
    public static final int CURRENT_INDEX_FIELD_NUMBER = 3;
    public static final AnonymousClass1DS DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int VALID_INDEXES_FIELD_NUMBER = 4;
    public int accountType_;
    public int bitField0_;
    public int currentIndex_;
    public int rawId_;
    public long timestamp_;
    public int validIndexesMemoizedSerializedSize = -1;
    public C85224Fk validIndexes_ = C130176bX.A02;

    static {
        AnonymousClass1DS r1 = new AnonymousClass1DS();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DS.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[7];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "rawId_";
                objArr[2] = "timestamp_";
                objArr[3] = "currentIndex_";
                objArr[4] = "validIndexes_";
                objArr[5] = "accountType_";
                objArr[6] = AnonymousClass3B6.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004+\u0005ဌ\u0003", objArr);
            case 3:
                return new AnonymousClass1DS();
            case 4:
                return new AnonymousClass15h();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DS.class) {
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
