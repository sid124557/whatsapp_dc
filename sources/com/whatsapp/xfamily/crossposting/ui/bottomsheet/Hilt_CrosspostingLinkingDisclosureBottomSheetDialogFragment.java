package com.whatsapp.xfamily.crossposting.ui.bottomsheet;

import X.AnonymousClass29z;
import X.C102765Ke;
import X.C107695bk;
import X.C111135hb;
import X.C18260x0;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C56042rK;
import X.C64333Db;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_CrosspostingLinkingDisclosureBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            CrosspostingLinkingDisclosureBottomSheetDialogFragment crosspostingLinkingDisclosureBottomSheetDialogFragment = (CrosspostingLinkingDisclosureBottomSheetDialogFragment) this;
            C64333Db r1 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk r0 = r1.A00;
            C18260x0.A0J(r0, crosspostingLinkingDisclosureBottomSheetDialogFragment);
            crosspostingLinkingDisclosureBottomSheetDialogFragment.A03 = (C102765Ke) r0.A0D.get();
            crosspostingLinkingDisclosureBottomSheetDialogFragment.A05 = (C111135hb) r1.Ac5.get();
            crosspostingLinkingDisclosureBottomSheetDialogFragment.A04 = (C56042rK) r1.AEv.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xfamily.crossposting.ui.bottomsheet.Hilt_CrosspostingLinkingDisclosureBottomSheetDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}