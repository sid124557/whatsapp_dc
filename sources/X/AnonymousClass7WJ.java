package X;

import java.io.OutputStream;

/* renamed from: X.7WJ  reason: invalid class name */
public final class AnonymousClass7WJ {
    public boolean A00;
    public final C151967Wz A01;
    public final /* synthetic */ C172228Ke A02;

    public AnonymousClass7WJ(C151967Wz r1, C172228Ke r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public OutputStream A00() {
        C140376td r0;
        synchronized (this.A02) {
            C151967Wz r1 = this.A01;
            if (r1.A01 == this) {
                r0 = new C140376td(this, AnonymousClass0x9.A0h(r1.A01()));
            } else {
                throw AnonymousClass6CA.A0O();
            }
        }
        return r0;
    }

    public void A01() {
        boolean z = this.A00;
        C172228Ke r1 = this.A02;
        if (z) {
            C172228Ke.A02(this, r1, false);
            r1.A0D(this.A01.A03);
            return;
        }
        C172228Ke.A02(this, r1, true);
    }
}
