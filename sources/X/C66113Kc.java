package X;

/* renamed from: X.3Kc  reason: invalid class name and case insensitive filesystem */
public class C66113Kc implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("vname_localized_index", "CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        boolean A0m = C54912pU.A0m(A00, AnonymousClass220.INTEGER, A0t);
        A00.A02 = "jid";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, A0t, A0m);
        C54912pU.A0W(A00, r1, "lg", A0t, A0m);
        C54912pU.A0X(A00, r1, "lc", A0t, A0m);
        A00.A02 = "verified_name";
        C54912pU.A0g(A00, r1, A0t, A0m);
        r7.A0E("wa_vnames_localized", A0t);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
