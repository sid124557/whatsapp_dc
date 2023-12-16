package X;

/* renamed from: X.1BR  reason: invalid class name */
public final class AnonymousClass1BR extends C130786cX implements C181378mf {
    public static final AnonymousClass1BR DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 2;
    public int bitField0_;
    public C21881Dn displayText_;
    public C21881Dn phoneNumber_;

    static {
        AnonymousClass1BR r1 = new AnonymousClass1BR();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BR.class);
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
                A1W[1] = "displayText_";
                A1W[2] = "phoneNumber_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", A1W);
            case 3:
                return new AnonymousClass1BR();
            case 4:
                return new C202017b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BR.class) {
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
