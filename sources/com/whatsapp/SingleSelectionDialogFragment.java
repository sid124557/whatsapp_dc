package com.whatsapp;

import X.AnonymousClass002;
import X.AnonymousClass0Uj;
import X.AnonymousClass0x2;
import X.AnonymousClass64I;
import X.C003203q;
import X.C08310eF;
import X.C18300x5;
import X.C18320x8;
import X.C1891190b;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;

public class SingleSelectionDialogFragment extends Hilt_SingleSelectionDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public boolean A05;
    public String[] A06;

    public static Bundle A00(String[] strArr, int i, int i2, int i3) {
        Bundle A0A = C18320x8.A0A(i, i2, i3);
        A0A.putStringArray("items", strArr);
        A0A.putBoolean("showConfirmation", true);
        return A0A;
    }

    public void A0p(Bundle bundle) {
        String string;
        String[] stringArray;
        int i;
        super.A0p(bundle);
        Bundle bundle2 = this.A06;
        this.A01 = bundle2.getInt("dialogId");
        this.A00 = bundle2.getInt("currentIndex");
        if (bundle2.containsKey("dialogTitleResId")) {
            string = C08310eF.A09(this).getString(bundle2.getInt("dialogTitleResId"));
        } else {
            string = bundle2.getString("dialogTitle");
        }
        this.A04 = string;
        if (bundle2.containsKey("itemsArrayResId")) {
            stringArray = C08310eF.A09(this).getStringArray(bundle2.getInt("itemsArrayResId"));
        } else {
            stringArray = bundle2.getStringArray("items");
        }
        this.A06 = stringArray;
        if (bundle2.containsKey("dialogPositiveButtonTextResId")) {
            i = bundle2.getInt("dialogPositiveButtonTextResId");
        } else {
            i = R.string.f11nameremoved;
        }
        this.A02 = i;
        this.A05 = bundle2.getBoolean("showConfirmation", false);
    }

    public Dialog A1J(Bundle bundle) {
        return A1V().create();
    }

    public AnonymousClass0Uj A1V() {
        C19340zH A0L = C18300x5.A0L(this);
        A0L.setTitle(this.A04);
        int i = this.A00;
        this.A03 = i;
        A0L.A0K(new C1891190b(this, 10), this.A06, i);
        if (this.A05) {
            AnonymousClass0x2.A0t(new C1891190b(this, 11), A0L, this.A02);
        }
        return A0L;
    }

    public final void A1W() {
        C003203q A0Q = A0Q();
        if (A0Q instanceof AnonymousClass64I) {
            ((AnonymousClass64I) A0Q).Bbh(this.A01, this.A03);
        } else {
            Bundle A08 = AnonymousClass002.A08();
            A08.putInt("selectedIndex", this.A03);
            A0U().A0n("single_selection_dialog_result", A08);
        }
        A1K();
    }
}
