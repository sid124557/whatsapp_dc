package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass0x9;
import X.AnonymousClass41G;
import X.AnonymousClass4K2;
import X.AnonymousClass4WE;
import X.C003203q;
import X.C06560Yg;
import X.C162457s7;
import X.C18270x1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;

public final class BusinessDirectoryPopularApiBusinessesFragment extends Hilt_BusinessDirectoryPopularApiBusinessesFragment {
    public RecyclerView A00;
    public BusinessDirectoryPopularApiBusinessesViewModel A01;
    public AnonymousClass4WE A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(inflate, R.id.search_list);
        this.A00 = recyclerView;
        if (recyclerView != null) {
            A1D();
            C18270x1.A0u(recyclerView);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            AnonymousClass4WE r0 = this.A02;
            if (r0 != null) {
                recyclerView2.setAdapter(r0);
            } else {
                throw C18270x1.A0S("directoryListAdapter");
            }
        }
        BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = this.A01;
        if (businessDirectoryPopularApiBusinessesViewModel != null) {
            AnonymousClass4K2.A00(A0V(), businessDirectoryPopularApiBusinessesViewModel.A00, new AnonymousClass41G(this), 14);
            C003203q A0Q = A0Q();
            if (A0Q != null) {
                A0Q.setTitle(R.string.f11nameremoved);
            }
            C162457s7.A0H(inflate);
            return inflate;
        }
        throw C18270x1.A0S("viewModel");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = (BusinessDirectoryPopularApiBusinessesViewModel) AnonymousClass0x9.A0H(this).A01(BusinessDirectoryPopularApiBusinessesViewModel.class);
        C162457s7.A0J(businessDirectoryPopularApiBusinessesViewModel, 0);
        this.A01 = businessDirectoryPopularApiBusinessesViewModel;
    }
}
