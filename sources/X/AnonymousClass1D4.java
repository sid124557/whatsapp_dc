package X;

/* renamed from: X.1D4  reason: invalid class name */
public final class AnonymousClass1D4 extends C130786cX implements C181378mf {
    public static final AnonymousClass1D4 DEFAULT_INSTANCE;
    public static final int ISSUER_SERIAL_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 3;
    public static final int NOT_AFTER_FIELD_NUMBER = 5;
    public static final int NOT_BEFORE_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int SERIAL_FIELD_NUMBER = 1;
    public int bitField0_;
    public int issuerSerial_;
    public C172548Lq key_ = C172548Lq.A01;
    public long notAfter_;
    public long notBefore_;
    public int serial_;

    static {
        AnonymousClass1D4 r1 = new AnonymousClass1D4();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1D4.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C18270x1.A1Z();
                A1Z[1] = "serial_";
                A1Z[2] = "issuerSerial_";
                A1Z[3] = "key_";
                A1Z[4] = "notBefore_";
                A1Z[5] = "notAfter_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ဃ\u0004", A1Z);
            case 3:
                return new AnonymousClass1D4();
            case 4:
                return new C198315n();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1D4.class) {
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
