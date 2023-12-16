package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6Bk  reason: invalid class name and case insensitive filesystem */
public class C124216Bk implements AnonymousClass4DF {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C124216Bk(UserJid userJid, AnonymousClass66A r2, AnonymousClass5QK r3, int i) {
        this.A03 = i;
        this.A02 = r3;
        if (i != 0) {
            this.A00 = userJid;
            this.A01 = r2;
        } else {
            this.A01 = r2;
            this.A00 = userJid;
        }
    }

    public void BX8(C95804uY r7) {
        if (this.A03 != 0) {
            C162457s7.A0J(r7, 0);
            AnonymousClass5QK r4 = (AnonymousClass5QK) this.A02;
            r4.A02.A00(r7, (UserJid) this.A00);
            r4.A01.A0S(new C70123Zz(r4, 3, this.A01));
            return;
        }
        AnonymousClass5QK r5 = (AnonymousClass5QK) this.A02;
        r5.A01.A0S(new C70353aM(r5, this.A01, this.A00, 22));
    }

    public void onError(Throwable th) {
        int i;
        int i2 = this.A03;
        AnonymousClass5QK r2 = (AnonymousClass5QK) this.A02;
        C69263Wi r1 = r2.A01;
        if (i2 != 0) {
            i = 43;
        } else {
            i = 42;
        }
        C86624Kv.A1D(r1, r2, i);
        ((AnonymousClass66A) this.A01).BSL(C18290x4.A12(new C96854x6((UserJid) this.A00)));
    }
}
