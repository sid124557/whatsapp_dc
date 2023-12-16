package com.whatsapp.updates.ui;

import X.AnonymousClass29z;
import X.AnonymousClass4L4;
import X.AnonymousClass5FA;
import X.AnonymousClass5FB;
import X.AnonymousClass5FI;
import X.AnonymousClass5FZ;
import X.AnonymousClass5L2;
import X.AnonymousClass5O5;
import X.AnonymousClass5PU;
import X.AnonymousClass5YD;
import X.C101505Fa;
import X.C102195Hv;
import X.C103295Mi;
import X.C105105Tp;
import X.C105325Um;
import X.C107695bk;
import X.C107895c5;
import X.C115155oD;
import X.C18270x1;
import X.C18320x8;
import X.C53502nC;
import X.C55262q4;
import X.C61072zf;
import X.C64333Db;
import X.C65173Gm;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86654Ky;
import X.C88744aj;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

public abstract class Hilt_UpdatesFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C18320x8.A0T(super.A1D(), this);
            this.A01 = AnonymousClass29z.A00(super.A1D());
        }
    }

    public void A1H() {
        if (!this.A02) {
            this.A02 = true;
            UpdatesFragment updatesFragment = (UpdatesFragment) this;
            C88854au r5 = (C88854au) C18320x8.A0E(this);
            C64333Db r3 = r5.A1B;
            C107695bk r2 = r3.A00;
            C107695bk.AFP(r2, updatesFragment);
            updatesFragment.A0K = C64333Db.A2p(r3);
            updatesFragment.A0P = C64333Db.A4B(r3);
            updatesFragment.A0D = C64333Db.A04(r3);
            updatesFragment.A0L = C64333Db.A2q(r3);
            updatesFragment.A0E = C64333Db.A06(r3);
            updatesFragment.A0s = C64333Db.A8y(r3);
            C88744aj r4 = C88744aj.A00;
            updatesFragment.A05 = r4;
            updatesFragment.A0O = (C61072zf) r3.AXI.get();
            updatesFragment.A07 = C64333Db.A00(r3);
            updatesFragment.A04 = r4;
            updatesFragment.A02 = C86634Kw.A0S(r3);
            updatesFragment.A0r = C86614Ku.A0o(r3);
            updatesFragment.A0J = C64333Db.A2o(r3);
            updatesFragment.A0U = C86634Kw.A0n(r3);
            updatesFragment.A0S = C107695bk.A25(r2);
            updatesFragment.A0l = (C115155oD) r2.ABK.get();
            updatesFragment.A0m = r2.APc();
            updatesFragment.A0X = (AnonymousClass5YD) r3.ANq.get();
            updatesFragment.A0W = C64333Db.A66(r3);
            updatesFragment.A0a = (AnonymousClass5PU) r3.Aal.get();
            updatesFragment.A0Y = (C105325Um) r3.ANm.get();
            updatesFragment.A0V = (NewsletterLinkLauncher) r3.ANn.get();
            updatesFragment.A0M = C64333Db.A2r(r3);
            updatesFragment.A0N = C64333Db.A2s(r3);
            updatesFragment.A0k = (C105105Tp) r3.AWp.get();
            updatesFragment.A0e = r2.APZ();
            updatesFragment.A0G = (AnonymousClass5O5) r2.A2G.get();
            updatesFragment.A0o = new AnonymousClass4L4();
            updatesFragment.A06 = (C107895c5) r2.A0I.get();
            updatesFragment.A0n = C86604Kt.A0f(r3);
            updatesFragment.A08 = (AnonymousClass5FA) r2.A0a.get();
            updatesFragment.A0I = (C55262q4) r3.A5q.get();
            updatesFragment.A0T = (C53502nC) r2.A82.get();
            updatesFragment.A09 = (AnonymousClass5FB) r2.A0b.get();
            updatesFragment.A0Q = C64333Db.A5A(r3);
            updatesFragment.A0A = (AnonymousClass5FI) r2.ABp.get();
            updatesFragment.A0B = (AnonymousClass5FZ) r2.ABe.get();
            updatesFragment.A0f = r2.APa();
            updatesFragment.A0C = (C101505Fa) r2.ABD.get();
            updatesFragment.A0h = (C102195Hv) r2.AB8.get();
            updatesFragment.A03 = r4;
            updatesFragment.A0j = (C65173Gm) r3.ATW.get();
            updatesFragment.A01 = r4;
            updatesFragment.A0R = r5.A18.ACX();
            updatesFragment.A0u = C86634Kw.A0s(r3);
            updatesFragment.A0F = C86654Ky.A0U(r3);
            updatesFragment.A0t = (AnonymousClass5L2) r2.A32.get();
            updatesFragment.A0w = C72343dZ.A00(r2.ACM);
            updatesFragment.A0v = C72343dZ.A00(r3.ANr);
            updatesFragment.A0b = (C103295Mi) r2.ABB.get();
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
            r2.A1H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.Hilt_UpdatesFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1H();
    }
}
