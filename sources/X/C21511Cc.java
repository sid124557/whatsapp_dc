package X;

/* renamed from: X.1Cc  reason: invalid class name and case insensitive filesystem */
public final class C21511Cc extends C130786cX implements C181378mf {
    public static final int CURRENT_INDEX_FIELD_NUMBER = 2;
    public static final C21511Cc DEFAULT_INSTANCE;
    public static final int DEVICE_INDEXES_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER = null;
    public static final int RAW_ID_FIELD_NUMBER = 1;
    public int bitField0_;
    public int currentIndex_;
    public int deviceIndexesMemoizedSerializedSize = -1;
    public C85224Fk deviceIndexes_ = C130176bX.A02;
    public int rawId_;

    static {
        C21511Cc r1 = new C21511Cc();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21511Cc.class);
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
                A1X[1] = "rawId_";
                A1X[2] = "currentIndex_";
                A1X[3] = "deviceIndexes_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003+", A1X);
            case 3:
                return new C21511Cc();
            case 4:
                return new AnonymousClass16D();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21511Cc.class) {
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
