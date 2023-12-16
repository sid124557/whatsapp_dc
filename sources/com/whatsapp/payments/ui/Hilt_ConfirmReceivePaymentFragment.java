package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass9TJ;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C1899593h;
import X.C1899693i;
import X.C194029Rh;
import X.C194649Ty;
import X.C194929Vc;
import X.C195089Vv;
import X.C40602Ha;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_ConfirmReceivePaymentFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (this instanceof Hilt_BrazilConfirmReceivePaymentFragment) {
            Hilt_BrazilConfirmReceivePaymentFragment hilt_BrazilConfirmReceivePaymentFragment = (Hilt_BrazilConfirmReceivePaymentFragment) this;
            if (!hilt_BrazilConfirmReceivePaymentFragment.A02) {
                hilt_BrazilConfirmReceivePaymentFragment.A02 = true;
                AnonymousClass3DY A0E = C18320x8.A0E(hilt_BrazilConfirmReceivePaymentFragment);
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) hilt_BrazilConfirmReceivePaymentFragment;
                C88854au r4 = (C88854au) A0E;
                C64333Db r3 = r4.A1B;
                C107695bk r2 = r3.A00;
                C1899593h.A19(r2, brazilConfirmReceivePaymentFragment);
                brazilConfirmReceivePaymentFragment.A04 = C1899593h.A0I(r3);
                brazilConfirmReceivePaymentFragment.A03 = C1899693i.A0L(r3);
                brazilConfirmReceivePaymentFragment.A02 = C64333Db.A2p(r3);
                brazilConfirmReceivePaymentFragment.A05 = C64333Db.A4B(r3);
                brazilConfirmReceivePaymentFragment.A00 = C64333Db.A04(r3);
                brazilConfirmReceivePaymentFragment.A01 = C64333Db.A06(r3);
                brazilConfirmReceivePaymentFragment.A06 = C64333Db.A5u(r3);
                brazilConfirmReceivePaymentFragment.A03 = C64333Db.A2t(r3);
                brazilConfirmReceivePaymentFragment.A0I = C1899593h.A0Q(r3);
                brazilConfirmReceivePaymentFragment.A07 = (C195089Vv) r2.A16.get();
                brazilConfirmReceivePaymentFragment.A0F = (AnonymousClass9TJ) r2.A17.get();
                brazilConfirmReceivePaymentFragment.A0B = C1899593h.A0F(r3);
                brazilConfirmReceivePaymentFragment.A0C = C1899593h.A0H(r3);
                brazilConfirmReceivePaymentFragment.A0E = (C194029Rh) r3.ANN.get();
                brazilConfirmReceivePaymentFragment.A04 = C1899593h.A09(r3);
                brazilConfirmReceivePaymentFragment.A0H = C1899593h.A0O(r3);
                brazilConfirmReceivePaymentFragment.A0D = C1899693i.A0P(r3);
                brazilConfirmReceivePaymentFragment.A08 = r4.A18.ACj();
                brazilConfirmReceivePaymentFragment.A09 = (C194929Vc) r3.A3V.get();
                brazilConfirmReceivePaymentFragment.A0A = (C40602Ha) C1899693i.A0Y(r3);
                brazilConfirmReceivePaymentFragment.A0G = (C194649Ty) r2.A1I.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            ConfirmReceivePaymentFragment confirmReceivePaymentFragment = (ConfirmReceivePaymentFragment) this;
            C64333Db r1 = ((C88854au) C18320x8.A0E(this)).A1B;
            C64333Db.Ad8(r1, confirmReceivePaymentFragment);
            confirmReceivePaymentFragment.A04 = C1899593h.A0I(r1);
            confirmReceivePaymentFragment.A03 = C1899693i.A0L(r1);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_ConfirmReceivePaymentFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
