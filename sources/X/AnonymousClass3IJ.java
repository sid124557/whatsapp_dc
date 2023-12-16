package X;

/* renamed from: X.3IJ  reason: invalid class name */
public class AnonymousClass3IJ implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[5];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r4);
        A00.A02 = "enc_key";
        C54912pU.A0b(A00, AnonymousClass220.BLOB, r4, A0o ? 1 : 0);
        C54912pU.A0A(A00, A02, "selectable_options_count", r4);
        C54912pU.A09(A00, A02, "invalid_state", A0o);
        A00.A01 = "0";
        r4[3] = A00.A0x();
        r4[4] = C54912pU.A08(A00, A02, "poll_logging_id", A0o);
        r8.A0E("message_poll", r4);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_poll");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
