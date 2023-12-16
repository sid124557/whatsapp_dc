package X;

/* renamed from: X.3IB  reason: invalid class name */
public class AnonymousClass3IB implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_media_interactive_annotation_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_interactive_annotation_index ON message_media_interactive_annotation (message_row_id, sort_order)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[11];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        A00.A00 = A01;
        boolean A0q = C54912pU.A0q(A00, r4);
        C54912pU.A0U(A00, A01, "message_row_id", r4, 1);
        r4[2] = C54912pU.A05(A00, A01, "skip_confirmation", A0q ? 1 : 0, true);
        A00.A02 = "location_latitude";
        AnonymousClass220 r1 = AnonymousClass220.REAL;
        C54912pU.A0Z(A00, r1, r4);
        C54912pU.A0C(A00, r1, "location_longitude", r4);
        A00.A02 = "location_name";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        r4[5] = C54912pU.A02(A00, r2);
        C54912pU.A0E(A00, A01, "newsletter_jid_row_id", r4);
        C54912pU.A0F(A00, A01, "newsletter_server_message_id", r4);
        C54912pU.A0G(A00, r2, "newsletter_name", r4);
        C54912pU.A0H(A00, A01, "newsletter_content_type", r4);
        C54912pU.A0I(A00, A01, "sort_order", r4);
        r8.A0E("message_media_interactive_annotation", r4);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_media", "message_media_interactive_annotation", "message_row_id=old.message_row_id");
    }
}
