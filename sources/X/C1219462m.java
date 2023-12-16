package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.62m  reason: invalid class name and case insensitive filesystem */
public final class C1219462m extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $selectedCategoryId;
    public final /* synthetic */ CatalogCategoryTabsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1219462m(CatalogCategoryTabsActivity catalogCategoryTabsActivity, String str) {
        super(1);
        this.this$0 = catalogCategoryTabsActivity;
        this.$selectedCategoryId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        Log.d("WACC CatalogCategoryTabsActivity setupTabs");
        C87494Td r6 = new C87494Td(this.this$0.getSupportFragmentManager());
        C18280x3.A12(list);
        r6.A00 = list;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.this$0;
        View A0L = C18290x4.A0L(catalogCategoryTabsActivity, R.id.view_pager);
        CatalogCategoryTabsActivity catalogCategoryTabsActivity2 = this.this$0;
        String str = this.$selectedCategoryId;
        ViewPager viewPager = (ViewPager) A0L;
        catalogCategoryTabsActivity2.A04.getValue();
        C162457s7.A0J(str, 1);
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C162457s7.A0P(((AnonymousClass7ZH) it.next()).A01, str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        viewPager.setAdapter(r6);
        viewPager.setCurrentItem(i);
        catalogCategoryTabsActivity.A00 = viewPager;
        View A00 = C005205m.A00(this.this$0, R.id.tabs);
        CatalogCategoryTabsActivity catalogCategoryTabsActivity3 = this.this$0;
        TabLayout tabLayout = (TabLayout) A00;
        ViewPager viewPager2 = catalogCategoryTabsActivity3.A00;
        if (viewPager2 == null) {
            throw C18270x1.A0S("viewPager");
        }
        tabLayout.setupWithViewPager(viewPager2);
        C86614Ku.A1T(new C111065hU(tabLayout, catalogCategoryTabsActivity3, list), tabLayout.A0j);
        Iterator it2 = C175708Zk.A02(0, tabLayout.A0k.size()).iterator();
        while (it2.hasNext()) {
            int A002 = ((C72013d2) it2).A00();
            View childAt = tabLayout.getChildAt(0);
            C162457s7.A0K(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) childAt).getChildAt(A002);
            ViewGroup.MarginLayoutParams A0O = C86634Kw.A0O(childAt2);
            int dimensionPixelSize = C18290x4.A0G(tabLayout).getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize2 = C18290x4.A0G(tabLayout).getDimensionPixelSize(R.dimen.f6nameremoved);
            if (A002 == 0) {
                int dimensionPixelSize3 = C18290x4.A0G(tabLayout).getDimensionPixelSize(R.dimen.f6nameremoved);
                if (C102805Ki.A00(catalogCategoryTabsActivity3.A00)) {
                    A0O.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2);
                } else {
                    A0O.setMargins(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                }
            } else {
                A0O.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            }
            childAt2.requestLayout();
        }
        return C59022wD.A00;
    }
}
