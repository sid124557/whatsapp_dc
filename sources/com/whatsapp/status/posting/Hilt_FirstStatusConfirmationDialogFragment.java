package com.whatsapp.status.posting;

import X.AnonymousClass29z;
import X.AnonymousClass3FH;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C49712gy;
import X.C64333Db;
import X.C86634Kw;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_FirstStatusConfirmationDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment = (FirstStatusConfirmationDialogFragment) this;
            C64333Db r2 = ((C88854au) C18310x6.A0N(this)).A1B;
            C64333Db.Ad6(r2, firstStatusConfirmationDialogFragment);
            C107695bk r1 = r2.A00;
            C107695bk.AFO(r1, firstStatusConfirmationDialogFragment);
            firstStatusConfirmationDialogFragment.A04 = C64333Db.A8y(r2);
            firstStatusConfirmationDialogFragment.A03 = C86634Kw.A0h(r2);
            firstStatusConfirmationDialogFragment.A01 = (C49712gy) r2.AaZ.get();
            firstStatusConfirmationDialogFragment.A02 = (AnonymousClass3FH) r1.ABa.get();
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
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.posting.Hilt_FirstStatusConfirmationDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1R();
    }
}
