package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C06560Yg;
import X.C160757oG;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C1899593h;
import X.C197109ca;
import X.C202129lQ;
import X.C204249p3;
import X.C620933l;
import X.C86604Kt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class IndiaUpiPaymentTwoFactorNudgeFragment extends Hilt_IndiaUpiPaymentTwoFactorNudgeFragment {
    public C620933l A00;
    public C197109ca A01;
    public C202129lQ A02;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0d() {
        super.A0d();
        this.A02 = null;
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        C204249p3.A02(C06560Yg.A02(view, R.id.continue_button), this, 75);
        C204249p3.A02(C06560Yg.A02(view, R.id.close), this, 76);
        C204249p3.A02(C06560Yg.A02(view, R.id.later_button), this, 77);
        C620933l r2 = this.A00;
        long A0H = r2.A01.A0H();
        C18270x1.A0i(C620933l.A00(r2), "payments_last_two_factor_nudge_time", A0H);
        r2.A02.A06(AnonymousClass000.A0Z("updateLastTwoFactorNudgeTimeMilli to: ", AnonymousClass001.A0o(), A0H));
        C620933l r22 = this.A00;
        int A022 = C18280x3.A02(r22.A03(), "payments_two_factor_nudge_count") + 1;
        C86604Kt.A15(r22.A03(), "payments_two_factor_nudge_count", A022);
        C160757oG r23 = r22.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("updateTwoFactorNudgeCount to: ");
        C1899593h.A1K(r23, A0o, A022);
        this.A01.BKB(C18290x4.A0Z(), (Integer) null, "two_factor_nudge_prompt", (String) null);
    }
}
