package X;

/* renamed from: X.1DK  reason: invalid class name */
public final class AnonymousClass1DK extends C130786cX implements C181378mf {
    public static final int COUNT_FIELD_NUMBER = 4;
    public static final AnonymousClass1DK DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 5;
    public static final int KEYWORDS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int SHORTCUT_FIELD_NUMBER = 1;
    public int bitField0_;
    public int count_;
    public boolean deleted_;
    public C188248ya keywords_ = C130236bd.A02;
    public String message_ = "";
    public String shortcut_ = "";

    static {
        AnonymousClass1DK r1 = new AnonymousClass1DK();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DK.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1Z = C18270x1.A1Z();
                A1Z[1] = "shortcut_";
                A1Z[2] = "message_";
                A1Z[3] = "keywords_";
                A1Z[4] = "count_";
                A1Z[5] = "deleted_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004င\u0002\u0005ဇ\u0003", A1Z);
            case 3:
                return new AnonymousClass1DK();
            case 4:
                return new C205118g();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DK.class) {
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
