package X;

/* renamed from: X.1CZ  reason: invalid class name */
public final class AnonymousClass1CZ extends C130786cX implements C181378mf {
    public static final AnonymousClass1CZ DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PRIVATEKEY_FIELD_NUMBER = 3;
    public static final int PUBLICKEY_FIELD_NUMBER = 2;
    public int bitField0_;
    public int id_;
    public C172548Lq privateKey_;
    public C172548Lq publicKey_;

    static {
        AnonymousClass1CZ r1 = new AnonymousClass1CZ();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CZ.class);
    }

    public AnonymousClass1CZ() {
        C172548Lq r0 = C172548Lq.A01;
        this.publicKey_ = r0;
        this.privateKey_ = r0;
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
                A1X[2] = "publicKey_";
                A1X[3] = "privateKey_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002", A1X);
            case 3:
                return new AnonymousClass1CZ();
            case 4:
                return new AnonymousClass19S();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CZ.class) {
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
