package com.whatsapp.businessproductlist.view.adapter;

import X.AnonymousClass0GH;
import X.AnonymousClass5A3;
import X.AnonymousClass6J5;
import X.AnonymousClass7KJ;
import X.C05570Ua;
import X.C104975Tb;
import X.C132426fH;
import X.C146957Cg;
import X.C152967aS;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C181828nP;
import X.C181878nU;
import X.C18290x4;
import X.C18320x8;
import X.C184108rG;
import X.C56972sr;
import X.C620733j;
import X.C86614Ku;
import X.C90254gy;
import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;

public final class BusinessProductListAdapter extends C90254gy implements C181828nP, C17280vG {
    public final C15910sA A00;
    public final C104975Tb A01;
    public final C181878nU A02;
    public final C184108rG A03;

    public AnonymousClass6J5 A0L(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        C162457s7.A0J(viewGroup, 0);
        if (i != 5) {
            return super.A0L(viewGroup, i);
        }
        Context A0B = C86614Ku.A0B(viewGroup);
        UserJid userJid = this.A07;
        C162457s7.A0C(userJid);
        C56972sr r3 = this.A03;
        C162457s7.A0C(r3);
        C620733j r11 = this.A04;
        C162457s7.A0C(r11);
        C152967aS r5 = this.A05;
        C162457s7.A0C(r5);
        C184108rG r10 = this.A03;
        return AnonymousClass5A3.A00(A0B, viewGroup2, r3, new C146957Cg(897460087), r5, this, this, this.A01, this.A02, r10, r11, userJid);
    }

    public void BcK(AnonymousClass0GH r3, C15910sA r4) {
        if (C18320x8.A02(r3, 1) == 5) {
            this.A00.getLifecycle().A01(this);
            this.A05.A00();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BusinessProductListAdapter(X.C15910sA r15, X.C111095hX r16, X.C69263Wi r17, X.C56972sr r18, X.AnonymousClass5Y9 r19, X.C152967aS r20, X.C104975Tb r21, X.C181878nU r22, X.C184108rG r23, X.C64773Ex r24, X.C56422rx r25, X.AnonymousClass5ZU r26, X.C620733j r27, X.AnonymousClass1VX r28, com.whatsapp.jid.UserJid r29) {
        /*
            r14 = this;
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            X.C18260x0.A0e(r4, r5, r3, r6)
            r8 = r24
            r10 = r26
            r11 = r27
            X.C18260x0.A0W(r8, r10, r11)
            r0 = 9
            r9 = r25
            X.C162457s7.A0J(r9, r0)
            r0 = 11
            r12 = r28
            X.C162457s7.A0J(r12, r0)
            r0 = 14
            r1 = r23
            X.C162457s7.A0J(r1, r0)
            r2 = r14
            r13 = r29
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r21
            r14.A01 = r0
            r14.A00 = r15
            r14.A03 = r1
            r0 = r22
            r14.A02 = r0
            java.util.List r1 = r14.A00
            X.6fE r0 = new X.6fE
            r0.<init>()
            r1.add(r0)
            int r0 = X.AnonymousClass002.A03(r1)
            r14.A07(r0)
            X.0O9 r0 = r15.getLifecycle()
            r0.A00(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter.<init>(X.0sA, X.5hX, X.3Wi, X.2sr, X.5Y9, X.7aS, X.5Tb, X.8nU, X.8rG, X.3Ex, X.2rx, X.5ZU, X.33j, X.1VX, com.whatsapp.jid.UserJid):void");
    }

    public AnonymousClass7KJ B5f(int i) {
        if (C18290x4.A0k(this.A00) instanceof C132426fH) {
            return new AnonymousClass7KJ((String) null, String.valueOf(i), (String) null);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return A0L(viewGroup, i);
    }
}
