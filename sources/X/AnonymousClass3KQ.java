package X;

/* renamed from: X.3KQ  reason: invalid class name */
public class AnonymousClass3KQ implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("entry_point_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[4];
        A00.A02 = "jid";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        A00.A00 = r2;
        C54912pU.A0j(A00, r3, true);
        C54912pU.A0V(A00, r2, "entry_point_type", r3, true);
        C54912pU.A0A(A00, r2, "entry_point_id", r3);
        A00.A02 = "entry_point_time";
        C54912pU.A0Z(A00, AnonymousClass220.INTEGER, r3);
        r7.A0E("wa_last_entry_point", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
