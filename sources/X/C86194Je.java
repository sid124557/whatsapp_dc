package X;

import com.whatsapp.R;

/* renamed from: X.4Je  reason: invalid class name and case insensitive filesystem */
public class C86194Je implements AnonymousClass4DF {
    public Object A00;
    public final int A01;

    public C86194Je(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BX8(C95804uY r5) {
        int i = this.A01;
        C89654ea r3 = (C89654ea) this.A00;
        if (i != 0) {
            r3.BjL();
            r3.A05.A0I(R.string.f11nameremoved, 0);
            r3.startActivity(C18300x5.A07(r3).setAction("com.whatsapp.intent.action.NEWSLETTER"));
            return;
        }
        r3.A05.A0S(new C70023Zo(r3, 32));
    }

    public void onError(Throwable th) {
        if (this.A01 != 0) {
            C89654ea r1 = (C89654ea) this.A00;
            r1.BjL();
            r1.Bot(R.string.f11nameremoved);
            return;
        }
        C162457s7.A0J(th, 0);
        C89654ea r3 = (C89654ea) this.A00;
        r3.A05.A0S(new C70023Zo(r3, 31));
    }
}
