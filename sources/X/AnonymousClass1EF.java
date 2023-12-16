package X;

/* renamed from: X.1EF  reason: invalid class name */
public final class AnonymousClass1EF extends C130786cX implements C181378mf {
    public static final int ACTION_LINK_FIELD_NUMBER = 33;
    public static final int BUSINESS_MESSAGE_FORWARD_INFO_FIELD_NUMBER = 44;
    public static final int CONVERSION_DATA_FIELD_NUMBER = 19;
    public static final int CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 20;
    public static final int CONVERSION_SOURCE_FIELD_NUMBER = 18;
    public static final int DATA_SHARING_CONTEXT_FIELD_NUMBER = 47;
    public static final AnonymousClass1EF DEFAULT_INSTANCE;
    public static final int DISAPPEARING_MODE_FIELD_NUMBER = 32;
    public static final int ENTRY_POINT_CONVERSION_APP_FIELD_NUMBER = 30;
    public static final int ENTRY_POINT_CONVERSION_DELAY_SECONDS_FIELD_NUMBER = 31;
    public static final int ENTRY_POINT_CONVERSION_SOURCE_FIELD_NUMBER = 29;
    public static final int EPHEMERAL_SETTING_TIMESTAMP_FIELD_NUMBER = 26;
    public static final int EPHEMERAL_SHARED_SECRET_FIELD_NUMBER = 27;
    public static final int EXPIRATION_FIELD_NUMBER = 25;
    public static final int EXTERNAL_AD_REPLY_FIELD_NUMBER = 28;
    public static final int FORWARDED_NEWSLETTER_MESSAGE_INFO_FIELD_NUMBER = 43;
    public static final int FORWARDING_SCORE_FIELD_NUMBER = 21;
    public static final int GROUP_MENTIONS_FIELD_NUMBER = 40;
    public static final int GROUP_SUBJECT_FIELD_NUMBER = 34;
    public static final int IS_FORWARDED_FIELD_NUMBER = 22;
    public static final int IS_SAMPLED_FIELD_NUMBER = 39;
    public static final int MENTIONED_JID_FIELD_NUMBER = 15;
    public static final int PARENT_GROUP_JID_FIELD_NUMBER = 35;
    public static volatile C178978iP PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 2;
    public static final int PLACEHOLDER_KEY_FIELD_NUMBER = 24;
    public static final int QUOTED_AD_FIELD_NUMBER = 23;
    public static final int QUOTED_MESSAGE_FIELD_NUMBER = 3;
    public static final int REMOTE_JID_FIELD_NUMBER = 4;
    public static final int SMB_CLIENT_CAMPAIGN_ID_FIELD_NUMBER = 45;
    public static final int STANZA_ID_FIELD_NUMBER = 1;
    public static final int TRUST_BANNER_ACTION_FIELD_NUMBER = 38;
    public static final int TRUST_BANNER_TYPE_FIELD_NUMBER = 37;
    public AnonymousClass1B4 actionLink_;
    public int bitField0_;
    public AnonymousClass1AF businessMessageForwardInfo_;
    public C172548Lq conversionData_;
    public int conversionDelaySeconds_;
    public String conversionSource_;
    public AnonymousClass1AG dataSharingContext_;
    public AnonymousClass1EP disappearingMode_;
    public String entryPointConversionApp_;
    public int entryPointConversionDelaySeconds_;
    public String entryPointConversionSource_;
    public long ephemeralSettingTimestamp_;
    public C172548Lq ephemeralSharedSecret_;
    public int expiration_;
    public AnonymousClass1E4 externalAdReply_;
    public AnonymousClass1D9 forwardedNewsletterMessageInfo_;
    public int forwardingScore_;
    public C188248ya groupMentions_;
    public String groupSubject_;
    public boolean isForwarded_;
    public boolean isSampled_;
    public C188248ya mentionedJid_;
    public String parentGroupJid_;
    public String participant_ = "";
    public AnonymousClass1ET placeholderKey_;
    public C21551Cg quotedAd_;
    public AnonymousClass1EU quotedMessage_;
    public String remoteJid_ = "";
    public String smbClientCampaignId_;
    public String stanzaId_ = "";
    public int trustBannerAction_;
    public String trustBannerType_;

    static {
        AnonymousClass1EF r1 = new AnonymousClass1EF();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EF.class);
    }

    public AnonymousClass1EF() {
        C130236bd r1 = C130236bd.A02;
        this.mentionedJid_ = r1;
        this.conversionSource_ = "";
        C172548Lq r0 = C172548Lq.A01;
        this.conversionData_ = r0;
        this.ephemeralSharedSecret_ = r0;
        this.entryPointConversionSource_ = "";
        this.entryPointConversionApp_ = "";
        this.groupSubject_ = "";
        this.parentGroupJid_ = "";
        this.trustBannerType_ = "";
        this.groupMentions_ = r1;
        this.smbClientCampaignId_ = "";
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[33];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "stanzaId_";
                objArr[2] = "participant_";
                objArr[3] = "quotedMessage_";
                objArr[4] = "remoteJid_";
                objArr[5] = "mentionedJid_";
                objArr[6] = "conversionSource_";
                objArr[7] = "conversionData_";
                objArr[8] = "conversionDelaySeconds_";
                objArr[9] = "forwardingScore_";
                objArr[10] = "isForwarded_";
                objArr[11] = "quotedAd_";
                objArr[12] = "placeholderKey_";
                objArr[13] = "expiration_";
                objArr[14] = "ephemeralSettingTimestamp_";
                objArr[15] = "ephemeralSharedSecret_";
                objArr[16] = "externalAdReply_";
                objArr[17] = "entryPointConversionSource_";
                objArr[18] = "entryPointConversionApp_";
                objArr[19] = "entryPointConversionDelaySeconds_";
                objArr[20] = "disappearingMode_";
                objArr[21] = "actionLink_";
                objArr[22] = "groupSubject_";
                objArr[23] = "parentGroupJid_";
                objArr[24] = "trustBannerType_";
                objArr[25] = "trustBannerAction_";
                objArr[26] = "isSampled_";
                objArr[27] = "groupMentions_";
                objArr[28] = AnonymousClass1B6.class;
                objArr[29] = "forwardedNewsletterMessageInfo_";
                objArr[30] = "businessMessageForwardInfo_";
                objArr[31] = "smbClientCampaignId_";
                objArr[32] = "dataSharingContext_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001/\u001f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u000f\u001a\u0012ဈ\u0004\u0013ည\u0005\u0014ဋ\u0006\u0015ဋ\u0007\u0016ဇ\b\u0017ဉ\t\u0018ဉ\n\u0019ဋ\u000b\u001aဂ\f\u001bည\r\u001cဉ\u000e\u001dဈ\u000f\u001eဈ\u0010\u001fဋ\u0011 ဉ\u0012!ဉ\u0013\"ဈ\u0014#ဈ\u0015%ဈ\u0016&ဋ\u0017'ဇ\u0018(\u001b+ဉ\u0019,ဉ\u001a-ဈ\u001b/ဉ\u001c", objArr);
            case 3:
                return new AnonymousClass1EF();
            case 4:
                return new AnonymousClass15x();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EF.class) {
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
