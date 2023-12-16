package com.whatsapp.base;

import X.AnonymousClass5NC;
import X.AnonymousClass5ZC;
import X.AnonymousClass65S;
import X.C58152un;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.status.StatusesFragment;

public class WaListFragment extends Hilt_WaListFragment implements AnonymousClass65S {
    public AnonymousClass5NC A00;

    public void A15(boolean z) {
        AnonymousClass5NC r1 = this.A00;
        if (r1 != null) {
            r1.A00(this, this.A0l, z);
        }
        super.A15(z);
    }

    public /* synthetic */ AnonymousClass5ZC BCP() {
        if ((this instanceof StatusesFragment) || (this instanceof ConversationsFragment)) {
            return C58152un.A01;
        }
        return C58152un.A02;
    }
}
