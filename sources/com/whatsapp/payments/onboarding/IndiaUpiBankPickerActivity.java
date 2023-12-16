package com.whatsapp.payments.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0R8;
import X.AnonymousClass0UY;
import X.AnonymousClass5Yj;
import X.AnonymousClass952;
import X.AnonymousClass95D;
import X.AnonymousClass97T;
import X.AnonymousClass9UH;
import X.AnonymousClass9V1;
import X.C105225Ub;
import X.C107555bV;
import X.C107695bk;
import X.C134246ig;
import X.C153607bd;
import X.C160757oG;
import X.C18280x3;
import X.C18310x6;
import X.C1899593h;
import X.C1899693i;
import X.C191099Bh;
import X.C191749Gh;
import X.C202109lO;
import X.C203829oN;
import X.C204019og;
import X.C204249p3;
import X.C47432dF;
import X.C54722pB;
import X.C620733j;
import X.C64333Db;
import X.C88834as;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class IndiaUpiBankPickerActivity extends C191099Bh implements C202109lO {
    public LinearLayout A00;
    public TextView A01;
    public RecyclerView A02;
    public ShimmerFrameLayout A03;
    public ShimmerFrameLayout A04;
    public C153607bd A05;
    public AnonymousClass95D A06;
    public C191749Gh A07;
    public C105225Ub A08;
    public C54722pB A09;
    public String A0A;
    public ArrayList A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public final C134246ig A0F;
    public final C160757oG A0G;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1899593h.A0h(this);
        File file = new File(getCacheDir(), "BankLogos");
        if (!file.mkdirs() && !file.isDirectory()) {
            this.A0G.A06("create unable to create bank logos cache directory");
        }
        this.A09 = new C47432dF(this.A05, this.A05, this.A0D, file, "india-upi-bank-picker-activity").A01();
        setContentView((int) R.layout.f8nameremoved);
        A7L(R.string.f11nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved), R.id.bank_picker_list);
        C620733j r10 = this.A00;
        this.A08 = new C105225Ub(this, findViewById(R.id.search_holder), new AnonymousClass9UH(this, 0), C1899593h.A07(this), r10);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0B(R.string.f11nameremoved);
        }
        this.A04 = (ShimmerFrameLayout) findViewById(R.id.grid_view_shimmer_layout);
        this.A03 = (ShimmerFrameLayout) findViewById(R.id.list_view_shimmer_layout);
        this.A01 = C18310x6.A0L(this, R.id.bank_picker_empty_tv);
        this.A00 = (LinearLayout) findViewById(R.id.list_items_layout);
        this.A02 = (RecyclerView) findViewById(R.id.bank_picker_list);
        AnonymousClass95D r1 = new AnonymousClass95D(this, this, this.A09, this.A0B);
        this.A06 = r1;
        this.A02.setAdapter(r1);
        RecyclerView recyclerView = this.A02;
        AnonymousClass95D r2 = this.A06;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        gridLayoutManager.A01 = new AnonymousClass952(r2);
        recyclerView.setLayoutManager(gridLayoutManager);
        this.A02.setItemAnimator((AnonymousClass0UY) null);
        A7Y(AnonymousClass001.A0s(), false);
        C153607bd r12 = this.A0L.A04;
        this.A05 = r12;
        r12.A01("upi-bank-picker");
        this.A0S.Bq0();
        this.A0E = false;
        this.A02.A0q(new C203829oN(this, 0));
        C134246ig r22 = this.A0F;
        r22.A0Y = this.A0b;
        r22.A0b = "nav_bank_select";
        r22.A0a = this.A0e;
        C1899593h.A1B(r22, 0);
        r22.A01 = Boolean.valueOf(this.A0I.A0G("add_bank"));
        r22.A02 = Boolean.valueOf(this.A0E);
        AnonymousClass97T.A0t(r22, this);
        this.A0P.A0B();
    }

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r2 = A0I.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I, r2, r1, this);
            AnonymousClass97T.A0i(A0I, r2, r1, this, C1899693i.A0Y(r2));
            AnonymousClass97T.A0m(r2, r1, this);
            AnonymousClass97T.A0o(r2, r1, this);
            AnonymousClass97T.A0n(r2, r1, this);
            this.A06 = (AnonymousClass9V1) r2.AHb.get();
            this.A01 = C1899693i.A0H(r1);
            this.A00 = C1899593h.A09(r2);
            this.A05 = AnonymousClass97T.A0Z(r1);
        }
    }

    public void A6O(int i) {
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
        if (i != R.string.f11nameremoved) {
            A7H();
            finish();
        }
    }

    public final void A7Z(Integer num) {
        C134246ig r1 = this.A0F;
        AnonymousClass97T.A0u(r1, this, "nav_bank_select");
        r1.A08 = AnonymousClass001.A0f();
        r1.A0a = this.A0e;
        r1.A07 = num;
        r1.A02 = Boolean.valueOf(this.A0E);
        AnonymousClass97T.A0t(r1, this);
    }

    public void onBackPressed() {
        if (this.A08.A03()) {
            this.A08.A01(true);
            this.A0F.A0P = this.A0A;
            A7Z(1);
            return;
        }
        A7Z(1);
        A7J();
    }

    public boolean onSearchRequested() {
        this.A0F.A03 = Boolean.TRUE;
        this.A08.A02(false);
        DisplayMetrics A0B2 = AnonymousClass000.A0B(this);
        C107555bV.A03(this.A08.A02, (int) TypedValue.applyDimension(1, 16.0f, A0B2), 0);
        C107555bV.A03(this.A08.A04.findViewById(R.id.search_back), (int) TypedValue.applyDimension(1, 8.0f, A0B2), 0);
        C105225Ub r2 = this.A08;
        String string = getString(R.string.f11nameremoved);
        SearchView searchView = r2.A02;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        C204249p3.A02(findViewById(R.id.search_back), this, 8);
        A7Z(65);
        return false;
    }

    public IndiaUpiBankPickerActivity(int i) {
        this.A0D = false;
        C204019og.A00(this, 9);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass97T.A0e(this, menu.add(0, R.id.menuitem_search, 0, this.A00.A0C(R.string.f11nameremoved)), R.drawable.ic_action_search);
        A7P(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C191749Gh r1 = this.A07;
        if (r1 != null) {
            r1.A0D(true);
            this.A07 = null;
        }
        this.A09.A00();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_help) {
            A7N(R.string.f11nameremoved, "nav_bank_select", "payments:bank-select");
        } else if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == 16908332) {
            this.A0G.A04("action bar home");
            A7Z(1);
            A7J();
            return true;
        }
        return true;
    }

    public IndiaUpiBankPickerActivity() {
        this(0);
        this.A0G = C160757oG.A00("IndiaUpiBankPickerActivity", "onboarding", "IN");
        this.A0F = new C134246ig();
    }
}
