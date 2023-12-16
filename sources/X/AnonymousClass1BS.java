package X;

/* renamed from: X.1BS  reason: invalid class name */
public final class AnonymousClass1BS extends C130786cX implements C181378mf {
    public static final AnonymousClass1BS DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C21881Dn displayText_;
    public String id_ = "";

    static {
        AnonymousClass1BS r1 = new AnonymousClass1BS();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BS.class);
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
                C18320x8.A1S(A1W, "displayText_");
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", A1W);
            case 3:
                return new AnonymousClass1BS();
            case 4:
                return new C202117c();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BS.class) {
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
