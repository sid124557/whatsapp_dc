package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3DS  reason: invalid class name */
public final class AnonymousClass3DS implements AnonymousClass66U, AnonymousClass664 {
    public final C64773Ex A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;

    public final void A00() {
        if (C56952sp.A0F(this.A02)) {
            ArrayList A0s = AnonymousClass001.A0s();
            C64773Ex r9 = this.A00;
            ArrayList A0F = r9.A0F();
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0F.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnonymousClass3ZH r1 = (AnonymousClass3ZH) next;
                if (r1.A0Y != null && r1.A0D > 0) {
                    A0s2.add(next);
                }
            }
            Iterator it2 = A0s2.iterator();
            while (it2.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it2);
                if (this.A01.A0H() > A0R.A0D) {
                    A0R.A0X = null;
                    A0R.A0Y = "";
                    A0R.A0D = 0;
                    A0s.add(A0R);
                }
            }
            r9.A0f(A0s);
        }
    }

    public AnonymousClass3DS(C64773Ex r1, C56612sH r2, AnonymousClass1VX r3) {
        C18260x0.A0V(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public String BDW() {
        return "CleanupExpiredTS";
    }

    public /* synthetic */ void BMd() {
    }

    public void BMe() {
        A00();
    }

    public void BQV() {
        A00();
    }
}
