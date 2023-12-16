package X;

/* renamed from: X.3JR  reason: invalid class name */
public class AnonymousClass3JR implements AnonymousClass4ED {
    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r4 = new C59422wt[3];
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        r4[0] = new C59422wt(r3, "message_row_id", "NOT NULL PRIMARY KEY");
        r4[1] = C54912pU.A03(A00, r3, "element_type");
        A00.A02 = "element_content";
        C54912pU.A0Y(A00, AnonymousClass220.TEXT, r4);
        r8.A0E("message_quoted_ui_elements", r4);
    }

    public /* synthetic */ void B3l(C56862sg r2, C41492Kl r3, C56622sI r4) {
        C56622sI.A01(r4, "message_quoted_ui_elements");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
