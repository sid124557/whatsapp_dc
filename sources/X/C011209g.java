package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.09g  reason: invalid class name and case insensitive filesystem */
public class C011209g extends C04690Qg {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public PointF A03;
    public boolean A04 = false;
    public final DisplayMetrics A05;
    public final DecelerateInterpolator A06 = new DecelerateInterpolator();
    public final LinearInterpolator A07 = new LinearInterpolator();

    public void A03() {
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
    }

    public int A0A(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 >= 0) {
                return 0;
            }
            return i7;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw AnonymousClass001.A0c("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int A0B(View view, int i) {
        C06440Xs r2 = this.A02;
        if (r2 == null || !r2.A17()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        return A0A((view.getLeft() - C002102g.A00(view).left) - A0T.leftMargin, view.getRight() + C002102g.A00(view).right + A0T.rightMargin, r2.A0B(), r2.A03 - r2.A0C(), i);
    }

    public int A0C(View view, int i) {
        C06440Xs r2 = this.A02;
        if (r2 == null || !r2.A18()) {
            return 0;
        }
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        return A0A((view.getTop() - C002102g.A00(view).top) - A0T.topMargin, view.getBottom() + C002102g.A00(view).bottom + A0T.bottomMargin, r2.A0D(), r2.A00 - r2.A0A(), i);
    }

    public void A02() {
    }

    public float A06(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int A07() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    public int A08() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    public C011209g(Context context) {
        this.A05 = AnonymousClass000.A0B(context);
    }

    public void A05(View view, C04300Nr r8, AnonymousClass0Q1 r9) {
        int A0B = A0B(view, A07());
        int A0C = A0C(view, A08());
        int ceil = (int) Math.ceil(((double) A09((int) Math.sqrt((double) ((A0B * A0B) + (A0C * A0C))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.A06;
            r8.A02 = -A0B;
            r8.A03 = -A0C;
            r8.A01 = ceil;
            r8.A05 = decelerateInterpolator;
            r8.A06 = true;
        }
    }

    public int A09(int i) {
        float abs = (float) Math.abs(i);
        if (!this.A04) {
            this.A00 = A06(this.A05);
            this.A04 = true;
        }
        return (int) Math.ceil((double) (abs * this.A00));
    }
}
