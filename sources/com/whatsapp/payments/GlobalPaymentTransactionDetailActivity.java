package com.whatsapp.payments;

import X.AnonymousClass001;
import X.AnonymousClass36F;
import X.AnonymousClass4FS;
import X.AnonymousClass5PG;
import X.AnonymousClass8EA;
import X.AnonymousClass94y;
import X.AnonymousClass9DU;
import X.AnonymousClass9TZ;
import X.AnonymousClass9Tp;
import X.AnonymousClass9U4;
import X.AnonymousClass9V7;
import X.AnonymousClass9b0;
import X.C158777kX;
import X.C162457s7;
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
import X.C626936e;
import X.C64773Ex;
import X.C66543Lv;
import X.C69263Wi;
import X.C86614Ku;
import X.C97244xw;
import android.os.Bundle;
import android.view.MenuItem;

public final class GlobalPaymentTransactionDetailActivity extends AnonymousClass9DU {
    public AnonymousClass5PG A00;

    public void onSaveInstanceState(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        Bundle A0D = C86614Ku.A0D(this);
        if (A0D != null) {
            bundle.putAll(A0D);
        }
        super.onSaveInstanceState(bundle);
    }

    public C203719oC A75() {
        C203719oC A0H = this.A0M.A0H("GLOBAL_ORDER");
        C626936e.A06(A0H);
        C162457s7.A0D(A0H);
        return A0H;
    }

    public AnonymousClass94y A76(Bundle bundle) {
        Bundle bundle2 = bundle;
        AnonymousClass5PG r0 = this.A00;
        if (r0 != null) {
            if (bundle == null) {
                bundle2 = C86614Ku.A0D(this);
            }
            C56612sH r48 = r0.A06;
            C69263Wi r47 = r0.A00;
            C56972sr r46 = r0.A01;
            C54292oU r28 = r0.A07;
            AnonymousClass4FS r27 = r0.A0S;
            AnonymousClass8EA r24 = r0.A0D;
            C195219Wq r23 = r0.A0R;
            C64773Ex r21 = r0.A04;
            C620633i r22 = r0.A05;
            C620733j r25 = r0.A08;
            AnonymousClass9U4 r19 = r0.A0J;
            C56962sq r20 = r0.A03;
            C66543Lv r26 = r0.A09;
            AnonymousClass9Tp r18 = r0.A0O;
            C620933l r17 = r0.A0G;
            AnonymousClass9V7 r15 = r0.A0Q;
            C1906899l r13 = r0.A0F;
            C194909Va r12 = r0.A0A;
            C1907099n r11 = r0.A0I;
            C617332a r10 = r0.A0C;
            C158777kX r9 = r0.A0P;
            C620433g r8 = r0.A02;
            AnonymousClass9TZ r7 = r0.A0L;
            C203499no r6 = r0.A0M;
            C194969Vi r5 = r0.A0N;
            AnonymousClass36F r4 = r0.A0B;
            AnonymousClass9b0 r3 = r0.A0K;
            C195219Wq r44 = r23;
            AnonymousClass4FS r45 = r27;
            C69263Wi r172 = r47;
            C56972sr r182 = r46;
            C620433g r192 = r8;
            C56612sH r232 = r48;
            C54292oU r242 = r28;
            C194909Va r272 = r12;
            AnonymousClass36F r282 = r4;
            C97244xw r152 = new C97244xw(bundle2, r172, r182, r192, r20, r21, r22, r232, r242, r25, r26, r272, r282, r10, r24, r0.A0E, r13, r17, r0.A0H, r11, r19, r3, r7, r6, r5, r18, r9, r15, r44, r45);
            this.A0P = r152;
            return r152;
        }
        throw C18270x1.A0S("viewModelCreationDelegate");
    }

    public boolean A7A() {
        return true;
    }

    public void onBackPressed() {
        super.onBackPressed();
        Integer A0f = AnonymousClass001.A0f();
        A79(A0f, A0f);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            Integer A0f = AnonymousClass001.A0f();
            A79(A0f, A0f);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
