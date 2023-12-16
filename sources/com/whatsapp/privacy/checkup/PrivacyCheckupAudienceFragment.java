package com.whatsapp.privacy.checkup;

import X.AnonymousClass541;
import X.AnonymousClass5RV;
import X.C162457s7;
import X.C18270x1;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;

public final class PrivacyCheckupAudienceFragment extends PrivacyCheckupBaseFragment {
    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        int i = A0H().getInt("extra_entry_point");
        AnonymousClass5RV r2 = this.A03;
        if (r2 != null) {
            r2.A02(i, 2);
            A1L(view2, new AnonymousClass541(this, i, 4), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.ic_notif_mark_read);
            A1L(view2, new AnonymousClass541(this, i, 5), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.privacy_checkup_visibility_on);
            A1L(view2, new AnonymousClass541(this, i, 6), R.string.f11nameremoved, R.string.f11nameremoved, R.drawable.privacy_checkup_profile_photo);
            return;
        }
        throw C18270x1.A0S("privacyCheckupWamEventHelper");
    }
}
