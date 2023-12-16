package X;

/* renamed from: X.3Ht  reason: invalid class name and case insensitive filesystem */
public class C65503Ht implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[4];
        A00.A02 = "jid_row_id";
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        boolean A0k = C54912pU.A0k(A00, r3);
        C54912pU.A0j(A00, r4, A0k);
        C54912pU.A09(A00, r3, "is_pn_shared", A0k);
        A00.A01 = "0";
        C54912pU.A0i(A00, r4, A0k ? 1 : 0);
        r4[2] = C54912pU.A08(A00, r3, "pn_requested_ts", A0k);
        r4[3] = C54912pU.A08(A00, r3, "pnh_duplicate_lid_thread", A0k);
        r8.A0E("lid_chat_state", r4);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
