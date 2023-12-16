package X;

import android.media.ImageReader;
import android.os.Handler;
import android.os.Trace;

/* renamed from: X.9XL  reason: invalid class name */
public class AnonymousClass9XL implements ImageReader.OnImageAvailableListener {
    public int A00;
    public int A01;
    public int A02;
    public ImageReader A03;
    public C194949Ve A04;
    public final Handler A05;
    public final C193409Oj A06 = new C193409Oj();
    public final AnonymousClass9MQ A07;
    public final AnonymousClass9O0 A08 = new AnonymousClass9O0(new AnonymousClass9MP(this));
    public final Runnable A09 = new C198629fE(this);
    public final Runnable A0A = new C198639fF(this);
    public final Runnable A0B = new C198649fG(this);
    public final C193409Oj[] A0C = new C193409Oj[1];
    public volatile boolean A0D;
    public volatile boolean A0E;

    public final void A00() {
        if (this.A03 == null && this.A02 > 0 && this.A01 > 0) {
            Trace.beginSection("AddImageReader");
            ImageReader newInstance = ImageReader.newInstance(this.A02, this.A01, 1, 1);
            this.A03 = newInstance;
            newInstance.setOnImageAvailableListener(this, (Handler) null);
            C194949Ve r0 = new C194949Ve(this.A03.getSurface(), true);
            this.A04 = r0;
            r0.A0E = true;
            AnonymousClass9MQ r02 = this.A07;
            C194949Ve r3 = this.A04;
            AnonymousClass9ZE r03 = r02.A00;
            AnonymousClass9ZF r2 = r03.A02;
            r2.A00(r2.A00, new C1680483x(r03.A08, r3));
            Trace.endSection();
        }
    }

