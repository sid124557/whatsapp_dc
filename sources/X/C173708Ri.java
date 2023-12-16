package X;

/* renamed from: X.8Ri  reason: invalid class name and case insensitive filesystem */
public class C173708Ri extends Thread {
    public final /* synthetic */ C152737a2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173708Ri(C152737a2 r2) {
        super("ExoPlayer:SimpleDecoder");
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if ((r2 & 4) != 4) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r6.A00 = 4 | r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if ((r2 & Integer.MIN_VALUE) != Integer.MIN_VALUE) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        r6.A00 = Integer.MIN_VALUE | r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        if ((r5.A00 & 134217728) != 134217728) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        r6.A00 = 134217728 | r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2 = r4.A00(r5, r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        if (r2 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        if (r4.A05 != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006b, code lost:
        if ((r6.A00 & Integer.MIN_VALUE) != Integer.MIN_VALUE) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        r4.A02++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        r5.A00();
        r2 = r4.A0B;
        r1 = r4.A00;
        r4.A00 = r1 + 1;
        r2[r1] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0083, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        r6.A00 = r4.A02;
        r4.A02 = 0;
        r4.A0A.addLast(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0096, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2 = new X.C125716Jc("Unexpected decode error", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            X.7a2 r4 = r9.A00
        L_0x0002:
            java.lang.Object r3 = r4.A07     // Catch:{ InterruptedException -> 0x00a9 }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00a9 }
        L_0x0005:
            boolean r0 = r4.A06     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x0015
            java.util.ArrayDeque r0 = r4.A09     // Catch:{ all -> 0x00a6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x001c
            int r0 = r4.A01     // Catch:{ all -> 0x00a6 }
            if (r0 <= 0) goto L_0x001c
        L_0x0015:
            boolean r0 = r4.A06     // Catch:{ all -> 0x00a6 }
            r7 = 0
            if (r0 == 0) goto L_0x0020
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x0092
        L_0x001c:
            r3.wait()     // Catch:{ all -> 0x00a6 }
            goto L_0x0005
        L_0x0020:
            java.util.ArrayDeque r0 = r4.A09     // Catch:{ all -> 0x00a6 }
            java.lang.Object r5 = r0.removeFirst()     // Catch:{ all -> 0x00a6 }
            X.6Jl r5 = (X.AnonymousClass6Jl) r5     // Catch:{ all -> 0x00a6 }
            com.facebook.android.exoplayer2.decoder.SimpleOutputBuffer[] r2 = r4.A0C     // Catch:{ all -> 0x00a6 }
            int r1 = r4.A01     // Catch:{ all -> 0x00a6 }
            r0 = 1
            int r1 = r1 - r0
            r4.A01 = r1     // Catch:{ all -> 0x00a6 }
            r6 = r2[r1]     // Catch:{ all -> 0x00a6 }
            boolean r8 = r4.A05     // Catch:{ all -> 0x00a6 }
            r4.A05 = r7     // Catch:{ all -> 0x00a6 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            r1 = 4
            int r2 = r5.A00     // Catch:{ InterruptedException -> 0x00a9 }
            r0 = r2 & 4
            if (r0 != r1) goto L_0x0045
            int r0 = r6.A00     // Catch:{ InterruptedException -> 0x00a9 }
            r1 = r1 | r0
            r6.A00 = r1     // Catch:{ InterruptedException -> 0x00a9 }
        L_0x0043:
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00a9 }
            goto L_0x0062
        L_0x0045:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r1
            if (r2 != r1) goto L_0x004f
            int r0 = r6.A00     // Catch:{ InterruptedException -> 0x00a9 }
            r1 = r1 | r0
            r6.A00 = r1     // Catch:{ InterruptedException -> 0x00a9 }
        L_0x004f:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            int r0 = r5.A00     // Catch:{ InterruptedException -> 0x00a9 }
            r0 = r0 & r1
            if (r0 != r1) goto L_0x005b
            int r0 = r6.A00     // Catch:{ InterruptedException -> 0x00a9 }
            r1 = r1 | r0
            r6.A00 = r1     // Catch:{ InterruptedException -> 0x00a9 }
        L_0x005b:
            X.6zG r2 = r4.A00(r5, r6, r8)     // Catch:{ OutOfMemoryError | RuntimeException -> 0x0096 }
            if (r2 == 0) goto L_0x0043
            goto L_0x009e
        L_0x0062:
            boolean r0 = r4.A05     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0073
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r6.A00     // Catch:{ all -> 0x0093 }
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0086
            int r0 = r4.A02     // Catch:{ all -> 0x0093 }
            int r0 = r0 + 1
            r4.A02 = r0     // Catch:{ all -> 0x0093 }
        L_0x0073:
            r6.release()     // Catch:{ all -> 0x0093 }
        L_0x0076:
            r5.A00()     // Catch:{ all -> 0x0093 }
            X.6Jl[] r2 = r4.A0B     // Catch:{ all -> 0x0093 }
            int r1 = r4.A00     // Catch:{ all -> 0x0093 }
            int r0 = r1 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0093 }
            r2[r1] = r5     // Catch:{ all -> 0x0093 }
            monitor-exit(r3)     // Catch:{ all -> 0x0093 }
            goto L_0x0002
        L_0x0086:
            int r0 = r4.A02     // Catch:{ all -> 0x0093 }
            r6.A00 = r0     // Catch:{ all -> 0x0093 }
            r4.A02 = r7     // Catch:{ all -> 0x0093 }
            java.util.ArrayDeque r0 = r4.A0A     // Catch:{ all -> 0x0093 }
            r0.addLast(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x0076
        L_0x0092:
            return
        L_0x0093:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0093 }
            goto L_0x00a8
        L_0x0096:
            r1 = move-exception
            java.lang.String r0 = "Unexpected decode error"
            X.6Jc r2 = new X.6Jc     // Catch:{ InterruptedException -> 0x00a9 }
            r2.<init>(r0, r1)     // Catch:{ InterruptedException -> 0x00a9 }
        L_0x009e:
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x00a9 }
            r4.A03 = r2     // Catch:{ all -> 0x00a3 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            return
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a8
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
        L_0x00a8:
            throw r0     // Catch:{ InterruptedException -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173708Ri.run():void");
    }
}
