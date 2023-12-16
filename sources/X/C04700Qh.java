package X;

import java.util.Arrays;

/* renamed from: X.0Qh  reason: invalid class name and case insensitive filesystem */
public class C04700Qh {
    public static int A0C = 1;
    public float A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public C02300Fq A06;
    public boolean A07;
    public boolean A08 = false;
    public float[] A09 = new float[9];
    public float[] A0A = new float[9];
    public C07790cp[] A0B = new C07790cp[16];

    public void A00() {
        this.A06 = C02300Fq.UNKNOWN;
        this.A04 = 0;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = 0.0f;
        this.A08 = false;
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2] = null;
        }
        this.A03 = 0;
        this.A05 = 0;
        this.A07 = false;
        Arrays.fill(this.A09, 0.0f);
    }

    public final void A02(C07790cp r4) {
        int i = 0;
        while (true) {
            int i2 = this.A03;
            if (i >= i2) {
                C07790cp[] r1 = this.A0B;
                int length = r1.length;
                if (i2 >= length) {
                    r1 = (C07790cp[]) Arrays.copyOf(r1, length * 2);
                    this.A0B = r1;
                }
                int i3 = this.A03;
                r1[i3] = r4;
                this.A03 = i3 + 1;
                return;
            } else if (this.A0B[i] != r4) {
                i++;
            } else {
                return;
            }
        }
    }

    public void A01(float f) {
        this.A00 = f;
        this.A08 = true;
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            C07790cp r3 = this.A0B[i2];
            C17070uW r2 = r3.A01;
            r3.A00 += r2.B3n(this) * f;
            r2.Bj2(this, false);
        }
        this.A03 = 0;
    }

    public final void A03(C07790cp r6) {
        int i = this.A03;
        int i2 = 0;
        while (i2 < i) {
            C07790cp[] r2 = this.A0B;
            if (r2[i2] != r6) {
                i2++;
            } else {
                while (true) {
                    int i3 = i - 1;
                    if (i2 < i3) {
                        int i4 = i2 + 1;
                        r2[i2] = r2[i4];
                        i2 = i4;
                    } else {
                        this.A03 = i3;
                        return;
                    }
                }
            }
        }
    }

    public final void A04(C07790cp r5) {
        int i = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0B[i2].A03(r5, false);
        }
        this.A03 = 0;
    }

    public String toString() {
        return AnonymousClass000.A0h(AnonymousClass000.A0l(""), this.A02);
    }

    public C04700Qh(C02300Fq r4) {
        this.A06 = r4;
    }
}
