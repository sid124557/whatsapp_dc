package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass2GU;
import X.AnonymousClass99N;
import X.AnonymousClass99P;
import X.AnonymousClass9QM;
import X.AnonymousClass9RU;
import X.AnonymousClass9TR;
import X.AnonymousClass9VU;
import X.AnonymousClass9W3;
import X.AnonymousClass9bR;
import X.C102085Hk;
import X.C107695bk;
import X.C116985rC;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C1899593h;
import X.C194089Rn;
import X.C194479Ta;
import X.C194649Ty;
import X.C196689ba;
import X.C64333Db;
import X.C86634Kw;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BrazilPaymentSettingsFragment extends PaymentSettingsFragment {
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
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C64333Db r3 = ((C88854au) C18310x6.A0N(this)).A1B;
            C64333Db.Ad6(r3, brazilPaymentSettingsFragment);
            C107695bk r2 = r3.A00;
            C1899593h.A12(r3, r2, brazilPaymentSettingsFragment);
            C1899593h.A13(r3, r2, brazilPaymentSettingsFragment, r3.A6O.get());
            C1899593h.A18(r3, brazilPaymentSettingsFragment);
            C1899593h.A17(r3, brazilPaymentSettingsFragment);
            brazilPaymentSettingsFragment.A08 = (C194089Rn) r2.A98.get();
            brazilPaymentSettingsFragment.A01 = C86634Kw.A0T(r3);
            brazilPaymentSettingsFragment.A02 = (AnonymousClass99P) r2.A10.get();
            brazilPaymentSettingsFragment.A00 = (C116985rC) r3.AOi.get();
            brazilPaymentSettingsFragment.A05 = (AnonymousClass9bR) r2.A14.get();
            brazilPaymentSettingsFragment.A0G = (C196689ba) r2.A19.get();
            brazilPaymentSettingsFragment.A0F = (AnonymousClass9TR) r2.A8k.get();
            brazilPaymentSettingsFragment.A03 = C1899593h.A09(r3);
            brazilPaymentSettingsFragment.A0C = C1899593h.A0M(r2);
            brazilPaymentSettingsFragment.A07 = r2.AN7();
            brazilPaymentSettingsFragment.A04 = (AnonymousClass2GU) r2.A0Q.get();
            brazilPaymentSettingsFragment.A0E = (AnonymousClass9W3) r2.A8g.get();
            brazilPaymentSettingsFragment.A0A = (AnonymousClass9VU) r3.AQH.get();
            brazilPaymentSettingsFragment.A0B = (AnonymousClass99N) r3.APg.get();
            brazilPaymentSettingsFragment.A0H = (C194649Ty) r2.A1I.get();
            brazilPaymentSettingsFragment.A06 = (C194479Ta) r3.APL.get();
            brazilPaymentSettingsFragment.A09 = (AnonymousClass9RU) r2.A1B.get();
            brazilPaymentSettingsFragment.A0J = (AnonymousClass9QM) r2.A1M.get();
            brazilPaymentSettingsFragment.A0D = (C102085Hk) r2.A1F.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_BrazilPaymentSettingsFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1R();
    }
}
