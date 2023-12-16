package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.36g  reason: invalid class name and case insensitive filesystem */
public final class C627036g {
    public final AnonymousClass26F A00;

    public static String A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(str);
        sb.append("}{");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public static List A0D(C624134x r8, C624134x r9, Set set) {
        String A0h;
        String A0h2;
        int i;
        int i2;
        int i3;
        int i4;
        if (r8 == r9) {
            return Collections.emptyList();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if (!set.contains("status") && r8.A0D != r9.A0D) {
            A0s.add("status");
        }
        if (!set.contains("sendRetryReceipt") && r8.A1E != r9.A1E) {
            A0s.add("sendRetryReceipt");
        }
        if (!set.contains("retryCount") && r8.A0C != r9.A0C) {
            A0s.add("retryCount");
        }
        if (!set.contains("encoding") && r8.A02 != r9.A02) {
            A0s.add("encoding");
        }
        if (!set.contains("timestamp") && r8.A0K != r9.A0K) {
            A0s.add("timestamp");
        }
        if (!set.contains("receivedIncomingTimestamp") && r8.A0I != r9.A0I) {
            A0s.add("receivedIncomingTimestamp");
        }
        if (!set.contains("origin") && r8.A09 != r9.A09) {
            A0s.add("origin");
        }
        if (!set.contains("forwardingScore") && (i3 = r8.A06) != (i4 = r9.A06)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("forwardingScore ");
            C18270x1.A1D(A00((long) i3, (long) i4), A0o, A0s);
        }
        if (!set.contains("forwardedNewsletterMessageInfo")) {
            A0U(r8.A0z(), r9.A0z(), "forwardedNewsletterMessageInfo", A0s);
        }
        if (!set.contains("commentInfo")) {
            A0U(r8.A0t(), r9.A0t(), "commentInfo", A0s);
        }
        if (!set.contains("media_wa_type") && r8.A1I != r9.A1I) {
            A0s.add("media_wa_type");
        }
        if (!set.contains("messageType") && r8.A1I != r9.A1I) {
            A0s.add("messageType");
        }
        if (!set.contains("broadcastList") && r8.A1B != r9.A1B) {
            A0s.add("broadcastList");
        }
        if (!set.contains("recipient_count") && (i = r8.A0B) != (i2 = r9.A0B)) {
            C18270x1.A1D(A02(AnonymousClass000.A0Z("before:", AnonymousClass001.A0o(), (long) i), AnonymousClass000.A0Z("after:", AnonymousClass001.A0o(), (long) i2)), AnonymousClass000.A0l("recipient_count"), A0s);
        }
        if (!set.contains("server_receipt_timestamp") && r8.A0J != r9.A0J) {
            A0s.add("server_receipt_timestamp");
        }
        if (!set.contains("row_id") && r8.A1L != r9.A1L) {
            A0s.add("row_id");
        }
        if (!set.contains("sort_id") && r8.A1M != r9.A1M) {
            C18270x1.A1D(A02(AnonymousClass000.A0Z("before:", AnonymousClass001.A0o(), r8.A1M), AnonymousClass000.A0Z("after:", AnonymousClass001.A0o(), r9.A1M)), AnonymousClass000.A0l("sort_id"), A0s);
        }
        if (!set.contains("starred") && r8.A1F != r9.A1F) {
            A0s.add("starred");
        }
        if (!set.contains("quoted_row_id") && r8.A0H != r9.A0H) {
            A0s.add("quoted_row_id");
        }
        if (!set.contains("messageDecorator")) {
            A0U(r8.A0x(), r9.A0x(), "messageDecorator", A0s);
        }
        if (!set.contains("origination_flags") && r8.A0k() != r9.A0k()) {
            A0s.add("origination_flags");
        }
        if (!set.contains("verified_level") && r8.A0G != r9.A0G) {
            A0s.add("verified_level");
        }
        if (!set.contains("verifiedNameInSync") && r8.A1G != r9.A1G) {
            A0s.add("verifiedNameInSync");
        }
        if (!set.contains("privacy_mode")) {
            A0U(r8.A0n, r9.A0n, "privacy_mode", A0s);
        }
        if (!set.contains("chat_active") && r8.A1C != r9.A1C) {
            A0s.add("chat_active");
        }
        if (!set.contains("edited_version") && r8.A01 != r9.A01) {
            A0s.add("edited_version");
        }
        set.contains("ctwaConversionDelaySeconds");
        if (!set.contains("deleted") && r8.A1N != r9.A1N) {
            A0s.add("deleted");
        }
        if (!set.contains("storageType") && r8.A0l() != r9.A0l()) {
            A0s.add("storageType");
        }
        if (!set.contains("expirationDuration") && r8.A05 != r9.A05) {
            A0s.add("expirationDuration");
        }
        if (!set.contains("key") && !r8.A1J.equals(r9.A1J)) {
            A0s.add("key");
        }
        if (!set.contains("senderJid")) {
            A0U(r8.A0n(), r9.A0n(), "senderJid", A0s);
        }
        if (!set.contains("entVerifiedNameOnPrivacyConflict")) {
            A0U(r8.A10, r9.A10, "entVerifiedNameOnPrivacyConflict", A0s);
        }
        if ((!(r8 instanceof C30341mI) || (r8 instanceof C31891p1)) && !set.contains("participantList") && !AnonymousClass367.A04(r8.A19(), r9.A19())) {
            List A19 = r8.A19();
            List A192 = r9.A19();
            if (A19 == null) {
                A0h = AnonymousClass000.A0T("before:", "null");
            } else {
                A0h = AnonymousClass000.A0h(AnonymousClass000.A0m("before:", "size:"), A19.size());
            }
            if (A192 == null) {
                A0h2 = AnonymousClass000.A0T("after:", "null");
            } else {
                A0h2 = AnonymousClass000.A0h(AnonymousClass000.A0m("after:", "size:"), A192.size());
            }
            A0s.add(AnonymousClass000.A0T("participantList", A02(A0h, A0h2)));
        }
        if (!set.contains("participant_hash")) {
            A0T(r8.A14, r9.A14, "participant_hash", A0s);
        }
        if (!set.contains("broadcastParticipantEphemeralSettings")) {
            A0U(r8.A1A, r9.A1A, "broadcastParticipantEphemeralSettings", A0s);
        }
        if (!set.contains("data")) {
            A0T(r8.A13(), r9.A13(), "data", A0s);
        }
        if (!set.contains("dataBytes")) {
            A0W("dataBytes", A0s, r8.A1u(), r9.A1u());
        }
        if (!set.contains("from_name")) {
            A0T(r8.A13, r9.A13, "from_name", A0s);
        }
        if (!set.contains(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME)) {
            A0T(r8.A0z, r9.A0z, PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, A0s);
        }
        if (!set.contains("senderPn")) {
            A0U(r8.A0V, r9.A0V, "senderPn", A0s);
        }
        if (!set.contains("senderUsername")) {
            A0U(r8.A17, r9.A17, "senderUsername", A0s);
        }
        if (!set.contains("participantLid")) {
            A0U(r8.A0R, r9.A0R, "participantLid", A0s);
        }
        if (!set.contains("participantPn")) {
            A0U(r8.A0T, r9.A0T, "participantPn", A0s);
        }
        if (!set.contains("senderLid")) {
            A0U(r8.A0S, r9.A0S, "senderLid", A0s);
        }
        if (!set.contains("recipientPn")) {
            A0U(r8.A0U, r9.A0U, "recipientPn", A0s);
        }
        if (!set.contains("recipientUsername")) {
            A0U(r8.A16, r9.A16, "recipientUsername", A0s);
        }
        if (!set.contains("chatOrigin")) {
            A0U(r8.A0N, r9.A0N, "chatOrigin", A0s);
        }
        if (!set.contains("messageSecretEnabled") && r8.A1p() != r9.A1p()) {
            A0s.add("messageSecretEnabled");
        }
        if (!set.contains("mentionedJids") && !AnonymousClass367.A04(r8.A18, r9.A18)) {
            A0s.add("mentionedJids");
        }
        if (!set.contains("offline")) {
            A0U(r8.A0p, r9.A0p, "offline", A0s);
        }
        if (!set.contains("quotedMessage")) {
            A0U(r8.A0w(), r9.A0w(), "quotedMessage", A0s);
        }
        if (!set.contains("externalAdContentInfo")) {
            A0U(r8.A0c, r9.A0c, "externalAdContentInfo", A0s);
        }
        if (!set.contains("mmsThumbnailMetadata")) {
            A0U(r8.A0l, r9.A0l, "mmsThumbnailMetadata", A0s);
        }
        if (!set.contains("verified_name")) {
            A0U(r8.A0w, r9.A0w, "verified_name", A0s);
        }
        if (!set.contains("trigger_csat_expiration_ts")) {
            A0U(r8.A0t, r9.A0t, "trigger_csat_expiration_ts", A0s);
        }
        if (!set.contains("triggred_block_expiration_ts")) {
            A0U(r8.A0v, r9.A0v, "triggred_block_expiration_ts", A0s);
        }
        if (!set.contains("triggred_block_cooldown")) {
            A0U(r8.A0u, r9.A0u, "triggred_block_cooldown", A0s);
        }
        A0V("ctwaConversionTupleSource", A0s, set);
        A0V("ctwaConversionTupleData", A0s, set);
        if (!set.contains("customerLoggingData")) {
            A0U(r8.A0M, r9.A0M, "customerLoggingData", A0s);
        }
        if (!set.contains("entryPointConversionSource")) {
            A0T(r8.A12, r9.A12, "entryPointConversionSource", A0s);
        }
        if (!set.contains("entryPointConversionApp")) {
            A0T(r8.A11, r9.A11, "entryPointConversionApp", A0s);
        }
        if (!set.contains("entryPointConversionDelaySeconds") && r8.A03 != r9.A03) {
            A0s.add("entryPointConversionDelaySeconds");
        }
        if (!set.contains("thumbnail")) {
            A0U(r8.A0y(), r9.A0y(), "thumbnail", A0s);
        }
        if (!set.contains("payment_transaction_id")) {
            A0T(r8.A15, r9.A15, "payment_transaction_id", A0s);
        }
        if (!set.contains("paymentTransactionInfo")) {
            A0U(r8.A0P, r9.A0P, "paymentTransactionInfo", A0s);
        }
        if (!set.contains("backFillMessageKey")) {
            A0U(r8.A0f, r9.A0f, "backFillMessageKey", A0s);
        }
        if (!set.contains("ephemeralSettingTimestamp")) {
            A0U(r8.A0q, r9.A0q, "ephemeralSettingTimestamp", A0s);
        }
        if (!set.contains("expirationExpireTimestamp")) {
            A0U(r8.A0r, r9.A0r, "expirationExpireTimestamp", A0s);
        }
        if (!set.contains("disappearingMessagesInitiator")) {
            A0U(Integer.valueOf(r8.A00), Integer.valueOf(r9.A00), "disappearingMessagesInitiator", A0s);
        }
        if (!set.contains("ephemeralTrigger")) {
            A0U(Integer.valueOf(r8.A04), Integer.valueOf(r9.A04), "ephemeralTrigger", A0s);
        }
        if (!set.contains("ephemeralInitiatedByMe")) {
            A0U(r8.A0o, r9.A0o, "ephemeralInitiatedByMe", A0s);
        }
        if (!set.contains("messageAddOnFlag") && r8.A08 != r9.A08) {
            A0s.add("messageAddOnFlag");
        }
        if (!set.contains("messageReactions") && !AnonymousClass75J.A00(r8.A0L, r9.A0L)) {
            AnonymousClass4FP r1 = r8.A0L;
            AnonymousClass4FP r0 = r9.A0L;
            if (r1 == null || r0 == null || r1.B4L() != r0.B4L()) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("messageReactions ");
                C18270x1.A1D(A01(r8.A0L, r9.A0L), A0o2, A0s);
            }
        }
        if (!set.contains("statusDistributionInfo")) {
            A0U(r8.A0O, r9.A0O, "statusDistributionInfo", A0s);
        }
        if (!set.contains("statusDistributionMode")) {
            A0U(Integer.valueOf(r8.A0E), Integer.valueOf(r9.A0E), "statusDistributionMode", A0s);
        }
        if (!set.contains("keepInChat")) {
            A0U(Integer.valueOf(r8.A0j()), Integer.valueOf(r9.A0j()), "keepInChat", A0s);
        }
        if (!set.contains("businessMessageForwardInfo") && r8.A0s() != r9.A0s()) {
            A0s.add("businessMessageForwardInfo");
        }
        if (!set.contains("campaignId")) {
            A0U(r8.A14(), r9.A14(), "campaignId", A0s);
        }
        if (!set.contains("botAvatarMetadata")) {
            A0U(r8.A0p(), r9.A0p(), "botAvatarMetadata", A0s);
        }
        if (!set.contains("botPluginMetadata")) {
            A0U(r8.A0r(), r9.A0r(), "botPluginMetadata", A0s);
        }
        if (!set.contains("dataSharingDisclosureMetadata")) {
            A0U(r8.A0u(), r9.A0u(), "dataSharingDisclosureMetadata", A0s);
        }
        if (!set.contains("fMessageReportingInfo")) {
            A0U(r8.A0g, r9.A0g, "fMessageReportingInfo", A0s);
        }
        A0V("smbClientCampaignId", A0s, set);
        if (!set.contains("originalMsgRowId")) {
            A0U(r8.A0s, r9.A0s, "originalMsgRowId", A0s);
        }
        if (!set.contains("messageDetailsInfo")) {
            A0U(r8.A10(), r9.A10(), "messageDetailsInfo", A0s);
        }
        return A0s;
    }

