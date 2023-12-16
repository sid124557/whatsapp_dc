package X;

/* renamed from: X.3Kh  reason: invalid class name and case insensitive filesystem */
public final class C66163Kh implements AnonymousClass4ED {
    public static String[] A00 = {"pin_in_chat_state", "sender_timestamp"};

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        C162457s7.A0J(r5, 0);
        r5.A0B("message_add_on_pin_in_chat_state_index", "CREATE INDEX IF NOT EXISTS message_add_on_pin_in_chat_state_index ON message_add_on_pin_in_chat (pin_in_chat_state)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C162457s7.A0J(r6, 0);
        C56622sI.A04(r6, "message_add_on", "message_add_on_pin_in_chat", "message_add_on_row_id=old._id");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [boolean] */
    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A01 = C54912pU.A01(r7);
        C59422wt[] r3 = new C59422wt[3];
        A01.A02 = "message_add_on_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        ? A0n = C54912pU.A0n(A01, r2, r3);
        r3[A0n] = C54912pU.A06(A01, r2, "pin_in_chat_state", A0n);
        C54912pU.A0A(A01, r2, "sender_timestamp", r3);
        r7.A0E("message_add_on_pin_in_chat", r3);
    }
}
