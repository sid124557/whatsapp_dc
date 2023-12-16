package com.whatsapp.group.reporttoadmin;

import X.AnonymousClass002;
import X.C18300x5;
import X.C1891190b;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class ConfirmClearAdminReviewsDialogFragment extends Hilt_ConfirmClearAdminReviewsDialogFragment {
    public Dialog A1J(Bundle bundle) {
        C19340zH A0M = C18300x5.A0M(this);
        A0M.A0B(R.string.f11nameremoved);
        A0M.A0A(R.string.f11nameremoved);
        A0M.setPositiveButton(R.string.f11nameremoved, new C1891190b(this, 32));
        A0M.setNegativeButton(R.string.f11nameremoved, new C1891190b(this, 33));
        return C18300x5.A0H(A0M);
    }

    public final void A1V(boolean z) {
        Bundle A08 = AnonymousClass002.A08();
        A08.putBoolean("clear_all_admin_reviews", z);
        A0U().A0n("confirm_clear_admin_reviews_dialog_result", A08);
    }
}
