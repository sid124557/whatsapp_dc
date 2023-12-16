package X;

/* renamed from: X.1EU  reason: invalid class name */
public final class AnonymousClass1EU extends C130786cX implements C181378mf {
    public static final int AUDIO_MESSAGE_FIELD_NUMBER = 8;
    public static final int BCALL_MESSAGE_FIELD_NUMBER = 72;
    public static final int BOT_INVOKE_MESSAGE_FIELD_NUMBER = 67;
    public static final int BUTTONS_MESSAGE_FIELD_NUMBER = 42;
    public static final int BUTTONS_RESPONSE_MESSAGE_FIELD_NUMBER = 43;
    public static final int CALL_FIELD_NUMBER = 10;
    public static final int CALL_LOG_MESSSAGE_FIELD_NUMBER = 69;
    public static final int CANCEL_PAYMENT_REQUEST_MESSAGE_FIELD_NUMBER = 24;
    public static final int CHAT_FIELD_NUMBER = 11;
    public static final int COMMENT_MESSAGE_FIELD_NUMBER = 77;
    public static final int CONTACTS_ARRAY_MESSAGE_FIELD_NUMBER = 13;
    public static final int CONTACT_MESSAGE_FIELD_NUMBER = 4;
    public static final int CONVERSATION_FIELD_NUMBER = 1;
    public static final int DECLINE_PAYMENT_REQUEST_MESSAGE_FIELD_NUMBER = 23;
    public static final AnonymousClass1EU DEFAULT_INSTANCE;
    public static final int DEVICE_SENT_MESSAGE_FIELD_NUMBER = 31;
    public static final int DOCUMENT_MESSAGE_FIELD_NUMBER = 7;
    public static final int DOCUMENT_WITH_CAPTION_MESSAGE_FIELD_NUMBER = 53;
    public static final int EDITED_MESSAGE_FIELD_NUMBER = 58;
    public static final int ENC_COMMENT_MESSAGE_FIELD_NUMBER = 71;
    public static final int ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER = 76;
    public static final int ENC_REACTION_MESSAGE_FIELD_NUMBER = 56;
    public static final int EPHEMERAL_MESSAGE_FIELD_NUMBER = 40;
    public static final int EVENT_MESSAGE_FIELD_NUMBER = 75;
    public static final int EXTENDED_TEXT_MESSAGE_FIELD_NUMBER = 6;
    public static final int FAST_RATCHET_KEY_SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 15;
    public static final int GROUP_INVITE_MESSAGE_FIELD_NUMBER = 28;
    public static final int GROUP_MENTIONED_MESSAGE_FIELD_NUMBER = 62;
    public static final int HIGHLY_STRUCTURED_MESSAGE_FIELD_NUMBER = 14;
    public static final int IMAGE_MESSAGE_FIELD_NUMBER = 3;
    public static final int INTERACTIVE_MESSAGE_FIELD_NUMBER = 45;
    public static final int INTERACTIVE_RESPONSE_MESSAGE_FIELD_NUMBER = 48;
    public static final int KEEP_IN_CHAT_MESSAGE_FIELD_NUMBER = 51;
    public static final int LIST_MESSAGE_FIELD_NUMBER = 36;
    public static final int LIST_RESPONSE_MESSAGE_FIELD_NUMBER = 39;
    public static final int LIVE_LOCATION_MESSAGE_FIELD_NUMBER = 18;
    public static final int LOCATION_MESSAGE_FIELD_NUMBER = 5;
    public static final int LOTTIE_STICKER_MESSAGE_FIELD_NUMBER = 74;
    public static final int MESSAGE_CONTEXT_INFO_FIELD_NUMBER = 35;
    public static final int MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER = 70;
    public static final int NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER = 78;
    public static final int ORDER_MESSAGE_FIELD_NUMBER = 38;
    public static volatile C178978iP PARSER = null;
    public static final int PAYMENT_INVITE_MESSAGE_FIELD_NUMBER = 44;
    public static final int PIN_IN_CHAT_MESSAGE_FIELD_NUMBER = 63;
    public static final int POLL_CREATION_MESSAGE_FIELD_NUMBER = 49;
    public static final int POLL_CREATION_MESSAGE_V2_FIELD_NUMBER = 60;
    public static final int POLL_CREATION_MESSAGE_V3_FIELD_NUMBER = 64;
    public static final int POLL_UPDATE_MESSAGE_FIELD_NUMBER = 50;
    public static final int PRODUCT_MESSAGE_FIELD_NUMBER = 30;
    public static final int PROTOCOL_MESSAGE_FIELD_NUMBER = 12;
    public static final int PTV_MESSAGE_FIELD_NUMBER = 66;
    public static final int REACTION_MESSAGE_FIELD_NUMBER = 46;
    public static final int REQUEST_PAYMENT_MESSAGE_FIELD_NUMBER = 22;
    public static final int REQUEST_PHONE_NUMBER_MESSAGE_FIELD_NUMBER = 54;
    public static final int SCHEDULED_CALL_CREATION_MESSAGE_FIELD_NUMBER = 61;
    public static final int SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER = 65;
    public static final int SENDER_KEY_DISTRIBUTION_MESSAGE_FIELD_NUMBER = 2;
    public static final int SEND_PAYMENT_MESSAGE_FIELD_NUMBER = 16;
    public static final int STICKER_MESSAGE_FIELD_NUMBER = 26;
    public static final int TEMPLATE_BUTTON_REPLY_MESSAGE_FIELD_NUMBER = 29;
    public static final int TEMPLATE_MESSAGE_FIELD_NUMBER = 25;
    public static final int VIDEO_MESSAGE_FIELD_NUMBER = 9;
    public static final int VIEW_ONCE_MESSAGE_FIELD_NUMBER = 37;
    public static final int VIEW_ONCE_MESSAGE_V2_EXTENSION_FIELD_NUMBER = 59;
    public static final int VIEW_ONCE_MESSAGE_V2_FIELD_NUMBER = 55;
    public AnonymousClass1E5 audioMessage_;
    public C21581Cj bcallMessage_;
    public int bitField0_;
    public int bitField1_;
    public AnonymousClass1AL botInvokeMessage_;
    public C21801Df buttonsMessage_;
    public AnonymousClass1D0 buttonsResponseMessage_;
    public AnonymousClass1DB callLogMesssage_;
    public C21601Cl call_;
    public AnonymousClass1AJ cancelPaymentRequestMessage_;
    public AnonymousClass1BC chat_;
    public AnonymousClass1BD commentMessage_;
    public C21481Bz contactMessage_;
    public AnonymousClass1C0 contactsArrayMessage_;
    public String conversation_ = "";
    public AnonymousClass1AK declinePaymentRequestMessage_;
    public AnonymousClass1C1 deviceSentMessage_;
    public AnonymousClass1EB documentMessage_;
    public AnonymousClass1AL documentWithCaptionMessage_;
    public AnonymousClass1AL editedMessage_;
    public AnonymousClass1C2 encCommentMessage_;
    public AnonymousClass1C3 encEventResponseMessage_;
    public AnonymousClass1C4 encReactionMessage_;
    public AnonymousClass1AL ephemeralMessage_;
    public C21761Db eventMessage_;
    public AnonymousClass1EC extendedTextMessage_;
    public AnonymousClass1BQ fastRatchetKeySenderKeyDistributionMessage_;
    public C21821Dh groupInviteMessage_;
    public AnonymousClass1AL groupMentionedMessage_;
    public C21881Dn highlyStructuredMessage_;
    public AnonymousClass1EE imageMessage_;
    public AnonymousClass1ER interactiveMessage_;
    public C21521Cd interactiveResponseMessage_;
    public AnonymousClass1CA keepInChatMessage_;
    public AnonymousClass1EL listMessage_;
    public AnonymousClass1DC listResponseMessage_;
    public C21921Dr liveLocationMessage_;
    public C21991Dy locationMessage_;
    public AnonymousClass1AL lottieStickerMessage_;
    public C21851Dk messageContextInfo_;
    public C21831Di messageHistoryBundle_;
    public AnonymousClass1DD newsletterAdminInviteMessage_;
    public C22001Dz orderMessage_;
    public AnonymousClass1BM paymentInviteMessage_;
    public AnonymousClass1CE pinInChatMessage_;
    public AnonymousClass1DG pollCreationMessageV2_;
    public AnonymousClass1DG pollCreationMessageV3_;
    public AnonymousClass1DG pollCreationMessage_;
    public C21621Cn pollUpdateMessage_;
    public AnonymousClass1DU productMessage_;
    public AnonymousClass1EM protocolMessage_;
    public AnonymousClass1ED ptvMessage_;
    public C21631Co reactionMessage_;
    public C21781Dd requestPaymentMessage_;
    public AnonymousClass1AV requestPhoneNumberMessage_;
    public AnonymousClass1CG scheduledCallCreationMessage_;
    public AnonymousClass1BP scheduledCallEditMessage_;
    public AnonymousClass1CH sendPaymentMessage_;
    public AnonymousClass1BQ senderKeyDistributionMessage_;
    public AnonymousClass1EA stickerMessage_;
    public AnonymousClass1DH templateButtonReplyMessage_;
    public AnonymousClass1EI templateMessage_;
    public AnonymousClass1ED videoMessage_;
    public AnonymousClass1AL viewOnceMessageV2Extension_;
    public AnonymousClass1AL viewOnceMessageV2_;
    public AnonymousClass1AL viewOnceMessage_;

