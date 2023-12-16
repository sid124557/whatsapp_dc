package X;

/* renamed from: X.1uG  reason: invalid class name and case insensitive filesystem */
public class C34121uG extends C173778Rq {
    public final C147367Ea A00;
    public volatile boolean A01;
    public final /* synthetic */ AnonymousClass33O A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34121uG(C147367Ea r2, AnonymousClass33O r3) {
        super("StickerImageFileLoader");
        this.A02 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r3 = 0
            r5 = r3
        L_0x0007:
            r6 = r17
            boolean r0 = r6.A01     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x019e
            X.7Ea r4 = r6.A00     // Catch:{ InterruptedException -> 0x019e }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x019e }
            java.util.PriorityQueue r2 = r4.A00     // Catch:{ all -> 0x019b }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x001d
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.wait(r0)     // Catch:{ all -> 0x019b }
        L_0x001d:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x019b }
            if (r0 != 0) goto L_0x002d
            java.lang.Object r14 = r2.remove()     // Catch:{ all -> 0x019b }
            X.7Zu r14 = (X.C152657Zu) r14     // Catch:{ all -> 0x019b }
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x019e }
            if (r14 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002d:
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x019e }
            r14 = 0
        L_0x002f:
            r1 = r3
            goto L_0x0033
        L_0x0031:
            java.lang.Integer r1 = r14.A04     // Catch:{ InterruptedException -> 0x019e }
        L_0x0033:
            boolean r0 = r6.A01     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0039
            goto L_0x018b
        L_0x0039:
            if (r14 == 0) goto L_0x017f
            if (r1 == 0) goto L_0x004b
            X.33O r0 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            X.2qu r4 = r0.A06     // Catch:{ InterruptedException -> 0x019e }
            int r2 = r1.intValue()     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r0 = "sticker_queue_run"
            r4.A01(r2, r0)     // Catch:{ InterruptedException -> 0x019e }
        L_0x004b:
            X.39M r8 = r14.A03     // Catch:{ InterruptedException -> 0x019e }
            boolean r0 = r8.A0J     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = r8.A09     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r5 = "local_file_exists"
            if (r0 != 0) goto L_0x00c4
            X.33O r4 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            X.2mU r7 = r4.A0D     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r2 = r8.A05     // Catch:{ InterruptedException -> 0x019e }
            X.2jB r0 = new X.2jB     // Catch:{ InterruptedException -> 0x019e }
            r0.<init>(r2)     // Catch:{ InterruptedException -> 0x019e }
            java.io.File r9 = r7.A00(r0)     // Catch:{ InterruptedException -> 0x019e }
            boolean r0 = r9.exists()     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x009b
            long r12 = r9.length()     // Catch:{ InterruptedException -> 0x019e }
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            java.lang.Integer r0 = r14.A04     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0083
            X.2qu r2 = r4.A06     // Catch:{ InterruptedException -> 0x019e }
            int r0 = r0.intValue()     // Catch:{ InterruptedException -> 0x019e }
            r2.A01(r0, r5)     // Catch:{ InterruptedException -> 0x019e }
        L_0x0083:
            X.AnonymousClass39M.A01(r8, r9)     // Catch:{ InterruptedException -> 0x019e }
        L_0x0086:
            boolean r0 = r14.A06     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x011d
            X.33O r11 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            X.3Wi r12 = r11.A02     // Catch:{ InterruptedException -> 0x019e }
            com.whatsapp.stickers.WebpUtils r15 = r11.A0B     // Catch:{ InterruptedException -> 0x019e }
            X.33i r13 = r11.A03     // Catch:{ InterruptedException -> 0x019e }
            java.util.concurrent.ConcurrentHashMap r0 = r11.A0H     // Catch:{ InterruptedException -> 0x019e }
            r16 = r0
            r11.A06(r12, r13, r14, r15, r16)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x0188
        L_0x009b:
            r9.getAbsolutePath()     // Catch:{ InterruptedException -> 0x019e }
            X.2X1 r2 = r4.A0E     // Catch:{ InterruptedException -> 0x019e }
            r0 = 1
            java.io.File r9 = r2.A00(r8, r9, r0)     // Catch:{ InterruptedException -> 0x019e }
            java.lang.Integer r0 = r14.A04     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x00c1
            if (r9 == 0) goto L_0x0086
            X.2qu r7 = r4.A06     // Catch:{ InterruptedException -> 0x019e }
            int r2 = r0.intValue()     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r0 = "sticker_downloaded"
            r7.A01(r2, r0)     // Catch:{ InterruptedException -> 0x019e }
            X.6ok r0 = X.C137476ok.A00     // Catch:{ InterruptedException -> 0x019e }
            long r4 = r9.length()     // Catch:{ InterruptedException -> 0x019e }
            r7.A04(r0, r2, r4)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x0083
        L_0x00c1:
            if (r9 == 0) goto L_0x0086
            goto L_0x0083
        L_0x00c4:
            java.lang.Integer r4 = r14.A04     // Catch:{ InterruptedException -> 0x019e }
            if (r4 == 0) goto L_0x0086
            X.33O r0 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            X.2qu r2 = r0.A06     // Catch:{ InterruptedException -> 0x019e }
            int r0 = r4.intValue()     // Catch:{ InterruptedException -> 0x019e }
            r2.A01(r0, r5)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x0086
        L_0x00d4:
            boolean r0 = r14.A02()     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0086
            java.lang.String r2 = r8.A0D     // Catch:{ InterruptedException -> 0x019e }
            if (r2 == 0) goto L_0x0086
            java.lang.String r0 = "loading-hash"
            boolean r0 = r2.equals(r0)     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = r8.A09     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = r8.A0B     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = r8.A08     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0086
            X.33O r0 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            X.2aC r0 = r0.A0F     // Catch:{ InterruptedException -> 0x019e }
            X.294 r2 = r0.A00(r8)     // Catch:{ InterruptedException -> 0x019e }
            boolean r0 = r2 instanceof X.C32841ri     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0112
            X.1ri r2 = (X.C32841ri) r2     // Catch:{ InterruptedException -> 0x019e }
            X.39M r2 = r2.A00     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r0 = r2.A09     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0108
            r8.A09 = r0     // Catch:{ InterruptedException -> 0x019e }
        L_0x0108:
            X.330 r0 = r8.A04     // Catch:{ InterruptedException -> 0x019e }
            if (r0 != 0) goto L_0x0086
            X.330 r0 = r2.A04     // Catch:{ InterruptedException -> 0x019e }
            r8.A04 = r0     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x0086
        L_0x0112:
            boolean r0 = r2 instanceof X.C32831rh     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = "StickerImageFileLoader/prepareNormalSticker/sticker cannot be downloaded"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x0086
        L_0x011d:
            boolean r0 = r14.A02()     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0188
            X.33O r4 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            java.util.concurrent.ConcurrentHashMap r7 = r4.A0H     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r6 = r14.A05     // Catch:{ InterruptedException -> 0x019e }
            java.lang.Object r0 = r7.get(r6)     // Catch:{ InterruptedException -> 0x019e }
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x014c
            java.lang.Object r5 = r0.get()     // Catch:{ InterruptedException -> 0x019e }
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5     // Catch:{ InterruptedException -> 0x019e }
            if (r5 == 0) goto L_0x014d
            if (r1 == 0) goto L_0x016f
            X.2qu r2 = r4.A06     // Catch:{ InterruptedException -> 0x019e }
            int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x019e }
            java.lang.String r0 = "in_memory_cache_hit"
            r2.A01(r1, r0)     // Catch:{ InterruptedException -> 0x019e }
            X.21o r0 = X.C372621o.SUCCESS     // Catch:{ InterruptedException -> 0x019e }
            r2.A02(r0, r1)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x016f
        L_0x014c:
            r5 = r3
        L_0x014d:
            com.whatsapp.stickers.WebpUtils r2 = r4.A0B     // Catch:{ InterruptedException -> 0x019e }
            X.3Dh r1 = r4.A01     // Catch:{ InterruptedException -> 0x019e }
            X.33i r0 = r4.A03     // Catch:{ InterruptedException -> 0x019e }
            byte[] r2 = X.AnonymousClass33O.A01(r1, r0, r8, r2)     // Catch:{ InterruptedException -> 0x019e }
            if (r2 == 0) goto L_0x016f
            boolean r0 = r8.A0L     // Catch:{ InterruptedException -> 0x019e }
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = r8.A0D     // Catch:{ InterruptedException -> 0x019e }
            X.2xm r0 = r4.A07     // Catch:{ InterruptedException -> 0x019e }
            android.graphics.drawable.Drawable r5 = r0.A01(r1, r2)     // Catch:{ InterruptedException -> 0x019e }
            if (r5 == 0) goto L_0x016f
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch:{ InterruptedException -> 0x019e }
            r0.<init>(r5)     // Catch:{ InterruptedException -> 0x019e }
            r7.put(r6, r0)     // Catch:{ InterruptedException -> 0x019e }
        L_0x016f:
            X.3Wi r0 = r4.A02     // Catch:{ InterruptedException -> 0x019e }
            r14.A01(r5, r0)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x0188
        L_0x0175:
            java.lang.String r0 = r8.A0D     // Catch:{ InterruptedException -> 0x019e }
            X.C626936e.A06(r0)     // Catch:{ InterruptedException -> 0x019e }
            android.graphics.drawable.Drawable r5 = r4.A02(r14, r0, r2)     // Catch:{ InterruptedException -> 0x019e }
            goto L_0x016f
        L_0x017f:
            if (r5 != 0) goto L_0x0188
            X.33O r0 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            r0.A00 = r3     // Catch:{ InterruptedException -> 0x019e }
            r6.interrupt()     // Catch:{ InterruptedException -> 0x019e }
        L_0x0188:
            r5 = r14
            goto L_0x0007
        L_0x018b:
            if (r1 == 0) goto L_0x019a
            X.33O r0 = r6.A02     // Catch:{ InterruptedException -> 0x019e }
            X.2qu r2 = r0.A06     // Catch:{ InterruptedException -> 0x019e }
            int r1 = r1.intValue()     // Catch:{ InterruptedException -> 0x019e }
            X.21o r0 = X.C372621o.CANCEL     // Catch:{ InterruptedException -> 0x019e }
            r2.A02(r0, r1)     // Catch:{ InterruptedException -> 0x019e }
        L_0x019a:
            return
        L_0x019b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x019e }
            throw r0     // Catch:{ InterruptedException -> 0x019e }
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34121uG.run():void");
    }
}
