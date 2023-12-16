package X;

/* renamed from: X.3IK  reason: invalid class name */
public class AnonymousClass3IK implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r2 = new C59422wt[5];
        AnonymousClass220 r5 = AnonymousClass220.INTEGER;
        r2[0] = new C59422wt(r5, "message_row_id", "NOT NULL PRIMARY KEY");
        r2[1] = C54912pU.A03(A00, r5, "host_storage");
        C54912pU.A0A(A00, r5, "actual_actors", r2);
        A00.A02 = "privacy_mode_ts";
        A00.A00 = r5;
        A00.A04 = true;
        r2[3] = A00.A0x();
        A00.A02 = "business_name";
        C54912pU.A0a(A00, AnonymousClass220.TEXT, r2);
        r8.A0E("message_privacy_state", r2);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "message_privacy_state", "message_row_id=old._id");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
