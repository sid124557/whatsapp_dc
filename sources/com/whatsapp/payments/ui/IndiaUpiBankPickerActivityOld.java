package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass5Yj;
import X.AnonymousClass956;
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
import X.C191759Gi;
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
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class IndiaUpiBankPickerActivityOld extends C191099Bh {
    public View A00;
    public LinearLayout A01;
    public TextView A02;
    public RecyclerView A03;
    public ShimmerFrameLayout A04;
    public ShimmerFrameLayout A05;
    public C153607bd A06;
    public AnonymousClass956 A07;
    public AnonymousClass956 A08;
    public C191759Gi A09;
    public C105225Ub A0A;
    public C54722pB A0B;
    public String A0C;
    public ArrayList A0D;
    public List A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public final C134246ig A0I;
    public final C160757oG A0J;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1899593h.A0h(this);
        File file = new File(getCacheDir(), "BankLogos");
        if (!file.mkdirs() && !file.isDirectory()) {
            this.A0J.A06("create unable to create bank logos cache directory");
        }
        this.A0B = new C47432dF(this.A05, this.A05, this.A0D, file, "india-upi-bank-picker-activity").A01();
        setContentView((int) R.layout.f8nameremoved);
        A7L(R.string.f11nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved), R.id.data_layout);
        C620733j r10 = this.A00;
        this.A0A = new C105225Ub(this, findViewById(R.id.search_holder), new AnonymousClass9UH(this, 1), C1899593h.A07(this), r10);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0B(R.string.f11nameremoved);
        }
        this.A05 = (ShimmerFrameLayout) findViewById(R.id.grid_view_shimmer_layout);
        this.A04 = (ShimmerFrameLayout) findViewById(R.id.list_view_shimmer_layout);
        this.A02 = C18310x6.A0L(this, R.id.bank_picker_empty_tv);
        this.A00 = findViewById(R.id.popular_banks_group);
        this.A01 = (LinearLayout) findViewById(R.id.list_items_layout);
        AnonymousClass002.A09(findViewById(R.id.grid_view_title), R.id.header_text).setText(R.string.f11nameremoved);
        this.A03 = (RecyclerView) findViewById(R.id.bank_picker_list);
        this.A08 = new AnonymousClass956(this, false);
        this.A07 = new AnonymousClass956(this, true);
        this.A03.setAdapter(this.A08);
        ((RecyclerView) findViewById(R.id.grid_view)).setAdapter(this.A07);
        A7Y(AnonymousClass001.A0s(), false);
        C153607bd r1 = this.A0L.A04;
        this.A06 = r1;
        r1.A01("upi-bank-picker");
        this.A0S.Bq0();
        this.A0H = false;
        this.A03.A0q(new C203829oN(this, 1));
        C134246ig r2 = this.A0I;
        r2.A0Y = this.A0b;
        r2.A0b = "nav_bank_select";
        r2.A0a = this.A0e;
        C1899593h.A1B(r2, 0);
        r2.A01 = Boolean.valueOf(this.A0I.A0G("add_bank"));
        r2.A02 = Boolean.valueOf(this.A0H);
        AnonymousClass97T.A0t(r2, this);
        this.A0P.A0B();
    }

    public void A5r() {
        if (!this.A0G) {
            this.A0G = true;
            C88834as A0I2 = C18280x3.A0I(this);
            C64333Db r2 = A0I2.A4Z;
            C1899593h.A15(r2, this);
            C107695bk r1 = r2.A00;
            C1899593h.A0z(r2, r1, this, C1899593h.A0W(r2, r1, this));
            AnonymousClass97T.A0h(A0I2, r2, r1, this);
            AnonymousClass97T.A0i(A0I2, r2, r1, this, C1899693i.A0Y(r2));
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
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
        if (i != R.string.f11nameremoved) {
            A7H();
            finish();
        }
    }

    public final void A7Z(Integer num) {
        C134246ig r1 = this.A0I;
        AnonymousClass97T.A0u(r1, this, "nav_bank_select");
        r1.A08 = AnonymousClass001.A0f();
        r1.A0a = this.A0e;
        r1.A07 = num;
        r1.A02 = Boolean.valueOf(this.A0H);
        AnonymousClass97T.A0t(r1, this);
    }

    public void onBackPressed() {
        if (this.A0A.A03()) {
            this.A0A.A01(true);
            this.A0I.A0P = this.A0C;
            A7Z(1);
            return;
        }
        A7Z(1);
        A7J();
    }

    public boolean onSearchRequested() {
        this.A0I.A03 = Boolean.TRUE;
        this.A0A.A02(false);
        DisplayMetrics A0B2 = AnonymousClass000.A0B(this);
        C107555bV.A03(this.A0A.A02, (int) TypedValue.applyDimension(1, 16.0f, A0B2), 0);
        C107555bV.A03(this.A0A.A04.findViewById(R.id.search_back), (int) TypedValue.applyDimension(1, 8.0f, A0B2), 0);
        C105225Ub r2 = this.A0A;
        String string = getString(R.string.f11nameremoved);
        SearchView searchView = r2.A02;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        C204249p3.A02(findViewById(R.id.search_back), this, 39);
        A7Z(65);
        return false;
    }

    public IndiaUpiBankPickerActivityOld(int i) {
        this.A0G = false;
        C204019og.A00(this, 51);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass97T.A0e(this, menu.add(0, R.id.menuitem_search, 0, this.A00.A0C(R.string.f11nameremoved)), R.drawable.ic_action_search);
        A7P(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C191759Gi r1 = this.A09;
        if (r1 != null) {
            r1.A0D(true);
            this.A09 = null;
        }
        this.A0B.A00();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_help) {
            A7N(R.string.f11nameremoved, "nav_bank_select", "payments:bank-select");
        } else if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == 16908332) {
            this.A0J.A04("action bar home");
            A7Z(1);
            A7J();
            return true;
        }
        return true;
    }

    public IndiaUpiBankPickerActivityOld() {
        this(0);
        this.A0J = C160757oG.A00("IndiaUpiBankPickerActivity", "onboarding", "IN");
        this.A0I = new C134246ig();
    }
}
