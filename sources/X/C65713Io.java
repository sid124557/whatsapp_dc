package X;

/* renamed from: X.3Io  reason: invalid class name and case insensitive filesystem */
public final class C65713Io implements AnonymousClass4ED {
    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "message_system", "message_system_reminder_sent", "message_row_id=old.message_row_id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] A0v = C54912pU.A0v(A01);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0n = C54912pU.A0n(A01, r2, A0v);
        C54912pU.A09(A01, r2, "original_message_row_id", A0n);
        A01.A06 = A0n;
        C54912pU.A0i(A01, A0v, A0n ? 1 : 0);
        A01.A02 = "original_reminder_content";
        C54912pU.A0e(A01, AnonymousClass220.TEXT, A0v, A0n);
        r7.A0E("message_system_reminder_sent", A0v);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
