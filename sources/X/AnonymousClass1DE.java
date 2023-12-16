package X;

/* renamed from: X.1DE  reason: invalid class name */
public final class AnonymousClass1DE extends C130786cX implements C181378mf {
    public static final int CHAT_JID_FIELD_NUMBER = 1;
    public static final AnonymousClass1DE DEFAULT_INSTANCE;
    public static final int OLDEST_MSG_FROM_ME_FIELD_NUMBER = 3;
    public static final int OLDEST_MSG_ID_FIELD_NUMBER = 2;
    public static final int OLDEST_MSG_TIMESTAMP_MS_FIELD_NUMBER = 5;
    public static final int ON_DEMAND_MSG_COUNT_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER;
    public int bitField0_;
    public String chatJid_ = "";
    public boolean oldestMsgFromMe_;
    public String oldestMsgId_ = "";
    public long oldestMsgTimestampMs_;
    public int onDemandMsgCount_;

    static {
        AnonymousClass1DE r1 = new AnonymousClass1DE();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1DE.class);
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
                A1Z[1] = "chatJid_";
                A1Z[2] = "oldestMsgId_";
                A1Z[3] = "oldestMsgFromMe_";
                A1Z[4] = "onDemandMsgCount_";
                A1Z[5] = "oldestMsgTimestampMs_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဂ\u0004", A1Z);
            case 3:
                return new AnonymousClass1DE();
            case 4:
                return new AnonymousClass179();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1DE.class) {
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
