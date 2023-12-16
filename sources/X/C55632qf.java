package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.2qf  reason: invalid class name and case insensitive filesystem */
public final class C55632qf {
    public final C56972sr A00;
    public final C49712gy A01;
    public final C56612sH A02;
    public final C56922sm A03;
    public final C56982ss A04;
    public final AnonymousClass30G A05;
    public final C54762pF A06;
    public final C51532jy A07;
    public final C620333f A08;
    public final C56182rZ A09;
    public final C45402Zx A0A;
    public final C40822Hw A0B;
    public final C55832qz A0C;
    public final C33141sV A0D;
    public final Set A0E = AnonymousClass0x9.A17();

    public final boolean A03(C95804uY r19, C624134x r20) {
        long j;
        String str;
        C56982ss r1 = this.A04;
        C95804uY r2 = r19;
        C106855aH.A02(r1, r2);
        this.A03.A07(r2);
        AnonymousClass31A A0A2 = r1.A0A(r2, false);
        C624134x r10 = r20;
        if (A0A2 == null && this.A0E.add(r2)) {
            this.A01.A02(C384827s.A00(r2, new AnonymousClass3RC(this, r10)));
        }
        C18260x0.A1P(AnonymousClass001.A0o(), "NewsletterMessageManager/message received ", r10);
        AnonymousClass2z0 r5 = r10.A1J;
        C162457s7.A0C(r5);
        C55832qz r7 = this.A0C;
        C624134x A052 = r7.A05(r5);
        if (A052 == null && (A052 = this.A08.A07(r5)) == null) {
            if (AnonymousClass000.A1U(r10.A0A & 1048576, 1048576)) {
                if (r5.A02) {
                    r10.A1G(4);
                } else {
                    r10.A1G(0);
                }
            }
            if ((A0A2 instanceof AnonymousClass1RL) && ((AnonymousClass1RL) A0A2).A0K && this.A0E.add(r2)) {
                this.A01.A02(C384827s.A00(r2, new AnonymousClass3RC(this, (C624134x) null)));
            }
            boolean A053 = this.A09.A05(r10);
            this.A06.A02(r10);
            return A053;
        }
        boolean z = true;
        if (!(r10 instanceof C30441mS)) {
            C42602Ou A11 = A052.A11();
            C42602Ou A112 = r10.A11();
            if (A112 != null) {
                j = A112.A00;
            } else {
                j = r10.A0K;
            }
            if (A11 != null && A11.A00 > j) {
                z = false;
            } else if (!(r10 instanceof C30451mT)) {
                Log.d("NewsletterMessageManager/updating instead of dropping");
                r10.A1G(A052.A0D);
                r10.A1L = A052.A1L;
                if (AnonymousClass000.A1U(r10.A0A & AnonymousClass35S.A0F, AnonymousClass35S.A0F)) {
                    this.A0D.A0G(r10);
                }
                try {
                    z = r7.A07(r10, 33);
                    if (AnonymousClass000.A1U(r10.A0A & AnonymousClass35S.A0F, AnonymousClass35S.A0F)) {
                        this.A07.A02(r10);
                    }
                    this.A06.A02(r10);
                    if (z && !r10.A1o()) {
                        C45402Zx r52 = this.A0A;
                        C69253Wh.A01(r52.A02, new C70353aM(A052, r52, r10, 25));
                    }
                } catch (SQLiteException e) {
                    Log.e("NewsletterMessageManager/unable to update the message", e);
                    z = false;
                }
            }
        } else if (!(A052 instanceof C30441mS) || r10.A1M != A052.A1M) {
            if (AnonymousClass000.A1U(r10.A0A & 1048576, 1048576)) {
                r10.A1G(16);
            }
            C30441mS r0 = (C30441mS) r10;
            z = A04(r0, true);
            if (z && !r0.A1o()) {
                C45402Zx r53 = this.A0A;
                C69253Wh.A01(r53.A02, new C70353aM(A052, r53, r10, 25));
            }
        }
        AnonymousClass2SV A12 = A052.A12();
        AnonymousClass4FP r4 = A052.A0L;
        boolean A0d = C624134x.A0d(r10);
        if (A12 != null && (!((str = A12.A05) == null || str.length() == 0) || A0d)) {
            long A0H = this.A02.A0H();
            A02(r10, Long.valueOf(A12.A03), A12.A04, A12.A05, A0H, true, false);
            if (r4 != null && !AnonymousClass000.A1U(r10.A0A & 1048576, 1048576)) {
                r10.A1t(r4);
            }
        }
        this.A09.A04(r10);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r2.A09.A05(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C30441mS r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.30G r0 = r2.A05
            boolean r1 = r0.A05(r3, r4)
            if (r1 != 0) goto L_0x0014
            X.2rZ r0 = r2.A09
            boolean r1 = r0.A05(r3)
            if (r1 == 0) goto L_0x0019
        L_0x0014:
            X.2rZ r0 = r2.A09
            r0.A03(r3)
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55632qf.A04(X.1mS, boolean):boolean");
    }

    public final void A00(C95804uY r17, C624134x r18, List list, List list2, long j) {
        boolean z;
        int i;
        int i2;
        String str;
        C624134x r5 = r18;
        if (list != null) {
            z = true;
        } else if (list2 != null) {
            z = false;
        } else {
            return;
        }
        A02(r5, (Long) null, (Long) null, (String) null, j, z, false);
        if (list != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C138966rI r0 = (C138966rI) it.next();
                C56972sr r8 = this.A00;
                String str2 = r0.A01;
                C162457s7.A0D(str2);
                long A032 = C18320x8.A03((Number) r0.A00);
                AnonymousClass2SV A12 = r5.A12();
                if (A12 != null) {
                    str = A12.A05;
                } else {
                    str = null;
                }
                A0s.add(new AnonymousClass1Hp(r8, r17, str2, A032, r5.A1L, str2.equals(str)));
            }
            if (!r5.A1t(new C64313Cz(A0s))) {
                AnonymousClass4FP r1 = r5.A0L;
                C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.newsletter.data.NewsletterMessageReactions");
                C64313Cz r12 = (C64313Cz) r1;
                synchronized (r12) {
                    List list3 = r12.A00;
                    list3.clear();
                    list3.addAll(A0s);
                }
            }
        }
        if (list2 != null && (r5 instanceof C30451mT)) {
            LinkedHashMap A0r = C18320x8.A0r();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C138956rH r2 = (C138956rH) it2.next();
                String A002 = AnonymousClass76H.A00((byte[]) r2.A01);
                C162457s7.A0H(A002);
                Object obj = r2.A00;
                C162457s7.A0D(obj);
                A0r.put(A002, obj);
            }
            C30451mT r52 = (C30451mT) r5;
            r52.A04 = null;
            Iterator it3 = r52.A05.iterator();
            while (it3.hasNext()) {
                C60142y4 A0Z = AnonymousClass0x9.A0Z(it3);
                String str3 = A0Z.A02;
                if (A0r.containsKey(str3)) {
                    Number A0p = AnonymousClass0x9.A0p(str3, A0r);
                    i2 = 0;
                    if (A0p != null) {
                        i = A0p.intValue();
                        if (i < 0) {
                            A0Z.A00 = i2;
                        }
                        i2 = i;
                        A0Z.A00 = i2;
                    }
                }
                i = 0;
                i2 = i;
                A0Z.A00 = i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r31 == null) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A02(X.C624134x r29, java.lang.Long r30, java.lang.Long r31, java.lang.String r32, long r33, boolean r35, boolean r36) {
        /*
            r28 = this;
            r6 = r28
            monitor-enter(r6)
            r7 = 0
            r2 = 0
            long r0 = X.C18290x4.A09(r35)
            r8 = r29
            X.2SV r9 = r8.A12()     // Catch:{ all -> 0x0117 }
            r18 = r31
            r13 = r32
            r4 = r33
            if (r9 != 0) goto L_0x0034
            if (r30 == 0) goto L_0x001e
            long r2 = r30.longValue()     // Catch:{ all -> 0x0117 }
        L_0x001e:
            r20 = 0
            X.2SV r7 = new X.2SV     // Catch:{ all -> 0x0117 }
            r24 = r4
            r26 = r2
            r19 = r13
            r22 = r0
            r17 = r7
            r17.<init>(r18, r19, r20, r22, r24, r26)     // Catch:{ all -> 0x0117 }
            r8.A1X(r7)     // Catch:{ all -> 0x0117 }
            goto L_0x0115
        L_0x0034:
            X.2SV r9 = r8.A12()     // Catch:{ all -> 0x0117 }
            r12 = 0
            if (r9 == 0) goto L_0x0046
            java.lang.String r11 = r9.A05     // Catch:{ all -> 0x0117 }
        L_0x003d:
            X.2SV r9 = r8.A12()     // Catch:{ all -> 0x0117 }
            if (r9 == 0) goto L_0x0059
            java.lang.Long r10 = r9.A04     // Catch:{ all -> 0x0117 }
            goto L_0x0048
        L_0x0046:
            r11 = r12
            goto L_0x003d
        L_0x0048:
            if (r10 == 0) goto L_0x005a
            if (r31 == 0) goto L_0x005c
            long r16 = r18.longValue()     // Catch:{ all -> 0x0117 }
            long r14 = r10.longValue()     // Catch:{ all -> 0x0117 }
            int r9 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x005c
            goto L_0x005e
        L_0x0059:
            r10 = r12
        L_0x005a:
            if (r31 != 0) goto L_0x005e
        L_0x005c:
            r14 = 0
            goto L_0x0062
        L_0x005e:
            r14 = 1
            r11 = r13
            r10 = r18
        L_0x0062:
            X.2SV r9 = r8.A12()     // Catch:{ all -> 0x0117 }
            if (r9 == 0) goto L_0x007e
            r9.A00 = r2     // Catch:{ all -> 0x0117 }
            r9.A05 = r11     // Catch:{ all -> 0x0117 }
            r9.A04 = r10     // Catch:{ all -> 0x0117 }
            r9.A01 = r0     // Catch:{ all -> 0x0117 }
            r9.A02 = r4     // Catch:{ all -> 0x0117 }
            if (r30 == 0) goto L_0x0079
            long r0 = r30.longValue()     // Catch:{ all -> 0x0117 }
            goto L_0x007b
        L_0x0079:
            long r0 = r9.A03     // Catch:{ all -> 0x0117 }
        L_0x007b:
            r9.A03 = r0     // Catch:{ all -> 0x0117 }
            r12 = r9
        L_0x007e:
            r8.A1X(r12)     // Catch:{ all -> 0x0117 }
            if (r14 == 0) goto L_0x0115
            java.util.ArrayList r1 = X.AnonymousClass002.A0I(r7)     // Catch:{ all -> 0x0117 }
            X.3Cz r0 = new X.3Cz     // Catch:{ all -> 0x0117 }
            r0.<init>(r1)     // Catch:{ all -> 0x0117 }
            r8.A1t(r0)     // Catch:{ all -> 0x0117 }
            X.4FP r1 = r8.A0L     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x010e
            X.3Cz r1 = (X.C64313Cz) r1     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x0115
            X.2sr r11 = r6.A00     // Catch:{ all -> 0x0117 }
            X.2z0 r0 = r8.A1J     // Catch:{ all -> 0x0117 }
            X.4uZ r4 = r0.A00     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C162457s7.A0K(r4, r0)     // Catch:{ all -> 0x0117 }
            X.4uY r4 = (X.C95804uY) r4     // Catch:{ all -> 0x0117 }
            long r8 = r8.A1L     // Catch:{ all -> 0x0117 }
            r3 = 1
            X.C162457s7.A0J(r4, r3)     // Catch:{ all -> 0x0117 }
            java.util.List r2 = r1.A00     // Catch:{ all -> 0x0117 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ all -> 0x0117 }
            r10 = 0
            r12 = 1
        L_0x00b3:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r5 = r16.next()     // Catch:{ all -> 0x0117 }
            X.1Hp r5 = (X.AnonymousClass1Hp) r5     // Catch:{ all -> 0x0117 }
            boolean r1 = r5.A01     // Catch:{ all -> 0x0117 }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x0117 }
            boolean r0 = X.C162457s7.A0P(r0, r13)     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x00e0
            if (r0 != 0) goto L_0x0115
            r5.A01 = r7     // Catch:{ all -> 0x0117 }
            if (r36 == 0) goto L_0x00d6
            long r0 = r5.A00     // Catch:{ all -> 0x0117 }
            r14 = -1
            long r0 = r0 + r14
            r5.A00 = r0     // Catch:{ all -> 0x0117 }
        L_0x00d6:
            long r0 = r5.A00     // Catch:{ all -> 0x0117 }
            r17 = 0
            int r14 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x00b3
            r10 = r5
            goto L_0x00b3
        L_0x00e0:
            if (r0 == 0) goto L_0x00b3
            r5.A01 = r3     // Catch:{ all -> 0x0117 }
            if (r36 == 0) goto L_0x00ed
            long r0 = r5.A00     // Catch:{ all -> 0x0117 }
            r14 = 1
            long r0 = r0 + r14
            r5.A00 = r0     // Catch:{ all -> 0x0117 }
        L_0x00ed:
            r12 = 0
            goto L_0x00b3
        L_0x00ef:
            if (r10 == 0) goto L_0x00f4
            r2.remove(r10)     // Catch:{ all -> 0x0117 }
        L_0x00f4:
            if (r12 == 0) goto L_0x0115
            if (r32 == 0) goto L_0x0115
            int r0 = r13.length()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0115
            r14 = 1
            X.1Hp r10 = new X.1Hp     // Catch:{ all -> 0x0117 }
            r12 = r4
            r16 = r8
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r16, r18)     // Catch:{ all -> 0x0117 }
            r2.add(r10)     // Catch:{ all -> 0x0117 }
            goto L_0x0115
        L_0x010e:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0115:
            monitor-exit(r6)
            return
        L_0x0117:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55632qf.A02(X.34x, java.lang.Long, java.lang.Long, java.lang.String, long, boolean, boolean):void");
    }

    public C55632qf(C56972sr r2, C49712gy r3, C56612sH r4, C56922sm r5, C56982ss r6, AnonymousClass30G r7, C54762pF r8, C51532jy r9, C620333f r10, C56182rZ r11, C45402Zx r12, C40822Hw r13, C55832qz r14, C33141sV r15) {
        C18260x0.A0f(r4, r5, r2, r6, r3);
        C18260x0.A0g(r14, r10, r8, r9, r11);
        C162457s7.A0J(r7, 11);
        C162457s7.A0J(r15, 13);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A01 = r3;
        this.A0C = r14;
        this.A08 = r10;
        this.A06 = r8;
        this.A07 = r9;
        this.A09 = r11;
        this.A05 = r7;
        this.A0B = r13;
        this.A0D = r15;
        this.A0A = r12;
    }

    public final void A01(C95804uY r13, C30451mT r14, List list, long j) {
        C18260x0.A0O(r13, r14);
        List list2 = r14.A05;
        ArrayList A0t = C18300x5.A0t(list2);
        for (Object next : list2) {
            C60142y4 r3 = (C60142y4) next;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (C162457s7.A0P(r3.A02, it.next())) {
                        A0t.add(next);
                        break;
                    }
                }
            }
        }
        ArrayList A0c = C73783g4.A0c(A0t);
        Iterator it2 = A0t.iterator();
        while (it2.hasNext()) {
            AnonymousClass0x2.A1Q(A0c, AnonymousClass0x9.A0Z(it2).A01);
        }
        C40822Hw r2 = this.A0B;
        long j2 = j;
        C30591mh r22 = new C30591mh(r2.A00.A04(r13, true), new C52042kn((C95814uZ) null, r14.A1J), (List) A0c, j2, r14.A1L, j2);
        r22.A1G(17);
        this.A08.A03(r22, true);
    }
}
