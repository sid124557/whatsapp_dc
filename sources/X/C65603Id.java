package X;

/* renamed from: X.3Id  reason: invalid class name and case insensitive filesystem */
public class C65603Id implements AnonymousClass4ED {
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0v = C54912pU.A0v(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0U(A00, r2, "device_added_count", A0v, C54912pU.A0o(A00, r2, A0v) ? 1 : 0);
        C54912pU.A0A(A00, r2, "device_removed_count", A0v);
        r7.A0E("message_system_device_change", A0v);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A02(r4, "message_system_device_change");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
