package X;

/* renamed from: X.3c5  reason: invalid class name and case insensitive filesystem */
public class C71423c5 implements Runnable {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public C71423c5(C129526aS r2, C29041iB r3, boolean z) {
        this.A04 = 2;
        this.A00 = r3;
        this.A01 = r2;
        this.A02 = z;
        this.A03 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        if (r3.A0s.A01(r8.A03(), r3.A0r.A0E(r3, r4, r8.A04(), 1280)) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0076 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A04
            switch(r0) {
                case 0: goto L_0x02f4;
                case 1: goto L_0x0170;
                case 2: goto L_0x013e;
                case 3: goto L_0x0061;
                case 4: goto L_0x012c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r1.A00
            X.2bB r4 = (X.C46162bB) r4
            java.lang.Object r6 = r1.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            boolean r10 = r1.A02
            boolean r2 = r1.A03
            X.1R1 r0 = r4.A02
            if (r10 == 0) goto L_0x0056
            boolean r3 = r0.A0m(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StatusViewingSettings/mute-user-status returned "
        L_0x0021:
            X.C18260x0.A1E(r0, r1, r3)
            if (r2 == 0) goto L_0x003e
            X.3Gp r2 = r4.A00
            X.2j3 r1 = r2.A0c
            java.lang.String r0 = "userStatusMute"
            X.2sc r0 = r1.A00(r0)
            X.1Oc r0 = (X.C22451Oc) r0
            if (r0 != 0) goto L_0x003f
            java.util.Set r0 = java.util.Collections.emptySet()
        L_0x0039:
            if (r3 == 0) goto L_0x0128
            r2.A0O(r0)
        L_0x003e:
            return
        L_0x003f:
            X.2sH r0 = r0.A00
            long r8 = r0.A0H()
            r0 = 1
            X.C162457s7.A0J(r6, r0)
            r5 = 0
            r11 = 0
            X.1SM r4 = new X.1SM
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r10, r11)
            java.util.Set r0 = X.C65203Gp.A00(r2, r4)
            goto L_0x0039
        L_0x0056:
            boolean r3 = r0.A0l(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StatusViewingSettings/cancel-mute-user-status returned "
            goto L_0x0021
        L_0x0061:
            java.lang.Object r3 = r1.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r3 = (com.whatsapp.mediacomposer.MediaComposerActivity) r3
            boolean r7 = r1.A02
            boolean r6 = r1.A03
            java.lang.Object r5 = r1.A01
            X.5Xq r0 = r3.A1n
            java.util.Collection r0 = r0.A01()
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
        L_0x0076:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r8 = r13.next()
            X.5YF r8 = (X.AnonymousClass5YF) r8
            X.53q r0 = r3.A0o
            byte r2 = r0.A02(r8)
            r1 = 3
            r0 = 1
            if (r2 != r0) goto L_0x008f
            if (r7 != 0) goto L_0x0093
            goto L_0x0076
        L_0x008f:
            if (r2 != r1) goto L_0x0076
            if (r6 == 0) goto L_0x0076
        L_0x0093:
            android.net.Uri r4 = r8.A0G
            if (r2 != r0) goto L_0x00d7
            X.2r1 r10 = r3.A0q
            boolean r11 = r3.A7R()
            android.graphics.Rect r0 = r8.A03()
            r2 = 0
            X.C162457s7.A0J(r4, r2)
            java.lang.String r9 = "ImageQuality/isOriginalQuality"
            if (r0 == 0) goto L_0x00aa
            goto L_0x00ba
        L_0x00aa:
            X.5a0 r1 = r10.A03     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            r0 = 1
            android.graphics.BitmapFactory$Options r0 = r1.A06(r4, r2, r0, r0)     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            int r1 = r0.outHeight     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            int r0 = r0.outWidth     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            int r8 = java.lang.Math.max(r1, r0)     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            goto L_0x00c6
        L_0x00ba:
            int r1 = r0.width()     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            int r0 = r0.height()     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            int r8 = java.lang.Math.max(r1, r0)     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
        L_0x00c6:
            X.1VX r2 = r10.A02     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            r1 = 3068(0xbfc, float:4.299E-42)
            if (r11 == 0) goto L_0x00ce
            r1 = 6031(0x178f, float:8.451E-42)
        L_0x00ce:
            X.2vE r0 = X.C58422vE.A02     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            int r0 = r2.A0O(r0, r1)     // Catch:{ 6yh | IOException | Exception | IllegalStateException | SecurityException -> 0x00fe }
            if (r8 < r0) goto L_0x0102
            goto L_0x00f1
        L_0x00d7:
            if (r2 != r1) goto L_0x0102
            X.7rd r2 = r3.A0r
            r1 = 1280(0x500, float:1.794E-42)
            X.5Qm r0 = r8.A04()
            X.3Z6 r2 = r2.A0E(r3, r4, r0, r1)
            X.2ld r1 = r3.A0s
            android.graphics.Rect r0 = r8.A03()
            boolean r0 = r1.A01(r0, r2)
            if (r0 == 0) goto L_0x0102
        L_0x00f1:
            if (r12 != 0) goto L_0x00f7
            boolean r12 = r5.equals(r4)
        L_0x00f7:
            java.util.HashSet r0 = r3.A1v
            r0.add(r4)
            goto L_0x0076
        L_0x00fe:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)
        L_0x0102:
            java.util.HashSet r1 = r3.A1v
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto L_0x0076
            if (r12 != 0) goto L_0x0110
            boolean r12 = r5.equals(r4)
        L_0x0110:
            r1.remove(r4)
            goto L_0x0076
        L_0x0115:
            if (r12 == 0) goto L_0x003e
            boolean r0 = r3.A1U
            if (r0 == 0) goto L_0x003e
            X.3Wi r2 = r3.A05
            r1 = 42
            X.3cG r0 = new X.3cG
            r0.<init>((com.whatsapp.mediacomposer.MediaComposerActivity) r3, (int) r1)
            r2.A0S(r0)
            return
        L_0x0128:
            r2.A0N(r0)
            return
        L_0x012c:
            java.lang.Object r0 = r1.A00
            X.2HQ r0 = (X.AnonymousClass2HQ) r0
            java.lang.Object r3 = r1.A01
            X.2z0 r3 = (X.AnonymousClass2z0) r3
            boolean r2 = r1.A02
            boolean r1 = r1.A03
            X.33b r0 = r0.A00
            r0.A0C(r3, r2, r1)
            return
        L_0x013e:
            java.lang.Object r3 = r1.A00
            X.1iB r3 = (X.C29041iB) r3
            java.lang.Object r2 = r1.A01
            X.6aS r2 = (X.C129526aS) r2
            boolean r1 = r1.A02
            X.2s7 r0 = r3.A0K
            r0.A06(r2, r1)
            java.util.Set r0 = r3.A0R
            r0.removeAll(r2)
            X.2sr r0 = r3.A0A
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x016c
            X.5rC r1 = r3.A05
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x016c
            r1.A04()
            java.lang.String r0 = "logoutAgentDeviceJids"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x016c:
            r3.A0F(r2)
            return
        L_0x0170:
            java.lang.Object r7 = r1.A00
            X.33m r7 = (X.C621033m) r7
            java.lang.Object r8 = r1.A01
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r3 = r1.A02
            boolean r6 = r1.A03
            X.3Gp r2 = r7.A0L
            X.2j3 r1 = r2.A0c
            java.lang.String r0 = "deleteMessageForMe"
            X.2sc r1 = r1.A00(r0)
            X.1Od r1 = (X.C22461Od) r1
            if (r1 != 0) goto L_0x01f7
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x018e:
            X.3Lv r4 = r7.A0l
            if (r6 == 0) goto L_0x025f
            X.4uZ r15 = X.C627636p.A04(r8)
            if (r15 == 0) goto L_0x02f0
            X.2qv r14 = r4.A0e
            X.2sm r0 = r14.A00
            long r0 = r0.A07(r15)
            X.2Ty r7 = r14.A01(r0)
            java.lang.String r11 = "action_singular_delete"
            if (r7 == 0) goto L_0x01f5
            java.util.List r6 = r7.A09
            if (r6 == 0) goto L_0x01b5
            X.3Gt r1 = new X.3Gt
            r1.<init>(r4)
            r0 = 1
            r4.A0o(r7, r1, r0)
        L_0x01b5:
            X.2ZW r9 = r4.A0Z
            int r0 = r15.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.1uL r0 = r9.A02
            X.0Xb r0 = X.C72333dY.A01(r0)
            r0.A0A(r1)
            X.2ss r1 = r4.A0X
            X.4uZ r0 = r7.A07
            boolean r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x01e8
            java.lang.String r11 = "action_delete"
        L_0x01d4:
            boolean r7 = r7.A0C
        L_0x01d6:
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r1 = r8.iterator()
        L_0x01de:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0264
            X.C624134x.A0Z(r6, r1)
            goto L_0x01de
        L_0x01e8:
            if (r6 == 0) goto L_0x01f2
            long r0 = r7.A04
            r9 = -9223372036854775808
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x01d4
        L_0x01f2:
            java.lang.String r11 = "action_clear"
            goto L_0x01d4
        L_0x01f5:
            r7 = 0
            goto L_0x01d6
        L_0x01f7:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0255
            X.2sH r0 = r1.A00
            long r18 = r0.A0H()
            java.util.ArrayList r5 = X.C18300x5.A0u(r8)
            java.util.Iterator r12 = r8.iterator()
        L_0x020b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0259
            X.34x r11 = X.C18300x5.A0T(r12)
            X.2z0 r4 = r11.A1J
            X.4uZ r1 = r4.A00
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 != 0) goto L_0x0250
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x0250
            r15 = 0
        L_0x0224:
            boolean r0 = r4.A02
            r9 = 0
            if (r0 == 0) goto L_0x024d
            int r0 = r11.A0D
            if (r0 != 0) goto L_0x0246
            r0 = 0
        L_0x0230:
            X.2z0 r16 = X.C627636p.A0B(r11)
            r14 = 0
            r23 = 0
            X.1SZ r13 = new X.1SZ
            r17 = r14
            r20 = r0
            r22 = r3
            r13.<init>(r14, r15, r16, r17, r18, r20, r22, r23)
            r5.add(r13)
            goto L_0x020b
        L_0x0246:
            long r0 = r11.A0J
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x024d
            goto L_0x0230
        L_0x024d:
            long r0 = r11.A0K
            goto L_0x0230
        L_0x0250:
            X.4uZ r15 = r11.A0n()
            goto L_0x0224
        L_0x0255:
            java.util.List r5 = java.util.Collections.emptyList()
        L_0x0259:
            java.util.Set r5 = r2.A0B(r5)
            goto L_0x018e
        L_0x025f:
            r4.A0l(r8, r3)
            goto L_0x02f0
        L_0x0264:
            r9 = 1
            r0 = r3 & 1
            boolean r20 = X.AnonymousClass000.A1U(r0, r9)
            r0 = -9223372036854775808
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            r17 = r6
            r18 = r9
            r19 = r7
            X.2Ty r1 = r14.A03(r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x02bc
            X.2ZW r10 = r4.A0Z
            int r0 = r15.hashCode()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            r14 = 4000(0xfa0, float:5.605E-42)
            java.lang.Class<com.whatsapp.data.ConversationDeleteWorker> r0 = com.whatsapp.data.ConversationDeleteWorker.class
            X.0Aw r6 = new X.0Aw
            r6.<init>(r0)
            X.0Q9 r13 = new X.0Q9
            r13.<init>()
            java.lang.String r0 = "delete_action"
            java.util.Map r12 = r13.A00
            r12.put(r0, r11)
            java.lang.String r3 = "job_id"
            long r0 = r1.A06
            X.AnonymousClass0x2.A1K(r3, r12, r0)
            X.C18320x8.A1A(r13, r6)
            long r0 = (long) r14
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.A02(r0, r3)
            r6.A06(r7)
            X.0NS r1 = r6.A00()
            X.1uL r0 = r10.A02
            X.0Xb r0 = X.C72333dY.A01(r0)
            r0.A08(r1)
        L_0x02bc:
            X.2ss r0 = r4.A0X
            X.31A r11 = X.C56982ss.A00(r0, r15)
            if (r11 == 0) goto L_0x02dd
            java.util.Iterator r10 = r8.iterator()
        L_0x02c8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02dd
            X.34x r0 = X.C18300x5.A0T(r10)
            long r6 = r11.A0N
            long r0 = r0.A1L
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x02c8
            r4.A0N(r15)
        L_0x02dd:
            X.2hU r0 = r4.A0q
            android.os.Handler r1 = r0.A01
            r14 = 17
            X.3cR r0 = new X.3cR
            r10 = r0
            r11 = r4
            r12 = r8
            r13 = r15
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r1.post(r0)
        L_0x02f0:
            r2.A0O(r5)
            return
        L_0x02f4:
            java.lang.Object r4 = r1.A00
            X.5Ul r4 = (X.AnonymousClass5Ul) r4
            java.lang.Object r5 = r1.A01
            X.30M r5 = (X.AnonymousClass30M) r5
            boolean r3 = r1.A02
            boolean r13 = r1.A03
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.A02
            java.util.Iterator r2 = X.AnonymousClass0x7.A0x(r0)
            r9 = 0
        L_0x0307:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0327
            X.34x r1 = X.C18300x5.A0T(r2)
            X.2oz r0 = r4.A0C
            r0.A02(r1)
            if (r9 != 0) goto L_0x0307
            X.30w r0 = r1.A0y()
            if (r0 == 0) goto L_0x0307
            X.30w r0 = r1.A0y()
            byte[] r9 = r0.A09()
            goto L_0x0307
        L_0x0327:
            X.2re r6 = r4.A0F
            boolean r1 = r5.A05()
            boolean r0 = r5.A04()
            X.7iO r8 = new X.7iO
            r8.<init>(r3, r1, r0)
            r7 = 0
            java.util.concurrent.Executor r2 = r6.A0V
            r1 = 24
            X.3by r0 = new X.3by
            r0.<init>(r6, r1, r5)
            r2.execute(r0)
            r10 = 0
            X.3bV r4 = new X.3bV
            r12 = r10
            r11 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.3dH r0 = r6.A0S
            if (r0 == 0) goto L_0x0353
            r0.execute(r4)
            return
        L_0x0353:
            X.4FS r0 = r6.A0R
            r0.BkM(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71423c5.run():void");
    }

    public C71423c5(Object obj, Object obj2, int i, boolean z, boolean z2) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = z;
        this.A03 = z2;
    }
}
