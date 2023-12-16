package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass69A;
import X.C08310eF;
import X.C162677sZ;
import X.C179658jV;
import X.C18300x5;
import X.C19340zH;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class MultiSelectionDialogFragment extends Hilt_MultiSelectionDialogFragment {
    public int A00;
    public C179658jV A01;
    public String A02;
    public String[] A03;
    public boolean[] A04;

    public static MultiSelectionDialogFragment A00(boolean[] zArr, int i, int i2) {
        MultiSelectionDialogFragment multiSelectionDialogFragment = new MultiSelectionDialogFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("dialogId", i);
        A08.putInt("dialogTitleResId", i2);
        A08.putInt("itemsResId", R.array.f2nameremoved);
        A08.putBooleanArray("selectedItems", zArr);
        multiSelectionDialogFragment.A0u(A08);
        return multiSelectionDialogFragment;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (A0Q() instanceof C179658jV) {
            Bundle bundle2 = this.A06;
            this.A00 = bundle2.getInt("dialogId");
            this.A02 = C08310eF.A09(this).getString(bundle2.getInt("dialogTitleResId"));
            this.A03 = C08310eF.A09(this).getStringArray(bundle2.getInt("itemsResId"));
            this.A04 = bundle2.getBooleanArray("selectedItems");
            this.A01 = (C179658jV) A0Q();
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Activity must implement ");
        throw AnonymousClass000.A0I(C179658jV.class.getSimpleName(), A0o);
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0L = C18300x5.A0L(this);
        A0L.setTitle(this.A02);
        A0L.A0N(new C162677sZ(this), this.A03, this.A04);
        C85804Hr.A01(A0L, this, 91, R.string.f11nameremoved);
        A0L.setNegativeButton(R.string.f11nameremoved, new AnonymousClass69A(11));
        return A0L.create();
    }
}
