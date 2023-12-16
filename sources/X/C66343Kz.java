package X;

import android.text.TextUtils;

/* renamed from: X.3Kz  reason: invalid class name and case insensitive filesystem */
public class C66343Kz implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r10, C41492Kl r11) {
        String A00 = C626235v.A00(r10, "table", "message_add_on_receipt_device");
        if (!TextUtils.isEmpty(A00)) {
            if (!C626235v.A07(A00, "receipt_device_id", "INTEGER")) {
                r10.A0H(AnonymousClass000.A0V("DROP INDEX IF EXISTS ", "message_add_on_receipt_device_index", AnonymousClass001.A0o()), C57242tK.A00("MessageAddOnReceiptDeviceTable", "createTable", AnonymousClass000.A0V("DROP_", "message_add_on_receipt_device", AnonymousClass001.A0o())));
                r10.A0H(AnonymousClass000.A0T("DROP INDEX IF EXISTS ", "message_add_on_receipt_device_jid_index"), C57242tK.A00("MessageAddOnReceiptDeviceTable", "createTable", AnonymousClass000.A0V("DROP_", "message_add_on_receipt_device", AnonymousClass001.A0o())));
                r10.A0H(AnonymousClass000.A0V("DROP TABLE IF EXISTS ", "message_add_on_receipt_device", AnonymousClass001.A0o()), C57242tK.A00("MessageAddOnReceiptDeviceTable", "createTable", AnonymousClass000.A0V("DROP_", "message_add_on_receipt_device", AnonymousClass001.A0o())));
            } else {
                return;
            }
        }
        r10.A0H("CREATE TABLE message_add_on_receipt_device (receipt_device_id INTEGER PRIMARY KEY AUTOINCREMENT, message_add_on_row_id INTEGER, receipt_device_jid_row_id INTEGER, receipt_device_timestamp INTEGER, primary_device_version INTEGER)", "MessageAddOnReceiptDeviceTable/createMessageAddOnReceiptDeviceTable/CREATE_MESSAGE_ADD_ON_RECEIPT_DEVICE_TABLE");
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_add_on_receipt_device_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_add_on_receipt_device_index ON message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id)");
        r5.A0B("message_add_on_receipt_device_jid_index", "CREATE INDEX IF NOT EXISTS message_add_on_receipt_device_jid_index ON message_add_on_receipt_device (receipt_device_jid_row_id)");
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "message_add_on_receipt_device");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message_add_on", "message_add_on_receipt_device", "message_add_on_row_id=old._id");
    }
}
