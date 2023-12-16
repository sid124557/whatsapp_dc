package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.7Pj  reason: invalid class name and case insensitive filesystem */
public final class C150137Pj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final ViewTreeObserver.OnGlobalLayoutListener A05;
    public final GridLayoutManager A06;
    public final RecyclerView A07;
    public final C125306Hh A08;

    public C150137Pj(Context context, ViewGroup viewGroup, RecyclerView recyclerView, C125306Hh r8) {
        int i;
        this.A07 = recyclerView;
        this.A08 = r8;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04 = dimensionPixelSize;
        if (viewGroup != null) {
            i = viewGroup.getWidth();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C111095hX.A02(context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        }
        this.A03 = i;
        this.A05 = new AnonymousClass92I(this, 14);
        int i2 = i / dimensionPixelSize;
        this.A00 = i2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2 <= 0 ? 1 : i2);
        this.A06 = gridLayoutManager;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        AnonymousClass6Hq r0 = new AnonymousClass6Hq(this);
        if (recyclerView != null) {
            recyclerView.A0o(r0);
            recyclerView.setItemAnimator((AnonymousClass0UY) null);
        }
    }
}
