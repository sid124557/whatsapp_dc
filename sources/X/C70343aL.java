package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3aL  reason: invalid class name and case insensitive filesystem */
public class C70343aL implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C70343aL(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public static C24901Ze A00(AnonymousClass4FV r3, C54692p8 r4, Jid jid, String str, String str2) {
        AnonymousClass1ZJ r2 = new AnonymousClass1ZJ();
        r2.A02 = 10;
        r2.A01 = Integer.valueOf(C61132zl.A00(r4));
        r2.A04 = str;
        r2.A03 = str2;
        r3.BhD(r2);
        C24901Ze r22 = new C24901Ze();
        r22.A02 = 10;
        r22.A01 = Integer.valueOf(C61132zl.A00(r4));
        r22.A03 = Long.valueOf(Long.parseLong(jid.user));
        return r22;
    }

    public static void A01(AnonymousClass4FS r1, Object obj, Object obj2, Object obj3, int i) {
        r1.BkM(new C70343aL(obj, obj2, obj3, i));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0372 A[LOOP:4: B:148:0x036c->B:150:0x0372, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:670:0x0e89  */
    public final void run() {
        /*
            r22 = this;
            r3 = r22
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0583;
                case 1: goto L_0x0c79;
                case 2: goto L_0x055d;
                case 3: goto L_0x0cfa;
                case 4: goto L_0x0c5a;
                case 5: goto L_0x0504;
                case 6: goto L_0x0cd4;
                case 7: goto L_0x0c28;
                case 8: goto L_0x0c15;
                case 9: goto L_0x0c00;
                case 10: goto L_0x0ba4;
                case 11: goto L_0x04d2;
                case 12: goto L_0x04d2;
                case 13: goto L_0x0aa3;
                case 14: goto L_0x0a91;
                case 15: goto L_0x04aa;
                case 16: goto L_0x0a26;
                case 17: goto L_0x0a10;
                case 18: goto L_0x09ed;
                case 19: goto L_0x0988;
                case 20: goto L_0x0954;
                case 21: goto L_0x08fb;
                case 22: goto L_0x08b3;
                case 23: goto L_0x089b;
                case 24: goto L_0x0889;
                case 25: goto L_0x0878;
                case 26: goto L_0x0488;
                case 27: goto L_0x0007;
                case 28: goto L_0x0007;
                case 29: goto L_0x0449;
                case 30: goto L_0x0427;
                case 31: goto L_0x07fa;
                case 32: goto L_0x03b2;
                case 33: goto L_0x07db;
                case 34: goto L_0x07c9;
                case 35: goto L_0x0393;
                case 36: goto L_0x0189;
                case 37: goto L_0x07b9;
                case 38: goto L_0x07a9;
                case 39: goto L_0x011a;
                case 40: goto L_0x0780;
                case 41: goto L_0x0770;
                case 42: goto L_0x00ff;
                case 43: goto L_0x0745;
                case 44: goto L_0x0733;
                case 45: goto L_0x0704;
                case 46: goto L_0x06f4;
                case 47: goto L_0x06e5;
                case 48: goto L_0x004a;
                case 49: goto L_0x05ab;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A00
            X.3Lq r4 = (X.C66493Lq) r4
            java.lang.Object r5 = r3.A01
            X.1fL r5 = (X.C28011fL) r5
            java.lang.Object r1 = r3.A02
            X.33k r1 = (X.C620833k) r1
            X.2sj r0 = r4.A0b
            r0.A05(r1)
            boolean r1 = r0.A0B(r5)
            X.2sr r0 = r4.A06
            if (r1 == 0) goto L_0x0045
            X.6kB r0 = r0.A0G()
        L_0x0024:
            X.C626936e.A06(r0)
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.2ov r0 = X.AnonymousClass36G.A02(r0)
            X.2oh r2 = X.C54422oh.A00(r0, r5)
            X.33n r1 = r4.A0P
            r0 = 0
            boolean r0 = r1.A0c(r2, r0)
            if (r0 == 0) goto L_0x0044
            X.36E r1 = r4.A07
            r0 = 1
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0I(r5, r0)
        L_0x0044:
            return
        L_0x0045:
            X.6kH r0 = X.C56972sr.A03(r0)
            goto L_0x0024
        L_0x004a:
            java.lang.Object r12 = r3.A00
            com.whatsapp.mediacomposer.MediaComposerActivity r12 = (com.whatsapp.mediacomposer.MediaComposerActivity) r12
            java.lang.Object r11 = r3.A01
            java.io.File r11 = (java.io.File) r11
            java.lang.Object r10 = r3.A02
            X.5YF r10 = (X.AnonymousClass5YF) r10
            boolean r0 = r11.exists()
            r9 = -1
            if (r0 == 0) goto L_0x0044
            long r2 = r11.length()
            double r0 = (double) r2
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 * r2
            int r8 = (int) r0
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r7]
            java.io.FileInputStream r5 = X.AnonymousClass0x9.A0g(r11)     // Catch:{ all -> 0x0044 }
            int r0 = r5.read(r6)     // Catch:{ all -> 0x00f8 }
            if (r0 == r9) goto L_0x00f3
            r4 = 0
            r3 = 0
        L_0x0079:
            if (r3 > r8) goto L_0x00f3
            r14 = 0
        L_0x007c:
            byte r1 = r6[r14]     // Catch:{ all -> 0x00f8 }
            byte[] r13 = X.C57872uL.A00     // Catch:{ all -> 0x00f8 }
            byte r0 = r13[r4]     // Catch:{ all -> 0x00f8 }
            if (r1 != r0) goto L_0x009f
            int r2 = r13.length     // Catch:{ all -> 0x00f8 }
            r16 = 1
            r1 = 1
        L_0x0088:
            if (r1 >= r2) goto L_0x009f
            int r0 = r14 + r1
            if (r0 >= r7) goto L_0x009f
            byte r15 = r6[r0]     // Catch:{ all -> 0x00f8 }
            byte r0 = r13[r1]     // Catch:{ all -> 0x00f8 }
            if (r15 != r0) goto L_0x009f
            int r0 = r2 - r16
            if (r1 != r0) goto L_0x009c
            if (r14 == r9) goto L_0x00a4
            int r3 = r3 + r14
            goto L_0x00e0
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x0088
        L_0x009f:
            int r14 = r14 + 1
            if (r14 >= r7) goto L_0x00a4
            goto L_0x007c
        L_0x00a4:
            long r1 = r11.length()     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "Item:Semantic=\"MotionPhoto\"\\s+Item:Length=\"(\\d+)\""
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r0)     // Catch:{ all -> 0x00f8 }
            java.nio.charset.Charset r13 = X.AnonymousClass79X.A05     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00f8 }
            r0.<init>(r6, r13)     // Catch:{ all -> 0x00f8 }
            java.util.regex.Matcher r13 = r14.matcher(r0)     // Catch:{ all -> 0x00f8 }
            boolean r0 = r13.find()     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00d2
            r0 = 1
            java.lang.String r0 = r13.group(r0)     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x00cb
            long r13 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x00f8 }
            goto L_0x00cd
        L_0x00cb:
            r13 = 0
        L_0x00cd:
            long r1 = r1 - r13
            int r0 = (int) r1     // Catch:{ all -> 0x00f8 }
            if (r0 == r9) goto L_0x00d2
            goto L_0x00e5
        L_0x00d2:
            int r3 = r3 + 4096
            r0 = 4096(0x1000, float:5.74E-42)
            java.lang.System.arraycopy(r6, r0, r6, r4, r0)     // Catch:{ all -> 0x00f8 }
            int r0 = r5.read(r6, r0, r0)     // Catch:{ all -> 0x00f8 }
            if (r0 != r9) goto L_0x0079
            goto L_0x00f3
        L_0x00e0:
            int r3 = r3 + r2
            r5.close()     // Catch:{ all -> 0x0044 }
            goto L_0x00e9
        L_0x00e5:
            r5.close()     // Catch:{ all -> 0x0044 }
            r3 = r0
        L_0x00e9:
            if (r3 <= r9) goto L_0x0044
            android.net.Uri r1 = r10.A0G
            java.util.HashSet r0 = r12.A1t
            r0.add(r1)
            return
        L_0x00f3:
            r5.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0c9e
        L_0x00f8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x00ff:
            java.lang.Object r0 = r3.A00
            X.5a0 r0 = (X.C106695a0) r0
            java.lang.Object r6 = r3.A01
            android.net.Uri r6 = (android.net.Uri) r6
            java.lang.Object r1 = r3.A02
            java.io.File r1 = (java.io.File) r1
            java.lang.String r5 = "ReferenceCountedFileManager/deleteFileFromMediaProvider"
            if (r6 == 0) goto L_0x0044
            X.33i r0 = r0.A02
            X.5UR r4 = r0.A0R()
            if (r4 != 0) goto L_0x0c9f
            java.lang.String r0 = "ReferenceCountedFileManager/deleteFileFromMediaProvider content resolver is null"
            goto L_0x0185
        L_0x011a:
            java.lang.Object r2 = r3.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r3.A01
            X.310 r0 = (X.AnonymousClass310) r0
            java.lang.Object r8 = r3.A02
            X.2eK r8 = (X.C48092eK) r8
            java.lang.String r1 = "Profile Pictures"
            java.io.File r0 = X.AnonymousClass310.A00(r0)
            java.io.File r7 = X.AnonymousClass002.A0A(r0, r1)
            java.io.File r0 = r2.getCacheDir()
            java.io.File r6 = X.AnonymousClass002.A0A(r0, r1)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x0044
            X.C18280x3.A10(r6)
            java.io.File[] r5 = r7.listFiles()
            if (r5 == 0) goto L_0x0044
            int r4 = r5.length
            r3 = 0
        L_0x0149:
            if (r3 >= r4) goto L_0x0178
            r2 = r5[r3]
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0175
            java.io.File r1 = X.AnonymousClass002.A0A(r6, r1)
            r1.getAbsolutePath()
            r1.exists()
            r2.getAbsolutePath()
            r1.getAbsolutePath()
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0172
            X.C627536m.A0N(r8, r2, r1)
        L_0x0172:
            r2.delete()
        L_0x0175:
            int r3 = r3 + 1
            goto L_0x0149
        L_0x0178:
            java.lang.String r0 = ".nomedia"
            X.C18310x6.A1F(r7, r0)
            boolean r0 = r7.delete()
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "app-init/moveprofilephotos/rmdir/failed"
        L_0x0185:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0189:
            java.lang.Object r1 = r3.A00
            X.2Tb r1 = (X.C43682Tb) r1
            java.lang.Object r0 = r3.A01
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.lang.Object r5 = r3.A02
            X.20L r5 = (X.AnonymousClass20L) r5
            r4 = 2
            X.C162457s7.A0J(r5, r4)
            X.3Ex r2 = r1.A01
            X.3ZH r3 = r2.A07(r0)
            if (r3 != 0) goto L_0x01a7
            java.lang.String r0 = "SurveyManager/validateContact contact is null"
        L_0x01a3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x01a7:
            boolean r2 = r3.A0R()
            if (r2 != 0) goto L_0x01b0
            java.lang.String r0 = "SurveyManager/validateContact contact is not business"
            goto L_0x01a3
        L_0x01b0:
            X.2qS r2 = r3.A0E
            if (r2 != 0) goto L_0x01b7
            java.lang.String r0 = "SurveyManager/validateContact verifiedNameDetails is null"
            goto L_0x01a3
        L_0x01b7:
            X.1k9 r6 = r1.A06
            java.lang.Object r2 = r6.A01(r0)
            if (r2 == 0) goto L_0x01d2
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SurveyManager/registerConversionEvent already existing conversion with business="
            r2.append(r1)
            X.C18280x3.A0u(r0, r2)
            java.lang.String r0 = " skipping"
            r2.append(r0)
            goto L_0x0d5a
        L_0x01d2:
            java.lang.String r14 = X.C18280x3.A0Y()
            X.C162457s7.A0D(r14)
            java.lang.String r15 = X.C18280x3.A0Y()
            X.C162457s7.A0D(r15)
            X.20Z r17 = X.AnonymousClass20Z.ENTERPRISE
            X.2qS r2 = r3.A0E
            if (r2 == 0) goto L_0x01ef
            boolean r3 = r2.A03()
            r2 = 1
            if (r3 != r2) goto L_0x01ef
            X.20Z r17 = X.AnonymousClass20Z.SMB
        L_0x01ef:
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "SurveyManager/saveConversionEvent saveConversionInfo="
            r3.append(r2)
            java.lang.String r2 = r0.getRawString()
            X.C18260x0.A1J(r3, r2)
            long r20 = java.lang.System.currentTimeMillis()
            X.2p8 r12 = new X.2p8
            r16 = r12
            r18 = r5
            r19 = r0
            r16.<init>(r17, r18, r19, r20)
            X.2zl r5 = r1.A05
            r7 = 0
            X.1ZJ r8 = new X.1ZJ
            r8.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8.A02 = r9
            int r2 = X.C61132zl.A00(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.A01 = r2
            r8.A04 = r14
            X.4FV r3 = r5.A01
            r3.BhD(r8)
            X.1Ze r8 = new X.1Ze
            r8.<init>()
            r8.A02 = r9
            int r2 = X.C61132zl.A00(r12)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.A01 = r2
            com.whatsapp.jid.UserJid r13 = r12.A03
            java.lang.String r2 = r13.user
            java.lang.Long r2 = X.C18290x4.A0h(r2)
            r8.A03 = r2
            r8.A04 = r15
            r3.BhD(r8)
            r6.A05(r12)
            X.1kA r2 = r1.A07
            java.lang.Object r6 = r2.A01(r0)
            if (r6 == 0) goto L_0x0283
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "SurveyManager/createSurveySession already existing survey with business={"
            r2.append(r1)
            X.C18280x3.A0u(r0, r2)
            java.lang.String r0 = " skipping"
            X.C18260x0.A1L(r2, r0)
            java.lang.String r4 = "SurveyManager/createSurveySession survey already exists with business skipping"
        L_0x026b:
            X.1VX r2 = r5.A00
            r1 = 4725(0x1275, float:6.621E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0044
            X.1Ze r0 = A00(r3, r12, r13, r14, r4)
            r0.A04 = r15
            r0.A05 = r4
            r3.BhD(r0)
            return
        L_0x0283:
            java.util.List r6 = r2.A02()
            boolean r6 = X.C18310x6.A1X(r6)
            if (r6 == 0) goto L_0x0295
            java.lang.String r0 = "SurveyManager/createSurveySession already existing surveys skipping"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r4 = "SurveyManager/createSurveySession survey already exists"
            goto L_0x026b
        L_0x0295:
            X.2YL r6 = r1.A03
            java.lang.String r9 = "force_pass_sampling_rate"
            r10 = 0
            X.1VX r11 = r6.A01
            r8 = 3982(0xf8e, float:5.58E-42)
            java.lang.String r11 = X.C56952sp.A08(r11, r8)
            org.json.JSONObject r8 = X.AnonymousClass0x9.A1H(r11)     // Catch:{ JSONException -> 0x02ac }
            boolean r8 = r8.optBoolean(r9, r7)     // Catch:{ JSONException -> 0x02ac }
            goto L_0x032c
        L_0x02ac:
            X.2qk r9 = r6.A00
            java.lang.String r8 = "WABISurveyFeatureConfigParse"
            r9.A0A(r8, r7, r11)
        L_0x02b3:
            X.33g r8 = r1.A00
            X.5dt r9 = r8.A02(r0)
            if (r9 != 0) goto L_0x0389
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r11 = "SurveyManager/createSurveySession business profile null "
            r8.append(r11)
            java.lang.String r0 = r0.getRawString()
            X.C18260x0.A1K(r8, r0)
        L_0x02cb:
            java.lang.String r0 = "default_survey_sampling_rate"
            int r7 = r6.A00(r0, r7)
        L_0x02d1:
            r8 = 1
            r6 = 100
            X.7kv r0 = X.C158997kv.A01
            int r0 = r0.A03(r8, r6)
            if (r0 <= r7) goto L_0x02dd
            r8 = 0
        L_0x02dd:
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "SurveyManager/passesSurveySamplingRate business profile_null="
            r6.append(r0)
            if (r9 != 0) goto L_0x02e9
            r10 = 1
        L_0x02e9:
            r6.append(r10)
            java.lang.String r0 = " profile_sample_rate="
            r6.append(r0)
            if (r9 == 0) goto L_0x0386
            java.lang.Integer r0 = r9.A09
        L_0x02f5:
            r6.append(r0)
            java.lang.String r0 = " sample_rate="
            r6.append(r0)
            r6.append(r7)
            java.lang.String r0 = " eval_pass={"
            r6.append(r0)
            r6.append(r8)
            java.lang.String r7 = X.AnonymousClass000.A0d(r6)
            X.C162457s7.A0J(r7, r4)
            X.1VX r6 = r5.A00
            r5 = 4725(0x1275, float:6.621E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r0 = r6.A0Y(r4, r5)
            if (r0 == 0) goto L_0x0326
            X.1Ze r0 = A00(r3, r12, r13, r14, r7)
            r0.A04 = r15
            r0.A05 = r7
            r3.BhD(r0)
        L_0x0326:
            if (r8 != 0) goto L_0x0347
            java.lang.String r0 = "SurveyManager/createSurveySession didn't pass survey sampling rate"
            goto L_0x0d5e
        L_0x032c:
            if (r8 == 0) goto L_0x02b3
            java.lang.String r7 = "SurveyManager/passesSurveySamplingRate force_pass_sampling_rate=true"
            X.1VX r6 = r5.A00
            r5 = 4725(0x1275, float:6.621E-42)
            X.2vE r4 = X.C58422vE.A02
            boolean r0 = r6.A0Y(r4, r5)
            if (r0 == 0) goto L_0x0347
            X.1Ze r0 = A00(r3, r12, r13, r14, r7)
            r0.A04 = r15
            r0.A05 = r7
            r3.BhD(r0)
        L_0x0347:
            long r16 = java.lang.System.currentTimeMillis()
            X.2mj r11 = new X.2mj
            r11.<init>(r12, r13, r14, r15, r16)
            r2.A05(r11)
            java.lang.String r2 = "SurveyManager/passesSurveySamplingRate before notifyObservers"
            boolean r0 = r6.A0Y(r4, r5)
            if (r0 == 0) goto L_0x0366
            X.1Ze r0 = A00(r3, r12, r13, r14, r2)
            r0.A04 = r15
            r0.A05 = r2
            r3.BhD(r0)
        L_0x0366:
            X.1hb r0 = r1.A04
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x036c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.next()
            X.2Fj r0 = (X.C40322Fj) r0
            com.whatsapp.conversation.viewmodel.SurveyViewModel r0 = r0.A00
            X.66R r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.0Wx r0 = (X.C06270Wx) r0
            r0.A0G(r11)
            goto L_0x036c
        L_0x0386:
            r0 = 0
            goto L_0x02f5
        L_0x0389:
            java.lang.Integer r0 = r9.A09
            if (r0 == 0) goto L_0x02cb
            int r7 = r0.intValue()
            goto L_0x02d1
        L_0x0393:
            java.lang.Object r4 = r3.A00
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r0 = r3.A01
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r0 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r0
            java.lang.Object r1 = r3.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r4 == 0) goto L_0x0044
            X.2W8 r2 = r0.getPnhDailyActionLoggingStore$chat_consumerBeta()
            X.2ss r0 = r0.getChatsCache$chat_consumerBeta()
            int r1 = r0.A06(r1)
            r0 = 3
            r2.A00(r4, r1, r0)
            return
        L_0x03b2:
            java.lang.Object r8 = r3.A02
            X.2RH r8 = (X.AnonymousClass2RH) r8
            java.lang.Object r2 = r3.A01
            X.2n0 r2 = (X.C53382n0) r2
            java.lang.Object r0 = r3.A00
            X.59I r0 = (X.AnonymousClass59I) r0
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x03cc
            r0 = 5
            if (r1 == r0) goto L_0x03cc
            r0 = 1
            if (r1 == r0) goto L_0x03cc
            return
        L_0x03cc:
            X.2oj r5 = r8.A00
            X.1fJ r7 = r2.A01
            com.whatsapp.jid.UserJid r4 = r2.A04
            r2 = 0
            r1 = 1
            java.lang.String r0 = "in isGroupMembershipApprovalRequestExist"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Z()
            java.lang.String r0 = r7.getRawString()
            r9 = 0
            r3[r2] = r0
            X.C18280x3.A0w(r4, r3, r1)
            X.1RI r0 = r5.A01
            X.4GK r6 = r0.get()
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0ccd }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0ccd }
            java.lang.String r1 = "SELECT EXISTS ( SELECT 1 FROM group_membership_approval_requests WHERE group_jid = ? AND requester_jid = ?) AS request_exists"
            java.lang.String r0 = "GROUP_MEMBERSHIP_APPROVAL_REQUEST_EXISTS_SQL"
            android.database.Cursor r5 = r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x0ccd }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0cc6 }
            if (r0 == 0) goto L_0x040e
            java.lang.String r0 = "request_exists"
            long r3 = X.AnonymousClass0x2.A0C(r5, r0)     // Catch:{ all -> 0x0cc6 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x040e
            r9 = 1
        L_0x040e:
            r5.close()     // Catch:{ all -> 0x0ccd }
            r6.close()
            if (r9 == 0) goto L_0x0044
            X.3DL r2 = r8.A01
            java.lang.String r0 = r7.getRawString()
            X.47H r1 = new X.47H
            r1.<init>(r0)
            X.2gy r0 = r2.A00
            r0.A02(r1)
            return
        L_0x0427:
            java.lang.Object r0 = r3.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r4 = r3.A01
            X.1fL r4 = (X.C28011fL) r4
            java.lang.Object r2 = r3.A02
            X.33k r2 = (X.C620833k) r2
            X.1iV r0 = r0.A0s
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0439:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.next()
            X.2qm r0 = (X.C55702qm) r0
            r0.A00(r2, r4)
            goto L_0x0439
        L_0x0449:
            java.lang.Object r4 = r3.A00
            X.3Lq r4 = (X.C66493Lq) r4
            java.lang.Object r6 = r3.A01
            X.1fJ r6 = (X.C27991fJ) r6
            java.lang.Object r5 = r3.A02
            java.util.Map r5 = (java.util.Map) r5
            X.2c1 r2 = r4.A0W
            X.2sH r0 = r4.A0M
            long r0 = X.C56612sH.A00(r0)
            java.util.List r0 = r2.A00(r6, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0465:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r2 = r3.next()
            X.1mN r2 = (X.C30391mN) r2
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0465
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.3Lv r0 = r4.A0U
            r0.A0Y(r2)
            goto L_0x0465
        L_0x0488:
            java.lang.Object r0 = r3.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r4 = r3.A01
            X.1fL r4 = (X.C28011fL) r4
            java.lang.Object r2 = r3.A02
            X.33k r2 = (X.C620833k) r2
            X.1iV r0 = r0.A0s
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x049a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.next()
            X.2qm r0 = (X.C55702qm) r0
            r0.A00(r2, r4)
            goto L_0x049a
        L_0x04aa:
            java.lang.Object r4 = r3.A00
            X.2qL r4 = (X.C55432qL) r4
            java.lang.Object r1 = r3.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r3 = r3.A02
            java.util.Collection r3 = (java.util.Collection) r3
            X.2sM r0 = r4.A03
            java.util.Set r0 = r0.A07(r1)
            java.util.Iterator r2 = r0.iterator()
        L_0x04c0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)
            X.6aS r0 = X.C129526aS.copyOf((java.util.Collection) r3)
            r4.A01(r0, r1)
            goto L_0x04c0
        L_0x04d2:
            java.lang.Object r4 = r3.A00
            X.2o7 r4 = (X.C54062o7) r4
            java.lang.Object r5 = r3.A01
            X.1fL r5 = (X.C28011fL) r5
            java.lang.Object r1 = r3.A02
            X.33k r1 = (X.C620833k) r1
            X.33h r0 = r4.A09
            r0.A0F(r1)
            X.2sr r0 = r4.A00
            X.6kH r0 = X.C56972sr.A02(r0)
            java.lang.String r1 = r5.getRawString()
            X.2ov r0 = X.AnonymousClass36G.A02(r0)
            X.2oh r2 = new X.2oh
            r2.<init>(r0, r1)
            X.33n r1 = r4.A05
            r0 = 0
            boolean r0 = r1.A0c(r2, r0)
            if (r0 == 0) goto L_0x0044
            X.36E r1 = r4.A01
            r0 = 4
            goto L_0x003d
        L_0x0504:
            java.lang.Object r5 = r3.A00
            X.2qj r5 = (X.C55672qj) r5
            java.lang.Object r4 = r3.A01
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r3.A02
            X.34x r3 = (X.C624134x) r3
            X.1me r0 = r4.A1T
            if (r0 == 0) goto L_0x052f
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x052f
            X.1io r2 = r5.A0K
            java.lang.String r0 = "MessageObservers/notifyPinnedMessageEdited"
            java.util.Iterator r1 = X.C61102zi.A04(r2, r0)
        L_0x0521:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x052f
            X.4FW r0 = X.C29431io.A00(r2, r1)
            r0.BY8(r3, r4)
            goto L_0x0521
        L_0x052f:
            X.1io r0 = r5.A0K
            r0.A0D(r3, r4)
            X.1hu r2 = r5.A08
            X.2z0 r0 = r3.A1J
            X.4uZ r1 = r0.A00
            r0 = 0
            r2.A0A(r1, r0)
            X.4FS r2 = r5.A0b
            r1 = 34
            X.3Zw r0 = new X.3Zw
            r0.<init>(r5, r1, r4)
            r2.BkM(r0)
            X.2qb r0 = r4.A0l
            if (r0 == 0) goto L_0x0044
            X.2ny r1 = r5.A0W
            boolean r0 = r1.A01(r4)
            if (r0 == 0) goto L_0x0044
            X.2iO r1 = r1.A06
            r0 = 1
            r1.A01(r4, r0)
            return
        L_0x055d:
            java.lang.Object r2 = r3.A00
            X.3Lo r2 = (X.C66473Lo) r2
            java.lang.Object r0 = r3.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            java.lang.Object r3 = r3.A02
            X.4uZ r3 = (X.C95814uZ) r3
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3ZH.A04(r0)
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            if (r1 == 0) goto L_0x0044
            X.2sj r0 = r2.A05
            boolean r0 = r0.A0C(r1)
            if (r0 == 0) goto L_0x0044
            X.3Lr r2 = r2.A06
            X.1fJ r3 = (X.C27991fJ) r3
            r1 = 0
            r0 = 3
            r2.A0E(r3, r1, r0)
            return
        L_0x0583:
            java.lang.Object r5 = r3.A00
            X.2sW r5 = (X.C56762sW) r5
            java.lang.Object r4 = r3.A01
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r2 = r3.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.1io r1 = r5.A0E
            r0 = 0
            r1.A0F(r4, r0)
            X.1iI r0 = r5.A0N
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x059b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r1.next()
            X.4F0 r0 = (X.AnonymousClass4F0) r0
            r0.BO7(r2)
            goto L_0x059b
        L_0x05ab:
            java.lang.Object r6 = r3.A00
            X.2Sy r6 = (X.C43652Sy) r6
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = r3.A02
            X.0Wx r5 = (X.C06270Wx) r5
            X.2OT r4 = new X.2OT
            r4.<init>(r6)
            java.util.Iterator r14 = r0.iterator()
        L_0x05c0:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x06e1
            java.lang.Object r3 = r14.next()
            android.net.Uri r3 = (android.net.Uri) r3
            X.5Xq r0 = r6.A02
            X.5YF r2 = r0.A00(r3)
            java.io.File r1 = r2.A07()
            if (r1 != 0) goto L_0x05eb
            X.53r r0 = r6.A05     // Catch:{ IOException -> 0x05e4 }
            java.io.File r1 = r0.A0E(r3)     // Catch:{ IOException -> 0x05e4 }
            java.util.Collection r0 = r4.A00     // Catch:{ IOException -> 0x05e4 }
            r0.add(r1)     // Catch:{ IOException -> 0x05e4 }
            goto L_0x05e9
        L_0x05e4:
            java.util.Set r0 = r4.A01
            r0.add(r3)
        L_0x05e9:
            if (r1 == 0) goto L_0x05c0
        L_0x05eb:
            r2.A0E(r1)
            X.53q r0 = r6.A03
            byte r11 = r0.A01(r2)
            r10 = 13
            r9 = 3
            r0 = 1
            if (r11 == r0) goto L_0x05c0
            if (r11 == r9) goto L_0x0610
            if (r11 == r10) goto L_0x0610
            java.util.Set r7 = r4.A01
            r7.add(r3)
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "MediaFilesLoader/Bad type "
            X.C18260x0.A1Q(r8, r7, r3)
            if (r11 == r9) goto L_0x0610
            if (r11 != r10) goto L_0x05c0
        L_0x0610:
            X.1VX r12 = r6.A01
            r7 = 422(0x1a6, float:5.91E-43)
            X.2vE r11 = X.C58422vE.A02
            boolean r7 = r12.A0Y(r11, r7)
            boolean r7 = X.AnonymousClass8HT.A0D(r1, r7)
            if (r7 != 0) goto L_0x062e
            java.util.Set r7 = r4.A01
            r7.add(r3)
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()
            java.lang.String r7 = "MediaFilesLoader/Cannot transcode or trim "
            X.C18260x0.A1Q(r8, r7, r3)
        L_0x062e:
            X.2y5 r10 = r6.A04
            X.33i r9 = r6.A00
            java.lang.String r8 = "samsung"
            java.lang.String r7 = android.os.Build.MANUFACTURER
            boolean r7 = r8.equalsIgnoreCase(r7)
            r13 = 0
            if (r7 == 0) goto L_0x0667
            int r8 = X.AnonymousClass34G.A02(r9, r10)
            r7 = 2016(0x7e0, float:2.825E-42)
            if (r8 >= r7) goto L_0x0667
            android.media.MediaCodecList r7 = new android.media.MediaCodecList
            r7.<init>(r13)
            android.media.MediaCodecInfo[] r10 = r7.getCodecInfos()
            int r9 = r10.length
        L_0x0650:
            if (r13 >= r9) goto L_0x0667
            r7 = r10[r13]
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = X.AnonymousClass0x9.A0z(r7)
            java.lang.String r7 = "exynos"
            boolean r7 = r8.contains(r7)
            if (r7 != 0) goto L_0x06b6
            int r13 = r13 + 1
            goto L_0x0650
        L_0x0667:
            r7 = 2917(0xb65, float:4.088E-42)
            java.lang.String r7 = r12.A0R(r11, r7)
            boolean r7 = X.C107535bT.A0C(r7)
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x06b6
            java.lang.String r7 = "ExoPlayerVideoPlayer/canExtractVideo/start"
            com.whatsapp.util.Log.d((java.lang.String) r7)
            X.6Pm r7 = new X.6Pm
            r7.<init>()
            android.net.Uri r9 = android.net.Uri.fromFile(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            r10 = 0
            long r12 = r1.length()     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            X.7ih r8 = new X.7ih     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            r8.<init>(r9, r10, r12)     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            long r19 = r7.Bfx(r8)     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            X.86d r15 = new X.86d     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            r16 = r7
            r17 = r10
            r15.<init>(r16, r17, r19)     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            r8 = 0
            boolean r10 = X.C154817dn.A00(r15, r8)     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            java.lang.String r8 = "ExoPlayerVideoPlayer/canExtractVideo/endCheck canPlayVideo="
            X.C18260x0.A1D(r8, r9, r10)     // Catch:{ IOException | IllegalArgumentException -> 0x06ad }
            r7.close()     // Catch:{ IOException -> 0x06b8 }
            goto L_0x06b8
        L_0x06ad:
            r8 = move-exception
            java.lang.String r0 = "ExoPlayerVideoPlayer/canExtractVideo"
            com.whatsapp.util.Log.e(r0, r8)     // Catch:{ all -> 0x06d9 }
            r7.close()     // Catch:{ IOException -> 0x06b6 }
        L_0x06b6:
            r0 = 0
            goto L_0x06ba
        L_0x06b8:
            if (r10 == 0) goto L_0x06b6
        L_0x06ba:
            monitor-enter(r2)
            r2.A0D = r0     // Catch:{ all -> 0x06de }
            monitor-exit(r2)
            X.5Qm r0 = new X.5Qm     // Catch:{ 6pi -> 0x06cc }
            r0.<init>(r1)     // Catch:{ 6pi -> 0x06cc }
            monitor-enter(r2)     // Catch:{ 6pi -> 0x06cc }
            r2.A05 = r0     // Catch:{ all -> 0x06c9 }
            monitor-exit(r2)     // Catch:{ 6pi -> 0x06cc }
            goto L_0x05c0
        L_0x06c9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 6pi -> 0x06cc }
            throw r0     // Catch:{ 6pi -> 0x06cc }
        L_0x06cc:
            r1 = move-exception
            java.lang.String r0 = "MediaFilesLoader/Bad video"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.Set r0 = r4.A01
            r0.add(r3)
            goto L_0x05c0
        L_0x06d9:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x06dd }
        L_0x06dd:
            throw r0
        L_0x06de:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x06e1:
            r5.A0G(r4)
            return
        L_0x06e5:
            java.lang.Object r0 = r3.A00
            X.2iO r0 = (X.C50572iO) r0
            java.lang.Object r2 = r3.A01
            X.34x r2 = (X.C624134x) r2
            java.lang.Object r1 = r3.A02
            X.1I7 r1 = (X.AnonymousClass1I7) r1
            X.1fq r0 = r0.A0A
            goto L_0x0741
        L_0x06f4:
            java.lang.Object r2 = r3.A00
            X.2ny r2 = (X.C53972ny) r2
            java.lang.Object r1 = r3.A01
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r0 = r3.A02
            java.util.Random r0 = (java.util.Random) r0
            r2.A00(r1, r0)
            return
        L_0x0704:
            java.lang.Object r1 = r3.A00
            X.34x r1 = (X.C624134x) r1
            java.lang.Object r4 = r3.A01
            byte[] r4 = (byte[]) r4
            java.lang.Object r0 = r3.A02
            X.2dc r0 = (X.C47662dc) r0
            X.30w r3 = r1.A0y()
            X.38t r2 = r0.A0A
            boolean r1 = r0.A0Y
            boolean r0 = X.C106695a0.A03(r2)
            if (r0 != 0) goto L_0x072c
            boolean r0 = X.AnonymousClass36O.A06(r2)
            if (r0 != 0) goto L_0x072c
            boolean r0 = X.AnonymousClass36O.A04(r2)
            if (r0 == 0) goto L_0x0731
            if (r1 == 0) goto L_0x0731
        L_0x072c:
            r0 = 1
        L_0x072d:
            r3.A04(r4, r0)
            return
        L_0x0731:
            r0 = 0
            goto L_0x072d
        L_0x0733:
            java.lang.Object r0 = r3.A00
            X.33d r0 = (X.C620133d) r0
            java.lang.Object r2 = r3.A01
            X.34x r2 = (X.C624134x) r2
            java.lang.Object r1 = r3.A02
            X.1I7 r1 = (X.AnonymousClass1I7) r1
            X.1fq r0 = r0.A0S
        L_0x0741:
            r0.A02(r1, r2)
            return
        L_0x0745:
            java.lang.Object r5 = r3.A00
            X.2y0 r5 = (X.C60102y0) r5
            java.lang.Object r4 = r3.A01
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r3 = r3.A02
            X.3XA r3 = (X.AnonymousClass3XA) r3
            X.2eA r2 = r5.A01
            long r0 = r4.A1L
            byte[] r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x075d
            r4.A1a = r0
        L_0x075d:
            X.2kN r0 = r5.A00(r4)
            if (r0 == 0) goto L_0x0767
            r3.A05(r0)
            return
        L_0x0767:
            X.24K r0 = new X.24K
            r0.<init>()
            r3.A06(r0)
            return
        L_0x0770:
            java.lang.Object r2 = r3.A00
            X.33c r2 = (X.C620033c) r2
            java.lang.Object r1 = r3.A01
            X.3QO r1 = (X.AnonymousClass3QO) r1
            java.lang.Object r0 = r3.A02
            X.2zt r0 = (X.C61212zt) r0
            r2.A0A(r1, r0)
            return
        L_0x0780:
            java.lang.Object r4 = r3.A00
            X.33c r4 = (X.C620033c) r4
            java.lang.Object r2 = r3.A01
            X.3QO r2 = (X.AnonymousClass3QO) r2
            java.lang.Object r1 = r3.A02
            X.7Oi r1 = (X.C149897Oi) r1
            X.3XB r0 = r2.A0J
            r0.A05(r1)
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x07a5
            int r0 = r1.A00
            if (r0 != 0) goto L_0x07a5
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "app/mediajobmanager/onFinishUploadMedia job paused for jobId="
            X.C18260x0.A1P(r1, r0, r2)
            return
        L_0x07a5:
            r4.A0D(r2, r1)
            return
        L_0x07a9:
            java.lang.Object r2 = r3.A00
            X.312 r2 = (X.AnonymousClass312) r2
            java.lang.Object r1 = r3.A01
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r3.A02
            java.util.Map r0 = (java.util.Map) r0
            r2.A0C(r1, r0)
            return
        L_0x07b9:
            java.lang.Object r2 = r3.A00
            X.312 r2 = (X.AnonymousClass312) r2
            java.lang.Object r1 = r3.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r3.A02
            java.util.Map r0 = (java.util.Map) r0
            r2.A0B(r1, r0)
            return
        L_0x07c9:
            java.lang.Object r0 = r3.A00
            com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet r0 = (com.whatsapp.groupenforcements.ui.GroupSuspendBottomSheet) r0
            java.lang.Object r2 = r3.A01
            X.4ea r2 = (X.C89654ea) r2
            java.lang.Object r1 = r3.A02
            X.1fJ r1 = (X.C27991fJ) r1
            X.2Zg r0 = r0.A03
            r0.A00(r2, r1)
            return
        L_0x07db:
            java.lang.Object r4 = r3.A00
            X.5hX r4 = (X.C111095hX) r4
            java.lang.Object r1 = r3.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r3.A02
            X.4X7 r0 = (X.AnonymousClass4X7) r0
            android.content.Context r3 = r1.getContext()
            android.content.Context r2 = r1.getContext()
            X.1fJ r1 = r0.A00
            r0 = 4
            android.content.Intent r0 = X.C627736r.A0V(r2, r1, r0)
            r4.A0A(r3, r0)
            return
        L_0x07fa:
            java.lang.Object r0 = r3.A00
            X.3Lq r0 = (X.C66493Lq) r0
            java.lang.Object r8 = r3.A01
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r3.A02
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.2sj r1 = r0.A0b
            X.3dV r0 = r1.A07
            X.4Fq r6 = r0.A04()
            X.3Yo r5 = r6.Axl()     // Catch:{ all -> 0x0873 }
            X.33h r4 = r1.A09     // Catch:{ all -> 0x0869 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0869 }
            java.lang.String r0 = "participant-user-store/removeParticipantFromGroups/"
            r1.append(r0)     // Catch:{ all -> 0x0869 }
            r1.append(r8)     // Catch:{ all -> 0x0869 }
            java.lang.String r0 = " "
            X.C18260x0.A1R(r1, r0, r7)     // Catch:{ all -> 0x0869 }
            X.4Fq r3 = X.C620533h.A02(r4)     // Catch:{ all -> 0x0869 }
            X.3Yo r2 = r3.Axl()     // Catch:{ all -> 0x085f }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x0855 }
        L_0x0832:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0855 }
            if (r0 == 0) goto L_0x0842
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0855 }
            X.1fL r0 = (X.C28011fL) r0     // Catch:{ all -> 0x0855 }
            r4.A0O(r0, r7)     // Catch:{ all -> 0x0855 }
            goto L_0x0832
        L_0x0842:
            r2.A00()     // Catch:{ all -> 0x0855 }
            r2.close()     // Catch:{ all -> 0x085f }
            r3.close()     // Catch:{ all -> 0x0869 }
            r5.A00()     // Catch:{ all -> 0x0869 }
            r5.close()     // Catch:{ all -> 0x0873 }
            r6.close()
            return
        L_0x0855:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x085a }
            goto L_0x085e
        L_0x085a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x085f }
        L_0x085e:
            throw r1     // Catch:{ all -> 0x085f }
        L_0x085f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0864 }
            goto L_0x0868
        L_0x0864:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0869 }
        L_0x0868:
            throw r1     // Catch:{ all -> 0x0869 }
        L_0x0869:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x086e }
            goto L_0x0872
        L_0x086e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0873 }
        L_0x0872:
            throw r1     // Catch:{ all -> 0x0873 }
        L_0x0873:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0bfb }
            throw r1
        L_0x0878:
            java.lang.Object r4 = r3.A00
            X.2qa r4 = (X.C55582qa) r4
            java.lang.Object r2 = r3.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            java.lang.Object r1 = r3.A02
            X.2OD r1 = (X.AnonymousClass2OD) r1
            r0 = 0
            r4.A03(r1, r2, r0)
            return
        L_0x0889:
            java.lang.Object r2 = r3.A00
            X.4EM r2 = (X.AnonymousClass4EM) r2
            java.lang.Object r1 = r3.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r0 = r3.A02
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2.Bd0(r1, r0)
            return
        L_0x089b:
            java.lang.Object r0 = r3.A00
            X.6Bf r0 = (X.C124166Bf) r0
            java.lang.Object r4 = r3.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r2 = r3.A02
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r1 = r0.A00
            com.whatsapp.gallery.MediaGalleryFragment r1 = (com.whatsapp.gallery.MediaGalleryFragment) r1
            X.8v5 r0 = r1.A0L
            X.5mf r0 = (X.C114205mf) r0
            com.whatsapp.gallery.MediaGalleryFragment.A00(r1, r0, r4, r2)
            return
        L_0x08b3:
            java.lang.Object r6 = r3.A00
            X.2at r6 = (X.C45982at) r6
            java.lang.Object r5 = r3.A01
            X.30w r5 = (X.C614630w) r5
            java.lang.Object r4 = r3.A02
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.1VX r2 = r6.A00
            r1 = 1856(0x740, float:2.601E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x08f2
            X.34x r3 = r5.A04
            byte r0 = r3.A1I
            boolean r0 = X.C614630w.A00(r0)
            if (r0 == 0) goto L_0x08f2
            X.2wh r1 = r6.A02
            java.io.File r0 = X.C59302wh.A00(r3)
            if (r0 == 0) goto L_0x08f2
            byte[] r0 = r1.A01(r3)
            r5.A02(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FMessageThumbnailAsyncLoader/generateThumbnail/Thumbnail loaded for message row id: "
            r2.append(r0)
            long r0 = r3.A1L
            X.C18260x0.A1H(r2, r0)
        L_0x08f2:
            X.3My r0 = r6.A01
            r0.A00(r5)
            r4.run()
            return
        L_0x08fb:
            java.lang.Object r5 = r3.A00
            X.3Mm r5 = (X.C66713Mm) r5
            java.lang.Object r2 = r3.A01
            X.2L6 r2 = (X.AnonymousClass2L6) r2
            java.lang.Object r4 = r3.A02
            android.content.Context r4 = (android.content.Context) r4
            X.8qC r0 = r5.A08
            java.lang.Object r3 = X.C18300x5.A0b(r0)
            com.whatsapp.wamsys.JniBridge r3 = (com.whatsapp.wamsys.JniBridge) r3
            X.2Tu r1 = r2.A01
            android.content.Context r7 = r2.A00
            X.8qC r0 = r1.A09
            java.lang.Object r6 = r0.get()
            X.2pr r6 = (X.C55142pr) r6
            X.8qC r0 = r1.A08
            java.lang.Object r10 = r0.get()
            X.3FI r10 = (X.AnonymousClass3FI) r10
            X.8qC r0 = r1.A0A
            java.lang.Object r11 = r0.get()
            X.4FS r11 = (X.AnonymousClass4FS) r11
            X.8qC r0 = r1.A07
            java.lang.Object r8 = r0.get()
            X.2s4 r8 = (X.C56492s4) r8
            X.8qC r0 = r1.A06
            java.lang.Object r9 = r0.get()
            X.2pq r9 = (X.C55132pq) r9
            monitor-enter(r6)
            r6.A02(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0951 }
            X.2XE r0 = r6.A0F     // Catch:{ all -> 0x0951 }
            com.facebook.msys.mci.NetworkSession r2 = r0.A00()     // Catch:{ all -> 0x0951 }
            monitor-exit(r6)
            X.C162457s7.A0D(r2)
            X.1VX r1 = r5.A04
            X.33p r0 = r5.A03
            X.C382826s.A00(r4, r2, r0, r1, r3)
            return
        L_0x0951:
            r1 = move-exception
            monitor-exit(r6)
            throw r1
        L_0x0954:
            java.lang.Object r6 = r3.A00
            com.whatsapp.email.VerifyEmailActivity r6 = (com.whatsapp.email.VerifyEmailActivity) r6
            java.lang.Object r5 = r3.A01
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r4 = r3.A02
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0 = 2
            X.C621433s.A00(r6, r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = X.AnonymousClass0x2.A0D(r5)
            long r2 = r2.toMillis(r0)
            X.2sH r0 = r6.A06
            long r0 = r0.A0H()
            long r2 = r2 + r0
            r6.A01 = r2
            com.whatsapp.email.VerifyEmailActivity.A0L(r6, r5)
            com.whatsapp.email.VerifyEmailActivity.A0C(r6, r4, r5)
            X.2eI r3 = r6.A74()
            java.lang.String r2 = r6.A0B
            int r1 = r6.A00
            r0 = 26
            goto L_0x09e9
        L_0x0988:
            java.lang.Object r6 = r3.A00
            com.whatsapp.email.VerifyEmailActivity r6 = (com.whatsapp.email.VerifyEmailActivity) r6
            java.lang.Object r5 = r3.A01
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r7 = r3.A02
            java.lang.Integer r7 = (java.lang.Integer) r7
            r0 = 3
            X.C621433s.A00(r6, r0)
            if (r5 == 0) goto L_0x09dc
            r3 = 0
            long r1 = r5.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x09dc
            com.whatsapp.WaTextView r4 = r6.A05
            java.lang.String r3 = "resendCodeText"
            if (r4 != 0) goto L_0x09b0
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x09b0:
            r0 = 0
            r4.setClickable(r0)
            com.whatsapp.WaTextView r4 = r6.A05
            if (r4 != 0) goto L_0x09bd
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r3)
            throw r0
        L_0x09bd:
            android.content.res.Resources r3 = r6.getResources()
            r0 = 2131099873(0x7f0600e1, float:1.7812111E38)
            X.C18320x8.A11(r3, r4, r0)
            X.3Wh r4 = r6.A75()
            r0 = 45
            X.3Zk r3 = X.C69983Zk.A00(r6, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r1)
            android.os.Handler r0 = r4.A00
            r0.postDelayed(r3, r1)
        L_0x09dc:
            com.whatsapp.email.VerifyEmailActivity.A0C(r6, r7, r5)
            X.2eI r3 = r6.A74()
            java.lang.String r2 = r6.A0B
            int r1 = r6.A00
            r0 = 15
        L_0x09e9:
            r3.A01(r2, r1, r0)
            return
        L_0x09ed:
            java.lang.Object r4 = r3.A00
            X.4fP r4 = (X.C89864fP) r4
            java.lang.Object r0 = r3.A01
            X.4FU r0 = (X.AnonymousClass4FU) r0
            java.lang.Object r2 = r3.A02
            X.66e r2 = (X.C1228766e) r2
            r0.BjL()
            X.1tO r1 = r4.A00
            if (r1 == 0) goto L_0x0a0c
            r0 = 0
            r1.A01 = r0
            r1.A00 = r0
            r0 = 1
            r1.A0D(r0)
            r0 = 0
            r4.A00 = r0
        L_0x0a0c:
            r2.BOz()
            return
        L_0x0a10:
            java.lang.Object r0 = r3.A00
            com.whatsapp.deeplink.DeepLinkActivity r0 = (com.whatsapp.deeplink.DeepLinkActivity) r0
            java.lang.Object r2 = r3.A01
            X.4uZ r2 = (X.C95814uZ) r2
            java.lang.Object r1 = r3.A02
            X.4uZ r1 = (X.C95814uZ) r1
            X.2sM r0 = r0.A0b
            X.1fH r2 = (X.C27981fH) r2
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            r0.A09(r2, r1)
            return
        L_0x0a26:
            java.lang.Object r1 = r3.A00
            X.2qw r1 = (X.C55802qw) r1
            java.lang.Object r5 = r3.A01
            X.4Bd r5 = (X.C84134Bd) r5
            java.lang.Object r6 = r3.A02
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            X.3XB r4 = r1.A00
            java.lang.Object r0 = r4.A01()
            if (r0 != 0) goto L_0x0a8d
            X.C626936e.A00()
            X.1RE r0 = r1.A02
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0a85 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0a85 }
            java.lang.String r2 = "SELECT DISTINCT (device_id) FROM msg_history_sync WHERE status=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0a85 }
            X.C18270x1.A1O(r1, r0)     // Catch:{ all -> 0x0a85 }
            java.lang.String r0 = "MessageHistorySyncTable.SELECT_ALL_DEVICE_ID_FOR_SYNC_STATUS"
            android.database.Cursor r3 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0a85 }
            java.util.HashMap r2 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0a79 }
        L_0x0a5a:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0a79 }
            if (r0 == 0) goto L_0x0a72
            java.lang.String r0 = "device_id"
            java.lang.String r0 = X.AnonymousClass0x2.A0Z(r3, r0)     // Catch:{ all -> 0x0a79 }
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ all -> 0x0a79 }
            if (r1 == 0) goto L_0x0a5a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0a79 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0a79 }
            goto L_0x0a5a
        L_0x0a72:
            r4.A05(r2)     // Catch:{ all -> 0x0a79 }
            r3.close()     // Catch:{ all -> 0x0a85 }
            goto L_0x0a8a
        L_0x0a79:
            r1 = move-exception
            if (r3 == 0) goto L_0x0a84
            r3.close()     // Catch:{ all -> 0x0a80 }
            goto L_0x0a84
        L_0x0a80:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a85 }
        L_0x0a84:
            throw r1     // Catch:{ all -> 0x0a85 }
        L_0x0a85:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0bfb }
            throw r1
        L_0x0a8a:
            r7.close()
        L_0x0a8d:
            r4.A04(r5, r6)
            return
        L_0x0a91:
            java.lang.Object r0 = r3.A00
            X.37Q r0 = (X.AnonymousClass37Q) r0
            java.lang.Object r2 = r3.A01
            X.33G r2 = (X.AnonymousClass33G) r2
            java.lang.Object r1 = r3.A02
            android.location.Location r1 = (android.location.Location) r1
            X.1iB r0 = r0.A01
            r0.A0E(r1, r2)
            return
        L_0x0aa3:
            java.lang.Object r0 = r3.A00
            X.3H3 r0 = (X.AnonymousClass3H3) r0
            java.lang.Object r2 = r3.A01
            X.2fi r2 = (X.C48932fi) r2
            java.lang.Object r7 = r3.A02
            X.1iB r6 = r0.A01
            java.lang.Object r5 = r6.A0P
            monitor-enter(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba1 }
            java.lang.String r0 = "companion-device-manager/critical sync successful. DeviceJid: "
            r1.append(r0)     // Catch:{ all -> 0x0ba1 }
            X.33G r9 = r2.A02     // Catch:{ all -> 0x0ba1 }
            com.whatsapp.jid.DeviceJid r8 = r9.A07     // Catch:{ all -> 0x0ba1 }
            X.C18260x0.A0o(r8, r1)     // Catch:{ all -> 0x0ba1 }
            java.util.Iterator r1 = X.C61102zi.A03(r6)     // Catch:{ all -> 0x0ba1 }
        L_0x0ac6:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0ba1 }
            if (r0 == 0) goto L_0x0ad6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0ba1 }
            X.4FJ r0 = (X.AnonymousClass4FJ) r0     // Catch:{ all -> 0x0ba1 }
            r0.BR0(r2)     // Catch:{ all -> 0x0ba1 }
            goto L_0x0ac6
        L_0x0ad6:
            X.7ky r2 = r6.A09     // Catch:{ all -> 0x0ba1 }
            r1 = 2
            java.lang.String r0 = "CompanionDevice"
            android.location.Location r3 = r2.A02(r0, r1)     // Catch:{ all -> 0x0ba1 }
            if (r3 == 0) goto L_0x0b80
            long r10 = r3.getTime()     // Catch:{ all -> 0x0ba1 }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r10 = r10 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ba1 }
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b80
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba1 }
            java.lang.String r0 = "CompanionDevice/location/last "
            r2.append(r0)     // Catch:{ all -> 0x0ba1 }
            long r0 = r3.getTime()     // Catch:{ all -> 0x0ba1 }
            X.C18260x0.A1I(r2, r0)     // Catch:{ all -> 0x0ba1 }
            r6.A0E(r3, r9)     // Catch:{ all -> 0x0ba1 }
        L_0x0b04:
            X.33p r4 = r6.A0F     // Catch:{ all -> 0x0ba1 }
            java.lang.String r3 = r8.getRawString()     // Catch:{ all -> 0x0ba1 }
            X.C626936e.A06(r3)     // Catch:{ all -> 0x0ba1 }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r4)     // Catch:{ all -> 0x0ba1 }
            r0 = 0
            java.lang.String r2 = "companion_device_verification_ids"
            java.lang.String r0 = r1.getString(r2, r0)     // Catch:{ all -> 0x0ba1 }
            if (r0 == 0) goto L_0x0b24
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x0ba1 }
            java.lang.String r0 = ","
            java.lang.String r3 = X.AnonymousClass000.A0V(r0, r3, r1)     // Catch:{ all -> 0x0ba1 }
        L_0x0b24:
            android.content.SharedPreferences$Editor r0 = X.C18270x1.A03(r4)     // Catch:{ all -> 0x0ba1 }
            X.C18270x1.A0j(r0, r2, r3)     // Catch:{ all -> 0x0ba1 }
            X.2oU r0 = r6.A0E     // Catch:{ all -> 0x0ba1 }
            android.content.Context r9 = r0.A00     // Catch:{ all -> 0x0ba1 }
            java.lang.Class<com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver> r10 = com.whatsapp.companiondevice.CompanionDeviceVerificationReceiver.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r9, r10)     // Catch:{ all -> 0x0ba1 }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = 0
            android.app.PendingIntent r0 = X.C624735e.A01(r9, r8, r1, r0)     // Catch:{ all -> 0x0ba1 }
            if (r0 != 0) goto L_0x0b74
            java.util.Random r0 = X.AnonymousClass0x9.A1C()     // Catch:{ all -> 0x0ba1 }
            double r0 = r0.nextDouble()     // Catch:{ all -> 0x0ba1 }
            r2 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r0 = r0 * r2
            long r3 = (long) r0     // Catch:{ all -> 0x0ba1 }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 + r0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0ba1 }
            long r1 = r1 + r3
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0ba1 }
            java.lang.String r0 = "CompanionDevice/scheduleCompanionDeviceVerificationAlarm/ whenMillis "
            X.C18260x0.A10(r0, r3, r1)     // Catch:{ all -> 0x0ba1 }
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r9, r10)     // Catch:{ all -> 0x0ba1 }
            android.app.PendingIntent r3 = X.C624735e.A03(r9, r0, r8)     // Catch:{ all -> 0x0ba1 }
            X.2it r0 = r6.A0C     // Catch:{ all -> 0x0ba1 }
            boolean r0 = r0.A01(r3, r8, r1)     // Catch:{ all -> 0x0ba1 }
            if (r0 != 0) goto L_0x0b74
            java.lang.String r0 = "CompanionDevice/scheduleCompanionDeviceVerificationAlarm AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0ba1 }
        L_0x0b74:
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x0ba1 }
            X.2nP r0 = r6.A0J     // Catch:{ all -> 0x0ba1 }
            X.1i4 r0 = r0.A04     // Catch:{ all -> 0x0ba1 }
            r0.A07(r7)     // Catch:{ all -> 0x0ba1 }
            monitor-exit(r5)     // Catch:{ all -> 0x0ba1 }
            goto L_0x0ba0
        L_0x0b80:
            X.37Q r4 = new X.37Q     // Catch:{ all -> 0x0ba1 }
            r4.<init>(r9, r6)     // Catch:{ all -> 0x0ba1 }
            android.os.Handler r3 = r6.A04     // Catch:{ all -> 0x0ba1 }
            r1 = 12
            X.3bx r0 = new X.3bx     // Catch:{ all -> 0x0ba1 }
            r0.<init>(r6, r1, r4)     // Catch:{ all -> 0x0ba1 }
            r3.post(r0)     // Catch:{ all -> 0x0ba1 }
            r0 = 13
            X.3bx r2 = new X.3bx     // Catch:{ all -> 0x0ba1 }
            r2.<init>(r6, r0, r4)     // Catch:{ all -> 0x0ba1 }
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.postDelayed(r2, r0)     // Catch:{ all -> 0x0ba1 }
            goto L_0x0b04
        L_0x0ba0:
            return
        L_0x0ba1:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0ba1 }
            throw r1
        L_0x0ba4:
            java.lang.Object r8 = r3.A00
            X.33h r8 = (X.C620533h) r8
            java.lang.Object r7 = r3.A01
            X.33k r7 = (X.C620833k) r7
            java.lang.Object r2 = r3.A02
            java.util.Map r2 = (java.util.Map) r2
            X.2ba r1 = r8.A08
            X.1fL r0 = r7.A05
            X.33k r6 = r1.A00(r0)
            X.4Fq r5 = X.C620533h.A02(r8)
            X.3Yo r4 = r5.Axl()     // Catch:{ all -> 0x0bf6 }
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r2)     // Catch:{ all -> 0x0bec }
        L_0x0bc4:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0bec }
            if (r0 == 0) goto L_0x0be2
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)     // Catch:{ all -> 0x0bec }
            com.whatsapp.jid.UserJid r2 = X.C18320x8.A0P(r0)     // Catch:{ all -> 0x0bec }
            r1 = r7
            if (r6 == 0) goto L_0x0bd6
            r1 = r6
        L_0x0bd6:
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0bec }
            boolean r0 = X.AnonymousClass001.A1Z(r0)     // Catch:{ all -> 0x0bec }
            r8.A0H(r1, r2, r0)     // Catch:{ all -> 0x0bec }
            goto L_0x0bc4
        L_0x0be2:
            r4.A00()     // Catch:{ all -> 0x0bec }
            r4.close()     // Catch:{ all -> 0x0bf6 }
            r5.close()
            return
        L_0x0bec:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0bf1 }
            goto L_0x0bf5
        L_0x0bf1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0bf6 }
        L_0x0bf5:
            throw r1     // Catch:{ all -> 0x0bf6 }
        L_0x0bf6:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0bfb }
            throw r1
        L_0x0bfb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0c00:
            java.lang.Object r0 = r3.A00
            X.2c2 r0 = (X.C46682c2) r0
            java.lang.Object r2 = r3.A01
            X.1fJ r2 = (X.C27991fJ) r2
            java.lang.Object r1 = r3.A02
            java.util.List r1 = (java.util.List) r1
            X.2lN r0 = r0.A03
            r0.A00(r2)
            r0.A02(r1)
            return
        L_0x0c15:
            java.lang.Object r0 = r3.A00
            X.300 r0 = (X.AnonymousClass300) r0
            java.lang.Object r4 = r3.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r2 = r3.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.7am r1 = r0.A03
            r0 = 4
            r1.A03(r4, r2, r0)
            return
        L_0x0c28:
            java.lang.Object r6 = r3.A00
            X.2sj r6 = (X.C56892sj) r6
            java.lang.Object r5 = r3.A01
            X.4uZ r5 = (X.C95814uZ) r5
            java.lang.Object r4 = r3.A02
            X.0Wx r4 = (X.C06270Wx) r4
            X.2sM r0 = r6.A0B
            com.whatsapp.jid.PhoneUserJid r1 = X.C56662sM.A00(r0, r5)
            if (r1 != 0) goto L_0x0c53
            X.2qk r3 = r6.A00
            r2 = 0
            r1 = 0
            java.lang.String r0 = "lid_group_chat/pn_unknown"
            r3.A0A(r0, r1, r2)
        L_0x0c45:
            X.33D r0 = new X.33D
            r0.<init>(r5)
            r4.A0G(r0)
            X.3Wi r0 = r6.A01
            r0.A0D()
            return
        L_0x0c53:
            java.lang.String r0 = "[LidGroup]GroupParticipantsManager/selectJidFor1to1Chat PN JID"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r1
            goto L_0x0c45
        L_0x0c5a:
            java.lang.Object r5 = r3.A00
            X.30G r5 = (X.AnonymousClass30G) r5
            java.lang.Object r4 = r3.A01
            X.34x r4 = (X.C624134x) r4
            java.lang.Object r2 = r3.A02
            X.34x r2 = (X.C624134x) r2
            X.2pF r1 = r5.A0I
            X.2z0 r0 = r4.A1J
            r1.A03(r0)
            r1.A02(r2)
            X.2ss r0 = r5.A07
            r0.A0J(r2)
            r0 = 1
            r4.A1N = r0
            return
        L_0x0c79:
            java.lang.Object r4 = r3.A00
            X.2h6 r4 = (X.C49792h6) r4
            java.lang.Object r2 = r3.A01
            X.31A r2 = (X.AnonymousClass31A) r2
            java.lang.Object r0 = r3.A02
            X.34x r0 = (X.C624134x) r0
            long r0 = r0.A1L
            r2.A0C = r0
            X.2sm r0 = r4.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c94, Error | RuntimeException -> 0x0c8f }
            r0.A0F(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c94, Error | RuntimeException -> 0x0c8f }
            return
        L_0x0c8f:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x0c94:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.2q5 r0 = r4.A03
            r0.A04()
            return
        L_0x0c9e:
            return
        L_0x0c9f:
            java.lang.String r3 = "_data=?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0cc1, RuntimeException -> 0x0cb0 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0cc1, RuntimeException -> 0x0cb0 }
            r0 = 0
            r2[r0] = r1     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0cc1, RuntimeException -> 0x0cb0 }
            r4.A01(r6, r3, r2)     // Catch:{ IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0cc1, RuntimeException -> 0x0cb0 }
            return
        L_0x0cb0:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x0cc0
            java.lang.String r0 = "android.os.DeadSystemException"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0cc0
            goto L_0x0cc2
        L_0x0cc0:
            throw r2
        L_0x0cc1:
            r2 = move-exception
        L_0x0cc2:
            com.whatsapp.util.Log.e(r5, r2)
            return
        L_0x0cc6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0cc8 }
        L_0x0cc8:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0ccd }
            throw r0     // Catch:{ all -> 0x0ccd }
        L_0x0ccd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0ccf }
        L_0x0ccf:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r6, r0)
            throw r1
        L_0x0cd4:
            java.lang.Object r5 = r3.A00
            X.2qJ r5 = (X.C55412qJ) r5
            java.lang.Object r4 = r3.A01
            X.4uZ r4 = (X.C95814uZ) r4
            java.lang.Object r2 = r3.A02
            X.2fO r2 = (X.C48742fO) r2
            X.2ss r0 = r5.A02
            X.31A r1 = X.C56982ss.A00(r0, r4)
            if (r1 != 0) goto L_0x0cf3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "groupchatstore/updateGroupChatInfoInBackgroundIfExists/chat does not exist: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)
            goto L_0x0d5e
        L_0x0cf3:
            r1.A0e = r2
            r0 = 0
            r5.A03(r1, r4, r0)
            return
        L_0x0cfa:
            java.lang.Object r4 = r3.A00
            X.3Lv r4 = (X.C66543Lv) r4
            java.lang.Object r8 = r3.A01
            X.2z0 r8 = (X.AnonymousClass2z0) r8
            java.lang.Object r3 = r3.A02
            X.34w r3 = (X.C624034w) r3
            X.34x r2 = X.C55832qz.A00(r4, r8)
            if (r2 == 0) goto L_0x0d80
            X.34w r14 = r2.A0P
        L_0x0d0e:
            X.9U4 r0 = r4.A28
            X.36F r7 = r0.A0A()
            java.lang.String r9 = " ts: "
            if (r14 == 0) goto L_0x0e41
            int r5 = r14.A02
            java.lang.String r13 = r14.A0J
            boolean r0 = r14.A0O()
            if (r0 == 0) goto L_0x0d29
            boolean r0 = r3.A0O()
            r11 = 1
            if (r0 == 0) goto L_0x0d2a
        L_0x0d29:
            r11 = 0
        L_0x0d2a:
            int r10 = r3.A03
            long r0 = r3.A06
            X.1S4 r6 = r3.A0A
            boolean r0 = r14.A0P(r6, r10, r0)
            java.lang.String r10 = " new: "
            if (r0 != 0) goto L_0x0d62
            if (r11 != 0) goto L_0x0d62
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY nochange: old status: "
            r2.append(r0)
            int r0 = r14.A02
            r2.append(r0)
            r2.append(r10)
            int r0 = r3.A02
            r2.append(r0)
            java.lang.String r0 = " old ts: "
            X.C624034w.A01(r14, r0, r2)
            java.lang.String r0 = " new ts: "
            X.C624034w.A01(r3, r0, r2)
        L_0x0d5a:
            java.lang.String r0 = r2.toString()
        L_0x0d5e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0d62:
            java.lang.String r6 = r14.A0K
            if (r6 != 0) goto L_0x0d6c
            java.lang.String r0 = r3.A0K
            r14.A0K = r0
        L_0x0d6a:
            monitor-enter(r3)
            goto L_0x0d82
        L_0x0d6c:
            java.lang.String r1 = r3.A0K
            if (r1 == 0) goto L_0x0d6a
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x0d6a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY nochange: id's not equal, old trans id: "
            X.C18260x0.A0p(r0, r6, r10, r1, r2)
            goto L_0x0d5a
        L_0x0d80:
            r14 = 0
            goto L_0x0d0e
        L_0x0d82:
            boolean r0 = r3.A0L()     // Catch:{ all -> 0x0e3e }
            if (r0 != 0) goto L_0x0d8e
            int r1 = r3.A00     // Catch:{ all -> 0x0e3e }
            r0 = 1
            if (r1 != r0) goto L_0x0d8e
            goto L_0x0d8f
        L_0x0d8e:
            r0 = 0
        L_0x0d8f:
            monitor-exit(r3)
            if (r0 == 0) goto L_0x0db1
            int r1 = r3.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 != r0) goto L_0x0db1
            long r0 = r2.A1L
            X.2z0 r6 = r2.A1J
            java.lang.String r10 = r6.A01
            java.lang.String r6 = r14.A0K
            X.34w r0 = r7.A0H(r10, r6, r0)
            if (r0 == 0) goto L_0x0db1
            X.1S4 r1 = r0.A0A
            if (r1 == 0) goto L_0x0db1
            X.39U r0 = r1.A02
            if (r0 == 0) goto L_0x0db1
            r3.A08(r0, r1)
        L_0x0db1:
            int r12 = r3.A02
            long r15 = r3.A06
            java.lang.String r11 = r3.A0H
            java.lang.String r10 = r3.A0J
            java.lang.String r1 = r3.A0F
            X.1S4 r0 = r3.A0A
            r6 = 16
            monitor-enter(r14)
            r20 = r1
            r17 = r11
            r18 = r12
            r19 = r10
            r14.A07(r15, r17, r18, r19, r20)     // Catch:{ all -> 0x0dd8 }
            if (r0 == 0) goto L_0x0ddb
            X.1S4 r1 = r14.A0A     // Catch:{ all -> 0x0dd8 }
            if (r1 == 0) goto L_0x0dd5
            r1.A0W(r0)     // Catch:{ all -> 0x0dd8 }
            goto L_0x0ddb
        L_0x0dd5:
            r14.A0A = r0     // Catch:{ all -> 0x0dd8 }
            goto L_0x0ddb
        L_0x0dd8:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x0ddb:
            monitor-exit(r14)
            int r1 = r14.A03
            r0 = 5
            if (r1 != r0) goto L_0x0e0c
            java.lang.String r0 = r8.A01
            boolean r0 = r7.A0f(r3, r14, r0)
            r2.A0P = r3
            r14.A0B(r3)
        L_0x0dec:
            if (r0 == 0) goto L_0x0e81
            int r0 = r3.A02
            if (r0 == r5) goto L_0x0e05
            X.9aq r10 = r4.A27
            X.2z0 r7 = r2.A1J
            long r0 = r2.A0K
            r11 = r14
            r12 = r7
            r14 = r5
            r15 = r0
            X.1of r0 = r10.A00(r11, r12, r13, r14, r15)
            if (r0 == 0) goto L_0x0e05
            r4.A09(r0, r6)
        L_0x0e05:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY updated transaction status to: "
            goto L_0x0e6c
        L_0x0e0c:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0e1b
            java.util.ArrayList r0 = X.C18300x5.A0s(r3)
            r2.A0P = r3
            boolean r0 = r7.A0h(r0)
            goto L_0x0dec
        L_0x0e1b:
            X.34w r8 = r2.A0P
            if (r8 == 0) goto L_0x0e81
            X.2z0 r1 = r2.A1J
            X.1S4 r0 = r3.A0A
            if (r0 == 0) goto L_0x0e39
            long r20 = r0.A0B()
            int r19 = r0.A07()
        L_0x0e2d:
            r15 = r7
            r16 = r8
            r17 = r1
            r18 = r5
            boolean r0 = r15.A0g(r16, r17, r18, r19, r20)
            goto L_0x0dec
        L_0x0e39:
            r20 = 0
            r19 = 0
            goto L_0x0e2d
        L_0x0e3e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0e41:
            r6 = 16
            java.lang.String r0 = r3.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0e92
            X.2YF r2 = r4.A1u
            r0 = 0
            r5 = 0
            X.34x r2 = r2.A00(r8, r5, r0)
            java.lang.String r0 = r3.A0K
            r2.A15 = r0
            r2.A0P = r3
            java.lang.String r1 = r7.A0J(r2, r5)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "CoreMessageStore/updateMessagePaymentTransaction/PAY added new transaction with trans id: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " status: "
        L_0x0e6c:
            r5.append(r0)
            int r0 = r3.A02
            r5.append(r0)
            r5.append(r9)
            long r0 = r3.A06
            X.C18260x0.A1I(r5, r0)
            X.2hU r0 = r4.A0q
            r0.A00(r2, r6)
        L_0x0e81:
            X.3Lu r1 = r4.A0m
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x0e8c
            r1.A0K(r2)
        L_0x0e8c:
            X.2nO r0 = r4.A1F
            r0.A00(r2)
            return
        L_0x0e92:
            if (r2 == 0) goto L_0x0e8c
            goto L_0x0e81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70343aL.run():void");
    }
}
