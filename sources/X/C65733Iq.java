package X;

/* renamed from: X.3Iq  reason: invalid class name and case insensitive filesystem */
public class C65733Iq implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, A0w);
        C54912pU.A09(A00, r2, "creation_message_row_id", A0o);
        A00.A06 = A0o;
        C54912pU.A0i(A00, A0w, A0o ? 1 : 0);
        A00.A02 = "call_title";
        C54912pU.A0e(A00, AnonymousClass220.TEXT, A0w, A0o);
        C54912pU.A0X(A00, r2, "call_timestamp_ms", A0w, A0o);
        r7.A0E("message_system_scheduled_call_start", A0w);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message_system", "message_system_scheduled_call_start", "message_row_id=old.message_row_id");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
