package X;

/* renamed from: X.1Ac  reason: invalid class name and case insensitive filesystem */
public final class C20991Ac extends C130786cX implements C181378mf {
    public static final int ALLOWED_FIELD_NUMBER = 1;
    public static final C20991Ac DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER;
    public boolean allowed_;
    public int bitField0_;

    static {
        C20991Ac r1 = new C20991Ac();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C20991Ac.class);
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
                A1a[1] = "allowed_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A1a);
            case 3:
                return new C20991Ac();
            case 4:
                return new AnonymousClass18I();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C20991Ac.class) {
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
