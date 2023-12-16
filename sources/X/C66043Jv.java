package X;

/* renamed from: X.3Jv  reason: invalid class name and case insensitive filesystem */
public class C66043Jv implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("user_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS user_device_index ON user_device (user_jid_row_id,device_jid_row_id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0s = C54912pU.A0s(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        A00.A00 = r3;
        boolean A0q = C54912pU.A0q(A00, A0s);
        C54912pU.A0U(A00, r3, "user_jid_row_id", A0s, 1);
        C54912pU.A0A(A00, r3, "device_jid_row_id", A0s);
        A0s[3] = C54912pU.A05(A00, r3, "key_index", A0q ? 1 : 0, true);
        r8.A0E("user_device", A0s);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
