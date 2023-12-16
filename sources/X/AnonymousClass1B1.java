package X;

/* renamed from: X.1B1  reason: invalid class name */
public final class AnonymousClass1B1 extends C130786cX implements C181378mf {
    public static final int BOTINFO_FIELD_NUMBER = 1;
    public static final AnonymousClass1B1 DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public AnonymousClass1D1 botInfo_;
    public byte memoizedIsInitialized = 2;

    static {
        AnonymousClass1B1 r1 = new AnonymousClass1B1();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1B1.class);
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r5.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                Object[] A0M = AnonymousClass002.A0M();
                A0M[0] = "bitField0_";
                A0M[1] = "botInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", A0M);
            case 3:
                return new AnonymousClass1B1();
            case 4:
                return new C202417f();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1B1.class) {
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
