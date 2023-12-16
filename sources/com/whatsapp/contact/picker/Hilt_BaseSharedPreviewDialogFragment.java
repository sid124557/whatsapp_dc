package com.whatsapp.contact.picker;

import X.AnonymousClass29z;
import X.AnonymousClass3DY;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C48682fI;
import X.C64333Db;
import X.C64393Dh;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_BaseSharedPreviewDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (this instanceof Hilt_SharedTextPreviewDialogFragment) {
            Hilt_SharedTextPreviewDialogFragment hilt_SharedTextPreviewDialogFragment = (Hilt_SharedTextPreviewDialogFragment) this;
            if (!hilt_SharedTextPreviewDialogFragment.A02) {
                hilt_SharedTextPreviewDialogFragment.A02 = true;
                AnonymousClass3DY A0N = C18310x6.A0N(hilt_SharedTextPreviewDialogFragment);
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) hilt_SharedTextPreviewDialogFragment;
                C64333Db r3 = ((C88854au) A0N).A1B;
                C64333Db.Ad6(r3, sharedTextPreviewDialogFragment);
                C107695bk r2 = r3.A00;
                C107695bk.AFO(r2, sharedTextPreviewDialogFragment);
                sharedTextPreviewDialogFragment.A08 = C64333Db.A04(r3);
                sharedTextPreviewDialogFragment.A07 = (C64393Dh) r3.AS1.get();
                sharedTextPreviewDialogFragment.A09 = C64333Db.A26(r3);
                sharedTextPreviewDialogFragment.A0E = C86614Ku.A0m(r3);
                sharedTextPreviewDialogFragment.A0C = C64333Db.A2o(r3);
                sharedTextPreviewDialogFragment.A0A = C64333Db.A28(r3);
                sharedTextPreviewDialogFragment.A0L = C86644Kx.A0b(r3);
                sharedTextPreviewDialogFragment.A03 = C64333Db.A01(r3);
                sharedTextPreviewDialogFragment.A0M = C64333Db.A8y(r3);
                sharedTextPreviewDialogFragment.A0E = C86634Kw.A0m(r3);
                sharedTextPreviewDialogFragment.A04 = C64333Db.A07(r3);
                sharedTextPreviewDialogFragment.A0C = C64333Db.A3o(r3);
                sharedTextPreviewDialogFragment.A0A = C107695bk.A1m(r2);
                sharedTextPreviewDialogFragment.A0F = (C48682fI) r3.AKH.get();
                sharedTextPreviewDialogFragment.A0B = C86604Kt.A0X(r3);
                sharedTextPreviewDialogFragment.A02 = C64333Db.A00(r3);
                sharedTextPreviewDialogFragment.A0K = C64333Db.A8w(r3);
                sharedTextPreviewDialogFragment.A0D = C107695bk.A1n(r2);
                sharedTextPreviewDialogFragment.A07 = C64333Db.A2s(r3);
                sharedTextPreviewDialogFragment.A0I = r3.Aqw();
                sharedTextPreviewDialogFragment.A0J = C86634Kw.A0q(r3);
                sharedTextPreviewDialogFragment.A0H = C64333Db.A74(r3);
                sharedTextPreviewDialogFragment.A09 = C107695bk.A1l(r2);
            }
        } else if (!this.A02) {
            this.A02 = true;
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = (BaseSharedPreviewDialogFragment) this;
            C64333Db r1 = ((C88854au) C18310x6.A0N(this)).A1B;
            C64333Db.Ad6(r1, baseSharedPreviewDialogFragment);
            C107695bk.AFO(r1.A00, baseSharedPreviewDialogFragment);
            baseSharedPreviewDialogFragment.A08 = C64333Db.A04(r1);
            baseSharedPreviewDialogFragment.A07 = (C64393Dh) r1.AS1.get();
            baseSharedPreviewDialogFragment.A09 = C64333Db.A26(r1);
            baseSharedPreviewDialogFragment.A0E = C86614Ku.A0m(r1);
            baseSharedPreviewDialogFragment.A0C = C64333Db.A2o(r1);
            baseSharedPreviewDialogFragment.A0A = C64333Db.A28(r1);
        }
    }

    public final void A1U() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1U();
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
            r2.A1U()
            r2.A1R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.Hilt_BaseSharedPreviewDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1U();
        A1R();
    }
}
