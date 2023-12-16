package X;

import java.util.Iterator;

/* renamed from: X.82u  reason: invalid class name and case insensitive filesystem */
public final class C1678382u implements C188148yO {
    public final int A00;
    public final C142446xD A01;
    public final C151077Ti A02;
    public final C157827iw A03;
    public final AnonymousClass4GQ A04;
    public final AnonymousClass4GQ A05;

    public C142446xD BBh() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C188148yO r3 = (C188148yO) obj;
        C162457s7.A0J(r3, 1);
        return r3.BBh().compareTo(this.A01);
    }

    public void run() {
        Object next;
        int i = this.A00;
        Iterator it = C829345m.A05(new C175198Xl(this), C73723fy.A0R(new AnonymousClass8Ls(i, 0, -1))).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
        }
        AnonymousClass3Z6 r2 = (AnonymousClass3Z6) next;
        if (r2 == null) {
            this.A05.invoke((Object) null);
            return;
        }
        C172258Kh A022 = this.A03.A02(C172258Kh.A00((C172258Kh) r2.second));
        Iterator it2 = new C175698Zj(AnonymousClass3Z6.A00(r2) + 1, i).iterator();
        while (it2.hasNext()) {
            this.A02.A00(C172258Kh.A00(A022), ((C72013d2) it2).A00());
        }
        this.A05.invoke(A022);
    }

    public C1678382u(C142446xD r1, C151077Ti r2, C157827iw r3, AnonymousClass4GQ r4, AnonymousClass4GQ r5, int i) {
        this.A00 = i;
        this.A04 = r4;
        this.A01 = r1;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
    }
}
