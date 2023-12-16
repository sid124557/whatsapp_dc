package X;

/* renamed from: X.1An  reason: invalid class name and case insensitive filesystem */
public final class C21101An extends C130786cX implements C181378mf {
    public static final C21101An DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public int bitField0_;
    public String version_ = "";

    static {
        C21101An r1 = new C21101An();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21101An.class);
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
                A1a[1] = "version_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A1a);
            case 3:
                return new C21101An();
            case 4:
                return new C204818d();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21101An.class) {
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
