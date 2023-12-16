package X;

import java.util.Map;

/* renamed from: X.7X7  reason: invalid class name */
public class AnonymousClass7X7 {
    public C151757We A00;
    public C138276q3 A01;
    public Map A02;
    public final int A03;
    public final C157227hx A04 = new C157227hx();
    public final C182098nr A05;
    public final C182108ns A06;
    public volatile boolean A07 = false;

    public synchronized void A00() {
        if (this.A07) {
            this.A07 = false;
            C138276q3 r0 = this.A01;
            C626936e.A06(r0);
            r0.interrupt();
            this.A01 = null;
        }
    }

    public synchronized void A01() {
        if (!this.A07) {
            this.A07 = true;
            C138276q3 r0 = new C138276q3(this);
            this.A01 = r0;
            r0.start();
        }
    }

    public AnonymousClass7X7(C182098nr r2, C182108ns r3, int i) {
        this.A03 = i;
        this.A06 = r3;
        this.A05 = r2;
    }
}
