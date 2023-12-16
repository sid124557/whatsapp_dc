package X;

/* renamed from: X.3Jh  reason: invalid class name and case insensitive filesystem */
public class C65903Jh implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("crossposting_session_id_index", "CREATE INDEX IF NOT EXISTS crossposting_session_id_index ON status_crossposting(crossposting_session_id)");
        r5.A0B("crossposting_state_index", "CREATE INDEX IF NOT EXISTS crossposting_state_index ON status_crossposting(state)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[5];
        A00.A02 = "status_message_row_id";
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        boolean A0o = C54912pU.A0o(A00, r3, r4);
        A00.A02 = "crossposting_session_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0b(A00, r1, r4, A0o ? 1 : 0);
        C54912pU.A0A(A00, r1, "crossposting_status_unique_id", r4);
        C54912pU.A0B(A00, r3, "state", r4);
        C54912pU.A0C(A00, r1, "media_path", r4);
        r8.A0E("status_crossposting", r4);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "status_crossposting", "status_message_row_id=old._id");
    }
}
