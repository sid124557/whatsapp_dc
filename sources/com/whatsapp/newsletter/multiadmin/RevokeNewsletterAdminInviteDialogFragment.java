package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass0x7;
import X.AnonymousClass340;
import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C003203q;
import X.C154517dI;
import X.C162457s7;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import X.C80873yw;
import X.C84024As;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public final class RevokeNewsletterAdminInviteDialogFragment extends Hilt_RevokeNewsletterAdminInviteDialogFragment {
    public C84024As A00;
    public final AnonymousClass66R A01 = C154517dI.A00(AnonymousClass58H.NONE, new C80873yw(this));
    public final AnonymousClass66R A02 = AnonymousClass340.A02(this, "arg_contact_name");

    public void A1G(Context context) {
        C84024As r1;
        C162457s7.A0J(context, 0);
        super.A1G(context);
        if (this.A00 == null) {
            C003203q A0Q = A0Q();
            if (A0Q instanceof C84024As) {
                r1 = (C84024As) A0Q;
            } else {
                r1 = null;
            }
            this.A00 = r1;
        }
    }

    public void A0d() {
        super.A0d();
        this.A00 = null;
    }

    public Dialog A1J(Bundle bundle) {
        C19340zH A0K = C18280x3.A0K(this);
        AnonymousClass66R r4 = this.A02;
        A0K.A0h(AnonymousClass0x7.A0n(this, r4.getValue(), new Object[1], 0, R.string.f11nameremoved));
        A0K.A0g(AnonymousClass0x7.A0n(this, r4.getValue(), new Object[1], 0, R.string.f11nameremoved));
        C19340zH.A04(this, A0K, 148, R.string.f11nameremoved);
        C19340zH.A03(this, A0K, 149, R.string.f11nameremoved);
        return C18300x5.A0H(A0K);
    }
}
