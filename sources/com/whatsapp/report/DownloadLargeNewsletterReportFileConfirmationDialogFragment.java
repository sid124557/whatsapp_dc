package com.whatsapp.report;

import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass35V;
import X.AnonymousClass4GP;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class DownloadLargeNewsletterReportFileConfirmationDialogFragment extends Hilt_DownloadLargeNewsletterReportFileConfirmationDialogFragment {
    public final long A00;
    public final AnonymousClass4GP A01;

    public DownloadLargeNewsletterReportFileConfirmationDialogFragment(AnonymousClass4GP r1, long j) {
        this.A00 = j;
        this.A01 = r1;
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0M = C18300x5.A0M(this);
        A0M.A0h(AnonymousClass0x7.A0m(this, AnonymousClass35V.A03(this.A01, this.A00), AnonymousClass002.A0L(), R.string.f11nameremoved));
        A0M.A0T(R.string.f11nameremoved);
        C19340zH.A03(this, A0M, 185, R.string.f11nameremoved);
        C19340zH.A02(this, A0M);
        return C18300x5.A0H(A0M);
    }
}
