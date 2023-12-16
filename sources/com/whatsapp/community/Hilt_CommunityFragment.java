package com.whatsapp.community;

import X.AnonymousClass29z;
import X.C103145Ls;
import X.C107695bk;
import X.C18270x1;
import X.C18320x8;
import X.C39592Co;
import X.C44092Uq;
import X.C64333Db;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86654Ky;
import X.C88834as;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_CommunityFragment extends WaFragment {
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
            CommunityFragment communityFragment = (CommunityFragment) this;
            C88854au r4 = (C88854au) C18320x8.A0E(this);
            C64333Db r3 = r4.A1B;
            C107695bk r1 = r3.A00;
            C107695bk.AFP(r1, communityFragment);
            communityFragment.A0F = C64333Db.A2p(r3);
            communityFragment.A0K = C64333Db.A4B(r3);
            communityFragment.A05 = C64333Db.A04(r3);
            communityFragment.A0O = C64333Db.A8y(r3);
            communityFragment.A01 = C64333Db.A00(r3);
            communityFragment.A0D = C64333Db.A29(r3);
            communityFragment.A0H = C64333Db.A2t(r3);
            communityFragment.A0C = C86614Ku.A0S(r3);
            communityFragment.A07 = C86624Kv.A0N(r3);
            communityFragment.A0M = C107695bk.A25(r1);
            communityFragment.A09 = C86654Ky.A0X(r3);
            communityFragment.A0G = C64333Db.A2s(r3);
            communityFragment.A08 = C64333Db.A1k(r3);
            communityFragment.A0J = C86614Ku.A0Y(r3);
            communityFragment.A06 = C86654Ky.A0S(r3);
            communityFragment.A0L = C86624Kv.A0T(r3);
            communityFragment.A0N = C86604Kt.A0f(r3);
            C88834as r12 = r4.A18;
            communityFragment.A02 = (C44092Uq) r12.A0Z.get();
            communityFragment.A03 = (C103145Ls) r12.A0a.get();
            communityFragment.A04 = (C39592Co) r4.A0d.get();
            communityFragment.A0I = C86634Kw.A0e(r3);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.Hilt_CommunityFragment.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1H();
    }
}
