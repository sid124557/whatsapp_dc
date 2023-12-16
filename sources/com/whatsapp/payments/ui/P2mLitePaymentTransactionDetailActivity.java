package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass303;
import X.AnonymousClass36F;
import X.AnonymousClass4FS;
import X.AnonymousClass5RJ;
import X.AnonymousClass8EA;
import X.AnonymousClass94y;
import X.AnonymousClass9DV;
import X.AnonymousClass9TZ;
import X.AnonymousClass9Tp;
import X.AnonymousClass9U4;
import X.AnonymousClass9V7;
import X.AnonymousClass9b0;
import X.C158777kX;
import X.C162457s7;
import X.C171658Hx;
import X.C18270x1;
import X.C18290x4;
import X.C1906899l;
import X.C1907099n;
import X.C194909Va;
import X.C194969Vi;
import X.C195219Wq;
import X.C203499no;
import X.C203719oC;
import X.C54292oU;
import X.C56612sH;
import X.C56962sq;
import X.C56972sr;
import X.C617332a;
import X.C620433g;
import X.C620633i;
import X.C620733j;
import X.C620933l;
import X.C624034w;
import X.C626936e;
import X.C64773Ex;
import X.C66543Lv;
import X.C69263Wi;
import X.C86614Ku;
import X.C97254xx;
import android.os.Bundle;
import android.view.MenuItem;

public final class P2mLitePaymentTransactionDetailActivity extends AnonymousClass9DV {
    public C54292oU A00;
    public C171658Hx A01;
    public AnonymousClass5RJ A02;

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        if (C86614Ku.A0D(this) != null) {
            bundle.putAll(C86614Ku.A0D(this));
        }
        super.onSaveInstanceState(bundle);
    }

    public C203719oC A75() {
        C203719oC A0H = this.A0M.A0H("P2M_LITE");
        C626936e.A06(A0H);
        C162457s7.A0D(A0H);
        return A0H;
    }

    public AnonymousClass94y A76(Bundle bundle) {
        Bundle bundle2 = bundle;
        AnonymousClass5RJ r0 = this.A02;
        if (r0 != null) {
            if (bundle == null) {
                bundle2 = C86614Ku.A0D(this);
            }
            C56612sH r48 = r0.A06;
            C69263Wi r47 = r0.A00;
            C56972sr r46 = r0.A01;
            C54292oU r28 = r0.A07;
            AnonymousClass4FS r27 = r0.A0V;
            AnonymousClass8EA r24 = r0.A0D;
            C195219Wq r23 = r0.A0U;
            C64773Ex r21 = r0.A04;
            C620633i r22 = r0.A05;
            C620733j r25 = r0.A08;
            AnonymousClass9U4 r19 = r0.A0L;
            C56962sq r20 = r0.A03;
            C66543Lv r26 = r0.A09;
            AnonymousClass9Tp r18 = r0.A0R;
            C620933l r17 = r0.A0I;
            AnonymousClass9V7 r15 = r0.A0T;
            C1906899l r13 = r0.A0H;
            C194909Va r12 = r0.A0A;
            C1907099n r11 = r0.A0K;
            C617332a r10 = r0.A0C;
            C158777kX r9 = r0.A0S;
            C620433g r8 = r0.A02;
            AnonymousClass9TZ r7 = r0.A0N;
            C203499no r6 = r0.A0P;
            C194969Vi r5 = r0.A0Q;
            AnonymousClass36F r4 = r0.A0B;
            AnonymousClass9b0 r3 = r0.A0M;
            C195219Wq r44 = r23;
            AnonymousClass4FS r45 = r27;
            C69263Wi r172 = r47;
            C56972sr r182 = r46;
            C620433g r192 = r8;
            C56612sH r232 = r48;
            C54292oU r242 = r28;
            C194909Va r272 = r12;
            AnonymousClass36F r282 = r4;
            C97254xx r152 = new C97254xx(bundle2, r172, r182, r192, r20, r21, r22, r232, r242, r25, r26, r272, r282, r10, r24, r0.A0G, r13, r17, r0.A0J, r11, r19, r3, r7, r6, r5, r18, r9, r15, r44, r45);
            this.A0P = r152;
            return r152;
        }
        throw C18270x1.A0S("viewModelCreationDelegate");
    }

    public void A77(C624034w r3, AnonymousClass303 r4) {
        r4.A03("transaction_status_name", this.A0B.A0C(this.A0S.A0B(r3)));
    }

    public boolean A7A() {
        return this.A0L.A01();
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0f = AnonymousClass001.A0f();
        A79(A0f, A0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (X.AnonymousClass9V7.A00(r0) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            X.94y r0 = r11.A0P
            X.9Pj r0 = r0.A06
            r8 = 0
            if (r0 == 0) goto L_0x004d
            X.1n7 r1 = r0.A03
            X.34w r0 = r0.A01
        L_0x000e:
            X.8Hx r2 = r11.A01
            if (r2 == 0) goto L_0x0050
            r9 = 0
            r3 = 0
            java.lang.String r5 = "payment_transaction_details"
            java.lang.String r6 = r11.A0b
            if (r0 == 0) goto L_0x0021
            boolean r0 = X.AnonymousClass9V7.A00(r0)
            r10 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r10 = 0
        L_0x0022:
            if (r1 == 0) goto L_0x004b
            X.39W r0 = r1.A00
            if (r0 == 0) goto L_0x004b
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x004b
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0034:
            java.lang.String r7 = X.C57062t0.A01(r0)
            if (r1 == 0) goto L_0x0046
            X.39W r0 = r1.A00
            if (r0 == 0) goto L_0x0046
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0046
            java.lang.String r8 = r0.A04()
        L_0x0046:
            r4 = r3
            r2.A01(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x004b:
            r0 = r8
            goto L_0x0034
        L_0x004d:
            r1 = r8
            r0 = r8
            goto L_0x000e
        L_0x0050:
            java.lang.String r0 = "paymentFieldStatsLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.P2mLitePaymentTransactionDetailActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            Integer A0f = AnonymousClass001.A0f();
            A79(A0f, A0f);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
