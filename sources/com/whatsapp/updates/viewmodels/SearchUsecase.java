package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08J;
import X.AnonymousClass08M;
import X.AnonymousClass1RL;
import X.AnonymousClass1VX;
import X.AnonymousClass4L0;
import X.AnonymousClass534;
import X.AnonymousClass5SL;
import X.AnonymousClass5YD;
import X.AnonymousClass66R;
import X.AnonymousClass6A5;
import X.AnonymousClass6C6;
import X.AnonymousClass8SE;
import X.C103485Nd;
import X.C105325Um;
import X.C120485yf;
import X.C1218262a;
import X.C136746nC;
import X.C136766nE;
import X.C136786nG;
import X.C154517dI;
import X.C162457s7;
import X.C175728Zm;
import X.C175738Zn;
import X.C18260x0;
import X.C184498rv;
import X.C372821q;
import X.C56842se;
import X.C64773Ex;
import X.C72023d3;
import X.C73783g4;
import X.C73853gB;
import X.C86644Kx;
import X.C95814uZ;
import X.C986452r;
import X.C997458a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SearchUsecase implements C184498rv {
    public C95814uZ A00;
    public C136746nC A01;
    public C103485Nd A02;
    public CharSequence A03;
    public final AnonymousClass08J A04;
    public final AnonymousClass08M A05;
    public final C64773Ex A06;
    public final AnonymousClass1VX A07;
    public final C56842se A08;
    public final AnonymousClass5YD A09;
    public final C105325Um A0A;
    public final AnonymousClass66R A0B = C154517dI.A01(new C120485yf(this));
    public final C73853gB A0C;

    public final void A03(AnonymousClass1RL r8) {
        C162457s7.A0J(r8, 0);
        AnonymousClass08M r5 = this.A05;
        Iterable<AnonymousClass534> iterable = (Iterable) r5.A07();
        if (iterable != null) {
            ArrayList A0c = C73783g4.A0c(iterable);
            for (AnonymousClass534 r2 : iterable) {
                if (C162457s7.A0P(r2.A02.A0I(), r8.A0I())) {
                    r2 = new AnonymousClass534(r8, r2.A00, false);
                }
                A0c.add(r2);
            }
            r5.A0G(A0c);
        }
    }

    public void BiS(String str, List list) {
        C162457s7.A0J(list, 0);
        AnonymousClass08M r5 = this.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (AnonymousClass000.A1Y(((AnonymousClass1RL) next).A07, C372821q.GUEST)) {
                A0s.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            AnonymousClass1RL r2 = (AnonymousClass1RL) it.next();
            A0c.add(new AnonymousClass534(r2, this.A06.A0A(r2.A0I()), false));
        }
        r5.A0G(A0c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C84814Du r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C118655tt
            if (r0 == 0) goto L_0x0065
            r6 = r9
            X.5tt r6 = (X.C118655tt) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0065
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 != r7) goto L_0x006b
            X.C57682u2.A01(r1)
        L_0x0020:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x0023:
            X.C57682u2.A01(r1)
            X.6nC r0 = r8.A01
            if (r0 == 0) goto L_0x002d
            r0.cancel()
        L_0x002d:
            X.5Nd r0 = r8.A02
            if (r0 == 0) goto L_0x0037
            java.lang.Object r1 = r0.A01
            monitor-enter(r1)
            r0.A00 = r7     // Catch:{ all -> 0x0070 }
            monitor-exit(r1)
        L_0x0037:
            java.lang.String r0 = r8.A01()
            X.5Nd r4 = new X.5Nd
            r4.<init>(r0)
            r8.A02 = r4
            X.4J5 r3 = new X.4J5
            r3.<init>(r4, r7)
            r0 = 0
            com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1 r1 = new com.whatsapp.updates.viewmodels.SearchUsecase$fetchRemoteNewsletterResults$2$1
            r1.<init>(r0)
            r0 = 10
            X.4J6 r2 = new X.4J6
            r2.<init>((X.AnonymousClass4GR) r1, (X.AnonymousClass4C8) r3, (int) r0)
            r1 = 3
            X.6AY r0 = new X.6AY
            r0.<init>(r8, r1)
            r6.L$0 = r4
            r6.label = r7
            java.lang.Object r0 = r2.Az8(r6, r0)
            if (r0 != r5) goto L_0x0020
            return r5
        L_0x0065:
            X.5tt r6 = new X.5tt
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0070:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.viewmodels.SearchUsecase.A00(X.4Du):java.lang.Object");
    }

    public final String A01() {
        String obj;
        CharSequence charSequence = this.A03;
        if (charSequence == null || (obj = charSequence.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final void A04(C997458a r4, boolean z) {
        List A0h;
        AnonymousClass08J r2 = this.A04;
        if (r2.A07() != null && (A0h = C86644Kx.A0h(this.A05)) != null) {
            r2.A0G(new AnonymousClass5SL(r4, A0h, z));
        }
    }

    public final boolean A05() {
        CharSequence charSequence = this.A03;
        if (charSequence == null || !(!C175738Zn.A0V(charSequence))) {
            return false;
        }
        return true;
    }

    public void BS5(AnonymousClass8SE r3) {
        C997458a r1;
        if (r3 instanceof C136766nE) {
            r1 = C997458a.ERROR_CONNECTION;
        } else if (r3 instanceof C136786nG) {
            r1 = C997458a.ERROR_SERVER;
        } else {
            r1 = C997458a.ERROR_UNKNOWN;
        }
        A04(r1, false);
    }

    public SearchUsecase(C64773Ex r7, AnonymousClass1VX r8, C56842se r9, AnonymousClass5YD r10, C105325Um r11, C73853gB r12) {
        C18260x0.A0f(r8, r10, r7, r9, r11);
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A08 = r9;
        this.A0A = r11;
        this.A0C = r12;
        C997458a r5 = C997458a.DONE;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A05 = A012;
        AnonymousClass08J A0E = AnonymousClass4L0.A0E();
        this.A04 = A0E;
        C72023d3 r2 = C72023d3.A00;
        A012.A0H(r2);
        A0E.A0H(new AnonymousClass5SL(r5, r2, false));
        AnonymousClass6C6.A03(A012, A0E, new C1218262a(this), 363);
    }

    public final List A02(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            String A0J = ((C986452r) next).A00.A0J();
            if (A0J != null && C175728Zm.A0S(A0J, A01(), true)) {
                A0s.add(next);
            }
        }
        return AnonymousClass6A5.A00(A0s, this, 10);
    }
}
