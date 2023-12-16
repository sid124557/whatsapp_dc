package X;

/* renamed from: X.1C0  reason: invalid class name */
public final class AnonymousClass1C0 extends C130786cX implements C181378mf {
    public static final int CONTACTS_FIELD_NUMBER = 2;
    public static final int CONTEXT_INFO_FIELD_NUMBER = 17;
    public static final AnonymousClass1C0 DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public C188248ya contacts_ = C130236bd.A02;
    public AnonymousClass1EF contextInfo_;
    public String displayName_ = "";

    static {
        AnonymousClass1C0 r1 = new AnonymousClass1C0();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1C0.class);
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
                A1Y[1] = "displayName_";
                A1Y[2] = "contacts_";
                A1Y[3] = C21481Bz.class;
                A1Y[4] = "contextInfo_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0011\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0011ဉ\u0001", A1Y);
            case 3:
                return new AnonymousClass1C0();
            case 4:
                return new AnonymousClass16U();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1C0.class) {
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
