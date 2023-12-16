package com.whatsapp.conversationslist;

import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.C124266Bp;
import X.C18270x1;
import X.C18290x4;
import X.C86624Kv;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.whatsapp.R;

public final class LockedConversationsFragment extends Hilt_LockedConversationsFragment {
    public View A00;
    public View A01;

    public void A0y(Menu menu, MenuInflater menuInflater) {
    }

    public void A1V() {
        if (!AnonymousClass0x7.A1S(C86624Kv.A0O(this).A03.A03)) {
            int A05 = C18290x4.A05(this.A00);
            View view = this.A1d.A00;
            if (view != null) {
                view.setVisibility(A05);
            }
            if (A0Q() != null && this.A01 == null) {
                this.A01 = A1t(R.layout.f8nameremoved);
            }
        } else {
            C18270x1.A0p(this.A01);
            AnonymousClass0x2.A0x(this.A1d.A00);
            C124266Bp.A00(this.A21.A08(), this, 8);
        }
        super.A1V();
    }
}
