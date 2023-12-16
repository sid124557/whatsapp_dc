package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.C107685bj;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C56892sj;
import X.C64333Db;
import X.C72303dV;
import X.C86614Ku;
import X.C86634Kw;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiContactPickerFragment extends PaymentContactPickerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiContactPickerFragment indiaUpiContactPickerFragment = (IndiaUpiContactPickerFragment) this;
            C88854au r5 = (C88854au) C18320x8.A0E(this);
            C64333Db r2 = r5.A1B;
            C107695bk r4 = r2.A00;
            C1899593h.A0y(r2, r4, r4, indiaUpiContactPickerFragment);
            C88834as r3 = r5.A18;
            C107685bj.A0p(indiaUpiContactPickerFragment, r3.ACL());
            C1899593h.A10(r2, r4, indiaUpiContactPickerFragment);
            C1899593h.A16(r2, indiaUpiContactPickerFragment, r2.A07.get());
            C1899593h.A11(r2, r4, indiaUpiContactPickerFragment, r2.AYG);
            C107685bj.A0E(r2, indiaUpiContactPickerFragment, C86614Ku.A0k(r2));
            indiaUpiContactPickerFragment.A29 = C64333Db.A5u(r2);
            C1899593h.A0r(C86634Kw.A0T(r2), r3, r2, r4, indiaUpiContactPickerFragment);
            C107685bj.A10(indiaUpiContactPickerFragment, (C72303dV) r2.AMC.get());
            C107685bj.A0n(indiaUpiContactPickerFragment, C86614Ku.A0V(r2));
            C107685bj.A0o(indiaUpiContactPickerFragment, C64333Db.A2s(r2));
            C107685bj.A1T(indiaUpiContactPickerFragment, r2.Aqw());
            C1899593h.A0w(r5, r2, r4, indiaUpiContactPickerFragment, C1899593h.A0I(r2));
            C1899593h.A0t(r3, r2, r4, indiaUpiContactPickerFragment);
            C1899593h.A0v(r5, r2, r4, indiaUpiContactPickerFragment, (C56892sj) r2.AGm.get());
            C1899593h.A0u(r3, r2, indiaUpiContactPickerFragment);
            C1899593h.A0s(r3, r5, r2, r4, indiaUpiContactPickerFragment);
            indiaUpiContactPickerFragment.A02 = C1899593h.A0H(r2);
            indiaUpiContactPickerFragment.A01 = C1899593h.A0D(r4);
            indiaUpiContactPickerFragment.A00 = C1899693i.A0A(r2);
            indiaUpiContactPickerFragment.A01 = C1899593h.A0E(r2);
            indiaUpiContactPickerFragment.A02 = C1899693i.A0N(r4);
            indiaUpiContactPickerFragment.A03 = r3.ACl();
            indiaUpiContactPickerFragment.A04 = C1899593h.A0L(r2);
            indiaUpiContactPickerFragment.A00 = C1899693i.A0J(r2);
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
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_IndiaUpiContactPickerFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A01();
        A1H();
    }
}
