package X;

@Deprecated
/* renamed from: X.3Kt  reason: invalid class name and case insensitive filesystem */
public class C66283Kt implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r3, C41492Kl r4) {
        if (C626235v.A04(r3, "labeled_messages_fts")) {
            r3.A0H("CREATE VIRTUAL TABLE labeled_messages_fts USING FTS3()", "CREATE_LABELED_MESSAGES_FTS_TABLE");
        }
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "labeled_messages_fts");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message", "labeled_messages_fts", "docid=old._id");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
