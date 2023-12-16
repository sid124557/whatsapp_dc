package com.google.android.material.datepicker;

import X.AnonymousClass001;
import X.C108625dI;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialTextInputPicker extends PickerFragment {
    public int A00;
    public C108625dI A01;

    public void A0q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A00);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A01);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(A1D(), this.A00));
        throw AnonymousClass001.A0g("onCreateTextInputView");
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (bundle == null) {
            bundle = this.A06;
        }
        this.A00 = bundle.getInt("THEME_RES_ID_KEY");
        bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A01 = (C108625dI) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
