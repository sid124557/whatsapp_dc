package X;

/* renamed from: X.1BP  reason: invalid class name */
public final class AnonymousClass1BP extends C130786cX implements C181378mf {
    public static final AnonymousClass1BP DEFAULT_INSTANCE;
    public static final int EDIT_TYPE_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public int editType_;
    public AnonymousClass1ET key_;

    static {
        AnonymousClass1BP r1 = new AnonymousClass1BP();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BP.class);
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
                A1X[1] = "key_";
                A1X[2] = "editType_";
                A1X[3] = C63873Bf.A00;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", A1X);
            case 3:
                return new AnonymousClass1BP();
            case 4:
                return new C207719g();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BP.class) {
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
