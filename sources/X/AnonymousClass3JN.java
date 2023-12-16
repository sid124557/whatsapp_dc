package X;

/* renamed from: X.3JN  reason: invalid class name */
public class AnonymousClass3JN implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("attachments_quick_reply_id_index", "CREATE INDEX IF NOT EXISTS attachments_quick_reply_id_index ON quick_reply_attachments (quick_reply_id)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0t = C54912pU.A0t(A00);
        AnonymousClass220 r3 = AnonymousClass220.INTEGER;
        boolean A0m = C54912pU.A0m(A00, r3, A0t);
        A00.A02 = "quick_reply_id";
        AnonymousClass220 r1 = AnonymousClass220.TEXT;
        C54912pU.A0c(A00, r1, A0t, A0m);
        C54912pU.A0W(A00, r1, "uri", A0t, A0m);
        C54912pU.A0B(A00, r1, "caption", A0t);
        C54912pU.A0C(A00, r3, "media_type", A0t);
        r8.A0E("quick_reply_attachments", A0t);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "quick_replies", "quick_reply_attachments", "quick_reply_id=old._id");
    }
}
