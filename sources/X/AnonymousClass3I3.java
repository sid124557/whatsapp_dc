package X;

/* renamed from: X.3I3  reason: invalid class name */
public class AnonymousClass3I3 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_edit_info_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_edit_info_index ON message_edit_info (original_key_id)");
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A00(r4, "message_edit_info");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0w = C54912pU.A0w(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, A0w);
        A00.A02 = "original_key_id";
        C54912pU.A0c(A00, AnonymousClass220.TEXT, A0w, A0o);
        C54912pU.A0W(A00, r2, "edited_timestamp", A0w, A0o);
        C54912pU.A0X(A00, r2, "sender_timestamp", A0w, A0o);
        r7.A0E("message_edit_info", A0w);
    }
}
