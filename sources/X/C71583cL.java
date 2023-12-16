package X;

/* renamed from: X.3cL  reason: invalid class name and case insensitive filesystem */
public class C71583cL implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C71583cL(AnonymousClass2QO r2, C54712pA r3, int i, int i2, int i3) {
        this.A04 = i3;
        switch (i3) {
            case 10:
            case 11:
                this.A02 = r3;
                this.A00 = i;
                break;
            default:
                this.A02 = r3;
                this.A00 = 897463359;
                break;
        }
        this.A01 = i2;
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        if ((r8 * 1000) >= r5.A0H()) goto L_0x016d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.A04
            switch(r0) {
                case 0: goto L_0x038e;
                case 1: goto L_0x00a3;
                case 2: goto L_0x017b;
                case 3: goto L_0x0191;
                case 4: goto L_0x01a2;
                case 5: goto L_0x01b3;
                case 6: goto L_0x01c5;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x01fb;
                case 10: goto L_0x023d;
                case 11: goto L_0x0249;
                case 12: goto L_0x0255;
                case 13: goto L_0x0274;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r8 = r5.A02
            X.1gL r8 = (X.AnonymousClass1gL) r8
            int r6 = r5.A00
            java.lang.Object r4 = r5.A03
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            int r2 = r5.A01
            X.2ov r7 = X.AnonymousClass36G.A02(r4)
            X.30x r0 = r8.A05
            X.3fe r10 = X.C614730x.A00(r7, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "axolotl checking sessions for "
            r1.append(r0)     // Catch:{ all -> 0x0097 }
            r1.append(r7)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = " due to retry receipt for "
            X.C18260x0.A1R(r1, r0, r4)     // Catch:{ all -> 0x0097 }
            X.33n r5 = r8.A03     // Catch:{ all -> 0x0097 }
            boolean r0 = r5.A0Z(r7)     // Catch:{ all -> 0x0097 }
            r9 = 0
            if (r0 == 0) goto L_0x0087
            X.2wr r0 = r5.A0A(r7)     // Catch:{ all -> 0x0097 }
            X.2uv r0 = r0.A01     // Catch:{ all -> 0x0097 }
            X.1E1 r3 = r0.A00     // Catch:{ all -> 0x0097 }
            int r0 = r3.remoteRegistrationId_     // Catch:{ all -> 0x0097 }
            if (r0 == r2) goto L_0x005b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "axolotl deleting session due to registration id change for "
            r1.append(r0)     // Catch:{ all -> 0x0097 }
            r1.append(r4)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = " stop retrying"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0097 }
            r5.A0B(r7)     // Catch:{ all -> 0x0097 }
            r5.A0O(r7)     // Catch:{ all -> 0x0097 }
            goto L_0x0091
        L_0x005b:
            r2 = 2
            if (r6 < r2) goto L_0x0087
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "axolotl requiring new session before resending for "
            X.C18260x0.A1R(r1, r0, r4)     // Catch:{ all -> 0x0097 }
            X.8Lq r0 = r3.aliceBaseKey_     // Catch:{ all -> 0x0097 }
            byte[] r9 = r0.A07()     // Catch:{ all -> 0x0097 }
            if (r6 <= r2) goto L_0x007d
            com.whatsapp.jid.UserJid r0 = r4.userJid     // Catch:{ all -> 0x0097 }
            boolean r0 = r5.A0a(r7, r0)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "axolotl will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0097 }
            goto L_0x0091
        L_0x007d:
            java.lang.String r0 = "axolotl will record the base key used to send "
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0097 }
            com.whatsapp.jid.UserJid r0 = r4.userJid     // Catch:{ all -> 0x0097 }
            r5.A0P(r7, r0, r9)     // Catch:{ all -> 0x0097 }
        L_0x0087:
            X.2gy r1 = r8.A02     // Catch:{ all -> 0x0097 }
            com.whatsapp.jobqueue.job.SendLiveLocationKeyJob r0 = new com.whatsapp.jobqueue.job.SendLiveLocationKeyJob     // Catch:{ all -> 0x0097 }
            r0.<init>(r4, r9, r6)     // Catch:{ all -> 0x0097 }
            r1.A02(r0)     // Catch:{ all -> 0x0097 }
        L_0x0091:
            if (r10 == 0) goto L_0x03ba
            r10.close()
            return
        L_0x0097:
            r1 = move-exception
            if (r10 == 0) goto L_0x00a2
            r10.close()     // Catch:{ all -> 0x009e }
            throw r1
        L_0x009e:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00a2:
            throw r1
        L_0x00a3:
            java.lang.Object r2 = r5.A02
            X.30g r2 = (X.C613330g) r2
            java.lang.Object r3 = r5.A03
            X.4uZ r3 = (X.C95814uZ) r3
            int r8 = r5.A00
            int r1 = r5.A01
            boolean r0 = r3 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0175
            X.2s0 r11 = r2.A06
            X.4uY r3 = (X.C95804uY) r3
            r14 = 0
            X.2aH r4 = r11.A0H
            X.5Mf r13 = r11.A0E
            X.3P7 r10 = new X.3P7
            r12 = r11
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            long r1 = r11.A00
            X.2sH r5 = r11.A07
            long r6 = r5.A0H()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x03ba
            boolean r0 = r4.A00(r3, r8)
            if (r0 == 0) goto L_0x03ba
            r7 = 1
            if (r7 == r8) goto L_0x00d9
            r7 = 0
        L_0x00d9:
            X.2b2 r6 = r11.A0D
            X.2T0 r4 = r6.A00(r3, r7)
            if (r4 == 0) goto L_0x03ba
            X.4uZ r0 = r4.A03
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = r4.A04
            if (r0 == 0) goto L_0x016d
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "oe"
            java.lang.String r1 = r1.getQueryParameter(r0)
            if (r1 == 0) goto L_0x010f
            r0 = 16
            long r8 = java.lang.Long.parseLong(r1, r0)     // Catch:{ NumberFormatException -> 0x010f }
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x010f
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            long r1 = r5.A0H()
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x016d
        L_0x010f:
            java.lang.String r0 = "ProfilePhotoManager/loadNewsletterProfilePicture loading pic with expired url/requesting new url"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3RD r5 = new X.3RD
            r5.<init>(r10, r11, r7)
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.5UP r1 = r6.A02
            boolean r0 = X.C18300x5.A1S(r1)
            if (r0 == 0) goto L_0x03ba
            X.2ss r0 = r6.A01
            boolean r0 = X.C106855aH.A04(r0, r3, r1)
            if (r0 == 0) goto L_0x03ba
            X.2LW r1 = r6.A03
            X.5UP r0 = r1.A01
            boolean r0 = X.C18300x5.A1S(r0)
            if (r0 == 0) goto L_0x03ba
            X.1VX r4 = r1.A00
            r0 = 3604(0xe14, float:5.05E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r2, r0)
            if (r0 == 0) goto L_0x03ba
            r1 = 1
            r9 = 0
            int r1 = r1 << r9
            r0 = 3605(0xe15, float:5.052E-42)
            int r0 = r4.A0O(r2, r0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x03ba
            X.2gy r1 = r6.A00
            r7 = 1
            X.7hZ r6 = new X.7hZ
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r8 = r7
            r10 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1h0 r0 = new X.1h0
            r0.<init>(r3, r5, r6)
            r1.A02(r0)
            return
        L_0x016d:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r10.BYy(r4, r0)
            return
        L_0x0175:
            X.2s0 r0 = r2.A06
            r0.A01(r3, r1, r8)
            return
        L_0x017b:
            java.lang.Object r1 = r5.A02
            X.1QC r1 = (X.AnonymousClass1QC) r1
            java.lang.Object r3 = r5.A03
            X.34x r3 = (X.C624134x) r3
            int r0 = r5.A00
            int r2 = r5.A01
            X.2Yd r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00(r3, r0, r2)
            return
        L_0x0191:
            java.lang.Object r3 = r5.A02
            X.3Mj r3 = (X.C66683Mj) r3
            int r2 = r5.A00
            java.lang.Object r1 = r5.A03
            int r0 = r5.A01
            r3.A00()
            r3.A01(r1, r2, r0)
            return
        L_0x01a2:
            java.lang.Object r3 = r5.A02
            X.3Mk r3 = (X.C66693Mk) r3
            int r2 = r5.A00
            int r1 = r5.A01
            java.lang.Object r0 = r5.A03
            r3.A00(r2)
            r3.A01(r0, r1, r2)
            return
        L_0x01b3:
            java.lang.Object r3 = r5.A02
            X.3Mk r3 = (X.C66693Mk) r3
            int r2 = r5.A01
            java.lang.Object r1 = r5.A03
            r0 = 2
            r3.A00(r0)
            X.2wU r0 = r3.A01
            r0.A00(r2, r1)
            return
        L_0x01c5:
            java.lang.Object r7 = r5.A02
            X.3Mn r7 = (X.C66723Mn) r7
            int r6 = r5.A00
            java.lang.Object r4 = r5.A03
            byte[] r4 = (byte[]) r4
            int r3 = r5.A01
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x03ba
            boolean r0 = r7.A0S
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r7.A0Q
            if (r0 != 0) goto L_0x01ec
            X.2rP r2 = r7.A0H
            java.util.ArrayList r1 = X.C57302tQ.A00()
            r0 = 0
            r2.A06(r0, r1)
            r0 = 1
            r7.A0Q = r0
        L_0x01ec:
            X.2qN r0 = r7.A04
            r0.A04(r4, r6, r3)
            X.2qN r1 = r7.A04
            r0 = 0
            r1.A03(r0)
            r7.A01()
            return
        L_0x01fb:
            java.lang.Object r7 = r5.A02
            X.1gL r7 = (X.AnonymousClass1gL) r7
            java.lang.Object r6 = r5.A03
            X.39T r6 = (X.AnonymousClass39T) r6
            int r2 = r5.A00
            int r4 = r5.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "need to send retry receipt; stanzaKey="
            X.C18260x0.A1R(r1, r0, r6)
            byte[] r3 = X.AnonymousClass36A.A01(r2)
            r0 = 1
            if (r4 <= r0) goto L_0x021d
            X.1i9 r0 = r7.A01
            r0.A0B()
        L_0x021d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "axolotl sending retry receipt; stanzaKey="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; localRegistrationId="
            X.C18260x0.A0y(r0, r1, r2)
            X.33o r2 = r7.A06
            com.whatsapp.jid.UserJid r1 = r6.A00()
            X.C626936e.A06(r1)
            int r0 = r4 + 1
            r2.A0U(r1, r3, r0)
            return
        L_0x023d:
            java.lang.Object r6 = r5.A02
            X.2pA r6 = (X.C54712pA) r6
            int r8 = r5.A00
            int r9 = r5.A01
            java.lang.Object r3 = r5.A03
            r7 = 0
            goto L_0x0261
        L_0x0249:
            java.lang.Object r6 = r5.A02
            X.2pA r6 = (X.C54712pA) r6
            int r8 = r5.A00
            int r9 = r5.A01
            java.lang.Object r3 = r5.A03
            r7 = 1
            goto L_0x0261
        L_0x0255:
            java.lang.Object r6 = r5.A02
            X.2pA r6 = (X.C54712pA) r6
            int r9 = r5.A01
            java.lang.Object r3 = r5.A03
            r8 = 897463359(0x357e343f, float:9.46984E-7)
            r7 = 2
        L_0x0261:
            long r10 = java.lang.System.currentTimeMillis()
            X.2ST r2 = r6.A02
            X.2Rf r5 = new X.2Rf
            r5.<init>(r6, r7, r8, r9, r10)
            X.4FS r1 = r2.A00
            r0 = 36
            X.C70353aM.A00(r1, r2, r3, r5, r0)
            return
        L_0x0274:
            java.lang.Object r8 = r5.A02
            X.5mK r8 = (X.C113995mK) r8
            int r3 = r5.A00
            int r7 = r5.A01
            java.lang.Object r6 = r5.A03
            X.34x r6 = (X.C624134x) r6
            r5 = 3
            X.1Za r2 = new X.1Za
            r2.<init>()
            X.5Kz r0 = r8.A00
            if (r0 == 0) goto L_0x02f8
            long r0 = r0.A05
        L_0x028c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A03 = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r2.A02 = r4
            X.2z0 r10 = r6.A1J
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x02f3
            X.1fY r1 = X.AnonymousClass1fY.A00
        L_0x02a6:
            if (r1 == 0) goto L_0x02c4
            X.3Ex r0 = r8.A03
            X.3ZH r1 = r0.A07(r1)
            if (r1 == 0) goto L_0x02c4
            boolean r0 = r1.A0R()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            boolean r0 = r1.A0Q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
        L_0x02c4:
            X.4FV r0 = r8.A08
            r0.BhB(r2)
            X.5R3 r0 = r8.A01
            if (r0 == 0) goto L_0x03ba
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            java.util.Map r0 = r0.A0D
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L_0x02fb
            java.util.Iterator r1 = r0.iterator()
        L_0x02dd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r0 = r1.next()
            X.5Ky r0 = (X.C102965Ky) r0
            java.util.Map r0 = r0.A08
            java.util.Collection r0 = r0.values()
            r2.addAll(r0)
            goto L_0x02dd
        L_0x02f3:
            com.whatsapp.jid.UserJid r1 = r6.A0o()
            goto L_0x02a6
        L_0x02f8:
            r0 = 0
            goto L_0x028c
        L_0x02fb:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r2.iterator()
        L_0x0303:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0318
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.2w8 r0 = (X.C58982w8) r0
            java.lang.String r1 = r0.A0M
            java.lang.String r0 = r10.A01
            X.C18280x3.A17(r1, r0, r2, r9)
            goto L_0x0303
        L_0x0318:
            java.util.Iterator r12 = r9.iterator()
        L_0x031c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x03ba
            java.lang.Object r9 = r12.next()
            X.2w8 r9 = (X.C58982w8) r9
            long r0 = r9.A09
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
            boolean r0 = r9.A0K
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r0)
            java.lang.String r10 = r9.A0M
            com.whatsapp.jid.UserJid r14 = r9.A0L
            java.lang.Integer r0 = r9.A0E
            if (r0 == 0) goto L_0x038b
            int r1 = r0.intValue()
            r0 = 4
            if (r1 == r0) goto L_0x0345
            if (r1 != r5) goto L_0x038b
        L_0x0345:
            long r2 = r9.A08
            long r0 = r9.A06
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass001.A1U(r11)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
        L_0x0353:
            int r0 = r9.A02
            int r0 = X.C58982w8.A00(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r1 = 15
            X.7Yv r13 = r8.A0D
            r2 = 1
            boolean r0 = r13.A02(r6)
            if (r1 != r7) goto L_0x037c
            if (r0 == 0) goto L_0x031c
            r19 = r10
            X.6iM r1 = r13.A01(r14, r15, r16, r17, r18, r19)
            java.lang.Integer r0 = X.C18280x3.A0S()
        L_0x0374:
            r1.A06 = r0
            X.4FV r0 = r13.A01
            X.C18280x3.A0t(r1, r0, r2)
            goto L_0x031c
        L_0x037c:
            if (r0 == 0) goto L_0x031c
            r19 = r10
            X.6iM r1 = r13.A01(r14, r15, r16, r17, r18, r19)
            r1.A04 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0374
        L_0x038b:
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            goto L_0x0353
        L_0x038e:
            int r0 = r5.A00
            int r4 = r5.A01
            java.lang.Object r3 = r5.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r5.A03
            X.3XG r2 = (X.AnonymousClass3XG) r2
            X.1Zg r1 = new X.1Zg
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.A03 = r0
            r1.A02 = r3
            java.lang.String r0 = r2.A00
            r1.A05 = r0
            java.lang.String r0 = r2.A05
            r1.A04 = r0
            X.4FV r0 = r2.A03
            r0.BhD(r1)
        L_0x03ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71583cL.run():void");
    }

    public C71583cL(C66693Mk r2, Object obj, int i, int i2, int i3) {
        this.A04 = i3;
        if (4 - i3 != 0) {
            this.A02 = r2;
            this.A00 = 2;
        } else {
            this.A02 = r2;
            this.A00 = i;
        }
        this.A01 = i2;
        this.A03 = obj;
    }

    public C71583cL(Object obj, int i, Object obj2, int i2, int i3) {
        this.A04 = i3;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = obj;
        this.A03 = obj2;
    }
}
