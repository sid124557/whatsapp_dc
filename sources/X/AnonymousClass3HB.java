package X;

/* renamed from: X.3HB  reason: invalid class name */
public class AnonymousClass3HB implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("agent_device_index", "CREATE INDEX IF NOT EXISTS agent_device_index ON agent_devices (device)");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean] */
    public void B3j(C41492Kl r8, C56622sI r9) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r5 = new C59422wt[5];
        A00.A02 = "agent_id";
        AnonymousClass220 r4 = AnonymousClass220.TEXT;
        ? A0k = C54912pU.A0k(A00, r4);
        C54912pU.A0j(A00, r5, A0k);
        r5[A0k] = new C59422wt(r4, "agent_name", "UNIQUE NOT NULL");
        A00.A02 = "device";
        AnonymousClass220 r1 = AnonymousClass220.INTEGER;
        C54912pU.A0Y(A00, r1, r5);
        C54912pU.A0B(A00, r1, "last_modified_time", r5);
        A00.A02 = "is_deleted";
        C54912pU.A0a(A00, AnonymousClass220.BOOLEAN, r5);
        r9.A0E("agent_devices", r5);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
