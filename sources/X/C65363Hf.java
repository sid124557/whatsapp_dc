package X;

/* renamed from: X.3Hf  reason: invalid class name and case insensitive filesystem */
public final class C65363Hf implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("integrator_opt_in_index", "CREATE INDEX IF NOT EXISTS integrator_opt_in_index ON integrator_display_name (opt_in_status)");
    }

    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A01 = C54912pU.A01(r9);
        C59422wt[] r3 = new C59422wt[6];
        A01.A02 = "integrator_id";
        AnonymousClass220 r4 = AnonymousClass220.INTEGER;
        boolean A0k = C54912pU.A0k(A01, r4);
        A01.A04 = A0k;
        C54912pU.A0i(A01, r3, 0);
        A01.A02 = "display_name";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A01, r1, r3, A0k);
        C54912pU.A0W(A01, r4, "status", r3, A0k);
        C54912pU.A09(A01, r1, "icon_path", A0k);
        A01.A01 = "''";
        r3[3] = A01.A0x();
        r3[4] = C54912pU.A05(A01, r4, "opt_in_status", 0, A0k);
        r3[5] = C54912pU.A05(A01, r4, "identifier_type", 0, A0k);
        r9.A0E("integrator_display_name", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
