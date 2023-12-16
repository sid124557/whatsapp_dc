package com.whatsapp.catalogsearch.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass4FS;
import X.AnonymousClass5AO;
import X.AnonymousClass5MJ;
import X.AnonymousClass5Yj;
import X.AnonymousClass60W;
import X.AnonymousClass60X;
import X.AnonymousClass60Y;
import X.AnonymousClass66R;
import X.AnonymousClass74D;
import X.AnonymousClass8WA;
import X.AnonymousClass8WC;
import X.AnonymousClass8WD;
import X.C003203q;
import X.C06270Wx;
import X.C08310eF;
import X.C104975Tb;
import X.C105225Ub;
import X.C107235av;
import X.C108985dt;
import X.C109315eQ;
import X.C119145wV;
import X.C119165wX;
import X.C133156gm;
import X.C133166gn;
import X.C133296h0;
import X.C154517dI;
import X.C159487lv;
import X.C162457s7;
import X.C181818nN;
import X.C182058nn;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C1892090k;
import X.C29291ia;
import X.C55502qS;
import X.C56422rx;
import X.C620433g;
import X.C620733j;
import X.C73153f1;
import X.C86604Kt;
import X.C86654Ky;
import X.C88694ab;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class CatalogSearchFragment extends Hilt_CatalogSearchFragment implements C182058nn {
    public int A00;
    public MenuItem A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public TextView A08;
    public TextView A09;
    public Toolbar A0A;
    public C620433g A0B;
    public C29291ia A0C;
    public AnonymousClass5MJ A0D;
    public AnonymousClass5AO A0E;
    public C108985dt A0F;
    public C56422rx A0G;
    public C620733j A0H;
    public C105225Ub A0I;
    public AnonymousClass4FS A0J;
    public WDSButton A0K;
    public boolean A0L;
    public final AnonymousClass66R A0M = C154517dI.A01(new C119145wV(this));
    public final AnonymousClass66R A0N = C154517dI.A01(new AnonymousClass8WA(this));
    public final AnonymousClass66R A0O = C154517dI.A01(new AnonymousClass8WC(this));
    public final AnonymousClass66R A0P = C154517dI.A01(new AnonymousClass8WD(this));
    public final AnonymousClass66R A0Q = C154517dI.A01(new C119165wX(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A02 = inflate.findViewById(R.id.container_catalog_search);
        this.A03 = inflate.findViewById(R.id.search_call_to_action);
        this.A08 = AnonymousClass002.A09(inflate, R.id.search_call_to_action_text);
        this.A04 = inflate.findViewById(R.id.search_child_categories_fragment_holder);
        this.A05 = inflate.findViewById(R.id.search_child_products_fragment_holder);
        this.A07 = inflate.findViewById(R.id.search_results_error_view_holder);
        this.A09 = AnonymousClass002.A09(inflate, R.id.search_results_error_view_text);
        this.A0K = (WDSButton) inflate.findViewById(R.id.search_results_error_view_retry_btn);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        this.A0A = (Toolbar) A0R().findViewById(R.id.toolbar);
        View findViewById = A0R().findViewById(R.id.search_holder);
        this.A06 = findViewById;
        if (this.A0A == null || findViewById == null) {
            throw AnonymousClass001.A0e("Required @layout/toolbar_with_search not found in host activity");
        }
        C003203q A0R = A0R();
        C620733j r5 = this.A0H;
        if (r5 != null) {
            this.A0I = new C105225Ub(A0R, this.A06, new C159487lv(this, 1), this.A0A, r5);
            View view2 = this.A03;
            if (view2 != null) {
                C109315eQ.A01(view2, this, 27);
                C107235av.A02(view2);
            }
            AnonymousClass66R r4 = this.A0Q;
            C86604Kt.A1N(A0V(), (C06270Wx) C18300x5.A0d(((CatalogSearchViewModel) r4.getValue()).A07), new AnonymousClass60W(this), 170);
            C86604Kt.A1N(A0V(), ((CatalogSearchViewModel) r4.getValue()).A00, new AnonymousClass60X(this), 171);
            C86604Kt.A1N(A0V(), ((CatalogSearchViewModel) r4.getValue()).A01, new AnonymousClass60Y(this), 172);
            WDSButton wDSButton = this.A0K;
            if (wDSButton != null) {
                C109315eQ.A01(wDSButton, this, 30);
                return;
            }
            return;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public boolean A1B(MenuItem menuItem) {
        View findViewById;
        C162457s7.A0J(menuItem, 0);
        if (R.id.menuitem_search != menuItem.getItemId()) {
            return false;
        }
        View view = this.A02;
        if (view != null) {
            view.setVisibility(0);
        }
        C105225Ub r0 = this.A0I;
        if (r0 == null) {
            throw C18270x1.A0S("searchToolbarHelper");
        }
        r0.A02(false);
        CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0Q.getValue();
        AnonymousClass66R r2 = this.A0M;
        UserJid userJid = (UserJid) r2.getValue();
        int i = this.A00;
        C108985dt r7 = this.A0F;
        C162457s7.A0J(userJid, 0);
        C104975Tb r6 = catalogSearchViewModel.A03;
        catalogSearchViewModel.A0D(new C133296h0(r6.A03(r7, "categories", r6.A02.A0X(1514))));
        AnonymousClass5MJ r72 = catalogSearchViewModel.A02;
        int i2 = 1;
        if (i != 0) {
            i2 = 3;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = -1;
                }
            }
        }
        r72.A00(userJid, 1, Integer.valueOf(i2), (Integer) null, (String) null);
        catalogSearchViewModel.A04.A01.A0H("");
        View view2 = this.A06;
        if (!(view2 == null || (findViewById = view2.findViewById(R.id.search_back)) == null)) {
            C109315eQ.A01(findViewById, this, 29);
        }
        View view3 = this.A06;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.search_background);
        }
        C105225Ub r02 = this.A0I;
        if (r02 == null) {
            throw C18270x1.A0S("searchToolbarHelper");
        }
        TextView A0I2 = AnonymousClass0x2.A0I(r02.A02, R.id.search_src_text);
        A0I2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
        AnonymousClass5Yj.A08(A0I2.getContext(), A0G(), A0I2, R.attr.f3nameremoved, R.color.f5nameremoved);
        A0I2.setHintTextColor(AnonymousClass0Y8.A04(A0G(), R.color.f5nameremoved));
        A0I2.setTextSize(0, C08310eF.A09(this).getDimension(R.dimen.f6nameremoved));
        C56422rx r1 = this.A0G;
        if (r1 != null) {
            C55502qS A012 = r1.A01((UserJid) r2.getValue());
            if (A012 != null) {
                A0I2.setHint(AnonymousClass0x7.A0n(this, A012.A08, new Object[1], 0, R.string.f11nameremoved));
            }
            C105225Ub r03 = this.A0I;
            if (r03 == null) {
                throw C18270x1.A0S("searchToolbarHelper");
            }
            r03.A02.A08 = new C1892090k(this, 2);
            return true;
        }
        throw C18270x1.A0S("verifiedNameManager");
    }

    public void A0a() {
        C29291ia r1 = this.A0C;
        if (r1 != null) {
            r1.A07(this.A0N.getValue());
            super.A0a();
            return;
        }
        throw C18270x1.A0S("businessProfileObservers");
    }

    public final C88694ab A1J(AnonymousClass74D r5) {
        int i;
        if (r5 instanceof C133166gn) {
            i = R.string.f11nameremoved;
        } else if (r5 instanceof C133156gm) {
            i = R.string.f11nameremoved;
        } else {
            throw C73153f1.A00();
        }
        String string = C08310eF.A09(this).getString(i);
        C162457s7.A0D(string);
        if (this.A0E != null) {
            String string2 = C08310eF.A09(this).getString(R.string.f11nameremoved);
            C162457s7.A0D(string2);
            C88694ab A022 = C88694ab.A02(A0J(), string, 4000);
            A022.A0F(string2, new C109315eQ(A022, 28));
            return A022;
        }
        throw C18270x1.A0S("config");
    }

    public final void A1K() {
        CatalogSearchProductListFragment catalogSearchProductListFragment;
        C105225Ub r0 = this.A0I;
        if (r0 == null) {
            throw C18270x1.A0S("searchToolbarHelper");
        }
        r0.A02.getVisibility();
        C105225Ub r02 = this.A0I;
        if (r02 == null) {
            throw C18270x1.A0S("searchToolbarHelper");
        }
        r02.A02.clearFocus();
        C08310eF A0D2 = A0T().A0D("SEARCH_RESULT_LIST_FRAGMENT");
        if ((A0D2 instanceof CatalogSearchProductListFragment) && (catalogSearchProductListFragment = (CatalogSearchProductListFragment) A0D2) != null) {
            catalogSearchProductListFragment.A1O();
        }
    }

    public void A1N(boolean z) {
        View view = this.A02;
        if (view != null && view.getVisibility() == 0) {
            C18270x1.A0p(this.A02);
            C105225Ub r0 = this.A0I;
            if (r0 == null) {
                throw C18270x1.A0S("searchToolbarHelper");
            }
            r0.A01(z);
            UserJid userJid = (UserJid) this.A0M.getValue();
            C162457s7.A0J(userJid, 0);
            ((CatalogSearchViewModel) this.A0Q.getValue()).A02.A00(userJid, AnonymousClass0x7.A0g(), (Integer) null, (Integer) null, (String) null);
        }
    }

    public boolean A1O() {
        View view = this.A02;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        A1N(true);
        C003203q A0R = A0R();
        if (A0R instanceof C181818nN) {
            ((C181818nN) A0R).BOa();
        }
        return true;
    }

    public static final void A00(Bundle bundle, CatalogSearchFragment catalogSearchFragment) {
        catalogSearchFragment.A0L = bundle.getBoolean("all_category_has_navigated_to_category_tabs", C86654Ky.A1a(bundle));
    }

    public void A0c() {
        super.A0c();
        View view = this.A03;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        WDSButton wDSButton = this.A0K;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        this.A0A = null;
        this.A06 = null;
        this.A02 = null;
        this.A08 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0K = null;
    }

    public void A0h() {
        super.A0h();
        if (this.A0L) {
            this.A0L = false;
            A1N(false);
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        A13(true);
        this.A00 = A0H().getInt("search_entry_point");
        this.A0F = (C108985dt) A0H().getParcelable("business_profile");
        C29291ia r1 = this.A0C;
        if (r1 != null) {
            r1.A06(this.A0N.getValue());
            return;
        }
        throw C18270x1.A0S("businessProfileObservers");
    }

    public void A0y(Menu menu, MenuInflater menuInflater) {
        boolean A1U = C18270x1.A1U(menu, menuInflater);
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        this.A01 = findItem;
        if (findItem != null) {
            findItem.setVisible(A1U);
        }
    }

    public final void A1L(String str) {
        A1K();
        AnonymousClass66R r4 = this.A0Q;
        AnonymousClass66R r2 = this.A0M;
        ((CatalogSearchViewModel) r4.getValue()).A0E(this.A0F, (UserJid) r2.getValue(), str);
        UserJid userJid = (UserJid) r2.getValue();
        C162457s7.A0J(userJid, 0);
        ((CatalogSearchViewModel) r4.getValue()).A02.A00(userJid, C18280x3.A0S(), (Integer) null, (Integer) null, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M(java.lang.String r6, X.AnonymousClass4GP r7, boolean r8) {
        /*
            r5 = this;
            X.0df r0 = r5.A0T()
            X.0eF r3 = r0.A0D(r6)
            if (r3 != 0) goto L_0x000d
            if (r8 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r4 = "SEARCH_CATEGORY_FRAGMENT"
            boolean r0 = X.C162457s7.A0P(r6, r4)
            r2 = 8
            r1 = 1
            if (r0 == 0) goto L_0x0025
            android.view.View r0 = r5.A04
            if (r0 == 0) goto L_0x0036
            if (r8 == r1) goto L_0x0032
            if (r8 == 0) goto L_0x0033
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0025:
            android.view.View r0 = r5.A05
            if (r0 == 0) goto L_0x0036
            if (r8 == r1) goto L_0x0032
            if (r8 == 0) goto L_0x0033
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0032:
            r2 = 0
        L_0x0033:
            r0.setVisibility(r2)
        L_0x0036:
            if (r3 != 0) goto L_0x003e
            java.lang.Object r3 = r7.invoke()
            X.0eF r3 = (X.C08310eF) r3
        L_0x003e:
            X.0df r0 = r5.A0T()
            X.0dc r2 = new X.0dc
            r2.<init>(r0)
            boolean r0 = r3.A16()
            if (r0 != 0) goto L_0x005c
            boolean r1 = X.C162457s7.A0P(r6, r4)
            r0 = 2131433276(0x7f0b173c, float:1.8488333E38)
            if (r1 == 0) goto L_0x0059
            r0 = 2131433275(0x7f0b173b, float:1.8488331E38)
        L_0x0059:
            r2.A0D(r3, r6, r0)
        L_0x005c:
            if (r8 == 0) goto L_0x0065
            r2.A08(r3)
        L_0x0061:
            r2.A03()
            return
        L_0x0065:
            r2.A06(r3)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A1M(java.lang.String, X.4GP, boolean):void");
    }

    public void BT3(int i) {
    }
}
