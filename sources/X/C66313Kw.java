package X;

import android.text.TextUtils;

/* renamed from: X.3Kw  reason: invalid class name and case insensitive filesystem */
public class C66313Kw implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r7, C41492Kl r8) {
        String A00 = C626235v.A00(r7, "table", "receipt_orphaned");
        if (!TextUtils.isEmpty(A00)) {
            if (!C626235v.A07(A00, "receipt_recipient_jid_row_id", "INTEGER")) {
                C626235v.A03(r7, "ReceiptOrphanedTable", "receipt_orphaned");
            } else {
                return;
            }
        }
        r7.A0H("CREATE TABLE receipt_orphaned (_id INTEGER PRIMARY KEY AUTOINCREMENT, chat_row_id INTEGER NOT NULL, from_me INTEGER NOT NULL, key_id TEXT NOT NULL, receipt_device_jid_row_id INTEGER NOT NULL, receipt_recipient_jid_row_id INTEGER, status INTEGER, timestamp INTEGER)", "CREATE_RECEIPT_ORPHANED_TABLE");
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("receipt_orphaned_index", "CREATE UNIQUE INDEX IF NOT EXISTS receipt_orphaned_index ON receipt_orphaned (chat_row_id, from_me, key_id, receipt_device_jid_row_id, receipt_recipient_jid_row_id, status)");
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "receipt_orphaned");
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
