package com.whatsapp.reactions;

import X.AnonymousClass29z;
import X.AnonymousClass2W8;
import X.C107695bk;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C50632iV;
import X.C64333Db;
import X.C86614Ku;
import X.C86624Kv;
import X.C86654Ky;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_ReactionsBottomSheetDialogFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = (ReactionsBottomSheetDialogFragment) this;
            C64333Db r2 = ((C88854au) C18310x6.A0O(this)).A1B;
            C107695bk r0 = r2.A00;
            C107695bk.AFL(r0, r0, reactionsBottomSheetDialogFragment);
            reactionsBottomSheetDialogFragment.A02 = C64333Db.A04(r2);
            reactionsBottomSheetDialogFragment.A03 = C64333Db.A06(r2);
            reactionsBottomSheetDialogFragment.A0O = C64333Db.A8y(r2);
            reactionsBottomSheetDialogFragment.A0G = C64333Db.A39(r2);
            reactionsBottomSheetDialogFragment.A04 = C64333Db.A08(r2);
            reactionsBottomSheetDialogFragment.A01 = C64333Db.A00(r2);
            reactionsBottomSheetDialogFragment.A09 = C86614Ku.A0R(r2);
            reactionsBottomSheetDialogFragment.A0A = C64333Db.A26(r2);
            reactionsBottomSheetDialogFragment.A0B = C64333Db.A28(r2);
            reactionsBottomSheetDialogFragment.A0E = C64333Db.A2t(r2);
            reactionsBottomSheetDialogFragment.A0L = C64333Db.A8F(r2);
            reactionsBottomSheetDialogFragment.A0M = C86654Ky.A0e(r2);
            reactionsBottomSheetDialogFragment.A0F = (C50632iV) r2.A46.get();
            reactionsBottomSheetDialogFragment.A08 = C64333Db.A1k(r2);
            reactionsBottomSheetDialogFragment.A0H = C64333Db.A3G(r2);
            reactionsBottomSheetDialogFragment.A0C = C86624Kv.A0P(r2);
            reactionsBottomSheetDialogFragment.A0I = (AnonymousClass2W8) r2.AQv.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reactions.Hilt_ReactionsBottomSheetDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
