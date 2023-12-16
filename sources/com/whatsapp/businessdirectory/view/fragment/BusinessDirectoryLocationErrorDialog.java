package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass043;
import X.AnonymousClass5TO;
import X.C08310eF;
import X.C105085Tn;
import X.C109705f3;
import X.C1228666d;
import X.C162457s7;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C19340zH;
import X.C86654Ky;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class BusinessDirectoryLocationErrorDialog extends Hilt_BusinessDirectoryLocationErrorDialog {
    public C105085Tn A00;
    public AnonymousClass5TO A01;
    public C1228666d A02;
    public boolean A03;

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.A0q(bundle);
        bundle.putBoolean("saved_state_settings_clicked", this.A03);
    }

    public void A1G(Context context) {
        C162457s7.A0J(context, 0);
        super.A1G(context);
        C08310eF r1 = this.A0E;
        if (r1 instanceof C1228666d) {
            this.A02 = (C1228666d) r1;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        super.onCancel(dialogInterface);
        C1228666d r0 = this.A02;
        if (r0 != null) {
            r0.BSP();
        }
    }

    public void A0d() {
        super.A0d();
        this.A02 = null;
    }

    public void A0f() {
        super.A0f();
        if (this.A03) {
            this.A03 = false;
            C1228666d r0 = this.A02;
            if (r0 != null) {
                r0.BaZ();
            }
            A1K();
        }
    }

    public Dialog A1J(Bundle bundle) {
        View A0G = C86654Ky.A0G(A1D(), R.layout.f8nameremoved);
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0a(A0G);
        A0K.A0i(true);
        AnonymousClass043 A0H = C18300x5.A0H(A0K);
        View A0E = C18280x3.A0E(A0G, R.id.btn_pick_on_map);
        View A0E2 = C18280x3.A0E(A0G, R.id.btn_settings);
        View A0E3 = C18280x3.A0E(A0G, R.id.btn_cancel);
        A0H.setCanceledOnTouchOutside(true);
        C109705f3.A00(A0E, this, A0H, 31);
        C18290x4.A1H(A0E2, this, 42);
        C109705f3.A00(A0E3, this, A0H, 32);
        if (bundle != null && bundle.getBoolean("saved_state_settings_clicked", false)) {
            this.A03 = true;
        }
        return A0H;
    }
}
