package com.whatsapp.calling.views;

import X.C18300x5;
import X.C19340zH;
import X.C620633i;
import X.C627436k;
import X.C85804Hr;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;

public class AppSettingsWarningDialogFragment extends Hilt_AppSettingsWarningDialogFragment {
    public int A00;
    public C620633i A01;

    public void A0f() {
        super.A0f();
        if (!C627436k.A0D(this.A01)) {
            A1K();
        }
    }

    public Dialog A1J(Bundle bundle) {
        int i;
        int i2;
        this.A00 = A0H().getInt("reason", 0);
        C19340zH A0M = C18300x5.A0M(this);
        int i3 = this.A00;
        int i4 = R.string.f11nameremoved;
        if (i3 == 1) {
            i4 = R.string.f11nameremoved;
        }
        A0M.A0U(i4);
        int i5 = this.A00;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 == 31) {
                i = R.string.f11nameremoved;
                if (i5 == 1) {
                    i = R.string.f11nameremoved;
                }
            } else if (i6 >= 28 && i6 <= 30) {
                i = R.string.f11nameremoved;
                if (i5 == 1) {
                    i = R.string.f11nameremoved;
                }
            }
            A0M.A0T(i);
            if (this.A00 == 1 || ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && (i2 = Build.VERSION.SDK_INT) >= 28 && i2 <= 31)) {
                C85804Hr.A01(A0M, this, 31, R.string.f11nameremoved);
            }
            C85804Hr.A00(A0M, this, 32, R.string.f11nameremoved);
            return A0M.create();
        }
        i = R.string.f11nameremoved;
        if (i5 == 1) {
            i = R.string.f11nameremoved;
        }
        A0M.A0T(i);
        C85804Hr.A01(A0M, this, 31, R.string.f11nameremoved);
        C85804Hr.A00(A0M, this, 32, R.string.f11nameremoved);
        return A0M.create();
    }
}
