package X;

/* renamed from: X.3Jd  reason: invalid class name and case insensitive filesystem */
public class C65863Jd implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("scheduled_calls_chat_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_chat_row_id_index ON scheduled_calls (key_chat_row_id, scheduled_timestamp, is_upcoming)");
        r5.A0B("scheduled_calls_key_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_key_id_index ON scheduled_calls (key_chat_row_id, key_id)");
        r5.A0B("scheduled_calls_timestamp_index_v2", "CREATE INDEX IF NOT EXISTS scheduled_calls_timestamp_index_v2 ON scheduled_calls (is_upcoming, scheduled_timestamp)");
        r5.A0B("scheduled_calls_call_log_row_id_index", "CREATE INDEX IF NOT EXISTS scheduled_calls_call_log_row_id_index ON scheduled_calls (call_log_row_id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[10];
        A00.A02 = "creation_message_row_id";
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r2, r3);
        A00.A02 = "key_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, r3, A0o);
        C54912pU.A0W(A00, r2, "key_from_me", r3, A0o);
        C54912pU.A0X(A00, r2, "key_chat_row_id", r3, A0o);
        A00.A02 = "call_type";
        C54912pU.A0g(A00, r2, r3, A0o);
        A00.A02 = "scheduled_timestamp";
        C54912pU.A0h(A00, r2, r3, A0o);
        r3[6] = C54912pU.A07(A00, r1, "call_title", A0o);
        r3[7] = C54912pU.A07(A00, r2, "creator_jid_row_id", A0o);
        A00.A02 = "is_upcoming";
        A00.A00 = AnonymousClass220.BOOLEAN;
        A00.A04 = A0o;
        r3[8] = A00.A0x();
        C54912pU.A0H(A00, r2, "call_log_row_id", r3);
        r8.A0E("scheduled_calls", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
