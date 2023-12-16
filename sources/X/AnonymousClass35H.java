package X;

/* renamed from: X.35H  reason: invalid class name */
public final class AnonymousClass35H {
    public static final AnonymousClass35H A00 = new AnonymousClass35H();

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3ZF A03(X.AnonymousClass1E6 r38) {
        /*
            r37 = this;
            r2 = 0
            r8 = r38
            X.C162457s7.A0J(r8, r2)
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r8.callCreatorJid_
            com.whatsapp.jid.UserJid r10 = r1.A0E(r0)
            r13 = 0
            if (r10 == 0) goto L_0x0130
            boolean r0 = r8.isIncoming_
            r5 = r0 ^ 1
            java.lang.String r0 = r8.callId_
            java.lang.String r3 = X.C627436k.A08(r0)
            if (r3 == 0) goto L_0x0130
            boolean r0 = r8.isCallLink_
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = r8.callLinkToken_
            if (r4 == 0) goto L_0x0032
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0032
            r0 = -1
            X.2l8 r13 = new X.2l8
            r13.<init>(r10, r4, r0)
        L_0x0032:
            r6 = r10
            X.8ya r0 = r8.participants_
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00a4
            r0 = r10
        L_0x003c:
            r6 = r0
        L_0x003d:
            r0 = -1
            X.39J r4 = new X.39J
            r4.<init>(r0, r6, r3, r5)
            long r0 = r8.startTime_
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r5
            boolean r9 = r8.isVideo_
            long r6 = r8.duration_
            int r5 = (int) r6
            int r3 = r8.callResult_
            X.23N r3 = X.AnonymousClass23N.A00(r3)
            if (r3 != 0) goto L_0x0057
            X.23N r3 = X.AnonymousClass23N.Connected
        L_0x0057:
            X.C162457s7.A0D(r3)
            int r24 = A00(r3)
            boolean r3 = r8.isDndMode_
            if (r3 == 0) goto L_0x00a1
            X.22I r18 = X.AnonymousClass22I.A04
        L_0x0064:
            X.32V r6 = com.whatsapp.jid.GroupJid.Companion
            java.lang.String r3 = r8.groupJid_
            com.whatsapp.jid.GroupJid r15 = r6.A03(r3)
            X.8ya r6 = r8.participants_
            java.util.ArrayList r3 = X.C18300x5.A0t(r6)
            java.util.Iterator r12 = r6.iterator()
        L_0x0076:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r11 = r12.next()
            X.1Bc r11 = (X.C21251Bc) r11
            X.32Y r7 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r6 = r11.userJid_
            com.whatsapp.jid.UserJid r7 = r7.A0E(r6)
            if (r7 == 0) goto L_0x0076
            int r6 = r11.callResult_
            X.23N r6 = X.AnonymousClass23N.A00(r6)
            if (r6 != 0) goto L_0x0096
            X.23N r6 = X.AnonymousClass23N.Connected
        L_0x0096:
            X.C162457s7.A0D(r6)
            int r6 = A00(r6)
            X.AnonymousClass3ZE.A00(r7, r3, r6)
            goto L_0x0076
        L_0x00a1:
            X.22I r18 = X.AnonymousClass22I.NONE
            goto L_0x0064
        L_0x00a4:
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            X.8ya r0 = r8.participants_
            java.lang.Object r0 = r0.get(r2)
            X.1Bc r0 = (X.C21251Bc) r0
            java.lang.String r0 = r0.userJid_
            com.whatsapp.jid.UserJid r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x003c
            goto L_0x003d
        L_0x00b7:
            X.32r r6 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r14 = r6.A01(r10, r2)
            r16 = 0
            int r7 = r8.silenceReason_
            if (r7 == 0) goto L_0x012d
            r6 = 1
            if (r7 == r6) goto L_0x012a
            r6 = 2
            if (r7 == r6) goto L_0x0127
            r6 = 3
            if (r7 != r6) goto L_0x012d
            X.230 r6 = X.AnonymousClass230.Lightweight
        L_0x00ce:
            X.C162457s7.A0D(r6)
            int r7 = r6.ordinal()
            r25 = 0
            if (r7 == r2) goto L_0x00e3
            r6 = 1
            if (r7 == r6) goto L_0x0124
            r6 = 2
            r25 = 2
            if (r7 == r6) goto L_0x00e3
            r25 = 3
        L_0x00e3:
            int r7 = r8.callType_
            if (r7 == 0) goto L_0x0121
            r6 = 1
            if (r7 == r6) goto L_0x011e
            r6 = 2
            if (r7 != r6) goto L_0x0121
            X.22r r6 = X.C374522r.VOICE_CHAT
        L_0x00ef:
            int r7 = r6.ordinal()
            r26 = 0
            if (r7 == r2) goto L_0x00fe
            r6 = 1
            r26 = 1
            if (r7 == r6) goto L_0x00fe
            r26 = 2
        L_0x00fe:
            r27 = -1
            r31 = 0
            X.3ZF r12 = new X.3ZF
            r20 = r16
            r21 = r16
            r35 = r2
            r36 = r2
            r19 = r16
            r23 = r5
            r29 = r0
            r33 = r9
            r34 = r2
            r22 = r3
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r34, r35, r36)
            return r12
        L_0x011e:
            X.22r r6 = X.C374522r.SCHEDULED_CALL
            goto L_0x00ef
        L_0x0121:
            X.22r r6 = X.C374522r.REGULAR
            goto L_0x00ef
        L_0x0124:
            r25 = 1
            goto L_0x00e3
        L_0x0127:
            X.230 r6 = X.AnonymousClass230.Privacy
            goto L_0x00ce
        L_0x012a:
            X.230 r6 = X.AnonymousClass230.Scheduled
            goto L_0x00ce
        L_0x012d:
            X.230 r6 = X.AnonymousClass230.None
            goto L_0x00ce
        L_0x0130:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35H.A03(X.1E6):X.3ZF");
    }

    public static final int A00(AnonymousClass23N r1) {
        switch (r1.ordinal()) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
                return 6;
            case 4:
                return 2;
            case 6:
                return 3;
            default:
                return 0;
        }
    }

    public static final AnonymousClass23N A01(int i) {
        switch (i) {
            case 1:
                return AnonymousClass23N.Cancelled;
            case 2:
                return AnonymousClass23N.Missed;
            case 3:
                return AnonymousClass23N.Unavailable;
            case 4:
                return AnonymousClass23N.Rejected;
            case 5:
                return AnonymousClass23N.Connected;
            case 6:
                return AnonymousClass23N.AcceptedElsewhere;
            default:
                return AnonymousClass23N.Invalid;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass1E6 A02(X.C56972sr r9, X.AnonymousClass3ZF r10) {
        /*
            boolean r4 = X.C18270x1.A1U(r10, r9)
            X.1E6 r0 = X.AnonymousClass1E6.DEFAULT_INSTANCE
            X.6c9 r3 = r0.A0G()
            int r0 = r10.A00
            X.23N r0 = A01(r0)
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            X.22I r1 = r10.A07()
            X.22I r0 = X.AnonymousClass22I.A04
            boolean r2 = X.AnonymousClass000.A1Y(r1, r0)
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.isDndMode_ = r2
            r10.A0A()
            int r1 = r10.A02
            if (r1 == 0) goto L_0x0278
            if (r1 == r4) goto L_0x0274
            r0 = 2
            if (r1 == r0) goto L_0x0270
            r0 = 3
            if (r1 != r0) goto L_0x0278
            X.230 r0 = X.AnonymousClass230.Lightweight
        L_0x0049:
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            int r0 = r0.value
            r1.silenceReason_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            int r0 = r10.A01
            long r1 = (long) r0
            X.6cX r5 = X.C18320x8.A0C(r3)
            X.1E6 r5 = (X.AnonymousClass1E6) r5
            int r0 = r5.bitField0_
            r0 = r0 | 8
            r5.bitField0_ = r0
            r5.duration_ = r1
            long r0 = r10.A0B
            long r1 = X.C18290x4.A0B(r0)
            X.6cX r5 = X.C18320x8.A0C(r3)
            X.1E6 r5 = (X.AnonymousClass1E6) r5
            int r0 = r5.bitField0_
            r0 = r0 | 16
            r5.bitField0_ = r0
            r5.startTime_ = r1
            X.39J r6 = r10.A0E
            boolean r0 = r6.A03
            r2 = r0 ^ 1
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            r1.isIncoming_ = r2
            boolean r2 = r10.A0L
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r1.isVideo_ = r2
            java.lang.String r0 = r6.A02
            java.lang.String r2 = X.C627436k.A07(r0)
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.bitField0_ = r0
            r1.callId_ = r2
            com.whatsapp.jid.DeviceJid r0 = r10.A0C
            if (r0 == 0) goto L_0x00d2
            com.whatsapp.jid.UserJid r0 = r0.userJid
            java.lang.String r2 = X.C18300x5.A0g(r3, r0)
            X.6cX r1 = r3.A00
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField0_ = r0
            r1.callCreatorJid_ = r2
        L_0x00d2:
            com.whatsapp.jid.GroupJid r0 = r10.A05
            if (r0 == 0) goto L_0x00e9
            java.lang.String r2 = X.C18300x5.A0g(r3, r0)
            X.6cX r1 = r3.A00
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.bitField0_ = r0
            r1.groupJid_ = r2
        L_0x00e9:
            java.util.List r0 = r10.A08()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0190
            X.1Bc r0 = X.C21251Bc.DEFAULT_INSTANCE
            X.6c9 r5 = r0.A0G()
            com.whatsapp.jid.UserJid r0 = r6.A01
            java.lang.String r2 = X.C18300x5.A0g(r5, r0)
            X.6cX r1 = r5.A00
            X.1Bc r1 = (X.C21251Bc) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.userJid_ = r2
            int r0 = r10.A00
            X.23N r0 = A01(r0)
            X.6cX r1 = X.C18320x8.A0C(r5)
            X.1Bc r1 = (X.C21251Bc) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.6cX r5 = r5.A06()
            X.6cX r2 = X.C18320x8.A0C(r3)
            X.1E6 r2 = (X.AnonymousClass1E6) r2
            r5.getClass()
            X.8ya r1 = r2.participants_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0140
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.participants_ = r1
        L_0x0140:
            r1.add(r5)
        L_0x0143:
            X.2l8 r2 = r10.A0I
            if (r2 == 0) goto L_0x0168
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
            r1.isCallLink_ = r4
            java.lang.String r2 = r2.A02
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.bitField0_ = r0
            r1.callLinkToken_ = r2
        L_0x0168:
            int r1 = r10.A0H
            if (r1 == 0) goto L_0x018d
            if (r1 == r4) goto L_0x018a
            r0 = 2
            if (r1 != r0) goto L_0x018d
            X.22r r0 = X.C374522r.VOICE_CHAT
        L_0x0173:
            X.6cX r1 = X.C18320x8.A0C(r3)
            X.1E6 r1 = (X.AnonymousClass1E6) r1
            int r0 = r0.value
            r1.callType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.bitField0_ = r0
            X.6cX r0 = r3.A06()
            X.1E6 r0 = (X.AnonymousClass1E6) r0
            return r0
        L_0x018a:
            X.22r r0 = X.C374522r.SCHEDULED_CALL
            goto L_0x0173
        L_0x018d:
            X.22r r0 = X.C374522r.REGULAR
            goto L_0x0173
        L_0x0190:
            java.util.List r8 = r10.A08()
            com.whatsapp.jid.UserJid r7 = r6.A01
            X.C162457s7.A0C(r7)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r8.iterator()
        L_0x01a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            com.whatsapp.jid.UserJid r0 = r0.A02
            X.C18280x3.A17(r0, r7, r1, r6)
            goto L_0x01a1
        L_0x01b4:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = "CallLogSyncMutation/getSortedParticipants peer jid not found in the participant list"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01bf:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r8.iterator()
        L_0x01c7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01da
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            com.whatsapp.jid.UserJid r0 = r0.A02
            X.C18280x3.A18(r0, r7, r1, r5)
            goto L_0x01c7
        L_0x01da:
            java.util.List r0 = X.C73723fy.A0K(r5, r6)
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r0.iterator()
        L_0x01e6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x020d
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.3ZE r0 = (X.AnonymousClass3ZE) r0
            com.whatsapp.jid.UserJid r1 = r0.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r9)
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x01e6
            X.1fH r0 = r9.A0H()
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x01e6
            r6.add(r2)
            goto L_0x01e6
        L_0x020d:
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r8 = r6.iterator()
        L_0x0215:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r7 = r8.next()
            X.3ZE r7 = (X.AnonymousClass3ZE) r7
            X.1Bc r0 = X.C21251Bc.DEFAULT_INSTANCE
            X.6c9 r6 = r0.A0G()
            com.whatsapp.jid.UserJid r0 = r7.A02
            java.lang.String r2 = X.C18300x5.A0g(r6, r0)
            X.6cX r1 = r6.A00
            X.1Bc r1 = (X.C21251Bc) r1
            r2.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.userJid_ = r2
            int r0 = r7.A00
            X.23N r0 = A01(r0)
            X.6cX r1 = X.C18320x8.A0C(r6)
            X.1Bc r1 = (X.C21251Bc) r1
            int r0 = r0.value
            r1.callResult_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.C18320x8.A1B(r6, r5)
            goto L_0x0215
        L_0x0256:
            X.6cX r2 = X.C18320x8.A0C(r3)
            X.1E6 r2 = (X.AnonymousClass1E6) r2
            X.8ya r1 = r2.participants_
            r0 = r1
            X.8T6 r0 = (X.AnonymousClass8T6) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x026b
            X.8ya r1 = X.C130786cX.A07(r1)
            r2.participants_ = r1
        L_0x026b:
            X.C170208Ch.A05(r5, r1)
            goto L_0x0143
        L_0x0270:
            X.230 r0 = X.AnonymousClass230.Privacy
            goto L_0x0049
        L_0x0274:
            X.230 r0 = X.AnonymousClass230.Scheduled
            goto L_0x0049
        L_0x0278:
            X.230 r0 = X.AnonymousClass230.None
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35H.A02(X.2sr, X.3ZF):X.1E6");
    }
}
