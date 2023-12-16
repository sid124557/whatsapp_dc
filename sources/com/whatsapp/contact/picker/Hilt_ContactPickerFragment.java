package com.whatsapp.contact.picker;

import X.AnonymousClass29z;
import X.AnonymousClass2Z2;
import X.AnonymousClass5QQ;
import X.AnonymousClass5TZ;
import X.AnonymousClass5Ul;
import X.C106685Zz;
import X.C107685bj;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C22931Qq;
import X.C49882hF;
import X.C53592nL;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_ContactPickerFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this;
            C88854au r4 = (C88854au) C18320x8.A0E(this);
            C64333Db r2 = r4.A1B;
            contactPickerFragment.A00 = r2.A00.ANI();
            contactPickerFragment.A2R = C86614Ku.A0j(r2);
            contactPickerFragment.A1S = C86604Kt.A0V(r2);
            contactPickerFragment.A2F = (AnonymousClass5QQ) r2.A00.A85.get();
            contactPickerFragment.A0W = C86634Kw.A0U(r2);
            contactPickerFragment.A0c = (AnonymousClass5Ul) r2.AUW.get();
            contactPickerFragment.A2c = C86604Kt.A0g(r2);
            C88834as r1 = r4.A18;
            contactPickerFragment.A1X = r1.ACL();
            contactPickerFragment.A1f = C86614Ku.A0X(r2);
            contactPickerFragment.A0T = C86614Ku.A0J(r2);
            contactPickerFragment.A27 = (C106685Zz) r2.AJ4.get();
            C107685bj.A0B(r2, contactPickerFragment, C86604Kt.A0Z(r2));
            contactPickerFragment.A1x = C86604Kt.A0Y(r2);
            contactPickerFragment.A2e = (AnonymousClass2Z2) r2.A2L.get();
            contactPickerFragment.A2V = C86624Kv.A0W(r2);
            contactPickerFragment.A2f = r2.Ari();
            contactPickerFragment.A0a = C86614Ku.A0K(r2);
            contactPickerFragment.A15 = C86604Kt.A0S(r2);
            contactPickerFragment.A0b = C86614Ku.A0L(r2);
            contactPickerFragment.A2Y = C86634Kw.A0r(r2);
            contactPickerFragment.A21 = (C49882hF) r2.AGU.get();
            contactPickerFragment.A2P = C86604Kt.A0e(r2);
            contactPickerFragment.A2a = C86614Ku.A0m(r2);
            C107685bj.A0F(r2, contactPickerFragment, C86614Ku.A0n(r2));
            contactPickerFragment.A0y = C86604Kt.A0Q(r2);
            C107685bj.A04(C86604Kt.A0N(r2), r2, contactPickerFragment);
            C107685bj.A0E(r2, contactPickerFragment, C86614Ku.A0k(r2));
            contactPickerFragment.A29 = C86614Ku.A0c(r2);
            contactPickerFragment.A0U = C86634Kw.A0T(r2);
            contactPickerFragment.A28 = r2.Ao7();
            contactPickerFragment.A0o = C86634Kw.A0Y(r2);
            C107685bj.A0A(r2, contactPickerFragment, C86604Kt.A0T(r2));
            contactPickerFragment.A0w = C86604Kt.A0P(r2);
            contactPickerFragment.A12 = C86604Kt.A0R(r2);
            contactPickerFragment.A1V = C86604Kt.A0W(r2);
            contactPickerFragment.A0v = C86614Ku.A0P(r2);
            contactPickerFragment.A24 = r1.ACV();
            contactPickerFragment.A1j = C86614Ku.A0a(r2);
            contactPickerFragment.A1T = C86614Ku.A0V(r2);
            contactPickerFragment.A1U = C86614Ku.A0W(r2);
            contactPickerFragment.A2N = r2.Aqw();
            C107685bj.A0D(r2, contactPickerFragment, C86614Ku.A0f(r2));
            C88834as.A4x(r1, r4, r2, contactPickerFragment);
            contactPickerFragment.A0t = C86634Kw.A0Z(r2);
            C107685bj.A0C(r2, contactPickerFragment, C107695bk.A2k(r2));
            contactPickerFragment.A2I = C86614Ku.A0g(r2);
            C88834as.A4y(r1, r4, r2, contactPickerFragment, (AnonymousClass5TZ) r2.A00.AB9.get());
            contactPickerFragment.A1Y = (C22931Qq) r2.A7Y.get();
            contactPickerFragment.A1H = (C53592nL) r2.A6M.get();
            C88834as.A4z(r1, r4, r2, contactPickerFragment, r1.A1U.get());
        }
    }

    public final void A1I() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A1I();
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
            r2.A1I()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.Hilt_ContactPickerFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A1I();
        A1H();
    }
}
