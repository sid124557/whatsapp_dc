package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass9WN;
import X.C107695bk;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C1906899l;
import X.C64333Db;
import X.C66663Mh;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_IndiaUpiQrCodeScannedDialogFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = (IndiaUpiQrCodeScannedDialogFragment) this;
            C64333Db r2 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk r3 = r2.A00;
            C18300x5.A1D(r3, indiaUpiQrCodeScannedDialogFragment);
            indiaUpiQrCodeScannedDialogFragment.A0C = C64333Db.A2p(r2);
            indiaUpiQrCodeScannedDialogFragment.A0D = C64333Db.A2q(r2);
            indiaUpiQrCodeScannedDialogFragment.A0B = (C66663Mh) r2.AUd.get();
            indiaUpiQrCodeScannedDialogFragment.A0E = C64333Db.A2t(r2);
            indiaUpiQrCodeScannedDialogFragment.A0N = (AnonymousClass9WN) r3.A6I.get();
            indiaUpiQrCodeScannedDialogFragment.A0J = (C1906899l) r2.APJ.get();
            indiaUpiQrCodeScannedDialogFragment.A0L = C1899593h.A0H(r2);
            indiaUpiQrCodeScannedDialogFragment.A0K = C1899593h.A0G(r2);
            indiaUpiQrCodeScannedDialogFragment.A0M = C1899593h.A0L(r2);
            indiaUpiQrCodeScannedDialogFragment.A0I = C1899693i.A0J(r2);
            indiaUpiQrCodeScannedDialogFragment.A0F = C64333Db.A4B(r2);
        }
    }

    public final void A1X() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1X();
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
            r2.A1X()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiQrCodeScannedDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
