package com.whatsapp.group;

import X.AnonymousClass002;
import X.AnonymousClass5V0;
import X.AnonymousClass69T;
import X.C19340zH;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public class ConfirmApproveAllPendingRequestsDialogFragment extends Hilt_ConfirmApproveAllPendingRequestsDialogFragment {
    public static /* synthetic */ void A00(Bundle bundle, ConfirmApproveAllPendingRequestsDialogFragment confirmApproveAllPendingRequestsDialogFragment) {
        bundle.putBoolean("is_approve_all_pending_requests", true);
        confirmApproveAllPendingRequestsDialogFragment.A0U().A0n("group_join_request_approve_all_pending_requests", bundle);
    }

    public static /* synthetic */ void A01(Bundle bundle, ConfirmApproveAllPendingRequestsDialogFragment confirmApproveAllPendingRequestsDialogFragment) {
        bundle.putBoolean("is_approve_all_pending_requests", false);
        confirmApproveAllPendingRequestsDialogFragment.A0U().A0n("group_join_request_approve_all_pending_requests", bundle);
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A00 = AnonymousClass5V0.A00(A0Q());
        A00.A0B(R.string.f11nameremoved);
        A00.A0A(R.string.f11nameremoved);
        Bundle A08 = AnonymousClass002.A08();
        A00.setPositiveButton(R.string.f11nameremoved, new AnonymousClass69T(this, 11, A08));
        A00.setNegativeButton(R.string.f11nameremoved, new AnonymousClass69T(this, 12, A08));
        return A00.create();
    }
}
