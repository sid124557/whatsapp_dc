package com.google.android.material.bottomsheet;

import X.AnonymousClass4SH;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public void A1K() {
        Dialog dialog = this.A03;
        if (dialog instanceof AnonymousClass4SH) {
            AnonymousClass4SH r1 = (AnonymousClass4SH) dialog;
            if (r1.A04 == null) {
                r1.A04();
            }
        }
        super.A1K();
    }

    public void A1L() {
        Dialog dialog = this.A03;
        if (dialog instanceof AnonymousClass4SH) {
            AnonymousClass4SH r1 = (AnonymousClass4SH) dialog;
            if (r1.A04 == null) {
                r1.A04();
            }
        }
        super.A1L();
    }

    public Dialog A1J(Bundle bundle) {
        return new AnonymousClass4SH(A1D(), A1H());
    }

    public BottomSheetDialogFragment(int i) {
        super(i);
    }

    public BottomSheetDialogFragment() {
    }
}
