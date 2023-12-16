package X;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.0WG  reason: invalid class name */
public abstract class AnonymousClass0WG {
    public static final Interpolator A01 = new C18250wz(1);
    public static final Interpolator A02 = new C18250wz(2);
    public int A00 = -1;

    public abstract int A02(C05570Ua r1, RecyclerView recyclerView);

    public abstract boolean A08(C05570Ua r1, C05570Ua r2, RecyclerView recyclerView);

    public static void A00(C05570Ua r3) {
        View view = r3.A0H;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            AnonymousClass0YZ.A0B(view, AnonymousClass001.A05(tag));
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, (Object) null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public int A03(RecyclerView recyclerView, int i, int i2, long j) {
        int i3 = this.A00;
        if (i3 == -1) {
            i3 = recyclerView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            this.A00 = i3;
        }
        int abs = Math.abs(i2);
        float f = (float) abs;
        float f2 = 1.0f;
        int signum = (int) (((float) (((int) Math.signum((float) i2)) * i3)) * A02.getInterpolation(Math.min(1.0f, (f * 1.0f) / ((float) i))));
        if (j <= 2000) {
            f2 = ((float) j) / 2000.0f;
        }
        int interpolation = (int) (((float) signum) * A01.getInterpolation(f2));
        if (interpolation != 0) {
            return interpolation;
        }
        if (i2 > 0) {
            return 1;
        }
        return -1;
    }

    public boolean A05() {
        return true;
    }

    public boolean A06() {
        return true;
    }

    public final int A01(C05570Ua r6, RecyclerView recyclerView) {
        int A022 = A02(r6, recyclerView);
        int A012 = AnonymousClass0YH.A01(recyclerView);
        int i = A022 & 3158064;
        if (i == 0) {
            return A022;
        }
        int i2 = A022 & (~i);
        if (A012 != 0) {
            int i3 = i >> 1;
            i2 |= -3158065 & i3;
            i = i3 & 3158064;
        }
        return i2 | (i >> 2);
    }

    public void A04(C05570Ua r1, int i) {
    }

    public boolean A07(C05570Ua r2, C05570Ua r3, RecyclerView recyclerView) {
        return true;
    }
}
