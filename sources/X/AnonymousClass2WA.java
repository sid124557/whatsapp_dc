package X;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: X.2WA  reason: invalid class name */
public class AnonymousClass2WA {
    public final C72303dV A00;

    public void A00(C30941nT r7, long j) {
        C85284Fq A04 = this.A00.A04();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            C18270x1.A0a(A06, j);
            if (!TextUtils.isEmpty(r7.A01)) {
                A06.put("parent_group_jid", r7.A01);
            }
            if (!TextUtils.isEmpty(r7.A00)) {
                A06.put("group_subject", r7.A00);
            }
            ((AnonymousClass3H0) A04).A03.A0C("message_quoted_blank_reply", "INSERT_QUOTED_BLANK_REPLY", A06, 5);
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass2WA(C72303dV r1) {
        this.A00 = r1;
    }
}
