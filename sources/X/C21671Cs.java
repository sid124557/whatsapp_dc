package X;

/* renamed from: X.1Cs  reason: invalid class name and case insensitive filesystem */
public final class C21671Cs extends C130786cX implements C181378mf {
    public static final C21671Cs DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int PADDING_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 4;
    public int bitField0_;
    public C172548Lq index_;
    public C172548Lq padding_;
    public AnonymousClass1EO value_;
    public int version_;

    static {
        C21671Cs r1 = new C21671Cs();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21671Cs.class);
    }

    public C21671Cs() {
        C172548Lq r0 = C172548Lq.A01;
        this.index_ = r0;
        this.padding_ = r0;
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
                A1Y[1] = "index_";
                A1Y[2] = "value_";
                A1Y[3] = "padding_";
                A1Y[4] = "version_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004င\u0003", A1Y);
            case 3:
                return new C21671Cs();
            case 4:
                return new AnonymousClass18G();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21671Cs.class) {
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
