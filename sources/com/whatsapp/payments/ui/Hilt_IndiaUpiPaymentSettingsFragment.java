package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass9TR;
import X.AnonymousClass9VU;
import X.AnonymousClass9W3;
import X.AnonymousClass9W6;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C194089Rn;
import X.C194479Ta;
import X.C196419ao;
import X.C29441ip;
import X.C54412og;
import X.C64333Db;
import X.C66413Li;
import X.C86634Kw;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiPaymentSettingsFragment extends PaymentSettingsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C88854au r4 = (C88854au) C18310x6.A0N(this);
            C64333Db r3 = r4.A1B;
            C64333Db.Ad6(r3, indiaUpiPaymentSettingsFragment);
            C107695bk r2 = r3.A00;
            C1899593h.A12(r3, r2, indiaUpiPaymentSettingsFragment);
            C1899593h.A13(r3, r2, indiaUpiPaymentSettingsFragment, r3.A6O.get());
            C1899593h.A18(r3, indiaUpiPaymentSettingsFragment);
            C1899593h.A17(r3, indiaUpiPaymentSettingsFragment);
            indiaUpiPaymentSettingsFragment.A0J = (C194089Rn) r2.A98.get();
            indiaUpiPaymentSettingsFragment.A0B = C64333Db.A5u(r3);
            indiaUpiPaymentSettingsFragment.A04 = C86634Kw.A0T(r3);
            indiaUpiPaymentSettingsFragment.A08 = C64333Db.A2o(r3);
            indiaUpiPaymentSettingsFragment.A0U = C1899593h.A0Q(r3);
            indiaUpiPaymentSettingsFragment.A0A = C64333Db.A3D(r3);
            indiaUpiPaymentSettingsFragment.A07 = (C66413Li) r3.A6U.get();
            indiaUpiPaymentSettingsFragment.A0D = (AnonymousClass9W6) r3.AHa.get();
            indiaUpiPaymentSettingsFragment.A0G = C1899693i.A0N(r2);
            indiaUpiPaymentSettingsFragment.A0P = (AnonymousClass9TR) r2.A8k.get();
            indiaUpiPaymentSettingsFragment.A0K = r4.A18.ACl();
            indiaUpiPaymentSettingsFragment.A0F = C1899593h.A0D(r2);
            indiaUpiPaymentSettingsFragment.A0I = C1899693i.A0O(r3);
            indiaUpiPaymentSettingsFragment.A0M = C1899593h.A0L(r3);
            indiaUpiPaymentSettingsFragment.A05 = (C29441ip) r3.A68.get();
            indiaUpiPaymentSettingsFragment.A0H = r2.AN7();
            indiaUpiPaymentSettingsFragment.A0C = C1899693i.A0J(r3);
            indiaUpiPaymentSettingsFragment.A0O = (AnonymousClass9W3) r2.A8g.get();
            indiaUpiPaymentSettingsFragment.A0L = (AnonymousClass9VU) r3.AQH.get();
            indiaUpiPaymentSettingsFragment.A09 = (C54412og) r3.Aam.get();
            indiaUpiPaymentSettingsFragment.A0E = (C194479Ta) r3.APL.get();
            indiaUpiPaymentSettingsFragment.A0N = (C196419ao) r2.A8e.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A01();
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
            r2.A01()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiPaymentSettingsFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A01();
        A1R();
    }
}
