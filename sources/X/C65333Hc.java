package X;

@Deprecated
/* renamed from: X.3Hc  reason: invalid class name and case insensitive filesystem */
public class C65333Hc implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("group_participants_history_index", "CREATE INDEX IF NOT EXISTS group_participants_history_index ON group_participants_history (gjid)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[7];
        AnonymousClass220 A01 = AnonymousClass220.A01(A00);
        boolean A0m = C54912pU.A0m(A00, A01, r4);
        A00.A02 = "timestamp";
        C54912pU.A0c(A00, AnonymousClass220.DATETIME, r4, A0m);
        A00.A02 = "gjid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0e(A00, r1, r4, A0m);
        C54912pU.A0X(A00, r1, "jid", r4, A0m);
        A00.A02 = "action";
        C54912pU.A0g(A00, A01, r4, A0m);
        A00.A02 = "old_phash";
        C54912pU.A0h(A00, r1, r4, A0m);
        r4[6] = C54912pU.A07(A00, r1, "new_phash", A0m);
        r8.A0E("group_participants_history", r4);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
