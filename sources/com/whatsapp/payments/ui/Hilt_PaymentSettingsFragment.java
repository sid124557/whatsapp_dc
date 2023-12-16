package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass5RJ;
import X.C107695bk;
import X.C171658Hx;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_PaymentSettingsFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1R() {
        if (this instanceof Hilt_P2mLitePaymentSettingsFragment) {
            Hilt_P2mLitePaymentSettingsFragment hilt_P2mLitePaymentSettingsFragment = (Hilt_P2mLitePaymentSettingsFragment) this;
            if (!hilt_P2mLitePaymentSettingsFragment.A02) {
                hilt_P2mLitePaymentSettingsFragment.A02 = true;
                AnonymousClass3DY A0N = C18310x6.A0N(hilt_P2mLitePaymentSettingsFragment);
                P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = (P2mLitePaymentSettingsFragment) hilt_P2mLitePaymentSettingsFragment;
                C64333Db r2 = ((C88854au) A0N).A1B;
                C64333Db.Ad6(r2, p2mLitePaymentSettingsFragment);
                C107695bk r1 = r2.A00;
                C1899593h.A12(r2, r1, p2mLitePaymentSettingsFragment);
                C1899593h.A13(r2, r1, p2mLitePaymentSettingsFragment, r2.A6O.get());
                C1899593h.A18(r2, p2mLitePaymentSettingsFragment);
                C1899593h.A17(r2, p2mLitePaymentSettingsFragment);
                p2mLitePaymentSettingsFragment.A09 = (AnonymousClass5RJ) r1.A8W.get();
                p2mLitePaymentSettingsFragment.A0A = C1899593h.A0Q(r2);
                p2mLitePaymentSettingsFragment.A04 = C64333Db.A3D(r2);
                p2mLitePaymentSettingsFragment.A06 = (C171658Hx) r1.A8U.get();
                p2mLitePaymentSettingsFragment.A05 = C1899693i.A0O(r2);
            }
        } else if (!this.A02) {
            this.A02 = true;
            PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) this;
            C64333Db r22 = ((C88854au) C18310x6.A0N(this)).A1B;
            C64333Db.Ad6(r22, paymentSettingsFragment);
            C107695bk r12 = r22.A00;
            C1899593h.A12(r22, r12, paymentSettingsFragment);
            C1899593h.A13(r22, r12, paymentSettingsFragment, r22.A6O.get());
            C1899593h.A18(r22, paymentSettingsFragment);
            C1899593h.A17(r22, paymentSettingsFragment);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A05();
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
            r2.A05()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_PaymentSettingsFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A05();
        A1R();
    }
}
