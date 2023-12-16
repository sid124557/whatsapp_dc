package X;

/* renamed from: X.1CX  reason: invalid class name */
public final class AnonymousClass1CX extends C130786cX implements C181378mf {
    public static final int CIPHERTEXT_FIELD_NUMBER = 3;
    public static final AnonymousClass1CX DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITERATION_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C172548Lq ciphertext_ = C172548Lq.A01;
    public int id_;
    public int iteration_;

    static {
        AnonymousClass1CX r1 = new AnonymousClass1CX();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CX.class);
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
                A1X[1] = "id_";
                A1X[2] = "iteration_";
                A1X[3] = "ciphertext_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002", A1X);
            case 3:
                return new AnonymousClass1CX();
            case 4:
                return new AnonymousClass19P();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CX.class) {
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
