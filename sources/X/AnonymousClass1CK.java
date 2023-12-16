package X;

/* renamed from: X.1CK  reason: invalid class name */
public final class AnonymousClass1CK extends C130786cX implements C181378mf {
    public static final AnonymousClass1CK DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass1AZ index_;
    public AnonymousClass1AY keyId_;
    public C20971Aa value_;

    static {
        AnonymousClass1CK r1 = new AnonymousClass1CK();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CK.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = C18270x1.A1X();
                A1X[1] = "index_";
                A1X[2] = "value_";
                A1X[3] = "keyId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", A1X);
            case 3:
                return new AnonymousClass1CK();
            case 4:
                return new AnonymousClass189();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CK.class) {
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
