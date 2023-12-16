package X;

/* renamed from: X.3JQ  reason: invalid class name */
public class AnonymousClass3JQ implements AnonymousClass4ED {
    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[9];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        A00.A00 = A02;
        boolean A0p = C54912pU.A0p(A00, r4);
        C54912pU.A0V(A00, A02, "group_jid_row_id", r4, true);
        C54912pU.A0W(A00, A02, "admin_jid_row_id", r4, true);
        A00.A02 = "group_name";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0Z(A00, r1, r4);
        C54912pU.A0C(A00, r1, "invite_code", r4);
        C54912pU.A0D(A00, A02, "expiration", r4);
        C54912pU.A0E(A00, A02, "invite_time", r4);
        C54912pU.A0F(A00, A02, "expired", r4);
        r4[8] = C54912pU.A05(A00, A02, "group_type", A0p ? 1 : 0, true);
        r9.A0E("message_quoted_group_invite", r4);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A01(r4, "message_quoted_group_invite");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
