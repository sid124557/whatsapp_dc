package X;

/* renamed from: X.3Ko  reason: invalid class name and case insensitive filesystem */
public class C66233Ko implements AnonymousClass4ED {
    public static String A00(long j, boolean z, boolean z2) {
        String str;
        String str2 = " ORDER BY sort_id ASC";
        String str3 = "";
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i > 0) {
            A0o.append(AnonymousClass2CE.A00);
            if (z) {
                str3 = " AND message.chat_row_id = ?";
            }
            A0o.append(str3);
            A0o.append(" AND file_size > ?");
        } else {
            A0o.append(AnonymousClass2CE.A02);
            if (z) {
                str = " AND chat_row_id = ?";
            } else {
                str = str3;
            }
            A0o.append(str);
            if (j > 0) {
                str3 = " AND media_size > ?";
            }
            A0o.append(str3);
        }
        if (!z2) {
            str2 = " ORDER BY sort_id DESC";
        }
        return AnonymousClass000.A0X(str2, A0o);
    }

    static {
        C57212tH.A01("message_media", new String[]{"media_name", "file_path", "width", "height"});
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_media_hash_index", "CREATE INDEX IF NOT EXISTS message_media_hash_index ON message_media(file_hash)");
        r5.A0B("message_media_chat_index", "CREATE INDEX IF NOT EXISTS message_media_chat_index ON message_media(chat_row_id)");
        r5.A0B("message_media_original_file_hash_index", "CREATE INDEX IF NOT EXISTS message_media_original_file_hash_index ON message_media(original_file_hash)");
    }

    public void B3j(C41492Kl r9, C56622sI r10) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[40];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        A00.A00 = A02;
        boolean A0p = C54912pU.A0p(A00, r2);
        C54912pU.A0U(A00, A02, "chat_row_id", r2, 1);
        C54912pU.A0A(A00, A02, "autotransfer_retry_enabled", r2);
        A00.A02 = "multicast_id";
        AnonymousClass220 r5 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A00, r5, r2);
        C54912pU.A0C(A00, r5, "media_job_uuid", r2);
        C54912pU.A0D(A00, A02, "transferred", r2);
        C54912pU.A0E(A00, A02, "transcoded", r2);
        C54912pU.A0F(A00, r5, "file_path", r2);
        C54912pU.A0G(A00, A02, "file_size", r2);
        C54912pU.A0H(A00, A02, "suspicious_content", r2);
        C54912pU.A0I(A00, A02, "trim_from", r2);
        C54912pU.A0J(A00, A02, "trim_to", r2);
        C54912pU.A0K(A00, A02, "face_x", r2);
        C54912pU.A0L(A00, A02, "face_y", r2);
        A00.A02 = "media_key";
        AnonymousClass220 r7 = AnonymousClass220.BLOB;
        r2[14] = C54912pU.A02(A00, r7);
        C54912pU.A0N(A00, A02, "media_key_timestamp", r2);
        C54912pU.A0O(A00, A02, "width", r2);
        C54912pU.A0P(A00, A02, "height", r2);
        C54912pU.A0Q(A00, A02, "has_streaming_sidecar", r2);
        C54912pU.A0R(A00, A02, "gif_attribution", r2);
        A00.A02 = "thumbnail_height_width_ratio";
        r2[20] = C54912pU.A02(A00, AnonymousClass220.REAL);
        C54912pU.A0S(A00, r5, "direct_path", r2);
        C54912pU.A0T(A00, r7, "first_scan_sidecar", r2);
        r2[23] = C54912pU.A03(A00, A02, "first_scan_length");
        r2[24] = C54912pU.A03(A00, r5, "message_url");
        r2[25] = C54912pU.A03(A00, r5, "mime_type");
        r2[26] = C54912pU.A03(A00, A02, "file_length");
        r2[27] = C54912pU.A03(A00, r5, "media_name");
        r2[28] = C54912pU.A03(A00, r5, "file_hash");
        r2[29] = C54912pU.A03(A00, A02, "media_duration");
        r2[30] = C54912pU.A03(A00, A02, "page_count");
        r2[31] = C54912pU.A03(A00, r5, "enc_file_hash");
        r2[32] = C54912pU.A03(A00, r5, "partial_media_hash");
        r2[33] = C54912pU.A03(A00, r5, "partial_media_enc_hash");
        r2[34] = C54912pU.A03(A00, A02, "is_animated_sticker");
        r2[35] = C54912pU.A03(A00, r5, "original_file_hash");
        r2[36] = C54912pU.A04(A00, A02, "mute_video", A0p ? 1 : 0);
        r2[37] = C54912pU.A03(A00, r5, "media_caption");
        r2[38] = C54912pU.A03(A00, r5, "media_upload_handle");
        r2[39] = C54912pU.A03(A00, A02, "sticker_flags");
        r10.A0E("message_media", r2);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_media");
    }
}
