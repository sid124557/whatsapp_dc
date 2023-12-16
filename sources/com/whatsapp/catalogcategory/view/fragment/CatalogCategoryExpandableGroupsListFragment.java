package com.whatsapp.catalogcategory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass5F1;
import X.AnonymousClass60V;
import X.AnonymousClass66R;
import X.AnonymousClass6CA;
import X.AnonymousClass6FA;
import X.AnonymousClass6gJ;
import X.AnonymousClass7DR;
import X.AnonymousClass8P7;
import X.AnonymousClass8W9;
import X.AnonymousClass8Y9;
import X.AnonymousClass8YA;
import X.C06270Wx;
import X.C111095hX;
import X.C117715sN;
import X.C119135wU;
import X.C133016gY;
import X.C133036ga;
import X.C162457s7;
import X.C167137zp;
import X.C167147zq;
import X.C167157zr;
import X.C167167zs;
import X.C18270x1;
import X.C18280x3;
import X.C626936e;
import X.C86604Kt;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class CatalogCategoryExpandableGroupsListFragment extends Hilt_CatalogCategoryExpandableGroupsListFragment {
    public int A00 = -1;
    public ExpandableListView A01;
    public C111095hX A02;
    public AnonymousClass5F1 A03;
    public AnonymousClass6FA A04;
    public UserJid A05;
    public String A06;
    public final AnonymousClass66R A07 = AnonymousClass8P7.A00(new AnonymousClass8W9(this));
    public final AnonymousClass66R A08 = AnonymousClass8P7.A00(new C119135wU(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        this.A01 = (ExpandableListView) C18280x3.A0E(inflate, R.id.expandable_list_catalog_category);
        AnonymousClass6FA r1 = new AnonymousClass6FA((CategoryThumbnailLoader) this.A07.getValue());
        this.A04 = r1;
        ExpandableListView expandableListView = this.A01;
        if (expandableListView == null) {
            throw C18270x1.A0S("expandableListView");
        }
        expandableListView.setAdapter(r1);
        ExpandableListView expandableListView2 = this.A01;
        if (expandableListView2 == null) {
            throw C18270x1.A0S("expandableListView");
        }
        expandableListView2.setOnChildClickListener(new C167137zp(this));
        ExpandableListView expandableListView3 = this.A01;
        if (expandableListView3 == null) {
            throw C18270x1.A0S("expandableListView");
        }
        expandableListView3.setOnGroupClickListener(new C167147zq(this));
        ExpandableListView expandableListView4 = this.A01;
        if (expandableListView4 == null) {
            throw C18270x1.A0S("expandableListView");
        }
        expandableListView4.setOnGroupExpandListener(new C167167zs(this));
        ExpandableListView expandableListView5 = this.A01;
        if (expandableListView5 == null) {
            throw C18270x1.A0S("expandableListView");
        }
        expandableListView5.setOnGroupCollapseListener(new C167157zr(this));
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        AnonymousClass66R r4 = this.A08;
        C86604Kt.A1N(A0V(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A00, new AnonymousClass8Y9(this), 167);
        C86604Kt.A1N(A0V(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A01, new AnonymousClass60V(this), 168);
        C86604Kt.A1N(A0V(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A02, new AnonymousClass8YA(this), 169);
    }

    public void A0f() {
        super.A0f();
        int i = this.A00;
        if (i != -1) {
            ExpandableListView expandableListView = this.A01;
            if (expandableListView == null) {
                throw C18270x1.A0S("expandableListView");
            }
            expandableListView.expandGroup(i);
        }
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        UserJid userJid = this.A05;
        if (userJid == null) {
            throw C18270x1.A0S("bizJid");
        }
        AnonymousClass7DR r1 = (AnonymousClass7DR) catalogCategoryGroupsViewModel.A00.A07();
        if (r1 instanceof C133036ga) {
            catalogCategoryGroupsViewModel.A0E(userJid, ((C133036ga) r1).A00);
        }
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        String string = A0H().getString("parent_category_id");
        C626936e.A06(string);
        C162457s7.A0D(string);
        this.A06 = string;
        Parcelable parcelable = A0H().getParcelable("category_biz_id");
        C626936e.A06(parcelable);
        C162457s7.A0D(parcelable);
        this.A05 = (UserJid) parcelable;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        String str = this.A06;
        if (str == null) {
            throw C18270x1.A0S("categoryParentId");
        }
        UserJid userJid = this.A05;
        if (userJid == null) {
            throw C18270x1.A0S("bizJid");
        }
        C06270Wx A0J = AnonymousClass6CA.A0J(catalogCategoryGroupsViewModel.A09);
        ArrayList A0s = AnonymousClass001.A0s();
        int i = 0;
        do {
            A0s.add(new AnonymousClass6gJ());
            i++;
        } while (i < 5);
        A0J.A0H(new C133016gY(A0s));
        catalogCategoryGroupsViewModel.A08.BkM(new C117715sN(catalogCategoryGroupsViewModel, userJid, str, 29));
    }
}
