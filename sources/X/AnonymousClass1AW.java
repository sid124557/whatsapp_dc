package X;

/* renamed from: X.1AW  reason: invalid class name */
public final class AnonymousClass1AW extends C130786cX implements C181378mf {
    public static final AnonymousClass1AW DEFAULT_INSTANCE;
    public static final int EDIT_TARGET_ID_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String editTargetId_ = "";

    static {
        AnonymousClass1AW r1 = new AnonymousClass1AW();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1AW.class);
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
                A1a[1] = "editTargetId_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", A1a);
            case 3:
                return new AnonymousClass1AW();
            case 4:
                return new C203617r();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1AW.class) {
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
