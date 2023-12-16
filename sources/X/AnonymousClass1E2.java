package X;

/* renamed from: X.1E2  reason: invalid class name */
public final class AnonymousClass1E2 extends C130786cX implements C181378mf {
    public static final int AI_WAIT_LIST_STATE_FIELD_NUMBER = 14;
    public static final int CALL_LOG_RECORDS_FIELD_NUMBER = 13;
    public static final int CHUNK_ORDER_FIELD_NUMBER = 5;
    public static final int CONVERSATIONS_FIELD_NUMBER = 2;
    public static final AnonymousClass1E2 DEFAULT_INSTANCE;
    public static final int GLOBAL_SETTINGS_FIELD_NUMBER = 8;
    public static volatile C178978iP PARSER = null;
    public static final int PAST_PARTICIPANTS_FIELD_NUMBER = 12;
    public static final int PROGRESS_FIELD_NUMBER = 6;
    public static final int PUSHNAMES_FIELD_NUMBER = 7;
    public static final int RECENT_STICKERS_FIELD_NUMBER = 11;
    public static final int STATUS_V3_MESSAGES_FIELD_NUMBER = 3;
    public static final int SYNC_TYPE_FIELD_NUMBER = 1;
    public static final int THREAD_DS_TIMEFRAME_OFFSET_FIELD_NUMBER = 10;
    public static final int THREAD_ID_USER_SECRET_FIELD_NUMBER = 9;
    public int aiWaitListState_;
    public int bitField0_;
    public C188248ya callLogRecords_;
    public int chunkOrder_;
    public C188248ya conversations_;
    public AnonymousClass1E8 globalSettings_;
    public byte memoizedIsInitialized = 2;
    public C188248ya pastParticipants_;
    public int progress_;
    public C188248ya pushnames_;
    public C188248ya recentStickers_;
    public C188248ya statusV3Messages_;
    public int syncType_;
    public int threadDsTimeframeOffset_;
    public C172548Lq threadIdUserSecret_;

    static {
        AnonymousClass1E2 r1 = new AnonymousClass1E2();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1E2.class);
    }

    public AnonymousClass1E2() {
        C130236bd r1 = C130236bd.A02;
        this.conversations_ = r1;
        this.statusV3Messages_ = r1;
        this.pushnames_ = r1;
        this.threadIdUserSecret_ = C172548Lq.A01;
        this.recentStickers_ = r1;
        this.pastParticipants_ = r1;
        this.callLogRecords_ = r1;
    }

    public final Object A0J(C141056ux r5, Object obj, Object obj2) {
        C178978iP r0;
        int i = 1;
        switch (r5.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    i = 0;
                }
                this.memoizedIsInitialized = (byte) i;
                return null;
            case 2:
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0006\u0003\u0001ᔌ\u0000\u0002Л\u0003Л\u0005ဋ\u0001\u0006ဋ\u0002\u0007\u001b\bဉ\u0003\tည\u0004\nဋ\u0005\u000b\u001b\f\u001b\r\u001b\u000eဌ\u0006", new Object[]{"bitField0_", "syncType_", C63933Bl.A00, "conversations_", AnonymousClass1EG.class, "statusV3Messages_", AnonymousClass1ES.class, "chunkOrder_", "progress_", "pushnames_", AnonymousClass1BW.class, "globalSettings_", "threadIdUserSecret_", "threadDsTimeframeOffset_", "recentStickers_", C21961Dv.class, "pastParticipants_", AnonymousClass1BV.class, "callLogRecords_", AnonymousClass1E6.class, "aiWaitListState_", C63923Bk.A00});
            case 3:
                return new AnonymousClass1E2();
            case 4:
                return new AnonymousClass1A0();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1E2.class) {
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
