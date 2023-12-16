package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ts  reason: invalid class name and case insensitive filesystem */
public class C68583Ts implements C85084Ew {
    public final C85084Ew A00;
    public final /* synthetic */ C54042o5 A01;

    public C68583Ts(C54042o5 r1, C85084Ew r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void BQk(UserJid userJid) {
        C85084Ew r0 = this.A00;
        if (r0 != null) {
            r0.BQk(userJid);
        }
    }

    public void BS3(UserJid userJid, int i) {
        C85084Ew r0 = this.A00;
        if (r0 != null) {
            r0.BS3(userJid, i);
        }
        this.A01.A02.postDelayed(new C70043Zq(this, 3), 25);
    }

    public void BX9(UserJid userJid) {
        C85084Ew r0 = this.A00;
        if (r0 != null) {
            r0.BX9(userJid);
        }
    }

    public void BcP(UserJid userJid, String str, long j) {
        C85084Ew r0 = this.A00;
        if (r0 != null) {
            r0.BcP(userJid, str, j);
        }
        this.A01.A02.post(new C71323bv(4, str, this));
    }
}
