package X;

/* renamed from: X.1AG  reason: invalid class name */
public final class AnonymousClass1AG extends C130786cX implements C181378mf {
    public static final AnonymousClass1AG DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int SHOW_MM_DISCLOSURE_FIELD_NUMBER = 1;
    public int bitField0_;
    public boolean showMmDisclosure_;

    static {
        AnonymousClass1AG r1 = new AnonymousClass1AG();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1AG.class);
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
                A1a[1] = "showMmDisclosure_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", A1a);
            case 3:
                return new AnonymousClass1AG();
            case 4:
                return new AnonymousClass15z();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1AG.class) {
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
