package X;

/* renamed from: X.3H9  reason: invalid class name */
public class AnonymousClass3H9 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("addon_message_media_message_row_id_index", "CREATE INDEX IF NOT EXISTS addon_message_media_message_row_id_index ON addon_message_media (message_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "addon_message_media");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[25];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0k = C54912pU.A0k(A00, A01);
        A00.A03 = A0k;
        C54912pU.A0j(A00, r2, A0k);
        C54912pU.A0V(A00, A01, "message_row_id", r2, A0k);
        C54912pU.A0W(A00, A01, "addon_message_index", r2, A0k);
        C54912pU.A0B(A00, A01, "chat_row_id", r2);
        A00.A02 = "file_path";
        AnonymousClass220 r6 = AnonymousClass220.TEXT;
        C54912pU.A0a(A00, r6, r2);
        C54912pU.A0D(A00, A01, "file_size", r2);
        A00.A02 = "media_key";
        AnonymousClass220 r5 = AnonymousClass220.BLOB;
        r2[6] = C54912pU.A02(A00, r5);
        C54912pU.A0F(A00, A01, "media_key_timestamp", r2);
        C54912pU.A0G(A00, A01, "width", r2);
        C54912pU.A0H(A00, A01, "height", r2);
        C54912pU.A0I(A00, r6, "direct_path", r2);
        C54912pU.A0J(A00, r6, "message_url", r2);
        C54912pU.A0K(A00, r6, "mime_type", r2);
        C54912pU.A0L(A00, A01, "file_length", r2);
        C54912pU.A0M(A00, r6, "file_hash", r2);
        C54912pU.A0N(A00, r6, "enc_file_hash", r2);
        C54912pU.A0O(A00, r6, "partial_media_hash", r2);
        C54912pU.A0P(A00, r6, "partial_media_enc_hash", r2);
        C54912pU.A0Q(A00, r6, "original_file_hash", r2);
        C54912pU.A0R(A00, r6, "thumbnail", r2);
        r2[20] = C54912pU.A03(A00, r6, "thumbnail_direct_path");
        C54912pU.A0S(A00, r6, "thumbnail_hash", r2);
        C54912pU.A0T(A00, r6, "enc_thumbnail_hash", r2);
        r2[23] = C54912pU.A03(A00, r5, "scans_sidecar");
        r2[24] = C54912pU.A03(A00, A01, "transferred");
        r9.A0E("addon_message_media", r2);
    }
}
