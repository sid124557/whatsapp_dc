package com.whatsapp.biz.catalog.view.activity;

import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass4SG;
import X.AnonymousClass66R;
import X.AnonymousClass6H0;
import X.AnonymousClass7ZH;
import X.AnonymousClass8VH;
import X.AnonymousClass912;
import X.C08310eF;
import X.C107695bk;
import X.C111945iw;
import X.C1219462m;
import X.C150937Su;
import X.C154297cw;
import X.C154517dI;
import X.C162457s7;
import X.C181818nN;
import X.C182058nn;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C64333Db;
import X.C86604Kt;
import X.C86644Kx;
import X.C86664Kz;
import X.C88834as;
import X.C91454jw;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

public final class CatalogCategoryTabsActivity extends C91454jw implements C181818nN, C182058nn {
    public ViewPager A00;
    public C150937Su A01;
    public C154297cw A02;
    public boolean A03;
    public final AnonymousClass66R A04;

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        CatalogSearchFragment catalogSearchFragment;
        C162457s7.A0J(intent, 0);
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("selected_category_parent_id");
        C18260x0.A0q("WACC CatalogCategoryTabsActivity onNewIntent ", stringExtra, AnonymousClass001.A0o());
        if (stringExtra != null) {
            AnonymousClass66R r1 = this.A04;
            List A0h = C86644Kx.A0h(((CatalogCategoryTabsViewModel) r1.getValue()).A00);
            if (A0h != null) {
                r1.getValue();
                Iterator it = A0h.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (C162457s7.A0P(((AnonymousClass7ZH) it.next()).A01, stringExtra)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                ViewPager viewPager = this.A00;
                if (viewPager == null) {
                    throw C18270x1.A0S("viewPager");
                }
                viewPager.setCurrentItem(i);
            }
            C08310eF A0D = getSupportFragmentManager().A0D("CategoryTabsSearchFragmentTag");
            if (A0D != null && (A0D instanceof CatalogSearchFragment) && (catalogSearchFragment = (CatalogSearchFragment) A0D) != null) {
                catalogSearchFragment.A1N(true);
            }
        }
    }

    public void A5r() {
        if (!this.A03) {
            this.A03 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3F(A2W, r2, r1, this);
            this.A01 = A2W.ABW();
            this.A02 = new C154297cw();
        }
    }

    public void BOa() {
        ((AnonymousClass6H0) this.A09.getValue()).A04.A00();
    }

    public void BT3(int i) {
        if (i == 404) {
            A6W(new AnonymousClass912(0), 0, R.string.f11nameremoved, R.string.f11nameremoved);
        }
    }

    public CatalogCategoryTabsActivity(int i) {
        this.A03 = false;
        C86604Kt.A1K(this, 12);
    }

    public void onBackPressed() {
        CatalogSearchFragment catalogSearchFragment;
        C08310eF A0D = getSupportFragmentManager().A0D("CategoryTabsSearchFragmentTag");
        if (A0D == null || !(A0D instanceof CatalogSearchFragment) || (catalogSearchFragment = (CatalogSearchFragment) A0D) == null || !catalogSearchFragment.A1O()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        C86664Kz.A0o(this, R.id.stub_toolbar_search).inflate();
        setSupportActionBar((Toolbar) C18290x4.A0N(this, R.id.toolbar));
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0B(R.string.f11nameremoved);
        }
        C150937Su r2 = this.A01;
        if (r2 != null) {
            r2.A00(new C111945iw(this), A74());
            String A1J = C86664Kz.A1J(getIntent(), "selected_category_parent_id");
            Log.d("WACC CatalogCategoryTabsActivity onCreate");
            C162457s7.A0H(A1J);
            AnonymousClass66R r3 = this.A04;
            C86604Kt.A1N(this, ((CatalogCategoryTabsViewModel) r3.getValue()).A00, new C1219462m(this, A1J), 19);
            CatalogCategoryTabsViewModel catalogCategoryTabsViewModel = (CatalogCategoryTabsViewModel) r3.getValue();
            C86644Kx.A1R(catalogCategoryTabsViewModel.A04, catalogCategoryTabsViewModel, A74(), 48);
            return;
        }
        throw C18270x1.A0S("catalogSearchManager");
    }

    public CatalogCategoryTabsActivity() {
        this(0);
        this.A04 = C154517dI.A01(new AnonymousClass8VH(this));
    }
}
