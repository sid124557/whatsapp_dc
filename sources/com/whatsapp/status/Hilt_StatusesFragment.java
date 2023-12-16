package com.whatsapp.status;

import X.AnonymousClass29z;
import X.AnonymousClass2W5;
import X.AnonymousClass3DY;
import X.AnonymousClass5F9;
import X.AnonymousClass5ME;
import X.AnonymousClass5O5;
import X.AnonymousClass5PU;
import X.AnonymousClass5X9;
import X.C102195Hv;
import X.C103635Nt;
import X.C105105Tp;
import X.C107695bk;
import X.C107895c5;
import X.C115155oD;
import X.C18270x1;
import X.C18320x8;
import X.C29081iF;
import X.C29141iL;
import X.C380625j;
import X.C48102eL;
import X.C48852fa;
import X.C55152pt;
import X.C55262q4;
import X.C61072zf;
import X.C64333Db;
import X.C65173Gm;
import X.C66663Mh;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C88744aj;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaListFragment;

public abstract class Hilt_StatusesFragment extends WaListFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            StatusesFragment statusesFragment = (StatusesFragment) this;
            C64333Db r3 = ((C88854au) ((AnonymousClass3DY) generatedComponent())).A1B;
            C107695bk r4 = r3.A00;
            statusesFragment.A00 = r4.ANI();
            statusesFragment.A0W = C64333Db.A2p(r3);
            statusesFragment.A0h = C64333Db.A4B(r3);
            statusesFragment.A0E = C64333Db.A04(r3);
            statusesFragment.A0X = C64333Db.A2q(r3);
            statusesFragment.A0F = C64333Db.A06(r3);
            statusesFragment.A1B = C64333Db.A8y(r3);
            statusesFragment.A0V = (C380625j) r3.ASN.get();
            C88744aj r1 = C88744aj.A00;
            statusesFragment.A09 = r1;
            statusesFragment.A0i = C64333Db.A4H(r3);
            statusesFragment.A0G = (C66663Mh) r3.AUd.get();
            statusesFragment.A0g = C86634Kw.A0h(r3);
            statusesFragment.A0H = (C48852fa) r4.ABc.get();
            statusesFragment.A0I = C64333Db.A08(r3);
            statusesFragment.A0b = (C61072zf) r3.AXI.get();
            statusesFragment.A0B = C64333Db.A00(r3);
            statusesFragment.A0Q = C64333Db.A29(r3);
            statusesFragment.A08 = r1;
            statusesFragment.A06 = C86634Kw.A0S(r3);
            statusesFragment.A1D = C86634Kw.A0s(r3);
            statusesFragment.A0M = C64333Db.A26(r3);
            statusesFragment.A1A = C86614Ku.A0o(r3);
            statusesFragment.A0U = C64333Db.A2o(r3);
            statusesFragment.A0O = C64333Db.A28(r3);
            statusesFragment.A0a = C64333Db.A2t(r3);
            statusesFragment.A0c = C86614Ku.A0Z(r3);
            statusesFragment.A0N = C86614Ku.A0S(r3);
            statusesFragment.A0d = C64333Db.A3K(r3);
            statusesFragment.A0R = r4.AKk();
            statusesFragment.A0l = C86634Kw.A0p(r3);
            statusesFragment.A0T = C86664Kz.A18(r3);
            statusesFragment.A16 = r4.APc();
            statusesFragment.A0J = C86654Ky.A0U(r3);
            statusesFragment.A0e = (C55152pt) r3.AWi.get();
            statusesFragment.A0n = (AnonymousClass5PU) r3.Aal.get();
            statusesFragment.A0L = C86614Ku.A0P(r3);
            statusesFragment.A0y = (C65173Gm) r3.ATW.get();
            statusesFragment.A0t = r4.APa();
            statusesFragment.A0Y = C64333Db.A2r(r3);
            statusesFragment.A0Z = C64333Db.A2s(r3);
            statusesFragment.A0p = (C29081iF) r3.AWj.get();
            statusesFragment.A12 = (C115155oD) r4.ABK.get();
            statusesFragment.A0z = (C105105Tp) r3.AWp.get();
            statusesFragment.A13 = C86634Kw.A0q(r3);
            statusesFragment.A14 = (AnonymousClass5X9) r4.ABC.get();
            statusesFragment.A0f = (AnonymousClass2W5) r3.AWo.get();
            statusesFragment.A0j = (C48102eL) r3.A18.get();
            statusesFragment.A11 = r3.Aqw();
            statusesFragment.A0K = (AnonymousClass5O5) r4.A2G.get();
            statusesFragment.A0A = (C107895c5) r4.A0I.get();
            statusesFragment.A1G = C72343dZ.A00(r4.ACM);
            statusesFragment.A1E = C72343dZ.A00(r3.A7Q);
            statusesFragment.A0C = (AnonymousClass5ME) r4.A4b.get();
            statusesFragment.A1C = (C29141iL) r3.A0O.get();
            statusesFragment.A0S = (C55262q4) r3.A5q.get();
            statusesFragment.A15 = (C103635Nt) r4.ABJ.get();
            statusesFragment.A1F = C72343dZ.A00(r3.AWZ);
            statusesFragment.A1H = C72343dZ.A00(r3.Ac2);
            statusesFragment.A0k = C64333Db.A5A(r3);
            statusesFragment.A0s = r4.APZ();
            statusesFragment.A07 = r1;
            statusesFragment.A0v = r3.Aqu();
            statusesFragment.A0u = r4.APb();
            statusesFragment.A0D = (AnonymousClass5F9) r4.A4c.get();
            statusesFragment.A0w = (C102195Hv) r4.AB8.get();
            statusesFragment.A05 = r1;
            statusesFragment.A19 = C86604Kt.A0f(r3);
            statusesFragment.A04 = r1;
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
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
            r2.A00()
            r2.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.Hilt_StatusesFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1J();
    }
}
