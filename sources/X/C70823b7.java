package X;

import java.util.List;

/* renamed from: X.3b7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70823b7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C107285b3 A01;
    public final /* synthetic */ AnonymousClass3ZF A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        if (X.C627436k.A09(r7, r3.A2o) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011c, code lost:
        if (android.text.TextUtils.isEmpty(r0.A01) != false) goto L_0x011e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r1 = r32
            X.5b3 r3 = r1.A01
            X.3ZF r2 = r1.A02
            java.util.List r6 = r1.A05
            boolean r0 = r1.A06
            r17 = r0
            java.lang.String r0 = r1.A03
            r31 = r0
            java.lang.String r0 = r1.A04
            r29 = r0
            int r0 = r1.A00
            r30 = r0
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            X.39J r5 = r2.A0E
            com.whatsapp.jid.UserJid r11 = r5.A01
            boolean r0 = r11 instanceof X.C27981fH
            X.2sr r7 = r3.A1e
            if (r0 == 0) goto L_0x0033
            X.1fH r9 = r7.A0H()
        L_0x002a:
            if (r9 != 0) goto L_0x0038
            java.lang.String r0 = "voip/actionStartFromCallLog meJid is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0033:
            com.whatsapp.jid.PhoneUserJid r9 = X.C56972sr.A04(r7)
            goto L_0x002a
        L_0x0038:
            boolean r4 = r9 instanceof X.C27981fH
            r0 = 1
            r12 = 0
            r8 = 0
            com.whatsapp.jid.DeviceJid[] r10 = new com.whatsapp.jid.DeviceJid[r0]
            if (r4 == 0) goto L_0x00b0
            X.6kB r0 = r7.A0G()
            r10[r8] = r0
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r7)
            com.whatsapp.voipcalling.CallParticipantJid r0 = new com.whatsapp.voipcalling.CallParticipantJid
            r0.<init>(r9, r12, r10, r4)
        L_0x0050:
            r1.add(r0)
            X.2l8 r0 = r2.A0I
            java.lang.String r13 = "voip/actionStartFromCallLog"
            if (r0 == 0) goto L_0x0060
            int r0 = r6.size()
            if (r0 == 0) goto L_0x006f
        L_0x0060:
            boolean r0 = r11.equals(r9)
            if (r0 != 0) goto L_0x006f
            X.2ad r0 = r3.A2J
            com.whatsapp.voipcalling.CallParticipantJid r0 = r0.A00(r11, r13)
            r1.add(r0)
        L_0x006f:
            com.whatsapp.jid.DeviceJid r10 = r2.A0C
            if (r10 == 0) goto L_0x00ae
            com.whatsapp.jid.UserJid r4 = r10.userJid
        L_0x0075:
            java.util.Iterator r16 = r6.iterator()
        L_0x0079:
            boolean r0 = r16.hasNext()
            r6 = 2
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r15 = r16.next()
            X.3ZE r15 = (X.AnonymousClass3ZE) r15
            com.whatsapp.jid.UserJid r14 = r15.A02
            boolean r0 = r14.equals(r11)
            if (r0 != 0) goto L_0x0079
            boolean r0 = r14.equals(r9)
            if (r0 != 0) goto L_0x0079
            int r0 = r2.A0H
            if (r0 != r6) goto L_0x00a4
            int r6 = r15.A00
            r0 = 5
            if (r6 == r0) goto L_0x00a4
            boolean r0 = r14.equals(r4)
            if (r0 != 0) goto L_0x00a4
            goto L_0x0079
        L_0x00a4:
            X.2ad r0 = r3.A2J
            com.whatsapp.voipcalling.CallParticipantJid r0 = r0.A00(r14, r13)
            r1.add(r0)
            goto L_0x0079
        L_0x00ae:
            r4 = r12
            goto L_0x0075
        L_0x00b0:
            X.6kH r0 = X.C56972sr.A03(r7)
            r10[r8] = r0
            com.whatsapp.voipcalling.CallParticipantJid r0 = new com.whatsapp.voipcalling.CallParticipantJid
            r0.<init>(r9, r10, r12)
            goto L_0x0050
        L_0x00bc:
            X.2s4 r4 = r3.A1f
            boolean r0 = r5.A03
            r4.A08(r0)
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x00d7
            r3.A0I()
            com.whatsapp.voipcalling.camera.VoipCameraManager r9 = r3.A38
            X.5Xv r0 = r3.A1l
            java.lang.String r4 = r0.A04()
            X.49P r0 = r3.A1k
            r9.setRequestedCamera2SupportLevel(r4, r0)
        L_0x00d7:
            r13 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r3.A0p = r0
            r3.A17 = r8
            boolean r4 = X.AnonymousClass000.A1W(r10)
            java.lang.String r0 = "voip/actionStartFromCallLog call log call creator is null"
            X.C626936e.A0D(r4, r0)
            r9 = 70004(0x11174, float:9.8096E-41)
            if (r10 == 0) goto L_0x0164
            int r0 = r2.A0H
            if (r0 != r6) goto L_0x00fe
            X.1VX r0 = r3.A2o
            boolean r0 = X.C627436k.A09(r7, r0)
            r27 = 1
            if (r0 != 0) goto L_0x0100
        L_0x00fe:
            r27 = 0
        L_0x0100:
            int r7 = r5.A00
            if (r17 == 0) goto L_0x015e
            r0 = r31
            r3.A0z = r0
        L_0x0108:
            X.3Ex r0 = r3.A2O
            X.3ZH r0 = r0.A07(r11)
            if (r0 == 0) goto L_0x011e
            X.2k5 r0 = r0.A0F
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r20 = 0
            if (r0 == 0) goto L_0x0120
        L_0x011e:
            r20 = 1
        L_0x0120:
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = new com.whatsapp.voipcalling.CallParticipantJid[r8]
            java.lang.Object[] r6 = r1.toArray(r0)
            com.whatsapp.voipcalling.CallParticipantJid[] r6 = (com.whatsapp.voipcalling.CallParticipantJid[]) r6
            boolean r5 = r2.A0L
            com.whatsapp.jid.GroupJid r4 = r2.A05
            X.2l8 r0 = r2.A0I
            if (r0 == 0) goto L_0x015c
            X.2l8 r0 = r2.A0I
            java.lang.String r1 = r0.A02
        L_0x0134:
            X.2ef r0 = r2.A0J
            if (r0 == 0) goto L_0x013c
            X.2ef r0 = r2.A0J
            java.lang.String r12 = r0.A00
        L_0x013c:
            r18 = r11
            r19 = r10
            r21 = r6
            r22 = r5
            r23 = r4
            r24 = r7
            r25 = r1
            r26 = r12
            r28 = r17
            r17 = r31
            int r0 = com.whatsapp.voipcalling.Voip.joinOngoingCall(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r0 == r9) goto L_0x0164
            r0 = r30
            r3.A0O(r0)
            return
        L_0x015c:
            r1 = r12
            goto L_0x0134
        L_0x015e:
            if (r27 == 0) goto L_0x0161
            r7 = 0
        L_0x0161:
            r3.A0z = r12
            goto L_0x0108
        L_0x0164:
            java.lang.String r0 = "voip/actionStartFromCallLog join ongoing call failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.30y r0 = r3.A21
            r0.A0A(r2, r8)
            X.2sW r0 = r3.A2h
            r0.A06(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70823b7.run():void");
    }

    public /* synthetic */ C70823b7(C107285b3 r1, AnonymousClass3ZF r2, String str, String str2, List list, int i, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A05 = list;
        this.A06 = z;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
    }
}
