package com.whatsapp.report;

import X.AnonymousClass65V;
import X.C1235268t;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ShareReportConfirmationDialogFragment extends Hilt_ShareReportConfirmationDialogFragment {
    public AnonymousClass65V A00;

    public Dialog A1J(Bundle bundle) {
        C19340zH A0L = C18300x5.A0L(this);
        A0L.A0T(R.string.f11nameremoved);
        C19340zH.A05(A0L);
        A0L.A0Y(new C1235268t(this, 121), R.string.f11nameremoved);
        return A0L.create();
    }
}
