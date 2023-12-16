package X;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: X.9hW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199939hW implements Runnable {
    public final /* synthetic */ C624034w A00;
    public final /* synthetic */ C194539Ti A01;

    public final void run() {
        C194539Ti r6 = this.A01;
        String str = this.A00.A0K;
        synchronized (r6) {
            if (TextUtils.isEmpty(str)) {
                r6.A08.A05("addUnreadMessagelessPaymentTransaction empty transaction id");
            } else {
                C56082rO r5 = r6.A05;
                String A012 = r5.A01("unread_messageless_transaction_ids");
                if (A012 == null) {
                    A012 = "";
                }
                HashSet A0h = C18280x3.A0h(TextUtils.split(A012, ";"));
                A0h.add(str);
                String join = TextUtils.join(";", A0h);
                C160757oG r2 = r6.A08;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("addUnreadMessagelessPaymentTransaction/unreadTransactions:");
                C1899593h.A1J(r2, join, A0o);
                r5.A05("unread_messageless_transaction_ids", join);
            }
        }
        r6.A01();
    }

    public /* synthetic */ C199939hW(C624034w r1, C194539Ti r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
