package X;

/* renamed from: X.1DO  reason: invalid class name */
public final class AnonymousClass1DO extends C130786cX implements C181378mf {
    public static final AnonymousClass1DO DEFAULT_INSTANCE;
    public static volatile C178978iP PARSER = null;
    public static final int POLL_UPDATE_MESSAGE_KEY_FIELD_NUMBER = 1;
    public static final int SENDER_TIMESTAMP_MS_FIELD_NUMBER = 3;
    public static final int SERVER_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int UNREAD_FIELD_NUMBER = 5;
    public static final int VOTE_FIELD_NUMBER = 2;
    public int bitField0_;
    public AnonymousClass1ET pollUpdateMessageKey_;
    public long senderTimestampMs_;
    public long serverTimestampMs_;
    public boolean unread_;
    public AnonymousClass1A9 vote_;

    static {
        AnonymousClass1DO r1 = new AnonymousClass1DO();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DO.class);
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
                A1Z[1] = "pollUpdateMessageKey_";
                A1Z[2] = "vote_";
                A1Z[3] = "senderTimestampMs_";
                A1Z[4] = "serverTimestampMs_";
                A1Z[5] = "unread_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004", A1Z);
            case 3:
                return new AnonymousClass1DO();
            case 4:
                return new AnonymousClass19E();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DO.class) {
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
