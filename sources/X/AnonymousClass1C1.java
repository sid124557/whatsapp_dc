package X;

/* renamed from: X.1C1  reason: invalid class name */
public final class AnonymousClass1C1 extends C130786cX implements C181378mf {
    public static final AnonymousClass1C1 DEFAULT_INSTANCE;
    public static final int DESTINATION_JID_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    public static volatile C178978iP PARSER = null;
    public static final int PHASH_FIELD_NUMBER = 3;
    public int bitField0_;
    public String destinationJid_ = "";
    public AnonymousClass1EU message_;
    public String phash_ = "";

    static {
        AnonymousClass1C1 r1 = new AnonymousClass1C1();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1C1.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] A1X = C18270x1.A1X();
                A1X[1] = "destinationJid_";
                A1X[2] = "message_";
                A1X[3] = "phash_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", A1X);
            case 3:
                return new AnonymousClass1C1();
            case 4:
                return new AnonymousClass16W();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1C1.class) {
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
