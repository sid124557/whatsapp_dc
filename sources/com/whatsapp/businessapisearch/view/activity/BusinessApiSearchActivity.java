package com.whatsapp.businessapisearch.view.activity;

import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Hf;
import X.AnonymousClass4SG;
import X.AnonymousClass5CM;
import X.AnonymousClass5ML;
import X.AnonymousClass5QU;
import X.AnonymousClass6C6;
import X.C04760Qo;
import X.C08240dc;
import X.C08310eF;
import X.C104795Sj;
import X.C105225Ub;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C57012sv;
import X.C86604Kt;
import X.C86624Kv;
import X.C89534dH;
import X.C95074sa;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel;

public class BusinessApiSearchActivity extends C89534dH {
    public Menu A00;
    public C57012sv A01;
    public AnonymousClass5ML A02;
    public BusinessApiHomeFragment A03;
    public AnonymousClass5QU A04;
    public BusinessApiSearchActivityViewModel A05;
    public C104795Sj A06;
    public C105225Ub A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public void onCreate(Bundle bundle) {
        String str;
        C08310eF r0;
        super.onCreate(bundle);
        if (AnonymousClass0x9.A1N(getIntent(), "directory_source")) {
            str = "DIRECTORY";
        } else {
            str = "BUSINESSAPISEARCH";
        }
        this.A08 = str;
        if (bundle != null) {
            this.A0A = bundle.getBoolean("arg_show_search_view", true);
        } else {
            A74();
        }
        setContentView((int) R.layout.f8nameremoved);
        Toolbar A28 = AnonymousClass1Hf.A28(this);
        AnonymousClass0R8 A2S = AnonymousClass4SG.A2S(this, A28);
        A2S.A0O(true);
        A2S.A0N(true);
        if ("DIRECTORY".equals(this.A08)) {
            setTitle(R.string.f11nameremoved);
            C105225Ub r1 = this.A07;
            if (r1 != null) {
                r1.A01(true);
            }
            A75();
        } else if (bundle != null) {
            C04760Qo r2 = getSupportFragmentManager().A0Y;
            if (r2.A05().isEmpty()) {
                r0 = null;
            } else {
                r0 = (C08310eF) r2.A05().get(AnonymousClass002.A03(r2.A05()));
            }
            if (r0 instanceof BusinessApiHomeFragment) {
                setTitle(R.string.f11nameremoved);
            }
        }
        this.A07 = new C105225Ub(this, AnonymousClass4SG.A2R(this), new AnonymousClass5CM(this, 2), A28, this.A00);
        if (this.A0A && bundle != null) {
            A78(false);
        }
        BusinessApiSearchActivityViewModel businessApiSearchActivityViewModel = (BusinessApiSearchActivityViewModel) AnonymousClass0x9.A0H(this).A01(BusinessApiSearchActivityViewModel.class);
        this.A05 = businessApiSearchActivityViewModel;
        AnonymousClass6C6.A01(this, businessApiSearchActivityViewModel.A01, 29);
    }

    public void A74() {
        String str = this.A08;
        int A012 = C18280x3.A01("BUSINESSAPISEARCH".equals(str) ? 1 : 0);
        BusinessApiHomeFragment businessApiHomeFragment = new BusinessApiHomeFragment();
        Bundle A082 = AnonymousClass002.A08();
        A082.putInt("arg_home_view_state", A012);
        A082.putString("entrypoint_type", str);
        businessApiHomeFragment.A0u(A082);
        A77(businessApiHomeFragment, false);
        if ("DIRECTORY".equals(this.A08)) {
            setTitle(R.string.f11nameremoved);
            A75();
            return;
        }
        setTitle(R.string.f11nameremoved);
    }

    public void A75() {
        Menu menu = this.A00;
        if (menu != null && menu.findItem(1) == null) {
            C86624Kv.A0q(this.A00.add(0, 1, 0, getString(R.string.f11nameremoved)), R.drawable.ic_action_search);
        }
        this.A09 = true;
    }

    public final void A76() {
        C105225Ub r1 = this.A07;
        if (r1 != null) {
            r1.A01(true);
        }
        A75();
        getSupportFragmentManager().A0N();
    }

    public void A78(boolean z) {
        C105225Ub r1 = this.A07;
        if (r1 != null) {
            r1.A02(false);
            C105225Ub r2 = this.A07;
            String string = getString(R.string.f11nameremoved);
            SearchView searchView = r2.A02;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
            this.A07.A02.requestFocus();
            if (this.A02.A00(this.A08)) {
                C104795Sj r22 = this.A06;
                C95074sa r12 = new C95074sa();
                r12.A01 = C18280x3.A0S();
                r12.A03 = Integer.valueOf(z ? 1 : 0);
                r12.A00 = Boolean.valueOf(z);
                r22.A02(r12);
            }
            C18290x4.A1H(this.A07.A04.findViewById(R.id.search_back), this, 16);
        }
    }

    public void onBackPressed() {
        C105225Ub r0 = this.A07;
        if (r0 != null && C86604Kt.A1Y(r0.A04)) {
            BusinessApiHomeFragment businessApiHomeFragment = this.A03;
            if (businessApiHomeFragment != null) {
                businessApiHomeFragment.A1J();
            }
            this.A07.A01(true);
        }
        this.A05.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.A00 = menu;
        if (this.A09) {
            A75();
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final void A77(C08310eF r4, boolean z) {
        String A0n = C18310x6.A0n(r4);
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A0E(r4, A0n, R.id.business_search_container_view);
        if (z) {
            A0J.A0I(A0n);
        }
        A0J.A01();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C08310eF r0;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            String str = this.A08;
            if ("DIRECTORY".equals(str)) {
                Intent A002 = C57012sv.A00(getApplicationContext());
                A002.putExtra("from_api_biz_search", true);
                startActivity(A002);
                return true;
            }
            BusinessApiHomeFragment businessApiHomeFragment = new BusinessApiHomeFragment();
            Bundle A082 = AnonymousClass002.A08();
            A082.putInt("arg_home_view_state", 2);
            A082.putString("entrypoint_type", str);
            businessApiHomeFragment.A0u(A082);
            A77(businessApiHomeFragment, true);
            A78(true);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            BusinessApiHomeFragment businessApiHomeFragment2 = this.A03;
            if (businessApiHomeFragment2 != null) {
                businessApiHomeFragment2.A1J();
                return true;
            }
            C04760Qo r2 = getSupportFragmentManager().A0Y;
            if (r2.A05().isEmpty()) {
                r0 = null;
            } else {
                r0 = (C08310eF) r2.A05().get(AnonymousClass002.A03(r2.A05()));
            }
            if (r0 instanceof BusinessApiHomeFragment) {
                onBackPressed();
                return true;
            }
            A74();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            android.view.Menu r1 = r3.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0010
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.5Ub r0 = r3.A07
            if (r0 == 0) goto L_0x0023
            android.view.View r0 = r0.A04
            boolean r0 = X.C86604Kt.A1Y(r0)
            if (r0 == 0) goto L_0x0023
            r2 = 1
        L_0x0023:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
