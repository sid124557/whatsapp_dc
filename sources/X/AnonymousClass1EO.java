package X;

/* renamed from: X.1EO  reason: invalid class name */
public final class AnonymousClass1EO extends C130786cX implements C181378mf {
    public static final int AGENT_ACTION_FIELD_NUMBER = 27;
    public static final int ANDROID_UNSUPPORTED_ACTIONS_FIELD_NUMBER = 26;
    public static final int ARCHIVE_CHAT_ACTION_FIELD_NUMBER = 17;
    public static final int BOT_WELCOME_REQUEST_ACTION_FIELD_NUMBER = 45;
    public static final int CALL_LOG_ACTION_FIELD_NUMBER = 42;
    public static final int CHAT_ASSIGNMENT_FIELD_NUMBER = 35;
    public static final int CHAT_ASSIGNMENT_OPENED_STATUS_FIELD_NUMBER = 36;
    public static final int CLEAR_CHAT_ACTION_FIELD_NUMBER = 21;
    public static final int CONTACT_ACTION_FIELD_NUMBER = 3;
    public static final AnonymousClass1EO DEFAULT_INSTANCE;
    public static final int DELETE_CHAT_ACTION_FIELD_NUMBER = 22;
    public static final int DELETE_MESSAGE_FOR_ME_ACTION_FIELD_NUMBER = 18;
    public static final int EXTERNAL_WEB_BETA_ACTION_FIELD_NUMBER = 40;
    public static final int KEY_EXPIRATION_FIELD_NUMBER = 19;
    public static final int LABEL_ASSOCIATION_ACTION_FIELD_NUMBER = 15;
    public static final int LABEL_EDIT_ACTION_FIELD_NUMBER = 14;
    public static final int LABEL_REORDERING_ACTION_FIELD_NUMBER = 47;
    public static final int LOCALE_SETTING_FIELD_NUMBER = 16;
    public static final int MARKETING_MESSAGE_ACTION_FIELD_NUMBER = 38;
    public static final int MARK_CHAT_AS_READ_ACTION_FIELD_NUMBER = 20;
    public static final int MUTE_ACTION_FIELD_NUMBER = 4;
    public static final int NUX_ACTION_FIELD_NUMBER = 31;
    public static volatile C178978iP PARSER = null;
    public static final int PAYMENT_INFO_ACTION_FIELD_NUMBER = 48;
    public static final int PIN_ACTION_FIELD_NUMBER = 5;
    public static final int PN_FOR_LID_CHAT_ACTION_FIELD_NUMBER = 37;
    public static final int PRIMARY_FEATURE_FIELD_NUMBER = 24;
    public static final int PRIMARY_VERSION_ACTION_FIELD_NUMBER = 32;
    public static final int PRIVACY_SETTING_RELAY_ALL_CALLS_FIELD_NUMBER = 41;
    public static final int PUSH_NAME_SETTING_FIELD_NUMBER = 7;
    public static final int QUICK_REPLY_ACTION_FIELD_NUMBER = 8;
    public static final int RECENT_EMOJI_WEIGHTS_ACTION_FIELD_NUMBER = 11;
    public static final int REMOVE_RECENT_STICKER_ACTION_FIELD_NUMBER = 34;
    public static final int SECURITY_NOTIFICATION_SETTING_FIELD_NUMBER = 6;
    public static final int STAR_ACTION_FIELD_NUMBER = 2;
    public static final int STATUS_PRIVACY_FIELD_NUMBER = 44;
    public static final int STICKER_ACTION_FIELD_NUMBER = 33;
    public static final int SUBSCRIPTION_ACTION_FIELD_NUMBER = 28;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TIME_FORMAT_ACTION_FIELD_NUMBER = 30;
    public static final int UGC_BOT_FIELD_NUMBER = 43;
    public static final int UNARCHIVE_CHATS_SETTING_FIELD_NUMBER = 23;
    public static final int USER_STATUS_MUTE_ACTION_FIELD_NUMBER = 29;
    public AnonymousClass1CL agentAction_;
    public C20991Ac androidUnsupportedActions_;
    public C21261Bd archiveChatAction_;
    public int bitField0_;
    public int bitField1_;
    public C21001Ad botWelcomeRequestAction_;
    public C21011Ae callLogAction_;
    public C130586cD chatAssignmentOpenedStatus_;
    public C130576cC chatAssignment_;
    public C21021Af clearChatAction_;
    public AnonymousClass1CM contactAction_;
    public C21031Ag deleteChatAction_;
    public C21271Be deleteMessageForMeAction_;
    public C21041Ah externalWebBetaAction_;
    public C21051Ai keyExpiration_;
    public C130596cE labelAssociationAction_;
    public AnonymousClass1DJ labelEditAction_;
    public AnonymousClass1AB labelReorderingAction_;
    public C21061Aj localeSetting_;
    public C21281Bf markChatAsReadAction_;
    public C21791De marketingMessageAction_;
    public AnonymousClass1CN muteAction_;
    public C21071Ak nuxAction_;
    public C130606cF paymentInfoAction_;
    public C21081Al pinAction_;
    public C21091Am pnForLidChatAction_;
    public AnonymousClass1AC primaryFeature_;
    public C21101An primaryVersionAction_;
    public C21111Ao privacySettingRelayAllCalls_;
    public C21121Ap pushNameSetting_;
    public AnonymousClass1DK quickReplyAction_;
    public C130556cA recentEmojiWeightsAction_;
    public C21131Aq removeRecentStickerAction_;
    public C130616cG securityNotificationSetting_;
    public C21141Ar starAction_;
    public C21291Bg statusPrivacy_;
    public C21941Dt stickerAction_;
    public C130656cK subscriptionAction_;
    public C21151As timeFormatAction_;
    public long timestamp_;
    public C21161At ugcBot_;
    public C21171Au unarchiveChatsSetting_;
    public C21181Av userStatusMuteAction_;

