package X;

import android.content.Context;
import android.view.TextureView;

/* renamed from: X.944  reason: invalid class name */
public class AnonymousClass944 extends TextureView {
    public int A00;
    public int A01;
    public boolean A02;

    public void onMeasure(int i, int i2) {
        double d;
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.A02) {
            double d2 = (double) measuredWidth;
            double d3 = (double) measuredHeight;
            int i4 = this.A01;
            double d4 = (double) i4;
            int i5 = this.A00;
            double d5 = (double) i5;
            double d6 = d4 / d5;
            if (Math.min(Math.abs((d2 / d3) - d6), Math.abs((d3 / d2) - d6)) > 0.01d) {
                boolean z = true;
                boolean z2 = false;
                if (measuredWidth > measuredHeight) {
                    z2 = true;
                }
                if (i4 <= i5) {
                    z = false;
                }
                if (z2 == z) {
                    d = Math.max(d2 / d4, d3 / d5);
                    if (d < 1.0d) {
                        d = 1.0d / d;
                    }
                    i3 = (int) (d4 * d);
                } else {
                    double max = Math.max(d2 / d5, d3 / d4);
                    if (max < 1.0d) {
                        max = 1.0d / max;
                    }
                    i3 = (int) (d5 * d);
                    i5 = i4;
                }
                setMeasuredDimension(i3, (int) (d * ((double) i5)));
            }
        }
    }

    public AnonymousClass944(Context context) {
        super(context);
    }
}
