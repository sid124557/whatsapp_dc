package X;

/* renamed from: X.3L1  reason: invalid class name */
public class AnonymousClass3L1 implements AnonymousClass4ED, C838049v {
    public static final String[] A00 = {""};

    public void B17(C56862sg r5, C41492Kl r6) {
        if (C626235v.A04(r5, "message_ftsv2")) {
            r5.A0H("CREATE VIRTUAL TABLE message_ftsv2 USING FTS4(content, fts_jid, fts_namespace)", "CREATE_MESSAGE_FTS_TABLE");
            C622033z.A02(r5, "fts_index_start", "FtsTable", 0);
        }
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "message_ftsv2");
    }

    public void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        if (!C626235v.A04(r4, "message_ftsv2")) {
            C56622sI.A05(r6, "message", "message_ftsv2", "docid=old._id");
        }
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
