package X;

/* renamed from: X.6q4  reason: invalid class name and case insensitive filesystem */
public final class C138286q4 extends C173778Rq {
    public final C69263Wi A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass2IA A02;
    public final AnonymousClass7IO A03;
    public final C147387Ec A04 = new C147387Ec();
    public volatile C147377Eb A05;
    public volatile boolean A06;

    public void A00() {
        this.A06 = true;
        AnonymousClass7O6 r1 = this.A05.A00;
        r1.A00 = null;
        AnonymousClass7IO r12 = r1.A04;
        synchronized (r12) {
            r12.A00 = null;
        }
        interrupt();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r12 = this;
            r0 = 1
            android.os.Process.setThreadPriority(r0)
            r3 = 0
        L_0x0005:
            boolean r0 = r12.A06
            r6 = 276(0x114, float:3.87E-43)
            if (r0 != 0) goto L_0x01b0
            X.7IO r5 = r12.A03     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            monitor-enter(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            java.util.PriorityQueue r2 = r5.A01     // Catch:{ all -> 0x01a2 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x001b
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.wait(r0)     // Catch:{ all -> 0x01a2 }
        L_0x001b:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r0 != 0) goto L_0x0028
            java.lang.Object r4 = r2.remove()     // Catch:{ all -> 0x01a2 }
            X.8LW r4 = (X.AnonymousClass8LW) r4     // Catch:{ all -> 0x01a2 }
            goto L_0x0032
        L_0x0028:
            X.6q4 r0 = r5.A00     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x002f
            r0.A00()     // Catch:{ all -> 0x01a2 }
        L_0x002f:
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            r4 = 0
            goto L_0x0033
        L_0x0032:
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
        L_0x0033:
            X.1VX r0 = r12.A01     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            boolean r0 = r0.A0X(r6)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            if (r0 == 0) goto L_0x0063
            if (r4 == 0) goto L_0x0073
            X.7Ec r7 = r12.A04     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            X.7XJ r0 = r4.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            int r5 = r0.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            monitor-enter(r7)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            java.util.HashMap r2 = r7.A00     // Catch:{ all -> 0x01a5 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01a5 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x01a5 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x01a5 }
            goto L_0x0060
        L_0x0057:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01a5 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r5, r0)     // Catch:{ all -> 0x01a5 }
            r2.put(r1, r0)     // Catch:{ all -> 0x01a5 }
        L_0x0060:
            monitor-exit(r7)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            r3 = r0
            goto L_0x0073
        L_0x0063:
            if (r3 != 0) goto L_0x0073
            if (r4 == 0) goto L_0x0073
            X.7XJ r0 = r4.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            int r2 = r0.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            int r1 = r0.A05     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
        L_0x0073:
            boolean r0 = r12.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            if (r0 != 0) goto L_0x01b0
            if (r4 == 0) goto L_0x0005
            X.7XJ r5 = r4.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            X.2IA r7 = r12.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            monitor-enter(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x01a0 }
            if (r0 != 0) goto L_0x009a
            int r1 = r5.A06     // Catch:{ all -> 0x01a0 }
            int r0 = r5.A05     // Catch:{ all -> 0x01a0 }
            android.graphics.Bitmap r0 = X.C86664Kz.A0Y(r1, r0)     // Catch:{ all -> 0x01a0 }
            r5.A01 = r0     // Catch:{ all -> 0x01a0 }
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch:{ all -> 0x01a0 }
            r6.<init>(r0)     // Catch:{ all -> 0x01a0 }
            r5.A03 = r6     // Catch:{ all -> 0x01a0 }
            android.graphics.Bitmap r2 = r5.A08     // Catch:{ all -> 0x01a0 }
            r1 = 0
            r0 = 0
            r6.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x01a0 }
        L_0x009a:
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x01a2 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x01a2 }
            android.graphics.Canvas r0 = r5.A03     // Catch:{ all -> 0x01a2 }
            X.C626936e.A06(r0)     // Catch:{ all -> 0x01a2 }
            int r2 = r5.A00     // Catch:{ all -> 0x01a2 }
            int r1 = r2 + 1
            int r0 = r5.A07     // Catch:{ all -> 0x01a2 }
            int r1 = r1 % r0
            r5.A00 = r1     // Catch:{ all -> 0x01a2 }
            com.facebook.animated.webp.WebPImage r1 = r5.A0A     // Catch:{ all -> 0x01a2 }
            X.7OK r11 = r1.getFrameInfo(r2)     // Catch:{ all -> 0x01a2 }
            int r0 = r5.A00     // Catch:{ all -> 0x01a2 }
            com.facebook.animated.webp.WebPFrame r2 = r1.getFrame((int) r0)     // Catch:{ all -> 0x01a2 }
            int r0 = r5.A00     // Catch:{ all -> 0x01a2 }
            X.7OK r10 = r1.getFrameInfo(r0)     // Catch:{ all -> 0x01a2 }
            int r6 = r5.A00     // Catch:{ all -> 0x01a2 }
            if (r6 != 0) goto L_0x00c6
            android.graphics.Bitmap r1 = r5.A08     // Catch:{ all -> 0x01a2 }
            goto L_0x00f3
        L_0x00c6:
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "_frame_"
            java.lang.String r8 = X.AnonymousClass000.A0Y(r0, r1, r6)     // Catch:{ all -> 0x01a2 }
            X.30B r0 = r7.A00     // Catch:{ all -> 0x01a2 }
            X.1sU r6 = r0.A03()     // Catch:{ all -> 0x01a2 }
            java.lang.Object r1 = r6.A06(r8)     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x01a2 }
            if (r1 == 0) goto L_0x00f3
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x00f3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "AnimatedSticker/AnimatedStickerFrameCache/getFrame/bitmap is recycled, cacheKey: "
            X.C18260x0.A0q(r0, r8, r1)     // Catch:{ all -> 0x01a2 }
            r6.A08(r8)     // Catch:{ all -> 0x01a2 }
            r1 = 0
        L_0x00f3:
            r9 = 0
            r6 = 0
            if (r1 == 0) goto L_0x010d
            r5.A02 = r1     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x01a2 }
            r0.eraseColor(r6)     // Catch:{ all -> 0x01a2 }
            android.graphics.Canvas r6 = r5.A03     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r1 = r5.A02     // Catch:{ all -> 0x01a2 }
            r0 = 0
            r6.drawBitmap(r1, r0, r0, r9)     // Catch:{ all -> 0x01a2 }
            r2.dispose()     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r6 = r5.A02     // Catch:{ all -> 0x01a2 }
            goto L_0x0191
        L_0x010d:
            r3.eraseColor(r6)     // Catch:{ all -> 0x01a2 }
            int r0 = r2.getWidth()     // Catch:{ all -> 0x01a2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01a2 }
            float r8 = r5.A04     // Catch:{ all -> 0x01a2 }
            int r1 = X.AnonymousClass6C9.A04(r0, r8)     // Catch:{ all -> 0x01a2 }
            int r0 = r2.getHeight()     // Catch:{ all -> 0x01a2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01a2 }
            int r0 = X.AnonymousClass6C9.A04(r0, r8)     // Catch:{ all -> 0x01a2 }
            r2.renderFrame(r1, r0, r3)     // Catch:{ all -> 0x01a2 }
            X.6vU r1 = r11.A05     // Catch:{ all -> 0x01a2 }
            X.6vU r0 = X.C141386vU.A02     // Catch:{ all -> 0x01a2 }
            if (r1 != r0) goto L_0x0132
            android.graphics.Canvas r0 = r5.A03     // Catch:{ all -> 0x01a2 }
            r5.A00(r0, r11)     // Catch:{ all -> 0x01a2 }
        L_0x0132:
            X.6vD r1 = r10.A04     // Catch:{ all -> 0x01a2 }
            X.6vD r0 = X.C141216vD.A02     // Catch:{ all -> 0x01a2 }
            if (r1 != r0) goto L_0x013d
            android.graphics.Canvas r0 = r5.A03     // Catch:{ all -> 0x01a2 }
            r5.A00(r0, r10)     // Catch:{ all -> 0x01a2 }
        L_0x013d:
            int r1 = r2.getXOffset()     // Catch:{ all -> 0x01a2 }
            int r0 = r2.getYOffset()     // Catch:{ all -> 0x01a2 }
            r2.dispose()     // Catch:{ all -> 0x01a2 }
            android.graphics.Canvas r2 = r5.A03     // Catch:{ all -> 0x01a2 }
            float r1 = (float) r1     // Catch:{ all -> 0x01a2 }
            float r1 = r1 * r8
            float r0 = (float) r0     // Catch:{ all -> 0x01a2 }
            float r0 = r0 * r8
            r2.drawBitmap(r3, r1, r0, r9)     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r1 = r5.A01     // Catch:{ OutOfMemoryError -> 0x0185 }
            android.graphics.Bitmap$Config r0 = r1.getConfig()     // Catch:{ OutOfMemoryError -> 0x0185 }
            android.graphics.Bitmap r6 = r1.copy(r0, r6)     // Catch:{ OutOfMemoryError -> 0x0185 }
            r5.A02 = r6     // Catch:{ OutOfMemoryError -> 0x0185 }
            java.lang.String r0 = r5.A0B     // Catch:{ OutOfMemoryError -> 0x0185 }
            int r2 = r5.A00     // Catch:{ OutOfMemoryError -> 0x0185 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r0)     // Catch:{ OutOfMemoryError -> 0x0185 }
            java.lang.String r0 = "_frame_"
            java.lang.String r2 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0185 }
            boolean r0 = r6.isRecycled()     // Catch:{ OutOfMemoryError -> 0x0185 }
            if (r0 == 0) goto L_0x017b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OutOfMemoryError -> 0x0185 }
            java.lang.String r0 = "AnimatedSticker/AnimatedStickerFrameCache/cacheFrame/bitmap is recycled, cacheKey: "
            X.C18260x0.A0q(r0, r2, r1)     // Catch:{ OutOfMemoryError -> 0x0185 }
            goto L_0x018f
        L_0x017b:
            X.30B r0 = r7.A00     // Catch:{ OutOfMemoryError -> 0x0185 }
            X.1sU r0 = r0.A03()     // Catch:{ OutOfMemoryError -> 0x0185 }
            r0.A09(r2, r6)     // Catch:{ OutOfMemoryError -> 0x0185 }
            goto L_0x018f
        L_0x0185:
            r1 = move-exception
            android.graphics.Bitmap r0 = r5.A01     // Catch:{ all -> 0x01a2 }
            r5.A02 = r0     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "AnimatedWebpRenderer/renderNextFrame/OutofMemoryError: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01a2 }
        L_0x018f:
            android.graphics.Bitmap r6 = r5.A02     // Catch:{ all -> 0x01a2 }
        L_0x0191:
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            X.3Wi r2 = r12.A00     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            r1 = 20
            X.3cK r0 = new X.3cK     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            r0.<init>(r4, r1, r6)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            r2.A0S(r0)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            goto L_0x0005
        L_0x01a0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
            goto L_0x01a7
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
        L_0x01a7:
            throw r0     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a8 }
        L_0x01a8:
            r1 = move-exception
            java.lang.String r0 = "StickerFramePreloader/FrameLoaderThread failed to load frame "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0005
        L_0x01b0:
            X.1VX r0 = r12.A01
            boolean r0 = r0.A0X(r6)
            if (r0 == 0) goto L_0x01e8
            X.7Ec r4 = r12.A04
            monitor-enter(r4)
            java.util.HashMap r3 = r4.A00     // Catch:{ all -> 0x01e5 }
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x01e5 }
            r0.size()     // Catch:{ all -> 0x01e5 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01e5 }
        L_0x01c8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01e5 }
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01e5 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x01e5 }
            if (r1 == 0) goto L_0x01c8
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x01e5 }
            if (r0 != 0) goto L_0x01c8
            r1.recycle()     // Catch:{ all -> 0x01e5 }
            goto L_0x01c8
        L_0x01e0:
            r3.clear()     // Catch:{ all -> 0x01e5 }
            monitor-exit(r4)
            return
        L_0x01e5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01e8:
            if (r3 == 0) goto L_0x01ed
            r3.recycle()
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138286q4.run():void");
    }

    public C138286q4(C69263Wi r2, AnonymousClass1VX r3, AnonymousClass2IA r4, C147377Eb r5, AnonymousClass7IO r6) {
        super("StickerFramePreloader");
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r6;
        this.A02 = r4;
        this.A05 = r5;
    }
}
