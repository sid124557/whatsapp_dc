package X;

/* renamed from: X.1BY  reason: invalid class name */
public final class AnonymousClass1BY extends C130786cX implements C181378mf {
    public static final int BOTMESSAGEINFO_FIELD_NUMBER = 1;
    public static final AnonymousClass1BY DEFAULT_INSTANCE;
    public static final int EDIT_VERSION_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public AnonymousClass1AW botMessageInfo_;
    public int editVersion_;

    static {
        AnonymousClass1BY r1 = new AnonymousClass1BY();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1BY.class);
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
                A1W[1] = "botMessageInfo_";
                A1W[2] = "editVersion_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001", A1W);
            case 3:
                return new AnonymousClass1BY();
            case 4:
                return new C203717s();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1BY.class) {
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
