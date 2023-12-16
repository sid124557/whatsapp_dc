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
import X.C380625j;
import X.C49882hF;
import X.C53592nL;
import X.C619532x;
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

public abstract class Hilt_VoipContactPickerFragment extends SelectedListContactPickerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            VoipContactPickerFragment voipContactPickerFragment = (VoipContactPickerFragment) this;
            C88854au r4 = (C88854au) C18320x8.A0E(this);
            C64333Db r2 = r4.A1B;
            voipContactPickerFragment.A00 = r2.A00.ANI();
            voipContactPickerFragment.A2R = C86614Ku.A0j(r2);
            voipContactPickerFragment.A1S = C86604Kt.A0V(r2);
            voipContactPickerFragment.A2F = (AnonymousClass5QQ) r2.A00.A85.get();
            voipContactPickerFragment.A0W = C86634Kw.A0U(r2);
            voipContactPickerFragment.A0c = (AnonymousClass5Ul) r2.AUW.get();
            voipContactPickerFragment.A2c = C86604Kt.A0g(r2);
            C88834as r3 = r4.A18;
            voipContactPickerFragment.A1X = r3.ACL();
            voipContactPickerFragment.A1f = C86614Ku.A0X(r2);
            voipContactPickerFragment.A0T = C86614Ku.A0J(r2);
            voipContactPickerFragment.A27 = (C106685Zz) r2.AJ4.get();
            C107685bj.A0B(r2, voipContactPickerFragment, C86604Kt.A0Z(r2));
            voipContactPickerFragment.A1x = C86604Kt.A0Y(r2);
            voipContactPickerFragment.A2e = (AnonymousClass2Z2) r2.A2L.get();
            voipContactPickerFragment.A2V = C86624Kv.A0W(r2);
            voipContactPickerFragment.A2f = r2.Ari();
            voipContactPickerFragment.A0a = C86614Ku.A0K(r2);
            voipContactPickerFragment.A15 = C86604Kt.A0S(r2);
            voipContactPickerFragment.A0b = C86614Ku.A0L(r2);
            voipContactPickerFragment.A2Y = C86634Kw.A0r(r2);
            voipContactPickerFragment.A21 = (C49882hF) r2.AGU.get();
            voipContactPickerFragment.A2P = C86604Kt.A0e(r2);
            voipContactPickerFragment.A2a = C86614Ku.A0m(r2);
            C107685bj.A0F(r2, voipContactPickerFragment, C86614Ku.A0n(r2));
            voipContactPickerFragment.A0y = C86604Kt.A0Q(r2);
            C107685bj.A04(C86604Kt.A0N(r2), r2, voipContactPickerFragment);
            C107685bj.A0E(r2, voipContactPickerFragment, C86614Ku.A0k(r2));
            voipContactPickerFragment.A29 = C86614Ku.A0c(r2);
            voipContactPickerFragment.A0U = C86634Kw.A0T(r2);
            voipContactPickerFragment.A28 = r2.Ao7();
            voipContactPickerFragment.A0o = C86634Kw.A0Y(r2);
            C107685bj.A0A(r2, voipContactPickerFragment, C86604Kt.A0T(r2));
            voipContactPickerFragment.A0w = C86604Kt.A0P(r2);
            voipContactPickerFragment.A12 = C86604Kt.A0R(r2);
            voipContactPickerFragment.A1V = C86604Kt.A0W(r2);
            voipContactPickerFragment.A0v = C86614Ku.A0P(r2);
            voipContactPickerFragment.A24 = r3.ACV();
            voipContactPickerFragment.A1j = C86614Ku.A0a(r2);
            voipContactPickerFragment.A1T = C86614Ku.A0V(r2);
            voipContactPickerFragment.A1U = C86614Ku.A0W(r2);
            voipContactPickerFragment.A2N = r2.Aqw();
            C107685bj.A0D(r2, voipContactPickerFragment, C86614Ku.A0f(r2));
            C88834as.A4x(r3, r4, r2, voipContactPickerFragment);
            voipContactPickerFragment.A0t = C86634Kw.A0Z(r2);
            C107685bj.A0C(r2, voipContactPickerFragment, C107695bk.A2k(r2));
            voipContactPickerFragment.A2I = C86614Ku.A0g(r2);
            C88834as.A4y(r3, r4, r2, voipContactPickerFragment, (AnonymousClass5TZ) r2.A00.AB9.get());
            voipContactPickerFragment.A1Y = (C22931Qq) r2.A7Y.get();
            voipContactPickerFragment.A1H = (C53592nL) r2.A6M.get();
            C88834as.A4z(r3, r4, r2, voipContactPickerFragment, r3.A1U.get());
            voipContactPickerFragment.A04 = (C380625j) r2.ASN.get();
            voipContactPickerFragment.A01 = r2.Ai2();
            voipContactPickerFragment.A02 = (C619532x) r2.A00.AAR.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A01();
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
            r2.A01()
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.Hilt_VoipContactPickerFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A01();
        A1H();
    }
}
