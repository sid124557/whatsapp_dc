package X;

/* renamed from: X.1CO  reason: invalid class name */
public final class AnonymousClass1CO extends C130786cX implements C181378mf {
    public static final AnonymousClass1CO DEFAULT_INSTANCE;
    public static final int LAST_MESSAGE_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int LAST_SYSTEM_MESSAGE_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 3;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public long lastMessageTimestamp_;
    public long lastSystemMessageTimestamp_;
    public C188248ya messages_ = C130236bd.A02;

    static {
        AnonymousClass1CO r1 = new AnonymousClass1CO();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1CO.class);
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
                A1Y[1] = "lastMessageTimestamp_";
                A1Y[2] = "lastSystemMessageTimestamp_";
                A1Y[3] = "messages_";
                A1Y[4] = C21301Bh.class;
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", A1Y);
            case 3:
                return new AnonymousClass1CO();
            case 4:
                return new C207819h();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1CO.class) {
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
