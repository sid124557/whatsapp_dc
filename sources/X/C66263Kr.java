package X;

import android.text.TextUtils;

/* renamed from: X.3Kr  reason: invalid class name and case insensitive filesystem */
public class C66263Kr implements AnonymousClass4ED, C838049v {
    public void B17(C56862sg r7, C41492Kl r8) {
        String A00 = C626235v.A00(r7, "table", "conversion_tuples");
        if (!TextUtils.isEmpty(A00)) {
            if (!C626235v.A07(A00, "biz_count", "INTEGER")) {
                r7.A0H("DROP TABLE IF EXISTS conversion_tuples", AnonymousClass000.A0V("DROP_", "conversion_tuples", AnonymousClass001.A0o()));
            } else {
                return;
            }
        }
        r7.A0H("CREATE TABLE conversion_tuples (jid_row_id INTEGER PRIMARY KEY, data TEXT, source TEXT, biz_count INTEGER, has_user_sent_last_message BOOLEAN, last_interaction INTEGER)", "CREATE_CONVERSION_TUPLES_TABLE");
    }

    public void B3j(C41492Kl r2, C56622sI r3) {
        r3.A09(this, "conversion_tuples");
    }

    public /* synthetic */ void B3g(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }

    public /* synthetic */ void B3l(C56862sg r1, C41492Kl r2, C56622sI r3) {
    }
}
