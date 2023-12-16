package com.whatsapp;

import X.AnonymousClass0Pz;
import X.AnonymousClass0R8;
import X.C89114bZ;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.preference.PreferenceScreen;

public abstract class WaPreferenceFragment extends Hilt_WaPreferenceFragment {
    public C89114bZ A00;

    public void A1K(int i) {
        AnonymousClass0Pz r2 = this.A02;
        if (r2 != null) {
            PreferenceScreen A02 = r2.A02(A1D(), this.A02.A07, i);
            AnonymousClass0Pz r1 = this.A02;
            PreferenceScreen preferenceScreen = r1.A07;
            if (A02 != preferenceScreen) {
                if (preferenceScreen != null) {
                    preferenceScreen.A0A();
                }
                r1.A07 = A02;
                this.A04 = true;
                if (this.A05) {
                    Handler handler = this.A01;
                    if (!handler.hasMessages(1)) {
                        handler.obtainMessage(1).sendToTarget();
                    }
                }
            }
            C89114bZ r0 = this.A00;
            if (r0 != null) {
                CharSequence title = r0.getTitle();
                AnonymousClass0R8 supportActionBar = r0.getSupportActionBar();
                if (!TextUtils.isEmpty(title) && supportActionBar != null) {
                    supportActionBar.A0J(title);
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    public void A0d() {
        super.A0d();
        this.A00 = null;
    }

    public void A1G(Context context) {
        super.A1G(context);
        this.A00 = (C89114bZ) A0Q();
    }
}
