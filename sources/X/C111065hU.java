package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5hU  reason: invalid class name and case insensitive filesystem */
public final class C111065hU implements C183978qy {
    public final /* synthetic */ TabLayout A00;
    public final /* synthetic */ CatalogCategoryTabsActivity A01;
    public final /* synthetic */ List A02;

    public C111065hU(TabLayout tabLayout, CatalogCategoryTabsActivity catalogCategoryTabsActivity, List list) {
        this.A02 = list;
        this.A00 = tabLayout;
        this.A01 = catalogCategoryTabsActivity;
    }

    public void Bdv(AnonymousClass5T2 r8) {
        List list = this.A02;
        TabLayout tabLayout = this.A00;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.A01;
        AnonymousClass7ZH r3 = (AnonymousClass7ZH) list.get(tabLayout.getSelectedTabPosition());
        ViewPager viewPager = catalogCategoryTabsActivity.A00;
        if (viewPager == null) {
            throw C18270x1.A0S("viewPager");
        }
        viewPager.A0F(tabLayout.getSelectedTabPosition(), false);
        String str = r3.A01;
        UserJid userJid = r3.A00;
        boolean z = r3.A03;
        ((CatalogCategoryTabsViewModel) catalogCategoryTabsActivity.A04.getValue()).A01.A01(userJid, str, 1, 3, tabLayout.getSelectedTabPosition(), z);
    }

    public void Bdu(AnonymousClass5T2 r1) {
    }
}