    static {
        AnonymousClass1EO r1 = new AnonymousClass1EO();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EO.class);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[43];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "bitField1_";
                objArr[2] = "timestamp_";
                objArr[3] = "starAction_";
                objArr[4] = "contactAction_";
                objArr[5] = "muteAction_";
                objArr[6] = "pinAction_";
                objArr[7] = "securityNotificationSetting_";
                objArr[8] = "pushNameSetting_";
                objArr[9] = "quickReplyAction_";
                objArr[10] = "recentEmojiWeightsAction_";
                objArr[11] = "labelEditAction_";
                objArr[12] = "labelAssociationAction_";
                objArr[13] = "localeSetting_";
                objArr[14] = "archiveChatAction_";
                objArr[15] = "deleteMessageForMeAction_";
                objArr[16] = "keyExpiration_";
                objArr[17] = "markChatAsReadAction_";
                objArr[18] = "clearChatAction_";
                objArr[19] = "deleteChatAction_";
                objArr[20] = "unarchiveChatsSetting_";
                objArr[21] = "primaryFeature_";
                objArr[22] = "androidUnsupportedActions_";
                objArr[23] = "agentAction_";
                objArr[24] = "subscriptionAction_";
                objArr[25] = "userStatusMuteAction_";
                objArr[26] = "timeFormatAction_";
                objArr[27] = "nuxAction_";
                objArr[28] = "primaryVersionAction_";
                objArr[29] = "stickerAction_";
                objArr[30] = "removeRecentStickerAction_";
                objArr[31] = "chatAssignment_";
                objArr[32] = "chatAssignmentOpenedStatus_";
                objArr[33] = "pnForLidChatAction_";
                objArr[34] = "marketingMessageAction_";
                objArr[35] = "externalWebBetaAction_";
                objArr[36] = "privacySettingRelayAllCalls_";
                objArr[37] = "callLogAction_";
                objArr[38] = "ugcBot_";
                objArr[39] = "statusPrivacy_";
                objArr[40] = "botWelcomeRequestAction_";
                objArr[41] = "labelReorderingAction_";
                objArr[42] = "paymentInfoAction_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001)\u0000\u0002\u00010)\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\u000bဉ\b\u000eဉ\t\u000fဉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012ဉ\r\u0013ဉ\u000e\u0014ဉ\u000f\u0015ဉ\u0010\u0016ဉ\u0011\u0017ဉ\u0012\u0018ဉ\u0013\u001aဉ\u0014\u001bဉ\u0015\u001cဉ\u0016\u001dဉ\u0017\u001eဉ\u0018\u001fဉ\u0019 ဉ\u001a!ဉ\u001b\"ဉ\u001c#ဉ\u001d$ဉ\u001e%ဉ\u001f&ဉ (ဉ!)ဉ\"*ဉ#+ဉ$,ဉ%-ဉ&/ဉ'0ဉ(", objArr);
            case 3:
                return new AnonymousClass1EO();
            case 4:
                return new AnonymousClass18L();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EO.class) {
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
