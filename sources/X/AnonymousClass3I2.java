package X;

/* renamed from: X.3I2  reason: invalid class name */
public class AnonymousClass3I2 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_details_author_device_jid_index", "CREATE INDEX IF NOT EXISTS message_details_author_device_jid_index ON message_details (author_device_jid)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "message_details", "message_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0u = C54912pU.A0u(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "author_device_jid", A0u, C54912pU.A0o(A00, r2, A0u) ? 1 : 0);
        r7.A0E("message_details", A0u);
    }
}
