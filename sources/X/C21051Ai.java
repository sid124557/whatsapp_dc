package X;

/* renamed from: X.1Ai  reason: invalid class name and case insensitive filesystem */
public final class C21051Ai extends C130786cX implements C181378mf {
    public static final C21051Ai DEFAULT_INSTANCE;
    public static final int EXPIRED_KEY_EPOCH_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public int expiredKeyEpoch_;

    static {
        C21051Ai r1 = new C21051Ai();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21051Ai.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1a = C18260x0.A1a();
                A1a[1] = "expiredKeyEpoch_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", A1a);
            case 3:
                return new C21051Ai();
            case 4:
                return new AnonymousClass18S();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21051Ai.class) {
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
