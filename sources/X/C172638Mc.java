package X;

import android.view.View;

/* renamed from: X.8Mc  reason: invalid class name and case insensitive filesystem */
public class C172638Mc implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final View A09;
    public final C109255eK A0A;

    public void A00(float f, float f2, float f3, float f4, long j) {
        if (!this.A06) {
            this.A00 = f3;
            this.A01 = f4;
            this.A03 = f2;
            this.A05 = System.currentTimeMillis();
            this.A02 = f;
            this.A08 = AnonymousClass001.A1W((f2 > f ? 1 : (f2 == f ? 0 : -1)));
            this.A04 = (f2 - f) / ((float) j);
            this.A06 = true;
            this.A07 = false;
            this.A09.post(this);
        }
    }

    public void run() {
        if (!this.A07) {
            float currentTimeMillis = this.A02 + (this.A04 * ((float) (System.currentTimeMillis() - this.A05)));
            C109255eK r4 = this.A0A;
            r4.A01(currentTimeMillis, this.A00, this.A01);
            float f = this.A03;
            if (currentTimeMillis == f || this.A08 == AnonymousClass001.A1W((currentTimeMillis > f ? 1 : (currentTimeMillis == f ? 0 : -1)))) {
                r4.A01(f, this.A00, this.A01);
                this.A06 = false;
                this.A07 = true;
            }
            if (!this.A07) {
                this.A09.post(this);
            }
        }
    }

    public C172638Mc(View view, C109255eK r2) {
        this.A09 = view;
        this.A0A = r2;
    }
}
