package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass58H;
import X.AnonymousClass66R;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C19340zH;
import X.C56972sr;
import X.C80823yr;
import X.C95814uZ;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class DismissNewsletterAdminDialogFragment extends Hilt_DismissNewsletterAdminDialogFragment {
    public C56972sr A00;
    public final AnonymousClass66R A01 = C154517dI.A00(AnonymousClass58H.NONE, new C80823yr(this));

    public Dialog A1J(Bundle bundle) {
        C56972sr r1 = this.A00;
        if (r1 != null) {
            boolean A0a = r1.A0a((C95814uZ) this.A01.getValue());
            C19340zH A0K = C18280x3.A0K(this);
            int i = R.string.f11nameremoved;
            if (A0a) {
                i = R.string.f11nameremoved;
            }
            A0K.A0U(i);
            int i2 = R.string.f11nameremoved;
            if (A0a) {
                i2 = R.string.f11nameremoved;
            }
            A0K.A0T(i2);
            C19340zH.A04(this, A0K, 146, R.string.f11nameremoved);
            C19340zH.A03(this, A0K, 147, R.string.f11nameremoved);
            return C18300x5.A0H(A0K);
        }
        throw C18270x1.A0S("meManager");
    }
}
