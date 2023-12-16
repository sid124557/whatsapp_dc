package X;

/* renamed from: X.1BA  reason: invalid class name */
public final class AnonymousClass1BA extends C130786cX implements C181378mf {
    public static final AnonymousClass1BA DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 2;
    public static final int KEY_ID_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C21471By keyData_;
    public AnonymousClass1AH keyId_;

    static {
        AnonymousClass1BA r1 = new AnonymousClass1BA();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BA.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1W = C18270x1.A1W();
                A1W[1] = "keyId_";
                A1W[2] = "keyData_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", A1W);
            case 3:
                return new AnonymousClass1BA();
            case 4:
                return new AnonymousClass16B();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BA.class) {
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
