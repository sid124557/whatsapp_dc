package X;

import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.scroller.RecyclerFastScroller;

/* renamed from: X.8Bh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C169958Bh implements C187868xw {
    public final /* synthetic */ RecyclerFastScroller A00;

    public final void BXL(AppBarLayout appBarLayout, int i) {
        RecyclerFastScroller recyclerFastScroller = this.A00;
        int i2 = -i;
        if (recyclerFastScroller.A00 != i2) {
            recyclerFastScroller.A02();
            recyclerFastScroller.A00 = i2;
        }
    }

    public /* synthetic */ C169958Bh(RecyclerFastScroller recyclerFastScroller) {
        this.A00 = recyclerFastScroller;
    }
}
