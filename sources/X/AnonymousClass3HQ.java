package X;

/* renamed from: X.3HQ  reason: invalid class name */
public final class AnonymousClass3HQ implements AnonymousClass4ED {
    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "chat", "chat_ephemeral", "chat_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] r3 = new C59422wt[3];
        A01.A02 = "chat_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A01, r2, "ephemeral_trigger", r3, C54912pU.A0n(A01, r2, r3) ? 1 : 0);
        A01.A02 = "ephemeral_initiated_by_me";
        C54912pU.A0Y(A01, AnonymousClass220.BOOLEAN, r3);
        r7.A0E("chat_ephemeral", r3);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
