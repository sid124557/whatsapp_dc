package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7b2  reason: invalid class name and case insensitive filesystem */
public class C153317b2 {
    public static int A0C;
    public double A00;
    public double A01;
    public double A02 = 0.0d;
    public C156197gC A03;
    public CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A05;
    public boolean A06 = true;
    public final C147647Fc A07 = new C147647Fc();
    public final C147647Fc A08 = new C147647Fc();
    public final C147647Fc A09 = new C147647Fc();
    public final C158147jV A0A;
    public final String A0B;

    public double A00() {
        return this.A07.A00;
    }

    public void A01(double d) {
        this.A01 = d;
        C147647Fc r3 = this.A07;
        r3.A00 = d;
        this.A0A.A02(this.A0B);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C183778qd) it.next()).Bbv(this);
        }
        double d2 = r3.A00;
        this.A00 = d2;
        this.A09.A00 = d2;
        r3.A01 = 0.0d;
    }

    public void A02(double d) {
        if (this.A00 != d || !A04()) {
            this.A01 = this.A07.A00;
            this.A00 = d;
            this.A0A.A02(this.A0B);
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void A03(C183778qd r2) {
        if (r2 != null) {
            this.A04.add(r2);
            return;
        }
        throw AnonymousClass001.A0c("newListener is required");
    }

    public boolean A04() {
        C147647Fc r6 = this.A07;
        if (Math.abs(r6.A01) > 0.005d) {
            return false;
        }
        if (Math.abs(this.A00 - r6.A00) <= 0.005d || this.A03.A01 == 0.0d) {
            return true;
        }
        return false;
    }

    public C153317b2(C158147jV r4) {
        this.A0A = r4;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("spring:");
        int i = A0C;
        A0C = i + 1;
        this.A0B = AnonymousClass000.A0h(A0o, i);
        this.A03 = C156197gC.A02;
    }
}
