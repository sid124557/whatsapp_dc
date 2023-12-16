package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass69T;
import X.C08310eF;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.base.WaDialogFragment;

public final class GroupRequireMembershipApprovalTooManyParticipantsDialog extends WaDialogFragment {
    public static final void A00(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        bundle.putBoolean("is_approve_all_pending_requests", true);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0U().A0n("group_join_request_group_too_full", bundle);
    }

    public static final void A01(Bundle bundle, GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog) {
        bundle.putBoolean("is_approve_all_pending_requests", false);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A0U().A0n("group_join_request_group_too_full", bundle);
    }

    public Dialog A1J(Bundle bundle) {
        int i;
        int i2;
        C19340zH A0K = C18280x3.A0K(this);
        A0K.A0B(R.string.f11nameremoved);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            i = bundle2.getInt("remaining_capacity");
        } else {
            i = 0;
        }
        Bundle bundle3 = this.A06;
        if (bundle3 != null) {
            i2 = bundle3.getInt("pending_request_count");
        } else {
            i2 = 0;
        }
        Resources A09 = C08310eF.A09(this);
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1P(A0M, i, 0);
        AnonymousClass000.A1P(A0M, i2, 1);
        A0K.A0Q(A09.getQuantityString(R.plurals.f9nameremoved, i2, A0M));
        Bundle A08 = AnonymousClass002.A08();
        A0K.setPositiveButton(R.string.f11nameremoved, new AnonymousClass69T(A08, 13, this));
        A0K.setNegativeButton(R.string.f11nameremoved, new AnonymousClass69T(A08, 14, this));
        return C18300x5.A0H(A0K);
    }
}
