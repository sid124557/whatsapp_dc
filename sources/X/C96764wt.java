package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.4wt  reason: invalid class name and case insensitive filesystem */
public class C96764wt extends AnonymousClass6mM {
    public final View A00;
    public final C06440Xs A01;
    public final RecyclerView A02;
    public final WaTextView A03;
    public final AnonymousClass4WN A04;
    public final C105355Up A05;

    public void A07() {
        this.A02.setAdapter((AnonymousClass0R6) null);
    }

    public /* bridge */ /* synthetic */ void A09(Object obj) {
        C135966ld r3 = (C135966ld) obj;
        AnonymousClass4WN r1 = this.A04;
        r1.A00 = r3.A01;
        r1.A05();
        this.A02.setAdapter(r1);
        C18300x5.A18(this.A03, r3, 11);
        C18300x5.A18(this.A00, r3, 12);
    }

    public C96764wt(View view, AnonymousClass4WN r6, C620733j r7, C105355Up r8) {
        super(view);
        C06440Xs gridLayoutManager;
        this.A05 = r8;
        this.A03 = AnonymousClass0x7.A0L(view, R.id.title);
        this.A00 = C06560Yg.A02(view, R.id.view_all_popular_categories);
        this.A02 = C86654Ky.A0P(view, R.id.popular_categories_recycler_view);
        boolean A022 = r8.A02();
        view.getContext();
        if (A022) {
            gridLayoutManager = new LinearLayoutManager(0);
        } else {
            Resources resources = view.getResources();
            gridLayoutManager = new GridLayoutManager((int) Math.floor((double) (((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass0YH.A03(view) + AnonymousClass0YH.A02(view)))) / C86664Kz.A01(resources, R.dimen.f6nameremoved))));
        }
        this.A01 = gridLayoutManager;
        RecyclerView recyclerView = this.A02;
        recyclerView.setLayoutManager(gridLayoutManager);
        if (!this.A05.A02()) {
            C86654Ky.A1I(recyclerView, r7, view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass92L(view, 0, this));
        } else if (view instanceof LinearLayout) {
            ((LinearLayout) view).setGravity(3);
        }
        this.A04 = r6;
    }
}
