package com.whatsapp.report;

import X.AnonymousClass5V0;
import X.AnonymousClass69A;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public class DownloadReportFailedDialogFragment extends WaDialogFragment {
    public Dialog A1J(Bundle bundle) {
        C19340zH A00 = AnonymousClass5V0.A00(A0Q());
        A00.A0U(R.string.f11nameremoved);
        A00.A0T(R.string.f11nameremoved);
        A00.A0Y(new AnonymousClass69A(8), R.string.f11nameremoved);
        return A00.create();
    }
}
