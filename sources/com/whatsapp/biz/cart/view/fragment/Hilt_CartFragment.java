package com.whatsapp.biz.cart.view.fragment;

import X.AnonymousClass29z;
import X.AnonymousClass2V3;
import X.AnonymousClass5UW;
import X.AnonymousClass7C3;
import X.AnonymousClass7C8;
import X.AnonymousClass7CH;
import X.AnonymousClass7SU;
import X.AnonymousClass7SV;
import X.C104705Sa;
import X.C105405Uu;
import X.C105915Wx;
import X.C106665Zw;
import X.C107695bk;
import X.C1448173b;
import X.C151257Ua;
import X.C154197cm;
import X.C18270x1;
import X.C18310x6;
import X.C18320x8;
import X.C29201iR;
import X.C29221iT;
import X.C49712gy;
import X.C64333Db;
import X.C64393Dh;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86644Kx;
import X.C86654Ky;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_CartFragment extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1R() {
        if (!this.A02) {
            this.A02 = true;
            CartFragment cartFragment = (CartFragment) this;
            C88854au r2 = (C88854au) C18310x6.A0O(this);
            C64333Db r3 = r2.A1B;
            C107695bk r4 = r3.A00;
            C107695bk.AFL(r4, r4, cartFragment);
            cartFragment.A0l = C64333Db.A2p(r3);
            cartFragment.A0t = C64333Db.A4B(r3);
            cartFragment.A14 = C86644Kx.A0b(r3);
            cartFragment.A0H = C64333Db.A04(r3);
            cartFragment.A0B = C64333Db.A01(r3);
            cartFragment.A16 = C64333Db.A8y(r3);
            cartFragment.A0J = C64333Db.A06(r3);
            cartFragment.A0G = (C64393Dh) r3.AS1.get();
            cartFragment.A0C = (AnonymousClass7C3) r2.A02.get();
            cartFragment.A0r = C64333Db.A3o(r3);
            cartFragment.A0K = C64333Db.A08(r3);
            cartFragment.A0q = C86604Kt.A0X(r3);
            cartFragment.A0L = (C49712gy) r3.AaZ.get();
            cartFragment.A0y = C86644Kx.A0a(r3);
            cartFragment.A0R = (AnonymousClass5UW) r3.A4T.get();
            cartFragment.A0Q = (C29201iR) r3.A4U.get();
            cartFragment.A0x = C64333Db.A5u(r3);
            cartFragment.A15 = C86614Ku.A0m(r3);
            cartFragment.A0k = C64333Db.A2o(r3);
            cartFragment.A0j = C64333Db.A28(r3);
            cartFragment.A0n = C64333Db.A2t(r3);
            cartFragment.A0p = C107695bk.A1m(r4);
            cartFragment.A0f = C86654Ky.A0T(r3);
            cartFragment.A0h = C86614Ku.A0S(r3);
            cartFragment.A0Y = (C29221iT) r3.ARg.get();
            cartFragment.A0b = (C151257Ua) r4.A2I.get();
            cartFragment.A0Z = (C105405Uu) r3.A4W.get();
            cartFragment.A0s = C107695bk.A1n(r4);
            cartFragment.A0i = C86614Ku.A0T(r3);
            cartFragment.A0m = C64333Db.A2s(r3);
            cartFragment.A0e = new C106665Zw(0);
            cartFragment.A0P = C86624Kv.A0K(r3);
            cartFragment.A0a = C86644Kx.A0P(r3);
            cartFragment.A0z = C64333Db.A74(r3);
            cartFragment.A0w = (C105915Wx) r3.AG3.get();
            cartFragment.A0D = (AnonymousClass7C8) r2.A0D.get();
            cartFragment.A0U = r2.A18.ABU();
            cartFragment.A12 = (C104705Sa) r3.A4e.get();
            cartFragment.A10 = (AnonymousClass7SU) r3.A4d.get();
            cartFragment.A11 = (AnonymousClass7SV) r4.A2J.get();
            cartFragment.A0g = r3.Ai7();
            cartFragment.A0T = new C154197cm();
            cartFragment.A0S = new C1448173b();
            cartFragment.A0E = (AnonymousClass7CH) r2.A0O.get();
            cartFragment.A13 = C86604Kt.A0f(r3);
            cartFragment.A0F = (AnonymousClass2V3) r2.A0Z.get();
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.cart.view.fragment.Hilt_CartFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1Z();
        A1R();
    }
}
