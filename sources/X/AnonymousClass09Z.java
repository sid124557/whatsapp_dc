package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09Z  reason: invalid class name */
public abstract class AnonymousClass09Z extends C04110Mv {
    public Scroller A00;
    public RecyclerView A01;
    public final AnonymousClass0O5 A02 = new C010909a(this);

    public abstract int A02(C06440Xs r1, int i, int i2);

    public abstract View A03(C06440Xs r1);

    public abstract int[] A07(View view, C06440Xs r2);

    public boolean A01(int i, int i2) {
        C011209g A04;
        int A022;
        RecyclerView recyclerView = this.A01;
        C06440Xs layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || recyclerView.A0N == null) {
            return false;
        }
        int i3 = recyclerView.A0r;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(layoutManager instanceof C16040sN) || (A04 = A04(layoutManager)) == null || (A022 = A02(layoutManager, i, i2)) == -1) {
            return false;
        }
        A04.A00 = A022;
        layoutManager.A0x(A04);
        return true;
    }

    @Deprecated
    public C011209g A04(C06440Xs r4) {
        if (!(r4 instanceof C16040sN)) {
            return null;
        }
        return new C17590vp(this.A01.getContext(), this, 1);
    }

    public void A05() {
        C06440Xs layoutManager;
        View A03;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (A03 = A03(layoutManager)) != null) {
            int[] A07 = A07(A03, layoutManager);
            int i = A07[0];
            if (i != 0 || A07[1] != 0) {
                this.A01.A0f(i, A07[1]);
            }
        }
    }

    public void A06(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0r(this.A02);
                this.A01.A0T = null;
            }
            this.A01 = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.A0T == null) {
                recyclerView.A0q(this.A02);
                RecyclerView recyclerView3 = this.A01;
                recyclerView3.A0T = this;
                this.A00 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A05();
                return;
            }
            throw AnonymousClass001.A0e("An instance of OnFlingListener already set.");
        }
    }

    public static int A00(View view, C05590Uc r4) {
        return (r4.A09(view) + (r4.A07(view) / 2)) - (r4.A04() + (r4.A05() / 2));
    }
}
