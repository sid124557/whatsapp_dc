package X;

/* renamed from: X.1Bp  reason: invalid class name and case insensitive filesystem */
public final class C21381Bp extends C130786cX implements C181378mf {
    public static final C21381Bp DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int PRIVATE_FIELD_NUMBER = 2;
    public static final int PUBLIC_FIELD_NUMBER = 1;
    public int bitField0_;
    public C172548Lq private_;
    public C172548Lq public_;

    static {
        C21381Bp r1 = new C21381Bp();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21381Bp.class);
    }

    public C21381Bp() {
        C172548Lq r0 = C172548Lq.A01;
        this.public_ = r0;
        this.private_ = r0;
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
                A1W[1] = "public_";
                A1W[2] = "private_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", A1W);
            case 3:
                return new C21381Bp();
            case 4:
                return new AnonymousClass19W();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21381Bp.class) {
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
