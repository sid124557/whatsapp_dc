package X;

import java.util.List;

/* renamed from: X.83u  reason: invalid class name and case insensitive filesystem */
public class C1680183u implements C185288tO {
    public C185558ts A00;
    public C152667Zv A01;
    public C183758qb A02;
    public final C157207hv A03;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r7.A00() != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r3.A00() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        if (r3 == null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e9, code lost:
        if (r9 != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        if (r8 != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010e, code lost:
        if (r3 != false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C185558ts r23, X.AnonymousClass7Ow r24, X.C186198uu r25) {
        /*
            r22 = this;
            r11 = 1
            java.lang.String r0 = "GlCopyRenderer.renderFrame()"
            android.os.Trace.beginSection(r0)
            r6 = r25
            java.lang.Object r12 = r6.B9B()
            monitor-enter(r12)
            r4 = r22
            X.8ts r0 = r4.A00     // Catch:{ all -> 0x011c }
            r2 = r23
            if (r2 == r0) goto L_0x001c
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x011c }
            X.6wp r0 = X.C142216wp.A03     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
        L_0x001c:
            X.8qb r5 = r4.A02     // Catch:{ all -> 0x011c }
            X.8sb r1 = r2.BC7()     // Catch:{ all -> 0x011c }
            boolean r0 = r1.BsB()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x002c
            X.8qb r5 = r1.B5z()     // Catch:{ all -> 0x011c }
        L_0x002c:
            if (r5 != 0) goto L_0x003a
            android.os.Trace.endSection()     // Catch:{ all -> 0x011c }
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x011c }
            X.6wp r0 = X.C142216wp.A05     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
            goto L_0x011a
        L_0x003a:
            r10 = r24
            X.7Wm r1 = r10.A04     // Catch:{ all -> 0x011c }
            boolean r0 = r6.BHV(r10)     // Catch:{ all -> 0x011c }
            r3 = r0 ^ 1
            if (r1 == 0) goto L_0x0107
            if (r3 != 0) goto L_0x0110
            java.lang.String r0 = "GlCopyRenderer.makeCurrent()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00ff }
            java.lang.Exception r0 = r6.BKR()     // Catch:{ all -> 0x00ff }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00fb
            X.7TK r3 = r6.Brr(r10)     // Catch:{ all -> 0x00ff }
            X.7TK r7 = r10.A05     // Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x0065
            boolean r0 = r7.A00()     // Catch:{ all -> 0x00ff }
            r9 = 1
            if (r0 == 0) goto L_0x0066
        L_0x0065:
            r9 = 0
        L_0x0066:
            if (r3 == 0) goto L_0x006f
            boolean r0 = r3.A00()     // Catch:{ all -> 0x00ff }
            r8 = 1
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r8 = 0
        L_0x0070:
            if (r7 == 0) goto L_0x00d9
            if (r3 == 0) goto L_0x00e2
            if (r9 != 0) goto L_0x00eb
            if (r8 != 0) goto L_0x00f4
            java.lang.String r0 = "GlCopyRenderer.draw()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00ff }
            int r10 = r10.A00     // Catch:{ all -> 0x00ff }
            X.7Zv r13 = r4.A01     // Catch:{ all -> 0x00ff }
            if (r13 != 0) goto L_0x00b6
            int r19 = r6.BAH()     // Catch:{ all -> 0x00ff }
            int r9 = r3.A01     // Catch:{ all -> 0x00ff }
            int r8 = r3.A00     // Catch:{ all -> 0x00ff }
            float[] r14 = r7.A03     // Catch:{ all -> 0x00ff }
            float[] r15 = r3.A03     // Catch:{ all -> 0x00ff }
            float[] r7 = r7.A02     // Catch:{ all -> 0x00ff }
            float[] r0 = r3.A02     // Catch:{ all -> 0x00ff }
            X.7Zv r13 = new X.7Zv     // Catch:{ all -> 0x00ff }
            r20 = r9
            r21 = r8
            r16 = r7
            r17 = r0
            r18 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00ff }
            r4.A01 = r13     // Catch:{ all -> 0x00ff }
        L_0x00a4:
            r5.BjU(r1, r2, r13)     // Catch:{ all -> 0x00ff }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "GlCopyRenderer.swapBuffers()"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00ff }
            r6.BqU()     // Catch:{ all -> 0x00ff }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00ff }
            goto L_0x00fb
        L_0x00b6:
            r13.A00 = r10     // Catch:{ all -> 0x00ff }
            int r0 = r6.BAH()     // Catch:{ all -> 0x00ff }
            r13.A01 = r0     // Catch:{ all -> 0x00ff }
            r13.A04 = r11     // Catch:{ all -> 0x00ff }
            int r0 = r3.A01     // Catch:{ all -> 0x00ff }
            r13.A03 = r0     // Catch:{ all -> 0x00ff }
            int r0 = r3.A00     // Catch:{ all -> 0x00ff }
            r13.A02 = r0     // Catch:{ all -> 0x00ff }
            float[] r0 = r7.A03     // Catch:{ all -> 0x00ff }
            r13.A08 = r0     // Catch:{ all -> 0x00ff }
            float[] r0 = r3.A03     // Catch:{ all -> 0x00ff }
            r13.A06 = r0     // Catch:{ all -> 0x00ff }
            float[] r0 = r7.A02     // Catch:{ all -> 0x00ff }
            r13.A07 = r0     // Catch:{ all -> 0x00ff }
            float[] r0 = r3.A02     // Catch:{ all -> 0x00ff }
            r13.A05 = r0     // Catch:{ all -> 0x00ff }
            goto L_0x00a4
        L_0x00d9:
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x00ff }
            X.6wp r0 = X.C142216wp.A07     // Catch:{ all -> 0x00ff }
            r1.A00(r0)     // Catch:{ all -> 0x00ff }
            if (r3 != 0) goto L_0x00e9
        L_0x00e2:
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x00ff }
            X.6wp r0 = X.C142216wp.A06     // Catch:{ all -> 0x00ff }
            r1.A00(r0)     // Catch:{ all -> 0x00ff }
        L_0x00e9:
            if (r9 == 0) goto L_0x00f2
        L_0x00eb:
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x00ff }
            X.6wp r0 = X.C142216wp.A0E     // Catch:{ all -> 0x00ff }
            r1.A00(r0)     // Catch:{ all -> 0x00ff }
        L_0x00f2:
            if (r8 == 0) goto L_0x00fb
        L_0x00f4:
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x00ff }
            X.6wp r0 = X.C142216wp.A0D     // Catch:{ all -> 0x00ff }
            r1.A00(r0)     // Catch:{ all -> 0x00ff }
        L_0x00fb:
            r2.BKS()     // Catch:{ all -> 0x011c }
            goto L_0x0117
        L_0x00ff:
            r0 = move-exception
            r2.BKS()     // Catch:{ all -> 0x011c }
            android.os.Trace.endSection()     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x0107:
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x011c }
            X.6wp r0 = X.C142216wp.A09     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x0117
        L_0x0110:
            X.7hv r1 = r4.A03     // Catch:{ all -> 0x011c }
            X.6wp r0 = X.C142216wp.A0A     // Catch:{ all -> 0x011c }
            r1.A00(r0)     // Catch:{ all -> 0x011c }
        L_0x0117:
            android.os.Trace.endSection()     // Catch:{ all -> 0x011c }
        L_0x011a:
            monitor-exit(r12)     // Catch:{ all -> 0x011c }
            return
        L_0x011c:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x011c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1680183u.A00(X.8ts, X.7Ow, X.8uu):void");
    }

    public void AxN(C185558ts r3) {
        C185558ts r0 = this.A00;
        if (!(r0 == null || r0 == r3)) {
            this.A03.A00(C142216wp.A02);
        }
        this.A00 = r3;
        C184818sb BC7 = r3.BC7();
        if (!BC7.BsB() && this.A02 == null) {
            this.A02 = BC7.B0U();
        }
    }

    public void B1c() {
        C183758qb r1 = this.A02;
        if (r1 != null) {
            r1.B1c();
            this.A02 = null;
        }
        this.A00 = null;
    }

    public void BFr(C185568tt r1) {
    }

    public void release() {
    }

    public C1680183u(C157207hv r1) {
        this.A03 = r1;
    }

    public void A01(C185558ts r4, AnonymousClass7Ow r5, List list) {
        int size = list.size();
        if (size == 0) {
            this.A03.A00(C142216wp.A0C);
            return;
        }
        for (int i = 0; i < size; i++) {
            A00(r4, r5, (C186198uu) list.get(i));
        }
    }
}
