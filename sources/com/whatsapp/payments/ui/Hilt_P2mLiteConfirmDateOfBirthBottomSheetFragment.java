package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass5X8;
import X.C107695bk;
import X.C171658Hx;
import X.C18270x1;
import X.C18320x8;
import X.C1899593h;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;

public abstract class Hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment extends ConfirmDateOfBirthBottomSheetFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = (P2mLiteConfirmDateOfBirthBottomSheetFragment) this;
            C64333Db r2 = ((C88854au) C18320x8.A0E(this)).A1B;
            C107695bk r1 = r2.A00;
            C1899593h.A19(r1, p2mLiteConfirmDateOfBirthBottomSheetFragment);
            p2mLiteConfirmDateOfBirthBottomSheetFragment.A06 = C64333Db.A4B(r2);
            p2mLiteConfirmDateOfBirthBottomSheetFragment.A08 = C1899593h.A0V(r1);
            p2mLiteConfirmDateOfBirthBottomSheetFragment.A03 = (AnonymousClass5X8) r2.Aac.get();
            p2mLiteConfirmDateOfBirthBottomSheetFragment.A04 = C64333Db.A2o(r2);
            p2mLiteConfirmDateOfBirthBottomSheetFragment.A05 = C64333Db.A2t(r2);
            p2mLiteConfirmDateOfBirthBottomSheetFragment.A00 = (C171658Hx) r1.A8U.get();
        }
    }

    public final void A1M() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1M();
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
            r2.A1M()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1M();
        A1H();
    }
}
