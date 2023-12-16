package com.whatsapp.inappbugreporting;

import X.AnonymousClass0R8;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YG;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass4SG;
import X.AnonymousClass4XE;
import X.AnonymousClass4XY;
import X.AnonymousClass5B9;
import X.AnonymousClass5UY;
import X.AnonymousClass6Ho;
import X.AnonymousClass8YC;
import X.C06130Wj;
import X.C107695bk;
import X.C134796jd;
import X.C134806je;
import X.C134816jf;
import X.C134826jg;
import X.C134836jh;
import X.C134846ji;
import X.C134856jj;
import X.C134866jk;
import X.C134876jl;
import X.C134886jm;
import X.C134896jn;
import X.C134906jo;
import X.C134916jp;
import X.C134926jq;
import X.C134936jr;
import X.C134946js;
import X.C134956jt;
import X.C134966ju;
import X.C134976jv;
import X.C134986jw;
import X.C140036t3;
import X.C149077Kv;
import X.C162457s7;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C1892890s;
import X.C64333Db;
import X.C86604Kt;
import X.C89644eZ;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.search.WDSSearchBar;

public final class BugReportingCategoriesActivity extends C89644eZ {
    public RecyclerView A00;
    public AnonymousClass4XE A01;
    public AnonymousClass5B9 A02;
    public WDSSearchBar A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A02 = (AnonymousClass5B9) r1.A1O.get();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            MenuItem add = menu.add(0, R.id.menuitem_search, 0, getString(R.string.f11nameremoved));
            C162457s7.A0D(add);
            add.setIcon(R.drawable.ic_action_search);
            add.setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public BugReportingCategoriesActivity(int i) {
        this.A04 = false;
        C86604Kt.A1K(this, 48);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        WDSSearchBar wDSSearchBar = (WDSSearchBar) C18290x4.A0N(this, R.id.search_bar);
        this.A03 = wDSSearchBar;
        if (wDSSearchBar == null) {
            throw C18270x1.A0S("wdsSearchBar");
        }
        wDSSearchBar.A07.setTrailingButtonIcon(C140036t3.A00);
        WDSSearchBar wDSSearchBar2 = this.A03;
        if (wDSSearchBar2 == null) {
            throw C18270x1.A0S("wdsSearchBar");
        }
        setSupportActionBar(wDSSearchBar2.A06);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0J(getString(R.string.f11nameremoved));
        }
        RecyclerView recyclerView = (RecyclerView) C18290x4.A0L(this, R.id.category_list);
        C18320x8.A19(recyclerView, 1);
        recyclerView.A0h = true;
        AnonymousClass4XY r2 = new AnonymousClass4XY(recyclerView.getContext());
        int A042 = AnonymousClass0Y8.A04(this, R.color.f5nameremoved);
        r2.A00 = A042;
        Drawable A012 = C06130Wj.A01(r2.A04);
        r2.A04 = A012;
        AnonymousClass0YG.A06(A012, A042);
        r2.A03 = 1;
        r2.A05 = false;
        recyclerView.A0o(r2);
        this.A00 = recyclerView;
        if (this.A02 != null) {
            C149077Kv[] r22 = new C149077Kv[20];
            r22[0] = C134796jd.A00;
            r22[1] = C134806je.A00;
            r22[2] = C134886jm.A00;
            r22[3] = C134826jg.A00;
            r22[4] = C134936jr.A00;
            r22[5] = C134846ji.A00;
            r22[6] = C134816jf.A00;
            r22[7] = C134946js.A00;
            r22[8] = C134896jn.A00;
            r22[9] = C134926jq.A00;
            r22[10] = C134856jj.A00;
            r22[11] = C134876jl.A00;
            r22[12] = C134836jh.A00;
            r22[13] = C134966ju.A00;
            r22[14] = C134986jw.A00;
            r22[15] = C134976jv.A00;
            r22[16] = C134866jk.A00;
            r22[17] = C134956jt.A00;
            r22[18] = C134916jp.A00;
            AnonymousClass4XE r1 = new AnonymousClass4XE(AnonymousClass0x9.A19(C134906jo.A00, r22, 19), new AnonymousClass8YC(this));
            this.A01 = r1;
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 == null) {
                throw C18270x1.A0S("categoryRecyclerView");
            }
            recyclerView2.setAdapter(r1);
            WaTextView waTextView = (WaTextView) findViewById(R.id.choose_category_hint_text_view);
            AnonymousClass5UY A1p = AnonymousClass1Ha.A1p(this, R.id.no_search_result_text_view);
            AnonymousClass4XE r12 = this.A01;
            if (r12 == null) {
                throw C18270x1.A0S("bugCategoryListAdapter");
            }
            r12.BiZ(new AnonymousClass6Ho(waTextView, this, A1p));
            WDSSearchBar wDSSearchBar3 = this.A03;
            if (wDSSearchBar3 == null) {
                throw C18270x1.A0S("wdsSearchBar");
            }
            wDSSearchBar3.A07.setOnQueryTextChangeListener(new C1892890s(this, 1));
            return;
        }
        throw C18270x1.A0S("bugCategoryFactory");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == R.id.menuitem_search) {
            WDSSearchBar wDSSearchBar = this.A03;
            if (wDSSearchBar == null) {
                throw C18270x1.A0S("wdsSearchBar");
            }
            wDSSearchBar.A01();
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BugReportingCategoriesActivity() {
        this(0);
    }
}
