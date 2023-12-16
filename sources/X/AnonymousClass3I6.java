package X;

/* renamed from: X.3I6  reason: invalid class name */
public class AnonymousClass3I6 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_ephemeral_expire_timestamp_index", "CREATE INDEX IF NOT EXISTS message_ephemeral_expire_timestamp_index ON message_ephemeral(expire_timestamp)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "message_ephemeral", "message_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[6];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r3);
        C54912pU.A0V(A00, A02, "duration", r3, A0o);
        C54912pU.A0W(A00, A02, "expire_timestamp", r3, A0o);
        r3[3] = C54912pU.A06(A00, A02, "keep_in_chat", A0o);
        C54912pU.A0C(A00, A02, "ephemeral_trigger", r3);
        C54912pU.A0D(A00, A02, "ephemeral_initiated_by_me", r3);
        r7.A0E("message_ephemeral", r3);
    }
}
