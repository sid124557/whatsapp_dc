package X;

/* renamed from: X.3QX  reason: invalid class name */
public class AnonymousClass3QX implements AnonymousClass4DA {
    public final C47872dy A00;

    public int[] B81() {
        return new int[]{242, 243, 244, 245};
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, boolean] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public boolean BFA(android.os.Message r18, int r19) {
        /*
            r17 = this;
            r0 = 242(0xf2, float:3.39E-43)
            r5 = 1
            r6 = r17
            r2 = r18
            r1 = r19
            if (r1 != r0) goto L_0x0180
            java.lang.Object r4 = r2.obj
            X.C626936e.A06(r4)
            X.36K r4 = (X.AnonymousClass36K) r4
            java.lang.String r0 = "pair-device"
            X.36K r1 = r4.A0l(r0)
            if (r1 == 0) goto L_0x07f7
            java.lang.String r0 = "ref"
            java.util.List r0 = r1.A0s(r0)
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.util.Iterator r3 = r0.iterator()
        L_0x002a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004c
            X.36K r2 = X.C18310x6.A0Y(r3)
            java.lang.String r0 = r2.A0n()
            r10.add(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "companion/registration/refs/"
            r1.append(r0)
            java.lang.String r0 = r2.A0n()
            X.C18260x0.A1J(r1, r0)
            goto L_0x002a
        L_0x004c:
            java.lang.String r0 = "id"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r4, r0)
            if (r1 == 0) goto L_0x07f7
            X.2dy r0 = r6.A00
            X.1iA r6 = r0.A00()
            monitor-enter(r6)
            X.2jr r3 = r6.A0S     // Catch:{ all -> 0x017d }
            int r2 = r3.A00()     // Catch:{ all -> 0x017d }
            r0 = 10
            if (r2 < r0) goto L_0x008c
            r0 = 14
            if (r2 > r0) goto L_0x0093
            X.2Vq r0 = r6.A0U     // Catch:{ all -> 0x017d }
            r0.A00(r1)     // Catch:{ all -> 0x017d }
            r0 = 10
            if (r2 != r0) goto L_0x0078
            r0 = 0
            r6.A0H(r0)     // Catch:{ all -> 0x017d }
            goto L_0x017b
        L_0x0078:
            r1 = 14
            if (r2 == r1) goto L_0x0087
            java.lang.String r0 = "companion/registration/refs/reconnected during link code registration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x017d }
            r6.A0C()     // Catch:{ all -> 0x017d }
            r3.A01(r1)     // Catch:{ all -> 0x017d }
        L_0x0087:
            r6.A0H(r5)     // Catch:{ all -> 0x017d }
            goto L_0x017b
        L_0x008c:
            r11 = 3
            r9 = 2
            if (r2 != r11) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            if (r2 == r9) goto L_0x00a5
        L_0x0093:
            java.lang.String r0 = "companion/registration/refs/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x017d }
            goto L_0x017b
        L_0x009a:
            java.lang.String r0 = "companion/registration/refs/reconnected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x017d }
            r3.A01(r9)     // Catch:{ all -> 0x017d }
            r6.A09()     // Catch:{ all -> 0x017d }
        L_0x00a5:
            int r0 = r10.size()     // Catch:{ all -> 0x017d }
            r8 = 6
            if (r0 == r8) goto L_0x00b6
            java.lang.String r0 = "companion/registration/refs/invalid"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x017d }
        L_0x00b1:
            r6.A0B()     // Catch:{ all -> 0x017d }
            goto L_0x017b
        L_0x00b6:
            r3.A01(r11)     // Catch:{ all -> 0x017d }
            X.2Vq r0 = r6.A0U     // Catch:{ all -> 0x017d }
            r0.A00(r1)     // Catch:{ all -> 0x017d }
            java.lang.Runnable r1 = r6.A0B     // Catch:{ all -> 0x017d }
            if (r1 == 0) goto L_0x00c7
            X.4FS r0 = r6.A0o     // Catch:{ all -> 0x017d }
            r0.BjN(r1)     // Catch:{ all -> 0x017d }
        L_0x00c7:
            X.4FS r7 = r6.A0o     // Catch:{ all -> 0x017d }
            r0 = 31
            X.3Zi r3 = X.C69963Zi.A00(r6, r0)     // Catch:{ all -> 0x017d }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.String r2 = "CompanionRegistrationManager/qrRefTimeoutRunnable"
            java.lang.Runnable r0 = r7.Bkn(r3, r2, r0)     // Catch:{ all -> 0x017d }
            r6.A0B = r0     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00eb }
            javax.crypto.SecretKey r0 = r0.generateKey()     // Catch:{ NoSuchAlgorithmException -> 0x00eb }
            byte[] r0 = r0.getEncoded()     // Catch:{ NoSuchAlgorithmException -> 0x00eb }
            r6.A0G = r0     // Catch:{ NoSuchAlgorithmException -> 0x00eb }
            goto L_0x00f1
        L_0x00eb:
            java.lang.String r0 = "companion/registration/qr/failed to get keys"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x017d }
            goto L_0x00b1
        L_0x00f1:
            X.31B r0 = r6.A0I     // Catch:{ all -> 0x017d }
            X.3dh r0 = r0.A05()     // Catch:{ all -> 0x017d }
            X.3dg r13 = r0.A02     // Catch:{ all -> 0x017d }
            r12 = 0
            r4 = 0
        L_0x00fb:
            java.lang.String r3 = "%s,%s,%s,%s,%s"
            r0 = 5
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r10.get(r4)     // Catch:{ all -> 0x017d }
            r2[r12] = r0     // Catch:{ all -> 0x017d }
            byte[] r0 = r13.A01     // Catch:{ all -> 0x017d }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x017d }
            r2[r5] = r0     // Catch:{ all -> 0x017d }
            X.2KK r0 = r6.A05     // Catch:{ all -> 0x017d }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x017d }
            X.2e4 r0 = r0.A01     // Catch:{ all -> 0x017d }
            X.2jv r0 = r0.A00     // Catch:{ all -> 0x017d }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x017d }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x017d }
            r2[r9] = r0     // Catch:{ all -> 0x017d }
            byte[] r0 = r6.A0G     // Catch:{ all -> 0x017d }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x017d }
            r2[r11] = r0     // Catch:{ all -> 0x017d }
            X.2ou r0 = r6.A0T     // Catch:{ all -> 0x017d }
            X.20s r0 = r0.A00()     // Catch:{ all -> 0x017d }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x017d }
            if (r0 == r12) goto L_0x0138
            if (r0 == r9) goto L_0x013b
            java.lang.String r1 = "d"
            goto L_0x013d
        L_0x0138:
            java.lang.String r1 = "e"
            goto L_0x013d
        L_0x013b:
            java.lang.String r1 = "f"
        L_0x013d:
            r0 = 4
            r2[r0] = r1     // Catch:{ all -> 0x017d }
            java.lang.String r15 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x017d }
            int r14 = r4 * 20000
            long r2 = (long) r14     // Catch:{ all -> 0x017d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "CompanionRegistrationManager/refChangeRunnable"
            java.lang.String r14 = X.AnonymousClass000.A0Y(r0, r1, r14)     // Catch:{ all -> 0x017d }
            r1 = 26
            X.3bv r0 = new X.3bv     // Catch:{ all -> 0x017d }
            r0.<init>(r1, r15, r6)     // Catch:{ all -> 0x017d }
            java.lang.Runnable r1 = r7.Bkn(r0, r14, r2)     // Catch:{ all -> 0x017d }
            java.util.List r0 = r6.A0s     // Catch:{ all -> 0x017d }
            r0.add(r1)     // Catch:{ all -> 0x017d }
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x00fb
            X.8qC r0 = r6.A0q     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x017d }
            X.2d2 r0 = (X.C47302d2) r0     // Catch:{ all -> 0x017d }
            r0.A00()     // Catch:{ all -> 0x017d }
            X.8qC r0 = r6.A0p     // Catch:{ all -> 0x017d }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x017d }
            X.2cq r0 = (X.C47182cq) r0     // Catch:{ all -> 0x017d }
            r0.A00()     // Catch:{ all -> 0x017d }
        L_0x017b:
            monitor-exit(r6)
            return r5
        L_0x017d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0180:
            r0 = 243(0xf3, float:3.4E-43)
            if (r1 != r0) goto L_0x050d
            java.lang.Object r4 = r2.obj
            X.C626936e.A06(r4)
            X.36K r4 = (X.AnonymousClass36K) r4
            java.lang.String r0 = "pair-success"
            X.36K r1 = r4.A0l(r0)
            if (r1 == 0) goto L_0x07f7
            java.lang.String r14 = "device-identity"
            X.36K r3 = r1.A0l(r14)
            java.lang.String r0 = "device"
            X.36K r2 = r1.A0l(r0)
            if (r3 == 0) goto L_0x07f7
            if (r2 == 0) goto L_0x07f7
            java.lang.String r13 = "id"
            r1 = 0
            java.lang.String r12 = r4.A0r(r13, r1)
            byte[] r4 = r3.A01
            java.lang.String r0 = "jid"
            java.lang.String r2 = r2.A0r(r0, r1)
            if (r12 == 0) goto L_0x07f7
            if (r4 == 0) goto L_0x07f7
            if (r2 == 0) goto L_0x07f7
            X.2dy r0 = r6.A00
            X.1iA r11 = r0.A00()
            monitor-enter(r11)
            X.2jr r10 = r11.A0S     // Catch:{ all -> 0x082f }
            int r1 = r10.A00()     // Catch:{ all -> 0x082f }
            r0 = 3
            if (r1 == r0) goto L_0x01d4
            r0 = 13
            if (r1 == r0) goto L_0x01d4
            java.lang.String r0 = "companion/registration/pair-success/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            goto L_0x082d
        L_0x01d4:
            com.whatsapp.jid.DeviceJid r9 = com.whatsapp.jid.DeviceJid.getNullable(r2)     // Catch:{ all -> 0x082f }
            if (r9 == 0) goto L_0x0208
            X.30z r2 = r11.A0N     // Catch:{ all -> 0x082f }
            com.whatsapp.jid.UserJid r6 = r9.userJid     // Catch:{ all -> 0x082f }
            java.lang.StringBuilder r3 = X.C18270x1.A0X(r6)     // Catch:{ all -> 0x082f }
            java.lang.String r0 = "AccountSwitcher/isUserJidAlreadyRegistered/"
            r3.append(r0)     // Catch:{ all -> 0x082f }
            java.lang.String r1 = r6.user     // Catch:{ all -> 0x082f }
            r0 = 0
            X.C162457s7.A0J(r1, r0)     // Catch:{ all -> 0x082f }
            r0 = 4
            java.lang.String r0 = X.C107575bX.A0B(r1, r0)     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x01f5
            r1 = r0
        L_0x01f5:
            X.C18260x0.A1L(r3, r1)     // Catch:{ all -> 0x082f }
            X.8qC r0 = r2.A0G     // Catch:{ all -> 0x082f }
            java.util.List r1 = X.C613630k.A00(r0)     // Catch:{ all -> 0x082f }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x0216
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x0216
        L_0x0208:
            r0 = 4
            r10.A01(r0)     // Catch:{ all -> 0x082f }
            java.lang.Runnable r1 = r11.A09     // Catch:{ all -> 0x082f }
            if (r1 == 0) goto L_0x023b
            X.4FS r0 = r11.A0o     // Catch:{ all -> 0x082f }
            r0.BjN(r1)     // Catch:{ all -> 0x082f }
            goto L_0x023b
        L_0x0216:
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x082f }
            r3 = 0
        L_0x021b:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x0237
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x082f }
            X.2nq r0 = (X.C53892nq) r0     // Catch:{ all -> 0x082f }
            java.lang.String r1 = r0.A06     // Catch:{ all -> 0x082f }
            java.lang.String r0 = r6.user     // Catch:{ all -> 0x082f }
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x021b
            int r3 = r3 + 1
            if (r3 >= 0) goto L_0x021b
            goto L_0x04f8
        L_0x0237:
            if (r3 <= 0) goto L_0x0208
            goto L_0x0500
        L_0x023b:
            X.1Bv r0 = X.C21441Bv.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0825 }
            X.6cX r2 = X.C130786cX.A05(r0, r4)     // Catch:{ 6u5 -> 0x0825 }
            X.1Bv r2 = (X.C21441Bv) r2     // Catch:{ 6u5 -> 0x0825 }
            r8 = 0
            if (r2 != 0) goto L_0x0248
            goto L_0x048d
        L_0x0248:
            X.8Lq r0 = r2.hmac_     // Catch:{ all -> 0x082f }
            byte[] r16 = r0.A07()     // Catch:{ all -> 0x082f }
            X.8Lq r0 = r2.details_     // Catch:{ all -> 0x082f }
            byte[] r1 = r0.A07()     // Catch:{ all -> 0x082f }
            int r0 = r2.accountType_     // Catch:{ all -> 0x082f }
            X.239 r7 = X.AnonymousClass239.A00(r0)     // Catch:{ all -> 0x082f }
            byte[] r3 = r11.A0G     // Catch:{ all -> 0x082f }
            X.1VX r6 = r11.A0g     // Catch:{ all -> 0x082f }
            r2 = r1
            if (r3 == 0) goto L_0x048a
            X.239 r4 = X.AnonymousClass239.HOSTED     // Catch:{ all -> 0x082f }
            if (r7 != r4) goto L_0x0278
            r15 = 5673(0x1629, float:7.95E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x082f }
            boolean r0 = r6.A0Y(r0, r15)     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x0278
            r0 = 2
            byte[][] r2 = new byte[r0][]     // Catch:{ all -> 0x082f }
            byte[] r0 = X.C58152un.A0G     // Catch:{ all -> 0x082f }
            byte[] r2 = X.AnonymousClass36A.A03(r0, r1, r2, r8, r5)     // Catch:{ all -> 0x082f }
        L_0x0278:
            byte[] r3 = X.C380825n.A00(r2, r3)     // Catch:{ Exception -> 0x0484 }
            r0 = r16
            byte[] r2 = android.util.Base64.encode(r0, r8)     // Catch:{ all -> 0x082f }
            byte[] r0 = android.util.Base64.encode(r3, r8)     // Catch:{ all -> 0x082f }
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x048a
            java.lang.String r0 = "companion/registration/pair-success/hmac verification passed"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            X.1Cf r0 = X.C21541Cf.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0481 }
            X.6cX r3 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x0481 }
            X.1Cf r3 = (X.C21541Cf) r3     // Catch:{ 6u5 -> 0x0481 }
            X.8Lq r0 = r3.accountSignatureKey_     // Catch:{ all -> 0x082f }
            byte[] r2 = r0.A07()     // Catch:{ all -> 0x082f }
            X.2by r1 = r11.A0R     // Catch:{ all -> 0x082f }
            r0 = 5
            X.2jv r15 = new X.2jv     // Catch:{ all -> 0x082f }
            r15.<init>(r2, r0)     // Catch:{ all -> 0x082f }
            X.2e4 r0 = new X.2e4     // Catch:{ all -> 0x082f }
            r0.<init>(r15)     // Catch:{ all -> 0x082f }
            X.2sH r15 = r1.A03     // Catch:{ all -> 0x082f }
            long r15 = X.C56612sH.A00(r15)     // Catch:{ all -> 0x082f }
            r1.A00 = r15     // Catch:{ all -> 0x082f }
            X.3Ek r15 = r1.A02     // Catch:{ all -> 0x082f }
            X.33n r15 = r15.A03     // Catch:{ all -> 0x082f }
            X.35n r15 = r15.A00     // Catch:{ all -> 0x082f }
            X.2KK r15 = r15.A04()     // Catch:{ all -> 0x082f }
            X.2e4 r15 = r15.A01     // Catch:{ all -> 0x082f }
            java.lang.String r0 = X.C64663Ek.A04(r15, r0)     // Catch:{ all -> 0x082f }
            r1.A01 = r0     // Catch:{ all -> 0x082f }
            X.2KK r0 = r11.A05     // Catch:{ all -> 0x082f }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x082f }
            X.2e4 r0 = r0.A01     // Catch:{ all -> 0x082f }
            X.2jv r0 = r0.A00     // Catch:{ all -> 0x082f }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x082f }
            X.8Lq r1 = r3.accountSignature_     // Catch:{ all -> 0x082f }
            byte[] r1 = r1.A07()     // Catch:{ all -> 0x082f }
            X.8Lq r15 = r3.accountSignatureKey_     // Catch:{ all -> 0x082f }
            byte[] r15 = r15.A07()     // Catch:{ all -> 0x082f }
            if (r7 != r4) goto L_0x02fe
            r7 = 5673(0x1629, float:7.95E-42)
            X.2vE r4 = X.C58422vE.A02     // Catch:{ all -> 0x082f }
            boolean r4 = r6.A0Y(r4, r7)     // Catch:{ all -> 0x082f }
            if (r4 == 0) goto L_0x02fe
            byte[] r6 = X.C58152un.A0G     // Catch:{ all -> 0x082f }
        L_0x02eb:
            r4 = 3
            byte[][] r7 = new byte[r4][]     // Catch:{ all -> 0x082f }
            r7[r8] = r6     // Catch:{ all -> 0x082f }
            X.8Lq r4 = r3.details_     // Catch:{ all -> 0x082f }
            byte[] r4 = r4.A07()     // Catch:{ all -> 0x082f }
            r7[r5] = r4     // Catch:{ all -> 0x082f }
            r6 = 2
            byte[] r4 = X.AnonymousClass36A.A04(r0, r7, r6)     // Catch:{ all -> 0x082f }
            goto L_0x0301
        L_0x02fe:
            byte[] r6 = X.C58152un.A0F     // Catch:{ all -> 0x082f }
            goto L_0x02eb
        L_0x0301:
            byte[][] r7 = new byte[r6][]     // Catch:{ 23X -> 0x0479 }
            byte[] r6 = new byte[r5]     // Catch:{ 23X -> 0x0479 }
            r0 = 5
            r6[r8] = r0     // Catch:{ 23X -> 0x0479 }
            byte[] r0 = X.AnonymousClass36A.A03(r6, r15, r7, r8, r5)     // Catch:{ 23X -> 0x0479 }
            X.2jv r0 = X.AnonymousClass36G.A01(r0)     // Catch:{ 23X -> 0x0479 }
            boolean r0 = X.AnonymousClass36G.A07(r0, r4, r1)     // Catch:{ all -> 0x082f }
            if (r0 == 0) goto L_0x047e
            java.lang.String r0 = "companion/registration/pair-success/account signature verification passed"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            r11.A08 = r3     // Catch:{ all -> 0x082f }
            r11.A0F = r2     // Catch:{ all -> 0x082f }
            r0 = 5
            r10.A01(r0)     // Catch:{ all -> 0x082f }
            r11.A06 = r9     // Catch:{ all -> 0x082f }
            X.1Cf r0 = r11.A08     // Catch:{ 6u5 -> 0x0472 }
            X.8Lq r0 = r0.details_     // Catch:{ 6u5 -> 0x0472 }
            byte[] r1 = r0.A07()     // Catch:{ 6u5 -> 0x0472 }
            X.1D3 r0 = X.AnonymousClass1D3.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0472 }
            X.6cX r9 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x0472 }
            X.1D3 r9 = (X.AnonymousClass1D3) r9     // Catch:{ 6u5 -> 0x0472 }
            X.C626936e.A06(r9)     // Catch:{ all -> 0x082f }
            X.1Cf r3 = r11.A08     // Catch:{ all -> 0x082f }
            X.2KK r0 = r11.A05     // Catch:{ all -> 0x082f }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x082f }
            X.2e4 r0 = r0.A01     // Catch:{ all -> 0x082f }
            X.2jv r6 = r0.A00     // Catch:{ all -> 0x082f }
            X.2KK r0 = r11.A05     // Catch:{ all -> 0x082f }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x082f }
            X.2ew r2 = r0.A00     // Catch:{ all -> 0x082f }
            r0 = 4
            byte[][] r4 = new byte[r0][]     // Catch:{ all -> 0x082f }
            byte[] r0 = X.C58152un.A0H     // Catch:{ all -> 0x082f }
            r4[r8] = r0     // Catch:{ all -> 0x082f }
            X.8Lq r0 = r3.details_     // Catch:{ all -> 0x082f }
            byte[] r0 = r0.A07()     // Catch:{ all -> 0x082f }
            r4[r5] = r0     // Catch:{ all -> 0x082f }
            r1 = 2
            byte[] r0 = r6.A01     // Catch:{ all -> 0x082f }
            r4[r1] = r0     // Catch:{ all -> 0x082f }
            X.8Lq r0 = r3.accountSignatureKey_     // Catch:{ all -> 0x082f }
            byte[] r1 = r0.A07()     // Catch:{ all -> 0x082f }
            r0 = 3
            byte[] r0 = X.AnonymousClass36A.A04(r1, r4, r0)     // Catch:{ all -> 0x082f }
            X.6c9 r3 = r3.A0H()     // Catch:{ all -> 0x082f }
            X.15i r3 = (X.AnonymousClass15i) r3     // Catch:{ all -> 0x082f }
            byte[] r1 = X.AnonymousClass36G.A09(r2, r0)     // Catch:{ all -> 0x082f }
            int r0 = r1.length     // Catch:{ all -> 0x082f }
            r4 = 0
            X.8Lq r2 = X.C18300x5.A0J(r3, r1, r0)     // Catch:{ all -> 0x082f }
            X.6cX r1 = r3.A00     // Catch:{ all -> 0x082f }
            X.1Cf r1 = (X.C21541Cf) r1     // Catch:{ all -> 0x082f }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x082f }
            r0 = r0 | 8
            r1.bitField0_ = r0     // Catch:{ all -> 0x082f }
            r1.deviceSignature_ = r2     // Catch:{ all -> 0x082f }
            X.6cX r0 = r3.A06()     // Catch:{ all -> 0x082f }
            X.1Cf r0 = (X.C21541Cf) r0     // Catch:{ all -> 0x082f }
            r11.A08 = r0     // Catch:{ all -> 0x082f }
            X.6c9 r2 = r0.A0H()     // Catch:{ all -> 0x082f }
            X.15i r2 = (X.AnonymousClass15i) r2     // Catch:{ all -> 0x082f }
            X.6cX r1 = X.C18320x8.A0C(r2)     // Catch:{ all -> 0x082f }
            X.1Cf r1 = (X.C21541Cf) r1     // Catch:{ all -> 0x082f }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x082f }
            r0 = r0 & -3
            r1.bitField0_ = r0     // Catch:{ all -> 0x082f }
            X.1Cf r0 = X.C21541Cf.DEFAULT_INSTANCE     // Catch:{ all -> 0x082f }
            X.8Lq r0 = r0.accountSignatureKey_     // Catch:{ all -> 0x082f }
            r1.accountSignatureKey_ = r0     // Catch:{ all -> 0x082f }
            byte[] r7 = X.C18290x4.A1Z(r2)     // Catch:{ all -> 0x082f }
            X.8qC r0 = r11.A0q     // Catch:{ all -> 0x082f }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x082f }
            X.2d2 r6 = (X.C47302d2) r6     // Catch:{ all -> 0x082f }
            X.1VW r1 = r6.A07     // Catch:{ all -> 0x082f }
            r0 = 6430(0x191e, float:9.01E-42)
            X.2vE r3 = X.C58422vE.A02     // Catch:{ all -> 0x082f }
            boolean r0 = r1.A0Y(r3, r0)     // Catch:{ all -> 0x082f }
            r2 = 0
            if (r0 == 0) goto L_0x03ce
            r6.A00()     // Catch:{ all -> 0x082f }
            com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1 r1 = new com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1     // Catch:{ all -> 0x082f }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x082f }
            X.3du r0 = X.C72553du.A00     // Catch:{ all -> 0x082f }
            java.lang.Object r2 = X.C380725l.A00(r0, r1)     // Catch:{ all -> 0x082f }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x082f }
        L_0x03ce:
            X.8qC r0 = r11.A0p     // Catch:{ all -> 0x082f }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x082f }
            X.2cq r6 = (X.C47182cq) r6     // Catch:{ all -> 0x082f }
            X.1VW r1 = r6.A05     // Catch:{ all -> 0x082f }
            r0 = 7006(0x1b5e, float:9.817E-42)
            boolean r0 = r1.A0Y(r3, r0)     // Catch:{ all -> 0x082f }
            r3 = 0
            if (r0 == 0) goto L_0x03f1
            r6.A00()     // Catch:{ all -> 0x082f }
            com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1 r1 = new com.whatsapp.companionmode.registration.GpiaLifetimeManager$getToken$1     // Catch:{ all -> 0x082f }
            r1.<init>(r6, r3)     // Catch:{ all -> 0x082f }
            X.3du r0 = X.C72553du.A00     // Catch:{ all -> 0x082f }
            java.lang.Object r3 = X.C380725l.A00(r0, r1)     // Catch:{ all -> 0x082f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x082f }
        L_0x03f1:
            int r0 = r9.rawId_     // Catch:{ all -> 0x082f }
            r11.A02 = r0     // Catch:{ all -> 0x082f }
            int r6 = r9.keyIndex_     // Catch:{ all -> 0x082f }
            r11.A00 = r6     // Catch:{ all -> 0x082f }
            long r0 = r9.timestamp_     // Catch:{ all -> 0x082f }
            r11.A03 = r0     // Catch:{ all -> 0x082f }
            X.2Vq r1 = r11.A0U     // Catch:{ all -> 0x082f }
            java.lang.String r9 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x082f }
            java.lang.String r0 = "companion/registration/send-companion-reg-pair-device-sign"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            X.31C r8 = r1.A00     // Catch:{ all -> 0x082f }
            r6 = 307(0x133, float:4.3E-43)
            X.39V[] r1 = new X.AnonymousClass39V[r5]     // Catch:{ all -> 0x082f }
            java.lang.String r0 = "key-index"
            X.AnonymousClass39V.A0B(r0, r9, r1, r4)     // Catch:{ all -> 0x082f }
            X.36K r9 = new X.36K     // Catch:{ all -> 0x082f }
            r9.<init>((java.lang.String) r14, (byte[]) r7, (X.AnonymousClass39V[]) r1)     // Catch:{ all -> 0x082f }
            java.lang.String r1 = "key_attestation"
            X.39V[] r0 = new X.AnonymousClass39V[r4]     // Catch:{ all -> 0x082f }
            X.36K r7 = new X.36K     // Catch:{ all -> 0x082f }
            r7.<init>((java.lang.String) r1, (byte[]) r2, (X.AnonymousClass39V[]) r0)     // Catch:{ all -> 0x082f }
            java.lang.String r2 = "gpia"
            X.39V[] r1 = new X.AnonymousClass39V[r4]     // Catch:{ all -> 0x082f }
            X.36K r0 = new X.36K     // Catch:{ all -> 0x082f }
            r0.<init>((java.lang.String) r2, (java.lang.String) r3, (X.AnonymousClass39V[]) r1)     // Catch:{ all -> 0x082f }
            X.39V[] r3 = new X.AnonymousClass39V[r4]     // Catch:{ all -> 0x082f }
            r2 = 3
            X.36K[] r1 = new X.AnonymousClass36K[r2]     // Catch:{ all -> 0x082f }
            r1[r4] = r9     // Catch:{ all -> 0x082f }
            r1[r5] = r7     // Catch:{ all -> 0x082f }
            r7 = 2
            r1[r7] = r0     // Catch:{ all -> 0x082f }
            java.lang.String r0 = "pair-device-sign"
            X.36K r3 = X.AnonymousClass36K.A0J(r0, r3, r1)     // Catch:{ all -> 0x082f }
            X.39V[] r2 = new X.AnonymousClass39V[r2]     // Catch:{ all -> 0x082f }
            X.AnonymousClass39V.A0E(r2, r4)     // Catch:{ all -> 0x082f }
            java.lang.String r1 = "type"
            java.lang.String r0 = "result"
            X.AnonymousClass39V.A0B(r1, r0, r2, r5)     // Catch:{ all -> 0x082f }
            X.AnonymousClass39V.A0B(r13, r12, r2, r7)     // Catch:{ all -> 0x082f }
            X.36K r0 = X.AnonymousClass36K.A0G(r3, r2)     // Catch:{ all -> 0x082f }
            r8.A0G(r0, r6)     // Catch:{ all -> 0x082f }
            java.lang.Runnable r1 = r11.A0C     // Catch:{ all -> 0x082f }
            if (r1 == 0) goto L_0x045e
            X.4FS r0 = r11.A0o     // Catch:{ all -> 0x082f }
            r0.BjN(r1)     // Catch:{ all -> 0x082f }
        L_0x045e:
            X.4FS r4 = r11.A0o     // Catch:{ all -> 0x082f }
            r0 = 30
            X.3Zi r3 = X.C69963Zi.A00(r11, r0)     // Catch:{ all -> 0x082f }
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.String r0 = "CompanionRegistrationManager/serverRegistrationTimeoutRunnable"
            java.lang.Runnable r0 = r4.Bkn(r3, r0, r1)     // Catch:{ all -> 0x082f }
            r11.A0C = r0     // Catch:{ all -> 0x082f }
            goto L_0x082d
        L_0x0472:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            goto L_0x082a
        L_0x0479:
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityAccountSignature/invalidKeyException"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x082f }
        L_0x047e:
            java.lang.String r0 = "companion/registration/pair-success/account signature verification failed"
            goto L_0x048f
        L_0x0481:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            goto L_0x048f
        L_0x0484:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityHMAC/Failed to calculate hmac-sha256"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x082f }
        L_0x048a:
            java.lang.String r0 = "companion/registration/pair-success/hmac verification failed"
            goto L_0x048f
        L_0x048d:
            java.lang.String r0 = "companion/registration/pair-success/invalid device identity hmac"
        L_0x048f:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            r0 = 6
            r10.A01(r0)     // Catch:{ all -> 0x082f }
            X.2by r2 = r11.A0R     // Catch:{ all -> 0x082f }
            r0 = 401(0x191, double:1.98E-321)
            r2.A00(r5, r0)     // Catch:{ all -> 0x082f }
            X.2Vq r1 = r11.A0U     // Catch:{ all -> 0x082f }
            java.lang.String r0 = "companion/registration/send-companion-reg-verification-failed"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            X.31C r6 = r1.A00     // Catch:{ all -> 0x082f }
            r4 = 306(0x132, float:4.29E-43)
            r7 = 2
            X.39V[] r9 = new X.AnonymousClass39V[r7]     // Catch:{ all -> 0x082f }
            java.lang.String r2 = "code"
            r1 = 401(0x191, float:5.62E-43)
            X.39V r0 = new X.39V     // Catch:{ all -> 0x082f }
            r0.<init>((java.lang.String) r2, (int) r1)     // Catch:{ all -> 0x082f }
            r9[r8] = r0     // Catch:{ all -> 0x082f }
            java.lang.String r1 = "text"
            java.lang.String r0 = "not-authorized"
            X.AnonymousClass39V.A0B(r1, r0, r9, r5)     // Catch:{ all -> 0x082f }
            java.lang.String r3 = "error"
            X.36K r2 = X.AnonymousClass36K.A0I(r3, r9)     // Catch:{ all -> 0x082f }
            r0 = 3
            X.39V[] r1 = new X.AnonymousClass39V[r0]     // Catch:{ all -> 0x082f }
            X.AnonymousClass39V.A0E(r1, r8)     // Catch:{ all -> 0x082f }
            java.lang.String r0 = "type"
            X.AnonymousClass39V.A0B(r0, r3, r1, r5)     // Catch:{ all -> 0x082f }
            X.AnonymousClass39V.A0B(r13, r12, r1, r7)     // Catch:{ all -> 0x082f }
            X.36K r0 = X.AnonymousClass36K.A0G(r2, r1)     // Catch:{ all -> 0x082f }
            r6.A0G(r0, r4)     // Catch:{ all -> 0x082f }
            java.lang.Runnable r1 = r11.A0D     // Catch:{ all -> 0x082f }
            if (r1 == 0) goto L_0x04e4
            X.4FS r0 = r11.A0o     // Catch:{ all -> 0x082f }
            r0.BjN(r1)     // Catch:{ all -> 0x082f }
        L_0x04e4:
            X.4FS r4 = r11.A0o     // Catch:{ all -> 0x082f }
            r0 = 29
            X.3Zi r3 = X.C69963Zi.A00(r11, r0)     // Catch:{ all -> 0x082f }
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r0 = "CompanionRegistrationManager/verificationErrorRunnable"
            java.lang.Runnable r0 = r4.Bkn(r3, r0, r1)     // Catch:{ all -> 0x082f }
            r11.A0D = r0     // Catch:{ all -> 0x082f }
            goto L_0x082d
        L_0x04f8:
            X.AnonymousClass8UF.A0q()     // Catch:{ all -> 0x082f }
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0L()     // Catch:{ all -> 0x082f }
            throw r0     // Catch:{ all -> 0x082f }
        L_0x0500:
            java.lang.String r0 = "companion/registration/pair-success/account already registered on device, cancelling registration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            com.whatsapp.jid.UserJid r0 = r9.userJid     // Catch:{ all -> 0x082f }
            java.lang.String r0 = r0.user     // Catch:{ all -> 0x082f }
            r2.A03 = r0     // Catch:{ all -> 0x082f }
            goto L_0x082a
        L_0x050d:
            r0 = 244(0xf4, float:3.42E-43)
            if (r1 != r0) goto L_0x07fb
            X.2dy r0 = r6.A00
            X.1iA r2 = r0.A00()
            monitor-enter(r2)
            java.lang.String r0 = "companion/registration/complete/success"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
            X.2jr r3 = r2.A0S     // Catch:{ all -> 0x07f8 }
            int r0 = r3.A00()     // Catch:{ all -> 0x07f8 }
            r9 = 5
            if (r0 != r9) goto L_0x07f1
            X.1Cf r0 = r2.A08     // Catch:{ all -> 0x07f8 }
            if (r0 == 0) goto L_0x07f1
            X.33S r0 = r2.A0k     // Catch:{ all -> 0x07f8 }
            r0.A00()     // Catch:{ all -> 0x07f8 }
            X.8qC r6 = r2.A0r     // Catch:{ all -> 0x07f8 }
            boolean r4 = X.C18300x5.A1U(r6)     // Catch:{ all -> 0x07f8 }
            r2.A09()     // Catch:{ all -> 0x07f8 }
            java.lang.Runnable r1 = r2.A0C     // Catch:{ all -> 0x07f8 }
            if (r1 == 0) goto L_0x0541
            X.4FS r0 = r2.A0o     // Catch:{ all -> 0x07f8 }
            r0.BjN(r1)     // Catch:{ all -> 0x07f8 }
        L_0x0541:
            r0 = 7
            r3.A01(r0)     // Catch:{ all -> 0x07f8 }
            com.whatsapp.jid.DeviceJid r10 = r2.A06     // Catch:{ all -> 0x07f8 }
            X.C626936e.A06(r10)     // Catch:{ all -> 0x07f8 }
            X.33p r8 = r2.A0a     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x07f8 }
            r8.A1V(r0)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x07f8 }
            java.lang.String r11 = X.C621333r.A02(r0)     // Catch:{ all -> 0x07f8 }
            X.C626936e.A06(r11)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = X.C107195ar.A03(r0)     // Catch:{ all -> 0x07f8 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x07f8 }
            java.lang.String r7 = X.C18320x8.A0f(r11, r0)     // Catch:{ all -> 0x07f8 }
            r8.A1j(r11, r7)     // Catch:{ all -> 0x07f8 }
            r8.A1t(r4)     // Catch:{ all -> 0x07f8 }
            r8.A1s(r4)     // Catch:{ all -> 0x07f8 }
            X.2Xu r0 = r2.A0V     // Catch:{ all -> 0x07f8 }
            int r3 = r10.getDevice()     // Catch:{ all -> 0x07f8 }
            X.2og r0 = r0.A01     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences$Editor r1 = X.C54412og.A00(r0)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "registration_device_id"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r3)     // Catch:{ all -> 0x07f8 }
            r0.commit()     // Catch:{ all -> 0x07f8 }
            X.2q4 r1 = r2.A0W     // Catch:{ all -> 0x07f8 }
            X.1Cf r0 = r2.A08     // Catch:{ all -> 0x07f8 }
            byte[] r0 = r0.A0F()     // Catch:{ all -> 0x07f8 }
            java.lang.String r3 = X.C18320x8.A0i(r0)     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences$Editor r1 = X.C55262q4.A00(r1)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "adv_signed_identity"
            X.C18270x1.A0j(r1, r0, r3)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = r10.user     // Catch:{ all -> 0x07f8 }
            com.whatsapp.Me r1 = new com.whatsapp.Me     // Catch:{ all -> 0x07f8 }
            r1.<init>(r11, r7, r0)     // Catch:{ all -> 0x07f8 }
            X.2sr r7 = r2.A0K     // Catch:{ all -> 0x07f8 }
            r7.A0P()     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "me"
            boolean r0 = r7.A0Z(r1, r0)     // Catch:{ all -> 0x07f8 }
            if (r0 != 0) goto L_0x05b9
            java.lang.String r0 = "companion/registration/complete/save me object failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
            r2.A0B()     // Catch:{ all -> 0x07f8 }
            goto L_0x07f6
        L_0x05b9:
            r7.A0R(r1)     // Catch:{ all -> 0x07f8 }
            X.3Lt r3 = X.AnonymousClass0x9.A0S(r6)     // Catch:{ all -> 0x07f8 }
            com.whatsapp.jid.UserJid r1 = r10.userJid     // Catch:{ all -> 0x07f8 }
            boolean r0 = r3.A10     // Catch:{ all -> 0x07f8 }
            if (r0 == 0) goto L_0x05c8
            r3.A05 = r1     // Catch:{ all -> 0x07f8 }
        L_0x05c8:
            X.2s0 r1 = r2.A0l     // Catch:{ all -> 0x07f8 }
            com.whatsapp.jid.UserJid r0 = r10.userJid     // Catch:{ all -> 0x07f8 }
            r1.A01(r0, r4, r5)     // Catch:{ all -> 0x07f8 }
            X.2q5 r0 = r2.A0d     // Catch:{ all -> 0x07f8 }
            r0.A01()     // Catch:{ all -> 0x07f8 }
            X.3Er r1 = r2.A0h     // Catch:{ all -> 0x07f8 }
            boolean r0 = r7.A0Y()     // Catch:{ all -> 0x07f8 }
            X.4AF r3 = r1.A0A     // Catch:{ all -> 0x07f8 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x07f8 }
            X.C162457s7.A0J(r3, r4)     // Catch:{ all -> 0x07f8 }
            r0 = 12027(0x2efb, float:1.6853E-41)
            r3.Blk(r1, r0, r4)     // Catch:{ all -> 0x07f8 }
            r3.Blk(r1, r0, r5)     // Catch:{ all -> 0x07f8 }
            r0 = 2
            byte[][] r1 = new byte[r0][]     // Catch:{ 23X -> 0x07e7 }
            byte[] r0 = new byte[r5]     // Catch:{ 23X -> 0x07e7 }
            r0[r4] = r9     // Catch:{ 23X -> 0x07e7 }
            r1[r4] = r0     // Catch:{ 23X -> 0x07e7 }
            byte[] r0 = r2.A0F     // Catch:{ 23X -> 0x07e7 }
            byte[] r0 = X.AnonymousClass36A.A04(r0, r1, r5)     // Catch:{ 23X -> 0x07e7 }
            X.2jv r0 = X.AnonymousClass36G.A01(r0)     // Catch:{ 23X -> 0x07e7 }
            X.2e4 r9 = new X.2e4     // Catch:{ all -> 0x07f8 }
            r9.<init>(r0)     // Catch:{ all -> 0x07f8 }
            X.33n r1 = r2.A0b     // Catch:{ all -> 0x07f8 }
            boolean r0 = r1.A0X()     // Catch:{ all -> 0x07f8 }
            if (r0 == 0) goto L_0x0682
            com.whatsapp.jid.UserJid r0 = r10.userJid     // Catch:{ all -> 0x07f8 }
            X.2ov r0 = X.AnonymousClass36G.A03(r0)     // Catch:{ all -> 0x07f8 }
            r1.A0M(r9, r0)     // Catch:{ all -> 0x07f8 }
        L_0x0614:
            int r3 = r2.A02     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r8)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "adv_raw_id"
            X.C18270x1.A0h(r1, r0, r3)     // Catch:{ all -> 0x07f8 }
            int r3 = r2.A00     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r8)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "adv_current_key_index"
            X.C18270x1.A0h(r1, r0, r3)     // Catch:{ all -> 0x07f8 }
            long r0 = r2.A03     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences$Editor r9 = X.C18270x1.A03(r8)     // Catch:{ all -> 0x07f8 }
            java.lang.String r3 = "adv_timestamp_sec"
            X.C18270x1.A0i(r9, r3, r0)     // Catch:{ all -> 0x07f8 }
            X.2sH r0 = r2.A0Y     // Catch:{ all -> 0x07f8 }
            long r0 = r0.A0H()     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences$Editor r8 = X.C18270x1.A03(r8)     // Catch:{ all -> 0x07f8 }
            java.lang.String r3 = "registration_success_time_ms"
            X.C18270x1.A0i(r8, r3, r0)     // Catch:{ all -> 0x07f8 }
            X.1ht r0 = r2.A0m     // Catch:{ all -> 0x07f8 }
            r0.A08(r4)     // Catch:{ all -> 0x07f8 }
            X.7o6 r3 = new X.7o6     // Catch:{ all -> 0x07f8 }
            r3.<init>()     // Catch:{ all -> 0x07f8 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A05(r7)     // Catch:{ all -> 0x07f8 }
            com.whatsapp.jid.DeviceJid r1 = r0.getPrimaryDevice()     // Catch:{ all -> 0x07f8 }
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()     // Catch:{ all -> 0x07f8 }
            r3.put(r1, r0)     // Catch:{ all -> 0x07f8 }
            X.8OQ r1 = r3.build()     // Catch:{ all -> 0x07f8 }
            X.1iB r0 = r2.A0e     // Catch:{ all -> 0x07f8 }
            r0.A0L(r1, r4, r4)     // Catch:{ all -> 0x07f8 }
            X.3Lt r0 = X.AnonymousClass0x9.A0S(r6)     // Catch:{ all -> 0x07f8 }
            r0.A04()     // Catch:{ all -> 0x07f8 }
            java.util.Iterator r1 = X.C61102zi.A03(r2)     // Catch:{ all -> 0x07f8 }
        L_0x0672:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07f8 }
            if (r0 == 0) goto L_0x0691
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07f8 }
            X.2rf r0 = (X.C56242rf) r0     // Catch:{ all -> 0x07f8 }
            r0.A03()     // Catch:{ all -> 0x07f8 }
            goto L_0x0672
        L_0x0682:
            X.2fm r3 = r2.A0c     // Catch:{ all -> 0x07f8 }
            r0 = 39
            X.3aJ r1 = new X.3aJ     // Catch:{ all -> 0x07f8 }
            r1.<init>(r2, r10, r9, r0)     // Catch:{ all -> 0x07f8 }
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00     // Catch:{ all -> 0x07f8 }
            r0.submit(r1)     // Catch:{ all -> 0x07f8 }
            goto L_0x0614
        L_0x0691:
            X.1hf r9 = r2.A0P     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "CompanionBootstrapManager/startCriticalBootstrap"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A0A     // Catch:{ all -> 0x07f8 }
            r0.set(r4)     // Catch:{ all -> 0x07f8 }
            X.3XA r3 = new X.3XA     // Catch:{ all -> 0x07f8 }
            r3.<init>()     // Catch:{ all -> 0x07f8 }
            X.2yM r1 = r9.A03     // Catch:{ all -> 0x07f8 }
            X.3XA r11 = new X.3XA     // Catch:{ all -> 0x07f8 }
            r11.<init>()     // Catch:{ all -> 0x07f8 }
            r0 = 9
            X.AnonymousClass3XA.A01(r11, r1, r0)     // Catch:{ all -> 0x07f8 }
            X.2K3 r0 = new X.2K3     // Catch:{ all -> 0x07f8 }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x07f8 }
            X.2FR r6 = r1.A03     // Catch:{ all -> 0x07f8 }
            monitor-enter(r6)     // Catch:{ all -> 0x07f8 }
            r6.A00 = r0     // Catch:{ all -> 0x07e4 }
            monitor-exit(r6)     // Catch:{ all -> 0x07f8 }
            r0 = 10
            X.AnonymousClass3XA.A01(r11, r1, r0)     // Catch:{ all -> 0x07f8 }
            X.2q4 r0 = r1.A05     // Catch:{ JSONException -> 0x06e7 }
            org.json.JSONObject r6 = r0.A02()     // Catch:{ JSONException -> 0x06e7 }
            android.content.SharedPreferences r1 = r0.A01()     // Catch:{ JSONException -> 0x06e7 }
            java.lang.String r0 = "HAS_COMPANION_HISTORY_SYNC_FAILED"
            boolean r0 = r1.getBoolean(r0, r4)     // Catch:{ JSONException -> 0x06e7 }
            if (r0 == 0) goto L_0x06d6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x06e7 }
            r11.A05(r0)     // Catch:{ JSONException -> 0x06e7 }
            goto L_0x06ec
        L_0x06d6:
            if (r6 == 0) goto L_0x06ec
            java.lang.String r0 = "sync_type"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x06e7 }
            if (r0 <= 0) goto L_0x06ec
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x06e7 }
            r11.A05(r0)     // Catch:{ JSONException -> 0x06e7 }
            goto L_0x06ec
        L_0x06e7:
            java.lang.String r0 = "ReceiveHistorySyncManager/ unable to parse history sync companion state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
        L_0x06ec:
            X.2S4 r6 = r9.A02     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startCriticalBootstrapPhase started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
            X.3XA r10 = new X.3XA     // Catch:{ all -> 0x07f8 }
            r10.<init>()     // Catch:{ all -> 0x07f8 }
            r0 = 7
            X.AnonymousClass3XA.A01(r10, r6, r0)     // Catch:{ all -> 0x07f8 }
            X.2sr r0 = r6.A00     // Catch:{ all -> 0x07f8 }
            boolean r0 = r0.A0Y()     // Catch:{ all -> 0x07f8 }
            if (r0 != 0) goto L_0x0726
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startCriticalBootstrapPhase device is not companion"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x07f8 }
        L_0x070b:
            r10.A05(r0)     // Catch:{ all -> 0x07f8 }
        L_0x070e:
            X.2Qw r1 = r9.A04     // Catch:{ all -> 0x07f8 }
            X.3XA r12 = new X.3XA     // Catch:{ all -> 0x07f8 }
            r12.<init>()     // Catch:{ all -> 0x07f8 }
            X.3Wz r0 = new X.3Wz     // Catch:{ all -> 0x07f8 }
            r0.<init>()     // Catch:{ all -> 0x07f8 }
            r12.A03(r0)     // Catch:{ all -> 0x07f8 }
            X.2K4 r0 = new X.2K4     // Catch:{ all -> 0x07f8 }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x07f8 }
            X.2FS r6 = r1.A01     // Catch:{ all -> 0x07f8 }
            monitor-enter(r6)     // Catch:{ all -> 0x07f8 }
            goto L_0x0764
        L_0x0726:
            X.2q4 r7 = r6.A03     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences r0 = r7.A01()     // Catch:{ all -> 0x07f8 }
            java.lang.String r1 = "companion_syncd_critical_bootstrap_state"
            int r0 = r0.getInt(r1, r4)     // Catch:{ all -> 0x07f8 }
            if (r0 == 0) goto L_0x074b
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startCriticalBootstrapPhase called when bootstrap already started"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
            android.content.SharedPreferences r0 = r7.A01()     // Catch:{ all -> 0x07f8 }
            int r1 = r0.getInt(r1, r4)     // Catch:{ all -> 0x07f8 }
            r0 = 3
            boolean r0 = X.C18280x3.A1U(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x07f8 }
            goto L_0x070b
        L_0x074b:
            X.4K3 r1 = new X.4K3     // Catch:{ all -> 0x07f8 }
            r1.<init>(r10, r4, r6)     // Catch:{ all -> 0x07f8 }
            X.1i6 r0 = r6.A01     // Catch:{ all -> 0x07f8 }
            r0.A06(r1)     // Catch:{ all -> 0x07f8 }
            X.4Jl r0 = new X.4Jl     // Catch:{ all -> 0x07f8 }
            r0.<init>(r6, r4, r1)     // Catch:{ all -> 0x07f8 }
            r10.A03(r0)     // Catch:{ all -> 0x07f8 }
            X.4FS r1 = r6.A05     // Catch:{ all -> 0x07f8 }
            r0 = 6
            X.C69963Zi.A01(r1, r6, r0)     // Catch:{ all -> 0x07f8 }
            goto L_0x070e
        L_0x0764:
            r6.A00 = r0     // Catch:{ all -> 0x07e4 }
            monitor-exit(r6)     // Catch:{ all -> 0x07f8 }
            r0 = 11
            X.AnonymousClass3XA.A01(r12, r1, r0)     // Catch:{ all -> 0x07f8 }
            java.lang.Object r6 = r1.A04     // Catch:{ all -> 0x07f8 }
            monitor-enter(r6)     // Catch:{ all -> 0x07f8 }
            X.2q4 r0 = r1.A02     // Catch:{ all -> 0x07e1 }
            android.content.SharedPreferences r1 = r0.A01()     // Catch:{ all -> 0x07e1 }
            java.lang.String r0 = "has_received_security_notification_setting"
            boolean r0 = r1.getBoolean(r0, r4)     // Catch:{ all -> 0x07e1 }
            if (r0 == 0) goto L_0x0782
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x07e1 }
            r12.A05(r0)     // Catch:{ all -> 0x07e1 }
        L_0x0782:
            monitor-exit(r6)     // Catch:{ all -> 0x07e1 }
            r0 = 6
            X.AnonymousClass3XA.A01(r11, r9, r0)     // Catch:{ all -> 0x07f8 }
            X.AnonymousClass3XA.A01(r10, r9, r0)     // Catch:{ all -> 0x07f8 }
            X.AnonymousClass3XA.A01(r12, r9, r0)     // Catch:{ all -> 0x07f8 }
            r0 = 3
            r1 = 2
            X.3XA[] r0 = new X.AnonymousClass3XA[r0]     // Catch:{ all -> 0x07f8 }
            r0[r4] = r10     // Catch:{ all -> 0x07f8 }
            r0[r5] = r11     // Catch:{ all -> 0x07f8 }
            java.util.List r0 = X.AnonymousClass0x9.A1A(r12, r0, r1)     // Catch:{ all -> 0x07f8 }
            X.1I2 r4 = new X.1I2     // Catch:{ all -> 0x07f8 }
            r4.<init>(r0)     // Catch:{ all -> 0x07f8 }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ all -> 0x07f8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = "before schedule: waWorker="
            r1.append(r0)     // Catch:{ all -> 0x07f8 }
            X.4FS r7 = r9.A09     // Catch:{ all -> 0x07f8 }
            int r0 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x07f8 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ all -> 0x07f8 }
            r6.println(r0)     // Catch:{ all -> 0x07f8 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x07f8 }
            X.3Mh r1 = r9.A01     // Catch:{ all -> 0x07f8 }
            X.1Ek r0 = X.C66663Mh.A1W     // Catch:{ all -> 0x07f8 }
            int r0 = r1.A03(r0)     // Catch:{ all -> 0x07f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x07f8 }
            long r0 = r6.toMillis(r0)     // Catch:{ all -> 0x07f8 }
            r13 = 28
            X.3cM r8 = new X.3cM     // Catch:{ all -> 0x07f8 }
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (int) r13)     // Catch:{ all -> 0x07f8 }
            java.lang.String r6 = "CompanionBootstrapManager/critical-bootstrap"
            java.lang.Runnable r6 = r7.Bkn(r8, r6, r0)     // Catch:{ all -> 0x07f8 }
            r1 = 0
            X.4Jh r0 = new X.4Jh     // Catch:{ all -> 0x07f8 }
            r0.<init>(r6, r9, r3, r1)     // Catch:{ all -> 0x07f8 }
            r4.A03(r0)     // Catch:{ all -> 0x07f8 }
            r0 = 14
            X.AnonymousClass3XA.A01(r3, r2, r0)     // Catch:{ all -> 0x07f8 }
            goto L_0x07f6
        L_0x07e1:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x07e1 }
            goto L_0x07e6
        L_0x07e4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x07f8 }
        L_0x07e6:
            throw r0     // Catch:{ all -> 0x07f8 }
        L_0x07e7:
            java.lang.String r0 = "companion/registration/complete/failed to save primary public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
            r0 = 0
            r2.A0G(r0, r5, r5)     // Catch:{ all -> 0x07f8 }
            goto L_0x07f6
        L_0x07f1:
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07f8 }
        L_0x07f6:
            monitor-exit(r2)
        L_0x07f7:
            return r5
        L_0x07f8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x07fb:
            r0 = 245(0xf5, float:3.43E-43)
            if (r1 != r0) goto L_0x0832
            X.2dy r0 = r6.A00
            X.1iA r11 = r0.A00()
            monitor-enter(r11)
            java.lang.String r0 = "companion/registration/complete/failure"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            X.2by r3 = r11.A0R     // Catch:{ all -> 0x082f }
            r2 = 2
            r0 = 516(0x204, double:2.55E-321)
            r3.A00(r2, r0)     // Catch:{ all -> 0x082f }
            X.2jr r0 = r11.A0S     // Catch:{ all -> 0x082f }
            int r1 = r0.A00()     // Catch:{ all -> 0x082f }
            r0 = 5
            if (r1 == r0) goto L_0x082a
            r0 = 6
            if (r1 == r0) goto L_0x082a
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x082f }
            goto L_0x082d
        L_0x0825:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity HMAC"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x082f }
        L_0x082a:
            r11.A0B()     // Catch:{ all -> 0x082f }
        L_0x082d:
            monitor-exit(r11)
            return r5
        L_0x082f:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0832:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QX.BFA(android.os.Message, int):boolean");
    }

    public AnonymousClass3QX(C47872dy r1) {
        this.A00 = r1;
    }
}
