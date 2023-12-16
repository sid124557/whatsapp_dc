package X;

/* renamed from: X.3Hb  reason: invalid class name and case insensitive filesystem */
public class C65323Hb implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_notification_version_index", "CREATE UNIQUE INDEX IF NOT EXISTS group_notification_version_index ON group_notification_version (group_jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[4];
        A00.A02 = "group_jid_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, r3);
        C54912pU.A0V(A00, r2, "subject_timestamp", r3, A0o);
        C54912pU.A0W(A00, r2, "announcement_version", r3, A0o);
        C54912pU.A0X(A00, r2, "participant_version", r3, A0o);
        r7.A0E("group_notification_version", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
