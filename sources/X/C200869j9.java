package X;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: X.9j9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200869j9 implements Runnable {
    public final /* synthetic */ C194489Tb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void run() {
        C194489Tb r6 = this.A00;
        AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(this.A01, this.A02);
        synchronized (r6) {
            Object obj = A0G.A00;
            if (TextUtils.isEmpty((CharSequence) obj)) {
                r6.A08.A05("addUnreadPaymentMethodUpdate empty credentialId");
            } else {
                C56082rO r7 = r6.A04;
                String A012 = r7.A01("unread_payment_method_credential_ids");
                if (A012 == null) {
                    A012 = "";
                }
                HashSet A0h = C18280x3.A0h(TextUtils.split(A012, ";"));
                A0h.add(TextUtils.join(":", new String[]{(String) obj, (String) A0G.A01}));
                String join = TextUtils.join(";", A0h);
                C160757oG r2 = r6.A08;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("addUnreadPaymentMethodUpdate/unreadCredential:");
                C1899593h.A1J(r2, join, A0o);
                r7.A05("unread_payment_method_credential_ids", join);
            }
        }
        r6.A01();
    }

    public /* synthetic */ C200869j9(C194489Tb r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }
}
