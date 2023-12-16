package X;

/* renamed from: X.7pW  reason: invalid class name and case insensitive filesystem */
public class C161377pW {
    public static final C183618qL[] A03 = new C183618qL[0];
    public int A00;
    public boolean A01;
    public C183618qL[] A02;

    public static C183618qL[] A01(C183618qL[] r2) {
        if (r2.length < 1) {
            return A03;
        }
        return (C183618qL[]) r2.clone();
    }

    public C183618qL A02(int i) {
        int i2 = this.A00;
        if (i < i2) {
            return this.A02[i];
        }
        throw AnonymousClass6C7.A0T(" >= ", C18320x8.A0j(i), i2);
    }

    public void A03(C183618qL r7) {
        if (r7 != null) {
            C183618qL[] r5 = this.A02;
            int length = r5.length;
            int i = this.A00;
            boolean z = true;
            int i2 = i + 1;
            if (i2 <= length) {
                z = false;
            }
            if (this.A01 || z) {
                C183618qL[] r1 = new C183618qL[Math.max(length, (i2 >> 1) + i2)];
                System.arraycopy(r5, 0, r1, 0, i);
                this.A02 = r1;
                r5 = r1;
                this.A01 = false;
            }
            r5[this.A00] = r7;
            this.A00 = i2;
            return;
        }
        throw AnonymousClass001.A0g("'element' cannot be null");
    }

    public C183618qL[] A04() {
        int i = this.A00;
        if (i == 0) {
            return A03;
        }
        C183618qL[] r2 = this.A02;
        if (r2.length == i) {
            this.A01 = true;
            return r2;
        }
        C183618qL[] r1 = new C183618qL[i];
        System.arraycopy(r2, 0, r1, 0, i);
        return r1;
    }

    public C161377pW(int i) {
        C183618qL[] r0;
        if (i >= 0) {
            if (i == 0) {
                r0 = A03;
            } else {
                r0 = new C183618qL[i];
            }
            this.A02 = r0;
            this.A00 = 0;
            this.A01 = false;
            return;
        }
        throw AnonymousClass001.A0c("'initialCapacity' must not be negative");
    }

    public static C176948dp A00(C183618qL r0, C161377pW r1) {
        r1.A03(r0);
        return new C176948dp(r1);
    }

    public C161377pW() {
        this(10);
    }
}
