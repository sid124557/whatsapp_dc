package com.whatsapp.calling.callhistory.view;

import X.AnonymousClass3XI;
import X.AnonymousClass4FS;
import X.C112415jh;
import X.C18300x5;
import X.C19340zH;
import X.C29111iI;
import X.C55422qK;
import X.C56612sH;
import X.C56762sW;
import X.C69263Wi;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class CallsHistoryClearCallLogDialogFragment extends Hilt_CallsHistoryClearCallLogDialogFragment {
    public C69263Wi A00;
    public C112415jh A01;
    public C56612sH A02;
    public C56762sW A03;
    public C55422qK A04;
    public AnonymousClass3XI A05;
    public AnonymousClass4FS A06;
    public C29111iI A07;

    public Dialog A1J(Bundle bundle) {
        C85804Hr r2 = new C85804Hr(this, 27);
        C19340zH A0L = C18300x5.A0L(this);
        A0L.A0T(R.string.f11nameremoved);
        A0L.A0Y(r2, R.string.f11nameremoved);
        C19340zH.A05(A0L);
        return A0L.create();
    }
}
