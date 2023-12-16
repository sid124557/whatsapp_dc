package com.whatsapp.calling.callhistory.view;

import X.AnonymousClass29z;
import X.AnonymousClass3DP;
import X.AnonymousClass3XG;
import X.AnonymousClass4WD;
import X.AnonymousClass5TW;
import X.AnonymousClass7C7;
import X.AnonymousClass7C9;
import X.AnonymousClass7CA;
import X.AnonymousClass7CB;
import X.AnonymousClass7CC;
import X.AnonymousClass7CD;
import X.AnonymousClass7CE;
import X.AnonymousClass7CF;
import X.AnonymousClass7CG;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18320x8;
import X.C48852fa;
import X.C50382i5;
import X.C55422qK;
import X.C56322rn;
import X.C56572sD;
import X.C56592sF;
import X.C56762sW;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C88744aj;
import X.C88854au;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_CallsHistoryFragmentV2 extends WaFragment {
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
            CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this;
            C88854au r4 = (C88854au) C18320x8.A0E(this);
            C64333Db r2 = r4.A1B;
            C107695bk r3 = r2.A00;
            C107695bk.AFP(r3, callsHistoryFragmentV2);
            callsHistoryFragmentV2.A0S = C64333Db.A2p(r2);
            callsHistoryFragmentV2.A0Y = C64333Db.A4B(r2);
            callsHistoryFragmentV2.A0D = (C50382i5) r2.AZG.get();
            callsHistoryFragmentV2.A0A = C64333Db.A04(r2);
            callsHistoryFragmentV2.A0e = C18280x3.A0Q(r3);
            callsHistoryFragmentV2.A0B = C64333Db.A06(r2);
            callsHistoryFragmentV2.A0m = C64333Db.A8y(r2);
            C88744aj r5 = C88744aj.A00;
            callsHistoryFragmentV2.A08 = r5;
            callsHistoryFragmentV2.A0c = (C56572sD) r2.AWF.get();
            callsHistoryFragmentV2.A0C = (C48852fa) r3.ABc.get();
            callsHistoryFragmentV2.A0H = C86644Kx.A0Q(r2);
            callsHistoryFragmentV2.A09 = C64333Db.A00(r2);
            callsHistoryFragmentV2.A0P = C64333Db.A29(r2);
            callsHistoryFragmentV2.A07 = r5;
            callsHistoryFragmentV2.A0b = (C56592sF) r2.AWR.get();
            callsHistoryFragmentV2.A0f = C86614Ku.A0o(r2);
            callsHistoryFragmentV2.A06 = C86634Kw.A0S(r2);
            callsHistoryFragmentV2.A0J = (AnonymousClass5TW) r2.ASQ.get();
            callsHistoryFragmentV2.A0M = C64333Db.A26(r2);
            callsHistoryFragmentV2.A0Q = r3.AKk();
            callsHistoryFragmentV2.A0R = C64333Db.A2o(r2);
            callsHistoryFragmentV2.A0T = C64333Db.A2t(r2);
            callsHistoryFragmentV2.A0Z = C64333Db.A5A(r2);
            callsHistoryFragmentV2.A0U = (C56762sW) r2.A4R.get();
            callsHistoryFragmentV2.A0E = (AnonymousClass3DP) r2.Aak.get();
            callsHistoryFragmentV2.A0a = C107695bk.A25(r3);
            callsHistoryFragmentV2.A0F = new AnonymousClass4WD((AnonymousClass7C7) r4.A0N.get(), (AnonymousClass7C9) r4.A0P.get(), (AnonymousClass7CA) r4.A0Q.get(), (AnonymousClass7CB) r4.A0R.get(), (AnonymousClass7CC) r4.A0S.get(), (AnonymousClass7CD) r4.A0T.get(), (AnonymousClass7CE) r4.A0U.get(), (AnonymousClass7CF) r4.A0V.get(), (AnonymousClass7CG) r4.A0W.get(), C86604Kt.A0Y(r2));
            callsHistoryFragmentV2.A0L = C86614Ku.A0P(r2);
            callsHistoryFragmentV2.A0X = (C55422qK) r2.AUG.get();
            callsHistoryFragmentV2.A0W = (C56322rn) r2.AIT.get();
            callsHistoryFragmentV2.A0I = (AnonymousClass3XG) r2.A4M.get();
            callsHistoryFragmentV2.A0d = C86604Kt.A0f(r2);
            callsHistoryFragmentV2.A0o = C72343dZ.A00(r3.AAR);
            callsHistoryFragmentV2.A0n = C72343dZ.A00(r2.A82);
            callsHistoryFragmentV2.A0V = C64333Db.A3G(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.view.Hilt_CallsHistoryFragmentV2.A1F(android.app.Activity):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        A00();
        A1H();
    }
}
