package X;

import android.text.TextUtils;

/* renamed from: X.3Ky  reason: invalid class name and case insensitive filesystem */
public class C66333Ky implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r9, C41492Kl r10) {
        C56862sg r2 = r9;
        String A00 = C626235v.A00(r9, "table", "message_vcard_jid");
        if (TextUtils.isEmpty(A00)) {
            r9.A0H("CREATE TABLE message_vcard_jid(_id INTEGER PRIMARY KEY AUTOINCREMENT, vcard_jid_row_id INTEGER, vcard_row_id INTEGER, message_row_id INTEGER)", "CREATE_MESSAGE_VCARD_JID_TABLE");
        } else if (C626235v.A05(r2, A00, "message_vcard_jid", "message_row_id", "INTEGER", "VCardJidTable")) {
            C626235v.A02(r9, "DROP_MESSAGE_VCARD_JID_INDEX", "message_vcard_jid_index");
        }
    }

    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("message_vcard_jid_index", "CREATE UNIQUE INDEX IF NOT EXISTS message_vcard_jid_index ON message_vcard_jid(vcard_jid_row_id, vcard_row_id, message_row_id)");
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "message_vcard_jid");
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A05(r6, "message_vcard", "message_vcard_jid", "vcard_row_id=old._id");
        C56622sI.A00(r6, "message_vcard_jid");
    }
}
