package com.whatsapp.privacy.checkup;

import X.AnonymousClass1VX;
import X.AnonymousClass541;
import X.AnonymousClass5RV;
import X.C162457s7;
import X.C18270x1;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupContactFragment extends PrivacyCheckupBaseFragment {
    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        int i = A0H().getInt("extra_entry_point");
        AnonymousClass5RV r2 = this.A03;
        if (r2 != null) {
            r2.A02(i, 1);
            A1L(view2, new AnonymousClass541(this, i, 7), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.privacy_checkup_blocked_user);
            AnonymousClass1VX r22 = this.A01;
            if (r22 != null) {
                if (r22.A0X(1972)) {
                    AnonymousClass1VX r23 = this.A01;
                    if (r23 == null) {
                        throw C18270x1.A0R();
                    } else if (r23.A0X(3897)) {
                        A1L(view2, new AnonymousClass541(this, i, 8), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.ic_inline_mute);
                    }
                }
                A1L(view2, new AnonymousClass541(this, i, 9), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.privacy_checkup_new_group);
                return;
            }
            throw C18270x1.A0R();
        }
        throw C18270x1.A0S("privacyCheckupWamEventHelper");
    }
}
