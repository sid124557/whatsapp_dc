package com.whatsapp.community.communityInfo;

import X.AnonymousClass29z;
import X.AnonymousClass48D;
import X.C107695bk;
import X.C1223363z;
import X.C18270x1;
import X.C18320x8;
import X.C64333Db;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_CAGInfoFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            CAGInfoFragment cAGInfoFragment = (CAGInfoFragment) this;
            C88854au r3 = (C88854au) C18320x8.A0E(this);
            C64333Db r1 = r3.A1B;
            C107695bk.AFP(r1.A00, cAGInfoFragment);
            cAGInfoFragment.A03 = C64333Db.A2p(r1);
            cAGInfoFragment.A00 = C64333Db.A04(r1);
            cAGInfoFragment.A07 = C64333Db.A8y(r1);
            cAGInfoFragment.A04 = C64333Db.A4H(r1);
            cAGInfoFragment.A02 = C64333Db.A26(r1);
            cAGInfoFragment.A01 = C64333Db.A1k(r1);
            C88834as r12 = r3.A18;
            cAGInfoFragment.A05 = (AnonymousClass48D) r12.A3X.get();
            cAGInfoFragment.A06 = (C1223363z) r12.A3e.get();
        }
    }

    public final void A1I() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1I();
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
            r2.A1I()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.communityInfo.Hilt_CAGInfoFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
