package X;

/* renamed from: X.3Hm  reason: invalid class name and case insensitive filesystem */
public class C65433Hm implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("labeled_jids_index", "CREATE UNIQUE INDEX IF NOT EXISTS labeled_jids_index ON labeled_jids (label_id, jid)");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "labels", "labeled_jids", "label_id=old._id");
    }

    public void B3j(C41492Kl r6, C56622sI r7) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] A0r = C54912pU.A0r(A00);
        AnonymousClass220 r2 = AnonymousClass220.INTEGER;
        C54912pU.A0V(A00, r2, "label_id", A0r, C54912pU.A0m(A00, r2, A0r));
        A00.A02 = "jid";
        C54912pU.A0Y(A00, AnonymousClass220.TEXT, A0r);
        r7.A0E("labeled_jids", A0r);
    }
}
