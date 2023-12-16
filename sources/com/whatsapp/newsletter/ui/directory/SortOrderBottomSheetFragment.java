package com.whatsapp.newsletter.ui.directory;

import X.AnonymousClass002;
import X.AnonymousClass69B;
import X.C107295b4;
import X.C162457s7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class SortOrderBottomSheetFragment extends WDSBottomSheetDialogFragment {
    public int A00 = 0;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        AnonymousClass002.A09(view, R.id.recent).setText(R.string.f11nameremoved);
        AnonymousClass002.A09(view, R.id.popularity).setText(R.string.f11nameremoved);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.sort_options);
        if (radioGroup != null) {
            radioGroup.check(radioGroup.getChildAt(this.A00).getId());
            radioGroup.setOnCheckedChangeListener(new AnonymousClass69B(this, 1));
        }
        C107295b4.A06(view.findViewById(R.id.sort_bottom_sheet_title), true);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A00 = A0H().getInt("arg_sort_selected");
    }
}
