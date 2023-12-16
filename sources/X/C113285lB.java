package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5lB  reason: invalid class name and case insensitive filesystem */
public class C113285lB implements AnonymousClass4E7 {
    public C149697Nn A00;
    public final C29441ip A01;
    public final C33971tz A02;
    public final AnonymousClass4FS A03;

    public void BZH() {
        A00((AnonymousClass304) null);
    }

    public final void A00(AnonymousClass304 r6) {
        C149697Nn r4 = this.A00;
        if (r4 != null) {
            r4.A01.A03(r4.A00, r4.A03, r6, r4.A04);
            C182048nm r0 = r4.A02;
            if (r0 != null) {
                r0.BNu(r6);
            }
        }
    }

    public void Bdo(AnonymousClass304 r5) {
        if (r5 == null) {
            r5 = null;
        } else {
            int i = r5.A00;
            if (i == 1 || i == 2 || i == 3) {
                C149697Nn r0 = this.A00;
                if (r0 != null) {
                    AnonymousClass5U9 r3 = r0.A01;
                    r3.A01();
                    r3.A04(r0.A00, r0.A03, r0.A04);
                    return;
                }
                return;
            }
        }
        A00(r5);
    }

    public /* synthetic */ void Bdp() {
    }

    public C113285lB(C149697Nn r2, C29441ip r3, C66413Li r4, UserJid userJid, AnonymousClass31C r6, AnonymousClass4FS r7) {
        this.A00 = r2;
        this.A03 = r7;
        this.A01 = r3;
        this.A02 = new C33971tz(r4, this, userJid, r6);
    }
}
