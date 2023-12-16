package X;

import android.content.Context;

/* renamed from: X.3D6  reason: invalid class name */
public class AnonymousClass3D6 implements AnonymousClass66U {
    public final Context A00;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03f5 A[LOOP:1: B:77:0x03ef->B:79:0x03f5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0420  */
    public void BMd() {
        /*
            r67 = this;
            r0 = r67
            android.content.Context r0 = r0.A00
            r66 = r0
            java.lang.String r0 = "app-init/async/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Db r0 = X.C389229y.A01(r66)
            X.2oU r38 = r0.BsL()
            X.1VX r34 = r0.Avy()
            X.3Wi r32 = X.C64333Db.A04(r0)
            X.2sr r35 = r0.BL4()
            X.3FI r52 = r0.BsC()
            X.4FS r36 = r0.BsP()
            X.4FV r51 = r0.BsT()
            X.2s4 r54 = r0.Bq6()
            X.310 r50 = r0.B2w()
            X.4C1 r1 = r0.AYO
            java.lang.Object r43 = r1.get()
            r1 = r43
            X.7nK r1 = (X.C160257nK) r1
            r43 = r1
            X.4C1 r1 = r0.Aae
            java.lang.Object r11 = r1.get()
            X.2pr r11 = (X.C55142pr) r11
            X.1ht r49 = r0.BKO()
            X.4C1 r1 = r0.AQi
            java.lang.Object r48 = r1.get()
            r1 = r48
            X.3Au r1 = (X.AnonymousClass3Au) r1
            r48 = r1
            X.4C1 r1 = r0.AXI
            java.lang.Object r18 = r1.get()
            r1 = r18
            X.2zf r1 = (X.C61072zf) r1
            r18 = r1
            X.4C1 r1 = r0.A4T
            r1.get()
            X.4C1 r1 = r0.A7x
            java.lang.Object r47 = r1.get()
            X.3Db r1 = r0.AcK
            X.5bk r7 = r1.A00
            X.4C1 r1 = r7.A5O
            java.lang.Object r9 = r1.get()
            X.2RD r9 = (X.AnonymousClass2RD) r9
            X.4C1 r1 = r0.AW6
            java.lang.Object r20 = r1.get()
            r1 = r20
            X.2fm r1 = (X.C48972fm) r1
            r20 = r1
            X.33i r33 = X.C64333Db.A2o(r0)
            X.33j r57 = r0.BsW()
            X.4C1 r1 = r0.A7i
            java.lang.Object r21 = r1.get()
            r1 = r21
            X.2el r1 = (X.C48352el) r1
            r21 = r1
            X.4C1 r1 = r7.A7G
            java.lang.Object r46 = r1.get()
            X.4C1 r1 = r0.AJN
            r1.get()
            X.4C1 r1 = r0.A2b
            java.lang.Object r6 = r1.get()
            X.2sq r6 = (X.C56962sq) r6
            X.4C1 r1 = r0.A56
            java.lang.Object r17 = r1.get()
            r1 = r17
            X.1R1 r1 = (X.AnonymousClass1R1) r1
            r17 = r1
            X.4C1 r1 = r0.AU8
            java.lang.Object r15 = r1.get()
            X.2pq r15 = (X.C55132pq) r15
            X.4C1 r1 = r0.AYH
            java.lang.Object r45 = r1.get()
            r1 = r45
            X.2e2 r1 = (X.C47912e2) r1
            r45 = r1
            X.4C1 r1 = r0.Aak
            java.lang.Object r16 = r1.get()
            r1 = r16
            X.3DP r1 = (X.AnonymousClass3DP) r1
            r16 = r1
            X.4C1 r1 = r0.AbT
            java.lang.Object r14 = r1.get()
            com.whatsapp.nativelibloader.WhatsAppLibLoader r14 = (com.whatsapp.nativelibloader.WhatsAppLibLoader) r14
            X.4C1 r1 = r0.A14
            java.lang.Object r22 = r1.get()
            r1 = r22
            X.2m9 r1 = (X.C52852m9) r1
            r22 = r1
            X.4C1 r1 = r0.A6b
            java.lang.Object r10 = r1.get()
            X.3Cq r10 = (X.C64223Cq) r10
            X.4C1 r1 = r7.A7J
            java.lang.Object r19 = r1.get()
            r1 = r19
            X.2be r1 = (X.C46452be) r1
            r19 = r1
            X.3dV r31 = r0.BLG()
            X.4C1 r1 = r0.ATf
            java.lang.Object r44 = r1.get()
            X.5ZR r29 = r0.BsN()
            X.33p r28 = r0.BsO()
            X.33T r42 = r0.BsM()
            X.4C1 r1 = r0.A7l
            java.lang.Object r23 = r1.get()
            r1 = r23
            X.2Yh r1 = (X.C45002Yh) r1
            r23 = r1
            X.4C1 r1 = r0.A9E
            java.lang.Object r37 = r1.get()
            r1 = r37
            X.2pj r1 = (X.C55062pj) r1
            r37 = r1
            X.4C1 r1 = r0.AJA
            java.lang.Object r24 = r1.get()
            r1 = r24
            X.33o r1 = (X.C621233o) r1
            r24 = r1
            X.4C1 r1 = r7.A7v
            java.lang.Object r8 = r1.get()
            X.2hg r8 = (X.C50132hg) r8
            X.4C1 r1 = r0.A7f
            java.lang.Object r62 = r1.get()
            X.4C1 r1 = r0.ATh
            java.lang.Object r13 = r1.get()
            X.2jE r13 = (X.C51072jE) r13
            X.2y5 r25 = X.C64333Db.A74(r0)
            X.4C1 r1 = r7.A8L
            java.lang.Object r64 = r1.get()
            X.4C1 r1 = r0.Aam
            X.8qC r1 = X.C72343dZ.A00(r1)
            java.lang.Object r26 = r1.get()
            r1 = r26
            X.2og r1 = (X.C54412og) r1
            r26 = r1
            X.4C1 r1 = r7.A0S
            java.lang.Object r27 = r1.get()
            r1 = r27
            X.2gX r1 = (X.C49442gX) r1
            r27 = r1
            X.4C1 r1 = r0.A6q
            java.lang.Object r5 = r1.get()
            X.2ZW r5 = (X.AnonymousClass2ZW) r5
            X.4C1 r1 = r0.A5w
            java.lang.Object r41 = r1.get()
            r1 = r41
            X.2dy r1 = (X.C47872dy) r1
            r41 = r1
            X.4C1 r1 = r7.A3j
            java.lang.Object r4 = r1.get()
            X.2vq r4 = (X.C58802vq) r4
            X.2cy r3 = r0.Ar5()
            X.0hc r40 = r0.BEj()
            X.4C1 r1 = r0.AYV
            java.lang.Object r39 = r1.get()
            X.4C1 r1 = r7.A0T
            java.lang.Object r2 = r1.get()
            X.5Ni r2 = (X.C103535Ni) r2
            X.4C1 r0 = r0.AKl
            java.lang.Object r30 = r0.get()
            java.lang.String r12 = "_has_set_default_values"
            r1 = 0
            r0 = r66
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r12, r1)
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r0.getBoolean(r12, r1)
            if (r0 != 0) goto L_0x01cd
            r12 = 1
            X.3cG r1 = new X.3cG
            r0 = r47
            r1.<init>((java.lang.Object) r0, (int) r12)
            r0 = r32
            r0.A0S(r1)
        L_0x01cd:
            boolean r0 = r14.A03()
            if (r0 == 0) goto L_0x0272
            r51.Bpp()
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x01e2
            com.whatsapp.Me r0 = X.C56972sr.A00(r35)
            if (r0 != 0) goto L_0x0204
        L_0x01e2:
            X.2XL r0 = r48.BBI()
            java.lang.String r0 = r0.A01
            r53 = r11
            r55 = r38
            r56 = r28
            r58 = r15
            r59 = r52
            r60 = r36
            r61 = r0
            boolean r0 = r53.A03(r54, r55, r56, r57, r58, r59, r60, r61)
            if (r0 != 0) goto L_0x0204
            java.lang.String r0 = "LegacyAppAsyncInit/runAsyncInits/waMsysSetup.bootstrapForReg failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.C386328l.A00(r32)
        L_0x0204:
            monitor-enter(r11)
            boolean r0 = r11.A01     // Catch:{ all -> 0x0247 }
            if (r0 != 0) goto L_0x024a
            java.lang.String r0 = "WaMsysSetup/bootstrapForMMS"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0247 }
            r0 = 32
            byte[] r1 = new byte[r0]     // Catch:{ Exception -> 0x0241 }
            java.lang.String r0 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0)     // Catch:{ Exception -> 0x0241 }
            r0.nextBytes(r1)     // Catch:{ Exception -> 0x0241 }
            r0 = r38
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0247 }
            r55 = r11
            r56 = r0
            r57 = r54
            r58 = r15
            r59 = r52
            r60 = r36
            r55.A02(r56, r57, r58, r59, r60)     // Catch:{ all -> 0x0247 }
            X.2XE r0 = r11.A0F     // Catch:{ all -> 0x0247 }
            com.facebook.msys.mci.NetworkSession r13 = r0.A00()     // Catch:{ all -> 0x0247 }
            r12 = 0
            r0 = r46
            com.whatsapp.wamsys.JniBridge.jvidispatchIOOO(r12, r13, r0, r1)     // Catch:{ all -> 0x0247 }
            com.facebook.msys.mci.JsonSerialization.initialize()     // Catch:{ all -> 0x0247 }
            r0 = 1
            r11.A01 = r0     // Catch:{ all -> 0x0247 }
            goto L_0x024a
        L_0x0241:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)     // Catch:{ all -> 0x0247 }
            throw r0     // Catch:{ all -> 0x0247 }
        L_0x0247:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x024a:
            monitor-exit(r11)
            com.whatsapp.Me r0 = X.C56972sr.A00(r35)
            if (r0 == 0) goto L_0x0272
            boolean r0 = X.C72303dV.A00(r31)
            if (r0 == 0) goto L_0x0272
            r0 = r33
            r2.A00(r0)
            java.lang.String r0 = "contactsyncmethods/executeStoredRequests"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Cn r11 = r10.A0A
            X.3dI r2 = r11.A0T
            r1 = 35
            X.3Zj r0 = new X.3Zj
            r0.<init>(r11, r1)
            r2.execute(r0)
            r10.A05()
        L_0x0272:
            r0 = r52
            X.33j r0 = r0.A06
            java.util.Set r1 = r0.A0A
            r0 = r52
            r1.add(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x028e
            r0 = 32
            if (r1 > r0) goto L_0x028e
            r1 = r66
            r0 = r33
            X.AnonymousClass327.A00(r1, r0)
        L_0x028e:
            X.3dI r2 = r4.A04
            r1 = 22
            X.3bs r0 = new X.3bs
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.execute(r0)
            r1 = 3005(0xbbd, float:4.211E-42)
            X.2vE r14 = X.C58422vE.A02
            r0 = r34
            boolean r0 = r0.A0Y(r14, r1)
            if (r0 == 0) goto L_0x034a
            java.lang.String r0 = "NetworkResourcesManager/queueEagerResourcesToFetch"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2Oc r4 = r8.A04
            monitor-enter(r4)
            java.util.Map r0 = r4.A00     // Catch:{ all -> 0x0342 }
            if (r0 != 0) goto L_0x032a
            java.util.HashMap r11 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0342 }
            r4.A00 = r11     // Catch:{ all -> 0x0342 }
            java.lang.String r2 = "android_to_ios_start"
            java.lang.String r1 = "android_to_ios_start.png"
            r0 = 843(0x34b, float:1.181E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0342 }
            X.2vJ r0 = new X.2vJ     // Catch:{ all -> 0x0342 }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x0342 }
            r11.put(r2, r0)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "android_to_ios_start_night"
            java.lang.String r0 = "android_to_ios_start_night.png"
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "android_to_ios_in_progress"
            java.lang.String r0 = "android_to_ios_in_progress.png"
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "android_to_ios_in_progress_night"
            java.lang.String r0 = "android_to_ios_in_progress_night.png"
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "android_to_ios_error"
            java.lang.String r0 = "android_to_ios_error.png"
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "android_to_ios_error_night"
            java.lang.String r0 = "android_to_ios_error_night.png"
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "chat_transfer_android_to_android_lottie_animation"
            X.2vJ r0 = new X.2vJ     // Catch:{ all -> 0x0342 }
            r0.<init>()     // Catch:{ all -> 0x0342 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "sticker_sample_celebrate"
            java.lang.String r0 = "sticker_sample_celebrate.png"
            r10 = 4445(0x115d, float:6.229E-42)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0342 }
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "sticker_sample_love"
            java.lang.String r0 = "sticker_sample_love.png"
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x0342 }
            java.lang.String r1 = "sticker_sample_laugh"
            java.lang.String r0 = "sticker_sample_laugh.png"
            X.C58472vJ.A00(r10, r1, r0, r2)     // Catch:{ all -> 0x0342 }
        L_0x032a:
            java.util.Map r1 = r4.A00     // Catch:{ all -> 0x0342 }
            monitor-exit(r4)
            r0 = 1
            r8.A01(r1, r0)
            java.lang.String r0 = "NetworkResourcesManager/queueLazyResourcesToFetch"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            monitor-enter(r4)
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x0342 }
            if (r1 != 0) goto L_0x0345
            java.util.HashMap r1 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0342 }
            r4.A01 = r1     // Catch:{ all -> 0x0342 }
            goto L_0x0345
        L_0x0342:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0345:
            monitor-exit(r4)
            r0 = 0
            r8.A01(r1, r0)
        L_0x034a:
            r8 = 2
            java.lang.String r1 = "AppInit2"
            r0 = r42
            r0.A05(r8, r1)
            java.lang.String r13 = "app-init/permissions/"
            r12 = 4
            java.io.File[] r11 = new java.io.File[r12]     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.io.File r0 = r66.getFilesDir()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            r10 = 0
            r11[r10] = r0     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.io.File r0 = r66.getFilesDir()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            r4 = 1
            r11[r4] = r0     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.io.File r1 = r66.getFilesDir()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.lang.String r0 = "Logs"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            r11[r8] = r0     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.lang.String r1 = "msgstore.db"
            r0 = r66
            java.io.File r0 = r0.getDatabasePath(r1)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.io.File r1 = r0.getParentFile()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            r0 = 3
            r11[r0] = r1     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
        L_0x0385:
            r2 = r11[r10]     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            X.C18270x1.A0y(r2, r13, r1)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.lang.String r0 = " w="
            r1.append(r0)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            boolean r0 = r2.canWrite()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            X.C18260x0.A1V(r1, r0)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            boolean r0 = r2.canWrite()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            if (r0 != 0) goto L_0x03b3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            X.C18270x1.A0y(r2, r13, r1)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            java.lang.String r0 = " set w="
            r1.append(r0)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            boolean r0 = r2.setWritable(r4, r4)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
            X.C18260x0.A1V(r1, r0)     // Catch:{ Exception -> 0x03cc, NoSuchMethodError -> 0x03b8 }
        L_0x03b3:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x03d2
            goto L_0x0385
        L_0x03b8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app-init/checkpermissions/nomethod ("
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0e(r1)
            goto L_0x03cf
        L_0x03cc:
            r2 = move-exception
            java.lang.String r0 = "app-init/checkpermissions/error "
        L_0x03cf:
            com.whatsapp.util.Log.i(r0, r2)
        L_0x03d2:
            r45.A00()
            r10 = 39
            X.3aL r4 = new X.3aL
            r2 = r66
            r1 = r50
            r0 = r39
            r4.<init>(r2, r1, r0, r10)
            r0 = r21
            r0.A01(r4)
            r0 = r49
            boolean r1 = r0.A00
            java.util.Iterator r2 = X.C61102zi.A03(r49)
        L_0x03ef:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03ff
            java.lang.Object r0 = r2.next()
            X.4BF r0 = (X.AnonymousClass4BF) r0
            r0.BVu(r1)
            goto L_0x03ef
        L_0x03ff:
            r0 = r49
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x041c
            boolean r2 = r35.A0Y()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app-init/async/loginfailed + inCompanion="
            X.C18260x0.A1E(r0, r1, r2)
            if (r2 == 0) goto L_0x0422
            r4 = 0
            r2 = 1
            r1 = 0
            r0 = r41
            r0.A01(r4, r1, r2)
        L_0x041c:
            X.2as r0 = r9.A03
            if (r0 != 0) goto L_0x0448
            monitor-enter(r9)
            goto L_0x0432
        L_0x0422:
            r1 = 3
            X.3cG r4 = new X.3cG
            r0 = r44
            r4.<init>((java.lang.Object) r0, (int) r1)
            r0 = 2600(0xa28, double:1.2846E-320)
            r2 = r32
            r2.A0T(r4, r0)
            goto L_0x041c
        L_0x0432:
            X.2as r0 = r9.A03     // Catch:{ all -> 0x0445 }
            if (r0 != 0) goto L_0x0443
            X.2eK r0 = r9.A01     // Catch:{ all -> 0x0445 }
            X.2gw r2 = r0.A00     // Catch:{ all -> 0x0445 }
            X.4FS r1 = r9.A02     // Catch:{ all -> 0x0445 }
            X.2as r0 = new X.2as     // Catch:{ all -> 0x0445 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0445 }
            r9.A03 = r0     // Catch:{ all -> 0x0445 }
        L_0x0443:
            monitor-exit(r9)     // Catch:{ all -> 0x0445 }
            goto L_0x0448
        L_0x0445:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0445 }
            throw r0
        L_0x0448:
            X.2as r2 = r9.A03
            java.util.concurrent.locks.Lock r1 = r2.A03
            r1.lock()
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x04b1
            r1.unlock()
            X.4FS r1 = r2.A02
            r0 = 29
            X.C69993Zl.A00(r1, r2, r0)
        L_0x045d:
            java.lang.String r0 = "taskkillers/scan"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = r43
            X.4FS r1 = r0.A01
            X.8Mp r0 = r0.A00
            r1.BkM(r0)
            java.io.File r1 = r66.getFilesDir()
            java.lang.String r0 = "last_warning"
            X.C18310x6.A1F(r1, r0)
            java.lang.String r0 = "expiration_date"
            X.C18310x6.A1F(r1, r0)
            java.lang.String r0 = "account_type"
            X.C18310x6.A1F(r1, r0)
            r0 = r40
            X.4FS r2 = r0.A0X
            X.0jf r1 = new X.0jf
            r1.<init>(r0)
            r2.BkM(r1)
            r0 = r38
            android.content.Context r2 = r0.A00
            boolean r0 = X.AnonymousClass0YV.A0F(r2)
            if (r0 == 0) goto L_0x0498
            r40.A0N()
        L_0x0498:
            boolean r0 = X.C72303dV.A00(r31)
            if (r0 == 0) goto L_0x0516
            r24.A0G()
            r24.A0L()
            X.2qv r10 = r5.A01
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            X.3dV r0 = r10.A02
            X.4GK r11 = r0.get()
            goto L_0x04b5
        L_0x04b1:
            r1.unlock()
            goto L_0x045d
        L_0x04b5:
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x04e9 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x04e9 }
            java.lang.String r1 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job"
            java.lang.String r0 = "GET_DELETED_CHAT_JOB_SQL"
            android.database.Cursor r1 = X.C56862sg.A01(r4, r1, r0)     // Catch:{ all -> 0x04e9 }
        L_0x04c2:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x04dd }
            if (r0 == 0) goto L_0x04d2
            X.2Ty r0 = r10.A02(r1)     // Catch:{ all -> 0x04dd }
            if (r0 == 0) goto L_0x04c2
            r9.add(r0)     // Catch:{ all -> 0x04dd }
            goto L_0x04c2
        L_0x04d2:
            r1.close()     // Catch:{ all -> 0x04e9 }
            r11.close()
            java.util.Iterator r9 = r9.iterator()
            goto L_0x051d
        L_0x04dd:
            r2 = move-exception
            if (r1 == 0) goto L_0x04e8
            r1.close()     // Catch:{ all -> 0x04e4 }
            goto L_0x04e8
        L_0x04e4:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch:{ all -> 0x04e9 }
        L_0x04e8:
            throw r2     // Catch:{ all -> 0x04e9 }
        L_0x04e9:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x04ee }
            throw r1
        L_0x04ee:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x04f3:
            java.util.List r0 = r4.A09
            if (r0 == 0) goto L_0x0518
            long r0 = r4.A04
            r11 = -9223372036854775808
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0518
            java.lang.String r0 = "action_singular_delete"
            r5.A00(r4, r0)
        L_0x0504:
            java.util.Objects.requireNonNull(r37)
            X.3cG r1 = new X.3cG
            r0 = r37
            r1.<init>((java.lang.Object) r0, (int) r8)
            r0 = r32
            r0.A0S(r1)
            r37.A00()
        L_0x0516:
            monitor-enter(r6)
            goto L_0x0536
        L_0x0518:
            java.lang.String r0 = "action_clear"
        L_0x051a:
            r5.A00(r4, r0)
        L_0x051d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0504
            java.lang.Object r4 = r9.next()
            X.2Ty r4 = (X.C43912Ty) r4
            X.2ss r1 = r5.A00
            X.4uZ r0 = r4.A07
            boolean r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x04f3
            java.lang.String r0 = "action_delete"
            goto L_0x051a
        L_0x0536:
            boolean r0 = r6.A01     // Catch:{ all -> 0x072b }
            if (r0 != 0) goto L_0x054c
            boolean r0 = r6.A00     // Catch:{ all -> 0x072b }
            if (r0 != 0) goto L_0x054c
            r0 = 1
            r6.A00 = r0     // Catch:{ all -> 0x072b }
            X.4FS r4 = r6.A0c     // Catch:{ all -> 0x072b }
            r1 = 0
            X.4HS r0 = new X.4HS     // Catch:{ all -> 0x072b }
            r0.<init>((java.lang.Object) r6, (int) r1)     // Catch:{ all -> 0x072b }
            X.AnonymousClass0x7.A1B(r0, r4)     // Catch:{ all -> 0x072b }
        L_0x054c:
            monitor-exit(r6)
            r6.A0A()
            long r8 = java.lang.System.currentTimeMillis()
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            X.33p r0 = r3.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "sticker_store_last_fetch_time"
            long r0 = X.AnonymousClass0x2.A0B(r1, r0)
            long r4 = r4 + r0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x05b9
            X.1VX r1 = r3.A02
            r0 = 1944(0x798, float:2.724E-42)
            int r4 = r1.A0O(r14, r0)
            r1 = 0
            r0 = 120(0x78, float:1.68E-43)
            if (r4 < r1) goto L_0x063f
            if (r4 <= r0) goto L_0x063b
            r4 = 120(0x78, float:1.68E-43)
        L_0x057a:
            java.util.Random r0 = X.AnonymousClass0x9.A1C()
            int r5 = r0.nextInt(r4)
            X.0XS r8 = X.C18270x1.A07()
            java.lang.Class<com.whatsapp.stickers.stickerpack.FetchDownloadableStickerPackWorker> r0 = com.whatsapp.stickers.stickerpack.FetchDownloadableStickerPackWorker.class
            X.0Aw r6 = new X.0Aw
            r6.<init>(r0)
            long r0 = (long) r5
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r6.A02(r0, r4)
            r6.A04(r8)
            X.0Ay r4 = X.AnonymousClass0x9.A0I(r6)
            X.1uL r0 = r3.A08
            X.0Xb r3 = X.C72333dY.A01(r0)
            java.lang.String r1 = "fetch_sticker_pack_data"
            X.0Fs r0 = X.C02320Fs.KEEP
            r3.A07(r0, r4, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "stickerstoreinventorymanager/checkStickerStoreForUpdatesWithJitter Start to check sticker store data in "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " minutes"
            X.C18260x0.A1J(r1, r0)
        L_0x05b9:
            X.4C1 r0 = r7.ABV
            java.lang.Object r4 = r0.get()
            X.2zy r4 = (X.C61262zy) r4
            java.util.Objects.requireNonNull(r4)
            r3 = 1
            X.4IV r1 = new X.4IV
            r1.<init>(r4, r3)
            r0 = r22
            android.os.Handler r0 = r0.A00
            r1.AwB(r0)
            X.4IV r1 = new X.4IV
            r1.<init>(r4, r3)
            r0 = r22
            android.os.Handler r0 = r0.A01
            r1.AwB(r0)
            android.os.Handler r0 = r21.A00()
            r4.A01(r0)
            r0 = r20
            java.util.concurrent.ThreadPoolExecutor r1 = r0.A00
            java.lang.String r0 = "Signal Protocol"
            r4.A03(r0, r1)
            r0 = r23
            java.util.concurrent.ThreadPoolExecutor r1 = r0.A01
            if (r1 == 0) goto L_0x05f8
            java.lang.String r0 = "DecryptMessageExecutor"
            r4.A03(r0, r1)
        L_0x05f8:
            r4.A00()
            r65 = 5
            X.3ac r60 = new X.3ac
            r61 = r31
            r63 = r34
            r60.<init>(r61, r62, r63, r64, r65)
            r60.run()
            boolean r0 = X.C107385bE.A0A()
            if (r0 == 0) goto L_0x062a
            android.content.pm.ApplicationInfo r0 = r66.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 33
            if (r1 >= r0) goto L_0x062a
            r1 = 0
            r0 = r26
            android.content.SharedPreferences r4 = r0.A01
            java.lang.String r0 = "registration_state"
            int r0 = r4.getInt(r0, r1)
            if (r0 != 0) goto L_0x062a
        L_0x0627:
            java.lang.String r5 = "fixed"
            goto L_0x064d
        L_0x062a:
            X.2LG r1 = new X.2LG
            r0 = r66
            r4 = r16
            r1.<init>(r0, r4)
            r0 = r17
            r4 = r28
            r0.A0X(r4, r1)
            goto L_0x0627
        L_0x063b:
            if (r4 <= 0) goto L_0x063f
            goto L_0x057a
        L_0x063f:
            X.4FS r4 = r3.A07
            r1 = 28
            X.5sF r0 = new X.5sF
            r0.<init>(r3, r1)
            r4.BkM(r0)
            goto L_0x05b9
        L_0x064d:
            java.lang.String r0 = "google_bug_154855417"
            r1 = r25
            android.content.SharedPreferences r6 = r1.A03(r0)     // Catch:{ Exception -> 0x069a }
            boolean r0 = r6.contains(r5)     // Catch:{ Exception -> 0x069a }
            if (r0 != 0) goto L_0x069f
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x069a }
            java.lang.String r0 = "ZoomTables.data"
            java.io.File r8 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ Exception -> 0x069a }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x069a }
            java.lang.String r0 = "SavedClientParameters.data.cs"
            java.io.File r7 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ Exception -> 0x069a }
            java.io.File r4 = r2.getFilesDir()     // Catch:{ Exception -> 0x069a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x069a }
            java.lang.String r0 = "DATA_ServerControlledParametersManager.data.v1."
            r1.append(r0)     // Catch:{ Exception -> 0x069a }
            java.lang.String r0 = r2.getPackageName()     // Catch:{ Exception -> 0x069a }
            java.io.File r0 = X.C18270x1.A0A(r4, r0, r1)     // Catch:{ Exception -> 0x069a }
            r8.delete()     // Catch:{ Exception -> 0x069a }
            r7.delete()     // Catch:{ Exception -> 0x069a }
            r0.delete()     // Catch:{ Exception -> 0x069a }
            android.content.SharedPreferences$Editor r0 = r6.edit()     // Catch:{ Exception -> 0x069a }
            X.C18270x1.A0l(r0, r5, r3)     // Catch:{ Exception -> 0x069a }
            java.lang.String r0 = "app-init/async/fixGoogleMapsCrash154855417 applied"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x069a }
            goto L_0x069f
        L_0x069a:
            java.lang.String r0 = "app-init/async/fixGoogleMapsCrash154855417 failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x069f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0720
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            r0 = r29
            int r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0720
            java.lang.String r0 = "appinit/async sdk>=31, no read_phone_state permission"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x06b4:
            X.6kH r0 = X.C56972sr.A03(r35)
            if (r0 == 0) goto L_0x06bf
            r0 = r24
            com.whatsapp.location.LocationSharingService.A04(r2, r0)
        L_0x06bf:
            r27.A00()
            r19.A00()
            r0 = r19
            X.8qC r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.0sw r0 = (X.C16390sw) r0
            r0.BkR()
            java.util.Locale r5 = java.util.Locale.ENGLISH
            r6 = 2
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r0 = r18.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4 = 0
            r2[r4] = r0
            long r0 = r18.A05()
            X.AnonymousClass000.A1Q(r2, r3, r0)
            java.lang.String r0 = "StorageUtils/log-available-space/internal-storage available:%,d total:%,d"
            X.C18320x8.A1J(r0, r5, r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r0 = r18.A02()
            X.AnonymousClass000.A1Q(r2, r4, r0)
            long r0 = r18.A04()
            X.AnonymousClass000.A1Q(r2, r3, r0)
            java.lang.String r0 = "StorageUtils/log-available-space/external-storage available: %,d total: %,d"
            X.C18320x8.A1J(r0, r5, r2)
            java.lang.String r0 = "app-init/async/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C72303dV.A00(r31)
            if (r0 == 0) goto L_0x0718
            r3 = 6
            r2 = r36
            r1 = r34
            r0 = r31
            X.C71353by.A01(r2, r1, r0, r3)
        L_0x0718:
            r1 = 444(0x1bc, float:6.22E-43)
            r0 = r34
            r0.A0X(r1)
            return
        L_0x0720:
            r4 = 7
            r5 = r32
            r1 = r33
            r0 = r30
            X.C69263Wi.A0A(r5, r1, r0, r4)
            goto L_0x06b4
        L_0x072b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3D6.BMd():void");
    }

    public AnonymousClass3D6(Context context) {
        this.A00 = context;
    }

    public String BDW() {
        return "LegacyAsyncInit";
    }

    public /* synthetic */ void BMe() {
    }
}
