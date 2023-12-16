package com.whatsapp.catalogcategory.view.activity;

import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass4SG;
import X.AnonymousClass749;
import X.C08240dc;
import X.C107695bk;
import X.C141516vh;
import X.C162457s7;
import X.C64333Db;
import X.C86604Kt;
import X.C86664Kz;
import X.C88834as;
import X.C91454jw;
import android.os.Bundle;
import android.view.Menu;
import com.whatsapp.R;

public final class CatalogAllCategoryActivity extends C91454jw {
    public boolean A00;

    public boolean onCreateOptionsMenu(Menu menu) {
        C162457s7.A0J(menu, 0);
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3F(A2W, r2, r1, this);
        }
    }

    public CatalogAllCategoryActivity(int i) {
        this.A00 = false;
        C86604Kt.A1K(this, 30);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0J(getString(R.string.f11nameremoved));
        }
        if (bundle == null) {
            String A1J = C86664Kz.A1J(getIntent(), "category_parent_id");
            C08240dc A0J = AnonymousClass0x2.A0J(this);
            C162457s7.A0H(A1J);
            A0J.A0A(AnonymousClass749.A00(C141516vh.CATALOG_CATEGORY_FLOW, A74(), A1J), R.id.container);
            A0J.A01();
        }
    }

    public CatalogAllCategoryActivity() {
        this(0);
    }
}
