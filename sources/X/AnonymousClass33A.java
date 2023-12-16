package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.33A  reason: invalid class name */
public final class AnonymousClass33A {
    public final C55682qk A00;
    public final C56972sr A01;
    public final C64773Ex A02;
    public final C56612sH A03;
    public final AnonymousClass33p A04;
    public final C56982ss A05;
    public final C66543Lv A06;
    public final C46412ba A07;
    public final C56892sj A08;
    public final C72303dV A09;
    public final C56662sM A0A;
    public final AnonymousClass1VX A0B;
    public final C66493Lq A0C;
    public final C85314Ft A0D;
    public final C56832sd A0E;

    public AnonymousClass33A(C55682qk r17, C56972sr r18, C64773Ex r19, C56612sH r20, AnonymousClass33p r21, C56982ss r22, C66543Lv r23, C46412ba r24, C56892sj r25, C72303dV r26, C56662sM r27, AnonymousClass1VX r28, C66493Lq r29, C85314Ft r30, C56832sd r31) {
        AnonymousClass1VX r4 = r28;
        C56982ss r10 = r22;
        C56612sH r12 = r20;
        C56972sr r14 = r18;
        C55682qk r15 = r17;
        C18260x0.A0f(r12, r4, r15, r14, r10);
        C66493Lq r3 = r29;
        C56662sM r5 = r27;
        C72303dV r6 = r26;
        AnonymousClass33p r11 = r21;
        C64773Ex r13 = r19;
        C18260x0.A0g(r13, r5, r3, r6, r11);
        C56832sd r1 = r31;
        C85314Ft r2 = r30;
        C66543Lv r9 = r23;
        C18260x0.A0Y(r9, r1, r2);
        C46412ba r8 = r24;
        C162457s7.A0J(r8, 14);
        C56892sj r7 = r25;
        C162457s7.A0J(r7, 15);
        this.A03 = r12;
        this.A0B = r4;
        this.A00 = r15;
        this.A01 = r14;
        this.A05 = r10;
        this.A02 = r13;
        this.A0A = r5;
        this.A0C = r3;
        this.A09 = r6;
        this.A04 = r11;
        this.A06 = r9;
        this.A0E = r1;
        this.A0D = r2;
        this.A07 = r8;
        this.A08 = r7;
    }

    public static final boolean A01(List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C627336j.A0L(AnonymousClass0x7.A0S(it))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final List A00(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (C627336j.A0M((Jid) next)) {
                A0s.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            C162457s7.A0K(next2, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
            A0c.add(next2);
        }
        return A0c;
    }

    public final C30341mI A02(AnonymousClass1fI r8, List list) {
        ArrayList arrayList;
        C95814uZ A052;
        if (!A01(list) || !this.A0B.A0Y(C58422vE.A02, 4509)) {
            arrayList = AnonymousClass001.A0s();
            for (Object next : list) {
                if (!(next instanceof C27981fH)) {
                    arrayList.add(next);
                }
            }
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object next2 : list) {
                if (next2 instanceof PhoneUserJid) {
                    A0s.add(next2);
                }
            }
            Map A062 = this.A0A.A06(A0s);
            arrayList = AnonymousClass001.A0s();
            for (Object next3 : list) {
                if (next3 instanceof PhoneUserJid) {
                    next3 = A062.get(next3);
                }
                if (next3 != null) {
                    arrayList.add(next3);
                }
            }
        }
        if (list.size() != arrayList.size()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BroadcastListManager/filterParticipants ");
            A0o.append(r8);
            A0o.append("; input=");
            A0o.append(list);
            A0o.append(';');
            AnonymousClass0x2.A19(A0o);
            C55682qk r3 = this.A00;
            StringBuilder A0v = C18290x4.A0v(r8);
            AnonymousClass000.A1H("; input=", A0v, list);
            C18260x0.A19("; output=", A0v, arrayList);
            r3.A0A("lid-broadcast-filtered-participants", false, A0v.toString());
        }
        this.A0C.A0N(r8, arrayList, false, A01(arrayList));
        boolean A012 = A01(arrayList);
        C56972sr r0 = this.A01;
        if (A012) {
            A052 = r0.A0I();
        } else {
            A052 = C56972sr.A05(r0);
        }
        C162457s7.A0H(A052);
        C56832sd r1 = this.A0E;
        C31891p1 A022 = C31891p1.A02(C56832sd.A00(r8, r1), 9, this.A03.A0H());
        A022.A1Z((String) null);
        A022.A01 = arrayList;
        A022.A1J(A052);
        return A022;
    }

    public final List A03(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            if (next instanceof PhoneUserJid) {
                A0s.add(next);
            }
        }
        Map A062 = this.A0A.A06(A0s);
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object next2 : list) {
            if (next2 instanceof PhoneUserJid) {
                next2 = A062.get(next2);
            } else if (!(next2 instanceof C27981fH)) {
            }
            if (next2 != null) {
                A0s2.add(next2);
            }
        }
        return A0s2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.AnonymousClass2A8.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass1fI r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BroadcastListManager/convertListAddressingMode converting list "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " to "
            X.C18260x0.A0s(r0, r9, r1)
            X.2sj r0 = r7.A08
            X.33k r3 = X.C56892sj.A01(r0, r8)
            X.6aS r1 = r3.A02()
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "lid"
            boolean r0 = X.C162457s7.A0P(r9, r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r1.iterator()
            if (r0 == 0) goto L_0x0042
        L_0x002e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002e
            r5.add(r1)
            goto L_0x002e
        L_0x0042:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0042
            if (r1 == 0) goto L_0x0042
            r5.add(r1)
            goto L_0x0042
        L_0x0056:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r5.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r2.next()
            X.1fH r1 = (X.C27981fH) r1
            X.2sM r0 = r7.A0A
            com.whatsapp.jid.PhoneUserJid r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x005e
            r6.add(r0)
            goto L_0x005e
        L_0x0076:
            X.3zs r4 = new X.3zs
            r4.<init>(r3, r7, r8)
            goto L_0x008b
        L_0x007c:
            X.2sM r0 = r7.A0A
            java.util.Map r0 = r0.A06(r5)
            java.util.Collection r6 = r0.values()
            X.3zr r4 = new X.3zr
            r4.<init>(r3, r7, r8)
        L_0x008b:
            X.3dV r0 = r7.A09
            X.4Fq r2 = r0.A04()
            X.3Yo r3 = r2.Axl()     // Catch:{ all -> 0x00c3 }
            X.3Lq r1 = r7.A0C     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r5)     // Catch:{ all -> 0x00bc }
            r1.A0Q(r8, r0)     // Catch:{ all -> 0x00bc }
            r0 = 0
            X.C162457s7.A0J(r6, r0)     // Catch:{ all -> 0x00bc }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r6)     // Catch:{ all -> 0x00bc }
            r1.A0P(r8, r0)     // Catch:{ all -> 0x00bc }
            r1 = 43
            X.3Zl r0 = new X.3Zl     // Catch:{ all -> 0x00bc }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x00bc }
            r2.B25(r0)     // Catch:{ all -> 0x00bc }
            r3.A00()     // Catch:{ all -> 0x00bc }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x00bc }
            r3.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00c8
        L_0x00bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r3, r1)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x00db }
        L_0x00c8:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r0)     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00d7
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "BroadcastListManager/replaceParticipants failed to replace participants for "
            X.C18260x0.A1Q(r1, r0, r8)     // Catch:{ all -> 0x00db }
        L_0x00d7:
            r2.close()
            return
        L_0x00db:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33A.A04(X.1fI, java.lang.String):void");
    }
}
