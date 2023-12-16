package X;

/* renamed from: X.3Ij  reason: invalid class name and case insensitive filesystem */
public class C65663Ij implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, A0w);
        A00.A02 = "call_id";
        C54912pU.A0b(A00, AnonymousClass220.TEXT, A0w, A0o ? 1 : 0);
        C54912pU.A0A(A00, r2, "is_video_call", A0w);
        C54912pU.A0B(A00, r2, "call_type", A0w);
        r7.A0E("message_system_linked_group_call", A0w);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_system_linked_group_call");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
