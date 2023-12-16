package com.whatsapp.blockui;

import X.AnonymousClass1VX;
import X.AnonymousClass29z;
import X.AnonymousClass2LD;
import X.AnonymousClass30W;
import X.AnonymousClass4FS;
import X.C103755Oh;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C56612sH;
import X.C56962sq;
import X.C621033m;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_BlockConfirmationDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            BlockConfirmationDialogFragment blockConfirmationDialogFragment = (BlockConfirmationDialogFragment) this;
            C88854au r4 = (C88854au) C18310x6.A0N(this);
            C64333Db r2 = r4.A1B;
            C64333Db.Ad6(r2, blockConfirmationDialogFragment);
            C107695bk r3 = r2.A00;
            C107695bk.AFO(r3, blockConfirmationDialogFragment);
            blockConfirmationDialogFragment.A09 = C18280x3.A0Q(r3);
            blockConfirmationDialogFragment.A02 = C64333Db.A26(r2);
            blockConfirmationDialogFragment.A07 = (AnonymousClass2LD) r2.AIK.get();
            blockConfirmationDialogFragment.A05 = C64333Db.A2o(r2);
            blockConfirmationDialogFragment.A03 = C64333Db.A28(r2);
            blockConfirmationDialogFragment.A06 = r4.A18.ACa();
            blockConfirmationDialogFragment.A04 = C18280x3.A0L(r3);
            C56612sH A0V = C86604Kt.A0V(r2);
            AnonymousClass1VX A0Y = C86604Kt.A0Y(r2);
            C69263Wi A0K = C86614Ku.A0K(r2);
            AnonymousClass4FS A0g = C86604Kt.A0g(r2);
            blockConfirmationDialogFragment.A01 = new C103755Oh(A0K, (C621033m) r2.AZL.get(), (C56962sq) r2.A2b.get(), C86604Kt.A0R(r2), (AnonymousClass30W) r2.A00.AB2.get(), A0V, A0Y, A0g);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.blockui.Hilt_BlockConfirmationDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1U();
        A1R();
    }
}
