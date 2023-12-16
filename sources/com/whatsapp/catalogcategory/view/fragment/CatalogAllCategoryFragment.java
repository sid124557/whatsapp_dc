package com.whatsapp.catalogcategory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass5F1;
import X.AnonymousClass60T;
import X.AnonymousClass60U;
import X.AnonymousClass66R;
import X.AnonymousClass6CA;
import X.AnonymousClass6HV;
import X.AnonymousClass6gJ;
import X.AnonymousClass746;
import X.AnonymousClass8P7;
import X.AnonymousClass8W8;
import X.AnonymousClass8Y8;
import X.C06270Wx;
import X.C111095hX;
import X.C119125wT;
import X.C141516vh;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C71603cN;
import X.C86604Kt;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import java.util.ArrayList;

public final class CatalogAllCategoryFragment extends Hilt_CatalogAllCategoryFragment {
    public RecyclerView A00;
    public C111095hX A01;
    public AnonymousClass5F1 A02;
    public AnonymousClass6HV A03;
    public final AnonymousClass66R A04 = AnonymousClass8P7.A00(new AnonymousClass8W8(this));
    public final AnonymousClass66R A05 = AnonymousClass8P7.A00(new C119125wT(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        C162457s7.A0H(inflate);
        RecyclerView recyclerView = (RecyclerView) C18280x3.A0E(inflate, R.id.list_all_category);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.A0h = true;
        this.A00 = recyclerView;
        AnonymousClass6HV r1 = new AnonymousClass6HV((CategoryThumbnailLoader) this.A04.getValue(), new AnonymousClass746(this.A05.getValue(), 9));
        this.A03 = r1;
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 == null) {
            throw C18270x1.A0S("recyclerView");
        }
        recyclerView2.setAdapter(r1);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        AnonymousClass66R r4 = this.A05;
        C86604Kt.A1N(A0V(), ((CatalogAllCategoryViewModel) r4.getValue()).A01, new AnonymousClass60T(this), 163);
        C86604Kt.A1N(A0V(), ((CatalogAllCategoryViewModel) r4.getValue()).A00, new AnonymousClass8Y8(this), 164);
        C86604Kt.A1N(A0V(), ((CatalogAllCategoryViewModel) r4.getValue()).A02, new AnonymousClass60U(this), 165);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        String string = A0H().getString("parent_category_id");
        Parcelable parcelable = A0H().getParcelable("category_biz_id");
        String string2 = A0H().getString("category_display_context", "CATALOG_CATEGORY_FLOW");
        C162457s7.A0H(string2);
        C141516vh valueOf = C141516vh.valueOf(string2);
        if (string == null || parcelable == null) {
            throw AnonymousClass001.A0c("Required categoryParentId and bizJid not found");
        }
        CatalogAllCategoryViewModel catalogAllCategoryViewModel = (CatalogAllCategoryViewModel) this.A05.getValue();
        C162457s7.A0J(valueOf, 2);
        AnonymousClass6CA.A0J(catalogAllCategoryViewModel.A09).A0H(0);
        if (valueOf == C141516vh.CATALOG_CATEGORY_FLOW) {
            C06270Wx A0J = AnonymousClass6CA.A0J(catalogAllCategoryViewModel.A08);
            ArrayList A0s = AnonymousClass001.A0s();
            int i = 0;
            do {
                A0s.add(new AnonymousClass6gJ());
                i++;
            } while (i < 5);
            A0J.A0H(A0s);
        }
        catalogAllCategoryViewModel.A07.BkM(new C71603cN(catalogAllCategoryViewModel, parcelable, valueOf, string, 6));
    }
}
