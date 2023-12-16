package X;

import java.util.ArrayList;

/* renamed from: X.2cO  reason: invalid class name and case insensitive filesystem */
public final class C46902cO {
    public int A00;
    public final int A01;
    public final AnonymousClass2PO A02;
    public final ArrayList A03 = AnonymousClass001.A0s();
    public final ArrayList A04 = AnonymousClass001.A0s();
    public final ArrayList A05 = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r12.length() == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(java.lang.Integer r23, int r24, int r25, long r26) {
        /*
            r22 = this;
            r3 = r22
            monitor-enter(r3)
            r0 = 1
            r4 = r24
            r1 = r26
            if (r4 == r0) goto L_0x0019
            r0 = 2
            if (r4 == r0) goto L_0x0013
            java.util.ArrayList r0 = r3.A03     // Catch:{ all -> 0x01dd }
            X.AnonymousClass0x2.A1Q(r0, r1)     // Catch:{ all -> 0x01dd }
            goto L_0x001e
        L_0x0013:
            java.util.ArrayList r0 = r3.A05     // Catch:{ all -> 0x01dd }
            X.AnonymousClass0x2.A1Q(r0, r1)     // Catch:{ all -> 0x01dd }
            goto L_0x001e
        L_0x0019:
            java.util.ArrayList r0 = r3.A04     // Catch:{ all -> 0x01dd }
            X.AnonymousClass0x2.A1Q(r0, r1)     // Catch:{ all -> 0x01dd }
        L_0x001e:
            int r0 = r3.A00     // Catch:{ all -> 0x01db }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x01db }
            int r1 = r3.A01     // Catch:{ all -> 0x01db }
            if (r0 != r1) goto L_0x01d9
            java.util.ArrayList r0 = r3.A04     // Catch:{ all -> 0x01db }
            int r0 = r0.size()     // Catch:{ all -> 0x01db }
            if (r0 != r1) goto L_0x0166
            X.2PO r0 = r3.A02     // Catch:{ all -> 0x01db }
            X.2PN r4 = r0.A00     // Catch:{ all -> 0x01db }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload success for session: "
            r1.append(r0)     // Catch:{ all -> 0x01db }
            X.2lx r9 = r4.A02     // Catch:{ all -> 0x01db }
            java.lang.String r5 = r9.A01     // Catch:{ all -> 0x01db }
            X.C18270x1.A1G(r1, r5)     // Catch:{ all -> 0x01db }
            X.2oR r0 = r4.A00     // Catch:{ all -> 0x01db }
            X.2ZA r2 = new X.2ZA     // Catch:{ all -> 0x01db }
            r2.<init>(r0, r5)     // Catch:{ all -> 0x01db }
            X.2r9 r0 = r4.A01     // Catch:{ all -> 0x01db }
            X.8qC r0 = r0.A08     // Catch:{ all -> 0x01db }
            java.lang.Object r8 = r0.get()     // Catch:{ all -> 0x01db }
            X.32Q r8 = (X.AnonymousClass32Q) r8     // Catch:{ all -> 0x01db }
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x01db }
            X.6aY r7 = r9.A00     // Catch:{ all -> 0x01db }
            X.8Nf r15 = r7.iterator()     // Catch:{ all -> 0x01db }
        L_0x005f:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0137
            X.34x r11 = X.C18300x5.A0T(r15)     // Catch:{ all -> 0x01db }
            java.util.Map r6 = r9.A02     // Catch:{ all -> 0x01db }
            long r0 = r11.A1L     // Catch:{ all -> 0x01db }
            java.lang.Object r0 = X.C18280x3.A0W(r6, r0)     // Catch:{ all -> 0x01db }
            X.2mc r0 = (X.C53142mc) r0     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00db
            X.5dj r10 = r0.A02     // Catch:{ all -> 0x01db }
            if (r10 == 0) goto L_0x00db
            java.lang.String r1 = r0.A04     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x00db
            int r0 = r1.length()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00db
            X.5Zz r13 = r8.A01     // Catch:{ all -> 0x01db }
            r14 = 0
            java.lang.String r12 = r11.A13()     // Catch:{ all -> 0x01db }
            if (r12 == 0) goto L_0x0093
            int r6 = r12.length()     // Catch:{ all -> 0x01db }
            r0 = 0
            if (r6 != 0) goto L_0x0094
        L_0x0093:
            r0 = 1
        L_0x0094:
            r19 = 0
            if (r0 != 0) goto L_0x00af
            android.text.SpannableStringBuilder r0 = X.C18330xA.A00(r12)     // Catch:{ all -> 0x01db }
            r13.A06(r0)     // Catch:{ all -> 0x01db }
            android.text.style.URLSpan[] r6 = X.C18310x6.A1Z(r0)     // Catch:{ all -> 0x01db }
            X.C162457s7.A0H(r6)     // Catch:{ all -> 0x01db }
            int r0 = r6.length     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00af
            r0 = r6[r14]     // Catch:{ all -> 0x01db }
            java.lang.String r19 = r0.getURL()     // Catch:{ all -> 0x01db }
        L_0x00af:
            byte r12 = r11.A1I     // Catch:{ all -> 0x01db }
            r6 = 8
            r0 = 0
            X.38t r6 = X.AnonymousClass36O.A01(r0, r12, r6)     // Catch:{ all -> 0x01db }
            X.C162457s7.A0D(r6)     // Catch:{ all -> 0x01db }
            X.38t r0 = X.C633138t.A0m     // Catch:{ all -> 0x01db }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00d8
            java.lang.String r20 = "IMAGE"
        L_0x00c5:
            java.lang.String r18 = r11.A16()     // Catch:{ all -> 0x01db }
            X.2my r0 = new X.2my     // Catch:{ all -> 0x01db }
            r21 = r1
            r17 = r10
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01db }
            r4.add(r0)     // Catch:{ all -> 0x01db }
            goto L_0x005f
        L_0x00d8:
            java.lang.String r20 = "VIDEO"
            goto L_0x00c5
        L_0x00db:
            java.lang.String r1 = "XFamilyCrosspostRequestManager/crossposting info is empty or invalid"
            r0 = 0
            X.C626936e.A0D(r0, r1)     // Catch:{ all -> 0x01db }
            java.util.ArrayList r9 = X.C73783g4.A0c(r7)     // Catch:{ all -> 0x01db }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x01db }
        L_0x00e9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x00f3
            X.C624134x.A0Z(r9, r1)     // Catch:{ all -> 0x01db }
            goto L_0x00e9
        L_0x00f3:
            X.3Wi r5 = r8.A00     // Catch:{ all -> 0x01db }
            X.1iN r4 = r8.A03     // Catch:{ all -> 0x01db }
            X.8qC r1 = r8.A05     // Catch:{ all -> 0x01db }
            r0 = 4
            X.AnonymousClass36X.A06(r5, r4, r1, r9, r0)     // Catch:{ all -> 0x01db }
            X.8Nf r4 = r7.iterator()     // Catch:{ all -> 0x01db }
        L_0x0101:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x012f
            X.34x r0 = X.C18300x5.A0T(r4)     // Catch:{ all -> 0x01db }
            long r0 = r0.A1L     // Catch:{ all -> 0x01db }
            java.lang.Object r1 = X.C18280x3.A0W(r6, r0)     // Catch:{ all -> 0x01db }
            X.2mc r1 = (X.C53142mc) r1     // Catch:{ all -> 0x01db }
            if (r1 != 0) goto L_0x0116
            goto L_0x0126
        L_0x0116:
            X.5dj r0 = r1.A02     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x011b
            goto L_0x0129
        L_0x011b:
            java.lang.String r0 = r1.A04     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x012c
            int r0 = r0.length()     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x0101
            goto L_0x012c
        L_0x0126:
            r1 = -23
            goto L_0x0131
        L_0x0129:
            r1 = -24
            goto L_0x0131
        L_0x012c:
            r1 = -25
            goto L_0x0131
        L_0x012f:
            r1 = -13
        L_0x0131:
            r0 = 0
            r2.A00(r1, r0)     // Catch:{ all -> 0x01db }
            goto L_0x01d9
        L_0x0137:
            X.2aU r6 = new X.2aU     // Catch:{ all -> 0x01db }
            r6.<init>(r2, r9, r8)     // Catch:{ all -> 0x01db }
            X.8qC r0 = r8.A04     // Catch:{ all -> 0x01db }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x01db }
            X.2bI r7 = (X.C46232bI) r7     // Catch:{ all -> 0x01db }
            r2 = 0
            X.2rK r1 = r7.A01     // Catch:{ all -> 0x01db }
            X.21S r0 = X.AnonymousClass21S.A0F     // Catch:{ all -> 0x01db }
            X.2jK r0 = r1.A00(r0)     // Catch:{ all -> 0x01db }
            if (r0 != 0) goto L_0x0155
            r0 = -5
            r6.A00(r0, r2)     // Catch:{ all -> 0x01db }
            goto L_0x01d9
        L_0x0155:
            X.5dj r9 = r0.A00     // Catch:{ all -> 0x01db }
            r2 = 3
            long r0 = X.C59192wV.A01     // Catch:{ all -> 0x01db }
            X.2p5 r8 = new X.2p5     // Catch:{ all -> 0x01db }
            r8.<init>(r2, r0)     // Catch:{ all -> 0x01db }
            r10 = r6
            r11 = r5
            r12 = r4
            r7.A00(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01db }
            goto L_0x01d9
        L_0x0166:
            java.util.ArrayList r0 = r3.A03     // Catch:{ all -> 0x01db }
            boolean r0 = X.AnonymousClass0x7.A1S(r0)     // Catch:{ all -> 0x01db }
            r5 = r23
            r6 = r25
            if (r0 == 0) goto L_0x01b6
            X.2PO r8 = r3.A02     // Catch:{ all -> 0x01db }
            X.2Tq r0 = r8.A02     // Catch:{ all -> 0x01db }
            X.8qC r0 = r0.A09     // Catch:{ all -> 0x01db }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x01db }
            X.2f8 r7 = (X.C48582f8) r7     // Catch:{ all -> 0x01db }
            X.2lx r0 = r8.A01     // Catch:{ all -> 0x01db }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x01db }
            X.6aY r0 = r0.A00     // Catch:{ all -> 0x01db }
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)     // Catch:{ all -> 0x01db }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01db }
        L_0x018c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x0196
            X.C624134x.A0Z(r2, r1)     // Catch:{ all -> 0x01db }
            goto L_0x018c
        L_0x0196:
            r7.A01(r4, r2)     // Catch:{ all -> 0x01db }
            X.2PN r2 = r8.A00     // Catch:{ all -> 0x01db }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload delivery failure for session: "
            r1.append(r0)     // Catch:{ all -> 0x01db }
            X.2lx r0 = r2.A02     // Catch:{ all -> 0x01db }
            java.lang.String r4 = r0.A01     // Catch:{ all -> 0x01db }
            X.C18270x1.A1G(r1, r4)     // Catch:{ all -> 0x01db }
            X.2oR r2 = r2.A00     // Catch:{ all -> 0x01db }
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01db }
            r2.A02(r0, r5, r4, r1)     // Catch:{ all -> 0x01db }
            goto L_0x01d9
        L_0x01b6:
            X.2PO r0 = r3.A02     // Catch:{ all -> 0x01db }
            X.2PN r4 = r0.A00     // Catch:{ all -> 0x01db }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "XFamilyCrosspostRequestSessionManager/media upload error for session: "
            r1.append(r0)     // Catch:{ all -> 0x01db }
            X.2lx r0 = r4.A02     // Catch:{ all -> 0x01db }
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x01db }
            r1.append(r2)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " with errorCode: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r6)     // Catch:{ all -> 0x01db }
            X.C106245Ye.A00(r0)     // Catch:{ all -> 0x01db }
            X.2oR r1 = r4.A00     // Catch:{ all -> 0x01db }
            r0 = 0
            r1.A03(r5, r2, r6, r0)     // Catch:{ all -> 0x01db }
        L_0x01d9:
            monitor-exit(r3)
            return
        L_0x01db:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46902cO.A00(java.lang.Integer, int, int, long):void");
    }

    public C46902cO(AnonymousClass2PO r2, int i) {
        this.A01 = i;
        this.A02 = r2;
    }
}
