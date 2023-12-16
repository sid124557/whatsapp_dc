package X;

/* renamed from: X.8Lw  reason: invalid class name and case insensitive filesystem */
public class C172578Lw implements Runnable {
    public final int A00;

    public C172578Lw(int i) {
        this.A00 = i;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void run() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0006;
                case 2: goto L_0x008b;
                case 3: goto L_0x0128;
                case 4: goto L_0x012d;
                case 5: goto L_0x0131;
                case 6: goto L_0x0135;
                case 7: goto L_0x0139;
                case 8: goto L_0x013d;
                case 9: goto L_0x0141;
                case 10: goto L_0x0145;
                case 11: goto L_0x0149;
                case 12: goto L_0x014d;
                case 13: goto L_0x014d;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0115;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0005;
                case 29: goto L_0x011b;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C159927mh.A05
            r1 = 0
            int r0 = r0.getAndSet(r1)
            float r4 = (float) r0
            java.util.concurrent.atomic.AtomicInteger r0 = X.C159927mh.A04
            int r0 = r0.getAndSet(r1)
            float r3 = (float) r0
            java.util.concurrent.atomic.AtomicInteger r0 = X.C159927mh.A03
            int r0 = r0.getAndSet(r1)
            float r2 = (float) r0
            float r1 = r4 + r3
            float r1 = r1 + r2
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007d
            float r4 = r4 / r1
            float r3 = r3 / r1
            float r2 = r2 / r1
            r0 = 1048576000(0x3e800000, float:0.25)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
            r0 = 1065017672(0x3f7ae148, float:0.98)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0078
            java.util.concurrent.ConcurrentHashMap r0 = X.C159927mh.A02
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r0)
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0078
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r1 = r0.getKey()
            X.7FO r1 = (X.AnonymousClass7FO) r1
            int r0 = X.AnonymousClass0x2.A08(r0)
            X.C159927mh.A00(r1, r0)
            goto L_0x0041
        L_0x0059:
            java.util.concurrent.ConcurrentHashMap r0 = X.C159927mh.A02
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r0)
        L_0x005f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0078
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r2)
            java.lang.Object r1 = r0.getKey()
            X.7FO r1 = (X.AnonymousClass7FO) r1
            int r0 = X.AnonymousClass0x2.A08(r0)
            int r0 = -r0
            X.C159927mh.A00(r1, r0)
            goto L_0x005f
        L_0x0078:
            java.util.concurrent.ConcurrentHashMap r0 = X.C159927mh.A02
            r0.clear()
        L_0x007d:
            X.66R r0 = X.C159927mh.A06
            java.lang.Object r3 = r0.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Runnable r2 = X.C159927mh.A00
            r0 = 2000(0x7d0, double:9.88E-321)
            goto L_0x010e
        L_0x008b:
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 10000(0x2710, double:4.9407E-320)
            long r2 = r2 - r0
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.util.concurrent.ConcurrentHashMap r6 = X.C156167g9.A02
            monitor-enter(r6)
            java.util.LinkedHashMap r3 = X.C18320x8.A0r()     // Catch:{ all -> 0x0112 }
            java.util.Iterator r2 = X.AnonymousClass001.A0u(r6)     // Catch:{ all -> 0x0112 }
        L_0x00a2:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00be
            java.util.Map$Entry r1 = X.AnonymousClass001.A0w(r2)     // Catch:{ all -> 0x0112 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0112 }
            X.7FT r0 = (X.AnonymousClass7FT) r0     // Catch:{ all -> 0x0112 }
            java.util.Date r0 = r0.A01     // Catch:{ all -> 0x0112 }
            int r0 = r0.compareTo(r4)     // Catch:{ all -> 0x0112 }
            if (r0 >= 0) goto L_0x00a2
            X.C18270x1.A1N(r3, r1)     // Catch:{ all -> 0x0112 }
            goto L_0x00a2
        L_0x00be:
            java.util.Iterator r5 = X.AnonymousClass000.A0q(r3)     // Catch:{ all -> 0x0112 }
        L_0x00c2:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0101
            java.util.Map$Entry r4 = X.AnonymousClass001.A0w(r5)     // Catch:{ all -> 0x0112 }
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x0112 }
            X.7FT r0 = (X.AnonymousClass7FT) r0     // Catch:{ all -> 0x0112 }
            X.7kg r3 = r0.A00     // Catch:{ all -> 0x0112 }
            java.util.concurrent.ConcurrentHashMap r2 = r3.A0A     // Catch:{ all -> 0x0112 }
            java.util.Collection r0 = r2.values()     // Catch:{ all -> 0x0112 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0112 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0112 }
        L_0x00e1:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0112 }
            X.8Kh r0 = (X.C172258Kh) r0     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00e1
            r0.close()     // Catch:{ all -> 0x0112 }
            goto L_0x00e1
        L_0x00f3:
            r2.clear()     // Catch:{ all -> 0x0112 }
            r0 = -1
            r3.A00 = r0     // Catch:{ all -> 0x0112 }
            java.lang.Object r0 = r4.getKey()     // Catch:{ all -> 0x0112 }
            r6.remove(r0)     // Catch:{ all -> 0x0112 }
            goto L_0x00c2
        L_0x0101:
            monitor-exit(r6)
            X.66R r0 = X.C159927mh.A06
            java.lang.Object r3 = r0.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Runnable r2 = X.C159927mh.A01
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x010e:
            r3.postDelayed(r2, r0)
            return
        L_0x0112:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0115:
            java.lang.String r0 = "ConversationSketchLogger: onChatMessagesSent"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return
        L_0x011b:
            java.lang.String r0 = "Killing WhatsApp process"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x0128:
            r0 = 1
            X.C161617q6.A00(r0)
            return
        L_0x012d:
            com.whatsapp.aborthooks.AbortHooks.init()
            return
        L_0x0131:
            com.whatsapp.util.Log.rotate()
            return
        L_0x0135:
            com.whatsapp.voipcalling.Voip.turnCameraOff()
            return
        L_0x0139:
            com.whatsapp.voipcalling.Voip.acceptVideoUpgrade()
            return
        L_0x013d:
            com.whatsapp.voipcalling.Voip.joinCallLink()
            return
        L_0x0141:
            com.whatsapp.voipcalling.Voip.requestVideoUpgrade()
            return
        L_0x0145:
            com.whatsapp.voipcalling.Voip.turnCameraOn()
            return
        L_0x0149:
            com.whatsapp.voipcalling.Voip.groupCallBufferProcessMessages()
            return
        L_0x014d:
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader.A00()
            return
        L_0x0151:
            java.util.concurrent.BlockingQueue r0 = X.C126006Ki.A03     // Catch:{ InterruptedException -> 0x0151 }
            java.lang.Object r3 = r0.take()     // Catch:{ InterruptedException -> 0x0151 }
            X.7J0 r3 = (X.AnonymousClass7J0) r3     // Catch:{ InterruptedException -> 0x0151 }
            r2 = 0
            java.lang.String r0 = r3.A01     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            if (r0 != 0) goto L_0x0168
            X.7kc r1 = X.C158827kc.A09     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            monitor-enter(r1)     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            monitor-exit(r1)     // Catch:{ all -> 0x0164 }
            goto L_0x0236
        L_0x0164:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0164 }
            goto L_0x0221
        L_0x0168:
            X.8Kc r7 = X.C126006Ki.A05     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            java.lang.String r6 = r3.A01     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            monitor-enter(r7)     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            java.io.Writer r0 = r7.A04     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x0218
            X.C172208Kc.A04(r6)     // Catch:{ all -> 0x021f }
            java.util.LinkedHashMap r0 = r7.A0B     // Catch:{ all -> 0x021f }
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x021f }
            X.7Wv r1 = (X.C151927Wv) r1     // Catch:{ all -> 0x021f }
            if (r1 != 0) goto L_0x01a4
            X.7Wv r1 = new X.7Wv     // Catch:{ all -> 0x021f }
            r1.<init>(r7, r6)     // Catch:{ all -> 0x021f }
            r0.put(r6, r1)     // Catch:{ all -> 0x021f }
        L_0x0186:
            X.7Tg r5 = new X.7Tg     // Catch:{ all -> 0x021f }
            r5.<init>(r1, r7)     // Catch:{ all -> 0x021f }
            r1.A01 = r5     // Catch:{ all -> 0x021f }
            java.io.Writer r4 = r7.A04     // Catch:{ all -> 0x021f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x021f }
            java.lang.String r0 = "DIRTY "
            r1.append(r0)     // Catch:{ all -> 0x021f }
            r1.append(r6)     // Catch:{ all -> 0x021f }
            X.AnonymousClass6C7.A12(r4, r1)     // Catch:{ all -> 0x021f }
            java.io.Writer r0 = r7.A04     // Catch:{ all -> 0x021f }
            r0.flush()     // Catch:{ all -> 0x021f }
            goto L_0x01a9
        L_0x01a4:
            X.7Tg r0 = r1.A01     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x0186
            goto L_0x0216
        L_0x01a9:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            r7 = 0
            X.8Kc r6 = r5.A04     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            int r4 = r6.A06     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            if (r7 >= r4) goto L_0x0200
            monitor-enter(r6)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            X.7Wv r8 = r5.A02     // Catch:{ all -> 0x01fd }
            X.7Tg r0 = r8.A01     // Catch:{ all -> 0x01fd }
            if (r0 != r5) goto L_0x01f8
            boolean r0 = r8.A02     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x01c1
            boolean[] r1 = r5.A03     // Catch:{ all -> 0x01fd }
            r0 = 1
            r1[r7] = r0     // Catch:{ all -> 0x01fd }
        L_0x01c1:
            java.io.File r1 = r8.A01()     // Catch:{ all -> 0x01fd }
            java.io.FileOutputStream r0 = X.AnonymousClass0x9.A0h(r1)     // Catch:{ FileNotFoundException -> 0x01ca }
            goto L_0x01d3
        L_0x01ca:
            java.io.File r0 = r6.A07     // Catch:{ all -> 0x01fd }
            r0.mkdirs()     // Catch:{ all -> 0x01fd }
            java.io.FileOutputStream r0 = X.AnonymousClass0x9.A0h(r1)     // Catch:{ FileNotFoundException -> 0x01d9 }
        L_0x01d3:
            X.6tc r4 = new X.6tc     // Catch:{ all -> 0x01fd }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x01fd }
            goto L_0x01db
        L_0x01d9:
            java.io.OutputStream r4 = X.C172208Kc.A0E     // Catch:{ all -> 0x01fd }
        L_0x01db:
            monitor-exit(r6)     // Catch:{ all -> 0x01fd }
            r2 = r4
            byte[] r1 = r3.A02     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            int r0 = r3.A00     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            r4.write(r1, r7, r0)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            boolean r0 = r5.A01     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            r1 = 1
            if (r0 == 0) goto L_0x01f4
            X.C172208Kc.A00(r5, r6, r7)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            java.lang.String r0 = r8.A03     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            r6.A06(r0)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
        L_0x01f1:
            r5.A00 = r1     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            goto L_0x0233
        L_0x01f4:
            X.C172208Kc.A00(r5, r6, r1)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            goto L_0x01f1
        L_0x01f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01fd }
            goto L_0x0212
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            java.lang.String r0 = "Expected index "
            r1.append(r0)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            r1.append(r7)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
            java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0G(r0, r1, r4)     // Catch:{ IOException -> 0x0213, all -> 0x023f }
        L_0x0212:
            throw r0     // Catch:{ IOException -> 0x0213, all -> 0x023f }
        L_0x0213:
            r4 = r2
            r2 = r5
            goto L_0x0223
        L_0x0216:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0222, all -> 0x024f }
            goto L_0x0236
        L_0x0218:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x021f }
            throw r0     // Catch:{ all -> 0x021f }
        L_0x021f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0222, all -> 0x024f }
        L_0x0221:
            throw r0     // Catch:{ IOException -> 0x0222, all -> 0x024f }
        L_0x0222:
            r4 = r2
        L_0x0223:
            X.7kc r0 = X.C158827kc.A0B     // Catch:{ all -> 0x023b }
            r0.A01()     // Catch:{ all -> 0x023b }
            if (r2 == 0) goto L_0x0231
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0231
            r2.A00()     // Catch:{ IOException -> 0x0231 }
        L_0x0231:
            if (r4 == 0) goto L_0x0236
        L_0x0233:
            r4.close()     // Catch:{ IOException -> 0x0236 }
        L_0x0236:
            X.AnonymousClass82B.A01(r3)
            goto L_0x0151
        L_0x023b:
            r1 = move-exception
            if (r2 == 0) goto L_0x0249
            goto L_0x0242
        L_0x023f:
            r1 = move-exception
            r4 = r2
            r2 = r5
        L_0x0242:
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0249
            r2.A00()     // Catch:{ IOException -> 0x0249 }
        L_0x0249:
            if (r4 == 0) goto L_0x0250
            r4.close()     // Catch:{ IOException -> 0x0250 }
            throw r1
        L_0x024f:
            r1 = move-exception
        L_0x0250:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172578Lw.run():void");
    }
}
