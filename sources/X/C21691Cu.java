package X;

/* renamed from: X.1Cu  reason: invalid class name and case insensitive filesystem */
public final class C21691Cu extends C130786cX implements C181378mf {
    public static final int CHAINKEYS_FIELD_NUMBER = 3;
    public static final C21691Cu DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITERATION_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int SIGNINGKEY_FIELD_NUMBER = 4;
    public int bitField0_;
    public C188248ya chainKeys_ = C130236bd.A02;
    public int id_;
    public int iteration_;
    public C172548Lq signingKey_ = C172548Lq.A01;

    static {
        C21691Cu r1 = new C21691Cu();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21691Cu.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Y = C18270x1.A1Y();
                A1Y[1] = "id_";
                A1Y[2] = "iteration_";
                A1Y[3] = "chainKeys_";
                A1Y[4] = "signingKey_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003\u001c\u0004ည\u0002", A1Y);
            case 3:
                return new C21691Cu();
            case 4:
                return new AnonymousClass19M();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21691Cu.class) {
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
