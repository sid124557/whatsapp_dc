package com.whatsapp.privacy.checkup;

import X.AnonymousClass541;
import X.AnonymousClass5RV;
import X.C162457s7;
import X.C18270x1;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupHomeFragment extends PrivacyCheckupBaseFragment {
    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        int i = A0H().getInt("extra_entry_point");
        AnonymousClass5RV r1 = this.A03;
        if (r1 != null) {
            r1.A02(i, 0);
            A1L(view2, new AnonymousClass541(this, i, 10), R.string.f11nameremoved, 0, R.drawable.privacy_checkup_lock_person);
            A1L(view2, new AnonymousClass541(this, i, 11), R.string.f11nameremoved, 0, R.drawable.ic_action_compose_dark);
            A1L(view2, new AnonymousClass541(this, i, 12), R.string.f11nameremoved, 0, R.drawable.privacy_checkup_settings_name);
            A1L(view2, new AnonymousClass541(this, i, 13), R.string.f11nameremoved, 0, R.drawable.privacy_checkup_perm_phone_msg);
            return;
        }
        throw C18270x1.A0S("privacyCheckupWamEventHelper");
    }
}
