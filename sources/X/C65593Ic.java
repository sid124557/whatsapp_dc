package X;

/* renamed from: X.3Ic  reason: invalid class name and case insensitive filesystem */
public class C65593Ic implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, A0w);
        C54912pU.A0U(A00, r2, "old_group_type", A0w, A0o ? 1 : 0);
        C54912pU.A0W(A00, r2, "new_group_type", A0w, A0o);
        C54912pU.A0B(A00, r2, "linked_parent_group_jid_row_id", A0w);
        r7.A0E("message_system_community_link_changed", A0w);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_system_community_link_changed");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
