package X;

/* renamed from: X.1CU  reason: invalid class name */
public final class AnonymousClass1CU extends C130786cX implements C181378mf {
    public static final int CLIENT_FINISH_FIELD_NUMBER = 4;
    public static final int CLIENT_HELLO_FIELD_NUMBER = 2;
    public static final AnonymousClass1CU DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SERVER_HELLO_FIELD_NUMBER = 3;
    public int bitField0_;
    public C21321Bj clientFinish_;
    public AnonymousClass1CS clientHello_;
    public AnonymousClass1CT serverHello_;

    static {
        AnonymousClass1CU r1 = new AnonymousClass1CU();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CU.class);
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
                A1X[1] = "clientHello_";
                A1X[2] = "serverHello_";
                A1X[3] = "clientFinish_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", A1X);
            case 3:
                return new AnonymousClass1CU();
            case 4:
                return new AnonymousClass190();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CU.class) {
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
