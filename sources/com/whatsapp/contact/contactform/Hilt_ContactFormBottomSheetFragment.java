package com.whatsapp.contact.contactform;

import X.AnonymousClass29z;
import X.C103165Lu;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C44102Ur;
import X.C53802nh;
import X.C64333Db;
import X.C66413Li;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86654Ky;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_ContactFormBottomSheetFragment extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            ContactFormBottomSheetFragment contactFormBottomSheetFragment = (ContactFormBottomSheetFragment) this;
            C88854au r1 = (C88854au) C18310x6.A0O(this);
            C64333Db r3 = r1.A1B;
            C107695bk r4 = r3.A00;
            C107695bk.AFg(r4, contactFormBottomSheetFragment);
            contactFormBottomSheetFragment.A01 = C64333Db.A01(r3);
            contactFormBottomSheetFragment.A0P = C64333Db.A5u(r3);
            contactFormBottomSheetFragment.A08 = C64333Db.A26(r3);
            contactFormBottomSheetFragment.A0J = (C66413Li) r3.A6U.get();
            contactFormBottomSheetFragment.A05 = C86654Ky.A0T(r3);
            contactFormBottomSheetFragment.A0I = (C53802nh) r4.A6e.get();
            contactFormBottomSheetFragment.A07 = C86614Ku.A0P(r3);
            contactFormBottomSheetFragment.A0L = C64333Db.A2r(r3);
            contactFormBottomSheetFragment.A0R = C86624Kv.A0W(r3);
            contactFormBottomSheetFragment.A00 = C86604Kt.A0N(r3);
            contactFormBottomSheetFragment.A0S = C64333Db.A8y(r3);
            contactFormBottomSheetFragment.A0K = C64333Db.A2o(r3);
            contactFormBottomSheetFragment.A0M = C64333Db.A2t(r3);
            contactFormBottomSheetFragment.A04 = C64333Db.A04(r3);
            contactFormBottomSheetFragment.A0Q = C86614Ku.A0k(r3);
            contactFormBottomSheetFragment.A0O = C64333Db.A4B(r3);
            contactFormBottomSheetFragment.A06 = C64333Db.A24(r3);
            contactFormBottomSheetFragment.A0N = C64333Db.A3o(r3);
            C88834as r12 = r1.A18;
            contactFormBottomSheetFragment.A02 = (C103165Lu) r12.A0M.get();
            contactFormBottomSheetFragment.A03 = (C44102Ur) r12.A0N.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.contactform.Hilt_ContactFormBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1X();
        A1R();
    }
}
