package com.whatsapp.conversationslist;

import X.AnonymousClass29z;
import X.AnonymousClass30W;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C61152zn;
import X.C64333Db;
import X.C66503Lr;
import X.C86614Ku;
import X.C86634Kw;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_LeaveGroupsDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            LeaveGroupsDialogFragment leaveGroupsDialogFragment = (LeaveGroupsDialogFragment) this;
            C64333Db r2 = ((C88854au) C18310x6.A0N(this)).A1B;
            C64333Db.Ad6(r2, leaveGroupsDialogFragment);
            C107695bk r3 = r2.A00;
            C107695bk.AFO(r3, leaveGroupsDialogFragment);
            leaveGroupsDialogFragment.A00 = C64333Db.A04(r2);
            leaveGroupsDialogFragment.A0F = C64333Db.A8y(r2);
            leaveGroupsDialogFragment.A07 = C64333Db.A39(r2);
            leaveGroupsDialogFragment.A06 = C86634Kw.A0e(r2);
            leaveGroupsDialogFragment.A0B = C64333Db.A3o(r2);
            leaveGroupsDialogFragment.A02 = C64333Db.A26(r2);
            leaveGroupsDialogFragment.A03 = C64333Db.A28(r2);
            leaveGroupsDialogFragment.A0C = C64333Db.A5A(r2);
            leaveGroupsDialogFragment.A0D = (C66503Lr) r2.AGs.get();
            leaveGroupsDialogFragment.A0E = C86634Kw.A0p(r2);
            leaveGroupsDialogFragment.A04 = (AnonymousClass30W) r3.AB2.get();
            leaveGroupsDialogFragment.A05 = C64333Db.A2s(r2);
            leaveGroupsDialogFragment.A08 = C86614Ku.A0Y(r2);
            leaveGroupsDialogFragment.A09 = C64333Db.A3G(r2);
            leaveGroupsDialogFragment.A0A = (C61152zn) r2.APE.get();
            leaveGroupsDialogFragment.A01 = C64333Db.A24(r2);
        }
    }

    public final void A1U() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1U();
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
            r2.A1U()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.Hilt_LeaveGroupsDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1U();
        A1R();
    }
}
