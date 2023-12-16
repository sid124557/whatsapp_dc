package X;

/* renamed from: X.3Kf  reason: invalid class name and case insensitive filesystem */
public class C66143Kf implements AnonymousClass4ED {
    public static final String[] A00 = {"keep_in_chat_state", "sender_timestamp", "keep_count", "actor_device_jid_row_id"};

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message_add_on", "message_add_on_keep_in_chat", "message_add_on_row_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A002 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[5];
        A002.A02 = "message_add_on_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A002, r2, r3);
        C54912pU.A09(A002, r2, "keep_in_chat_state", A0o);
        A002.A01 = "0";
        C54912pU.A0i(A002, r3, A0o ? 1 : 0);
        C54912pU.A0A(A002, r2, "sender_timestamp", r3);
        r3[3] = C54912pU.A08(A002, r2, "keep_count", A0o);
        C54912pU.A0C(A002, r2, "actor_device_jid_row_id", r3);
        r7.A0E("message_add_on_keep_in_chat", r3);
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
