package com.whatsapp.status.playback.fragment;

import X.AnonymousClass29z;
import X.AnonymousClass2W5;
import X.AnonymousClass30E;
import X.AnonymousClass5PU;
import X.AnonymousClass5U7;
import X.AnonymousClass5YA;
import X.C103035Lf;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C29121iJ;
import X.C29161iN;
import X.C50222hp;
import X.C50252hs;
import X.C54602oz;
import X.C55152pt;
import X.C64333Db;
import X.C66663Mh;
import X.C72343dZ;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

public abstract class Hilt_StatusPlaybackContactFragment extends StatusPlaybackBaseFragment {
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
            StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
            C88854au r3 = (C88854au) C18320x8.A0E(this);
            C64333Db r2 = r3.A1B;
            C107695bk r4 = r2.A00;
            C107695bk.AFP(r4, statusPlaybackContactFragment);
            statusPlaybackContactFragment.A00 = C64333Db.A04(r2);
            statusPlaybackContactFragment.A01 = C64333Db.A2o(r2);
            statusPlaybackContactFragment.A02 = C64333Db.A2t(r2);
            statusPlaybackContactFragment.A03 = C64333Db.A4B(r2);
            statusPlaybackContactFragment.A05 = (AnonymousClass5U7) r4.ABG.get();
            statusPlaybackContactFragment.A0I = C64333Db.A2p(r2);
            statusPlaybackContactFragment.A03 = C64333Db.A06(r2);
            statusPlaybackContactFragment.A04 = C86644Kx.A0L(r2);
            statusPlaybackContactFragment.A0f = C64333Db.A8y(r2);
            statusPlaybackContactFragment.A0O = C64333Db.A4H(r2);
            statusPlaybackContactFragment.A05 = (C66663Mh) r2.AUd.get();
            statusPlaybackContactFragment.A0N = C86634Kw.A0h(r2);
            statusPlaybackContactFragment.A07 = C64333Db.A08(r2);
            statusPlaybackContactFragment.A09 = C86644Kx.A0Q(r2);
            statusPlaybackContactFragment.A02 = C64333Db.A05(r2);
            statusPlaybackContactFragment.A0G = C64333Db.A29(r2);
            statusPlaybackContactFragment.A0a = (C50252hs) r2.AWf.get();
            statusPlaybackContactFragment.A0k = C86634Kw.A0s(r2);
            statusPlaybackContactFragment.A0C = C64333Db.A26(r2);
            statusPlaybackContactFragment.A0E = C64333Db.A28(r2);
            statusPlaybackContactFragment.A0B = C86654Ky.A0V(r2);
            statusPlaybackContactFragment.A0g = (AnonymousClass30E) r4.A35.get();
            statusPlaybackContactFragment.A0S = C86634Kw.A0n(r2);
            statusPlaybackContactFragment.A0D = C86614Ku.A0S(r2);
            statusPlaybackContactFragment.A0J = C86614Ku.A0Z(r2);
            statusPlaybackContactFragment.A0e = C64333Db.A8F(r2);
            statusPlaybackContactFragment.A0K = C64333Db.A3K(r2);
            statusPlaybackContactFragment.A0W = C86634Kw.A0p(r2);
            statusPlaybackContactFragment.A0H = C86644Kx.A0T(r2);
            statusPlaybackContactFragment.A0A = C86624Kv.A0N(r2);
            statusPlaybackContactFragment.A0L = (C55152pt) r2.AWi.get();
            statusPlaybackContactFragment.A0Y = (AnonymousClass5PU) r2.Aal.get();
            statusPlaybackContactFragment.A0b = C86634Kw.A0q(r2);
            statusPlaybackContactFragment.A0T = (NewsletterLinkLauncher) r2.ANn.get();
            statusPlaybackContactFragment.A0M = (AnonymousClass2W5) r2.AWo.get();
            statusPlaybackContactFragment.A0h = (C29121iJ) r2.A7D.get();
            statusPlaybackContactFragment.A08 = C86654Ky.A0U(r2);
            statusPlaybackContactFragment.A0i = (AnonymousClass5YA) r4.ACM.get();
            statusPlaybackContactFragment.A0Z = C107695bk.A5D(r4);
            statusPlaybackContactFragment.A0d = (C103035Lf) r3.A18.A4H.get();
            statusPlaybackContactFragment.A0Q = C86624Kv.A0T(r2);
            statusPlaybackContactFragment.A0j = (C29161iN) r2.Abk.get();
            statusPlaybackContactFragment.A0l = C72343dZ.A00(r2.AWZ);
            statusPlaybackContactFragment.A0m = C72343dZ.A00(r2.Ac2);
            statusPlaybackContactFragment.A0P = (C54602oz) r2.ABK.get();
            statusPlaybackContactFragment.A0V = (C50222hp) r2.AIA.get();
            statusPlaybackContactFragment.A06 = C86614Ku.A0N(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.Hilt_StatusPlaybackContactFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A01();
        A1H();
    }
}
