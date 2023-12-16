package X;

import java.util.ArrayList;

/* renamed from: X.2cL  reason: invalid class name and case insensitive filesystem */
public final class C46872cL {
    public int A00;
    public final int A01;
    public final AnonymousClass2PG A02;
    public final ArrayList A03 = AnonymousClass001.A0s();
    public final ArrayList A04 = AnonymousClass001.A0s();
    public final ArrayList A05 = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (r13.length() == 0) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(int r24, long r25, int r27) {
        /*
            r23 = this;
            r2 = r23
            monitor-enter(r2)
            r0 = 1
            r1 = r24
            r3 = r25
            if (r1 == r0) goto L_0x0019
            r0 = 2
            if (r1 == r0) goto L_0x0013
            java.util.ArrayList r0 = r2.A03     // Catch:{ all -> 0x01d3 }
            X.AnonymousClass0x2.A1Q(r0, r3)     // Catch:{ all -> 0x01d3 }
            goto L_0x001e
        L_0x0013:
            java.util.ArrayList r0 = r2.A05     // Catch:{ all -> 0x01d3 }
            X.AnonymousClass0x2.A1Q(r0, r3)     // Catch:{ all -> 0x01d3 }
            goto L_0x001e
        L_0x0019:
            java.util.ArrayList r0 = r2.A04     // Catch:{ all -> 0x01d3 }
            X.AnonymousClass0x2.A1Q(r0, r3)     // Catch:{ all -> 0x01d3 }
        L_0x001e:
            int r0 = r2.A00     // Catch:{ all -> 0x01d1 }
            int r0 = r0 + 1
            r2.A00 = r0     // Catch:{ all -> 0x01d1 }
            int r1 = r2.A01     // Catch:{ all -> 0x01d1 }
            if (r0 != r1) goto L_0x01cf
            java.util.ArrayList r0 = r2.A04     // Catch:{ all -> 0x01d1 }
            int r0 = r0.size()     // Catch:{ all -> 0x01d1 }
            if (r0 != r1) goto L_0x0143
            X.2PG r0 = r2.A02     // Catch:{ all -> 0x01d1 }
            X.2PE r3 = r0.A00     // Catch:{ all -> 0x01d1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "CrosspostRequestSessionManager/media upload success for session: "
            r1.append(r0)     // Catch:{ all -> 0x01d1 }
            X.2nJ r8 = r3.A02     // Catch:{ all -> 0x01d1 }
            java.lang.String r6 = r8.A04     // Catch:{ all -> 0x01d1 }
            X.AnonymousClass356.A05(r1, r6)     // Catch:{ all -> 0x01d1 }
            X.2ob r0 = r3.A00     // Catch:{ all -> 0x01d1 }
            X.2Z6 r5 = new X.2Z6     // Catch:{ all -> 0x01d1 }
            r5.<init>(r0, r8)     // Catch:{ all -> 0x01d1 }
            X.2qW r0 = r3.A01     // Catch:{ all -> 0x01d1 }
            X.8qC r0 = r0.A06     // Catch:{ all -> 0x01d1 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x01d1 }
            X.2cJ r3 = (X.C46852cJ) r3     // Catch:{ all -> 0x01d1 }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01d1 }
            X.6aY r0 = r8.A02     // Catch:{ all -> 0x01d1 }
            X.8Nf r15 = r0.iterator()     // Catch:{ all -> 0x01d1 }
        L_0x005f:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x00e6
            X.34x r11 = X.C18300x5.A0T(r15)     // Catch:{ all -> 0x01d1 }
            java.util.Map r7 = r8.A05     // Catch:{ all -> 0x01d1 }
            long r0 = r11.A1L     // Catch:{ all -> 0x01d1 }
            java.lang.Object r0 = X.C18280x3.A0W(r7, r0)     // Catch:{ all -> 0x01d1 }
            X.2mw r0 = (X.C53342mw) r0     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x01cf
            java.lang.String r10 = r0.A03     // Catch:{ all -> 0x01d1 }
            if (r10 == 0) goto L_0x01cf
            java.lang.String r9 = r0.A01     // Catch:{ all -> 0x01d1 }
            if (r9 == 0) goto L_0x01cf
            int r0 = r9.length()     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x01cf
            byte r7 = r11.A1I     // Catch:{ all -> 0x01d1 }
            r1 = 8
            r0 = 0
            X.38t r1 = X.AnonymousClass36O.A01(r0, r7, r1)     // Catch:{ all -> 0x01d1 }
            X.C162457s7.A0D(r1)     // Catch:{ all -> 0x01d1 }
            X.38t r0 = X.C633138t.A0m     // Catch:{ all -> 0x01d1 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x00e3
            X.21i r0 = X.C372021i.IMAGE     // Catch:{ all -> 0x01d1 }
        L_0x0099:
            java.lang.String r7 = r0.value     // Catch:{ all -> 0x01d1 }
            java.lang.String r21 = r11.A16()     // Catch:{ all -> 0x01d1 }
            X.5Zz r12 = r3.A01     // Catch:{ all -> 0x01d1 }
            r14 = 0
            java.lang.String r13 = r11.A13()     // Catch:{ all -> 0x01d1 }
            if (r13 == 0) goto L_0x00af
            int r1 = r13.length()     // Catch:{ all -> 0x01d1 }
            r0 = 0
            if (r1 != 0) goto L_0x00b0
        L_0x00af:
            r0 = 1
        L_0x00b0:
            r22 = 0
            if (r0 != 0) goto L_0x00cb
            android.text.SpannableStringBuilder r0 = X.C18330xA.A00(r13)     // Catch:{ all -> 0x01d1 }
            r12.A06(r0)     // Catch:{ all -> 0x01d1 }
            android.text.style.URLSpan[] r1 = X.C18310x6.A1Z(r0)     // Catch:{ all -> 0x01d1 }
            X.C162457s7.A0H(r1)     // Catch:{ all -> 0x01d1 }
            int r0 = r1.length     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x00cb
            r0 = r1[r14]     // Catch:{ all -> 0x01d1 }
            java.lang.String r22 = r0.getURL()     // Catch:{ all -> 0x01d1 }
        L_0x00cb:
            long r0 = r11.A0K     // Catch:{ all -> 0x01d1 }
            java.lang.Long r17 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01d1 }
            X.2nI r0 = new X.2nI     // Catch:{ all -> 0x01d1 }
            r19 = r9
            r20 = r7
            r18 = r10
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01d1 }
            r4.add(r0)     // Catch:{ all -> 0x01d1 }
            goto L_0x005f
        L_0x00e3:
            X.21i r0 = X.C372021i.VIDEO     // Catch:{ all -> 0x01d1 }
            goto L_0x0099
        L_0x00e6:
            X.2PF r7 = new X.2PF     // Catch:{ all -> 0x01d1 }
            r7.<init>(r5, r3, r8)     // Catch:{ all -> 0x01d1 }
            X.8qC r0 = r3.A03     // Catch:{ all -> 0x01d1 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x01d1 }
            X.1vb r5 = (X.C34711vb) r5     // Catch:{ all -> 0x01d1 }
            X.6aY r3 = r8.A01     // Catch:{ all -> 0x01d1 }
            X.2nn r1 = r8.A03     // Catch:{ all -> 0x01d1 }
            X.2E6 r0 = r5.A01     // Catch:{ all -> 0x01d1 }
            X.3dX r0 = r0.A00     // Catch:{ all -> 0x01d1 }
            X.3Db r0 = r0.A01     // Catch:{ all -> 0x01d1 }
            X.4C1 r0 = r0.AEM     // Catch:{ all -> 0x01d1 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01d1 }
            X.2EG r0 = (X.AnonymousClass2EG) r0     // Catch:{ all -> 0x01d1 }
            X.2cK r8 = new X.2cK     // Catch:{ all -> 0x01d1 }
            r9 = r0
            r10 = r1
            r11 = r6
            r12 = r4
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01d1 }
            X.3Xs r4 = new X.3Xs     // Catch:{ all -> 0x01d1 }
            r4.<init>(r7)     // Catch:{ all -> 0x01d1 }
            X.66R r1 = r8.A05     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = X.AnonymousClass0x9.A13(r1)     // Catch:{ all -> 0x01d1 }
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "payload encryption failed"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x01d1 }
            r0 = 0
            r4.BSC(r1, r0)     // Catch:{ all -> 0x01d1 }
            goto L_0x01cf
        L_0x0129:
            java.lang.String r3 = X.AnonymousClass0x9.A13(r1)     // Catch:{ all -> 0x01d1 }
            if (r3 == 0) goto L_0x013e
            X.66R r0 = r5.A03     // Catch:{ all -> 0x01d1 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x01d1 }
            X.1ve r1 = (X.C34741ve) r1     // Catch:{ all -> 0x01d1 }
            r0 = 47
            r5.A02(r4, r1, r3, r0)     // Catch:{ all -> 0x01d1 }
            goto L_0x01cf
        L_0x013e:
            java.lang.IllegalStateException r0 = X.C18290x4.A0Y()     // Catch:{ all -> 0x01d1 }
            throw r0     // Catch:{ all -> 0x01d1 }
        L_0x0143:
            java.util.ArrayList r0 = r2.A03     // Catch:{ all -> 0x01d1 }
            boolean r0 = X.AnonymousClass0x7.A1S(r0)     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x01a0
            X.2PG r7 = r2.A02     // Catch:{ all -> 0x01d1 }
            X.2Tx r0 = r7.A02     // Catch:{ all -> 0x01d1 }
            X.8qC r0 = r0.A0A     // Catch:{ all -> 0x01d1 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x01d1 }
            X.2fB r6 = (X.C48612fB) r6     // Catch:{ all -> 0x01d1 }
            X.2nJ r3 = r7.A01     // Catch:{ all -> 0x01d1 }
            java.lang.String r5 = r3.A04     // Catch:{ all -> 0x01d1 }
            X.6aY r0 = r3.A02     // Catch:{ all -> 0x01d1 }
            java.util.ArrayList r4 = X.C73783g4.A0d(r0)     // Catch:{ all -> 0x01d1 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01d1 }
        L_0x0165:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x016f
            X.C624134x.A0Z(r4, r1)     // Catch:{ all -> 0x01d1 }
            goto L_0x0165
        L_0x016f:
            X.6aY r0 = r3.A01     // Catch:{ all -> 0x01d1 }
            java.util.ArrayList r3 = X.C73783g4.A0d(r0)     // Catch:{ all -> 0x01d1 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01d1 }
        L_0x0179:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x0183
            X.C52072kq.A00(r3, r1)     // Catch:{ all -> 0x01d1 }
            goto L_0x0179
        L_0x0183:
            r6.A01(r5, r4, r3)     // Catch:{ all -> 0x01d1 }
            X.2PE r4 = r7.A00     // Catch:{ all -> 0x01d1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "CrosspostRequestSessionManager/media upload delivery failure for session: "
            r1.append(r0)     // Catch:{ all -> 0x01d1 }
            X.2nJ r0 = r4.A02     // Catch:{ all -> 0x01d1 }
            java.lang.String r3 = r0.A04     // Catch:{ all -> 0x01d1 }
            X.AnonymousClass356.A05(r1, r3)     // Catch:{ all -> 0x01d1 }
            X.2ob r1 = r4.A00     // Catch:{ all -> 0x01d1 }
            X.217 r0 = X.AnonymousClass217.MEDIA_UPLOAD     // Catch:{ all -> 0x01d1 }
            r1.A02(r0, r3)     // Catch:{ all -> 0x01d1 }
            goto L_0x01cf
        L_0x01a0:
            X.2PG r0 = r2.A02     // Catch:{ all -> 0x01d1 }
            X.2PE r4 = r0.A00     // Catch:{ all -> 0x01d1 }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = "CrosspostRequestSessionManager/media upload error for session: "
            r3.append(r0)     // Catch:{ all -> 0x01d1 }
            X.2nJ r1 = r4.A02     // Catch:{ all -> 0x01d1 }
            java.lang.String r7 = r1.A04     // Catch:{ all -> 0x01d1 }
            r3.append(r7)     // Catch:{ all -> 0x01d1 }
            java.lang.String r0 = " with errorCode: "
            r5 = r27
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r3, r5)     // Catch:{ all -> 0x01d1 }
            X.AnonymousClass356.A01(r0)     // Catch:{ all -> 0x01d1 }
            X.2ob r4 = r4.A00     // Catch:{ all -> 0x01d1 }
            X.1vL r6 = new X.1vL     // Catch:{ all -> 0x01d1 }
            r6.<init>(r5)     // Catch:{ all -> 0x01d1 }
            X.217 r5 = X.AnonymousClass217.MEDIA_UPLOAD     // Catch:{ all -> 0x01d1 }
            X.6aY r8 = r1.A02     // Catch:{ all -> 0x01d1 }
            int r9 = r1.A00     // Catch:{ all -> 0x01d1 }
            r4.A01(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01d1 }
        L_0x01cf:
            monitor-exit(r2)
            return
        L_0x01d1:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46872cL.A00(int, long, int):void");
    }

    public C46872cL(AnonymousClass2PG r2, int i) {
        this.A01 = i;
        this.A02 = r2;
    }
}
