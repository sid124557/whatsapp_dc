package X;

/* renamed from: X.3ID  reason: invalid class name */
public class AnonymousClass3ID implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_media_vcard_count_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_media_vcard_count_index ON message_media_vcard_count(message_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "message_row_id", A0r, C54912pU.A0m(A00, r2, A0r) ? 1 : 0);
        C54912pU.A0A(A00, r2, "count", A0r);
        r7.A0E("message_media_vcard_count", A0r);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_media", "message_media_vcard_count", "message_row_id=old.message_row_id");
    }
}
