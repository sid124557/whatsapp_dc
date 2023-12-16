package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09E  reason: invalid class name */
public class AnonymousClass09E extends C011209g {
    public int A00 = 0;
    public int A01 = 0;
    public C03850Lu A02;
    public boolean A03 = true;

    public void A0D(String str) {
        int i = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        i = Integer.MIN_VALUE;
                        break;
                    } else {
                        return;
                    }
                case 100571:
                    if (str.equals("end")) {
                        this.A01 = 1;
                        return;
                    }
                    return;
                case 109757538:
                    if (str.equals("start")) {
                        this.A01 = -1;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        this.A01 = i;
    }

    public void A02() {
        C03850Lu r0 = this.A02;
        if (r0 != null) {
            r0.A01.A06((RecyclerView) null);
        }
    }

    public float A06(DisplayMetrics displayMetrics) {
        float f = 25.0f / ((float) displayMetrics.densityDpi);
        if (!this.A03) {
            return f * 0.1f;
        }
        return f;
    }

    public int A07() {
        return this.A01;
    }

    public int A08() {
        return this.A01;
    }

    public int A0A(int i, int i2, int i3, int i4, int i5) {
        if (this.A01 == Integer.MIN_VALUE) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
        return super.A0A(i, i2, i3, i4, i5);
    }

    public int A0B(View view, int i) {
        int i2;
        C06440Xs r0 = this.A02;
        if (r0 == null || !r0.A17()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0B(view, i) + i2;
    }

    public int A0C(View view, int i) {
        int i2;
        C06440Xs r0 = this.A02;
        if (r0 == null || !r0.A18()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0C(view, i) + i2;
    }

    public AnonymousClass09E(Context context) {
        super(context);
    }

    public void A03() {
        super.A03();
        C03850Lu r3 = this.A02;
        if (r3 != null) {
            r3.A02.A02 = null;
            r3.A00.A0q(new C17610vr(r3, 3));
        }
    }
}
