package X;

/* renamed from: X.1Bq  reason: invalid class name and case insensitive filesystem */
public final class C21391Bq extends C130786cX implements C181378mf {
    public static final C21391Bq DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public int index_;
    public C172548Lq key_ = C172548Lq.A01;

    static {
        C21391Bq r1 = new C21391Bq();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21391Bq.class);
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
                A1W[1] = "index_";
                A1W[2] = "key_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", A1W);
            case 3:
                return new C21391Bq();
            case 4:
                return new C208919s();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21391Bq.class) {
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
