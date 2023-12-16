package X;

/* renamed from: X.3HS  reason: invalid class name */
public final class AnonymousClass3HS implements AnonymousClass4ED {
    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "chat", "community_chat", "chat_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[5];
        A00.A02 = "chat_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, r3);
        C54912pU.A0U(A00, r2, "last_activity_ts", r3, A0o ? 1 : 0);
        C54912pU.A0A(A00, r2, "last_activity_seen_ts", r3);
        C54912pU.A0B(A00, r2, "join_ts", r3);
        r3[4] = C54912pU.A06(A00, r2, "closed", A0o);
        r7.A0E("community_chat", r3);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
