package X;

import java.util.List;

/* renamed from: X.5lp  reason: invalid class name and case insensitive filesystem */
public final class C113685lp implements AnonymousClass664 {
    public final AnonymousClass5WG A00;
    public final C55582qa A01;

    public C113685lp(AnonymousClass5WG r2, C55582qa r3) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public String BDW() {
        return "CallingPrivacy";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        r6 = -1;
        r5 = -1;
        r2 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQV() {
        /*
            r23 = this;
            r3 = r23
            X.5WG r4 = r3.A00
            X.1VX r1 = r4.A04
            r0 = 4960(0x1360, float:6.95E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0164
            X.33p r10 = r4.A02
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r10)
            java.lang.String r9 = "calling_privacy_last_unknown_caller_stats_millis"
            long r7 = X.AnonymousClass0x2.A0A(r0, r9)
            X.2sH r2 = r4.A01
            long r5 = r2.A0D()
            long r0 = X.AnonymousClass5WG.A07
            long r7 = r7 + r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0164
            X.C18260x0.A0M(r10, r9, r5)
            long[] r13 = X.AnonymousClass5WG.A08
            r0 = 0
            java.util.HashMap r12 = X.AnonymousClass001.A0t()
            int r11 = r13.length
            X.7Mg[] r10 = new X.C149387Mg[r11]
            r21 = r13[r0]
            long r19 = r2.A0D()
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r2 = 0
        L_0x0040:
            int r9 = r9 + 1
            X.2sW r14 = r4.A03
            r1 = 0
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r1 = r14.A04(r1, r8, r0)
            int r8 = r8 + r0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00eb
            java.util.Iterator r18 = r1.iterator()
        L_0x0056:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r14 = r18.next()
            X.3ZF r14 = (X.AnonymousClass3ZF) r14
        L_0x0062:
            long r0 = r14.A0B
            long r16 = r19 - r21
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 >= 0) goto L_0x0078
            X.7Mg r0 = new X.7Mg
            r0.<init>(r4, r6, r5, r2)
            r10[r7] = r0
            int r7 = r7 + 1
            if (r7 >= r11) goto L_0x00eb
            r21 = r13[r7]
            goto L_0x0062
        L_0x0078:
            X.39J r0 = r14.A0E
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0056
            int r6 = r6 + 1
            X.39J r0 = r14.A0E
            com.whatsapp.jid.UserJid r1 = r0.A01
            X.C162457s7.A0D(r1)
            java.lang.String r0 = r1.getRawString()
            java.lang.Object r15 = r12.get(r0)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 != 0) goto L_0x00a4
            X.2sK r0 = r4.A00
            boolean r0 = r0.A0B(r1)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = r1.getRawString()
            r12.put(r0, r15)
        L_0x00a4:
            boolean r0 = r15.booleanValue()
            r16 = r0 ^ 1
            com.whatsapp.jid.GroupJid r1 = r14.A05
            if (r1 == 0) goto L_0x00d6
            java.lang.String r0 = r1.getRawString()
            java.lang.Object r15 = r12.get(r0)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            if (r15 != 0) goto L_0x00cf
            X.2sD r0 = r4.A06
            int r0 = r0.A00(r1)
            boolean r0 = X.AnonymousClass001.A1T(r0)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = r1.getRawString()
            r12.put(r0, r15)
        L_0x00cf:
            boolean r0 = r15.booleanValue()
            if (r0 == 0) goto L_0x00d6
            goto L_0x0056
        L_0x00d6:
            if (r16 == 0) goto L_0x0056
            int r5 = r5 + 1
            boolean r0 = r14.A0Q()
            if (r0 != 0) goto L_0x0056
            int r2 = r2 + 1
            goto L_0x0056
        L_0x00e4:
            r0 = 10
            if (r9 < r0) goto L_0x0040
            r6 = -1
            r5 = -1
            r2 = -1
        L_0x00eb:
            if (r7 >= r11) goto L_0x00f7
            X.7Mg r0 = new X.7Mg
            r0.<init>(r4, r6, r5, r2)
            r10[r7] = r0
            int r7 = r7 + 1
            goto L_0x00eb
        L_0x00f7:
            java.util.List r5 = X.C73703fw.A03(r10)
            X.4sg r2 = new X.4sg
            r2.<init>()
            r1 = 0
            java.lang.Long r0 = A02(r5, r1)
            r2.A0B = r0
            java.lang.Long r0 = A00(r5, r1)
            r2.A06 = r0
            java.lang.Long r0 = A01(r5, r1)
            r2.A01 = r0
            r1 = 1
            java.lang.Long r0 = A02(r5, r1)
            r2.A0D = r0
            java.lang.Long r0 = A00(r5, r1)
            r2.A08 = r0
            java.lang.Long r0 = A01(r5, r1)
            r2.A03 = r0
            r1 = 2
            java.lang.Long r0 = A02(r5, r1)
            r2.A0E = r0
            java.lang.Long r0 = A00(r5, r1)
            r2.A09 = r0
            java.lang.Long r0 = A01(r5, r1)
            r2.A04 = r0
            r1 = 3
            java.lang.Long r0 = A02(r5, r1)
            r2.A0A = r0
            java.lang.Long r0 = A00(r5, r1)
            r2.A05 = r0
            java.lang.Long r0 = A01(r5, r1)
            r2.A00 = r0
            r1 = 4
            java.lang.Long r0 = A02(r5, r1)
            r2.A0C = r0
            java.lang.Long r0 = A00(r5, r1)
            r2.A07 = r0
            java.lang.Long r0 = A01(r5, r1)
            r2.A02 = r0
            X.4FV r0 = r4.A05
            r0.BhD(r2)
        L_0x0164:
            X.2qa r5 = r3.A01
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Set r7 = r5.A0C
            monitor-enter(r7)
            r5.A00()     // Catch:{ all -> 0x01d2 }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r7)     // Catch:{ all -> 0x01d2 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x01d2 }
            r4 = 0
            r3 = 0
        L_0x017a:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x01a4
            java.lang.String r2 = X.AnonymousClass001.A0m(r6)     // Catch:{ all -> 0x01d2 }
            java.util.Set r0 = r5.A0B     // Catch:{ all -> 0x01d2 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x01d2 }
            if (r0 != 0) goto L_0x017a
            X.1fJ r1 = X.AnonymousClass34R.A04(r2)     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x019c
            boolean r0 = r5.A04(r1)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x019c
            r8.add(r1)     // Catch:{ all -> 0x01d2 }
            goto L_0x017a
        L_0x019c:
            boolean r0 = r7.remove(r2)     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x017a
            r3 = 1
            goto L_0x017a
        L_0x01a4:
            if (r3 == 0) goto L_0x01a9
            r5.A01()     // Catch:{ all -> 0x01d2 }
        L_0x01a9:
            monitor-exit(r7)     // Catch:{ all -> 0x01d2 }
            int r1 = r8.size()
            r0 = 32
            if (r1 <= r0) goto L_0x01b9
            java.util.Collections.shuffle(r8)
            java.util.List r8 = r8.subList(r4, r0)
        L_0x01b9:
            java.util.Iterator r4 = r8.iterator()
        L_0x01bd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r3 = r4.next()
            X.1fJ r3 = (X.C27991fJ) r3
            X.3Lr r2 = r5.A08
            r1 = 0
            r0 = 3
            r2.A0E(r3, r1, r0)
            goto L_0x01bd
        L_0x01d1:
            return
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01d2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113685lp.BQV():void");
    }

    public static Long A00(List list, int i) {
        return Long.valueOf((long) ((C149387Mg) list.get(i)).A01);
    }

    public static Long A01(List list, int i) {
        return Long.valueOf((long) ((C149387Mg) list.get(i)).A00);
    }

    public static Long A02(List list, int i) {
        return Long.valueOf((long) ((C149387Mg) list.get(i)).A02);
    }
}
