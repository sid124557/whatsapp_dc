package X;

/* renamed from: X.5P3  reason: invalid class name */
public class AnonymousClass5P3 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public final C29411im A03;
    public final C614830y A04;
    public final C107285b3 A05;
    public final AnonymousClass5Z0 A06;
    public final C29441ip A07;
    public final C56642sK A08;
    public final C113905mB A09;
    public final AnonymousClass1VX A0A;
    public final C66493Lq A0B;
    public final AnonymousClass3S3 A0C;
    public final C56572sD A0D;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.fieldstats.events.WamCall r8, com.whatsapp.jid.UserJid r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15) {
        /*
            r7 = this;
            X.1ip r0 = r7.A07
            r1 = 1
            int r0 = r0.A08(r1)
            if (r0 != 0) goto L_0x0039
            r1 = 3
        L_0x000a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.callNetwork = r0
            X.1im r2 = r7.A03
            int r1 = r2.A04
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1U(r1, r0)
            java.lang.Integer r4 = X.AnonymousClass001.A0f()
            java.lang.Integer r3 = X.C18290x4.A0a()
            if (r0 == 0) goto L_0x002a
            r8.xmppStatus = r3
        L_0x0025:
            java.lang.Boolean r0 = r7.A00
            if (r0 != 0) goto L_0x004d
            goto L_0x003d
        L_0x002a:
            int r1 = r2.A04
            r0 = 1
            if (r1 != r0) goto L_0x0036
            java.lang.Integer r0 = X.C18280x3.A0S()
            r8.xmppStatus = r0
            goto L_0x0025
        L_0x0036:
            r8.xmppStatus = r4
            goto L_0x0025
        L_0x0039:
            if (r0 != r1) goto L_0x000a
            r1 = 2
            goto L_0x000a
        L_0x003d:
            boolean r0 = android.media.audiofx.AcousticEchoCanceler.isAvailable()     // Catch:{ all -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x0047:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A00 = r0
        L_0x004d:
            java.lang.Boolean r0 = r7.A01
            if (r0 != 0) goto L_0x0061
            boolean r0 = android.media.audiofx.AutomaticGainControl.isAvailable()     // Catch:{ all -> 0x0056 }
            goto L_0x005b
        L_0x0056:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x005b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A01 = r0
        L_0x0061:
            java.lang.Boolean r1 = r7.A02
            if (r1 != 0) goto L_0x0075
            boolean r0 = android.media.audiofx.NoiseSuppressor.isAvailable()     // Catch:{ all -> 0x006a }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x006f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r7.A02 = r1
        L_0x0075:
            java.lang.Boolean r0 = r7.A00
            r8.builtinAecAvailable = r0
            java.lang.Boolean r0 = r7.A01
            r8.builtinAgcAvailable = r0
            r8.builtinNsAvailable = r1
            r8.callOfferElapsedT = r13
            r8.callFromUi = r10
            r8.callWakeupSource = r12
            r8.callPeerPlatform = r14
            r8.callPeerAppVersion = r15
            r1 = 0
            if (r9 == 0) goto L_0x00b3
            X.3S3 r0 = r7.A0C
            long r5 = r0.A02(r9)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b3
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b0
            r8.peerXmppStatus = r3
        L_0x009f:
            if (r11 == 0) goto L_0x00a7
            java.lang.Long r0 = X.C18310x6.A0g(r11)
            r8.callAndroidAudioMode = r0
        L_0x00a7:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Long r0 = X.AnonymousClass0x9.A0m(r0)
            r8.androidApiLevel = r0
            return
        L_0x00b0:
            r8.peerXmppStatus = r4
            goto L_0x009f
        L_0x00b3:
            java.lang.Integer r0 = X.C18290x4.A0b()
            r8.peerXmppStatus = r0
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5P3.A00(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.jid.UserJid, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    public AnonymousClass5P3(C29411im r1, C614830y r2, C107285b3 r3, AnonymousClass5Z0 r4, C29441ip r5, C56642sK r6, C113905mB r7, AnonymousClass1VX r8, C66493Lq r9, AnonymousClass3S3 r10, C56572sD r11) {
        this.A05 = r3;
        this.A0A = r8;
        this.A0D = r11;
        this.A04 = r2;
        this.A0C = r10;
        this.A0B = r9;
        this.A03 = r1;
        this.A09 = r7;
        this.A08 = r6;
        this.A06 = r4;
        this.A07 = r5;
    }
}
