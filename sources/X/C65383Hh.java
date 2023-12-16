package X;

/* renamed from: X.3Hh  reason: invalid class name and case insensitive filesystem */
public class C65383Hh implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("jid_lid_map_jid_index", "CREATE INDEX IF NOT EXISTS jid_lid_map_jid_index ON jid_map (jid_row_id)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[2];
        A00.A02 = "lid_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0k = C54912pU.A0k(A00, r2);
        C54912pU.A0j(A00, r3, A0k);
        C54912pU.A0V(A00, r2, "jid_row_id", r3, A0k);
        r7.A0E("jid_map", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
