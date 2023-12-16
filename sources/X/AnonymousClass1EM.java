package X;

/* renamed from: X.1EM  reason: invalid class name */
public final class AnonymousClass1EM extends C130786cX implements C181378mf {
    public static final int APP_STATE_FATAL_EXCEPTION_NOTIFICATION_FIELD_NUMBER = 10;
    public static final int APP_STATE_SYNC_KEY_REQUEST_FIELD_NUMBER = 8;
    public static final int APP_STATE_SYNC_KEY_SHARE_FIELD_NUMBER = 7;
    public static final int BOT_FEEDBACK_MESSAGE_FIELD_NUMBER = 18;
    public static final AnonymousClass1EM DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 11;
    public static final int EDITED_MESSAGE_FIELD_NUMBER = 14;
    public static final int EPHEMERAL_EXPIRATION_FIELD_NUMBER = 4;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int HISTORY_SYNC_NOTIFICATION_FIELD_NUMBER = 6;
    public static final int INITIAL_SECURITY_NOTIFICATION_SETTING_SYNC_FIELD_NUMBER = 9;
    public static final int INVOKER_JID_FIELD_NUMBER = 19;
    public static final int KEY_FIELD_NUMBER = 1;
    public static volatile C178978iP PARSER = null;
    public static final int PEER_DATA_OPERATION_REQUEST_MESSAGE_FIELD_NUMBER = 16;
    public static final int PEER_DATA_OPERATION_REQUEST_RESPONSE_MESSAGE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_MS_FIELD_NUMBER = 15;
    public static final int TYPE_FIELD_NUMBER = 2;
    public AnonymousClass1B9 appStateFatalExceptionNotification_;
    public AnonymousClass1A7 appStateSyncKeyRequest_;
    public AnonymousClass1A8 appStateSyncKeyShare_;
    public int bitField0_;
    public AnonymousClass1DA botFeedbackMessage_;
    public AnonymousClass1EP disappearingMode_;
    public AnonymousClass1EU editedMessage_;
    public int ephemeralExpiration_;
    public long ephemeralSettingTimestamp_;
    public C21981Dx historySyncNotification_;
    public AnonymousClass1AM initialSecurityNotificationSettingSync_;
    public String invokerJid_ = "";
    public AnonymousClass1ET key_;
    public AnonymousClass1DF peerDataOperationRequestMessage_;
    public AnonymousClass1CD peerDataOperationRequestResponseMessage_;
    public long timestampMs_;
    public int type_;

    static {
        AnonymousClass1EM r1 = new AnonymousClass1EM();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EM.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[18];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "key_";
                objArr[2] = "type_";
                objArr[3] = C63853Bd.A00;
                objArr[4] = "ephemeralExpiration_";
                objArr[5] = "ephemeralSettingTimestamp_";
                objArr[6] = "historySyncNotification_";
                objArr[7] = "appStateSyncKeyShare_";
                objArr[8] = "appStateSyncKeyRequest_";
                objArr[9] = "initialSecurityNotificationSettingSync_";
                objArr[10] = "appStateFatalExceptionNotification_";
                objArr[11] = "disappearingMode_";
                objArr[12] = "editedMessage_";
                objArr[13] = "timestampMs_";
                objArr[14] = "peerDataOperationRequestMessage_";
                objArr[15] = "peerDataOperationRequestResponseMessage_";
                objArr[16] = "botFeedbackMessage_";
                objArr[17] = "invokerJid_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဋ\u0002\u0005ဂ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဉ\t\u000eဉ\n\u000fဂ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဈ\u000f", objArr);
            case 3:
                return new AnonymousClass1EM();
            case 4:
                return new C209419x();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EM.class) {
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
