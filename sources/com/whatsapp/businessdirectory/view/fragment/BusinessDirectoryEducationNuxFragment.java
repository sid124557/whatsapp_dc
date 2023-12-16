package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass0Y8;
import X.AnonymousClass0x9;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C18290x4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryEducationNuxViewModel;

public class BusinessDirectoryEducationNuxFragment extends RoundedBottomSheetDialogFragment implements AnonymousClass64B {
    public BusinessDirectoryEducationNuxViewModel A00;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
        C06560Yg.A0C(AnonymousClass0Y8.A07(A0G(), R.color.f5nameremoved), A0R);
        View A02 = C06560Yg.A02(A0R, R.id.btn_continue);
        C18290x4.A1H(C06560Yg.A02(A0R, R.id.nux_close_button), this, 40);
        C18290x4.A1H(A02, this, 41);
        return A0R;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A00 = (BusinessDirectoryEducationNuxViewModel) AnonymousClass0x9.A0H(this).A01(BusinessDirectoryEducationNuxViewModel.class);
    }

    public void A1X(View view) {
        super.A1X(view);
        BottomSheetBehavior.A01(view).A0d(true);
    }
}
