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
import com.whatsapp.contact.picker.ContactPickerFragment;

public abstract class Hilt_PaymentContactPickerFragment extends ContactPickerFragment {
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
            PaymentContactPickerFragment paymentContactPickerFragment = (PaymentContactPickerFragment) this;
            C88854au r5 = (C88854au) C18320x8.A0E(this);
            C64333Db r3 = r5.A1B;
            C107695bk r4 = r3.A00;
            C1899593h.A0y(r3, r4, r4, paymentContactPickerFragment);
            C88834as r1 = r5.A18;
            C107685bj.A0p(paymentContactPickerFragment, r1.ACL());
            C1899593h.A10(r3, r4, paymentContactPickerFragment);
            C1899593h.A16(r3, paymentContactPickerFragment, r3.A07.get());
            C1899593h.A11(r3, r4, paymentContactPickerFragment, r3.AYG);
            C107685bj.A0E(r3, paymentContactPickerFragment, C86614Ku.A0k(r3));
            paymentContactPickerFragment.A29 = C64333Db.A5u(r3);
            C1899593h.A0r(C86634Kw.A0T(r3), r1, r3, r4, paymentContactPickerFragment);
            C107685bj.A10(paymentContactPickerFragment, (C72303dV) r3.AMC.get());
            C107685bj.A0n(paymentContactPickerFragment, C86614Ku.A0V(r3));
            C107685bj.A0o(paymentContactPickerFragment, C64333Db.A2s(r3));
            C107685bj.A1T(paymentContactPickerFragment, r3.Aqw());
            C1899593h.A0w(r5, r3, r4, paymentContactPickerFragment, C1899593h.A0I(r3));
            C1899593h.A0t(r1, r3, r4, paymentContactPickerFragment);
            C1899593h.A0v(r5, r3, r4, paymentContactPickerFragment, (C56892sj) r3.AGm.get());
            C1899593h.A0u(r1, r3, paymentContactPickerFragment);
            C1899593h.A0s(r1, r5, r3, r4, paymentContactPickerFragment);
            paymentContactPickerFragment.A02 = C1899593h.A0H(r3);
            paymentContactPickerFragment.A01 = C1899593h.A0D(r4);
            paymentContactPickerFragment.A00 = C1899693i.A0A(r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_PaymentContactPickerFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A01();
        A1H();
    }
}
