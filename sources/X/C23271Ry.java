package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Ry  reason: invalid class name and case insensitive filesystem */
public class C23271Ry extends AnonymousClass31D {
    public final C56972sr A00;
    public final C50632iV A01;
    public final C623334p A02;
    public final C49512ge A03;
    public final C46692c3 A04;
    public final C55832qz A05;

    public boolean A0T(C44342Vr r5) {
        AnonymousClass4GK A032 = this.A05.get();
        try {
            if (TextUtils.isEmpty(C626235v.A00(((AnonymousClass3H0) A032).A03, "table", "messages"))) {
                A0I();
                A032.close();
                return true;
            }
            A032.close();
            return super.A0T(r5);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public final void A0V(C60722z3 r6, C56702sQ r7, UserJid userJid, long j) {
        long A052 = this.A02.A05(userJid);
        if (A052 == -1) {
            this.A01.A0A("ReceiptUserStoreDatabaseMigration: invalid jid", false, userJid.toString());
            return;
        }
        r7.A06(1, j);
        r7.A06(2, A052);
        r7.A06(3, r6.A00);
        r7.A06(4, r6.A02);
        r7.A06(5, r6.A01);
        r7.A01();
        r7.A02();
    }

    public C23271Ry(C56972sr r3, C50632iV r4, C623334p r5, C49512ge r6, C46692c3 r7, AnonymousClass2U4 r8, C55832qz r9) {
        super(r8, "receipt_user", Integer.MIN_VALUE);
        this.A02 = r5;
        this.A00 = r3;
        this.A05 = r9;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r4;
    }

    public void A0I() {
        super.A0I();
        this.A06.A03("receipt_user_ready", 2);
    }
}
