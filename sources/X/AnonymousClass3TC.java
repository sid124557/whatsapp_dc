package X;

import com.whatsapp.util.Log;

/* renamed from: X.3TC  reason: invalid class name */
public class AnonymousClass3TC implements AnonymousClass4EZ {
    public AnonymousClass2S3 A00;
    public AnonymousClass239 A01;
    public AnonymousClass1DS A02;
    public boolean A03 = true;
    public boolean A04;
    public final C55682qk A05;
    public final C69263Wi A06;
    public final C44292Vm A07;
    public final C56612sH A08;
    public final AnonymousClass31C A09;

    public void BQs(String str) {
        Log.i("devicePairRequest/onDeliveryFailure");
        this.A06.BkS(C71313bu.A00(this, 37));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    public void BdM(X.AnonymousClass36K r22, java.lang.String r23) {
        /*
            r21 = this;
            java.lang.String r0 = "devicePairRequest/onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7 = 0
            r2 = r21
            r5 = r22
            if (r22 == 0) goto L_0x00ad
            java.lang.String r1 = X.AnonymousClass36K.A0K(r5)
            java.lang.String r0 = "result"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "device"
            X.36K r3 = r5.A0l(r0)
            if (r3 == 0) goto L_0x00ad
            java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r8 = r3.A0g(r1, r0)
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
            if (r8 == 0) goto L_0x00ad
            java.lang.String r0 = "companion-props"
            X.36K r0 = r5.A0l(r0)
            if (r0 == 0) goto L_0x0047
            byte[] r1 = r0.A01     // Catch:{ 6u5 -> 0x0042 }
            X.1D6 r0 = X.AnonymousClass1D6.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0042 }
            X.6cX r1 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x0042 }
            X.1D6 r1 = (X.AnonymousClass1D6) r1     // Catch:{ 6u5 -> 0x0042 }
            if (r1 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0042:
            java.lang.String r0 = "DevicePairRequestProtocolHelper/parseDeviceInfo/failed to parse companion props"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0047:
            r1 = r7
        L_0x0048:
            X.23P r9 = X.AnonymousClass23P.UNKNOWN
            goto L_0x0055
        L_0x004b:
            int r0 = r1.platformType_
            X.23P r9 = X.AnonymousClass23P.A00(r0)
            if (r9 != 0) goto L_0x0055
            X.23P r9 = X.AnonymousClass23P.UNKNOWN
        L_0x0055:
            X.2sH r0 = r2.A08
            long r14 = r0.A0H()
            if (r1 == 0) goto L_0x009b
            java.lang.String r10 = r1.os_
        L_0x005f:
            r18 = 0
            X.1DS r0 = r2.A02
            if (r0 == 0) goto L_0x0099
            int r13 = r0.currentIndex_
        L_0x0067:
            if (r1 == 0) goto L_0x006f
            boolean r0 = r1.requireFullSync_
            r20 = 1
            if (r0 != 0) goto L_0x0071
        L_0x006f:
            r20 = 0
        L_0x0071:
            r11 = 0
            if (r1 == 0) goto L_0x0085
            int r0 = r1.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0085
            X.1Dg r0 = r1.historySyncConfig_
            if (r0 != 0) goto L_0x0080
            X.1Dg r0 = X.C21811Dg.DEFAULT_INSTANCE
        L_0x0080:
            X.2xO r7 = new X.2xO
            r7.<init>(r0)
        L_0x0085:
            X.33G r6 = new X.33G
            r12 = r11
            r16 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r20)
            X.2Vm r0 = r2.A07
            com.whatsapp.jid.DeviceJid r5 = r6.A07
            X.2qg r0 = r0.A00
            X.1iB r4 = r0.A0E
            java.lang.Object r3 = r4.A0P
            monitor-enter(r3)
            goto L_0x009d
        L_0x0099:
            r13 = 0
            goto L_0x0067
        L_0x009b:
            r10 = r7
            goto L_0x005f
        L_0x009d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "companion-device-manager/onDeviceReceived: "
            X.C18260x0.A1R(r1, r0, r5)     // Catch:{ all -> 0x00aa }
            r4.A01 = r5     // Catch:{ all -> 0x00aa }
            monitor-exit(r3)     // Catch:{ all -> 0x00aa }
            goto L_0x00f1
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00aa }
            throw r0
        L_0x00ad:
            r6 = r7
            X.2S3 r0 = r2.A00
            if (r0 == 0) goto L_0x00f1
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x00f1
            r0 = -1
            if (r22 == 0) goto L_0x00f1
            java.lang.String r4 = X.AnonymousClass36K.A0K(r5)
            java.lang.String r3 = "result"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00f1
            java.lang.String r3 = "retry-ts"
            X.36K r4 = r5.A0l(r3)
            if (r4 == 0) goto L_0x00f1
            java.lang.String r3 = "ts"
            java.lang.String r4 = r4.A0r(r3, r7)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x00f1
            long r3 = X.C615531h.A04(r4, r0)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x00f1
            X.3Wi r5 = r2.A06
            r0 = 7
            X.3Zv r1 = new X.3Zv
            r1.<init>(r2, r3, r0)
        L_0x00ed:
            r5.BkS(r1)
            return
        L_0x00f1:
            X.3Wi r5 = r2.A06
            r0 = 21
            X.3a6 r1 = new X.3a6
            r1.<init>(r2, r0, r6)
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TC.BdM(X.36K, java.lang.String):void");
    }

    public AnonymousClass3TC(C55682qk r2, C69263Wi r3, C44292Vm r4, C56612sH r5, AnonymousClass31C r6) {
        this.A08 = r5;
        this.A06 = r3;
        this.A05 = r2;
        this.A09 = r6;
        this.A07 = r4;
    }

    public void BSN(AnonymousClass36K r5, String str) {
        int A012 = C57492tj.A01(r5);
        C18260x0.A0y("devicePairRequest/onError :", AnonymousClass001.A0o(), A012);
        this.A06.BkS(new C117705sM((Object) this, A012, 21));
    }
}
