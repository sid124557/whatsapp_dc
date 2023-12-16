package X;

/* renamed from: X.3I8  reason: invalid class name */
public class AnonymousClass3I8 implements AnonymousClass4ED {
    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[19];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r4);
        A00.A02 = "wa_invoice_id";
        AnonymousClass220 r3 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r3, r4, A0o);
        C54912pU.A0W(A00, r3, "amount", r4, A0o);
        C54912pU.A0X(A00, r3, "note", r4, A0o);
        C54912pU.A0C(A00, r3, "token", r4);
        C54912pU.A0D(A00, A02, "sender_jid_row_id", r4);
        C54912pU.A0E(A00, A02, "receiver_jid_row_id", r4);
        C54912pU.A0F(A00, A02, "status", r4);
        C54912pU.A0G(A00, A02, "status_ts", r4);
        C54912pU.A0H(A00, A02, "creation_ts", r4);
        C54912pU.A0I(A00, A02, "attachment_type", r4);
        C54912pU.A0J(A00, r3, "attachment_mimetype", r4);
        A00.A02 = "attachment_media_key";
        AnonymousClass220 r2 = AnonymousClass220.BLOB;
        r4[12] = C54912pU.A02(A00, r2);
        C54912pU.A0L(A00, A02, "attachment_media_key_ts", r4);
        C54912pU.A0M(A00, r2, "attachment_file_sha256", r4);
        C54912pU.A0N(A00, r2, "attachment_file_enc_sha256", r4);
        C54912pU.A0O(A00, r3, "attachment_direct_path", r4);
        C54912pU.A0P(A00, r2, "attachment_jpeg_thumbnail", r4);
        C54912pU.A0Q(A00, r3, "metadata", r4);
        r9.A0E("message_invoice", r4);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
