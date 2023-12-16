package com.whatsapp.privacy.checkup;

import X.AnonymousClass541;
import X.AnonymousClass5RV;
import X.C105275Ug;
import X.C162457s7;
import X.C18270x1;
import X.C56972sr;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupMoreSecurityFragment extends Hilt_PrivacyCheckupMoreSecurityFragment {
    public C56972sr A00;
    public C105275Ug A01;

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        int i = A0H().getInt("extra_entry_point");
        AnonymousClass5RV r2 = this.A03;
        if (r2 != null) {
            r2.A02(i, 4);
            C56972sr r0 = this.A00;
            if (r0 != null) {
                if (!r0.A0Y()) {
                    A1L(view2, new AnonymousClass541(this, i, 16), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.privacy_checkup_settings_pin);
                }
                C105275Ug r02 = this.A01;
                if (r02 == null) {
                    throw C18270x1.A0S("appAuthManager");
                } else if (r02.A06()) {
                    A1L(view2, new AnonymousClass541(this, i, 17), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.privacy_checkup_fingerprint);
                }
            } else {
                throw C18270x1.A0S("meManager");
            }
        } else {
            throw C18270x1.A0S("privacyCheckupWamEventHelper");
        }
    }
}
