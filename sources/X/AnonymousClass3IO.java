package X;

/* renamed from: X.3IO  reason: invalid class name */
public class AnonymousClass3IO implements AnonymousClass4ED {
    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[20];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r2);
        A00.A02 = "media_job_uuid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0b(A00, r1, r2, A0o ? 1 : 0);
        C54912pU.A0A(A00, A02, "transferred", r2);
        C54912pU.A0B(A00, r1, "file_path", r2);
        C54912pU.A0C(A00, A02, "file_size", r2);
        A00.A02 = "media_key";
        AnonymousClass220 r4 = AnonymousClass220.BLOB;
        r2[5] = C54912pU.A02(A00, r4);
        C54912pU.A0E(A00, A02, "media_key_timestamp", r2);
        C54912pU.A0F(A00, A02, "width", r2);
        C54912pU.A0G(A00, A02, "height", r2);
        C54912pU.A0H(A00, r1, "direct_path", r2);
        C54912pU.A0I(A00, r1, "message_url", r2);
        C54912pU.A0J(A00, r1, "mime_type", r2);
        C54912pU.A0K(A00, A02, "file_length", r2);
        C54912pU.A0L(A00, r1, "media_name", r2);
        C54912pU.A0M(A00, r1, "file_hash", r2);
        C54912pU.A0N(A00, A02, "media_duration", r2);
        C54912pU.A0O(A00, A02, "page_count", r2);
        C54912pU.A0P(A00, r1, "enc_file_hash", r2);
        C54912pU.A0Q(A00, r4, "thumbnail", r2);
        C54912pU.A0R(A00, r1, "media_caption", r2);
        r9.A0E("message_quoted_media", r2);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A01(r4, "message_quoted_media");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
