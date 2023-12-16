package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.util.Log;

/* renamed from: X.5fM  reason: invalid class name and case insensitive filesystem */
public class C109895fM implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public final /* synthetic */ RecyclerFastScroller A03;

    public C109895fM(RecyclerFastScroller recyclerFastScroller) {
        this.A03 = recyclerFastScroller;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int totalScrollRange;
        int i;
        int i2;
        AppBarLayout appBarLayout;
        if (motionEvent.getActionMasked() == 0) {
            RecyclerFastScroller recyclerFastScroller = this.A03;
            recyclerFastScroller.A03.setPressed(true);
            C182998pK r0 = recyclerFastScroller.A08;
            if (r0 != null) {
                r0.Brc();
            }
            View view2 = recyclerFastScroller.A02;
            if (!(view2 == null || view2.getVisibility() == 0)) {
                recyclerFastScroller.A02.setVisibility(0);
                AlphaAnimation A0C = AnonymousClass4L0.A0C(0.0f, 1.0f);
                A0C.setDuration(100);
                recyclerFastScroller.A02.startAnimation(A0C);
            }
            recyclerFastScroller.A06.A0T();
            recyclerFastScroller.A06.startNestedScroll(2);
            this.A00 = (float) recyclerFastScroller.getVisibleHeight();
            this.A01 = motionEvent.getY() + ((float) recyclerFastScroller.A03.getTop());
            i = recyclerFastScroller.A00;
        } else if (motionEvent.getActionMasked() == 2) {
            RecyclerFastScroller recyclerFastScroller2 = this.A03;
            View view3 = recyclerFastScroller2.A02;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            int A002 = recyclerFastScroller2.getVisibleHeight();
            float f = this.A00;
            float f2 = (float) A002;
            float y = (f - f2) + motionEvent.getY() + ((float) recyclerFastScroller2.A03.getTop());
            float f3 = (y - this.A01) / f;
            int computeVerticalScrollRange = recyclerFastScroller2.A06.computeVerticalScrollRange();
            AppBarLayout appBarLayout2 = recyclerFastScroller2.A07;
            if (appBarLayout2 == null) {
                totalScrollRange = 0;
            } else {
                totalScrollRange = appBarLayout2.getTotalScrollRange();
            }
            int i3 = (int) (f3 * ((float) (computeVerticalScrollRange + totalScrollRange)));
            if (!(recyclerFastScroller2.A04 == null || (appBarLayout = recyclerFastScroller2.A07) == null)) {
                appBarLayout.getLayoutParams();
            }
            if (!(recyclerFastScroller2.A06 == null || recyclerFastScroller2.A03 == null)) {
                int abs = Math.abs(i3);
                if (abs > recyclerFastScroller2.getVisibleHeight()) {
                    int A0G = (int) ((((float) recyclerFastScroller2.A06.A0N.A0G()) * Math.min(Math.max(0.0f, y), f2)) / f2);
                    recyclerFastScroller2.A06.A0Z(A0G);
                    if (A0G != 0) {
                        i2 = abs % A002;
                    } else {
                        i2 = 0;
                    }
                } else {
                    i2 = (i3 + this.A02) - recyclerFastScroller2.A00;
                }
                try {
                    recyclerFastScroller2.A06.scrollBy(0, i2);
                } catch (Throwable th) {
                    Log.e(th);
                }
            }
            this.A01 = y;
            i = recyclerFastScroller2.A00;
        } else {
            if (motionEvent.getActionMasked() == 1) {
                this.A01 = -1.0f;
                RecyclerFastScroller recyclerFastScroller3 = this.A03;
                recyclerFastScroller3.A06.stopNestedScroll();
                recyclerFastScroller3.A03.setPressed(false);
                recyclerFastScroller3.A01();
                View view4 = recyclerFastScroller3.A02;
                if (!(view4 == null || view4.getVisibility() == 4)) {
                    recyclerFastScroller3.A02.setVisibility(4);
                    AlphaAnimation A0C2 = AnonymousClass4L0.A0C(1.0f, 0.0f);
                    A0C2.setDuration(300);
                    recyclerFastScroller3.A02.startAnimation(A0C2);
                    return true;
                }
            }
            return true;
        }
        this.A02 = i;
        return true;
    }
}