    static {
        AnonymousClass1EU r1 = new AnonymousClass1EU();
        DEFAULT_INSTANCE = r1;
        C130786cX.A0B(r1, AnonymousClass1EU.class);
    }

    public static AnonymousClass1EU A00(byte[] bArr) {
        return (AnonymousClass1EU) C130786cX.A05(DEFAULT_INSTANCE, bArr);
    }

    public boolean A0M() {
        return AnonymousClass000.A1S(this.bitField0_ & 1048576);
    }

    public final Object A0J(C141056ux r4, Object obj, Object obj2) {
        C178978iP r0;
        switch (r4.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Object[] objArr = new Object[66];
                AnonymousClass0x2.A1R(objArr);
                objArr[1] = "bitField1_";
                objArr[2] = "conversation_";
                objArr[3] = "senderKeyDistributionMessage_";
                objArr[4] = "imageMessage_";
                objArr[5] = "contactMessage_";
                objArr[6] = "locationMessage_";
                objArr[7] = "extendedTextMessage_";
                objArr[8] = "documentMessage_";
                objArr[9] = "audioMessage_";
                objArr[10] = "videoMessage_";
                objArr[11] = "call_";
                objArr[12] = "chat_";
                objArr[13] = "protocolMessage_";
                objArr[14] = "contactsArrayMessage_";
                objArr[15] = "highlyStructuredMessage_";
                objArr[16] = "fastRatchetKeySenderKeyDistributionMessage_";
                objArr[17] = "sendPaymentMessage_";
                objArr[18] = "liveLocationMessage_";
                objArr[19] = "requestPaymentMessage_";
                objArr[20] = "declinePaymentRequestMessage_";
                objArr[21] = "cancelPaymentRequestMessage_";
                objArr[22] = "templateMessage_";
                objArr[23] = "stickerMessage_";
                objArr[24] = "groupInviteMessage_";
                objArr[25] = "templateButtonReplyMessage_";
                objArr[26] = "productMessage_";
                objArr[27] = "deviceSentMessage_";
                objArr[28] = "messageContextInfo_";
                objArr[29] = "listMessage_";
                objArr[30] = "viewOnceMessage_";
                objArr[31] = "orderMessage_";
                objArr[32] = "listResponseMessage_";
                objArr[33] = "ephemeralMessage_";
                objArr[34] = "buttonsMessage_";
                objArr[35] = "buttonsResponseMessage_";
                objArr[36] = "paymentInviteMessage_";
                objArr[37] = "interactiveMessage_";
                objArr[38] = "reactionMessage_";
                objArr[39] = "interactiveResponseMessage_";
                objArr[40] = "pollCreationMessage_";
                objArr[41] = "pollUpdateMessage_";
                objArr[42] = "keepInChatMessage_";
                objArr[43] = "documentWithCaptionMessage_";
                objArr[44] = "requestPhoneNumberMessage_";
                objArr[45] = "viewOnceMessageV2_";
                objArr[46] = "encReactionMessage_";
                objArr[47] = "editedMessage_";
                objArr[48] = "viewOnceMessageV2Extension_";
                objArr[49] = "pollCreationMessageV2_";
                objArr[50] = "scheduledCallCreationMessage_";
                objArr[51] = "groupMentionedMessage_";
                objArr[52] = "pinInChatMessage_";
                objArr[53] = "pollCreationMessageV3_";
                objArr[54] = "scheduledCallEditMessage_";
                objArr[55] = "ptvMessage_";
                objArr[56] = "botInvokeMessage_";
                objArr[57] = "callLogMesssage_";
                objArr[58] = "messageHistoryBundle_";
                objArr[59] = "encCommentMessage_";
                objArr[60] = "bcallMessage_";
                objArr[61] = "lottieStickerMessage_";
                objArr[62] = "eventMessage_";
                objArr[63] = "encEventResponseMessage_";
                objArr[64] = "commentMessage_";
                objArr[65] = "newsletterAdminInviteMessage_";
                return C130786cX.A08(DEFAULT_INSTANCE, "\u0001@\u0000\u0002\u0001N@\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0012ဉ\u0010\u0016ဉ\u0011\u0017ဉ\u0012\u0018ဉ\u0013\u0019ဉ\u0014\u001aဉ\u0015\u001cဉ\u0016\u001dဉ\u0017\u001eဉ\u0018\u001fဉ\u0019#ဉ\u001a$ဉ\u001b%ဉ\u001c&ဉ\u001d'ဉ\u001e(ဉ\u001f*ဉ +ဉ!,ဉ\"-ဉ#.ဉ$0ဉ%1ဉ&2ဉ'3ဉ(5ဉ)6ဉ*7ဉ+8ဉ,:ဉ-;ဉ.<ဉ/=ဉ0>ဉ1?ဉ2@ဉ3Aဉ4Bဉ5Cဉ6Eဉ7Fဉ8Gဉ9Hဉ:Jဉ;Kဉ<Lဉ=Mဉ>Nဉ?", objArr);
            case 3:
                return new AnonymousClass1EU();
            case 4:
                return new AnonymousClass1A4();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C178978iP r02 = PARSER;
                if (r02 != null) {
                    return r02;
                }
                synchronized (AnonymousClass1EU.class) {
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
