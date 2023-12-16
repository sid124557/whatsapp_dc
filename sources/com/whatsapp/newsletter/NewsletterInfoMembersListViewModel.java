package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass08M;
import X.AnonymousClass0GH;
import X.AnonymousClass1VX;
import X.AnonymousClass47C;
import X.AnonymousClass4FS;
import X.AnonymousClass4GP;
import X.AnonymousClass5ZU;
import X.C05550Ty;
import X.C06270Wx;
import X.C102295Ih;
import X.C115005nx;
import X.C115015ny;
import X.C117665sI;
import X.C117835sZ;
import X.C119835xc;
import X.C119845xd;
import X.C15910sA;
import X.C162457s7;
import X.C17280vG;
import X.C18260x0;
import X.C18320x8;
import X.C29181iP;
import X.C371521d;
import X.C44072Uo;
import X.C50142hh;
import X.C56662sM;
import X.C56972sr;
import X.C64773Ex;
import X.C91534kK;
import X.C95804uY;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class NewsletterInfoMembersListViewModel extends C05550Ty implements C17280vG {
    public AnonymousClass47C A00;
    public final long A01;
    public final C06270Wx A02;
    public final C06270Wx A03;
    public final AnonymousClass08M A04 = AnonymousClass08M.A01();
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final C44072Uo A07;
    public final C56972sr A08;
    public final C64773Ex A09;
    public final C56662sM A0A;
    public final C95804uY A0B;
    public final C29181iP A0C;
    public final C91534kK A0D;
    public final C117835sZ A0E;
    public final C50142hh A0F;
    public final AnonymousClass4FS A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final void A0E(C371521d r4, boolean z) {
        C162457s7.A0J(r4, 0);
        this.A0G.BkP(new C117665sI(this, r4, 35, z));
    }

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        int A022 = C18320x8.A02(r4, 1);
        if (A022 == 2) {
            A0F(new C119835xc(this), false);
        } else if (A022 == 3) {
            A0F(new C119845xd(this), true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v51, types: [com.whatsapp.jid.PhoneUserJid] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C371521d r9, java.util.List<X.C53812ni> r10) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x0017
            X.2hh r1 = r8.A0F
            X.4uY r0 = r8.A0B
            java.util.List r10 = r1.A01(r9, r0)
            int r0 = r10.size()
            long r3 = (long) r0
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            X.3d3 r10 = X.C72023d3.A00
        L_0x0017:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x0099
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r10.iterator()
        L_0x0023:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r2 = r5.next()
            X.2ni r2 = (X.C53812ni) r2
            X.1fH r1 = r2.A03
            if (r1 == 0) goto L_0x0023
            X.2sM r0 = r8.A0A
            com.whatsapp.jid.PhoneUserJid r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x003c
            r1 = r0
        L_0x003c:
            X.3Ex r0 = r8.A09
            X.3ZH r3 = r0.A0A(r1)
            X.21q r2 = r2.A01
            X.4kK r0 = r8.A0D
            X.08M r0 = r0.A04
            java.lang.Object r0 = r0.A07()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x005d
            boolean r1 = r0.contains(r3)
        L_0x0054:
            X.5Ih r0 = new X.5Ih
            r0.<init>(r2, r3, r1)
            r4.add(r0)
            goto L_0x0023
        L_0x005d:
            r1 = 0
            goto L_0x0054
        L_0x005f:
            java.util.List r4 = X.AnonymousClass360.A01(r4)
            X.2sr r0 = r8.A08
            X.1RR r0 = X.C56972sr.A01(r0)
            if (r0 == 0) goto L_0x008d
            X.4uZ r1 = r0.A0H
            if (r1 == 0) goto L_0x008d
            X.3Ex r0 = r8.A09
            X.3ZH r3 = r0.A0A(r1)
            X.4kK r0 = r8.A0D
            X.1RL r0 = r0.A00
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "newsletterInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0082:
            X.21q r2 = r0.A07
            r1 = 0
            X.5Ih r0 = new X.5Ih
            r0.<init>(r2, r3, r1)
            r4.add(r0)
        L_0x008d:
            X.5sZ r0 = r8.A0E
            java.util.List r0 = X.C73723fy.A0L(r4, r0)
            java.util.List r2 = A00(r0)
            goto L_0x013c
        L_0x0099:
            java.util.HashSet r4 = X.AnonymousClass002.A0K()
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            X.2sr r6 = r8.A08
            X.1RR r0 = X.C56972sr.A01(r6)
            if (r0 == 0) goto L_0x00b5
            X.4uZ r1 = r0.A0H
            if (r1 == 0) goto L_0x00b5
            X.3Ex r0 = r8.A09
            X.C86614Ku.A1P(r0, r1, r4)
            r3.add(r1)
        L_0x00b5:
            java.util.LinkedHashSet r2 = X.AnonymousClass0x9.A17()
            java.util.Iterator r1 = r10.iterator()
        L_0x00bd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r1.next()
            X.2ni r0 = (X.C53812ni) r0
            X.1fH r0 = r0.A03
            if (r0 == 0) goto L_0x00bd
            r2.add(r0)
            goto L_0x00bd
        L_0x00d1:
            X.3Ex r0 = r8.A09
            java.util.Map r5 = r0.A0J(r2)
            java.util.Iterator r7 = r10.iterator()
        L_0x00db:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r1 = r7.next()
            X.2ni r1 = (X.C53812ni) r1
            X.1fH r0 = r1.A03
            java.lang.Object r2 = r5.get(r0)
            X.3ZH r2 = (X.AnonymousClass3ZH) r2
            if (r2 == 0) goto L_0x00db
            r4.add(r2)
            boolean r0 = X.C56972sr.A08(r6, r2)
            if (r0 != 0) goto L_0x00db
            X.21q r1 = r1.A01
            X.21q r0 = X.C372821q.ADMIN
            if (r1 == r0) goto L_0x0104
            X.21q r0 = X.C372821q.OWNER
            if (r1 != r0) goto L_0x00db
        L_0x0104:
            X.4uZ r1 = r2.A0H
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C162457s7.A0K(r1, r0)
            r3.add(r1)
            goto L_0x00db
        L_0x010f:
            X.2Uo r1 = r8.A07
            r0 = -1
            X.5NU r0 = r1.A00(r0)
            java.util.List r0 = r0.A00(r4, r3)
            java.util.ArrayList r5 = X.C73783g4.A0c(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0122:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0138
            X.3ZH r3 = X.C18310x6.A0R(r4)
            X.21q r2 = X.C372821q.SUBSCRIBED
            r1 = 0
            X.5Ih r0 = new X.5Ih
            r0.<init>(r2, r3, r1)
            r5.add(r0)
            goto L_0x0122
        L_0x0138:
            java.util.List r2 = A00(r5)
        L_0x013c:
            r6 = r2
            X.21d r0 = X.C371521d.SHORT
            if (r9 != r0) goto L_0x017f
            X.08M r0 = r8.A05
            r0.A0G(r2)
            int r1 = r2.size()
            r0 = 11
            if (r1 < r0) goto L_0x017a
            r1 = 0
            r0 = 10
            java.util.List r0 = r2.subList(r1, r0)
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r0)
            r2.size()
            X.5nw r0 = new X.5nw
            r0.<init>()
            r6.add(r0)
        L_0x0164:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0174
            java.lang.String r1 = ""
            X.5ny r0 = new X.5ny
            r0.<init>(r1)
            r6.add(r0)
        L_0x0174:
            X.08M r5 = r8.A06
        L_0x0176:
            r5.A0G(r6)
            return
        L_0x017a:
            java.util.ArrayList r6 = X.AnonymousClass002.A0J(r2)
            goto L_0x0164
        L_0x017f:
            X.08M r1 = r8.A06
            java.lang.Object r0 = r1.A07()
            X.08M r5 = r8.A05
            if (r0 == 0) goto L_0x0176
            java.util.Collection r0 = X.C86664Kz.A1P(r1)
            if (r0 == 0) goto L_0x01d6
            java.util.List r0 = X.C73723fy.A0K(r2, r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x019b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C115005nx
            if (r0 == 0) goto L_0x019b
            r4.add(r1)
            goto L_0x019b
        L_0x01ad:
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r4.iterator()
        L_0x01b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5nx r0 = (X.C115005nx) r0
            X.5Ih r0 = r0.A00
            X.3ZH r0 = r0.A00
            X.4uZ r0 = r0.A0H
            boolean r0 = r3.add(r0)
            if (r0 == 0) goto L_0x01b9
            r6.add(r1)
            goto L_0x01b9
        L_0x01d6:
            r6 = 0
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoMembersListViewModel.A0D(X.21d, java.util.List):void");
    }

    public final void A0F(AnonymousClass4GP r4, boolean z) {
        Iterable A052 = this.A0C.A05();
        boolean z2 = false;
        if (!(A052 instanceof Collection) || !((Collection) A052).isEmpty()) {
            Iterator it = A052.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C162457s7.A0P(it.next(), this)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2 == z) {
            r4.invoke();
        }
    }

    public NewsletterInfoMembersListViewModel(C44072Uo r2, C56972sr r3, C64773Ex r4, AnonymousClass5ZU r5, C56662sM r6, AnonymousClass1VX r7, C95804uY r8, C29181iP r9, C91534kK r10, C50142hh r11, AnonymousClass4FS r12, long j) {
        C18260x0.A0f(r7, r5, r3, r12, r4);
        C18260x0.A0W(r6, r2, r11);
        C162457s7.A0J(r9, 9);
        this.A08 = r3;
        this.A0G = r12;
        this.A09 = r4;
        this.A0A = r6;
        this.A07 = r2;
        this.A0F = r11;
        this.A0C = r9;
        this.A0B = r8;
        this.A01 = j;
        this.A0D = r10;
        this.A0H = r7.A0X(6096);
        this.A0I = r7.A0X(6535);
        this.A0E = new C117835sZ(r3, r5);
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A06 = A012;
        this.A03 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A05 = A013;
        this.A02 = A013;
    }

    public static final List A00(List list) {
        ArrayList A0p = AnonymousClass000.A0p(list);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(new C115005nx((C102295Ih) it.next()));
        }
        A0p.addAll(A0s);
        if (A0p.isEmpty()) {
            A0p.add(new C115015ny(""));
        }
        return A0p;
    }
}
