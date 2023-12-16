package X;

/* renamed from: X.1Dg  reason: invalid class name and case insensitive filesystem */
public final class C21811Dg extends C130786cX implements C181378mf {
    public static final C21811Dg DEFAULT_INSTANCE;
    public static final int FULL_SYNC_DAYS_LIMIT_FIELD_NUMBER = 1;
    public static final int FULL_SYNC_SIZE_MB_LIMIT_FIELD_NUMBER = 2;
    public static final int INLINE_INITIAL_PAYLOAD_IN_E2EE_MSG_FIELD_NUMBER = 4;
    public static volatile C178978iP PARSER = null;
    public static final int RECENT_SYNC_DAYS_LIMIT_FIELD_NUMBER = 5;
    public static final int STORAGE_QUOTA_MB_FIELD_NUMBER = 3;
    public static final int SUPPORT_BOT_USER_AGENT_CHAT_HISTORY_FIELD_NUMBER = 7;
    public static final int SUPPORT_CAG_REACTIONS_AND_POLLS_FIELD_NUMBER = 8;
    public static final int SUPPORT_CALL_LOG_HISTORY_FIELD_NUMBER = 6;
    public int bitField0_;
    public int fullSyncDaysLimit_;
    public int fullSyncSizeMbLimit_;
    public boolean inlineInitialPayloadInE2EeMsg_;
    public int recentSyncDaysLimit_;
    public int storageQuotaMb_;
    public boolean supportBotUserAgentChatHistory_;
    public boolean supportCagReactionsAndPolls_;
    public boolean supportCallLogHistory_;

    static {
        C21811Dg r1 = new C21811Dg();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, C21811Dg.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[9];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "fullSyncDaysLimit_";
                objArr[2] = "fullSyncSizeMbLimit_";
                objArr[3] = "storageQuotaMb_";
                objArr[4] = "inlineInitialPayloadInE2EeMsg_";
                objArr[5] = "recentSyncDaysLimit_";
                objArr[6] = "supportCallLogHistory_";
                objArr[7] = "supportBotUserAgentChatHistory_";
                objArr[8] = "supportCagReactionsAndPolls_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဋ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", objArr);
            case 3:
                return new C21811Dg();
            case 4:
                return new C198615q();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (C21811Dg.class) {
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
