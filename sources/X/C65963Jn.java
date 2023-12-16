package X;

/* renamed from: X.3Jn  reason: invalid class name and case insensitive filesystem */
public class C65963Jn implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_participant_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_participant_device_index ON group_participant_device (group_participant_row_id, device_jid_row_id)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "group_participant_user", "group_participant_device", "group_participant_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r2, A0t);
        C54912pU.A0V(A00, r2, "group_participant_row_id", A0t, A0m);
        C54912pU.A0W(A00, r2, "device_jid_row_id", A0t, A0m);
        C54912pU.A0B(A00, r2, "sent_sender_key", A0t);
        C54912pU.A0C(A00, r2, "sent_add_on_sender_key", A0t);
        r7.A0E("group_participant_device", A0t);
    }
}
