package com.whatsapp.privacy.checkup;

import X.AnonymousClass0WN;
import X.AnonymousClass1VX;
import X.AnonymousClass541;
import X.AnonymousClass5RV;
import X.C162457s7;
import X.C18270x1;
import X.C56972sr;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupMorePrivacyFragment extends Hilt_PrivacyCheckupMorePrivacyFragment {
    public C56972sr A00;
    public AnonymousClass0WN A01;

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        int i = A0H().getInt("extra_entry_point");
        AnonymousClass5RV r1 = this.A03;
        if (r1 != null) {
            r1.A02(i, 3);
            C56972sr r0 = this.A00;
            if (r0 != null) {
                if (!r0.A0Y()) {
                    A1L(view2, new AnonymousClass541(this, i, 14), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.privacy_checkup_settings_privacy);
                }
                AnonymousClass1VX r12 = this.A01;
                if (r12 != null) {
                    boolean A0X = r12.A0X(3823);
                    int i2 = R.string.f11nameremoved;
                    int i3 = R.string.f11nameremoved;
                    if (A0X) {
                        i2 = R.string.f11nameremoved;
                        i3 = R.string.f11nameremoved;
                    }
                    A1L(view2, new AnonymousClass541(this, i, 15), i2, i3, R.drawable.ic_group_ephemeral_v2);
                    return;
                }
                throw C18270x1.A0R();
            }
            throw C18270x1.A0S("meManager");
        }
        throw C18270x1.A0S("privacyCheckupWamEventHelper");
    }
}
