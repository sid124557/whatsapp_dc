package com.whatsapp.dialogs;

import X.AnonymousClass001;
import X.C18260x0;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class HFMLearnMoreDialogFragment extends Hilt_HFMLearnMoreDialogFragment {
    public Dialog A1J(Bundle bundle) {
        String string = A0G().getString(R.string.f11nameremoved);
        C18260x0.A1P(AnonymousClass001.A0o(), "hfmlearnmore/", string);
        return FAQLearnMoreDialogFragment.A00(A0G(), this.A00, this.A01, this.A02, string, "26000253", (String) null, (String) null);
    }
}
