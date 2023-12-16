package com.whatsapp.community;

import X.AnonymousClass29z;
import X.C107695bk;
import X.C113935mE;
import X.C18270x1;
import X.C18280x3;
import X.C18310x6;
import X.C18320x8;
import X.C29331ie;
import X.C39602Cp;
import X.C50382i5;
import X.C59862xc;
import X.C64333Db;
import X.C86614Ku;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_JoinGroupBottomSheetFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = (JoinGroupBottomSheetFragment) this;
            C88854au r3 = (C88854au) C18310x6.A0O(this);
            C64333Db r2 = r3.A1B;
            C107695bk r4 = r2.A00;
            C107695bk.AFL(r4, r4, joinGroupBottomSheetFragment);
            joinGroupBottomSheetFragment.A0X = C64333Db.A2p(r2);
            joinGroupBottomSheetFragment.A0b = C64333Db.A4B(r2);
            joinGroupBottomSheetFragment.A0N = (C50382i5) r2.AZG.get();
            joinGroupBottomSheetFragment.A0a = C64333Db.A3o(r2);
            joinGroupBottomSheetFragment.A0K = C64333Db.A00(r2);
            joinGroupBottomSheetFragment.A0U = C64333Db.A29(r2);
            joinGroupBottomSheetFragment.A0g = C64333Db.A8y(r2);
            joinGroupBottomSheetFragment.A0S = C86614Ku.A0R(r2);
            joinGroupBottomSheetFragment.A0W = C64333Db.A2o(r2);
            joinGroupBottomSheetFragment.A0Y = C64333Db.A2t(r2);
            joinGroupBottomSheetFragment.A0Z = (C59862xc) r2.APF.get();
            joinGroupBottomSheetFragment.A0c = (C29331ie) r2.AP8.get();
            joinGroupBottomSheetFragment.A0V = C18280x3.A0L(r4);
            joinGroupBottomSheetFragment.A0L = (C39602Cp) r3.A0e.get();
            joinGroupBottomSheetFragment.A0e = C64333Db.A74(r2);
            joinGroupBottomSheetFragment.A0R = new C113935mE();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.Hilt_JoinGroupBottomSheetFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
