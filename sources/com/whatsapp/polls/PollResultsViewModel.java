package com.whatsapp.polls;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass2z0;
import X.AnonymousClass3N0;
import X.AnonymousClass4FW;
import X.AnonymousClass4UC;
import X.AnonymousClass5ZU;
import X.C05550Ty;
import X.C18260x0;
import X.C29431io;
import X.C30451mT;
import X.C50062hZ;
import X.C54292oU;
import X.C55832qz;
import X.C56892sj;
import X.C64773Ex;
import X.C70123Zz;
import X.C86164Jb;
import java.util.List;
import java.util.Map;

public class PollResultsViewModel extends C05550Ty {
    public int A00 = 0;
    public long A01 = -1;
    public C30451mT A02;
    public List A03 = AnonymousClass001.A0s();
    public List A04;
    public final C50062hZ A05;
    public final AnonymousClass3N0 A06;
    public final C64773Ex A07;
    public final AnonymousClass5ZU A08;
    public final C54292oU A09;
    public final C56892sj A0A;
    public final AnonymousClass4FW A0B = new C86164Jb(this, 8);
    public final C29431io A0C;
    public final C55832qz A0D;
    public final AnonymousClass4UC A0E = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0F = AnonymousClass0x9.A0b();
    public final Map A0G = AnonymousClass001.A0t();

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        if (r13 <= 0) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r19 = this;
            r4 = r19
            X.1mT r11 = r4.A02
            if (r11 == 0) goto L_0x013b
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r4.A03 = r0
            java.util.List r0 = r4.A04
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            if (r0 != 0) goto L_0x0024
            java.util.List r0 = r11.A05
            java.util.Iterator r1 = r0.iterator()
        L_0x001a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004e
            X.C18310x6.A1R(r5, r1)
            goto L_0x001a
        L_0x0024:
            java.util.Iterator r10 = r0.iterator()
        L_0x0028:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0058
            X.2y4 r9 = X.AnonymousClass0x9.A0Z(r10)
            java.util.List r0 = r11.A05
            java.util.Iterator r8 = r0.iterator()
        L_0x0038:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0028
            X.2y4 r3 = X.AnonymousClass0x9.A0Z(r8)
            long r6 = r3.A01
            long r1 = r9.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            r5.add(r3)
            goto L_0x0028
        L_0x004e:
            r1 = 8
            X.4IS r0 = new X.4IS
            r0.<init>((java.lang.Object) r4, (int) r1)
            java.util.Collections.sort(r5, r0)
        L_0x0058:
            r4.A04 = r5
            X.1mT r0 = r4.A02
            if (r0 == 0) goto L_0x00b6
            X.2z0 r0 = r0.A1J
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x00b6
            boolean r7 = X.C627336j.A0K(r1)
            if (r7 == 0) goto L_0x00a1
            X.2sj r0 = r4.A0A
            X.1fL r1 = (X.C28011fL) r1
            X.33h r0 = r0.A09
            int r6 = r0.A03(r1)
            X.1mT r0 = r4.A02
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x00a2
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.util.Iterator r2 = r0.iterator()
        L_0x0082:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r1 = r2.next()
            X.1mH r1 = (X.C30331mH) r1
            r0 = r1
            X.1mh r0 = (X.C30591mh) r0
            java.util.List r0 = r0.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0082
            X.4uZ r0 = r1.A0n()
            r3.add(r0)
            goto L_0x0082
        L_0x00a1:
            r6 = 0
        L_0x00a2:
            r3 = 0
            goto L_0x00a8
        L_0x00a4:
            int r3 = r3.size()
        L_0x00a8:
            java.util.List r2 = r4.A03
            X.1mT r0 = r4.A02
            java.lang.String r1 = r0.A03
            X.8J8 r0 = new X.8J8
            r0.<init>(r6, r3, r1, r7)
            r2.add(r0)
        L_0x00b6:
            X.1mT r0 = r4.A02
            java.util.List r0 = r0.A05
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x00bf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00cf
            X.2y4 r0 = X.AnonymousClass0x9.A0Z(r2)
            int r0 = r0.A00
            if (r0 <= r1) goto L_0x00bf
            r1 = r0
            goto L_0x00bf
        L_0x00cf:
            long r0 = (long) r1
            java.util.Iterator r10 = r5.iterator()
        L_0x00d4:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0134
            X.2y4 r5 = X.AnonymousClass0x9.A0Z(r10)
            java.util.List r8 = r4.A03
            long r15 = r5.A01
            java.lang.String r12 = r5.A03
            int r13 = r5.A00
            int r14 = r4.A00
            long r2 = (long) r13
            r7 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00f2
            r17 = 1
            if (r13 > 0) goto L_0x00f4
        L_0x00f2:
            r17 = 0
        L_0x00f4:
            X.8JA r11 = new X.8JA
            r18 = r7
            r11.<init>(r12, r13, r14, r15, r17, r18)
            r8.add(r11)
            java.util.Map r6 = r4.A0G
            long r2 = r5.A01
            java.lang.Object r9 = X.C18280x3.A0W(r6, r2)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x00d4
            java.util.Iterator r6 = r9.iterator()
        L_0x010e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r3 = r6.next()
            r2 = 5
            if (r7 < r2) goto L_0x012c
            java.util.List r8 = r4.A03
            long r5 = r5.A01
            int r3 = X.AnonymousClass002.A04(r9, r7)
            X.8J7 r2 = new X.8J7
            r2.<init>(r5, r3)
            r8.add(r2)
            goto L_0x00d4
        L_0x012c:
            java.util.List r2 = r4.A03
            r2.add(r3)
            int r7 = r7 + 1
            goto L_0x010e
        L_0x0134:
            X.4UC r1 = r4.A0F
            java.util.List r0 = r4.A03
            r1.A0H(r0)
        L_0x013b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.polls.PollResultsViewModel.A0D():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r11 <= 0) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(long r18) {
        /*
            r17 = this;
            r5 = r17
            X.1mT r1 = r5.A02
            if (r1 == 0) goto L_0x007e
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r5.A03 = r0
            java.util.List r0 = r1.A05
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0023
            X.2y4 r0 = X.AnonymousClass0x9.A0Z(r2)
            int r0 = r0.A00
            if (r0 <= r1) goto L_0x0013
            r1 = r0
            goto L_0x0013
        L_0x0023:
            long r2 = (long) r1
            X.1mT r0 = r5.A02
            java.util.List r0 = r0.A05
            java.util.Iterator r8 = r0.iterator()
        L_0x002c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0077
            X.2y4 r4 = X.AnonymousClass0x9.A0Z(r8)
            long r13 = r4.A01
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            java.util.List r6 = r5.A03
            java.lang.String r10 = r4.A03
            int r11 = r4.A00
            int r12 = r5.A00
            long r0 = (long) r11
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x004c
            r15 = 1
            if (r11 > 0) goto L_0x004d
        L_0x004c:
            r15 = 0
        L_0x004d:
            r16 = 1
            X.8JA r9 = new X.8JA
            r9.<init>(r10, r11, r12, r13, r15, r16)
            r6.add(r9)
            java.util.Map r6 = r5.A0G
            long r0 = r4.A01
            java.lang.Object r0 = X.C18280x3.A0W(r6, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x007e
            java.util.Iterator r4 = r0.iterator()
        L_0x0067:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r4.next()
            java.util.List r0 = r5.A03
            r0.add(r1)
            goto L_0x0067
        L_0x0077:
            X.4UC r1 = r5.A0F
            java.util.List r0 = r5.A03
            r1.A0H(r0)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.polls.PollResultsViewModel.A0E(long):void");
    }

    public void A0F(C30451mT r5) {
        C70123Zz r3 = new C70123Zz(this, 40, r5);
        boolean A002 = AnonymousClass3N0.A00(r5, (byte) 67);
        StringBuilder A0o = AnonymousClass001.A0o();
        if (!A002) {
            C18260x0.A1J(A0o, AnonymousClass2z0.A07(r5, "PollResultsViewModel/poll message doesn't need loading poll id=", A0o));
            r3.run();
            return;
        }
        C18260x0.A1J(A0o, AnonymousClass2z0.A07(r5, "PollResultsViewModel/poll message need loading poll id=", A0o));
        this.A05.A00(r5, r3, (byte) 67);
    }

    public PollResultsViewModel(C50062hZ r3, AnonymousClass3N0 r4, C64773Ex r5, AnonymousClass5ZU r6, C54292oU r7, C56892sj r8, C29431io r9, C55832qz r10) {
        this.A07 = r5;
        this.A08 = r6;
        this.A0D = r10;
        this.A0C = r9;
        this.A06 = r4;
        this.A05 = r3;
        this.A0A = r8;
        this.A09 = r7;
    }
}
