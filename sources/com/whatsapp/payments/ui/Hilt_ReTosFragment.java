package com.whatsapp.payments.ui;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.AnonymousClass5X8;
import X.C107695bk;
import X.C18260x0;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C1899593h;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_ReTosFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (this instanceof Hilt_BrazilReTosFragment) {
            Hilt_BrazilReTosFragment hilt_BrazilReTosFragment = (Hilt_BrazilReTosFragment) this;
            if (!hilt_BrazilReTosFragment.A02) {
                hilt_BrazilReTosFragment.A02 = true;
                AnonymousClass3DY A0O = C18310x6.A0O(hilt_BrazilReTosFragment);
                BrazilReTosFragment brazilReTosFragment = (BrazilReTosFragment) hilt_BrazilReTosFragment;
                C64333Db r2 = ((C88854au) A0O).A1B;
                C107695bk r1 = r2.A00;
                C18260x0.A0J(r1, brazilReTosFragment);
                brazilReTosFragment.A03 = C64333Db.A4B(r2);
                brazilReTosFragment.A02 = C64333Db.A2o(r2);
                brazilReTosFragment.A04 = C1899593h.A0F(r2);
                brazilReTosFragment.A05 = r1.AN7();
                brazilReTosFragment.A01 = C1899593h.A0V(r1);
                brazilReTosFragment.A00 = (AnonymousClass5X8) r2.Aac.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            ReTosFragment reTosFragment = (ReTosFragment) this;
            C64333Db r22 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk r12 = r22.A00;
            C18260x0.A0J(r12, reTosFragment);
            reTosFragment.A03 = C64333Db.A4B(r22);
            reTosFragment.A02 = C64333Db.A2o(r22);
            reTosFragment.A04 = C1899593h.A0F(r22);
            reTosFragment.A05 = r12.AN7();
        }
    }

    public final void A1Z() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1Z();
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
            r2.A1Z()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.Hilt_ReTosFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
