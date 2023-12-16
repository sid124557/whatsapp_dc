package X;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.6mF  reason: invalid class name and case insensitive filesystem */
public class C136226mF extends AnonymousClass6mM {
    public final C06440Xs A00;
    public final RecyclerView A01;
    public final AnonymousClass6HY A02;
    public final C105355Up A03;

    public final int A0A() {
        View view = this.A0H;
        Resources resources = view.getResources();
        return (int) Math.floor((double) (((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass0YH.A03(view) + AnonymousClass0YH.A02(view)))) / C86664Kz.A01(resources, R.dimen.f6nameremoved)));
    }

    public C136226mF(View view, C105355Up r5) {
        super(view);
        C06440Xs gridLayoutManager;
        this.A03 = r5;
        this.A01 = (RecyclerView) C06560Yg.A02(view, R.id.popular_categories_recycler_view);
        boolean A022 = r5.A02();
        view.getContext();
        if (A022) {
            gridLayoutManager = new LinearLayoutManager(0);
        } else {
            gridLayoutManager = new GridLayoutManager(A0A());
        }
        this.A00 = gridLayoutManager;
        Resources resources = view.getResources();
        RecyclerView recyclerView = this.A01;
        recyclerView.A0o(new AnonymousClass6Hr(resources, this));
        recyclerView.setLayoutManager(this.A00);
        if (!r5.A02()) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass92I(this, 2));
        }
        this.A02 = new AnonymousClass6HY();
    }
}
