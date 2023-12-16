package X;

/* renamed from: X.3aM  reason: invalid class name and case insensitive filesystem */
public class C70353aM implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C70353aM(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static void A00(AnonymousClass4FS r1, Object obj, Object obj2, Object obj3, int i) {
        r1.BkM(new C70353aM(obj, obj2, obj3, i));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x07ec  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0824  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0847  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x084d  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0858  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:910:? A[RETURN, SYNTHETIC] */
    public final void run() {
        /*
            r50 = this;
            r4 = r50
            int r0 = r4.A03
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0713;
                case 3: goto L_0x0734;
                case 4: goto L_0x076c;
                case 5: goto L_0x0900;
                case 6: goto L_0x0007;
                case 7: goto L_0x092a;
                case 8: goto L_0x0062;
                case 9: goto L_0x00a9;
                case 10: goto L_0x029f;
                case 11: goto L_0x0016;
                case 12: goto L_0x037a;
                case 13: goto L_0x093a;
                case 14: goto L_0x0397;
                case 15: goto L_0x03b7;
                case 16: goto L_0x094e;
                case 17: goto L_0x0980;
                case 18: goto L_0x03e6;
                case 19: goto L_0x0423;
                case 20: goto L_0x09bd;
                case 21: goto L_0x0470;
                case 22: goto L_0x0a9e;
                case 23: goto L_0x0abe;
                case 24: goto L_0x0ae6;
                case 25: goto L_0x0b66;
                case 26: goto L_0x0b84;
                case 27: goto L_0x0cde;
                case 28: goto L_0x0d68;
                case 29: goto L_0x049d;
                case 30: goto L_0x04f9;
                case 31: goto L_0x0d7d;
                case 32: goto L_0x0536;
                case 33: goto L_0x0dd2;
                case 34: goto L_0x0573;
                case 35: goto L_0x0de8;
                case 36: goto L_0x0efb;
                case 37: goto L_0x059d;
                case 38: goto L_0x0fb3;
                case 39: goto L_0x0622;
                case 40: goto L_0x0644;
                case 41: goto L_0x0fdb;
                case 42: goto L_0x0fed;
                case 43: goto L_0x1026;
                case 44: goto L_0x1041;
                case 45: goto L_0x1067;
                case 46: goto L_0x10b2;
                case 47: goto L_0x1101;
                case 48: goto L_0x11e0;
                case 49: goto L_0x1327;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r4.A01
            X.1uQ r2 = (X.C34221uQ) r2
            java.lang.Object r0 = r4.A02
            java.io.File r0 = (java.io.File) r0
            long r0 = X.C989053r.A01(r0)
            r2.A00 = r0
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r2 = r4.A00
            X.2U7 r2 = (X.AnonymousClass2U7) r2
            java.lang.Object r3 = r4.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r1 = r4.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.3S3 r0 = r2.A0C
            r0.A07(r3, r1)
            X.1ib r0 = r2.A04
            goto L_0x0599
        L_0x002b:
            java.lang.Object r3 = r4.A00
            X.5nf r3 = (X.C114825nf) r3
            java.lang.Object r1 = r4.A01
            X.5Uj r1 = (X.C105305Uj) r1
            java.lang.Object r2 = r4.A02
            X.5UO r2 = (X.AnonymousClass5UO) r2
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r1.A0I
            android.view.View r0 = r0.A02
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "titleBar"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0045:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0015
            r1.A02()
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r3.A0J
            r0 = 1
            r1.A04(r0)
            r2.A00()
            r2.A01()
            r1 = 1284(0x504, float:1.799E-42)
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r3.A0M
            r0.setSystemUiVisibility(r1)
            return
        L_0x0062:
            java.lang.Object r1 = r4.A00
            X.3cR r1 = (X.C71643cR) r1
            java.lang.Object r6 = r4.A01
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r5 = r4.A02
            X.2kQ r5 = (X.C51812kQ) r5
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0015
            java.lang.Object r4 = r1.A01
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            X.03q r0 = r4.A0R()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0015
            if (r6 == 0) goto L_0x0092
            com.whatsapp.mediaview.PhotoView r3 = r5.A00
            X.1mV r2 = r5.A01
            android.content.res.Resources r1 = X.C08310eF.A09(r4)
            X.0y1 r0 = new X.0y1
            r0.<init>(r1, r6, r2)
            r3.A07(r0)
        L_0x0092:
            X.1mV r2 = r4.A1S
            if (r2 == 0) goto L_0x0015
            X.1mV r0 = r5.A01
            X.2z0 r1 = r0.A1J
            X.2z0 r0 = r2.A1J
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            r0 = 1
            r4.A1s = r0
            com.whatsapp.mediaview.MediaViewFragment.A05(r4)
            return
        L_0x00a9:
            java.lang.Object r2 = r4.A00
            X.3G6 r2 = (X.AnonymousClass3G6) r2
            java.lang.Object r6 = r4.A01
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.Object r8 = r4.A02
            X.1Dp r8 = (X.C21901Dp) r8
            X.2sr r1 = r2.A03
            boolean r0 = X.C56972sr.A09(r1, r6)
            if (r0 == 0) goto L_0x013f
            X.4FY r0 = r2.A0h
            com.whatsapp.jid.UserJid r0 = r0.BBz()
        L_0x00c3:
            X.33Z r5 = r2.A0K
            int r2 = r8.bitField0_
            boolean r1 = X.AnonymousClass0x2.A1X(r2)
            r15 = 0
            if (r1 == 0) goto L_0x013d
            X.8Lq r14 = r8.senderKeyHash_
        L_0x00d0:
            long r3 = r8.senderTimestamp_
            int r1 = r8.senderAccountType_
            X.239 r16 = X.AnonymousClass239.A00(r1)
            r1 = r2 & 8
            if (r1 == 0) goto L_0x00de
            X.8Lq r15 = r8.recipientKeyHash_
        L_0x00de:
            long r1 = r8.recipientTimestamp_
            X.4Fk r7 = r8.recipientKeyIndexes_
            java.util.HashSet r18 = X.AnonymousClass0x9.A15(r7)
            int r7 = r8.receiverAccountType_
            X.239 r17 = X.AnonymousClass239.A00(r7)
            X.2Ss r13 = new X.2Ss
            r19 = r3
            r21 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r21)
            com.whatsapp.jid.UserJid r4 = r6.userJid
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "DeviceADVInfoHandler/handleADVMetadata sender="
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "; recipient="
            X.C18260x0.A1P(r2, r1, r0)
            int r1 = r6.getDevice()
            boolean r1 = X.AnonymousClass000.A1T(r1)
            java.lang.Long r10 = X.AnonymousClass0x2.A0T()
            r7 = 1
            if (r1 == 0) goto L_0x0144
            X.8Lq r1 = r13.A03
            if (r1 != 0) goto L_0x0144
            long r1 = r13.A01
            X.318 r6 = r5.A0G
            long r8 = r6.A02(r4)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0144
            X.2sr r3 = r5.A02
            boolean r8 = r3.A0a(r4)
            if (r8 == 0) goto L_0x01c9
            boolean r8 = r3.A0Y()
            if (r8 == 0) goto L_0x01c9
            X.2dy r1 = r5.A07
            java.lang.String r0 = "invalid_adv_status"
            r1.A01(r0, r7, r7)
            return
        L_0x013d:
            r14 = r15
            goto L_0x00d0
        L_0x013f:
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)
            goto L_0x00c3
        L_0x0144:
            X.2sr r3 = r5.A02
            boolean r1 = r3.A0a(r4)
            if (r1 == 0) goto L_0x0152
            boolean r1 = r3.A0Y()
            if (r1 == 0) goto L_0x01e1
        L_0x0152:
            long r1 = r13.A01
            X.318 r8 = r5.A0G
            long r11 = r8.A02(r4)
            int r6 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x01e1
            boolean r6 = r3.A0a(r4)
            if (r6 != 0) goto L_0x01b1
            X.239 r9 = r13.A05
            X.239 r11 = X.AnonymousClass239.HOSTED
            if (r9 != r11) goto L_0x01b1
            X.2sr r6 = r8.A01
            boolean r6 = r6.A0a(r4)
            r12 = r6 ^ 1
            java.lang.String r6 = "use HostedCompanionDeviceManager to get self state"
            X.C626936e.A0F(r12, r6)
            X.2yB r6 = r8.A07(r4)
            if (r6 == 0) goto L_0x01ae
            int r6 = r6.A00
            if (r6 != r7) goto L_0x01ae
        L_0x0182:
            X.239 r6 = X.AnonymousClass239.E2EE
            if (r11 != r6) goto L_0x01b1
            com.whatsapp.jid.DeviceJid r1 = r4.getPrimaryDevice()
            X.8OQ r1 = X.AnonymousClass8OQ.of(r1, r10)
            r15 = 0
            r17 = 0
            int r16 = X.C60212yB.A00(r9)
            X.2yB r14 = new X.2yB
            r21 = r17
            r23 = r17
            r19 = r17
            r14.<init>(r15, r16, r17, r19, r21, r23)
            r8.A0I(r1, r14, r4, r15)
            X.3Cp r6 = r5.A08
            com.whatsapp.jid.UserJid[] r2 = new com.whatsapp.jid.UserJid[r7]
            r2[r15] = r0
            r1 = 3
            r6.A01(r2, r1)
            goto L_0x01e1
        L_0x01ae:
            X.239 r11 = X.AnonymousClass239.E2EE
            goto L_0x0182
        L_0x01b1:
            X.2yB r6 = r8.A07(r4)
            if (r6 == 0) goto L_0x01bf
            X.2yB r1 = r8.A06(r6, r1)
            r8.A0F(r1, r4)
            goto L_0x01e1
        L_0x01bf:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "DeviceADVInfoManager/updateDeviceInfoWithExpectedTs user has no device info, user="
            X.C18260x0.A1S(r2, r1, r4)
            goto L_0x01e1
        L_0x01c9:
            java.lang.String r7 = "DeviceADVInfoHandler/handleADVMetadata hash is null, try to remove all devices"
            com.whatsapp.util.Log.i((java.lang.String) r7)
            X.2yB r8 = r6.A07(r4)
            com.whatsapp.jid.DeviceJid r7 = r4.getPrimaryDevice()
            X.8OQ r9 = X.AnonymousClass8OQ.of(r7, r10)
            if (r8 != 0) goto L_0x020f
            r14 = 0
        L_0x01dd:
            r1 = 0
            r6.A0I(r9, r14, r4, r1)
        L_0x01e1:
            boolean r1 = r3.A0a(r0)
            if (r1 == 0) goto L_0x0224
            long r1 = r13.A00
            X.318 r9 = r5.A0G
            long r7 = r9.A02(r0)
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0224
            java.util.Set r1 = r9.A0D(r0)
            int r2 = r1.size()
            r1 = 1
            if (r2 <= r1) goto L_0x0224
            boolean r1 = r3.A0Y()
            if (r1 != 0) goto L_0x0224
            java.lang.String r0 = "DeviceADVInfoHandler/handleADVMetadata detect larger self timestamp, mark the list as dirty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3H2 r0 = r5.A04
            r0.A00()
            return
        L_0x020f:
            int r15 = r8.A01
            r7 = 1
            long r1 = r1 + r7
            r19 = 0
            r16 = 0
            X.2yB r14 = new X.2yB
            r23 = r19
            r17 = r1
            r21 = r19
            r14.<init>(r15, r16, r17, r19, r21, r23)
            goto L_0x01dd
        L_0x0224:
            if (r0 == 0) goto L_0x0015
            boolean r1 = r3.A0a(r0)
            if (r1 == 0) goto L_0x0238
            boolean r1 = r3.A0Y()
            if (r1 == 0) goto L_0x0015
            boolean r1 = r3.A0a(r4)
            if (r1 == 0) goto L_0x0015
        L_0x0238:
            long r1 = r13.A00
            X.318 r6 = r5.A0G
            long r8 = r6.A02(r0)
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0015
            X.239 r8 = r13.A04
            X.239 r7 = X.AnonymousClass239.HOSTED
            if (r8 != r7) goto L_0x0261
            boolean r7 = r3.A0a(r4)
            if (r7 == 0) goto L_0x028d
            boolean r3 = r3.A0a(r0)
            if (r3 != 0) goto L_0x028d
            X.2yB r3 = r6.A07(r0)
            r9 = 1
            if (r3 == 0) goto L_0x026f
            int r3 = r3.A00
            if (r3 != r9) goto L_0x026f
        L_0x0261:
            X.2yB r3 = r6.A07(r0)
            if (r3 == 0) goto L_0x1471
            X.2yB r1 = r6.A06(r3, r1)
            r6.A0F(r1, r0)
            return
        L_0x026f:
            r3 = 0
            r6.A0G(r0, r3)
            r8 = 0
            r10 = 0
            X.2yB r7 = new X.2yB
            r14 = r10
            r16 = r10
            r12 = r10
            r7.<init>(r8, r9, r10, r12, r14, r16)
            r6.A0F(r7, r0)
            X.3Cp r5 = r5.A08
            com.whatsapp.jid.UserJid[] r4 = new com.whatsapp.jid.UserJid[r9]
            r4[r8] = r0
            r3 = 3
            r5.A01(r4, r3)
            goto L_0x0261
        L_0x028d:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r3 = "DeviceADVInfoHandler/handleADVMetadataReceiverAccountType: receiver account type from incorrect sender id: "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = " recipient: "
            X.C18260x0.A1Q(r5, r3, r0)
            goto L_0x0261
        L_0x029f:
            java.lang.Object r1 = r4.A00
            X.33Y r1 = (X.AnonymousClass33Y) r1
            java.lang.Object r0 = r4.A01
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r4 = r4.A02
            java.util.AbstractMap r4 = (java.util.AbstractMap) r4
            java.util.Iterator r3 = X.AnonymousClass001.A0u(r0)
        L_0x02af:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02d3
            java.util.Map$Entry r2 = X.AnonymousClass001.A0w(r3)
            X.2dC r5 = r1.A05
            X.4uZ r6 = X.C18320x8.A0N(r2)
            java.lang.Object r0 = r2.getValue()
            X.34x r0 = (X.C624134x) r0
            long r7 = r0.A1L
            java.lang.Object r0 = r2.getValue()
            X.34x r0 = (X.C624134x) r0
            long r9 = r0.A1M
            r5.A00(r6, r7, r9)
            goto L_0x02af
        L_0x02d3:
            java.util.Iterator r11 = X.AnonymousClass001.A0u(r4)
        L_0x02d7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0015
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r11)
            X.2dC r3 = r1.A05
            com.whatsapp.jid.UserJid r7 = X.C18320x8.A0P(r0)
            java.lang.Object r0 = r0.getValue()
            long r4 = X.C18310x6.A0B(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/"
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " "
            X.C18260x0.A12(r0, r2, r4)
            X.33e r8 = r3.A08
            X.34r r6 = r8.A05(r7)
            if (r6 != 0) goto L_0x0314
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/no status for "
            X.C18260x0.A1S(r2, r0, r7)
            goto L_0x02d7
        L_0x0314:
            monitor-enter(r6)
            long r9 = r6.A07     // Catch:{ all -> 0x1480 }
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x031d
            r6.A07 = r4     // Catch:{ all -> 0x1480 }
        L_0x031d:
            X.34r r2 = r6.A06()     // Catch:{ all -> 0x1480 }
            monitor-exit(r6)
            monitor-enter(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
            long r5 = r2.A07     // Catch:{ all -> 0x036c }
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
            X.3dV r0 = r8.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
            X.4Fq r4 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
            android.content.ContentValues r13 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "last_read_receipt_sent_message_table_id"
            X.2sg r12 = X.AnonymousClass3H0.A02(r13, r4, r0, r5)     // Catch:{ all -> 0x0362 }
            java.lang.String r14 = "status"
            java.lang.String r15 = "jid_row_id=?"
            java.lang.String[] r17 = r8.A0I(r7)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "updateLastReadReceiptSentMessageRowId/UPDATE"
            java.lang.String r16 = X.C620233e.A00(r0)     // Catch:{ all -> 0x0362 }
            int r0 = r12.A05(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0362 }
            if (r0 != 0) goto L_0x035d
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = "StatusStore/updateLastReadReceiptSentMessageTableId/no status saved for "
            r2.append(r0)     // Catch:{ all -> 0x0362 }
            r2.append(r7)     // Catch:{ all -> 0x0362 }
            java.lang.String r0 = ";"
            X.C18260x0.A1K(r2, r0)     // Catch:{ all -> 0x0362 }
        L_0x035d:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
            goto L_0x02d7
        L_0x0362:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x0367 }
            goto L_0x036b
        L_0x0367:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
        L_0x036b:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
        L_0x036c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x036f, Error | RuntimeException -> 0x147b }
        L_0x036f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r3.A06
            r0.A04()
            goto L_0x02d7
        L_0x037a:
            java.lang.Object r0 = r4.A00
            X.3Lj r0 = (X.C66423Lj) r0
            java.lang.Object r5 = r4.A01
            X.2nu r5 = (X.C53932nu) r5
            java.lang.Object r3 = r4.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.2lf r2 = r0.A0M
            X.34x r0 = r5.A05
            X.2z0 r1 = r0.A1J
            com.whatsapp.jid.DeviceJid r0 = r5.A03
            r2.A02(r0, r1)
            if (r3 == 0) goto L_0x0015
            r3.run()
            return
        L_0x0397:
            java.lang.Object r0 = r4.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r3 = r4.A01
            X.21F r3 = (X.AnonymousClass21F) r3
            java.lang.Object r2 = r4.A02
            X.4uY r2 = (X.C95804uY) r2
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x03a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r1.next()
            X.4DE r0 = (X.AnonymousClass4DE) r0
            r0.BM1(r2, r3)
            goto L_0x03a7
        L_0x03b7:
            java.lang.Object r0 = r4.A00
            X.2zi r0 = (X.C61102zi) r0
            java.lang.Object r3 = r4.A02
            X.4uZ r3 = (X.C95814uZ) r3
            java.util.Iterator r2 = X.C61102zi.A03(r0)
        L_0x03c3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r1 = r2.next()
            com.whatsapp.newsletter.NewsletterInfoMembersListViewModel r1 = (com.whatsapp.newsletter.NewsletterInfoMembersListViewModel) r1
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x03e0
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x03c3
            X.2sr r0 = r1.A08
            boolean r0 = r0.A0a(r3)
            if (r0 != 0) goto L_0x03e0
            goto L_0x03c3
        L_0x03e0:
            X.08M r0 = r1.A04
            r0.A0G(r3)
            goto L_0x03c3
        L_0x03e6:
            java.lang.Object r3 = r4.A00
            com.whatsapp.newsletter.NewsletterLinkLauncher r3 = (com.whatsapp.newsletter.NewsletterLinkLauncher) r3
            java.lang.Object r5 = r4.A01
            X.2LU r5 = (X.AnonymousClass2LU) r5
            java.lang.Object r6 = r4.A02
            X.4GP r6 = (X.AnonymousClass4GP) r6
            X.31C r2 = r3.A05     // Catch:{ all -> 0x03fa }
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.A08(r0)     // Catch:{ all -> 0x03fa }
            goto L_0x03fe
        L_0x03fa:
            r0 = move-exception
            X.AnonymousClass3Z0.A01(r0)
        L_0x03fe:
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0015
            X.31C r0 = r3.A05
            boolean r0 = r0.A0I()
            if (r0 == 0) goto L_0x040e
            r6.invoke()
            return
        L_0x040e:
            java.lang.ref.WeakReference r0 = r5.A01
            java.lang.Object r4 = r0.get()
            if (r4 == 0) goto L_0x0015
            X.3Wi r0 = r3.A02
            r7 = 11
            X.3ac r2 = new X.3ac
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0S(r2)
            return
        L_0x0423:
            java.lang.Object r6 = r4.A00
            X.2qQ r6 = (X.C55482qQ) r6
            java.lang.Object r5 = r4.A01
            X.4uY r5 = (X.C95804uY) r5
            java.lang.Object r2 = r4.A02
            java.util.List r2 = (java.util.List) r2
            r0 = 2
            X.C162457s7.A0J(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterViewReceiptManager/sendMessageViewed newsletterJid = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "messages count "
            X.AnonymousClass000.A1H(r0, r1, r2)
            X.AnonymousClass0x2.A18(r1)
            java.lang.Object r0 = X.C18290x4.A0k(r2)
            X.34x r0 = (X.C624134x) r0
            java.lang.String r4 = X.AnonymousClass2z0.A06(r0)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r2.iterator()
        L_0x0460:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x1483
            X.34x r0 = X.C18300x5.A0T(r2)
            long r0 = r0.A1M
            X.AnonymousClass0x2.A1Q(r3, r0)
            goto L_0x0460
        L_0x0470:
            java.lang.Object r6 = r4.A00
            X.2rc r6 = (X.C56212rc) r6
            java.lang.Object r7 = r4.A01
            X.4uY r7 = (X.C95804uY) r7
            java.lang.Object r5 = r4.A02
            X.1RL r5 = (X.AnonymousClass1RL) r5
            X.2rr r2 = r6.A05
            r0 = -1
            int r0 = r2.A01(r7, r0)
            long r3 = (long) r0
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0491
            X.21q r1 = r5.A07
            X.21q r0 = X.C372821q.GUEST
            if (r1 != r0) goto L_0x0015
        L_0x0491:
            X.2nm r6 = r6.A0B
            r8 = 0
            r13 = 0
            r11 = 50
            r10 = r8
            r9 = r8
            r6.A00(r7, r8, r9, r10, r11, r13)
            return
        L_0x049d:
            java.lang.Object r3 = r4.A00
            X.4Eu r3 = (X.C85064Eu) r3
            java.lang.Object r0 = r4.A01
            java.lang.Object r2 = r4.A02
            X.2ml r2 = (X.C53232ml) r2
            r4 = 0
            boolean r1 = r3.BFM(r4)
            r3.Bmg(r0)
            boolean r0 = r3.BFM(r4)
            if (r1 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x0015
            java.lang.String r6 = r3.BA5()
            r9 = 1
            X.1P1 r0 = r2.A02
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x04d5
            X.3Gp r2 = r2.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            X.2jq r1 = new X.2jq
            r1.<init>(r0, r6)
            X.21t r0 = X.C373121t.Nux
            r2.A0I(r1, r0)
            return
        L_0x04d5:
            X.1On r2 = r2.A01
            X.3Gp r1 = r2.A01
            boolean r0 = r1.A0Q()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x0015
            X.2sH r0 = r2.A02
            long r7 = r0.A0H()
            X.1SR r3 = new X.1SR
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r9)
            java.util.Set r0 = X.C65203Gp.A00(r1, r3)
            r1.A0O(r0)
            return
        L_0x04f9:
            java.lang.Object r3 = r4.A00
            X.5kt r3 = (X.C113105kt) r3
            java.lang.Object r5 = r4.A01
            X.5pj r5 = (X.C116095pj) r5
            java.lang.Object r4 = r4.A02
            X.34x r4 = (X.C624134x) r4
            X.5mA r9 = r3.A07
            boolean r0 = r9.A0B()
            if (r0 != 0) goto L_0x0015
            int r2 = X.C116095pj.A12
            r1 = 0
            r0 = 1
            r5.A09(r2, r1, r0)
            X.33p r1 = r3.A08
            X.2z0 r0 = r4.A1J
            X.4uZ r0 = r0.A00
            X.C107465bM.A0B(r1, r0)
            X.5pj r1 = r9.A00()
            if (r1 == 0) goto L_0x0526
            r0 = 1
            r1.A0Y = r0
        L_0x0526:
            X.33j r10 = r3.A09
            android.view.View r4 = r3.A00
            X.5Uq r8 = r3.A05
            X.2sr r5 = r3.A02
            X.3Ex r6 = r3.A03
            X.5ZU r7 = r3.A04
            X.C107465bM.A01(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0536:
            java.lang.Object r5 = r4.A00
            com.whatsapp.picker.search.StickerSearchDialogFragment r5 = (com.whatsapp.picker.search.StickerSearchDialogFragment) r5
            java.lang.Object r3 = r4.A01
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.Object r2 = r4.A02
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            r5.A0C = r0
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = r5.A0D
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0015
            int r0 = r3.length()
            java.lang.String r4 = r3.toString()
            if (r0 != 0) goto L_0x148e
            r5.A0D = r4
            X.11P r1 = r5.A1U()
            r0 = 0
            r1.A00 = r0
            r0 = 4
            r2.setVisibility(r0)
            X.11P r0 = r5.A1U()
            r0.A0D()
            com.whatsapp.picker.search.StickerSearchDialogFragment.A00(r5)
            return
        L_0x0573:
            java.lang.Object r2 = r4.A02
            X.3S3 r2 = (X.AnonymousClass3S3) r2
            java.util.HashMap r0 = r2.A06
            java.lang.Object r3 = r4.A01
            X.4uZ r3 = (X.C95814uZ) r3
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "presencemgr/timeout/"
            X.C18280x3.A1H(r1, r0, r3)
            java.lang.Object r0 = r4.A00
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.C18260x0.A0o(r0, r1)
            r2.A07(r3, r0)
            X.1ib r0 = r2.A01
        L_0x0599:
            r0.A08(r3)
            return
        L_0x059d:
            java.lang.Object r6 = r4.A00
            X.1gM r6 = (X.AnonymousClass1gM) r6
            java.lang.Object r5 = r4.A01
            X.39T r5 = (X.AnonymousClass39T) r5
            java.lang.Object r2 = r4.A02
            X.36K r2 = (X.AnonymousClass36K) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "identity changed notification received; stanzaKey="
            X.C18260x0.A1R(r1, r0, r5)
            com.whatsapp.jid.Jid r0 = r5.A02
            com.whatsapp.jid.DeviceJid r10 = X.C18320x8.A0O(r0)
            X.2ov r4 = X.AnonymousClass36G.A02(r10)
            X.30x r0 = r6.A05
            X.3fe r9 = X.C614730x.A00(r4, r0)
            X.33n r3 = r6.A03     // Catch:{ all -> 0x14cf }
            X.2e4 r7 = r3.A08(r4)     // Catch:{ all -> 0x14cf }
            java.lang.String r0 = "identity"
            X.36K r8 = r2.A0l(r0)     // Catch:{ all -> 0x14cf }
            java.lang.String r0 = "registration"
            X.36K r0 = r2.A0l(r0)     // Catch:{ all -> 0x14cf }
            if (r7 == 0) goto L_0x060a
            if (r8 == 0) goto L_0x060e
            if (r0 == 0) goto L_0x060e
            X.1VX r2 = r6.A06     // Catch:{ all -> 0x14cf }
            r1 = 1296(0x510, float:1.816E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x14cf }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x14cf }
            if (r0 == 0) goto L_0x060e
            byte[] r2 = r8.A01     // Catch:{ all -> 0x14cf }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x14cf }
            X.C626936e.A06(r2)     // Catch:{ all -> 0x14cf }
            r1 = 5
            X.2jv r0 = new X.2jv     // Catch:{ all -> 0x14cf }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x14cf }
            X.2e4 r2 = new X.2e4     // Catch:{ all -> 0x14cf }
            r2.<init>(r0)     // Catch:{ all -> 0x14cf }
            X.2jv r1 = r2.A00     // Catch:{ all -> 0x14cf }
            X.2jv r0 = r7.A00     // Catch:{ all -> 0x14cf }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x14cf }
            if (r0 != 0) goto L_0x060a
            r3.A0B(r4)     // Catch:{ all -> 0x14cf }
            r3.A0M(r2, r4)     // Catch:{ all -> 0x14cf }
        L_0x060a:
            r6.A03(r5)     // Catch:{ all -> 0x14cf }
            goto L_0x061c
        L_0x060e:
            X.2qR r3 = r6.A01     // Catch:{ all -> 0x14cf }
            r2 = 1
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r2]     // Catch:{ all -> 0x14cf }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x14cf }
            r0 = 8
            r3.A04(r1, r0, r2)     // Catch:{ all -> 0x14cf }
            goto L_0x060a
        L_0x061c:
            if (r9 == 0) goto L_0x0015
            r9.close()
            return
        L_0x0622:
            java.lang.Object r5 = r4.A00
            X.3Qo r5 = (X.C67763Qo) r5
            java.lang.Object r3 = r4.A01
            X.1fJ r3 = (X.C27991fJ) r3
            java.lang.Object r2 = r4.A02
            X.1fJ r2 = (X.C27991fJ) r2
            X.3Ex r0 = r5.A04
            X.3ZH r0 = r0.A0A(r3)
            boolean r0 = r0.A0d
            if (r0 != 0) goto L_0x0015
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = r5.A03
            X.2WQ r0 = r5.A0E
            boolean r0 = r0.A00()
            r1.A05(r3, r2, r0)
            return
        L_0x0644:
            java.lang.Object r2 = r4.A00
            X.3Qo r2 = (X.C67763Qo) r2
            java.lang.Object r0 = r4.A01
            X.39T r0 = (X.AnonymousClass39T) r0
            java.lang.Object r8 = r4.A02
            X.36K r8 = (X.AnonymousClass36K) r8
            X.2SY r5 = r2.A0H
            r6 = 0
            com.whatsapp.jid.Jid r3 = r0.A02
            X.1fJ r4 = X.AnonymousClass34R.A00(r3)
            r7 = 0
            java.lang.String r0 = "notification"
            X.AnonymousClass36K.A0N(r8, r0)     // Catch:{ 24Y -> 0x1555 }
            java.lang.String r0 = "participant"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch:{ 24Y -> 0x1555 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            X.C626836d.A0F(r8, r0, r7, r1)     // Catch:{ 24Y -> 0x1555 }
            r0 = 50
            X.4Jp r1 = X.C86304Jp.A00(r0)     // Catch:{ 24Y -> 0x1555 }
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ 24Y -> 0x1555 }
            X.C626836d.A04(r8, r1, r0)     // Catch:{ 24Y -> 0x1555 }
            java.lang.String r1 = "reports"
            java.lang.String r0 = "report"
            java.lang.String[] r10 = new java.lang.String[]{r1, r0}     // Catch:{ 24Y -> 0x1555 }
            r0 = 51
            X.4Jp r9 = X.C86304Jp.A00(r0)     // Catch:{ 24Y -> 0x1555 }
            r11 = 1
            r13 = 10000(0x2710, double:4.9407E-320)
            java.util.List r0 = X.C626836d.A0B(r8, r9, r10, r11, r13)     // Catch:{ 24Y -> 0x1555 }
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r0.iterator()
        L_0x0697:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x06c5
            java.lang.Object r0 = r9.next()
            X.6rI r0 = (X.C138966rI) r0
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x06af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06c1
            java.lang.Object r0 = r1.next()
            X.6rH r0 = (X.C138956rH) r0
            java.lang.Object r0 = r0.A00
            r7.add(r0)
            goto L_0x06af
        L_0x06c1:
            X.C73743g0.A0W(r7, r8)
            goto L_0x0697
        L_0x06c5:
            X.2sr r0 = r5.A00
            com.whatsapp.jid.PhoneUserJid r7 = X.C56972sr.A05(r0)
            X.C162457s7.A0D(r7)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0015
            java.util.Iterator r1 = r8.iterator()
        L_0x06d8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r1.next()
            boolean r0 = X.C162457s7.A0P(r0, r7)
            if (r0 != 0) goto L_0x06d8
            X.3Ex r0 = r5.A01
            X.3ZH r1 = r0.A09(r4)
            if (r1 == 0) goto L_0x0015
            X.2eb r0 = r5.A04
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0015
            X.1R1 r0 = r5.A05
            X.2sa r0 = X.AnonymousClass1R1.A00(r4, r0)
            boolean r0 = r0.A09()
            r1 = r0 ^ 1
            X.2ss r0 = r5.A03
            X.31A r0 = r0.A0A(r4, r6)
            if (r1 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x14db
            boolean r0 = r0.A0i
            if (r0 == 0) goto L_0x14db
            return
        L_0x0713:
            java.lang.Object r3 = r4.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r1 = r4.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Object r2 = r4.A02
            X.3Ex r0 = r3.A0V
            X.3ZH r1 = r0.A0A(r1)
            X.5ZU r0 = r3.A0Z
            java.lang.String r1 = X.C18300x5.A0h(r0, r1)
            X.3Wi r6 = r3.A0L
            r0 = 49
            X.5sN r4 = new X.5sN
            r4.<init>(r3, r2, r1, r0)
            goto L_0x0dca
        L_0x0734:
            java.lang.Object r2 = r4.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            java.lang.Object r3 = r4.A01
            java.lang.Object r5 = r4.A02
            X.2qz r1 = r2.A1d
            X.2z0 r0 = r2.A1R
            X.34x r1 = r1.A05(r0)
            boolean r0 = r1 instanceof X.C30791n7
            if (r0 != 0) goto L_0x075d
            X.2qz r1 = r2.A1d
            X.2z0 r0 = r2.A1R
            X.34x r4 = r1.A05(r0)
        L_0x0750:
            X.3Wi r0 = r2.A0L
            r6 = 8
            X.3ac r1 = new X.3ac
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A0S(r1)
            return
        L_0x075d:
            boolean r0 = X.AnonymousClass36V.A07(r1)
            if (r0 == 0) goto L_0x076a
            int r0 = r2.A03
            X.34x r4 = X.AnonymousClass36V.A02(r1, r0)
            goto L_0x0750
        L_0x076a:
            r4 = 0
            goto L_0x0750
        L_0x076c:
            java.lang.Object r3 = r4.A00
            com.whatsapp.mediaview.MediaViewFragment r3 = (com.whatsapp.mediaview.MediaViewFragment) r3
            java.lang.Object r5 = r4.A01
            X.1mV r5 = (X.C30471mV) r5
            java.lang.Object r6 = r4.A02
            java.io.File r6 = (java.io.File) r6
            byte r8 = r5.A1I
            java.lang.String r7 = r5.A05
            r4 = 2
            r0 = 3
            r2 = 0
            r1 = 1
            if (r7 == 0) goto L_0x080d
            java.lang.String r1 = "/"
            X.5rB r0 = new X.5rB
            r0.<init>((java.lang.String) r1)
            java.util.List r4 = r0.A01(r7, r2)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x080a
            int r0 = r4.size()
            java.util.ListIterator r1 = r4.listIterator(r0)
        L_0x079b:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x080a
            java.lang.Object r0 = r1.previous()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 == 0) goto L_0x079b
            int r0 = r1.nextIndex()
            int r0 = r0 + 1
            java.util.List r0 = X.C73723fy.A0J(r4, r0)
        L_0x07b7:
            java.lang.String[] r0 = X.AnonymousClass0x7.A1b(r0)
            r4 = r0[r2]
            int r1 = r4.hashCode()
            r0 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r1 == r0) goto L_0x0801
            r0 = 100313435(0x5faa95b, float:2.3572098E-35)
            if (r1 == r0) goto L_0x07f8
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 != r0) goto L_0x07d9
            java.lang.String r0 = "video"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0854
        L_0x07d9:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaViewFragment/handleSave/save-media-unsupported-mimetype-"
            r1.append(r0)
            java.lang.String r0 = r5.A05
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
        L_0x07e8:
            boolean r0 = r3.A1u
            if (r0 == 0) goto L_0x07ef
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x07ef:
            X.3Wi r1 = r3.A0L
            r0 = 2131893277(0x7f121c1d, float:1.9421326E38)
        L_0x07f4:
            r1.A0I(r0, r2)
            return
        L_0x07f8:
            java.lang.String r0 = "image"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0850
            goto L_0x07d9
        L_0x0801:
            java.lang.String r0 = "audio"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x081b
            goto L_0x07d9
        L_0x080a:
            X.3d3 r0 = X.C72023d3.A00
            goto L_0x07b7
        L_0x080d:
            if (r8 == r0) goto L_0x0854
            r0 = 13
            if (r8 == r0) goto L_0x0854
            if (r8 == r1) goto L_0x0850
            r0 = 29
            if (r8 == r0) goto L_0x0850
            if (r8 != r4) goto L_0x07d9
        L_0x081b:
            r1 = 3
            java.lang.String r9 = android.os.Environment.DIRECTORY_MUSIC
        L_0x081e:
            X.C162457s7.A0F(r9)
            r0 = 1
            if (r1 == r0) goto L_0x084d
            r0 = 2
            if (r1 == r0) goto L_0x084a
            android.net.Uri r7 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x0829:
            java.lang.String r12 = r6.getName()
            r10 = 1
            X.C162457s7.A0J(r12, r10)
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r9)
            java.lang.String r0 = "Whatsapp"
            java.io.File r8 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r8.exists()
            if (r0 != 0) goto L_0x0858
            boolean r0 = r8.mkdirs()
            if (r0 != 0) goto L_0x0858
            java.lang.String r1 = "MediaViewFragment/handleSave/save-media-destination-file-null"
            goto L_0x07e8
        L_0x084a:
            android.net.Uri r7 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x0829
        L_0x084d:
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x0829
        L_0x0850:
            r1 = 1
            java.lang.String r9 = android.os.Environment.DIRECTORY_PICTURES
            goto L_0x081e
        L_0x0854:
            r1 = 2
            java.lang.String r9 = android.os.Environment.DIRECTORY_MOVIES
            goto L_0x081e
        L_0x0858:
            java.io.File r1 = X.AnonymousClass002.A0A(r8, r12)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x08a3
            java.lang.String r4 = "\\."
            X.5rB r0 = new X.5rB
            r0.<init>((java.lang.String) r4)
            r1 = 2
            java.util.List r0 = r0.A01(r12, r1)
            java.lang.String[] r0 = X.AnonymousClass0x7.A1b(r0)
            r11 = r0[r2]
            X.5rB r0 = new X.5rB
            r0.<init>((java.lang.String) r4)
            java.util.List r0 = r0.A01(r12, r1)
            java.lang.String[] r0 = X.AnonymousClass0x7.A1b(r0)
            r4 = r0[r10]
        L_0x0883:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)
            r0 = 40
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.io.File r1 = X.C18270x1.A0A(r8, r4, r1)
            boolean r0 = r1.exists()
            r0 = r0 ^ 1
            int r10 = r10 + 1
            if (r0 != 0) goto L_0x08a3
            goto L_0x0883
        L_0x08a3:
            java.lang.String r0 = r5.A05
            android.content.ContentValues r1 = X.C383627g.A00(r1, r9, r0)
            X.33i r0 = r3.A0f
            X.5UR r0 = r0.A0R()
            if (r7 == 0) goto L_0x08fc
            if (r0 == 0) goto L_0x08fc
            android.content.ContentResolver r0 = r0.A02()
            android.net.Uri r4 = r0.insert(r7, r1)
            if (r4 == 0) goto L_0x07ef
            X.33i r1 = r3.A0f
            boolean r7 = r3.A1u
            r0 = 2
            X.C162457s7.A0J(r1, r0)
            java.io.FileInputStream r5 = X.AnonymousClass0x9.A0g(r6)     // Catch:{ Exception -> 0x08f2 }
            X.5UR r0 = X.C620633i.A02(r1)     // Catch:{ all -> 0x08eb }
            java.io.OutputStream r4 = r0.A07(r4)     // Catch:{ all -> 0x08eb }
            if (r4 == 0) goto L_0x08e1
            X.C627536m.A0I(r5, r4)     // Catch:{ all -> 0x08da }
            r4.close()     // Catch:{ all -> 0x08eb }
            goto L_0x08e1
        L_0x08da:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x08dc }
        L_0x08dc:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x08eb }
            throw r0     // Catch:{ all -> 0x08eb }
        L_0x08e1:
            r5.close()     // Catch:{ Exception -> 0x08f2 }
            X.3Wi r1 = r3.A0L
            r0 = 2131893278(0x7f121c1e, float:1.9421328E38)
            goto L_0x07f4
        L_0x08eb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x08ed }
        L_0x08ed:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ Exception -> 0x08f2 }
            throw r0     // Catch:{ Exception -> 0x08f2 }
        L_0x08f2:
            r1 = move-exception
            if (r7 == 0) goto L_0x07ef
            java.lang.String r0 = "mediasave/save-media-io-exception"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x07ef
        L_0x08fc:
            java.lang.String r1 = "MediaViewFragment/handleSave/save-media-context-or-media-uri-null"
            goto L_0x07e8
        L_0x0900:
            java.lang.Object r5 = r4.A00
            com.whatsapp.mediaview.MediaViewFragment r5 = (com.whatsapp.mediaview.MediaViewFragment) r5
            java.lang.Object r3 = r4.A01
            X.2z0 r3 = (X.AnonymousClass2z0) r3
            java.lang.Object r2 = r4.A02
            int r1 = r5.A04
            X.66p r0 = r5.A1E
            if (r0 == 0) goto L_0x091a
            X.1mV r1 = r0.B9Y(r1)
            if (r1 == 0) goto L_0x091a
            X.2z0 r0 = r1.A1J
            if (r0 == r3) goto L_0x0920
        L_0x091a:
            X.2qz r0 = r5.A1d
            X.34x r1 = r0.A05(r3)
        L_0x0920:
            X.3Wi r6 = r5.A0L
            r0 = 7
            X.3aM r4 = new X.3aM
            r4.<init>(r5, r1, r2, r0)
            goto L_0x0dca
        L_0x092a:
            java.lang.Object r2 = r4.A00
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            java.lang.Object r1 = r4.A01
            X.1mV r1 = (X.C30471mV) r1
            java.lang.Object r0 = r4.A02
            android.content.Intent r0 = (android.content.Intent) r0
            r2.A1l(r0, r1)
            return
        L_0x093a:
            java.lang.Object r2 = r4.A00
            X.3bk r2 = (X.C71213bk) r2
            java.lang.Object r0 = r4.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r1 = r4.A02
            X.1A4 r1 = (X.AnonymousClass1A4) r1
            X.1fL r0 = X.C57382tY.A00(r0)
            r2.A00(r0, r1)
            return
        L_0x094e:
            java.lang.Object r5 = r4.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r2 = r4.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r4 = r4.A02
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r1 = 1
            X.2sr r0 = r5.A01
            boolean r0 = r0.A0a(r2)
            if (r0 == 0) goto L_0x0972
            r0 = 2131888693(0x7f120a35, float:1.9412029E38)
            java.lang.String r0 = r5.getString(r0)
        L_0x096b:
            X.C162457s7.A0H(r0)
            r5.A7Y(r0, r3)
            return
        L_0x0972:
            r2 = 2131888685(0x7f120a2d, float:1.9412012E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r5.A7M(r4)
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r0, r1, r3, r2)
            goto L_0x096b
        L_0x0980:
            java.lang.Object r5 = r4.A00
            com.whatsapp.newsletter.NewsletterInfoActivity r5 = (com.whatsapp.newsletter.NewsletterInfoActivity) r5
            java.lang.Object r2 = r4.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r4 = r4.A02
            java.util.List r4 = (java.util.List) r4
            r3 = 0
            r1 = 1
            X.2sr r0 = r5.A01
            boolean r0 = r0.A0a(r2)
            if (r0 == 0) goto L_0x09af
            r0 = 2131888690(0x7f120a32, float:1.9412022E38)
            java.lang.String r3 = r5.getString(r0)
        L_0x099d:
            X.C162457s7.A0H(r3)
            X.0df r2 = r5.getSupportFragmentManager()
            r1 = 0
            X.21J r0 = X.AnonymousClass21J.DISMISS
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.AnonymousClass27t.A00(r0, r3, r1, r4)
            X.AnonymousClass344.A01(r0, r2)
            return
        L_0x09af:
            r2 = 2131888683(0x7f120a2b, float:1.9412008E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r5.A7M(r4)
            java.lang.String r3 = X.AnonymousClass002.A0F(r5, r0, r1, r3, r2)
            goto L_0x099d
        L_0x09bd:
            java.lang.Object r7 = r4.A00
            X.2se r7 = (X.C56842se) r7
            java.lang.Object r6 = r4.A01
            X.1RL r6 = (X.AnonymousClass1RL) r6
            java.lang.Object r9 = r4.A02
            X.2ss r1 = r7.A09
            X.4uZ r0 = r6.A05()
            X.C162457s7.A0D(r0)
            X.C106855aH.A02(r1, r0)
            X.2sL r5 = r7.A0B
            X.4uZ r1 = r6.A05()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C162457s7.A0K(r1, r0)
            X.4uY r1 = (X.C95804uY) r1
            java.lang.String r8 = r6.A0H
            X.3Z6 r0 = r5.A07(r1, r8)
            java.lang.Object r4 = r0.first
            X.31A r4 = (X.AnonymousClass31A) r4
            java.lang.Object r0 = r0.second
            long r30 = X.C18310x6.A0B(r0)
            long r0 = r6.A02
            r34 = r0
            java.lang.String r0 = r6.A0E
            r24 = r0
            long r0 = r6.A01
            r36 = r0
            java.lang.String r0 = r6.A0J
            r25 = r0
            long r0 = r6.A03
            r38 = r0
            java.lang.String r0 = r6.A0I
            r26 = r0
            long r14 = r6.A04
            long r2 = r6.A0O
            java.lang.String r0 = r6.A0F
            r27 = r0
            java.lang.String r0 = r6.A0G
            r28 = r0
            long r0 = r6.A05
            X.21q r12 = r6.A07
            X.21c r10 = r6.A0A
            r49 = r10
            X.21e r10 = r6.A0C
            r48 = r10
            boolean r10 = r6.A0L
            r23 = r10
            java.util.List r10 = r6.A0Q
            r21 = r10
            boolean r10 = r6.A0M
            r20 = r10
            X.21l r11 = r6.A0B
            boolean r10 = r6.A0K
            r19 = r10
            X.21r r10 = r6.A09
            X.6aY r13 = r6.A06
            r18 = r13
            java.lang.Long r13 = r6.A0D
            r22 = r13
            boolean r13 = r6.A0N
            r16 = r13
            X.599 r13 = r6.A08
            r17 = r13
            r13 = 1
            X.C162457s7.A0J(r4, r13)
            r13 = 14
            X.C162457s7.A0J(r12, r13)
            r13 = 20
            X.C162457s7.A0J(r11, r13)
            r13 = 22
            X.C162457s7.A0J(r10, r13)
            X.1RL r13 = new X.1RL
            r29 = r21
            r32 = r34
            r34 = r36
            r36 = r38
            r38 = r14
            r40 = r2
            r42 = r0
            r44 = r23
            r45 = r20
            r46 = r19
            r47 = r16
            r14 = r18
            r15 = r4
            r16 = r12
            r18 = r10
            r19 = r49
            r20 = r11
            r21 = r48
            r23 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36, r38, r40, r42, r44, r45, r46, r47)
            java.util.List r1 = X.C18290x4.A12(r13)
            r5.A0A(r1)
            X.7qM r0 = r7.A0I
            r0.A07(r1)
            X.2nv r0 = r7.A0F
            r0.A00(r6)
            X.3Wi r6 = r7.A06
            r0 = 36
            X.3Zo r4 = new X.3Zo
            r4.<init>(r9, r0)
            goto L_0x0dca
        L_0x0a9e:
            java.lang.Object r0 = r4.A00
            X.5QK r0 = (X.AnonymousClass5QK) r0
            java.lang.Object r5 = r4.A01
            X.66A r5 = (X.AnonymousClass66A) r5
            java.lang.Object r3 = r4.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.3Wi r0 = r0.A01
            r0.A0D()
            r1 = 0
            X.4x7 r0 = new X.4x7
            r0.<init>(r3, r1)
            java.util.List r0 = X.C18290x4.A12(r0)
            r5.BdG(r0)
            return
        L_0x0abe:
            java.lang.Object r5 = r4.A01
            java.lang.Object r3 = r4.A02
            android.view.View r3 = (android.view.View) r3
            if (r5 != 0) goto L_0x0acc
            java.lang.String r0 = "NewsletterAcceptAdminInviteSheet/decode-photo-bytes-returns-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0acc:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 100
            r2.setDuration(r0)
            r1 = 3
            X.4H5 r0 = new X.4H5
            r0.<init>(r5, r1, r3)
            r2.setAnimationListener(r0)
            r3.startAnimation(r2)
            return
        L_0x0ae6:
            java.lang.Object r5 = r4.A00
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r5 = (com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet) r5
            java.lang.Object r6 = r4.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r3 = r4.A02
            X.03q r3 = (X.C003203q) r3
            r8 = 0
            r0 = 1
            r7 = 2131893205(0x7f121bd5, float:1.942118E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.util.ArrayList r9 = X.C73783g4.A0c(r6)
            java.util.Iterator r10 = r6.iterator()
        L_0x0b01:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0b4a
            com.whatsapp.jid.UserJid r2 = X.C18310x6.A0T(r10)
            boolean r0 = r2 instanceof X.C27981fH
            if (r0 == 0) goto L_0x0b1f
            r1 = r2
            X.1fH r1 = (X.C27981fH) r1
            if (r1 == 0) goto L_0x0b1f
            X.2sM r0 = r5.A09
            if (r0 == 0) goto L_0x0b42
            com.whatsapp.jid.PhoneUserJid r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0b1f
            r2 = r0
        L_0x0b1f:
            X.5ZU r1 = r5.A06
            if (r1 == 0) goto L_0x0b3a
            X.3Ex r0 = r5.A05
            if (r0 == 0) goto L_0x0b33
            X.3ZH r0 = r0.A0A(r2)
            java.lang.String r0 = X.C18300x5.A0h(r1, r0)
            r9.add(r0)
            goto L_0x0b01
        L_0x0b33:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b3a:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b42:
            java.lang.String r0 = "waJidMapRepository"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0b4a:
            java.lang.Object r0 = r9.get(r8)
            java.lang.String r2 = X.AnonymousClass0x7.A0n(r5, r0, r4, r8, r7)
            X.C162457s7.A0D(r2)
            r1 = 0
            X.21J r0 = X.AnonymousClass21J.REVOKE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r1 = X.AnonymousClass27t.A00(r0, r2, r1, r6)
            r1.A00 = r5
            X.0df r0 = r3.getSupportFragmentManager()
            X.AnonymousClass344.A01(r1, r0)
            return
        L_0x0b66:
            java.lang.Object r6 = r4.A00
            X.34x r6 = (X.C624134x) r6
            java.lang.Object r5 = r4.A01
            X.2Zx r5 = (X.C45402Zx) r5
            java.lang.Object r3 = r4.A02
            X.34x r3 = (X.C624134x) r3
            r2 = 0
            X.2z0 r0 = r6.A1J
            X.4uZ r1 = r0.A00
            if (r1 == 0) goto L_0x0b7e
            X.1hu r0 = r5.A00
            r0.A0A(r1, r2)
        L_0x0b7e:
            X.1io r0 = r5.A01
            r0.A0D(r6, r3)
            return
        L_0x0b84:
            java.lang.Object r5 = r4.A00
            X.33b r5 = (X.C619933b) r5
            java.lang.Object r1 = r4.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Object r9 = r4.A02
            X.34x r9 = (X.C624134x) r9
            java.util.Map r6 = r5.A0Z
            java.util.List r2 = X.C18320x8.A0s(r1, r6)
            if (r2 != 0) goto L_0x0ba0
            r0 = 1
            java.util.List r2 = r5.A05(r1, r0)
            r6.put(r1, r2)
        L_0x0ba0:
            boolean r0 = X.C619933b.A02(r9, r2)
            if (r0 != 0) goto L_0x0ccb
            boolean r3 = r9 instanceof X.C30441mS
            r0 = 1
            r4 = 0
            if (r3 == 0) goto L_0x0c0a
            r3 = r9
            X.1mS r3 = (X.C30441mS) r3
            java.lang.String r7 = r3.A01
            X.C626936e.A06(r7)
            X.2z0 r3 = r9.A1J
            X.4uZ r3 = r3.A00
            X.2z0 r8 = X.AnonymousClass2z0.A05(r3, r7, r4)
        L_0x0bbc:
            int r3 = r2.size()
            if (r4 >= r3) goto L_0x0bf8
            java.lang.Object r6 = r2.get(r4)
            X.2sO r6 = (X.C56682sO) r6
            X.34x r3 = r6.A00
            X.2z0 r3 = r3.A1J
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x0be4
            boolean r3 = r6 instanceof X.C84034At
            if (r3 == 0) goto L_0x0c07
            X.4At r6 = (X.C84034At) r6
            X.2z0 r3 = r6.BAW()
            java.lang.String r3 = r3.A01
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0c07
        L_0x0be4:
            if (r4 < 0) goto L_0x0bf8
            int r3 = r2.size()
            if (r4 >= r3) goto L_0x0bf8
            r2.remove(r4)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0bf8
            r5.A08(r1)
        L_0x0bf8:
            int r4 = r2.size()
            r3 = 7
            if (r4 <= r3) goto L_0x0ccb
            int r3 = X.AnonymousClass002.A04(r2, r0)
            r2.remove(r3)
            goto L_0x0bf8
        L_0x0c07:
            int r4 = r4 + 1
            goto L_0x0bbc
        L_0x0c0a:
            boolean r3 = r9 instanceof X.C30351mJ
            if (r3 != 0) goto L_0x0bf8
            boolean r3 = X.C624134x.A0g(r9)
            if (r3 == 0) goto L_0x0c90
            X.2pu r7 = r9.A0t()
            boolean r3 = X.C624134x.A0g(r9)
            if (r3 == 0) goto L_0x0c90
            if (r7 == 0) goto L_0x0c90
            X.2kn r3 = r7.A02()
            if (r3 == 0) goto L_0x0c90
            X.2z0 r3 = r3.A01
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x0c90
            java.util.Iterator r8 = r2.iterator()
        L_0x0c30:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0c90
            java.lang.Object r7 = r8.next()
            X.2sO r7 = (X.C56682sO) r7
            boolean r3 = r7 instanceof X.AnonymousClass1hM
            if (r3 == 0) goto L_0x0c30
            X.1hM r7 = (X.AnonymousClass1hM) r7
            boolean r3 = X.C624134x.A0g(r9)
            if (r3 == 0) goto L_0x0c30
            X.2pu r3 = r9.A0t()
            if (r3 == 0) goto L_0x0c30
            X.2n4 r3 = r7.A00
            X.2z0 r3 = r3.A04
            X.4uZ r3 = r3.A00
            boolean r3 = X.AnonymousClass2z0.A0E(r9, r3)
            if (r3 == 0) goto L_0x0c30
            r7.A00 = r9
            X.2pu r3 = r9.A0t()
            if (r3 == 0) goto L_0x0c83
            java.lang.Long r5 = r3.A03()
            X.2kn r4 = r3.A02()
            if (r5 == 0) goto L_0x0c83
            if (r4 == 0) goto L_0x0c83
            X.2n4 r3 = r7.A00
            java.util.Set r11 = r3.A05
            r11.add(r5)
            long r12 = r5.longValue()
            X.2z0 r10 = r4.A01
            X.2n4 r8 = new X.2n4
            r14 = r12
            r8.<init>(r9, r10, r11, r12, r14)
            r7.A00 = r8
        L_0x0c83:
            X.3cn r3 = new X.3cn
            r3.<init>(r0)
            java.util.Collections.sort(r2, r3)
            r6.put(r1, r2)
            goto L_0x0bf8
        L_0x0c90:
            boolean r3 = X.C624134x.A0g(r9)
            if (r3 == 0) goto L_0x0cc6
            X.2pu r3 = r9.A0t()
            java.lang.Long r7 = r3.A03()
            long r12 = r7.longValue()
            X.2qz r3 = r5.A0X
            X.34x r6 = X.C55122pp.A00(r3, r12)
            if (r6 == 0) goto L_0x0bf8
            X.2z0 r10 = r6.A1J
            boolean r3 = r10.A02
            if (r3 == 0) goto L_0x0bf8
            java.util.HashSet r11 = X.C18300x5.A0x(r7)
            long r14 = r6.A1M
            X.2n4 r8 = new X.2n4
            r8.<init>(r9, r10, r11, r12, r14)
            X.2VQ r3 = r5.A05
            X.1hM r3 = r3.A00(r8)
        L_0x0cc1:
            r2.add(r4, r3)
            goto L_0x0bf8
        L_0x0cc6:
            X.2sO r3 = r5.A04(r9)
            goto L_0x0cc1
        L_0x0ccb:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/cache/update/"
            X.C18280x3.A1H(r3, r0, r1)
            java.lang.String r0 = X.C619933b.A00(r2)
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r3)
            goto L_0x0cfe
        L_0x0cde:
            java.lang.Object r0 = r4.A00
            X.33b r0 = (X.C619933b) r0
            java.lang.Object r11 = r4.A01
            X.34x r11 = (X.C624134x) r11
            java.lang.Object r10 = r4.A02
            java.lang.String r9 = "messagenotification/cache/reset/"
            if (r11 != 0) goto L_0x0d02
            java.util.Map r1 = r0.A0Z
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r1.put(r10, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r10, r9)
        L_0x0cfa:
            java.lang.String r0 = r1.toString()
        L_0x0cfe:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x0d02:
            java.util.Map r0 = r0.A0Z
            java.util.List r8 = X.C18320x8.A0s(r10, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r10, r9)
            java.lang.String r0 = " msg:"
            X.2z0 r0 = X.C624134x.A08(r11, r0, r1)
            X.C18260x0.A0m(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r10, r9)
            java.lang.String r0 = " before:"
            r1.append(r0)
            java.lang.String r0 = X.C619933b.A00(r8)
            X.C18260x0.A1J(r1, r0)
            if (r8 == 0) goto L_0x0d49
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.Iterator r6 = r8.iterator()
        L_0x0d2f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0d54
            java.lang.Object r5 = r6.next()
            X.2sO r5 = (X.C56682sO) r5
            X.34x r0 = r5.A00
            long r3 = r0.A1M
            long r1 = r11.A1M
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0d2f
            r7.add(r5)
            goto L_0x0d2f
        L_0x0d49:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "messagenotification/cache/reset/list null for "
            X.C18260x0.A1Q(r1, r0, r10)
            goto L_0x0d57
        L_0x0d54:
            r8.removeAll(r7)
        L_0x0d57:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r10, r9)
            java.lang.String r0 = " after:"
            r1.append(r0)
            java.lang.String r0 = X.C619933b.A00(r8)
            r1.append(r0)
            goto L_0x0cfa
        L_0x0d68:
            java.lang.Object r0 = r4.A00
            com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver r0 = (com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver) r0
            java.lang.Object r3 = r4.A01
            X.34x r3 = (X.C624134x) r3
            java.lang.Object r2 = r4.A02
            android.content.Context r2 = (android.content.Context) r2
            X.30o r1 = r0.A02
            X.1p5 r3 = (X.AnonymousClass1p5) r3
            r0 = 0
            r1.A04(r2, r3, r0)
            return
        L_0x0d7d:
            java.lang.Object r7 = r4.A00
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r6 = r4.A01
            X.1jD r6 = (X.AnonymousClass1jD) r6
            java.lang.Object r5 = r4.A02
            X.2Ud r3 = X.C58672vd.A03
            java.lang.String r2 = "query"
            java.lang.Object r1 = r7.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            X.C162457s7.A0K(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.2vd r2 = r3.A00(r2, r1)
            java.lang.String r0 = "args"
            java.lang.Object r4 = r7.get(r0)
            boolean r1 = r4 instanceof java.util.Map
            r0 = 0
            if (r1 == 0) goto L_0x0dd0
            java.util.Map r4 = (java.util.Map) r4
        L_0x0da9:
            X.2id r3 = r6.A01
            java.lang.String r1 = "client"
            java.util.Map r0 = r2.A01
            if (r0 == 0) goto L_0x0dce
            java.lang.Object r2 = r0.get(r1)
            X.2vd r2 = (X.C58672vd) r2
        L_0x0db7:
            X.2wD r1 = X.C59022wD.A00
            X.4DR r0 = r3.A00()
            java.util.Map r1 = r3.A02(r2, r0, r1, r4)
            X.3Wi r6 = r6.A00
            r0 = 34
            X.3Zz r4 = new X.3Zz
            r4.<init>(r5, r0, r1)
        L_0x0dca:
            r6.A0S(r4)
            return
        L_0x0dce:
            r2 = 0
            goto L_0x0db7
        L_0x0dd0:
            r4 = r0
            goto L_0x0da9
        L_0x0dd2:
            java.lang.Object r3 = r4.A00
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r3 = (com.whatsapp.pininchat.banner.PinInChatBannerViewModel) r3
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 0
            r3.A00 = r0
            X.107 r0 = r3.A05
            r0.A0I(r2)
            X.08M r0 = r3.A01
            X.AnonymousClass5YS.A00(r0, r1)
            return
        L_0x0de8:
            java.lang.Object r5 = r4.A00
            X.2qy r5 = (X.C55822qy) r5
            java.lang.Object r6 = r4.A01
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r0 = r4.A02
            r20 = r0
            r9 = 0
            java.lang.String r11 = r5.A02()
            if (r11 != 0) goto L_0x0e1f
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
        L_0x0dff:
            java.util.HashSet r2 = X.AnonymousClass0x9.A15(r6)
            java.util.HashSet r1 = X.AnonymousClass002.A0K()
            java.util.Iterator r4 = r0.iterator()
        L_0x0e0b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0e24
            java.lang.Object r3 = r4.next()
            boolean r0 = r2.remove(r3)
            if (r0 != 0) goto L_0x0e0b
            r1.add(r3)
            goto L_0x0e0b
        L_0x0e1f:
            java.util.Set r0 = r5.A03()
            goto L_0x0dff
        L_0x0e24:
            X.31C r0 = r5.A00
            r19 = r0
            java.lang.String r18 = r19.A03()
            java.lang.String r12 = r5.A03
            java.lang.String r17 = "category"
            X.C162457s7.A0J(r12, r9)
            java.lang.String r10 = "id"
            r8 = 1
            r7 = 2
            r4 = 3
            java.lang.String r0 = "add"
            java.lang.String r3 = "action"
            X.39V r15 = new X.39V
            r15.<init>((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r0 = "remove"
            X.39V r14 = new X.39V
            r14.<init>((java.lang.String) r3, (java.lang.String) r0)
            java.util.ArrayList r13 = X.C73783g4.A0d(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x0e51:
            boolean r0 = r16.hasNext()
            java.lang.String r3 = "jid"
            if (r0 == 0) goto L_0x0e68
            com.whatsapp.jid.Jid r2 = X.AnonymousClass0x7.A0S(r16)
            X.39V[] r0 = new X.AnonymousClass39V[r7]
            r0[r9] = r15
            X.AnonymousClass39V.A02(r2, r3, r0, r8)
            r13.add(r0)
            goto L_0x0e51
        L_0x0e68:
            java.util.ArrayList r2 = X.C73783g4.A0d(r1)
            java.util.Iterator r15 = r1.iterator()
        L_0x0e70:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0e85
            com.whatsapp.jid.Jid r1 = X.AnonymousClass0x7.A0S(r15)
            X.39V[] r0 = new X.AnonymousClass39V[r7]
            r0[r9] = r14
            X.AnonymousClass39V.A02(r1, r3, r0, r8)
            r2.add(r0)
            goto L_0x0e70
        L_0x0e85:
            java.util.List r0 = X.C73723fy.A0K(r2, r13)
            java.util.ArrayList r3 = X.C73783g4.A0d(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0e91:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ea4
            java.lang.Object r1 = r2.next()
            X.39V[] r1 = (X.AnonymousClass39V[]) r1
            java.lang.String r0 = "user"
            X.AnonymousClass36K.A0R(r0, r3, r1)
            goto L_0x0e91
        L_0x0ea4:
            X.36K[] r2 = X.C18280x3.A1a(r3, r9)
            X.39V[] r1 = X.C57442te.A00(r12, r11)
            r0 = r17
            X.36K r1 = X.AnonymousClass36K.A0J(r0, r1, r2)
            r0 = 0
            java.lang.String r3 = "privacy"
            X.36K r2 = X.AnonymousClass36K.A0F(r1, r3, r0)
            X.39V[] r1 = X.AnonymousClass0x9.A1W()
            r0 = r18
            X.AnonymousClass39V.A0B(r10, r0, r1, r9)
            X.AnonymousClass39V.A0E(r1, r8)
            java.lang.String r0 = "xmlns"
            X.AnonymousClass39V.A0D(r0, r3, r1, r7, r4)
            X.36K r4 = X.AnonymousClass36K.A0G(r2, r1)
            r2 = 11
            X.4KX r1 = new X.4KX
            r0 = r20
            r1.<init>(r0, r6, r5, r2)
            boolean r0 = r5 instanceof X.AnonymousClass1kJ
            if (r0 == 0) goto L_0x0eea
            r6 = 292(0x124, float:4.09E-43)
        L_0x0edf:
            r7 = 32000(0x7d00, double:1.581E-319)
            r2 = r19
            r3 = r1
            r5 = r18
            r2.A0E(r3, r4, r5, r6, r7)
            return
        L_0x0eea:
            boolean r0 = r5 instanceof X.AnonymousClass1kI
            if (r0 == 0) goto L_0x0ef1
            r6 = 289(0x121, float:4.05E-43)
            goto L_0x0edf
        L_0x0ef1:
            boolean r0 = r5 instanceof X.AnonymousClass1kH
            if (r0 == 0) goto L_0x0ef8
            r6 = 228(0xe4, float:3.2E-43)
            goto L_0x0edf
        L_0x0ef8:
            r6 = 294(0x126, float:4.12E-43)
            goto L_0x0edf
        L_0x0efb:
            java.lang.Object r6 = r4.A00
            X.2ST r6 = (X.AnonymousClass2ST) r6
            java.lang.Object r5 = r4.A01
            X.2QO r5 = (X.AnonymousClass2QO) r5
            java.lang.Object r3 = r4.A02
            X.2Rf r3 = (X.C43212Rf) r3
            r0 = 2
            java.util.concurrent.CountDownLatch r7 = new java.util.concurrent.CountDownLatch
            r7.<init>(r0)
            com.whatsapp.jid.UserJid r4 = r5.A00
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0f2d
            r7.countDown()
        L_0x0f16:
            X.2Ws r9 = r6.A05
            X.2Hn r0 = r6.A04
            X.1VX r8 = r0.A00
            r0 = 2696(0xa88, float:3.778E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r1 = r8.A0Y(r2, r0)
            X.3SD r0 = new X.3SD
            r0.<init>(r6, r7)
            r9.A00(r4, r0, r1)
            goto L_0x0f5f
        L_0x0f2d:
            X.2Lf r9 = r6.A03
            X.2Le r8 = new X.2Le
            r8.<init>(r6, r7)
            X.2Hn r0 = r9.A01
            X.1VX r2 = r0.A00
            r1 = 2024(0x7e8, float:2.836E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0f4d
            r2 = 0
            X.2ST r1 = r8.A00
            java.util.concurrent.CountDownLatch r0 = r8.A01
            r1.A02 = r2
            r0.countDown()
            goto L_0x0f16
        L_0x0f4d:
            X.2Ec r1 = r9.A00
            r0 = 0
            X.C162457s7.A0J(r4, r0)
            X.33g r2 = r1.A00
            r1 = 0
            X.365 r0 = new X.365
            r0.<init>(r8, r1)
            r2.A05(r0, r4)
            goto L_0x0f16
        L_0x0f5f:
            r7.await()     // Catch:{ InterruptedException -> 0x0fac }
            r0 = 2697(0xa89, float:3.78E-42)
            boolean r0 = r8.A0Y(r2, r0)     // Catch:{ InterruptedException -> 0x0fac }
            if (r0 == 0) goto L_0x0f8f
            java.lang.String r7 = r4.getRawString()     // Catch:{ InterruptedException -> 0x0fac }
        L_0x0f6e:
            java.lang.String r8 = r6.A01     // Catch:{ InterruptedException -> 0x0fac }
            java.lang.String r2 = r6.A02     // Catch:{ InterruptedException -> 0x0fac }
            java.lang.String r1 = r5.A01     // Catch:{ InterruptedException -> 0x0fac }
            boolean r0 = r5.A02     // Catch:{ InterruptedException -> 0x0fac }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch:{ InterruptedException -> 0x0fac }
            X.2vp r4 = new X.2vp     // Catch:{ InterruptedException -> 0x0fac }
            r5 = r4
            r9 = r2
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x0fac }
            X.2pA r2 = r3.A04     // Catch:{ InterruptedException -> 0x0fac }
            int r1 = r3.A00     // Catch:{ InterruptedException -> 0x0fac }
            int r6 = r3.A01     // Catch:{ InterruptedException -> 0x0fac }
            int r7 = r3.A02     // Catch:{ InterruptedException -> 0x0fac }
            long r10 = r3.A03     // Catch:{ InterruptedException -> 0x0fac }
            if (r1 == 0) goto L_0x0f99
            goto L_0x0f91
        L_0x0f8f:
            r7 = 0
            goto L_0x0f6e
        L_0x0f91:
            r0 = 1
            if (r1 == r0) goto L_0x0f95
            goto L_0x0f9d
        L_0x0f95:
            X.2Ol r5 = r2.A01     // Catch:{ InterruptedException -> 0x0fac }
            r8 = 3
            goto L_0x0fa0
        L_0x0f99:
            X.2Ol r5 = r2.A01     // Catch:{ InterruptedException -> 0x0fac }
            r8 = 2
            goto L_0x0fa0
        L_0x0f9d:
            X.2Ol r5 = r2.A01     // Catch:{ InterruptedException -> 0x0fac }
            r8 = 4
        L_0x0fa0:
            r9 = 0
            X.3b0 r3 = new X.3b0     // Catch:{ InterruptedException -> 0x0fac }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ InterruptedException -> 0x0fac }
            X.4FS r0 = r5.A01     // Catch:{ InterruptedException -> 0x0fac }
            r0.BkM(r3)     // Catch:{ InterruptedException -> 0x0fac }
            return
        L_0x0fac:
            r1 = move-exception
            java.lang.String r0 = "CatalogOperationsQplEventAnnotations creation interrupted"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0fb3:
            java.lang.Object r5 = r4.A00
            X.34x r5 = (X.C624134x) r5
            java.lang.Object r3 = r4.A01
            X.5Ul r3 = (X.AnonymousClass5Ul) r3
            java.lang.Object r2 = r4.A02
            X.33m r2 = (X.C621033m) r2
            byte r1 = r5.A1I
            boolean r0 = X.C627636p.A0H(r1)
            if (r0 != 0) goto L_0x0fd5
            boolean r0 = X.C627636p.A0I(r1)
            if (r0 != 0) goto L_0x0fd5
            r0 = 82
            if (r1 == r0) goto L_0x0fd5
            r2.A0P(r5)
            return
        L_0x0fd5:
            X.1mV r5 = (X.C30471mV) r5
            r3.A07(r5)
            return
        L_0x0fdb:
            java.lang.Object r0 = r4.A00
            X.3Qn r0 = (X.C67753Qn) r0
            java.lang.Object r2 = r4.A01
            X.2ov r2 = (X.C54562ov) r2
            java.lang.Object r1 = r4.A02
            X.2z0 r1 = (X.AnonymousClass2z0) r1
            X.33n r0 = r0.A0N
            r0.A0Q(r2, r1)
            return
        L_0x0fed:
            java.lang.Object r3 = r4.A00
            X.3Qn r3 = (X.C67753Qn) r3
            java.lang.Object r2 = r4.A01
            X.1nO r2 = (X.AnonymousClass1nO) r2
            java.lang.Object r6 = r4.A02
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            X.30s r4 = r3.A0x
            java.lang.String r1 = r2.A0H
            if (r1 == 0) goto L_0x1024
            java.lang.String r0 = r2.A0G
            if (r0 == 0) goto L_0x1024
            X.2jp r5 = new X.2jp
            r5.<init>(r1, r0)
        L_0x1008:
            int r0 = r2.A02
            int r8 = r0 + 1
            X.2z0 r0 = r2.A1J
            java.lang.String r7 = r0.A01
            byte[] r0 = r2.A0I
            if (r0 == 0) goto L_0x1022
            X.1VX r2 = r3.A0g
            r1 = 3626(0xe2a, float:5.081E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r9 = r2.A0Y(r0, r1)
        L_0x101e:
            r4.A04(r5, r6, r7, r8, r9)
            return
        L_0x1022:
            r9 = 0
            goto L_0x101e
        L_0x1024:
            r5 = 0
            goto L_0x1008
        L_0x1026:
            java.lang.Object r5 = r4.A00
            X.3Qn r5 = (X.C67753Qn) r5
            java.lang.Object r0 = r4.A01
            X.4FR r0 = (X.AnonymousClass4FR) r0
            java.lang.Object r4 = r4.A02
            X.3dJ r4 = (X.C72183dJ) r4
            r2 = 10000(0x2710, double:4.9407E-320)
            r1 = 0
            r5.A02(r0, r2)     // Catch:{ all -> 0x103c }
            r4.BQt(r1)
            return
        L_0x103c:
            r0 = move-exception
            r4.BQt(r1)
            throw r0
        L_0x1041:
            java.lang.Object r5 = r4.A00
            X.3Qn r5 = (X.C67753Qn) r5
            java.lang.Object r3 = r4.A01
            X.4FR r3 = (X.AnonymousClass4FR) r3
            java.lang.Object r2 = r4.A02
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.A02(r3, r0)     // Catch:{ all -> 0x105b }
            java.util.Set r1 = r5.A1F
            monitor-enter(r1)
            r1.remove(r2)     // Catch:{ all -> 0x1058 }
            monitor-exit(r1)     // Catch:{ all -> 0x1058 }
            return
        L_0x1058:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x1058 }
            throw r0
        L_0x105b:
            r1 = move-exception
            java.util.Set r0 = r5.A1F
            monitor-enter(r0)
            r0.remove(r2)     // Catch:{ all -> 0x1064 }
        L_0x1062:
            monitor-exit(r0)     // Catch:{ all -> 0x1064 }
            goto L_0x1066
        L_0x1064:
            r1 = move-exception
            goto L_0x1062
        L_0x1066:
            throw r1
        L_0x1067:
            java.lang.Object r5 = r4.A00
            X.1gP r5 = (X.AnonymousClass1gP) r5
            java.lang.Object r3 = r4.A01
            X.39T r3 = (X.AnonymousClass39T) r3
            java.lang.Object r1 = r4.A02
            X.36K r1 = (X.AnonymousClass36K) r1
            X.1xL r0 = new X.1xL     // Catch:{ 24Y -> 0x10a4 }
            r0.<init>(r1)     // Catch:{ 24Y -> 0x10a4 }
            X.C18280x3.A14(r0)     // Catch:{ 24Y -> 0x10a4 }
            X.2do r1 = new X.2do     // Catch:{ 24Y -> 0x10a4 }
            r1.<init>()     // Catch:{ 24Y -> 0x10a4 }
            X.1vs r0 = r0.A02     // Catch:{ 24Y -> 0x10a4 }
            java.lang.Object r0 = r0.A00     // Catch:{ 24Y -> 0x10a4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 24Y -> 0x10a4 }
            java.util.List r0 = r1.A01(r0)     // Catch:{ 24Y -> 0x10a4 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ 24Y -> 0x10a4 }
        L_0x108e:
            boolean r0 = r2.hasNext()     // Catch:{ 24Y -> 0x10a4 }
            if (r0 == 0) goto L_0x10a0
            java.lang.Object r1 = r2.next()     // Catch:{ 24Y -> 0x10a4 }
            X.2Md r1 = (X.C41932Md) r1     // Catch:{ 24Y -> 0x10a4 }
            X.32t r0 = r5.A0G     // Catch:{ 24Y -> 0x10a4 }
            r0.A03(r1)     // Catch:{ 24Y -> 0x10a4 }
            goto L_0x108e
        L_0x10a0:
            r5.A03(r3)     // Catch:{ 24Y -> 0x10a4 }
            return
        L_0x10a4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PSANotificationHandler/QpSurface corrupted : "
            X.C18260x0.A1R(r1, r0, r2)
            r5.A04(r3)
            return
        L_0x10b2:
            java.lang.Object r5 = r4.A00
            X.1gP r5 = (X.AnonymousClass1gP) r5
            java.lang.Object r3 = r4.A01
            X.39T r3 = (X.AnonymousClass39T) r3
            java.lang.Object r0 = r4.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            r7 = 0
            java.lang.Object r1 = r0.get(r7)
            X.36K r1 = (X.AnonymousClass36K) r1
            if (r1 == 0) goto L_0x11dc
            java.lang.String r0 = "message"
            java.util.Iterator r6 = X.AnonymousClass36K.A0M(r1, r0)
        L_0x10d1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x11c5
            X.36K r1 = X.C18310x6.A0Y(r6)
            if (r1 == 0) goto L_0x10d1
            java.lang.String r0 = "id"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r1, r0)
            boolean r0 = X.C107575bX.A0F(r1)
            if (r0 != 0) goto L_0x10d1
            X.6kJ r0 = X.C135216kJ.A00
            X.2z0 r1 = X.AnonymousClass2z0.A05(r0, r1, r7)
            X.2qz r0 = r5.A0E
            X.34x r2 = r0.A05(r1)
            if (r2 == 0) goto L_0x10d1
            r4.add(r2)
            X.3Lv r1 = r5.A05
            r0 = 1
            r1.A0d(r2, r0, r0)
            goto L_0x10d1
        L_0x1101:
            java.lang.Object r5 = r4.A00
            X.1gP r5 = (X.AnonymousClass1gP) r5
            java.lang.Object r3 = r4.A01
            X.39T r3 = (X.AnonymousClass39T) r3
            java.lang.Object r6 = r4.A02
            X.36K r6 = (X.AnonymousClass36K) r6
            X.36K r1 = X.AnonymousClass36K.A0D(r6)
            if (r1 == 0) goto L_0x11dc
            java.lang.String r0 = "message"
            java.util.List r0 = r1.A0s(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.Iterator r9 = r0.iterator()
        L_0x1121:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x1197
            X.36K r2 = X.C18310x6.A0Y(r9)
            if (r2 == 0) goto L_0x1121
            java.lang.String r0 = "id"
            java.lang.String r8 = X.AnonymousClass36K.A0L(r2, r0)
            boolean r0 = X.C107575bX.A0F(r8)
            if (r0 != 0) goto L_0x1121
            long r14 = r5.A06(r6)
            java.lang.String r0 = "type"
            java.lang.String r1 = "text"
            java.lang.String r0 = r2.A0r(r0, r1)
            boolean r0 = r1.equalsIgnoreCase(r0)
            r7 = 0
            if (r0 != 0) goto L_0x115a
            X.36K r2 = r2.A0k(r7)
            if (r2 != 0) goto L_0x115a
            java.lang.String r0 = "connection/generateChatPSAFMessage null media"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x1121
        L_0x115a:
            byte[] r0 = r2.A01
            X.1EU r11 = X.AnonymousClass1EU.A00(r0)     // Catch:{ Exception -> 0x118c }
            X.3Le r1 = r5.A0A     // Catch:{ Exception -> 0x118c }
            X.6kJ r2 = X.C135216kJ.A00     // Catch:{ Exception -> 0x118c }
            X.2z0 r13 = X.AnonymousClass2z0.A05(r2, r8, r7)     // Catch:{ Exception -> 0x118c }
            X.C162457s7.A0J(r11, r7)     // Catch:{ Exception -> 0x118c }
            X.C18260x0.A0O(r11, r13)     // Catch:{ Exception -> 0x118c }
            X.2dX r10 = new X.2dX     // Catch:{ Exception -> 0x118c }
            r12 = r11
            r10.<init>(r11, r12, r13, r14)     // Catch:{ Exception -> 0x118c }
            X.2rC r0 = r10.A01()     // Catch:{ Exception -> 0x118c }
            X.34x r1 = r1.A00(r0)     // Catch:{ Exception -> 0x118c }
            r1.A1J(r2)     // Catch:{ Exception -> 0x118c }
            java.lang.String r0 = "WhatsApp"
            r1.A13 = r0     // Catch:{ Exception -> 0x118c }
            r1.A0K = r14     // Catch:{ Exception -> 0x118c }
            r0 = 1
            r1.A1Y = r0     // Catch:{ Exception -> 0x118c }
            r4.add(r1)
            goto L_0x1121
        L_0x118c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "connection/generateChatPSAMultimediaFMessage "
            X.C18260x0.A1Q(r1, r0, r2)
            goto L_0x1121
        L_0x1197:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x11dc
            java.util.Iterator r4 = r4.iterator()
        L_0x11a1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x11d8
            X.34x r2 = X.C18300x5.A0T(r4)
            X.3Lv r0 = r5.A05
            X.2KS r0 = r0.A08(r2)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x11bb
            java.lang.String r0 = "PSANotificationHandler/message added"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x11a1
        L_0x11bb:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PSANotificationHandler/didn't add message: "
            X.C18260x0.A1Q(r1, r0, r2)
            goto L_0x11a1
        L_0x11c5:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x11d8
            X.2hU r0 = r5.A06
            android.os.Handler r1 = r0.A01
            r0 = 33
            X.3a0 r0 = X.C70133a0.A00(r5, r4, r0)
            r1.post(r0)
        L_0x11d8:
            r5.A03(r3)
            return
        L_0x11dc:
            r5.A04(r3)
            return
        L_0x11e0:
            java.lang.Object r5 = r4.A00
            X.1gP r5 = (X.AnonymousClass1gP) r5
            java.lang.Object r3 = r4.A01
            X.39T r3 = (X.AnonymousClass39T) r3
            java.lang.Object r1 = r4.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "recvmessagelistener/on-messages-server-psa"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r2 = X.AnonymousClass000.A0p(r1)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x11fa:
            boolean r0 = r10.hasNext()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r0 == 0) goto L_0x1275
            java.lang.Object r4 = r10.next()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.33F r4 = (X.AnonymousClass33F) r4     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.34x r6 = r4.A05     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            byte[] r0 = r6.A1u()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.1EU r9 = X.AnonymousClass1EU.A00(r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r9 == 0) goto L_0x11fa
            X.2i1 r0 = r5.A0B     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.1EF r7 = r0.A00(r9)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r7 == 0) goto L_0x1272
            int r1 = r7.bitField0_     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x1272
            X.1B4 r1 = r7.actionLink_     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r0 = r1
            if (r1 != 0) goto L_0x1228
            X.1B4 r1 = X.AnonymousClass1B4.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x1228:
            java.lang.String r14 = r1.url_     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r0 != 0) goto L_0x122e
            X.1B4 r0 = X.AnonymousClass1B4.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x122e:
            java.lang.String r15 = r0.buttonTitle_     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x1230:
            X.3Le r8 = r5.A0A     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2z0 r0 = r6.A1J     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2z0 r7 = new X.2z0     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r7.<init>(r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            long r0 = r6.A0K     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2dX r16 = new X.2dX     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r17 = r9
            r18 = r9
            r19 = r7
            r20 = r0
            r16.<init>(r17, r18, r19, r20)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2rC r0 = r16.A01()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.34x r12 = r8.A00(r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.6kJ r0 = X.C135216kJ.A00     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r12.A1J(r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2oU r0 = r5.A03     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            android.content.Context r0 = r0.A00     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            java.lang.String r0 = X.C18320x8.A0a(r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r12.A13 = r0     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            long r0 = r6.A0K     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r12.A0K = r0     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            java.lang.String r13 = r4.A04     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            long r0 = r4.A00     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.33F r11 = new X.33F     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r2.add(r11)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            goto L_0x11fa
        L_0x1272:
            r14 = 0
            r15 = r14
            goto L_0x1230
        L_0x1275:
            X.3Lv r4 = r5.A05     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2m9 r0 = r4.A0O     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            android.os.Handler r0 = r0.A00     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.C626936e.A02(r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            boolean r0 = r2.isEmpty()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r0 != 0) goto L_0x1316
            java.util.Iterator r12 = r2.iterator()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x1288:
            boolean r0 = r12.hasNext()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r0 == 0) goto L_0x1316
            java.lang.Object r2 = r12.next()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.33F r2 = (X.AnonymousClass33F) r2     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.34x r8 = r2.A05     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            boolean r1 = r8.A1W     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r0 = -1
            if (r1 == 0) goto L_0x129d
            r0 = 22
        L_0x129d:
            X.2KS r0 = r4.A09(r8, r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            boolean r9 = r0.A00     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2W5 r7 = r4.A1a     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            long r0 = r8.A1L     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r10 = -1
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x12f0
            boolean r0 = r2.A00()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r0 != 0) goto L_0x12f0
            X.3dV r0 = r7.A00     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.4Fq r7 = r0.A04()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x130c }
            X.C624134x.A0H(r6, r8)     // Catch:{ all -> 0x130c }
            java.lang.String r1 = "campaign_id"
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x130c }
            r6.put(r1, r0)     // Catch:{ all -> 0x130c }
            java.lang.String r10 = "duration"
            long r0 = r2.A00     // Catch:{ all -> 0x130c }
            X.C18270x1.A0c(r6, r10, r0)     // Catch:{ all -> 0x130c }
            java.lang.String r10 = "first_seen_timestamp"
            long r0 = r2.A01     // Catch:{ all -> 0x130c }
            X.C18270x1.A0c(r6, r10, r0)     // Catch:{ all -> 0x130c }
            java.lang.String r1 = "action_link_url"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x130c }
            r6.put(r1, r0)     // Catch:{ all -> 0x130c }
            java.lang.String r1 = "action_link_button_title"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x130c }
            X.2sg r2 = X.AnonymousClass3H0.A03(r6, r7, r1, r0)     // Catch:{ all -> 0x130c }
            java.lang.String r1 = "message_status_psa_campaign"
            java.lang.String r0 = "message_status_psa_campaign.INSERT_OR_REPLACE_STATUS_PSA_CAMPAIGN_FOR_ROW_ID_SQL"
            r2.A0A(r1, r0, r6)     // Catch:{ all -> 0x130c }
            r7.close()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x12f0:
            if (r9 == 0) goto L_0x1288
            X.1hw r1 = r4.A0a     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.2z0 r0 = r8.A1J     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.4uZ r2 = r0.A00     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            java.util.Iterator r1 = X.C61102zi.A03(r1)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x12fc:
            boolean r0 = r1.hasNext()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            if (r0 == 0) goto L_0x1288
            java.lang.Object r0 = r1.next()     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            X.4FI r0 = (X.AnonymousClass4FI) r0     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            r0.BQA(r2)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            goto L_0x12fc
        L_0x130c:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x1311 }
            goto L_0x1315
        L_0x1311:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x1315:
            throw r1     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
        L_0x1316:
            r5.A03(r3)     // Catch:{ 6u5 -> 0x131f, 24W -> 0x131a }
            return
        L_0x131a:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-message-server-psa/bade2e:"
            goto L_0x1323
        L_0x131f:
            r1 = move-exception
            java.lang.String r0 = "recvmessagelistener/on-message-server-psa/invalidproto:"
        L_0x1323:
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x1327:
            java.lang.Object r0 = r4.A00
            X.1gP r0 = (X.AnonymousClass1gP) r0
            java.lang.Object r2 = r4.A01
            X.39T r2 = (X.AnonymousClass39T) r2
            java.lang.Object r7 = r4.A02
            X.36K r7 = (X.AnonymousClass36K) r7
            r3 = 0
            java.lang.String r1 = "notification"
            java.lang.String[] r12 = X.AnonymousClass36K.A0Z(r7, r1)     // Catch:{ Exception -> 0x1463 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r13 = 0
            java.lang.String r11 = "psa"
            java.lang.Long r9 = X.AnonymousClass0x2.A0R()     // Catch:{ Exception -> 0x1463 }
            java.lang.Long r10 = X.AnonymousClass0x2.A0S()     // Catch:{ Exception -> 0x1463 }
            X.C626836d.A06(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x1463 }
            java.lang.String[] r12 = X.AnonymousClass0x9.A1b()     // Catch:{ Exception -> 0x1463 }
            java.lang.Class<com.whatsapp.jid.UserJid> r8 = com.whatsapp.jid.UserJid.class
            r1 = 0
            r11 = r3
            X.C626836d.A06(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x1463 }
            r4 = 81
            X.4Jp r5 = X.C86304Jp.A00(r4)     // Catch:{ Exception -> 0x1463 }
            java.lang.String[] r4 = new java.lang.String[r13]     // Catch:{ Exception -> 0x1463 }
            X.C626836d.A04(r7, r5, r4)     // Catch:{ Exception -> 0x1463 }
            java.lang.String r6 = "promotions"
            java.lang.String r5 = "promotion"
            java.lang.String r4 = "psa_wakeup"
            java.lang.String[] r9 = new java.lang.String[]{r4, r6, r5}     // Catch:{ Exception -> 0x1463 }
            r4 = 82
            X.4Jp r8 = X.C86304Jp.A00(r4)     // Catch:{ Exception -> 0x1463 }
            r10 = 1
            r12 = 10
            java.util.List r5 = X.C626836d.A0B(r7, r8, r9, r10, r12)     // Catch:{ Exception -> 0x1463 }
            boolean r4 = r5.isEmpty()     // Catch:{ Exception -> 0x1463 }
            if (r4 == 0) goto L_0x138c
            java.lang.String r1 = "PSANotificationHandler/empty surface list"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x1463 }
            r0.A04(r2)     // Catch:{ Exception -> 0x1463 }
            return
        L_0x138c:
            java.lang.Object r4 = r5.get(r1)     // Catch:{ Exception -> 0x1463 }
            X.1vt r4 = (X.C34831vt) r4     // Catch:{ Exception -> 0x1463 }
            java.lang.String r6 = "whatsapp_push_notification_event"
            java.lang.String r14 = r4.A00     // Catch:{ Exception -> 0x1463 }
            java.lang.String r15 = r4.A01     // Catch:{ Exception -> 0x1463 }
            android.content.Context r5 = r0.A00     // Catch:{ Exception -> 0x1463 }
            X.2lr r4 = new X.2lr     // Catch:{ Exception -> 0x1463 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x1463 }
            X.3Y7 r13 = new X.3Y7     // Catch:{ Exception -> 0x1463 }
            r13.<init>(r4)     // Catch:{ Exception -> 0x1463 }
            X.2a3 r10 = new X.2a3     // Catch:{ Exception -> 0x1463 }
            r10.<init>(r0, r13, r14)     // Catch:{ Exception -> 0x1463 }
            X.2aP r5 = r0.A0H     // Catch:{ Exception -> 0x1463 }
            r4 = 2
            X.C162457s7.A0J(r14, r4)     // Catch:{ Exception -> 0x1463 }
            X.2x0 r12 = r5.A02     // Catch:{ Exception -> 0x1463 }
            if (r15 != 0) goto L_0x1426
            java.util.Set r5 = X.C18290x4.A13(r14)     // Catch:{ Exception -> 0x1463 }
            r7 = 11231(0x2bdf, float:1.5738E-41)
            X.32t r4 = r12.A02     // Catch:{ Exception -> 0x1463 }
            java.util.List r8 = r4.A02(r6, r7)     // Catch:{ Exception -> 0x1463 }
            java.util.ArrayList r9 = X.C73783g4.A0c(r8)     // Catch:{ Exception -> 0x1463 }
            java.util.Iterator r6 = r8.iterator()     // Catch:{ Exception -> 0x1463 }
        L_0x13c8:
            boolean r4 = r6.hasNext()     // Catch:{ Exception -> 0x1463 }
            if (r4 == 0) goto L_0x13da
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x1463 }
            X.3YL r4 = (X.AnonymousClass3YL) r4     // Catch:{ Exception -> 0x1463 }
            java.lang.String r4 = r4.A0F     // Catch:{ Exception -> 0x1463 }
            r9.add(r4)     // Catch:{ Exception -> 0x1463 }
            goto L_0x13c8
        L_0x13da:
            java.util.Set r4 = X.C73723fy.A0P(r9)     // Catch:{ Exception -> 0x1463 }
            boolean r4 = r5.equals(r4)     // Catch:{ Exception -> 0x1463 }
            if (r4 == 0) goto L_0x13e8
            r12.A00(r10, r13, r8, r5)     // Catch:{ Exception -> 0x1463 }
            goto L_0x145f
        L_0x13e8:
            X.31C r15 = r12.A00     // Catch:{ Exception -> 0x1463 }
            java.lang.String r4 = r15.A03()     // Catch:{ Exception -> 0x1463 }
            r6 = 1
            X.1wa[] r8 = new X.C35261wa[r6]     // Catch:{ Exception -> 0x1463 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x1463 }
            X.1wa r6 = new X.1wa     // Catch:{ Exception -> 0x1463 }
            r6.<init>(r7, r3, r3)     // Catch:{ Exception -> 0x1463 }
            r8[r1] = r6     // Catch:{ Exception -> 0x1463 }
            java.util.ArrayList r6 = X.AnonymousClass8UF.A0m(r8)     // Catch:{ Exception -> 0x1463 }
            r1 = 18
            X.1wk r3 = new X.1wk     // Catch:{ Exception -> 0x1463 }
            r3.<init>((java.lang.String) r4, (int) r1)     // Catch:{ Exception -> 0x1463 }
            X.1xJ r1 = new X.1xJ     // Catch:{ Exception -> 0x1463 }
            r1.<init>((X.C35361wk) r3, (java.util.List) r6)     // Catch:{ Exception -> 0x1463 }
            X.36K r17 = X.C41032Ir.A05(r1)     // Catch:{ Exception -> 0x1463 }
            r14 = 2
            X.4KO r8 = new X.4KO     // Catch:{ Exception -> 0x1463 }
            r9 = r12
            r11 = r1
            r12 = r13
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x1463 }
            r20 = 0
            r19 = 396(0x18c, float:5.55E-43)
            r16 = r8
            r18 = r4
            r15.A0K(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x1463 }
            goto L_0x145f
        L_0x1426:
            r6 = 11231(0x2bdf, float:1.5738E-41)
            X.31C r4 = r12.A00     // Catch:{ Exception -> 0x1463 }
            java.lang.String r3 = r4.A03()     // Catch:{ Exception -> 0x1463 }
            r5 = 1
            X.1wa[] r7 = new X.C35261wa[r5]     // Catch:{ Exception -> 0x1463 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x1463 }
            X.1wa r5 = new X.1wa     // Catch:{ Exception -> 0x1463 }
            r5.<init>(r6, r14, r15)     // Catch:{ Exception -> 0x1463 }
            r7[r1] = r5     // Catch:{ Exception -> 0x1463 }
            java.util.ArrayList r6 = X.AnonymousClass8UF.A0m(r7)     // Catch:{ Exception -> 0x1463 }
            r5 = 18
            X.1wk r1 = new X.1wk     // Catch:{ Exception -> 0x1463 }
            r1.<init>((java.lang.String) r3, (int) r5)     // Catch:{ Exception -> 0x1463 }
            X.1xJ r11 = new X.1xJ     // Catch:{ Exception -> 0x1463 }
            r11.<init>((X.C35361wk) r1, (java.util.List) r6)     // Catch:{ Exception -> 0x1463 }
            X.36K r8 = X.C41032Ir.A05(r11)     // Catch:{ Exception -> 0x1463 }
            X.3T5 r9 = new X.3T5     // Catch:{ Exception -> 0x1463 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x1463 }
            r11 = 0
            r10 = 396(0x18c, float:5.55E-43)
            r7 = r9
            r9 = r3
            r6 = r4
            r6.A0K(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x1463 }
        L_0x145f:
            r0.A03(r2)     // Catch:{ Exception -> 0x1463 }
            return
        L_0x1463:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "PSANotificationHandler/Push PSA corrupted: "
            X.C18260x0.A1Q(r3, r1, r4)
            r0.A04(r2)
            return
        L_0x1471:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "DeviceADVInfoManager/updateDeviceInfoWithExpectedTs user has no device info, user="
            X.C18260x0.A1S(r2, r1, r0)
            return
        L_0x147b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x1480:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x1483:
            X.2gy r1 = r6.A03
            X.47L r0 = new X.47L
            r0.<init>(r5, r4, r3)
            r1.A02(r0)
            return
        L_0x148e:
            X.11P r0 = r5.A1U()
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r0.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x14c1
            X.11P r3 = r5.A1U()
            r2 = 0
            X.C162457s7.A0J(r4, r2)
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r3.A03
            r0 = 1
            X.2fF r0 = r1.A00(r4, r0, r0)
            r0.A00(r3)
            android.view.View r0 = r5.A00
            int r1 = X.C18290x4.A05(r0)
            com.google.android.material.tabs.TabLayout r0 = r5.A04
            if (r0 == 0) goto L_0x14b7
            r0.setVisibility(r1)
        L_0x14b7:
            androidx.viewpager.widget.ViewPager r0 = r5.A03
            if (r0 == 0) goto L_0x14c4
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L_0x14c4
        L_0x14c1:
            r5.A0D = r4
            return
        L_0x14c4:
            r5.A1X(r2)
            androidx.viewpager.widget.ViewPager r0 = r5.A03
            if (r0 == 0) goto L_0x14c1
            r0.setVisibility(r1)
            goto L_0x14c1
        L_0x14cf:
            r1 = move-exception
            if (r9 == 0) goto L_0x14da
            r9.close()     // Catch:{ all -> 0x14d6 }
            throw r1
        L_0x14d6:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x14da:
            throw r1
        L_0x14db:
            X.1fJ r5 = X.AnonymousClass34R.A00(r3)
            X.3Ex r0 = r2.A04
            X.3ZH r9 = r0.A09(r5)
            X.2oU r0 = r2.A06
            android.content.Context r4 = r0.A00
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity"
            X.C627336j.A0E(r3, r5, r1, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r3.addFlags(r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r3.addFlags(r0)
            android.app.PendingIntent r7 = X.C624735e.A04(r4, r3, r6)
            r0 = 2131893104(0x7f121b70, float:1.9420975E38)
            java.lang.String r8 = r4.getString(r0)
            X.0Ue r6 = X.C66553Lw.A01(r4)
            java.lang.String r0 = "group_key_messages"
            r6.A0L = r0
            r4 = 1
            r3 = 8
            android.app.Notification r1 = r6.A07
            int r0 = r1.flags
            r3 = r3 | r0
            r1.flags = r3
            java.lang.String r0 = "other_notifications@1"
            r6.A0K = r0
            X.2sH r0 = r2.A05
            long r0 = r0.A0H()
            r6.A05(r0)
            java.lang.String r0 = r9.A0J()
            r6.A0B(r0)
            r6.A0A(r8)
            r6.A0C(r8)
            r0 = -1
            r6.A03 = r0
            r0 = 3
            r6.A02(r0)
            r6.A0E(r4)
            X.AnonymousClass33T.A01(r7, r6)
            android.app.Notification r3 = r6.A01()
            X.33T r2 = r2.A07
            r1 = 67
            java.lang.String r0 = r5.getRawString()
            r2.A0A(r0, r1, r3)
            return
        L_0x1555:
            r2 = move-exception
            X.2e3 r1 = r5.A02
            X.22M r0 = X.AnonymousClass22M.A0J
            r1.A00(r0, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70353aM.run():void");
    }
}