    public final void A01() {
        Trace.beginSection("RemoveImageReader");
        C194949Ve r2 = this.A04;
        if (r2 != null) {
            this.A07.A00.A02.A02(r2);
            this.A04 = null;
        }
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            imageReader.close();
            this.A03 = null;
        }
        Trace.endSection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d5, code lost:
        if (r16 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageAvailable(android.media.ImageReader r18) {
        /*
            r17 = this;
            r7 = r17
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x00e7
            r3 = 0
            java.lang.String r0 = "OnImageAvailable"
            android.os.Trace.beginSection(r0)
            r2 = 0
            android.media.Image r16 = r18.acquireNextImage()     // Catch:{ all -> 0x00c3 }
            if (r16 != 0) goto L_0x001d
            X.9Oj r0 = r7.A06
            r0.A02 = r2
            r0.A00 = r3
            r0.A01 = r3
            goto L_0x00e4
        L_0x001d:
            X.9O0 r1 = r7.A08     // Catch:{ all -> 0x00c7 }
            java.util.concurrent.ConcurrentLinkedQueue r0 = r1.A01     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = r0.poll()     // Catch:{ all -> 0x00c7 }
            X.9Yv r6 = (X.C195629Yv) r6     // Catch:{ all -> 0x00c7 }
            if (r6 != 0) goto L_0x0034
            X.9Sf r0 = new X.9Sf     // Catch:{ all -> 0x00c7 }
            r0.<init>()     // Catch:{ all -> 0x00c7 }
            X.9Yv r6 = new X.9Yv     // Catch:{ all -> 0x00c7 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x00c7 }
            goto L_0x0044
        L_0x0034:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A02     // Catch:{ all -> 0x00c7 }
            r0 = 1
            boolean r0 = r1.compareAndSet(r3, r0)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Can only reset a previously released reference."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x0044:
            java.lang.Object r14 = r6.get()     // Catch:{ all -> 0x00c8 }
            X.9Sf r14 = (X.C194269Sf) r14     // Catch:{ all -> 0x00c8 }
            android.media.Image$Plane[] r1 = r16.getPlanes()     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x00ba
            int r0 = r1.length     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00ba
            r0 = r1[r3]     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00ba
            X.9Oj r8 = r7.A06     // Catch:{ all -> 0x00c8 }
            java.nio.ByteBuffer r4 = r0.getBuffer()     // Catch:{ all -> 0x00c8 }
            int r1 = r0.getPixelStride()     // Catch:{ all -> 0x00c8 }
            int r0 = r0.getRowStride()     // Catch:{ all -> 0x00c8 }
            r8.A02 = r4     // Catch:{ all -> 0x00c8 }
            r8.A00 = r1     // Catch:{ all -> 0x00c8 }
            r8.A01 = r0     // Catch:{ all -> 0x00c8 }
            X.9Oj[] r13 = r7.A0C     // Catch:{ all -> 0x00c8 }
            r13[r3] = r8     // Catch:{ all -> 0x00c8 }
            long r4 = r16.getTimestamp()     // Catch:{ all -> 0x00c8 }
            int r12 = r16.getWidth()     // Catch:{ all -> 0x00c8 }
            int r11 = r16.getHeight()     // Catch:{ all -> 0x00c8 }
            int r10 = r7.A00     // Catch:{ all -> 0x00c8 }
            r9 = 1
            X.9Oj[] r0 = r14.A05     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0098
            r1 = 0
        L_0x0083:
            X.9Oj[] r15 = r14.A05     // Catch:{ all -> 0x00c8 }
            int r0 = r15.length     // Catch:{ all -> 0x00c8 }
            if (r1 >= r0) goto L_0x0098
            r0 = r15[r1]     // Catch:{ all -> 0x00c8 }
            java.nio.ByteBuffer r0 = r0.A02     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0095
            r0 = r15[r1]     // Catch:{ all -> 0x00c8 }
            java.nio.ByteBuffer r0 = r0.A02     // Catch:{ all -> 0x00c8 }
            r0.clear()     // Catch:{ all -> 0x00c8 }
        L_0x0095:
            int r1 = r1 + 1
            goto L_0x0083
        L_0x0098:
            r14.A05 = r13     // Catch:{ all -> 0x00c8 }
            r14.A02 = r9     // Catch:{ all -> 0x00c8 }
            r14.A04 = r4     // Catch:{ all -> 0x00c8 }
            r14.A03 = r12     // Catch:{ all -> 0x00c8 }
            r14.A01 = r11     // Catch:{ all -> 0x00c8 }
            r14.A00 = r10     // Catch:{ all -> 0x00c8 }
            boolean r0 = r7.A0D     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00d8
            X.9MQ r0 = r7.A07     // Catch:{ all -> 0x00c8 }
            X.9ZE r0 = r0.A00     // Catch:{ all -> 0x00c8 }
            X.9MR r0 = r0.A07     // Catch:{ all -> 0x00c8 }
            X.9ZG r0 = r0.A00     // Catch:{ all -> 0x00c8 }
            X.9Zn r1 = r0.A0L     // Catch:{ all -> 0x00c8 }
            r1.A00 = r6     // Catch:{ all -> 0x00c8 }
            X.9TS r0 = r0.A0F     // Catch:{ all -> 0x00c8 }
            r0.A01(r1, r2)     // Catch:{ all -> 0x00c8 }
            goto L_0x00d8
        L_0x00ba:
            X.9Oj r0 = r7.A06
            r0.A02 = r2
            r0.A00 = r3
            r0.A01 = r3
            goto L_0x00de
        L_0x00c3:
            r16 = r2
            r6 = r2
            goto L_0x00c8
        L_0x00c7:
            r6 = r2
        L_0x00c8:
            X.9Oj r0 = r7.A06
            r0.A02 = r2
            r0.A00 = r3
            r0.A01 = r3
            if (r6 == 0) goto L_0x00d5
            r6.release()
        L_0x00d5:
            if (r16 == 0) goto L_0x00e4
            goto L_0x00e1
        L_0x00d8:
            r8.A02 = r2
            r8.A00 = r3
            r8.A01 = r3
        L_0x00de:
            r6.release()
        L_0x00e1:
            r16.close()
        L_0x00e4:
            android.os.Trace.endSection()
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XL.onImageAvailable(android.media.ImageReader):void");
    }

    public AnonymousClass9XL(Handler handler, AnonymousClass9MQ r4) {
        this.A07 = r4;
        this.A05 = handler;
    }
}
