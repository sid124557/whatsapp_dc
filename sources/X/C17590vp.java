package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0vp  reason: invalid class name and case insensitive filesystem */
public class C17590vp extends C011209g {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17590vp(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A05(View view, C04300Nr r8, AnonymousClass0Q1 r9) {
        int i = this.A01;
        AnonymousClass09Z r1 = (AnonymousClass09Z) this.A00;
        RecyclerView recyclerView = r1.A01;
        if (i == 0 || recyclerView != null) {
            int[] A07 = r1.A07(view, recyclerView.getLayoutManager());
            int i2 = A07[0];
            int i3 = A07[1];
            int ceil = (int) Math.ceil(((double) A09(Math.max(Math.abs(i2), Math.abs(i3)))) / 0.3356d);
            if (ceil > 0) {
                DecelerateInterpolator decelerateInterpolator = this.A06;
                r8.A02 = i2;
                r8.A03 = i3;
                r8.A01 = ceil;
                r8.A05 = decelerateInterpolator;
                r8.A06 = true;
            }
        }
    }

    public float A06(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public int A09(int i) {
        if (this.A01 != 0) {
            return super.A09(i);
        }
        return Math.min(100, super.A09(i));
    }
}
