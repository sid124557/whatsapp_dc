package com.whatsapp.base;

import X.AnonymousClass5NC;
import X.AnonymousClass5ZC;
import X.AnonymousClass64N;
import X.AnonymousClass65S;
import X.C162457s7;
import X.C58152un;
import com.whatsapp.updates.ui.UpdatesFragment;

public abstract class WaFragment extends Hilt_WaFragment implements AnonymousClass64N, AnonymousClass65S {
    public AnonymousClass5NC A00;

    public void A15(boolean z) {
        AnonymousClass5NC r1 = this.A00;
        if (r1 != null) {
            r1.A00(this, this.A0l, z);
        }
        super.A15(z);
    }

    public /* synthetic */ AnonymousClass5ZC BCP() {
        if (!(this instanceof UpdatesFragment)) {
            return C58152un.A02;
        }
        AnonymousClass5ZC r0 = C58152un.A01;
        C162457s7.A0F(r0);
        return r0;
    }
}
