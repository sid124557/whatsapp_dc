package X;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.5s9  reason: invalid class name and case insensitive filesystem */
public class C117575s9 implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public Matrix A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float[] A0C = AnonymousClass4L0.A0T();
    public final View A0D;
    public final OverScroller A0E;
    public final C177678gG A0F;

    public void run() {
        boolean z;
        int i;
        int i2;
        if (!this.A08) {
            if (!this.A0B) {
                if (this.A09) {
                    this.A0E.forceFinished(true);
                    this.A00 = 0.0f;
                }
                this.A09 = false;
                this.A0B = true;
            }
            OverScroller overScroller = this.A0E;
            if (overScroller.computeScrollOffset()) {
                float[] fArr = this.A0C;
                fArr[0] = (float) overScroller.getCurrX();
                fArr[1] = (float) overScroller.getCurrY();
                Matrix matrix = this.A06;
                if (matrix != null) {
                    matrix.mapPoints(fArr);
                }
                float f = fArr[0];
                float f2 = fArr[1];
                if (this.A0A) {
                    this.A0A = false;
                    this.A02 = f;
                    this.A03 = f2;
                }
                C177678gG r6 = this.A0F;
                float f3 = f - this.A02;
                float f4 = f2 - this.A03;
                AnonymousClass4PH r62 = (AnonymousClass4PH) r6;
                double d = r62.A02;
                long j = r62.A0J;
                float f5 = (float) j;
                r62.A02 = AnonymousClass4PH.A00(d - ((double) (f3 / f5)));
                r62.A03 = r62.A03(r62.A03 - ((double) (f4 / f5)), j);
                this.A02 = f;
                this.A03 = f2;
                z = true;
            } else {
                z = false;
            }
            double d2 = (double) this.A01;
            if (d2 < -0.01d || d2 > 0.01d) {
                long j2 = this.A05;
                int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                long uptimeMillis = SystemClock.uptimeMillis();
                if (i3 == 0) {
                    this.A05 = uptimeMillis;
                    i2 = 1;
                } else {
                    i2 = ((int) (uptimeMillis - j2)) / 10;
                    this.A05 = j2 + ((long) (i2 * 10));
                }
                float pow = (float) (d2 * Math.pow(0.9150000214576721d, (double) i2));
                this.A01 = pow;
                AnonymousClass4PH r2 = (AnonymousClass4PH) this.A0F;
                if (r2.A0I(pow + 1.0f, r2.A08, r2.A09)) {
                    z = true;
                } else {
                    this.A01 = 0.0f;
                }
            }
            double d3 = (double) this.A00;
            if (d3 < -0.01d || d3 > 0.01d) {
                long j3 = this.A04;
                int i4 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                long uptimeMillis2 = SystemClock.uptimeMillis();
                if (i4 == 0) {
                    this.A04 = uptimeMillis2;
                    i = 1;
                } else {
                    i = ((int) (uptimeMillis2 - j3)) / 10;
                    this.A04 = j3 + ((long) (i * 10));
                }
                float pow2 = (float) (d3 * Math.pow(0.8500000238418579d, (double) i));
                this.A00 = pow2;
                AnonymousClass4PH r3 = (AnonymousClass4PH) this.A0F;
                r3.A0B(r3.A0A + pow2, r3.A08, r3.A09);
            } else if (!z) {
                this.A0B = false;
                this.A07 = false;
            }
            View view = this.A0D;
            view.invalidate();
            view.postOnAnimation(this);
            return;
        }
        AnonymousClass4PH r1 = (AnonymousClass4PH) this.A0F;
        r1.A0M.A04();
        r1.A06();
    }

    public C117575s9(View view, C177678gG r4) {
        this.A0D = view;
        this.A0F = r4;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0E = overScroller;
        overScroller.setFriction(0.035f);
    }
}