    public static List A0F(C30321mG r12, C30321mG r13, Set set) {
        if (r12 == r13) {
            return Collections.emptyList();
        }
        ArrayList A08 = A08(r12, r13, set);
        if (!set.contains("isLegacy") && r12.A00 != r13.A00) {
            A08.add("isLegacy");
        }
        if (!set.contains("isVideoCall")) {
            A0T(r12.A16(), r13.A16(), "isVideoCall", A08);
        }
        if (!set.contains("callLogs")) {
            List<AnonymousClass3ZF> A1w = r12.A1w();
            List A1w2 = r13.A1w();
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            ArrayList A0J = AnonymousClass002.A0J(A1w2);
            for (AnonymousClass3ZF r3 : A1w) {
                Iterator it = A0J.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        A0s2.add(r3);
                        break;
                    }
                    AnonymousClass3ZF r2 = (AnonymousClass3ZF) it.next();
                    ArrayList A0s3 = AnonymousClass001.A0s();
                    if (!set.contains("callLog.key")) {
                        A0U(r3.A06(), r2.A06(), "callLog.key", A0s3);
                    }
                    if (!set.contains("callLog.bytesTransferred")) {
                        A0U(Long.valueOf(r3.A03), Long.valueOf(r2.A03), "callLog.bytesTransferred", A0s3);
                    }
                    if (!set.contains("callLog.callCreatorDeviceJid")) {
                        A0U(r3.A0C, r2.A0C, "callLog.callCreatorDeviceJid", A0s3);
                    }
                    if (!set.contains("callLog.callRandomId")) {
                        A0U(r3.A08, r2.A08, "callLog.callRandomId", A0s3);
                    }
                    if (!set.contains("callLog.callResult")) {
                        A0U(Integer.valueOf(r3.A00), Integer.valueOf(r2.A00), "callLog.callResult", A0s3);
                    }
                    if (!set.contains("callLog.duration")) {
                        A0U(Integer.valueOf(r3.A01), Integer.valueOf(r2.A01), "callLog.duration", A0s3);
                    }
                    if (!set.contains("callLog.groupJid")) {
                        A0U(r3.A05, r2.A05, "callLog.groupJid", A0s3);
                    }
                    if (!set.contains("callLog.transactionId")) {
                        A0U(Integer.valueOf(r3.A0E.A00), Integer.valueOf(r2.A0E.A00), "callLog.transactionId", A0s3);
                    }
                    if (!set.contains("callLog.remoteJid")) {
                        A0U(r3.A0E.A01, r2.A0E.A01, "callLog.remoteJid", A0s3);
                    }
                    if (A0s3.size() == 0) {
                        A0J.remove(r2);
                        break;
                    }
                }
            }
            if (!AnonymousClass367.A04(A0s2, A0J)) {
                A0s.add("callLogs");
            }
            A08.addAll(A0s);
        }
        return A08;
    }

    public static List A0G(AnonymousClass1nF r4, AnonymousClass1nF r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList A09 = A09(r4, r5, set);
        if (!set.contains("pageCount") && r4.A00 != r5.A00) {
            A09.add("pageCount");
        }
        if (!set.contains("mediaText")) {
            A0T(r4.A01, r5.A01, "mediaText", A09);
        }
        return A09;
    }

    public static List A0H(C30361mK r6, C30361mK r7, Set set) {
        if (r6 == r7) {
            return Collections.emptyList();
        }
        ArrayList A08 = A08(r6, r7, set);
        if (!set.contains("latitude") && Double.compare(r6.A00, r7.A00) != 0) {
            A08.add("latitude");
        }
        if (!set.contains("longitude") && Double.compare(r6.A01, r7.A01) != 0) {
            A08.add("longitude");
        }
        if (!set.contains("downloadStatus") && r6.A02 != r7.A02) {
            A08.add("downloadStatus");
        }
        return A08;
    }

    public static List A0I(C30471mV r7, C30471mV r8, Set set) {
        if (r7 == r8) {
            return Collections.emptyList();
        }
        ArrayList A08 = A08(r7, r8, set);
        if (!set.contains("media_duration_seconds") && r7.A0B != r8.A0B) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("media_duration_seconds ");
            C18270x1.A1D(A00((long) r7.A0B, (long) r8.A0B), A0o, A08);
        }
        if (!set.contains("media_size")) {
            long j = r7.A00;
            long j2 = r8.A00;
            if (j != j2) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("media_size ");
                C18270x1.A1D(A00(j, j2), A0o2, A08);
            }
        }
        if (!set.contains("mediaDataV2")) {
            A0U(r7.A01, r8.A01, "mediaDataV2", A08);
        }
        if (!set.contains("media_caption")) {
            A0T(r7.A1w(), r8.A1w(), "media_caption", A08);
        }
        if (!set.contains("media_enc_hash") && !C107575bX.A0G(r7.A03, r8.A03)) {
            StringBuilder A0o3 = AnonymousClass001.A0o();
            A0o3.append("media_enc_hash ");
            C18270x1.A1D(A03(r7.A03, r8.A03), A0o3, A08);
        }
        if (!set.contains("media_hash")) {
            A0T(r7.A04, r8.A04, "media_hash", A08);
        }
        if (!set.contains("media_mime_type") && !C107575bX.A0G(r7.A05, r8.A05)) {
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("media_mime_type ");
            C18270x1.A1D(A03(r7.A05, r8.A05), A0o4, A08);
        }
        if (!set.contains("media_name")) {
            A0T(r7.A1x(), r8.A1x(), "media_name", A08);
        }
        if (!set.contains("media_url") && !C107575bX.A0G(r7.A07, r8.A07)) {
            StringBuilder A0o5 = AnonymousClass001.A0o();
            A0o5.append("media_url ");
            C18270x1.A1D(A03(r7.A07, r8.A07), A0o5, A08);
        }
        if (!set.contains("original_file_hash")) {
            A0T(r7.A09, r8.A09, "original_file_hash", A08);
        }
        if (!set.contains("multicast_id")) {
            A0T(r7.A08, r8.A08, "multicast_id", A08);
        }
        if (!set.contains("sidecar")) {
            A0U(r7.A1v(), r8.A1v(), "sidecar", A08);
        }
        return A08;
    }

    public static List A0J(C30301mE r4, C30301mE r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList A08 = A08(r4, r5, set);
        if (!set.contains("recipient")) {
            A0U(r4.A00, r5.A00, "recipient", A08);
        }
        if (!set.contains("receivedAck")) {
            A0U(Boolean.valueOf(r4.A01), Boolean.valueOf(r5.A01), "receivedAck", A08);
        }
        return A08;
    }

    public static List A0K(C30441mS r7, C30441mS r8, Set set) {
        if (r7 == r8) {
            return Collections.emptyList();
        }
        ArrayList A08 = A08(r7, r8, set);
        if (!set.contains("revokedMessageId")) {
            A0T(r7.A01, r8.A01, "revokedMessageId", A08);
        }
        if (!set.contains("revokeTimestampMs") && r7.A00 != r8.A00) {
            A08.add("revokeTimestampMs");
        }
        return A08;
    }

    public static List A0M(AnonymousClass1n9 r4, AnonymousClass1n9 r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList A0J = AnonymousClass002.A0J(A0H(r4, r5, set));
        if (!set.contains("placeName")) {
            A0T(r4.A01, r5.A01, "placeName", A0J);
        }
        if (!set.contains("address")) {
            A0T(r4.A00, r5.A00, "address", A0J);
        }
        if (!set.contains("url")) {
            A0T(r4.A02, r5.A02, "url", A0J);
        }
        return A0J;
    }

    public static List A0N(C30341mI r4, C30341mI r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList A08 = A08(r4, r5, set);
        if (!set.contains("action") && r4.A00 != r5.A00) {
            A08.add("action");
        }
        return A08;
    }

    public static List A0O(C31891p1 r4, C31891p1 r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList A0A = A0A(r4, r5, set);
        if (!set.contains("isCurrentUserJoined") && r4.A00 != r5.A00) {
            A0A.add("isCurrentUserJoined");
        }
        if (!set.contains("groupParticipants")) {
            A0U(r4.A02, r5.A02, "groupParticipants", A0A);
        }
        return A0A;
    }

    public static List A0P(C31351o9 r4, C31351o9 r5, Set set) {
        if (r4 == r5) {
            return Collections.emptyList();
        }
        ArrayList A0A = A0A(r4, r5, set);
        if (!set.contains("senderUserJid")) {
            A0U(r4.A01, r5.A01, "senderUserJid", A0A);
        }
        if (!set.contains("receiverUserJid")) {
            A0U(r4.A00, r5.A00, "receiverUserJid", A0A);
        }
        if (!set.contains("amountWithSymbol")) {
            A0T(r4.A03, r5.A03, "amountWithSymbol", A0A);
        }
        if (!set.contains("referenceMsgKey")) {
            A0U(r4.A02, r5.A02, "referenceMsgKey", A0A);
        }
        return A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r0 == 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ab, code lost:
        if (java.util.Arrays.equals(r1, r0) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        r2 = r8.A1z();
        r7 = r9.A1z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        if (r2 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bf, code lost:
        r2 = X.AnonymousClass000.A0T("before:", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (r7 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r0 = X.AnonymousClass000.A0T("after:", "null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r5.add(X.AnonymousClass000.A0T("thumbData", A02(r2, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r0 = X.AnonymousClass000.A0h(X.AnonymousClass000.A0m("after:", "size:"), r7.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        r2 = X.AnonymousClass000.A0h(X.AnonymousClass000.A0m("before:", "size:"), r2.length);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A0Q(X.C30481mW r8, X.C30481mW r9, java.util.Set r10) {
        /*
            if (r8 != r9) goto L_0x0007
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0007:
            java.util.ArrayList r5 = A08(r8, r9, r10)
            java.lang.String r2 = "previewType"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x001d
            int r1 = r8.A01
            int r0 = r9.A01
            if (r1 == r0) goto L_0x001d
            r5.add(r2)
        L_0x001d:
            java.lang.String r2 = "inviteLinkGroupType"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x002e
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 == r0) goto L_0x002e
            r5.add(r2)
        L_0x002e:
            java.lang.String r2 = "description"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x003d
            java.lang.String r1 = r8.A04
            java.lang.String r0 = r9.A04
            A0T(r1, r0, r2, r5)
        L_0x003d:
            java.lang.String r2 = "pageTitle"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x004d
            java.lang.String r1 = r8.A06
            java.lang.String r0 = r9.A06
            A0T(r1, r0, r2, r5)
        L_0x004d:
            java.lang.String r2 = "url"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = r8.A07
            java.lang.String r0 = r9.A07
            A0T(r1, r0, r2, r5)
        L_0x005d:
            java.lang.String r2 = "textData"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x006d
            com.whatsapp.TextData r1 = r8.A02
            com.whatsapp.TextData r0 = r9.A02
            A0U(r1, r0, r2, r5)
        L_0x006d:
            java.lang.String r6 = "thumbData"
            boolean r0 = r10.contains(r6)
            if (r0 != 0) goto L_0x0087
            byte[] r1 = r8.A1z()
            byte[] r0 = r9.A1z()
            if (r1 == r0) goto L_0x0087
            if (r1 == 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00a7
            int r0 = r1.length
        L_0x0085:
            if (r0 != 0) goto L_0x00ad
        L_0x0087:
            java.lang.String r2 = "mimeType"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x0097
            java.lang.String r1 = r8.A05
            java.lang.String r0 = r9.A05
            A0T(r1, r0, r2, r5)
        L_0x0097:
            java.lang.String r2 = "counterAbuseToken"
            boolean r0 = r10.contains(r2)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r1 = r8.A03
            java.lang.String r0 = r9.A03
            A0T(r1, r0, r2, r5)
        L_0x00a6:
            return r5
        L_0x00a7:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0087
        L_0x00ad:
            byte[] r2 = r8.A1z()
            byte[] r7 = r9.A1z()
            java.lang.String r4 = "null"
            java.lang.String r3 = "size:"
            java.lang.String r0 = "before:"
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = X.AnonymousClass000.A0T(r0, r4)
        L_0x00c3:
            java.lang.String r0 = "after:"
            if (r7 != 0) goto L_0x00d7
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r4)
        L_0x00cb:
            java.lang.String r0 = A02(r2, r0)
            java.lang.String r0 = X.AnonymousClass000.A0T(r6, r0)
            r5.add(r0)
            goto L_0x0087
        L_0x00d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r0, r3)
            int r0 = r7.length
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x00cb
        L_0x00e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r0, r3)
            int r0 = r2.length
            java.lang.String r2 = X.AnonymousClass000.A0h(r1, r0)
            goto L_0x00c3
        L_0x00eb:
            int r0 = r0.length
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627036g.A0Q(X.1mW, X.1mW, java.util.Set):java.util.List");
    }

    public static final void A0X(String str) {
        if (str == null) {
            throw new IllegalStateException();
        }
        throw AnonymousClass001.A0e(str);
    }

    public void A0Y(Object obj, Object obj2, String str) {
        if (obj == null) {
            if (obj2 == null) {
                return;
            }
        } else if (obj.equals(obj2)) {
            return;
        }
        A0Z(obj, obj2, str);
        throw AnonymousClass000.A0L();
    }

    public final void A0Z(Object obj, Object obj2, String str) {
        StringBuilder A0l;
        String str2;
        String A0X;
        if (str == null) {
            A0X = "";
        } else {
            if (obj == null) {
                if (obj2 != null) {
                    A0l = AnonymousClass000.A0l(str);
                    str2 = ", expected=null";
                }
                A0l = AnonymousClass000.A0l(str);
                str2 = ", !=";
            } else {
                if (obj2 == null) {
                    A0l = AnonymousClass000.A0l(str);
                    str2 = ", actual=null";
                }
                A0l = AnonymousClass000.A0l(str);
                str2 = ", !=";
            }
            A0X = AnonymousClass000.A0X(str2, A0l);
        }
        A0X(A0X);
        throw AnonymousClass000.A0L();
    }

    public void A0d(String str, List list, List list2, Set set) {
        StringBuilder A0l;
        String str2;
        if (list != list2) {
            if (list == null) {
                A0l = AnonymousClass000.A0l(str);
                str2 = "expected list is null";
            } else if (list2 == null) {
                A0l = AnonymousClass000.A0l(str);
                str2 = "actual list is null";
            } else if (list.size() != list2.size()) {
                A0X(AnonymousClass000.A0X("list sizes are different", AnonymousClass000.A0l(str)));
                throw AnonymousClass000.A0L();
            } else {
                for (int i = 0; i < list.size(); i++) {
                    A0a(list.get(i), list2.get(i), str, set);
                }
                return;
            }
            A0X(AnonymousClass000.A0X(str2, A0l));
            throw AnonymousClass000.A0L();
        }
    }

    public void A0e(String str, boolean z) {
        if (!z) {
            A0X(str);
            throw AnonymousClass000.A0L();
        }
    }

    public void A0f(String str, byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && !Arrays.equals(bArr, bArr2)) {
            A0Z(bArr, bArr2, str);
            throw AnonymousClass000.A0L();
        }
    }

    public C627036g(AnonymousClass26F r1) {
        this.A00 = r1;
    }

    public static String A00(long j, long j2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("before:");
        String str = " not zero";
        String str2 = "zero";
        if (j != 0) {
            str2 = str;
        }
        String A0X = AnonymousClass000.A0X(str2, A0o);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("after:");
        if (j2 == 0) {
            str = "zero";
        }
        return A02(A0X, AnonymousClass000.A0X(str, A0o2));
    }

    public static String A01(Object obj, Object obj2) {
        String A0h;
        String A0h2;
        if (obj == null) {
            A0h = AnonymousClass000.A0T("before:", "null");
        } else {
            A0h = AnonymousClass000.A0h(AnonymousClass000.A0m("before:", "hash:"), obj.hashCode());
        }
        if (obj2 == null) {
            A0h2 = AnonymousClass000.A0T("after:", "null");
        } else {
            A0h2 = AnonymousClass000.A0h(AnonymousClass000.A0m("after:", "hash:"), obj2.hashCode());
        }
        return A02(A0h, A0h2);
    }

    public static String A03(String str, String str2) {
        String A0h;
        String A0h2;
        if (str == null) {
            A0h = AnonymousClass000.A0T("before:", "null");
        } else {
            A0h = AnonymousClass000.A0h(AnonymousClass000.A0m("before:", "length:"), str.length());
        }
        if (str2 == null) {
            A0h2 = AnonymousClass000.A0T("after:", "null");
        } else {
            A0h2 = AnonymousClass000.A0h(AnonymousClass000.A0m("after:", "length:"), str2.length());
        }
        return A02(A0h, A0h2);
    }

    public static StringBuilder A04(C627036g r1, CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        r1.A0e(str, C107575bX.A0G(charSequence, charSequence2));
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A05(C627036g r0, Object obj, Object obj2, String str, String str2) {
        r0.A0Y(obj, obj2, str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        return sb;
    }

    public static StringBuilder A06(C627036g r0, String str, String str2, boolean z) {
        r0.A0e(str, z);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        return sb;
    }

    public static ArrayList A07(C30871nL r4, C30871nL r5, Set set) {
        ArrayList arrayList = new ArrayList(A0J(r4, r5, set));
        if (!set.contains("requestStanzaId") && !TextUtils.equals(r4.A00, r5.A00)) {
            arrayList.add("requestStanzaId");
        }
        return arrayList;
    }

    public static ArrayList A08(C624134x r0, C624134x r1, Set set) {
        return new ArrayList(A0D(r0, r1, set));
    }

    public static ArrayList A09(C30471mV r0, C30471mV r1, Set set) {
        return new ArrayList(A0I(r0, r1, set));
    }

    public static ArrayList A0A(C30341mI r0, C30341mI r1, Set set) {
        return new ArrayList(A0N(r0, r1, set));
    }

    public static ArrayList A0B(C31891p1 r0, C31891p1 r1, Set set) {
        return new ArrayList(A0O(r0, r1, set));
    }

    public static List A0C(C30601mi r5, C30601mi r6, Set set) {
        ArrayList A0J = AnonymousClass002.A0J(A0E(r5, r6, set));
        if (!set.contains("encryptionKey")) {
            A0U(r5.A04, r6.A04, "encryptionKey", A0J);
        }
        if (!set.contains(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE)) {
            A0U(r5.A01, r6.A01, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A0J);
        }
        if (!set.contains("senderResponseTimestamp")) {
            A0U(Long.valueOf(r5.A00), Long.valueOf(r6.A00), "senderResponseTimestamp", A0J);
        }
        if (!set.contains("encPayload")) {
            A0U(r5.A03, r6.A03, "encPayload", A0J);
        }
        if (!set.contains("encIv")) {
            A0U(r5.A02, r6.A02, "encIv", A0J);
        }
        return A0J;
    }

    public static List A0E(C30331mH r5, C30331mH r6, Set set) {
        long j;
        long j2;
        int i;
        int i2;
        AnonymousClass2z0 r1;
        AnonymousClass2z0 r0;
        C95814uZ r12;
        C95814uZ r02;
        ArrayList A08 = A08(r5, r6, set);
        if (!set.contains("parentMessageKey") && !AnonymousClass75J.A00(r5.A1v(), r6.A1v())) {
            A0U(C30331mH.A00(r5), C30331mH.A00(r6), "parentMessageKey", A08);
        }
        if (!set.contains("broadcastParentMessageKey")) {
            C52042kn r03 = r5.A04;
            if (r03 == null) {
                r1 = null;
            } else {
                r1 = r03.A01;
            }
            C52042kn r04 = r6.A04;
            if (r04 == null) {
                r0 = null;
            } else {
                r0 = r04.A01;
            }
            if (!AnonymousClass75J.A00(r1, r0)) {
                C52042kn r05 = r5.A04;
                if (r05 == null) {
                    r12 = null;
                } else {
                    r12 = r05.A00;
                }
                C52042kn r06 = r6.A04;
                if (r06 == null) {
                    r02 = null;
                } else {
                    r02 = r06.A00;
                }
                A0U(r12, r02, "broadcastParentMessageKey", A08);
            }
        }
        if (!set.contains("parentMessageRowId")) {
            A0U(Long.valueOf(r5.A02), Long.valueOf(r6.A02), "parentMessageRowId", A08);
        }
        if (!set.contains("expiryDurationInSecs")) {
            if (r5 instanceof C30561me) {
                i = r5.A00;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (r6 instanceof C30561me) {
                i2 = r6.A00;
            } else {
                i2 = 0;
            }
            A0U(valueOf, Integer.valueOf(i2), "expiryDurationInSecs", A08);
        }
        if (!set.contains("expiryTimestamp")) {
            if (r5 instanceof C30561me) {
                j = r5.A01;
            } else {
                j = 0;
            }
            Long valueOf2 = Long.valueOf(j);
            if (r6 instanceof C30561me) {
                j2 = r6.A01;
            } else {
                j2 = 0;
            }
            A0U(valueOf2, Long.valueOf(j2), "expiryTimestamp", A08);
        }
        if (!set.contains("serverTimestamp")) {
            A0U(Long.valueOf(r5.A03), Long.valueOf(r6.A03), "serverTimestamp", A08);
        }
        return A08;
    }

    public static List A0L(C30491mX r5, C30491mX r6, Set set) {
        ArrayList A08 = A08(r5, r6, set);
        if (!set.contains("title")) {
            A0U(r5.A02, r6.A02, "title", A08);
        }
        if (!set.contains("scheduledTimeStampMs")) {
            A0U(Long.valueOf(r5.A01), Long.valueOf(r6.A01), "scheduledTimeStampMs", A08);
        }
        if (!set.contains("callType")) {
            A0U(Integer.valueOf(r5.A00), Integer.valueOf(r6.A00), "callType", A08);
        }
        return A08;
    }

    public static void A0R(C627036g r1, Object obj, String str, int i) {
        r1.A0Y(obj, Integer.valueOf(i), str);
    }

    public static void A0S(C627036g r1, Object obj, String str, boolean z) {
        r1.A0Y(obj, Boolean.valueOf(z), str);
    }

    public static void A0T(CharSequence charSequence, CharSequence charSequence2, Object obj, AbstractCollection abstractCollection) {
        if (!C107575bX.A0G(charSequence, charSequence2)) {
            abstractCollection.add(obj);
        }
    }

    public static void A0U(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        if (!AnonymousClass75J.A00(obj, obj2)) {
            abstractCollection.add(obj3);
        }
    }

    public static void A0V(Object obj, AbstractCollection abstractCollection, Set set) {
        if (!set.contains(obj) && !C107575bX.A0G((CharSequence) null, (CharSequence) null)) {
            abstractCollection.add(obj);
        }
    }

    public static void A0W(Object obj, AbstractCollection abstractCollection, byte[] bArr, byte[] bArr2) {
        if (!Arrays.equals(bArr, bArr2)) {
            abstractCollection.add(obj);
        }
    }

    public void A0c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            A0e(str, TextUtils.isEmpty(str3));
        } else {
            A0Y(str2, str3, str);
        }
    }

    public void A0b(String str, double d, double d2) {
        if (Double.compare(d, d2) != 0 && Math.abs(d - d2) > 1.0E-9d) {
            A0Z(Double.valueOf(d), Double.valueOf(d2), str);
            throw AnonymousClass000.A0L();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v99, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v101, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v102, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v103, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v109, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v111, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v113, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v114, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v115, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v128, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v129, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v130, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v131, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v134, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v135, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v136, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v137, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v138, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v139, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v140, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v141, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v142, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v143, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v144, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v145, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v146, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v147, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v148, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v149, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v150, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v151, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v152, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v153, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v154, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v155, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v156, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v157, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v158, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v159, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v160, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v161, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v162, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v163, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v164, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v165, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v166, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v167, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v168, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v169, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v170, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v171, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v172, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v173, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v175, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v176, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v177, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v178, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v179, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v180, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v181, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v182, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v183, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v184, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v185, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v186, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v187, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v188, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v190, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v191, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v192, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v193, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v194, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v195, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v196, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v197, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v198, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v199, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v200, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v201, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v202, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v203, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v204, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v205, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v206, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v207, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v208, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v209, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v210, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v211, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v212, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v213, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v214, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v215, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v216, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v217, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v218, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v219, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v220, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v221, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v222, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v224, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v225, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v226, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v227, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v229, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v230, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v231, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v232, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v233, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v234, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v235, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v236, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v237, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v238, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v239, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v240, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v241, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v242, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v243, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v244, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v245, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v246, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v247, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v248, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v249, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v251, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v252, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v253, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v254, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v255, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v256, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v257, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v258, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v259, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v260, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v261, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v262, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v263, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v264, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v265, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v266, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v267, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v268, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v269, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v270, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v271, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v272, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v273, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v274, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v275, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v276, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v277, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v279, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v280, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v281, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v282, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v283, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v284, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v285, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v286, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v287, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v288, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v289, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v290, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v291, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v292, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v293, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v294, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v295, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v296, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v297, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v298, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v299, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v300, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v301, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v302, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v303, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v304, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v305, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v306, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v307, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v308, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v309, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v310, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v311, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v312, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v313, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v314, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v315, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v316, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v318, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v319, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v320, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v321, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v322, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v323, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v324, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v325, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v326, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v327, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v328, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v329, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v330, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v331, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v332, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v333, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v334, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v335, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v336, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v338, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v339, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v340, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v341, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v342, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v343, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v123 */
    /* JADX WARNING: type inference failed for: r4v124 */
    /* JADX WARNING: type inference failed for: r4v125 */
    /* JADX WARNING: type inference failed for: r4v126 */
    /* JADX WARNING: type inference failed for: r4v127 */
    /* JADX WARNING: type inference failed for: r4v132 */
    /* JADX WARNING: type inference failed for: r4v133 */
    /* JADX WARNING: type inference failed for: r4v174 */
    /* JADX WARNING: type inference failed for: r4v189 */
    /* JADX WARNING: type inference failed for: r4v223 */
    /* JADX WARNING: type inference failed for: r4v228 */
    /* JADX WARNING: type inference failed for: r4v250 */
    /* JADX WARNING: type inference failed for: r4v278 */
    /* JADX WARNING: type inference failed for: r4v344 */
    /* JADX WARNING: type inference failed for: r4v345 */
    /* JADX WARNING: Code restructure failed: missing block: B:1295:0x174a, code lost:
        if (A0E(r1, r0, r2).size() == 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1416:0x19bf, code lost:
        if (r5 == null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1417:0x19c3, code lost:
        if (r5 == null) goto L_0x1a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1419:0x19cd, code lost:
        if (r5.size() != r6.size()) goto L_0x1a03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1420:0x19cf, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1422:0x19d4, code lost:
        if (r3 >= r5.size()) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1423:0x19d6, code lost:
        r2 = A0C((X.C30601mi) r6.get(r3), (X.C30601mi) r5.get(r3), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1424:0x19ea, code lost:
        if (r2.isEmpty() != false) goto L_0x1a00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1425:0x19ec, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("eventResponses[");
        r1.append(r3);
        X.C18270x1.A1D("]", r1, r4);
        r4.addAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1426:0x1a00, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1427:0x1a03, code lost:
        r4.add("eventResponses");
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1447:0x000e, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04c8, code lost:
        if (r6 == 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x063b, code lost:
        if (r3 != r0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0727, code lost:
        if (r0 != r2) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0ad0, code lost:
        if (r5.A24() != r3.A24()) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0194, code lost:
        if (r0 != false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:993:0x11ae, code lost:
        if (X.AnonymousClass367.A04(r2, r1.subList(1, r1.size())) == false) goto L_0x04ca;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1451:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0a(java.lang.Object r10, java.lang.Object r11, java.lang.String r12, java.util.Set r13) {
        /*
            r9 = this;
            if (r10 == r11) goto L_0x1a5b
            if (r10 == r11) goto L_0x1a4b
            if (r10 == 0) goto L_0x1a47
            if (r11 != 0) goto L_0x004a
            java.lang.String r0 = "actual object is null"
        L_0x000a:
            java.util.List r4 = java.util.Collections.singletonList(r0)
        L_0x000e:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x1a5b
            java.lang.String r0 = ","
            java.lang.String r2 = android.text.TextUtils.join(r0, r4)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r13.toArray(r0)
            java.lang.String r0 = " Failed field: "
            if (r10 != 0) goto L_0x0034
            if (r11 == 0) goto L_0x0040
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass001.A1K(r12, r0, r2, r1)
            java.lang.String r0 = ", expected=null"
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x0034:
            if (r11 != 0) goto L_0x0040
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass001.A1K(r12, r0, r2, r1)
            java.lang.String r0 = ", actual=null"
            goto L_0x002f
        L_0x0040:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            X.AnonymousClass001.A1K(r12, r0, r2, r1)
            java.lang.String r0 = ", !="
            goto L_0x002f
        L_0x004a:
            java.lang.Class r2 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r2 == r0) goto L_0x00a3
            boolean r0 = r10 instanceof X.C30341mI
            if (r0 == 0) goto L_0x009b
            boolean r0 = r11 instanceof X.C30341mI
            if (r0 == 0) goto L_0x009b
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot compare objects of different types "
            r5.append(r0)
            r4 = r10
            X.1mI r4 = (X.C30341mI) r4
            r3 = r11
            X.1mI r3 = (X.C30341mI) r3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "{before action : "
            r2.append(r0)
            int r0 = r4.A00
            r2.append(r0)
            java.lang.String r1 = " ,className: "
            X.C18260x0.A1T(r2, r1, r4)
            java.lang.String r0 = " , after action: "
            r2.append(r0)
            int r0 = r3.A00
            r2.append(r0)
            X.C18260x0.A1T(r2, r1, r3)
            java.lang.String r0 = " }"
            X.C18270x1.A1C(r0, r2, r5)
            java.lang.String r0 = r5.toString()
            java.util.List r4 = java.util.Collections.singletonList(r0)
            goto L_0x000e
        L_0x009b:
            java.lang.String r0 = "cannot compare objects of different types"
            java.util.List r4 = java.util.Collections.singletonList(r0)
            goto L_0x000e
        L_0x00a3:
            boolean r0 = r10 instanceof X.C58932w3
            if (r0 == 0) goto L_0x014f
            r6 = r10
            X.2w3 r6 = (X.C58932w3) r6
            r5 = r11
            X.2w3 r5 = (X.C58932w3) r5
            if (r6 == r5) goto L_0x1a4b
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r0 = "templateInfo.templateButtons.buttonId"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x00c9
            long r2 = r6.A00
            long r0 = r5.A00
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x00c9
            java.lang.String r0 = "buttonId"
            r4.add(r0)
        L_0x00c9:
            java.lang.String r0 = "templateInfo.templateButtons.selectedIndex"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x00de
            int r1 = r6.A05
            int r0 = r5.A05
            if (r1 == r0) goto L_0x00de
            java.lang.String r0 = "selectedIndex"
            r4.add(r0)
        L_0x00de:
            java.lang.String r0 = "templateInfo.templateButtons.selectedCarouselCardIndex"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x00f3
            java.lang.Integer r1 = r6.A07
            java.lang.Integer r0 = r5.A07
            if (r1 == r0) goto L_0x00f3
            java.lang.String r0 = "selectedCarouselCardIndex"
            r4.add(r0)
        L_0x00f3:
            java.lang.String r0 = "templateInfo.templateButtons.used"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x0108
            boolean r1 = r6.A04
            boolean r0 = r5.A04
            if (r1 == r0) goto L_0x0108
            java.lang.String r0 = "used"
            r4.add(r0)
        L_0x0108:
            java.lang.String r0 = "templateInfo.templateButtons.type"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x011d
            int r1 = r6.A06
            int r0 = r5.A06
            if (r1 == r0) goto L_0x011d
            java.lang.String r0 = "type"
            r4.add(r0)
        L_0x011d:
            java.lang.String r0 = "templateInfo.templateButtons.buttonText"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r1 = r6.A08
            java.lang.String r0 = r5.A08
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "buttonText"
            r4.add(r0)
        L_0x0135:
            java.lang.String r0 = "templateInfo.templateButtons.extraData"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = r6.A01
            java.lang.String r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "extraData"
            r4.add(r0)
            goto L_0x000e
        L_0x014f:
            boolean r0 = r10 instanceof X.C47142cm
            if (r0 == 0) goto L_0x019b
            r5 = r10
            X.2cm r5 = (X.C47142cm) r5
            r3 = r11
            X.2cm r3 = (X.C47142cm) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r2 = "content"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0174
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r3.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0174
            r4.add(r2)
        L_0x0174:
            java.lang.String r2 = "templateButtons"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0184
            java.util.List r1 = r5.A06
            java.util.List r0 = r3.A06
            A0U(r1, r0, r2, r4)
        L_0x0184:
            java.lang.String r1 = "footer"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A03
            java.lang.String r2 = r3.A03
        L_0x0190:
            boolean r0 = X.C107575bX.A0G(r0, r2)
        L_0x0194:
            if (r0 != 0) goto L_0x000e
        L_0x0196:
            r4.add(r1)
            goto L_0x000e
        L_0x019b:
            boolean r0 = r10 instanceof X.C42392Nx
            if (r0 == 0) goto L_0x01df
            r5 = r10
            X.2Nx r5 = (X.C42392Nx) r5
            r3 = r11
            X.2Nx r3 = (X.C42392Nx) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r2 = "srcOrDst"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x01bd
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x01bd
            r4.add(r2)
        L_0x01bd:
            java.lang.String r2 = "splitAmount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x01cd
            X.39Q r1 = r5.A02
            X.39Q r0 = r3.A02
            A0U(r1, r0, r2, r4)
        L_0x01cd:
            java.lang.String r1 = "method"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.7yw r0 = r5.A01
            X.7yw r2 = r3.A01
        L_0x01da:
            boolean r0 = X.AnonymousClass75J.A00(r0, r2)
            goto L_0x0194
        L_0x01df:
            boolean r0 = r10 instanceof X.C624034w
            if (r0 == 0) goto L_0x038e
            r6 = r10
            X.34w r6 = (X.C624034w) r6
            r5 = r11
            X.34w r5 = (X.C624034w) r5
            if (r6 == r5) goto L_0x1a4b
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.lang.String r2 = "status"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0201
            int r1 = r6.A02
            int r0 = r5.A02
            if (r1 == r0) goto L_0x0201
            r4.add(r2)
        L_0x0201:
            java.lang.String r2 = "type"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0213
            int r1 = r6.A03
            int r0 = r5.A03
            if (r1 == r0) goto L_0x0213
            r4.add(r2)
        L_0x0213:
            java.lang.String r8 = "initTs"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x0226
            long r2 = r6.A05
            long r0 = r5.A05
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0226
            r4.add(r8)
        L_0x0226:
            java.lang.String r8 = "updateTs"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x023a
            long r2 = r6.A06
            long r0 = r5.A06
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x023a
            r4.add(r8)
        L_0x023a:
            java.lang.String r2 = "isInterop"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x024b
            boolean r1 = r6.A0P
            boolean r0 = r5.A0P
            if (r1 == r0) goto L_0x024b
            r4.add(r2)
        L_0x024b:
            java.lang.String r2 = "msgKeyFromMe"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x025d
            boolean r1 = r6.A0Q
            boolean r0 = r5.A0Q
            if (r1 == r0) goto L_0x025d
            r4.add(r2)
        L_0x025d:
            java.lang.String r2 = "isDirty"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0272
            boolean r1 = r6.A0H()
            boolean r0 = r5.A0H()
            if (r1 == r0) goto L_0x0272
            r4.add(r2)
        L_0x0272:
            java.lang.String r2 = "version"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0284
            int r1 = r6.A04
            int r0 = r5.A04
            if (r1 == r0) goto L_0x0284
            r4.add(r2)
        L_0x0284:
            java.lang.String r2 = "id"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0293
            java.lang.String r1 = r6.A0K
            java.lang.String r0 = r5.A0K
            A0T(r1, r0, r2, r4)
        L_0x0293:
            java.lang.String r2 = "errorCode"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x02a2
            java.lang.String r1 = r6.A0J
            java.lang.String r0 = r5.A0J
            A0T(r1, r0, r2, r4)
        L_0x02a2:
            java.lang.String r2 = "credentialId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x02b1
            java.lang.String r1 = r6.A0H
            java.lang.String r0 = r5.A0H
            A0T(r1, r0, r2, r4)
        L_0x02b1:
            java.lang.String r2 = "bankTransactionId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x02c0
            java.lang.String r1 = r6.A0F
            java.lang.String r0 = r5.A0F
            A0T(r1, r0, r2, r4)
        L_0x02c0:
            java.lang.String r2 = "senderJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x02d0
            com.whatsapp.jid.UserJid r1 = r6.A0E
            com.whatsapp.jid.UserJid r0 = r5.A0E
            A0U(r1, r0, r2, r4)
        L_0x02d0:
            java.lang.String r2 = "receiverJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x02e0
            com.whatsapp.jid.UserJid r1 = r6.A0D
            com.whatsapp.jid.UserJid r0 = r5.A0D
            A0U(r1, r0, r2, r4)
        L_0x02e0:
            java.lang.String r2 = "amount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x02ef
            X.39Q r1 = r6.A08
            X.39Q r0 = r5.A08
            A0U(r1, r0, r2, r4)
        L_0x02ef:
            java.lang.String r2 = "currencyCode"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0304
            java.lang.String r1 = r6.A0I
            java.lang.String r0 = r5.A0I
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0304
            r4.add(r2)
        L_0x0304:
            java.lang.String r2 = "methods"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0314
            java.util.ArrayList r1 = r6.A0N
            java.util.ArrayList r0 = r5.A0N
            A0U(r1, r0, r2, r4)
        L_0x0314:
            java.lang.String r2 = "msgKeyId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0324
            java.lang.String r1 = r6.A0L
            java.lang.String r0 = r5.A0L
            A0T(r1, r0, r2, r4)
        L_0x0324:
            java.lang.String r2 = "msgKeyRemoteJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0334
            X.4uZ r1 = r6.A0C
            X.4uZ r0 = r5.A0C
            A0U(r1, r0, r2, r4)
        L_0x0334:
            java.lang.String r2 = "reqMsgKeyId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0344
            java.lang.String r1 = r6.A0M
            java.lang.String r0 = r5.A0M
            A0T(r1, r0, r2, r4)
        L_0x0344:
            java.lang.String r2 = "countryData"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0353
            X.1S4 r1 = r6.A0A
            X.1S4 r0 = r5.A0A
            A0U(r1, r0, r2, r4)
        L_0x0353:
            java.lang.String r2 = "country"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0368
            java.lang.String r1 = r6.A0G
            java.lang.String r0 = r5.A0G
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0368
            r4.add(r2)
        L_0x0368:
            java.lang.String r2 = "futureData"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0377
            byte[] r1 = r6.A0R
            byte[] r0 = r5.A0R
            A0W(r2, r4, r1, r0)
        L_0x0377:
            java.lang.String r1 = "paymentBackground"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.39R r6 = r6.A05()
            X.39R r0 = r5.A05()
        L_0x0388:
            boolean r0 = X.AnonymousClass75J.A00(r6, r0)
            goto L_0x0194
        L_0x038e:
            boolean r0 = r10 instanceof X.C30701ms
            if (r0 == 0) goto L_0x03fd
            r6 = r10
            X.1ms r6 = (X.C30701ms) r6
            r5 = r11
            X.1ms r5 = (X.C30701ms) r5
            if (r6 == r5) goto L_0x1a4b
            java.util.List r0 = A0F(r6, r5, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r3 = "totalBytes"
            boolean r0 = r13.contains(r3)
            if (r0 != 0) goto L_0x03c2
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x03fb
            long r0 = r6.A02
            java.lang.String r2 = java.lang.Long.toString(r0)
        L_0x03b5:
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x03f9
            long r0 = r5.A02
            java.lang.String r0 = java.lang.Long.toString(r0)
        L_0x03bf:
            A0T(r2, r0, r3, r4)
        L_0x03c2:
            java.lang.String r2 = "callDuration"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x03d3
            int r1 = r6.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x03d3
            r4.add(r2)
        L_0x03d3:
            java.lang.String r8 = "callResult"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x03e8
            int r0 = r6.A01
            long r2 = (long) r0
            int r0 = r5.A01
            long r0 = (long) r0
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x03e8
            r4.add(r8)
        L_0x03e8:
            java.lang.String r1 = "legacyCallLog"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.3ZF r6 = r6.A1v()
            X.3ZF r0 = r5.A1v()
            goto L_0x0388
        L_0x03f9:
            r0 = 0
            goto L_0x03bf
        L_0x03fb:
            r2 = 0
            goto L_0x03b5
        L_0x03fd:
            boolean r0 = r10 instanceof X.C30691mr
            if (r0 == 0) goto L_0x0438
            r5 = r10
            X.1mr r5 = (X.C30691mr) r5
            r3 = r11
            X.1mr r3 = (X.C30691mr) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.List r0 = A0F(r5, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "isVideoCall"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0426
            boolean r1 = r5.A20()
            boolean r0 = r3.A20()
            if (r1 == r0) goto L_0x0426
            r4.add(r2)
        L_0x0426:
            java.lang.String r1 = "legacyCallLog"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.3ZF r6 = r5.A1v()
            X.3ZF r0 = r3.A1v()
            goto L_0x0388
        L_0x0438:
            boolean r0 = r10 instanceof X.C30841nI
            if (r0 == 0) goto L_0x0467
            r2 = r10
            X.1nI r2 = (X.C30841nI) r2
            r3 = r11
            X.1nI r3 = (X.C30841nI) r3
            if (r2 == r3) goto L_0x1a4b
            java.util.List r0 = A0J(r2, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "syncdKeyIds"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.Set r0 = r2.A00
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            java.util.Set r0 = r3.A00
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            boolean r0 = r2.equals(r0)
            goto L_0x0194
        L_0x0467:
            boolean r0 = r10 instanceof X.C30851nJ
            if (r0 == 0) goto L_0x0491
            r6 = r10
            X.1nJ r6 = (X.C30851nJ) r6
            r5 = r11
            X.1nJ r5 = (X.C30851nJ) r5
            java.lang.String r3 = "syncdKeys"
            if (r6 == r5) goto L_0x1a4b
            java.util.List r0 = A0J(r6, r5, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "isNewlyGeneratedKey"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x18ed
            boolean r1 = r6.A01
            boolean r0 = r5.A01
            if (r1 == r0) goto L_0x18ed
            r4.add(r2)
            goto L_0x18ed
        L_0x0491:
            boolean r0 = r10 instanceof X.C30861nK
            if (r0 == 0) goto L_0x04cf
            r3 = r10
            X.1nK r3 = (X.C30861nK) r3
            r6 = r11
            X.1nK r6 = (X.C30861nK) r6
            if (r3 == r6) goto L_0x1a4b
            java.util.List r0 = A0J(r3, r6, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "collectionNames"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x04ba
            java.util.Set r1 = r3.A01
            java.util.Set r0 = r6.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x04ba
            r4.add(r2)
        L_0x04ba:
            java.lang.String r5 = "fatalTimestamp"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x000e
            long r2 = r3.A00
            long r0 = r6.A00
        L_0x04c6:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x04c8:
            if (r6 == 0) goto L_0x000e
        L_0x04ca:
            r4.add(r5)
            goto L_0x000e
        L_0x04cf:
            boolean r0 = r10 instanceof X.AnonymousClass1nO
            if (r0 == 0) goto L_0x063f
            r3 = r10
            X.1nO r3 = (X.AnonymousClass1nO) r3
            r2 = r11
            X.1nO r2 = (X.AnonymousClass1nO) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0J(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r8 = "fileLength"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x04f6
            long r5 = r3.A05
            long r0 = r2.A05
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x04f6
            r4.add(r8)
        L_0x04f6:
            java.lang.String r5 = "chunkOrder"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x0507
            int r1 = r3.A00
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0507
            r4.add(r5)
        L_0x0507:
            java.lang.String r5 = "progress"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x0519
            int r1 = r3.A01
            int r0 = r2.A01
            if (r1 == r0) goto L_0x0519
            r4.add(r5)
        L_0x0519:
            java.lang.String r5 = "syncType"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x052b
            int r1 = r3.A03
            int r0 = r2.A03
            if (r1 == r0) goto L_0x052b
            r4.add(r5)
        L_0x052b:
            java.lang.String r5 = "reties"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x053d
            int r1 = r3.A02
            int r0 = r2.A02
            if (r1 == r0) goto L_0x053d
            r4.add(r5)
        L_0x053d:
            java.lang.String r8 = "latestMsgId"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x0550
            long r5 = r3.A06
            long r0 = r2.A06
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0550
            r4.add(r8)
        L_0x0550:
            java.lang.String r7 = "oldestMsgId"
            boolean r0 = r13.contains(r7)
            if (r0 != 0) goto L_0x0564
            long r5 = r3.A08
            long r0 = r2.A08
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0564
            r4.add(r7)
        L_0x0564:
            java.lang.String r0 = "oldestMsgIdToSync"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x0578
            long r5 = r3.A09
            long r0 = r2.A09
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0578
            r4.add(r7)
        L_0x0578:
            java.lang.String r5 = "directPath"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x0587
            java.lang.String r1 = r3.A0B
            java.lang.String r0 = r2.A0B
            A0T(r1, r0, r5, r4)
        L_0x0587:
            java.lang.String r5 = "mediaHash"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x0596
            java.lang.String r1 = r3.A0D
            java.lang.String r0 = r2.A0D
            A0T(r1, r0, r5, r4)
        L_0x0596:
            java.lang.String r5 = "mediaEncHash"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x05a5
            java.lang.String r1 = r3.A0C
            java.lang.String r0 = r2.A0C
            A0T(r1, r0, r5, r4)
        L_0x05a5:
            java.lang.String r5 = "mediaKeyData"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x05b4
            byte[] r1 = r3.A0J
            byte[] r0 = r2.A0J
            A0W(r5, r4, r1, r0)
        L_0x05b4:
            java.lang.String r5 = "originalMessageId"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x05c4
            java.lang.String r1 = r3.A0E
            java.lang.String r0 = r2.A0E
            A0T(r1, r0, r5, r4)
        L_0x05c4:
            java.lang.String r8 = "chatsCount"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x05d7
            long r5 = r3.A04
            long r0 = r2.A04
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x05d7
            r4.add(r8)
        L_0x05d7:
            java.lang.String r8 = "messagesCount"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x05eb
            long r5 = r3.A07
            long r0 = r2.A07
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x05eb
            r4.add(r8)
        L_0x05eb:
            java.lang.String r5 = "sessionId"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x05fb
            java.lang.String r1 = r3.A0H
            java.lang.String r0 = r2.A0H
            A0T(r1, r0, r5, r4)
        L_0x05fb:
            java.lang.String r5 = "regAttemptId"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x060b
            java.lang.String r1 = r3.A0G
            java.lang.String r0 = r2.A0G
            A0T(r1, r0, r5, r4)
        L_0x060b:
            java.lang.String r8 = "oldestMsgInChunkTimestamp"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x061f
            long r5 = r3.A0A
            long r0 = r2.A0A
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x061f
            r4.add(r8)
        L_0x061f:
            java.lang.String r5 = "inlinePayload"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x062e
            byte[] r1 = r3.A0I
            byte[] r0 = r2.A0I
            A0W(r5, r4, r1, r0)
        L_0x062e:
            java.lang.String r1 = "peerDataRequestSessionId"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r3 = r3.A0F
            java.lang.String r0 = r2.A0F
        L_0x063b:
            if (r3 == r0) goto L_0x000e
            goto L_0x0196
        L_0x063f:
            boolean r0 = r10 instanceof X.C30891nN
            if (r0 == 0) goto L_0x0677
            r5 = r10
            X.1nN r5 = (X.C30891nN) r5
            r3 = r11
            X.1nN r3 = (X.C30891nN) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.List r0 = A0J(r5, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "requestType"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0665
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0665
            r4.add(r2)
        L_0x0665:
            java.lang.String r1 = "dataIdentifiers"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.Set r2 = r5.A01
            java.util.Set r0 = r3.A01
            boolean r0 = r2.equals(r0)
            goto L_0x0194
        L_0x0677:
            boolean r0 = r10 instanceof X.AnonymousClass1OS
            if (r0 == 0) goto L_0x069a
            r2 = r10
            X.1OS r2 = (X.AnonymousClass1OS) r2
            r3 = r11
            X.1OS r3 = (X.AnonymousClass1OS) r3
            if (r2 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A07(r2, r3, r13)
            java.lang.String r1 = "stickerDownloadResult"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.Map r2 = r2.A00
            java.util.Map r0 = r3.A00
            boolean r0 = r2.equals(r0)
            goto L_0x0194
        L_0x069a:
            boolean r0 = r10 instanceof X.AnonymousClass1OR
            if (r0 == 0) goto L_0x06bc
            r2 = r10
            X.1OR r2 = (X.AnonymousClass1OR) r2
            r3 = r11
            X.1OR r3 = (X.AnonymousClass1OR) r3
            if (r2 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A07(r2, r3, r13)
            java.lang.String r1 = "linkPreviewResult"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.Map r2 = r2.A00
            java.util.Map r0 = r3.A00
            boolean r0 = r2.equals(r0)
            goto L_0x0194
        L_0x06bc:
            boolean r0 = r10 instanceof X.AnonymousClass1OQ
            if (r0 == 0) goto L_0x06df
            r2 = r10
            X.1OQ r2 = (X.AnonymousClass1OQ) r2
            r3 = r11
            X.1OQ r3 = (X.AnonymousClass1OQ) r3
            if (r2 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A07(r2, r3, r13)
            java.lang.String r1 = "peerDataOperationResults"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.List r2 = r2.A00
            java.util.List r0 = r3.A00
            boolean r0 = r2.equals(r0)
            goto L_0x0194
        L_0x06df:
            boolean r0 = r10 instanceof X.AnonymousClass1OP
            if (r0 == 0) goto L_0x0706
            r2 = r10
            X.1nL r2 = (X.C30871nL) r2
            r3 = r11
            X.1nL r3 = (X.C30871nL) r3
            if (r2 == r3) goto L_0x1a4b
            java.util.List r0 = A0J(r2, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "requestStanzaId"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r2 = r2.A00
            java.lang.String r0 = r3.A00
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            goto L_0x0194
        L_0x0706:
            boolean r0 = r10 instanceof X.C30881nM
            if (r0 == 0) goto L_0x072b
            r3 = r10
            X.1nM r3 = (X.C30881nM) r3
            r2 = r11
            X.1nM r2 = (X.C30881nM) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0J(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "securityNotificationEnabled"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            boolean r0 = r3.A00
            boolean r2 = r2.A00
        L_0x0727:
            if (r0 == r2) goto L_0x000e
            goto L_0x0196
        L_0x072b:
            boolean r0 = r10 instanceof X.C30761my
            if (r0 == 0) goto L_0x0768
            r5 = r10
            X.1my r5 = (X.C30761my) r5
            r3 = r11
            X.1my r3 = (X.C30761my) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r5, r3, r13)
            java.lang.String r2 = "businessOwnerJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x074a
            com.whatsapp.jid.UserJid r1 = r5.A00
            com.whatsapp.jid.UserJid r0 = r3.A00
            A0U(r1, r0, r2, r4)
        L_0x074a:
            java.lang.String r2 = "title"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x075a
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r3.A02
            A0T(r1, r0, r2, r4)
        L_0x075a:
            java.lang.String r1 = "description"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A01
            java.lang.String r2 = r3.A01
            goto L_0x0190
        L_0x0768:
            boolean r0 = r10 instanceof X.C30821nD
            if (r0 == 0) goto L_0x0836
            r5 = r10
            X.1nD r5 = (X.C30821nD) r5
            r3 = r11
            X.1nD r3 = (X.C30821nD) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r5, r3, r13)
            java.lang.String r2 = "itemCount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0789
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0789
            r4.add(r2)
        L_0x0789:
            java.lang.String r2 = "orderStatus"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x079b
            int r1 = r5.A02
            int r0 = r3.A02
            if (r1 == r0) goto L_0x079b
            r4.add(r2)
        L_0x079b:
            java.lang.String r2 = "orderSurface"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x07ad
            int r1 = r5.A03
            int r0 = r3.A03
            if (r1 == r0) goto L_0x07ad
            r4.add(r2)
        L_0x07ad:
            java.lang.String r2 = "orderId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x07bd
            java.lang.String r1 = r5.A07
            java.lang.String r0 = r3.A07
            A0T(r1, r0, r2, r4)
        L_0x07bd:
            java.lang.String r2 = "orderTitle"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x07cd
            java.lang.String r1 = r5.A08
            java.lang.String r0 = r3.A08
            A0T(r1, r0, r2, r4)
        L_0x07cd:
            java.lang.String r2 = "message"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x07dc
            java.lang.String r1 = r5.A06
            java.lang.String r0 = r3.A06
            A0T(r1, r0, r2, r4)
        L_0x07dc:
            java.lang.String r2 = "sellerJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x07ec
            com.whatsapp.jid.UserJid r1 = r5.A04
            com.whatsapp.jid.UserJid r0 = r3.A04
            A0U(r1, r0, r2, r4)
        L_0x07ec:
            java.lang.String r2 = "token"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x07fc
            java.lang.String r1 = r5.A09
            java.lang.String r0 = r3.A09
            A0T(r1, r0, r2, r4)
        L_0x07fc:
            java.lang.String r2 = "currencyCode"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x080b
            java.lang.String r1 = r5.A05
            java.lang.String r0 = r3.A05
            A0T(r1, r0, r2, r4)
        L_0x080b:
            java.lang.String r2 = "totalAmount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0825
            java.math.BigDecimal r1 = r5.A0A
            java.math.BigDecimal r0 = r3.A0A
            if (r1 == 0) goto L_0x0833
            if (r0 == 0) goto L_0x0822
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L_0x0825
        L_0x0822:
            r4.add(r2)
        L_0x0825:
            java.lang.String r1 = "messageVersion"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r5.A00
            int r2 = r3.A00
            goto L_0x0727
        L_0x0833:
            if (r0 == 0) goto L_0x0825
            goto L_0x0822
        L_0x0836:
            boolean r0 = r10 instanceof X.C30771mz
            if (r0 == 0) goto L_0x091c
            r5 = r10
            X.1mz r5 = (X.C30771mz) r5
            r3 = r11
            X.1mz r3 = (X.C30771mz) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r5, r3, r13)
            java.lang.String r2 = "productImageCount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0858
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0858
            r4.add(r2)
        L_0x0858:
            java.lang.String r2 = "businessOwnerJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0867
            com.whatsapp.jid.UserJid r1 = r5.A01
            com.whatsapp.jid.UserJid r0 = r3.A01
            A0U(r1, r0, r2, r4)
        L_0x0867:
            java.lang.String r2 = "productId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0877
            java.lang.String r1 = r5.A06
            java.lang.String r0 = r3.A06
            A0T(r1, r0, r2, r4)
        L_0x0877:
            java.lang.String r2 = "title"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0887
            java.lang.String r1 = r5.A09
            java.lang.String r0 = r3.A09
            A0T(r1, r0, r2, r4)
        L_0x0887:
            java.lang.String r2 = "body"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0896
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r3.A02
            A0T(r1, r0, r2, r4)
        L_0x0896:
            java.lang.String r2 = "footer"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x08a5
            java.lang.String r1 = r5.A05
            java.lang.String r0 = r3.A05
            A0T(r1, r0, r2, r4)
        L_0x08a5:
            java.lang.String r2 = "description"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x08b4
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r3.A04
            A0T(r1, r0, r2, r4)
        L_0x08b4:
            java.lang.String r2 = "currencyCode"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x08c3
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r3.A03
            A0T(r1, r0, r2, r4)
        L_0x08c3:
            java.lang.String r2 = "priceAmount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x08dd
            java.math.BigDecimal r1 = r5.A0A
            java.math.BigDecimal r0 = r3.A0A
            if (r1 == 0) goto L_0x0919
            if (r0 == 0) goto L_0x08da
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L_0x08dd
        L_0x08da:
            r4.add(r2)
        L_0x08dd:
            java.lang.String r2 = "salePriceAmount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x08f7
            java.math.BigDecimal r1 = r5.A0B
            java.math.BigDecimal r0 = r3.A0B
            if (r1 == 0) goto L_0x0916
            if (r0 == 0) goto L_0x08f4
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L_0x08f7
        L_0x08f4:
            r4.add(r2)
        L_0x08f7:
            java.lang.String r2 = "retailerId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0907
            java.lang.String r1 = r5.A08
            java.lang.String r0 = r3.A08
            A0T(r1, r0, r2, r4)
        L_0x0907:
            java.lang.String r1 = "productUrl"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A07
            java.lang.String r2 = r3.A07
            goto L_0x0190
        L_0x0916:
            if (r0 == 0) goto L_0x08f7
            goto L_0x08f4
        L_0x0919:
            if (r0 == 0) goto L_0x08dd
            goto L_0x08da
        L_0x091c:
            boolean r0 = r10 instanceof X.C30731mv
            if (r0 == 0) goto L_0x093f
            r3 = r10
            X.1mv r3 = (X.C30731mv) r3
            r2 = r11
            X.1mv r2 = (X.C30731mv) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0G(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "templateInfo"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2cm r0 = r3.A00
            X.2cm r2 = r2.A00
            goto L_0x01da
        L_0x093f:
            boolean r0 = r10 instanceof X.C30751mx
            if (r0 == 0) goto L_0x095e
            r3 = r10
            X.1mx r3 = (X.C30751mx) r3
            r2 = r11
            X.1mx r2 = (X.C30751mx) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r3, r2, r13)
            java.lang.String r1 = "templateInfo"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2cm r0 = r3.A00
            X.2cm r2 = r2.A00
            goto L_0x01da
        L_0x095e:
            boolean r0 = r10 instanceof X.AnonymousClass1n0
            if (r0 == 0) goto L_0x097d
            r3 = r10
            X.1n0 r3 = (X.AnonymousClass1n0) r3
            r2 = r11
            X.1n0 r2 = (X.AnonymousClass1n0) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r3, r2, r13)
            java.lang.String r1 = "templateInfo"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2cm r0 = r3.A00
            X.2cm r2 = r2.A00
            goto L_0x01da
        L_0x097d:
            boolean r0 = r10 instanceof X.AnonymousClass1p7
            if (r0 == 0) goto L_0x099c
            r3 = r10
            X.1p7 r3 = (X.AnonymousClass1p7) r3
            r2 = r11
            X.1p7 r2 = (X.AnonymousClass1p7) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r3, r2, r13)
            java.lang.String r1 = "templateInfo"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2cm r0 = r3.A00
            X.2cm r2 = r2.A00
            goto L_0x01da
        L_0x099c:
            boolean r0 = r10 instanceof X.AnonymousClass1n3
            if (r0 == 0) goto L_0x09bb
            r3 = r10
            X.1n3 r3 = (X.AnonymousClass1n3) r3
            r2 = r11
            X.1n3 r2 = (X.AnonymousClass1n3) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r3, r2, r13)
            java.lang.String r1 = "viewState"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x09bb:
            boolean r0 = r10 instanceof X.C31991pD
            if (r0 == 0) goto L_0x09da
            r3 = r10
            X.1pD r3 = (X.C31991pD) r3
            r2 = r11
            X.1pD r2 = (X.C31991pD) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r3, r2, r13)
            java.lang.String r1 = "viewState"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x09da:
            boolean r0 = r10 instanceof X.C31931p6
            if (r0 == 0) goto L_0x09fd
            r3 = r10
            X.1p6 r3 = (X.C31931p6) r3
            r2 = r11
            X.1p6 r2 = (X.C31931p6) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0Q(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "viewState"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x09fd:
            boolean r0 = r10 instanceof X.C30711mt
            if (r0 == 0) goto L_0x0a36
            r6 = r10
            X.1mt r6 = (X.C30711mt) r6
            r5 = r11
            X.1mt r5 = (X.C30711mt) r5
            if (r6 == r5) goto L_0x1a4b
            if (r6 != r5) goto L_0x0a22
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x0a0f:
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r3)
            java.lang.String r1 = "viewState"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r6.A00
            int r2 = r5.A00
            goto L_0x0727
        L_0x0a22:
            java.util.ArrayList r3 = A09(r6, r5, r13)
            java.lang.String r2 = "audioData"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0a0f
            X.2xx r1 = r6.A00
            X.2xx r0 = r5.A00
            A0U(r1, r0, r2, r3)
            goto L_0x0a0f
        L_0x0a36:
            boolean r0 = r10 instanceof X.C30741mw
            if (r0 == 0) goto L_0x0a58
            r3 = r10
            X.1mw r3 = (X.C30741mw) r3
            r2 = r11
            X.1mw r2 = (X.C30741mw) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0G(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "interactiveMessageContent"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.39W r0 = r3.A00
            X.39W r2 = r2.A00
            goto L_0x01da
        L_0x0a58:
            boolean r0 = r10 instanceof X.AnonymousClass1nF
            if (r0 == 0) goto L_0x0a68
            r1 = r10
            X.1nF r1 = (X.AnonymousClass1nF) r1
            r0 = r11
            X.1nF r0 = (X.AnonymousClass1nF) r0
            java.util.List r4 = A0G(r1, r0, r13)
            goto L_0x000e
        L_0x0a68:
            boolean r0 = r10 instanceof X.C30721mu
            if (r0 == 0) goto L_0x0a89
            r1 = r10
            X.1mu r1 = (X.C30721mu) r1
            r3 = r11
            X.1mu r3 = (X.C30721mu) r3
            if (r1 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r1, r3, r13)
            java.lang.String r2 = "audioData"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x000e
            X.2xx r1 = r1.A00
            X.2xx r0 = r3.A00
            A0U(r1, r0, r2, r4)
            goto L_0x000e
        L_0x0a89:
            boolean r0 = r10 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0ad4
            r5 = r10
            X.1nE r5 = (X.AnonymousClass1nE) r5
            r3 = r11
            X.1nE r3 = (X.AnonymousClass1nE) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r5, r3, r13)
            java.lang.String r2 = "isAnimated"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0aaa
            boolean r1 = r5.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x0aaa
            r4.add(r2)
        L_0x0aaa:
            java.lang.String r2 = "isAiSticker"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0abf
            boolean r1 = r5.A23()
            boolean r0 = r3.A23()
            if (r1 == r0) goto L_0x0abf
            r4.add(r2)
        L_0x0abf:
            java.lang.String r1 = "stickerFlags"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            boolean r2 = r5.A24()
            boolean r0 = r3.A24()
            if (r2 == r0) goto L_0x000e
            goto L_0x0196
        L_0x0ad4:
            boolean r0 = r10 instanceof X.C30421mQ
            if (r0 == 0) goto L_0x0b0a
            r5 = r10
            X.1mQ r5 = (X.C30421mQ) r5
            r3 = r11
            X.1mQ r3 = (X.C30421mQ) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r5, r3, r13)
            java.lang.String r2 = "displayName"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0af3
            java.lang.String r1 = r5.A00
            java.lang.String r0 = r3.A00
            A0T(r1, r0, r2, r4)
        L_0x0af3:
            java.lang.String r1 = "vcard"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r2 = r5.A1v()
            java.lang.String r0 = r3.A1v()
            boolean r0 = X.C107575bX.A0G(r2, r0)
            goto L_0x0194
        L_0x0b0a:
            boolean r0 = r10 instanceof X.C30411mP
            if (r0 == 0) goto L_0x0b3f
            r5 = r10
            X.1mP r5 = (X.C30411mP) r5
            r3 = r11
            X.1mP r3 = (X.C30411mP) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r5, r3, r13)
            java.lang.String r2 = "displayName"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0b29
            java.lang.String r1 = r5.A00
            java.lang.String r0 = r3.A00
            A0T(r1, r0, r2, r4)
        L_0x0b29:
            java.lang.String r1 = "contacts"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.List r2 = r5.A1v()
            java.util.List r0 = r3.A1v()
            boolean r0 = X.AnonymousClass367.A04(r2, r0)
            goto L_0x0194
        L_0x0b3f:
            boolean r0 = r10 instanceof X.C30311mF
            if (r0 == 0) goto L_0x0b5d
            r3 = r10
            X.1mF r3 = (X.C30311mF) r3
            r2 = r11
            X.1mF r2 = (X.C30311mF) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r3, r2, r13)
            java.lang.String r1 = "ephemeralSettingDuration"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x0b5d:
            boolean r0 = r10 instanceof X.C30521ma
            if (r0 == 0) goto L_0x0ba0
            r8 = r10
            X.1ma r8 = (X.C30521ma) r8
            r7 = r11
            X.1ma r7 = (X.C30521ma) r7
            if (r8 == r7) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r8, r7, r13)
            java.lang.String r2 = "ephemeralSettingDuration"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0b7e
            int r1 = r8.A00
            int r0 = r7.A00
            if (r1 == r0) goto L_0x0b7e
            r4.add(r2)
        L_0x0b7e:
            java.lang.String r6 = "ephemeralSettingTimestamp"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x0b91
            long r2 = r8.A01
            long r0 = r7.A01
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0b91
            r4.add(r6)
        L_0x0b91:
            java.lang.String r1 = "recipient"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            com.whatsapp.jid.DeviceJid r3 = r8.A02
            com.whatsapp.jid.DeviceJid r0 = r7.A02
            goto L_0x063b
        L_0x0ba0:
            boolean r0 = r10 instanceof X.C30351mJ
            if (r0 == 0) goto L_0x0be5
            r5 = r10
            X.1mJ r5 = (X.C30351mJ) r5
            r3 = r11
            X.1mJ r3 = (X.C30351mJ) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r5, r3, r13)
            java.lang.String r2 = "version"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0bc2
            int r1 = r5.A01
            int r0 = r3.A01
            if (r1 == r0) goto L_0x0bc2
            r4.add(r2)
        L_0x0bc2:
            java.lang.String r2 = "futureMessageType"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0bd3
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0bd3
            r4.add(r2)
        L_0x0bd3:
            java.lang.String r1 = "futureProofStanza"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            byte[] r2 = r5.A02
            byte[] r0 = r3.A02
            boolean r0 = java.util.Arrays.equals(r2, r0)
            goto L_0x0194
        L_0x0be5:
            boolean r0 = r10 instanceof X.C30391mN
            if (r0 == 0) goto L_0x0c72
            r6 = r10
            X.1mN r6 = (X.C30391mN) r6
            r5 = r11
            X.1mN r5 = (X.C30391mN) r5
            if (r6 == r5) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r6, r5, r13)
            java.lang.String r8 = "expiration"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x0c08
            long r2 = r6.A01
            long r0 = r5.A01
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0c08
            r4.add(r8)
        L_0x0c08:
            java.lang.String r2 = "expired"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0c19
            boolean r1 = r6.A07
            boolean r0 = r5.A07
            if (r1 == r0) goto L_0x0c19
            r4.add(r2)
        L_0x0c19:
            java.lang.String r2 = "adminJidObject"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0c28
            com.whatsapp.jid.UserJid r1 = r6.A03
            com.whatsapp.jid.UserJid r0 = r5.A03
            A0U(r1, r0, r2, r4)
        L_0x0c28:
            java.lang.String r2 = "groupJidObject"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0c37
            X.1fJ r1 = r6.A02
            X.1fJ r0 = r5.A02
            A0U(r1, r0, r2, r4)
        L_0x0c37:
            java.lang.String r2 = "groupName"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0c46
            java.lang.String r1 = r6.A05
            java.lang.String r0 = r5.A05
            A0T(r1, r0, r2, r4)
        L_0x0c46:
            java.lang.String r2 = "inviteHash"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0c55
            java.lang.String r1 = r6.A06
            java.lang.String r0 = r5.A06
            A0T(r1, r0, r2, r4)
        L_0x0c55:
            java.lang.String r2 = "caption"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0c64
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r5.A04
            A0T(r1, r0, r2, r4)
        L_0x0c64:
            java.lang.String r1 = "groupType"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r6.A00
            int r2 = r5.A00
            goto L_0x0727
        L_0x0c72:
            boolean r0 = r10 instanceof X.C30381mM
            if (r0 == 0) goto L_0x0cc3
            r6 = r10
            X.1mM r6 = (X.C30381mM) r6
            r5 = r11
            X.1mM r5 = (X.C30381mM) r5
            if (r6 == r5) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r6, r5, r13)
            java.lang.String r8 = "expirationTimestamp"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x0c95
            long r2 = r6.A00
            long r0 = r5.A00
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0c95
            r4.add(r8)
        L_0x0c95:
            java.lang.String r2 = "newsletterJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0ca5
            X.4uY r1 = r6.A01
            X.4uY r0 = r5.A01
            A0U(r1, r0, r2, r4)
        L_0x0ca5:
            java.lang.String r2 = "newsletterName"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0cb5
            java.lang.String r1 = r6.A03
            java.lang.String r0 = r5.A03
            A0T(r1, r0, r2, r4)
        L_0x0cb5:
            java.lang.String r1 = "caption"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r6.A02
            java.lang.String r2 = r5.A02
            goto L_0x0190
        L_0x0cc3:
            boolean r0 = r10 instanceof X.C31521oQ
            if (r0 == 0) goto L_0x0d01
            r5 = r10
            X.1oQ r5 = (X.C31521oQ) r5
            r3 = r11
            X.1oQ r3 = (X.C31521oQ) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "ephemeralDuration"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0ce4
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0ce4
            r4.add(r2)
        L_0x0ce4:
            java.lang.String r2 = "groupParticipants"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0cf3
            X.33k r1 = r5.A02
            X.33k r0 = r3.A02
            A0U(r1, r0, r2, r4)
        L_0x0cf3:
            java.lang.String r1 = "isCurrentUserJoined"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r5.A00
            int r2 = r3.A00
            goto L_0x0727
        L_0x0d01:
            boolean r0 = r10 instanceof X.C30801n8
            if (r0 == 0) goto L_0x0d58
            r6 = r10
            X.1n8 r6 = (X.C30801n8) r6
            r5 = r11
            X.1n8 r5 = (X.C30801n8) r5
            if (r6 == r5) goto L_0x1a4b
            java.util.List r0 = A0H(r6, r5, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "shareDuration"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0d27
            int r1 = r6.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0d27
            r4.add(r2)
        L_0x0d27:
            java.lang.String r8 = "sequenceNumber"
            boolean r0 = r13.contains(r8)
            if (r0 != 0) goto L_0x0d3b
            long r2 = r6.A01
            long r0 = r5.A01
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0d3b
            r4.add(r8)
        L_0x0d3b:
            java.lang.String r2 = "caption"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0d4a
            java.lang.String r1 = r6.A03
            java.lang.String r0 = r5.A03
            A0T(r1, r0, r2, r4)
        L_0x0d4a:
            java.lang.String r1 = "finalLocation"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2pX r0 = r6.A02
            X.2pX r2 = r5.A02
            goto L_0x01da
        L_0x0d58:
            boolean r0 = r10 instanceof X.C30981nY
            if (r0 == 0) goto L_0x0d7b
            r3 = r10
            X.1nY r3 = (X.C30981nY) r3
            r2 = r11
            X.1nY r2 = (X.C30981nY) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0M(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "templateInfo"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2cm r0 = r3.A00
            X.2cm r2 = r2.A00
            goto L_0x01da
        L_0x0d7b:
            boolean r0 = r10 instanceof X.C30991nZ
            if (r0 == 0) goto L_0x0d9d
            r3 = r10
            X.1nZ r3 = (X.C30991nZ) r3
            r2 = r11
            X.1nZ r2 = (X.C30991nZ) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0M(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "interactiveMessageContent"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.39W r0 = r3.A00
            X.39W r2 = r2.A00
            goto L_0x01da
        L_0x0d9d:
            boolean r0 = r10 instanceof X.AnonymousClass1n9
            if (r0 == 0) goto L_0x0dad
            r1 = r10
            X.1n9 r1 = (X.AnonymousClass1n9) r1
            r0 = r11
            X.1n9 r0 = (X.AnonymousClass1n9) r0
            java.util.List r4 = A0M(r1, r0, r13)
            goto L_0x000e
        L_0x0dad:
            boolean r0 = r10 instanceof X.C30791n7
            if (r0 == 0) goto L_0x0e55
            r5 = r10
            X.1n7 r5 = (X.C30791n7) r5
            r3 = r11
            X.1n7 r3 = (X.C30791n7) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r5, r3, r13)
            java.lang.String r2 = "multiElementContent"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0dcd
            X.39W r1 = r5.A00
            X.39W r0 = r3.A00
            A0U(r1, r0, r2, r4)
        L_0x0dcd:
            java.lang.String r1 = "carouselCardMessages"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            boolean r0 = X.AnonymousClass36V.A07(r5)
            if (r0 == 0) goto L_0x000e
            boolean r0 = X.AnonymousClass36V.A07(r3)
            if (r0 == 0) goto L_0x000e
            java.util.List r2 = r5.A01
            if (r2 == 0) goto L_0x0196
            java.util.List r0 = r3.A01
            if (r0 == 0) goto L_0x0196
            int r2 = r2.size()
            java.util.List r0 = r3.A01
            int r0 = r0.size()
            if (r2 != r0) goto L_0x0196
            r6 = 0
        L_0x0df6:
            java.util.List r0 = r5.A01
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x000e
            java.util.List r0 = r5.A01
            X.34x r1 = X.C18320x8.A0R(r0, r6)
            java.util.List r0 = r3.A01
            X.34x r8 = X.C18320x8.A0R(r0, r6)
            boolean r0 = r1 instanceof X.AnonymousClass1n1
            if (r0 == 0) goto L_0x0e2d
            X.1n1 r1 = (X.AnonymousClass1n1) r1
            X.1n1 r8 = (X.AnonymousClass1n1) r8
            if (r1 == r8) goto L_0x0e4b
            java.util.ArrayList r7 = A09(r1, r8, r13)
            java.lang.String r2 = "interactiveMessageContent"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0e27
            X.39W r1 = r1.A00
            X.39W r0 = r8.A00
            A0U(r1, r0, r2, r7)
        L_0x0e27:
            r4.addAll(r7)
            int r6 = r6 + 1
            goto L_0x0df6
        L_0x0e2d:
            boolean r0 = r1 instanceof X.C31941p8
            if (r0 == 0) goto L_0x0e50
            X.1p8 r1 = (X.C31941p8) r1
            X.1p8 r8 = (X.C31941p8) r8
            if (r1 == r8) goto L_0x0e4b
            java.util.ArrayList r7 = A09(r1, r8, r13)
            java.lang.String r2 = "interactiveMessageContent"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0e27
            X.39W r1 = r1.A00
            X.39W r0 = r8.A00
            A0U(r1, r0, r2, r7)
            goto L_0x0e27
        L_0x0e4b:
            java.util.List r7 = java.util.Collections.emptyList()
            goto L_0x0e27
        L_0x0e50:
            java.util.List r7 = A0D(r1, r8, r13)
            goto L_0x0e27
        L_0x0e55:
            boolean r0 = r10 instanceof X.AnonymousClass1n1
            if (r0 == 0) goto L_0x0e76
            r1 = r10
            X.1n1 r1 = (X.AnonymousClass1n1) r1
            r3 = r11
            X.1n1 r3 = (X.AnonymousClass1n1) r3
            if (r1 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r1, r3, r13)
            java.lang.String r2 = "interactiveMessageContent"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x000e
            X.39W r1 = r1.A00
            X.39W r0 = r3.A00
            A0U(r1, r0, r2, r4)
            goto L_0x000e
        L_0x0e76:
            boolean r0 = r10 instanceof X.C31941p8
            if (r0 == 0) goto L_0x0e97
            r1 = r10
            X.1p8 r1 = (X.C31941p8) r1
            r3 = r11
            X.1p8 r3 = (X.C31941p8) r3
            if (r1 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A09(r1, r3, r13)
            java.lang.String r2 = "interactiveMessageContent"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x000e
            X.39W r1 = r1.A00
            X.39W r0 = r3.A00
            A0U(r1, r0, r2, r4)
            goto L_0x000e
        L_0x0e97:
            boolean r0 = r10 instanceof X.C30291mD
            if (r0 == 0) goto L_0x0eb6
            r3 = r10
            X.1mD r3 = (X.C30291mD) r3
            r2 = r11
            X.1mD r2 = (X.C30291mD) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A08(r3, r2, r13)
            java.lang.String r1 = "paymentRequestResponseMessageId"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.A00
            java.lang.String r2 = r2.A00
            goto L_0x0190
        L_0x0eb6:
            boolean r0 = r10 instanceof X.C31901p2
            if (r0 == 0) goto L_0x0ed8
            r3 = r10
            X.1p2 r3 = (X.C31901p2) r3
            r2 = r11
            X.1p2 r2 = (X.C31901p2) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0Q(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "interactiveResponseMessageContent"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.39N r0 = r3.A00
            X.39N r2 = r2.A00
            goto L_0x01da
        L_0x0ed8:
            boolean r0 = r10 instanceof X.C31911p3
            if (r0 == 0) goto L_0x0efb
            r3 = r10
            X.1p3 r3 = (X.C31911p3) r3
            r2 = r11
            X.1p3 r2 = (X.C31911p3) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0Q(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "selectedId"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.A00
            java.lang.String r2 = r2.A00
            goto L_0x0190
        L_0x0efb:
            boolean r0 = r10 instanceof X.C31921p4
            if (r0 == 0) goto L_0x0f40
            r5 = r10
            X.1p4 r5 = (X.C31921p4) r5
            r3 = r11
            X.1p4 r3 = (X.C31921p4) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.List r0 = A0Q(r5, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "selectedIndex"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0f21
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0f21
            r4.add(r2)
        L_0x0f21:
            java.lang.String r2 = "selectedCarouselCardIndex"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0f31
            java.lang.Integer r1 = r5.A01
            java.lang.Integer r0 = r3.A01
            A0U(r1, r0, r2, r4)
        L_0x0f31:
            java.lang.String r1 = "selectedId"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A02
            java.lang.String r2 = r3.A02
            goto L_0x01da
        L_0x0f40:
            boolean r0 = r10 instanceof X.AnonymousClass1p5
            if (r0 == 0) goto L_0x0f63
            r3 = r10
            X.1p5 r3 = (X.AnonymousClass1p5) r3
            r2 = r11
            X.1p5 r2 = (X.AnonymousClass1p5) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0Q(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "templateInfo"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2cm r0 = r3.A00
            X.2cm r2 = r2.A00
            goto L_0x01da
        L_0x0f63:
            boolean r0 = r10 instanceof X.C30481mW
            if (r0 == 0) goto L_0x0f73
            r1 = r10
            X.1mW r1 = (X.C30481mW) r1
            r0 = r11
            X.1mW r0 = (X.C30481mW) r0
            java.util.List r4 = A0Q(r1, r0, r13)
            goto L_0x000e
        L_0x0f73:
            boolean r0 = r10 instanceof X.C30961nV
            if (r0 == 0) goto L_0x0f95
            r3 = r10
            X.1nV r3 = (X.C30961nV) r3
            r2 = r11
            X.1nV r2 = (X.C30961nV) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.List r0 = A0K(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "adminJid"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            com.whatsapp.jid.UserJid r0 = r3.A00
            com.whatsapp.jid.UserJid r2 = r2.A00
            goto L_0x01da
        L_0x0f95:
            boolean r0 = r10 instanceof X.C30971nX
            if (r0 == 0) goto L_0x0fdd
            r5 = r10
            X.1nX r5 = (X.C30971nX) r5
            r3 = r11
            X.1nX r3 = (X.C30971nX) r3
            java.util.List r0 = A0L(r5, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "editType"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0fbe
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            A0U(r1, r0, r2, r4)
        L_0x0fbe:
            java.lang.String r2 = "parentMessageId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x0fce
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r3.A02
            A0U(r1, r0, r2, r4)
        L_0x0fce:
            java.lang.String r1 = "parentMessageSenderJid"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.4uZ r0 = r5.A01
            X.4uZ r2 = r3.A01
            goto L_0x01da
        L_0x0fdd:
            boolean r0 = r10 instanceof X.C30441mS
            if (r0 == 0) goto L_0x0fed
            r1 = r10
            X.1mS r1 = (X.C30441mS) r1
            r0 = r11
            X.1mS r0 = (X.C30441mS) r0
            java.util.List r4 = A0K(r1, r0, r13)
            goto L_0x000e
        L_0x0fed:
            boolean r0 = r10 instanceof X.C31241ny
            if (r0 == 0) goto L_0x100b
            r3 = r10
            X.1ny r3 = (X.C31241ny) r3
            r2 = r11
            X.1ny r2 = (X.C31241ny) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r1 = "isBlocked"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            boolean r0 = r3.A00
            boolean r2 = r2.A00
            goto L_0x0727
        L_0x100b:
            boolean r0 = r10 instanceof X.C31261o0
            if (r0 == 0) goto L_0x103a
            r5 = r10
            X.1o0 r5 = (X.C31261o0) r5
            r3 = r11
            X.1o0 r3 = (X.C31261o0) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "bizOptOutCategory"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x102c
            int r1 = r5.A01
            int r0 = r3.A01
            if (r1 == r0) goto L_0x102c
            r4.add(r2)
        L_0x102c:
            java.lang.String r1 = "bizOptOutAction"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r5.A00
            int r2 = r3.A00
            goto L_0x0727
        L_0x103a:
            boolean r0 = r10 instanceof X.C31291o3
            if (r0 == 0) goto L_0x1069
            r5 = r10
            X.1o3 r5 = (X.C31291o3) r5
            r3 = r11
            X.1o3 r3 = (X.C31291o3) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "deviceAddedCount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x105b
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x105b
            r4.add(r2)
        L_0x105b:
            java.lang.String r1 = "deviceRemovedCount"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r5.A01
            int r2 = r3.A01
            goto L_0x0727
        L_0x1069:
            boolean r0 = r10 instanceof X.C31061ng
            if (r0 != 0) goto L_0x1a3b
            boolean r0 = r10 instanceof X.C31171nr
            if (r0 == 0) goto L_0x108b
            r3 = r10
            X.1nr r3 = (X.C31171nr) r3
            r2 = r11
            X.1nr r2 = (X.C31171nr) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r1 = "ephemeralSettingInSeconds"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x108b:
            boolean r0 = r10 instanceof X.C31161nq
            if (r0 == 0) goto L_0x10a9
            r3 = r10
            X.1nq r3 = (X.C31161nq) r3
            r2 = r11
            X.1nq r2 = (X.C31161nq) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r1 = "ephemeralSettingInSeconds"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x10a9:
            boolean r0 = r10 instanceof X.C31251nz
            if (r0 == 0) goto L_0x10c8
            r3 = r10
            X.1nz r3 = (X.C31251nz) r3
            r2 = r11
            X.1nz r2 = (X.C31251nz) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r1 = "settingDuration"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x10c8:
            boolean r0 = r10 instanceof X.C31591oX
            if (r0 == 0) goto L_0x10e6
            r3 = r10
            X.1oX r3 = (X.C31591oX) r3
            r2 = r11
            X.1oX r2 = (X.C31591oX) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r3, r2, r13)
            java.lang.String r1 = "ephemeralSettingInSecond"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x10e6:
            boolean r0 = r10 instanceof X.C31611oZ
            if (r0 == 0) goto L_0x1119
            r5 = r10
            X.1oZ r5 = (X.C31611oZ) r5
            r3 = r11
            X.1oZ r3 = (X.C31611oZ) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r5, r3, r13)
            java.lang.String r2 = "newSubject"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x110a
            java.lang.String r1 = r5.A1x()
            java.lang.String r0 = r3.A1x()
            A0T(r1, r0, r2, r4)
        L_0x110a:
            java.lang.String r1 = "oldSubject"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A01
            java.lang.String r2 = r3.A01
            goto L_0x0190
        L_0x1119:
            boolean r0 = r10 instanceof X.C31551oT
            if (r0 == 0) goto L_0x1138
            r3 = r10
            X.1oT r3 = (X.C31551oT) r3
            r2 = r11
            X.1oT r2 = (X.C31551oT) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r3, r2, r13)
            java.lang.String r1 = "myGroupRoleWhenModeChanged"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.A00
            java.lang.String r2 = r2.A00
            goto L_0x0190
        L_0x1138:
            boolean r0 = r10 instanceof X.C31601oY
            if (r0 == 0) goto L_0x1157
            r3 = r10
            X.1oY r3 = (X.C31601oY) r3
            r2 = r11
            X.1oY r2 = (X.C31601oY) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r3, r2, r13)
            java.lang.String r1 = "requestMethod"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.A00
            java.lang.String r2 = r2.A00
            goto L_0x0190
        L_0x1157:
            boolean r0 = r10 instanceof X.C31531oR
            if (r0 == 0) goto L_0x11b2
            r3 = r10
            X.1p1 r3 = (X.C31891p1) r3
            r6 = r11
            X.1p1 r6 = (X.C31891p1) r6
            if (r3 == r6) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r3, r6, r13)
            java.lang.String r5 = "requestedByJid"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x118c
            java.util.List r0 = r3.A01
            r2 = 0
            java.lang.Object r1 = r0.get(r2)
            X.C162457s7.A0D(r1)
            java.util.List r0 = r6.A01
            java.lang.Object r0 = r0.get(r2)
            X.C162457s7.A0D(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x118c
            r4.add(r5)
        L_0x118c:
            java.lang.String r0 = "requestedForJids"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x000e
            java.util.List r1 = r3.A01
            int r0 = r1.size()
            r3 = 1
            java.util.List r2 = r1.subList(r3, r0)
            java.util.List r1 = r6.A01
            int r0 = r1.size()
            java.util.List r0 = r1.subList(r3, r0)
            boolean r0 = X.AnonymousClass367.A04(r2, r0)
            if (r0 != 0) goto L_0x000e
            goto L_0x04ca
        L_0x11b2:
            boolean r0 = r10 instanceof X.C31561oU
            if (r0 == 0) goto L_0x11d1
            r3 = r10
            X.1oU r3 = (X.C31561oU) r3
            r2 = r11
            X.1oU r2 = (X.C31561oU) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r3, r2, r13)
            java.lang.String r1 = "parentGroupName"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.A00
            java.lang.String r2 = r2.A00
            goto L_0x01da
        L_0x11d1:
            boolean r0 = r10 instanceof X.C31541oS
            if (r0 == 0) goto L_0x11f8
            r3 = r10
            X.1oS r3 = (X.C31541oS) r3
            r2 = r11
            X.1oS r2 = (X.C31541oS) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r3, r2, r13)
            java.lang.String r1 = "threshold"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0388
        L_0x11f8:
            boolean r0 = r10 instanceof X.C31581oW
            if (r0 == 0) goto L_0x124d
            r5 = r10
            X.1oW r5 = (X.C31581oW) r5
            r3 = r11
            X.1oW r3 = (X.C31581oW) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r5, r3, r13)
            java.lang.String r2 = "totalSubgroupsCount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x121a
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x121a
            r4.add(r2)
        L_0x121a:
            java.lang.String r2 = "subgroups"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x122a
            java.util.Set r1 = r5.A03
            java.util.Set r0 = r3.A03
            A0U(r1, r0, r2, r4)
        L_0x122a:
            java.lang.String r2 = "parentGroupJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x123a
            X.1fJ r1 = r5.A01
            X.1fJ r0 = r3.A01
            A0U(r1, r0, r2, r4)
        L_0x123a:
            java.lang.String r1 = "parentGroupName"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r6 = r5.A1x()
            java.lang.String r0 = r3.A1x()
            goto L_0x0388
        L_0x124d:
            boolean r0 = r10 instanceof X.C31881p0
            if (r0 == 0) goto L_0x126f
            r2 = r10
            X.1p0 r2 = (X.C31881p0) r2
            r3 = r11
            X.1p0 r3 = (X.C31881p0) r3
            if (r2 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r2, r3, r13)
            java.lang.String r1 = "groupNodes"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.List r2 = r2.A00
            java.util.List r0 = r3.A00
            boolean r0 = X.AnonymousClass367.A04(r2, r0)
            goto L_0x0194
        L_0x126f:
            boolean r0 = r10 instanceof X.C31571oV
            if (r0 == 0) goto L_0x12af
            r5 = r10
            X.1oV r5 = (X.C31571oV) r5
            r3 = r11
            X.1oV r3 = (X.C31571oV) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0B(r5, r3, r13)
            java.lang.String r2 = "oldGroupType"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x128f
            java.lang.Integer r1 = r5.A02
            java.lang.Integer r0 = r3.A02
            A0U(r1, r0, r2, r4)
        L_0x128f:
            java.lang.String r2 = "newGroupType"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x12a1
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x12a1
            r4.add(r2)
        L_0x12a1:
            java.lang.String r1 = "linkedParentGroupJid"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            com.whatsapp.jid.GroupJid r0 = r5.A01
            com.whatsapp.jid.GroupJid r2 = r3.A01
            goto L_0x01da
        L_0x12af:
            boolean r0 = r10 instanceof X.C31891p1
            if (r0 == 0) goto L_0x12bf
            r1 = r10
            X.1p1 r1 = (X.C31891p1) r1
            r0 = r11
            X.1p1 r0 = (X.C31891p1) r0
            java.util.List r4 = A0O(r1, r0, r13)
            goto L_0x000e
        L_0x12bf:
            boolean r0 = r10 instanceof X.C31201nu
            if (r0 == 0) goto L_0x12de
            r3 = r10
            X.1nu r3 = (X.C31201nu) r3
            r2 = r11
            X.1nu r2 = (X.C31201nu) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r1 = "verifiedName"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.A00
            java.lang.String r2 = r2.A00
            goto L_0x0190
        L_0x12de:
            boolean r0 = r10 instanceof X.C31211nv
            if (r0 == 0) goto L_0x12fc
            r3 = r10
            X.1nv r3 = (X.C31211nv) r3
            r2 = r11
            X.1nv r2 = (X.C31211nv) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r1 = "businessStateId"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            int r2 = r2.A00
            goto L_0x0727
        L_0x12fc:
            boolean r0 = r10 instanceof X.C31271o1
            if (r0 == 0) goto L_0x132d
            r5 = r10
            X.1o1 r5 = (X.C31271o1) r5
            r3 = r11
            X.1o1 r3 = (X.C31271o1) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "transitionId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x131e
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x131e
            r4.add(r2)
        L_0x131e:
            java.lang.String r1 = "verifiedName"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A01
            java.lang.String r2 = r3.A01
            goto L_0x0190
        L_0x132d:
            boolean r0 = r10 instanceof X.C31341o8
            if (r0 == 0) goto L_0x135c
            r5 = r10
            X.1o8 r5 = (X.C31341o8) r5
            r3 = r11
            X.1o8 r3 = (X.C31341o8) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "oldJid"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x134d
            com.whatsapp.jid.UserJid r1 = r5.A01
            com.whatsapp.jid.UserJid r0 = r3.A01
            A0U(r1, r0, r2, r4)
        L_0x134d:
            java.lang.String r1 = "newJid"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            com.whatsapp.jid.UserJid r0 = r5.A00
            com.whatsapp.jid.UserJid r2 = r3.A00
            goto L_0x01da
        L_0x135c:
            boolean r0 = r10 instanceof X.C31681og
            if (r0 == 0) goto L_0x13bf
            r5 = r10
            X.1og r5 = (X.C31681og) r5
            r3 = r11
            X.1og r3 = (X.C31681og) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.List r0 = A0P(r5, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "millisBeforeExpired"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1382
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x1382
            r4.add(r2)
        L_0x1382:
            java.lang.String r2 = "comaSeparatedWebStubString"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1391
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r3.A02
            A0T(r1, r0, r2, r4)
        L_0x1391:
            java.lang.String r2 = "amountStringValue"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x13a0
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r3.A01
            A0T(r1, r0, r2, r4)
        L_0x13a0:
            java.lang.String r2 = "transferDate"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x13b0
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r3.A04
            A0T(r1, r0, r2, r4)
        L_0x13b0:
            java.lang.String r1 = "paymentSenderDisplayName"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A03
            java.lang.String r2 = r3.A03
            goto L_0x0190
        L_0x13bf:
            boolean r0 = r10 instanceof X.C31671of
            if (r0 == 0) goto L_0x141f
            r5 = r10
            X.1of r5 = (X.C31671of) r5
            r3 = r11
            X.1of r3 = (X.C31671of) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.List r0 = A0P(r5, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "newTransactionInfo"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x13e3
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r3.A03
            A0T(r1, r0, r2, r4)
        L_0x13e3:
            java.lang.String r2 = "comaSeparatedTransactionsData"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x13f2
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r3.A01
            A0T(r1, r0, r2, r4)
        L_0x13f2:
            java.lang.String r2 = "initTimestamp"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1401
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r3.A02
            A0T(r1, r0, r2, r4)
        L_0x1401:
            java.lang.String r2 = "updateTimestamp"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1411
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r3.A04
            A0T(r1, r0, r2, r4)
        L_0x1411:
            java.lang.String r1 = "comaSeparatedAmountData"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A00
            java.lang.String r2 = r3.A00
            goto L_0x0190
        L_0x141f:
            boolean r0 = r10 instanceof X.C31301o4
            if (r0 == 0) goto L_0x144f
            r5 = r10
            X.1o4 r5 = (X.C31301o4) r5
            r3 = r11
            X.1o4 r3 = (X.C31301o4) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "paymentService"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1441
            int r1 = r5.A00
            int r0 = r3.A00
            if (r1 == r0) goto L_0x1441
            r4.add(r2)
        L_0x1441:
            java.lang.String r1 = "inviteUsed"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            boolean r0 = r5.A01
            boolean r2 = r3.A01
            goto L_0x0727
        L_0x144f:
            boolean r0 = r10 instanceof X.C31351o9
            if (r0 == 0) goto L_0x145f
            r1 = r10
            X.1o9 r1 = (X.C31351o9) r1
            r0 = r11
            X.1o9 r0 = (X.C31351o9) r0
            java.util.List r4 = A0P(r1, r0, r13)
            goto L_0x000e
        L_0x145f:
            boolean r0 = r10 instanceof X.C31331o7
            if (r0 == 0) goto L_0x1496
            r5 = r10
            X.1o7 r5 = (X.C31331o7) r5
            r3 = r11
            X.1o7 r3 = (X.C31331o7) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "profilePhotoChange"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x147f
            com.whatsapp.data.ProfilePhotoChange r1 = r5.A00
            com.whatsapp.data.ProfilePhotoChange r0 = r3.A00
            A0U(r1, r0, r2, r4)
        L_0x147f:
            java.lang.String r1 = "newPhotoId"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r2 = r5.A1w()
            java.lang.String r0 = r3.A1w()
            boolean r0 = X.C107575bX.A0G(r2, r0)
            goto L_0x0194
        L_0x1496:
            boolean r0 = r10 instanceof X.C31321o6
            if (r0 == 0) goto L_0x14d4
            r5 = r10
            X.1o6 r5 = (X.C31321o6) r5
            r3 = r11
            X.1o6 r3 = (X.C31321o6) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "isVideoCall"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x14b7
            boolean r1 = r5.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x14b7
            r4.add(r2)
        L_0x14b7:
            java.lang.String r2 = "callId"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x14c6
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r3.A01
            A0T(r1, r0, r2, r4)
        L_0x14c6:
            java.lang.String r1 = "callType"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r5.A00
            int r2 = r3.A00
            goto L_0x0727
        L_0x14d4:
            boolean r0 = r10 instanceof X.C31281o2
            if (r0 == 0) goto L_0x1503
            r5 = r10
            X.1o2 r5 = (X.C31281o2) r5
            r3 = r11
            X.1o2 r3 = (X.C31281o2) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "isUnassignedChat"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x14f5
            boolean r1 = r5.A01
            boolean r0 = r3.A01
            if (r1 == r0) goto L_0x14f5
            r4.add(r2)
        L_0x14f5:
            java.lang.String r1 = "agentName"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A00
            java.lang.String r2 = r3.A00
            goto L_0x0190
        L_0x1503:
            boolean r0 = r10 instanceof X.C30431mR
            if (r0 == 0) goto L_0x1531
            r3 = r10
            X.1mR r3 = (X.C30431mR) r3
            r6 = r11
            X.1mR r6 = (X.C30431mR) r6
            java.util.ArrayList r4 = A08(r3, r6, r13)
            java.lang.String r2 = "paymentService"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1523
            int r1 = r3.A00
            int r0 = r6.A00
            if (r1 == r0) goto L_0x1523
            r4.add(r2)
        L_0x1523:
            java.lang.String r5 = "expirationTimestamp"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x000e
            long r2 = r3.A01
            long r0 = r6.A01
            goto L_0x04c6
        L_0x1531:
            boolean r0 = r10 instanceof X.C30451mT
            if (r0 == 0) goto L_0x15d1
            r3 = r10
            X.1mT r3 = (X.C30451mT) r3
            r5 = r11
            X.1mT r5 = (X.C30451mT) r5
            java.util.ArrayList r4 = A08(r3, r5, r13)
            java.lang.String r2 = "pollName"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x154f
            java.lang.String r1 = r3.A03
            java.lang.String r0 = r5.A03
            A0U(r1, r0, r2, r4)
        L_0x154f:
            java.lang.String r2 = "selectableOptionCount"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1561
            int r1 = r3.A01
            int r0 = r5.A01
            if (r1 == r0) goto L_0x1561
            r4.add(r2)
        L_0x1561:
            java.lang.String r2 = "pollOptions"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1577
            java.util.List r1 = r3.A05
            java.util.List r0 = r5.A05
            boolean r0 = r1.containsAll(r0)
            if (r0 != 0) goto L_0x1577
            r4.add(r2)
        L_0x1577:
            java.lang.String r0 = "pollVotes"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x15b1
            java.util.List r1 = r3.A04
            java.util.List r0 = r5.A04
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 != 0) goto L_0x15b1
            java.util.List r1 = r3.A04
            java.util.List r0 = r5.A04
            if (r1 == 0) goto L_0x159c
            if (r0 == 0) goto L_0x159c
            int r1 = r1.size()
            int r0 = r0.size()
            if (r1 == r0) goto L_0x15b1
        L_0x159c:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "pollVotes "
            r2.append(r0)
            java.util.List r1 = r3.A04
            java.util.List r0 = r5.A04
            java.lang.String r0 = A01(r1, r0)
            X.C18270x1.A1D(r0, r2, r4)
        L_0x15b1:
            java.lang.String r2 = "invalidState"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x15c2
            int r1 = r3.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x15c2
            r4.add(r2)
        L_0x15c2:
            java.lang.String r5 = "pollLoggingId"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x000e
            long r0 = r3.A02
            int r6 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            goto L_0x04c8
        L_0x15d1:
            boolean r0 = r10 instanceof X.C30571mf
            if (r0 == 0) goto L_0x1602
            r3 = r10
            X.1mf r3 = (X.C30571mf) r3
            r6 = r11
            X.1mf r6 = (X.C30571mf) r6
            java.util.List r0 = A0E(r3, r6, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "text"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x15f3
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r6.A01
            A0U(r1, r0, r2, r4)
        L_0x15f3:
            java.lang.String r5 = "senderClientTimestampMs"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x000e
            long r2 = r3.A00
            long r0 = r6.A00
            goto L_0x04c6
        L_0x1602:
            boolean r0 = r10 instanceof X.C30591mh
            if (r0 == 0) goto L_0x1664
            r8 = r10
            X.1mh r8 = (X.C30591mh) r8
            r7 = r11
            X.1mh r7 = (X.C30591mh) r7
            java.util.List r0 = A0E(r8, r7, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "encIv"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1623
            byte[] r1 = r8.A03
            byte[] r0 = r7.A03
            A0W(r2, r4, r1, r0)
        L_0x1623:
            java.lang.String r2 = "encPayload"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1632
            byte[] r1 = r8.A04
            byte[] r0 = r7.A04
            A0W(r2, r4, r1, r0)
        L_0x1632:
            java.lang.String r2 = "e2eMessage"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1641
            byte[] r1 = r8.A02
            byte[] r0 = r7.A02
            A0W(r2, r4, r1, r0)
        L_0x1641:
            java.lang.String r6 = "senderClientTimestampMs"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x1655
            long r2 = r8.A00
            long r0 = r7.A00
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x1655
            r4.add(r6)
        L_0x1655:
            java.lang.String r1 = "pollVoteSelectedOptionSha256s"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.util.List r0 = r8.A01
            java.util.List r2 = r7.A01
            goto L_0x01da
        L_0x1664:
            boolean r0 = r10 instanceof X.C30551md
            if (r0 == 0) goto L_0x16a9
            r8 = r10
            X.1md r8 = (X.C30551md) r8
            r7 = r11
            X.1md r7 = (X.C30551md) r7
            java.util.List r0 = A0E(r8, r7, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "keepInChatState"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1687
            int r1 = r8.A01
            int r0 = r7.A01
            if (r1 == r0) goto L_0x1687
            r4.add(r2)
        L_0x1687:
            java.lang.String r6 = "senderClientTimestampMs"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x169b
            long r2 = r8.A02
            long r0 = r7.A02
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x169b
            r4.add(r6)
        L_0x169b:
            java.lang.String r1 = "keepCount"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r8.A00
            int r2 = r7.A00
            goto L_0x0727
        L_0x16a9:
            boolean r0 = r10 instanceof X.C30561me
            if (r0 == 0) goto L_0x16dc
            r3 = r10
            X.1me r3 = (X.C30561me) r3
            r6 = r11
            X.1me r6 = (X.C30561me) r6
            java.util.List r0 = A0E(r3, r6, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r2 = "pinInChatState"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x16cd
            int r1 = r3.A00
            int r0 = r6.A00
            if (r1 == r0) goto L_0x16cd
            r4.add(r2)
        L_0x16cd:
            java.lang.String r5 = "senderTimestampMs"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x000e
            long r2 = r3.A01
            long r0 = r6.A01
            goto L_0x04c6
        L_0x16dc:
            boolean r0 = r10 instanceof X.C30531mb
            if (r0 != 0) goto L_0x1a2f
            boolean r0 = r10 instanceof X.C30941nT
            if (r0 == 0) goto L_0x170c
            r5 = r10
            X.1nT r5 = (X.C30941nT) r5
            r3 = r11
            X.1nT r3 = (X.C30941nT) r3
            java.util.ArrayList r4 = A08(r5, r3, r13)
            java.lang.String r2 = "groupReplySubject"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x16fd
            java.lang.String r1 = r5.A00
            java.lang.String r0 = r3.A00
            A0U(r1, r0, r2, r4)
        L_0x16fd:
            java.lang.String r1 = "parentGroupJid"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A01
            java.lang.String r2 = r3.A01
            goto L_0x01da
        L_0x170c:
            boolean r0 = r10 instanceof X.AnonymousClass1nW
            if (r0 == 0) goto L_0x174e
            r6 = r10
            X.1nW r6 = (X.AnonymousClass1nW) r6
            r3 = r11
            X.1nW r3 = (X.AnonymousClass1nW) r3
            java.util.List r0 = A0L(r6, r3, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r5 = "scheduledCallEdit"
            boolean r0 = r13.contains(r5)
            if (r0 != 0) goto L_0x000e
            X.1mH r1 = r6.A00
            X.1mH r0 = r3.A00
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 != 0) goto L_0x000e
            java.util.HashSet r2 = X.AnonymousClass002.A0K()
            java.lang.String r0 = "messageDecorator"
            r2.add(r0)
            X.1mH r1 = r6.A00
            if (r1 == 0) goto L_0x04ca
            X.1mH r0 = r3.A00
            if (r0 == 0) goto L_0x04ca
            java.util.List r0 = A0E(r1, r0, r2)
            int r0 = r0.size()
            if (r0 != 0) goto L_0x04ca
            goto L_0x000e
        L_0x174e:
            boolean r0 = r10 instanceof X.C31311o5
            if (r0 == 0) goto L_0x17a2
            r3 = r10
            X.1o5 r3 = (X.C31311o5) r3
            r2 = r11
            X.1o5 r2 = (X.C31311o5) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r6 = "creationMessageRowID"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x1775
            long r0 = r3.A01
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r0 = r2.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            A0U(r5, r0, r6, r4)
        L_0x1775:
            java.lang.String r0 = "callTimestampMs"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x1794
            long r0 = r3.A00
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r0 = r2.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = X.AnonymousClass75J.A00(r5, r0)
            if (r0 != 0) goto L_0x1794
            java.lang.String r0 = "callType"
            r4.add(r0)
        L_0x1794:
            java.lang.String r1 = "callTitle"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r3.A02
            java.lang.String r2 = r2.A02
            goto L_0x01da
        L_0x17a2:
            boolean r0 = r10 instanceof X.C30581mg
            if (r0 == 0) goto L_0x17ca
            r3 = r10
            X.1mg r3 = (X.C30581mg) r3
            r2 = r11
            X.1mg r2 = (X.C30581mg) r2
            java.util.List r0 = A0E(r3, r2, r13)
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r0)
            java.lang.String r1 = "editType"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            int r0 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0388
        L_0x17ca:
            boolean r0 = r10 instanceof X.C31231nx
            if (r0 == 0) goto L_0x1820
            r3 = r10
            X.1nx r3 = (X.C31231nx) r3
            r2 = r11
            X.1nx r2 = (X.C31231nx) r2
            if (r3 == r2) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r3, r2, r13)
            java.lang.String r6 = "originalMessageRowID"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x17f2
            long r0 = r3.A00
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r0 = r2.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            A0U(r5, r0, r6, r4)
        L_0x17f2:
            java.lang.String r6 = "reminderTimestampMs"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x180a
            long r0 = r3.A01
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r0 = r2.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            A0U(r5, r0, r6, r4)
        L_0x180a:
            java.lang.String r1 = "reminderContent"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r6 = r3.A02
            if (r6 == 0) goto L_0x1a51
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x0388
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x1820:
            boolean r0 = r10 instanceof X.C31181ns
            if (r0 == 0) goto L_0x184f
            r5 = r10
            X.1ns r5 = (X.C31181ns) r5
            r3 = r11
            X.1ns r3 = (X.C31181ns) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r2 = "oldUsername"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1840
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r3.A01
            A0U(r1, r0, r2, r4)
        L_0x1840:
            java.lang.String r1 = "newUsername"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = r5.A00
            java.lang.String r2 = r3.A00
            goto L_0x01da
        L_0x184f:
            boolean r0 = r10 instanceof X.C31221nw
            if (r0 == 0) goto L_0x188d
            r5 = r10
            X.1nw r5 = (X.C31221nw) r5
            r3 = r11
            X.1nw r3 = (X.C31221nw) r3
            if (r5 == r3) goto L_0x1a4b
            java.util.ArrayList r4 = A0A(r5, r3, r13)
            java.lang.String r6 = "originalMessageRowID"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x1877
            long r0 = r5.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            A0U(r2, r0, r6, r4)
        L_0x1877:
            java.lang.String r1 = "originalReminderContent"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r6 = r5.A01
            if (r6 == 0) goto L_0x1a56
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x0388
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x188d:
            boolean r0 = r10 instanceof X.C30401mO
            if (r0 == 0) goto L_0x18d0
            r5 = r10
            X.1mO r5 = (X.C30401mO) r5
            r3 = r11
            X.1mO r3 = (X.C30401mO) r3
            java.util.ArrayList r4 = A08(r5, r3, r13)
            java.lang.String r0 = "callLog"
            boolean r0 = r13.contains(r0)
            if (r0 != 0) goto L_0x18c1
            X.3ZF r1 = r5.A01
            X.3ZF r0 = r3.A01
            boolean r0 = X.AnonymousClass75J.A00(r1, r0)
            if (r0 != 0) goto L_0x18c1
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "callLog "
            r2.append(r0)
            X.3ZF r1 = r5.A01
            X.3ZF r0 = r3.A01
            java.lang.String r0 = A01(r1, r0)
            X.C18270x1.A1D(r0, r2, r4)
        L_0x18c1:
            java.lang.String r1 = "ongoingCallStateManager"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2dw r0 = r5.A00
            X.2dw r2 = r3.A00
            goto L_0x01da
        L_0x18d0:
            boolean r0 = r10 instanceof X.C30231m7
            if (r0 == 0) goto L_0x190b
            r3 = r10
            X.1m7 r3 = (X.C30231m7) r3
            r2 = r11
            X.1m7 r2 = (X.C30231m7) r2
            java.util.ArrayList r4 = A08(r3, r2, r13)
            java.lang.String r1 = "session"
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L_0x000e
            X.2h1 r0 = r3.A00
            X.2h1 r2 = r2.A00
            goto L_0x01da
        L_0x18ed:
            boolean r0 = r13.contains(r3)     // Catch:{ 1Sf -> 0x1906 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r1 = r6.A1v()     // Catch:{ 1Sf -> 0x1906 }
            java.util.HashMap r0 = r5.A1v()     // Catch:{ 1Sf -> 0x1906 }
            boolean r0 = r1.equals(r0)     // Catch:{ 1Sf -> 0x1906 }
            if (r0 != 0) goto L_0x000e
            r4.add(r3)     // Catch:{ 1Sf -> 0x1906 }
            goto L_0x000e
        L_0x1906:
            r4.add(r3)
            goto L_0x000e
        L_0x190b:
            boolean r0 = r10 instanceof X.C30341mI
            if (r0 != 0) goto L_0x1a3b
            boolean r0 = r10 instanceof X.C30471mV
            if (r0 == 0) goto L_0x191f
            r1 = r10
            X.1mV r1 = (X.C30471mV) r1
            r0 = r11
            X.1mV r0 = (X.C30471mV) r0
            java.util.List r4 = A0I(r1, r0, r13)
            goto L_0x000e
        L_0x191f:
            boolean r0 = r10 instanceof X.C30601mi
            if (r0 == 0) goto L_0x192f
            r1 = r10
            X.1mi r1 = (X.C30601mi) r1
            r0 = r11
            X.1mi r0 = (X.C30601mi) r0
            java.util.List r4 = A0C(r1, r0, r13)
            goto L_0x000e
        L_0x192f:
            boolean r0 = r10 instanceof X.C30331mH
            if (r0 != 0) goto L_0x1a2f
            boolean r0 = r10 instanceof X.C30461mU
            if (r0 == 0) goto L_0x1a08
            r5 = r10
            X.1mU r5 = (X.C30461mU) r5
            r3 = r11
            X.1mU r3 = (X.C30461mU) r3
            java.util.ArrayList r4 = A08(r5, r3, r13)
            java.lang.String r2 = "name"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1951
            java.lang.String r1 = r5.A04
            java.lang.String r0 = r3.A04
            A0U(r1, r0, r2, r4)
        L_0x1951:
            java.lang.String r2 = "description"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x1960
            java.lang.String r1 = r5.A02
            java.lang.String r0 = r3.A02
            A0U(r1, r0, r2, r4)
        L_0x1960:
            java.lang.String r6 = "startTimeMillis"
            boolean r0 = r13.contains(r6)
            if (r0 != 0) goto L_0x1978
            long r0 = r5.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r3.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            A0U(r2, r0, r6, r4)
        L_0x1978:
            java.lang.String r2 = "isCanceled"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x198f
            boolean r0 = r5.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r3.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            A0U(r1, r0, r2, r4)
        L_0x198f:
            java.lang.String r2 = "joinLink"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x199e
            java.lang.String r1 = r5.A03
            java.lang.String r0 = r3.A03
            A0U(r1, r0, r2, r4)
        L_0x199e:
            java.lang.String r2 = "location"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x19ad
            X.2lS r1 = r5.A01
            X.2lS r0 = r3.A01
            A0U(r1, r0, r2, r4)
        L_0x19ad:
            java.lang.String r2 = "eventResponses"
            boolean r0 = r13.contains(r2)
            if (r0 != 0) goto L_0x000e
            java.util.List r6 = r5.A1v()
            java.util.List r5 = r3.A1v()
            if (r6 != 0) goto L_0x19c3
            if (r5 != 0) goto L_0x1a03
            goto L_0x000e
        L_0x19c3:
            if (r5 == 0) goto L_0x1a03
            int r1 = r5.size()
            int r0 = r6.size()
            if (r1 != r0) goto L_0x1a03
            r3 = 0
        L_0x19d0:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x000e
            java.lang.Object r1 = r6.get(r3)
            X.1mi r1 = (X.C30601mi) r1
            java.lang.Object r0 = r5.get(r3)
            X.1mi r0 = (X.C30601mi) r0
            java.util.List r2 = A0C(r1, r0, r13)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1a00
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "eventResponses["
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "]"
            X.C18270x1.A1D(r0, r1, r4)
            r4.addAll(r2)
        L_0x1a00:
            int r3 = r3 + 1
            goto L_0x19d0
        L_0x1a03:
            r4.add(r2)
            goto L_0x000e
        L_0x1a08:
            boolean r0 = r10 instanceof X.C624134x
            if (r0 == 0) goto L_0x1a18
            r1 = r10
            X.34x r1 = (X.C624134x) r1
            r0 = r11
            X.34x r0 = (X.C624134x) r0
            java.util.List r4 = A0D(r1, r0, r13)
            goto L_0x000e
        L_0x1a18:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot find implementation to compare these objects of type: "
            r1.append(r0)
            java.lang.String r0 = r2.getSimpleName()
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.util.List r4 = java.util.Collections.singletonList(r0)
            goto L_0x000e
        L_0x1a2f:
            r1 = r10
            X.1mH r1 = (X.C30331mH) r1
            r0 = r11
            X.1mH r0 = (X.C30331mH) r0
            java.util.List r4 = A0E(r1, r0, r13)
            goto L_0x000e
        L_0x1a3b:
            r1 = r10
            X.1mI r1 = (X.C30341mI) r1
            r0 = r11
            X.1mI r0 = (X.C30341mI) r0
            java.util.List r4 = A0N(r1, r0, r13)
            goto L_0x000e
        L_0x1a47:
            java.lang.String r0 = "expected object is null"
            goto L_0x000a
        L_0x1a4b:
            java.util.List r4 = java.util.Collections.emptyList()
            goto L_0x000e
        L_0x1a51:
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x1a56:
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x1a5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C627036g.A0a(java.lang.Object, java.lang.Object, java.lang.String, java.util.Set):void");
    }
}
