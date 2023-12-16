package com.whatsapp.report;

import X.C08310eF;
import X.C182978pI;
import X.C18300x5;
import X.C1891190b;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import com.whatsapp.R;

public class DeleteReportConfirmationDialogFragment extends Hilt_DeleteReportConfirmationDialogFragment {
    public C182978pI A00;

    public Dialog A1J(Bundle bundle) {
        C19340zH A0L = C18300x5.A0L(this);
        A0L.A0g(Html.fromHtml(C08310eF.A09(this).getString(R.string.f11nameremoved)));
        C19340zH.A05(A0L);
        A0L.A0Y(new C1891190b(this, 84), R.string.f11nameremoved);
        return A0L.create();
    }
}
