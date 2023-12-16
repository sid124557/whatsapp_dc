package X;

/* renamed from: X.1DQ  reason: invalid class name */
public final class AnonymousClass1DQ extends C130786cX implements C181378mf {
    public static final AnonymousClass1DQ DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PRIVATEKEY_FIELD_NUMBER = 3;
    public static final int PUBLICKEY_FIELD_NUMBER = 2;
    public static final int SIGNATURE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    public int bitField0_;
    public int id_;
    public C172548Lq privateKey_;
    public C172548Lq publicKey_;
    public C172548Lq signature_;
    public long timestamp_;

    static {
        AnonymousClass1DQ r1 = new AnonymousClass1DQ();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DQ.class);
    }

    public AnonymousClass1DQ() {
        C172548Lq r0 = C172548Lq.A01;
        this.publicKey_ = r0;
        this.privateKey_ = r0;
        this.signature_ = r0;
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
                A1Z[1] = "id_";
                A1Z[2] = "publicKey_";
                A1Z[3] = "privateKey_";
                A1Z[4] = "signature_";
                A1Z[5] = "timestamp_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005စ\u0004", A1Z);
            case 3:
                return new AnonymousClass1DQ();
            case 4:
                return new AnonymousClass1A2();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DQ.class) {
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
