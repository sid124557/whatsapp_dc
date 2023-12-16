package X;

/* renamed from: X.3KW  reason: invalid class name */
public class AnonymousClass3KW implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("sent_tc_token_timestamp_index", "CREATE INDEX IF NOT EXISTS sent_tc_token_timestamp_index ON wa_trusted_contacts_send (sent_tc_token_timestamp)");
        r5.A0B("sent_real_issue_timestamp_index", "CREATE INDEX IF NOT EXISTS sent_real_issue_timestamp_index ON wa_trusted_contacts_send (real_issue_timestamp)");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[3];
        A00.A02 = "jid";
        boolean A0k = C54912pU.A0k(A00, AnonymousClass220.TEXT);
        C54912pU.A0j(A00, r3, A0k);
        A00.A02 = "sent_tc_token_timestamp";
        AnonymousClass220 r1 = AnonymousClass220.LONG;
        C54912pU.A0c(A00, r1, r3, A0k);
        C54912pU.A0A(A00, r1, "real_issue_timestamp", r3);
        r7.A0E("wa_trusted_contacts_send", r3);
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
