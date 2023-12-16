package com.whatsapp.conversationslist;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.C18270x1;
import X.C18320x8;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C88744aj;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaListFragment;

public abstract class Hilt_ConversationsFragment extends WaListFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            ConversationsFragment conversationsFragment = (ConversationsFragment) this;
            C88854au r5 = (C88854au) ((AnonymousClass3DY) generatedComponent());
            C64333Db r3 = r5.A1B;
            conversationsFragment.A00 = r3.A00.ANI();
            conversationsFragment.A1i = C86604Kt.A0V(r3);
            C88854au.A11(r3, conversationsFragment);
            C88854au.A0W(C86614Ku.A0J(r3), r3, conversationsFragment);
            C88744aj r2 = C88744aj.A00;
            C88854au.A0B(r2, r3, conversationsFragment);
            C88834as r1 = r5.A18;
            C88834as.A3z(r2, r1, r3, conversationsFragment);
            C88854au.A10(r3, conversationsFragment);
            C88854au.A0A(r2, r3, conversationsFragment);
            C88834as.A50(r1, r3, conversationsFragment, C88854au.A05(r3, conversationsFragment));
            C88834as.A40(r2, r1, r3, conversationsFragment, C88854au.A06(r3, conversationsFragment));
            C88854au.A12(r3, conversationsFragment);
            C88854au.A09(r2, r3, conversationsFragment);
            C88834as.A3x(r2, r1, r5, r3, conversationsFragment);
            C88834as.A3y(r2, r1, r3, conversationsFragment);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C18270x1.A06(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C116885r1.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass2A2.A01(r0)
            r2.A00()
            r2.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.Hilt_ConversationsFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1J();
    }
}
