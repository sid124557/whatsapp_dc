package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass9B3;
import X.AnonymousClass9U1;
import X.AnonymousClass9VH;
import X.C105895Wv;
import X.C107695bk;
import X.C153527bU;
import X.C18270x1;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C194619Tt;
import X.C40602Ha;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_IndiaUpiSendPaymentToVpaFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this;
            C64333Db r3 = ((C88854au) C18320x8.A0E(this)).A1B;
            C107695bk r2 = r3.A00;
            C1899593h.A19(r2, indiaUpiSendPaymentToVpaFragment);
            indiaUpiSendPaymentToVpaFragment.A0O = (C105895Wv) r3.AHN.get();
            indiaUpiSendPaymentToVpaFragment.A03 = C64333Db.A04(r3);
            indiaUpiSendPaymentToVpaFragment.A07 = C64333Db.A4B(r3);
            indiaUpiSendPaymentToVpaFragment.A0P = C64333Db.A8y(r3);
            indiaUpiSendPaymentToVpaFragment.A09 = C64333Db.A5u(r3);
            indiaUpiSendPaymentToVpaFragment.A04 = C64333Db.A2t(r3);
            indiaUpiSendPaymentToVpaFragment.A0N = C1899593h.A0Q(r3);
            indiaUpiSendPaymentToVpaFragment.A0C = C1899693i.A0H(r2);
            indiaUpiSendPaymentToVpaFragment.A0L = (C153527bU) r2.A6Q.get();
            indiaUpiSendPaymentToVpaFragment.A0D = (AnonymousClass9U1) r3.AHX.get();
            indiaUpiSendPaymentToVpaFragment.A0A = (AnonymousClass9VH) r2.A0z.get();
            indiaUpiSendPaymentToVpaFragment.A0G = C1899593h.A0F(r3);
            indiaUpiSendPaymentToVpaFragment.A06 = C1899593h.A09(r3);
            indiaUpiSendPaymentToVpaFragment.A05 = C1899693i.A0A(r3);
            indiaUpiSendPaymentToVpaFragment.A0I = C1899593h.A0L(r3);
            indiaUpiSendPaymentToVpaFragment.A0B = (C194619Tt) r2.A6K.get();
            indiaUpiSendPaymentToVpaFragment.A0F = (C40602Ha) C1899693i.A0Y(r3);
            indiaUpiSendPaymentToVpaFragment.A0E = C1899693i.A0J(r3);
            indiaUpiSendPaymentToVpaFragment.A0M = (AnonymousClass9B3) r2.A6S.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiSendPaymentToVpaFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
