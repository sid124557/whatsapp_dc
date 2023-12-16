package X;

import java.util.concurrent.Callable;

/* renamed from: X.91G  reason: invalid class name */
public class AnonymousClass91G implements Callable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass91G(Object obj, Object obj2, int i, int i2, long j) {
        this.A04 = i2;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj;
        this.A01 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0262, code lost:
        if (r4.A04 == null) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e6, code lost:
        if (r4.A04 == null) goto L_0x01e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r21 = this;
            r5 = r21
            int r0 = r5.A04
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "EncodeMuxerWrapper.setup"
            android.os.Trace.beginSection(r0)
            int r0 = r5.A00
            int r0 = r0 + -1
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r10 = r5.A02
            X.85p r10 = (X.C1684885p) r10
            android.os.Trace.endSection()
            r3 = 0
        L_0x001a:
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x02e9
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x02e9
            java.lang.String r0 = "EncodeMuxerWrapper.loop"
            android.os.Trace.beginSection(r0)
            java.lang.String r0 = "EncodeMuxerWrapper.dequeue"
            android.os.Trace.beginSection(r0)
            X.8vG r2 = r10.A01
            r0 = 250000(0x3d090, double:1.235164E-318)
            X.85a r9 = r2.B1U(r0)
            android.os.Trace.endSection()
            if (r9 == 0) goto L_0x0069
            java.lang.String r0 = "EncodeMuxerWrapper.mux"
            android.os.Trace.beginSection(r0)
            java.lang.Object r8 = r5.A03
            X.7nH r8 = (X.C160227nH) r8
            long r11 = r5.A01
            int r0 = r9.A02
            if (r0 < 0) goto L_0x00b8
            android.media.MediaCodec$BufferInfo r13 = r9.A00
            int r0 = r13.flags
            r0 = r0 & 4
            r1 = 1
            if (r0 == 0) goto L_0x006f
            r3 = 1
        L_0x0059:
            android.os.Trace.endSection()
            java.lang.String r0 = "EncodeMuxerWrapper.release"
            android.os.Trace.beginSection(r0)
            X.8vG r0 = r10.A01
            r0.Bis(r9)
            android.os.Trace.endSection()
        L_0x0069:
            android.os.Trace.endSection()
            if (r3 != 0) goto L_0x02e9
            goto L_0x001a
        L_0x006f:
            X.7kM r4 = r10.A07
            r4.A0M = r1
            long r6 = r13.presentationTimeUs
            long r2 = r4.A05
            r15 = 1
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x0087
            r4.A0S = r1
            long r0 = r6 - r2
            r4.A0B = r0
        L_0x0087:
            X.7QR r0 = r10.A09
            X.7jf r0 = r0.A04
            if (r0 == 0) goto L_0x00a4
            X.7YY r14 = r0.A0E
            if (r14 == 0) goto L_0x00a4
            int r1 = r14.A01
            r0 = 1
            if (r0 != r1) goto L_0x00a4
            X.6xU r1 = X.C142616xU.CODEC_VIDEO_H264
            X.6xU r0 = r14.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a4
            long r2 = r2 + r15
            r13.presentationTimeUs = r2
            r6 = r2
        L_0x00a4:
            double r2 = (double) r6
            double r0 = (double) r11
            double r2 = r2 / r0
            r8.A00(r2)
            java.lang.String r0 = "EncodeMuxerWrapper.writeVideoSampleData"
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x011d }
            X.85d r0 = r10.A08     // Catch:{ Exception -> 0x011d }
            r0.Bsl(r9)     // Catch:{ Exception -> 0x011d }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x011d }
            goto L_0x0122
        L_0x00b8:
            boolean r0 = r9.A01
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "EncodeMuxerWrapper.initTracksAndStartMuxer"
            android.os.Trace.beginSection(r0)
            X.7QR r0 = r10.A09
            boolean r0 = r0.A0K
            if (r0 == 0) goto L_0x00f6
            android.media.MediaFormat r1 = r10.A05
            if (r1 == 0) goto L_0x00d4
            X.85d r0 = r10.A08
            r0.A05 = r1
            X.7kM r1 = r10.A07
            r0 = 1
            r1.A0J = r0
        L_0x00d4:
            X.8vG r0 = r10.A01
            if (r0 == 0) goto L_0x00ed
            android.media.MediaFormat r0 = r0.BAI()
            X.85d r1 = r10.A08
            r1.A06 = r0
            X.8vG r0 = r10.A01
            int r0 = r0.BAL()
            r1.A01 = r0
            X.7kM r1 = r10.A07
            r0 = 1
            r1.A0K = r0
        L_0x00ed:
            X.85d r0 = r10.A08
            r0.start()
            android.os.Trace.endSection()
            goto L_0x012d
        L_0x00f6:
            X.8vG r0 = r10.A01
            if (r0 == 0) goto L_0x010f
            android.media.MediaFormat r0 = r0.BAI()
            X.85d r1 = r10.A08
            r1.A06 = r0
            X.8vG r0 = r10.A01
            int r0 = r0.BAL()
            r1.A01 = r0
            X.7kM r1 = r10.A07
            r0 = 1
            r1.A0K = r0
        L_0x010f:
            android.media.MediaFormat r1 = r10.A05
            if (r1 == 0) goto L_0x00ed
            X.85d r0 = r10.A08
            r0.A05 = r1
            X.7kM r1 = r10.A07
            r0 = 1
            r1.A0J = r0
            goto L_0x00ed
        L_0x011d:
            long r0 = r4.A09
            long r0 = r0 + r15
            r4.A09 = r0
        L_0x0122:
            android.media.MediaCodec$BufferInfo r0 = r9.A00
            long r0 = r0.presentationTimeUs
            r4.A05 = r0
            long r0 = r4.A0A
            long r0 = r0 + r15
            r4.A0A = r0
        L_0x012d:
            r3 = 0
            goto L_0x0059
        L_0x0130:
            java.lang.String r0 = "AudioEncodeMuxerWrapper.setup"
            android.os.Trace.beginSection(r0)
            int r0 = r5.A00
            int r0 = r0 + -1
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r4 = r5.A02
            X.85o r4 = (X.C1684785o) r4
            android.os.Trace.endSection()
            r3 = 0
        L_0x0144:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x02e4
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x02e4
            java.lang.String r0 = "AudioEncodeMuxerWrapper.loop"
            android.os.Trace.beginSection(r0)
            X.7RI r0 = r4.A00
            r1 = 5000(0x1388, double:2.4703E-320)
            X.7aZ r0 = r0.A00
            X.85a r8 = r0.A01(r1)
            if (r8 == 0) goto L_0x0190
            java.lang.Object r11 = r5.A03
            X.7nH r11 = (X.C160227nH) r11
            long r12 = r5.A01
            android.media.MediaCodec$BufferInfo r2 = r8.A00
            int r10 = r8.A02
            if (r10 < 0) goto L_0x0235
            int r1 = r2.flags
            r0 = r1 & 2
            if (r0 != 0) goto L_0x02e1
            r0 = r1 & 4
            r1 = 1
            if (r0 == 0) goto L_0x0196
            r3 = 1
        L_0x017b:
            X.7RI r0 = r4.A00
            X.7aZ r2 = r0.A00
            boolean r1 = r2.A07
            java.lang.String r0 = "MediaCodecWrapper.releaseOutputBuffer"
            android.os.Trace.beginSection(r0)
            if (r10 < 0) goto L_0x018d
            android.media.MediaCodec r0 = r2.A04
            r0.releaseOutputBuffer(r10, r1)
        L_0x018d:
            android.os.Trace.endSection()
        L_0x0190:
            android.os.Trace.endSection()
            if (r3 != 0) goto L_0x02e4
            goto L_0x0144
        L_0x0196:
            X.7kM r9 = r4.A06
            r9.A0L = r1
            long r6 = r2.presentationTimeUs
            long r2 = r9.A03
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01ac
            boolean r0 = r9.A0S
            if (r0 != 0) goto L_0x01ac
            r9.A0S = r1
            long r0 = r6 - r2
            r9.A0B = r0
        L_0x01ac:
            if (r11 == 0) goto L_0x01b4
            double r2 = (double) r6
            double r0 = (double) r12
            double r2 = r2 / r0
            r11.A00(r2)
        L_0x01b4:
            r13 = 1
            boolean r0 = r4.A0C     // Catch:{ Exception -> 0x0223 }
            if (r0 == 0) goto L_0x021d
            android.media.MediaCodec$BufferInfo r2 = r8.A00     // Catch:{ Exception -> 0x0223 }
            int r6 = r2.size     // Catch:{ Exception -> 0x0223 }
            byte[] r7 = r4.A0D     // Catch:{ Exception -> 0x0223 }
            int r0 = r7.length     // Catch:{ Exception -> 0x0223 }
            int r6 = r6 + r0
            r12 = r6 & 7
            int r0 = r6 >> 3
            r11 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r6 >> 11
            r3 = 3
            r1 = r0 & 3
            byte r0 = r7[r3]     // Catch:{ Exception -> 0x0223 }
            r0 = r0 & 252(0xfc, float:3.53E-43)
            X.AnonymousClass6C8.A0u(r1, r7, r0, r3)     // Catch:{ Exception -> 0x0223 }
            r1 = 4
            byte r0 = (byte) r11     // Catch:{ Exception -> 0x0223 }
            r7[r1] = r0     // Catch:{ Exception -> 0x0223 }
            r1 = 5
            int r12 = r12 << r1
            r0 = r12 | 31
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x0223 }
            r7[r1] = r0     // Catch:{ Exception -> 0x0223 }
            java.nio.ByteBuffer r3 = r4.A09     // Catch:{ Exception -> 0x0223 }
            if (r3 == 0) goto L_0x01e8
            android.media.MediaCodec$BufferInfo r0 = r4.A04     // Catch:{ Exception -> 0x0223 }
            r1 = 1
            if (r0 != 0) goto L_0x01e9
        L_0x01e8:
            r1 = 0
        L_0x01e9:
            java.lang.String r0 = "Temporary buffers are null"
            X.C159297la.A02(r1, r0)     // Catch:{ Exception -> 0x0223 }
            r3.clear()     // Catch:{ Exception -> 0x0223 }
            r3.limit(r6)     // Catch:{ Exception -> 0x0223 }
            r3.put(r7)     // Catch:{ Exception -> 0x0223 }
            java.nio.ByteBuffer r0 = r8.B50()     // Catch:{ Exception -> 0x0223 }
            X.AnonymousClass6C7.A0z(r2, r0)     // Catch:{ Exception -> 0x0223 }
            r3.put(r0)     // Catch:{ Exception -> 0x0223 }
            android.media.MediaCodec$BufferInfo r15 = r4.A04     // Catch:{ Exception -> 0x0223 }
            r16 = 0
            long r0 = r2.presentationTimeUs     // Catch:{ Exception -> 0x0223 }
            int r2 = r2.flags     // Catch:{ Exception -> 0x0223 }
            r17 = r6
            r18 = r0
            r20 = r2
            r15.set(r16, r17, r18, r20)     // Catch:{ Exception -> 0x0223 }
            X.8uv r1 = r4.A07     // Catch:{ Exception -> 0x0223 }
            X.85a r0 = new X.85a     // Catch:{ Exception -> 0x0223 }
            r0.<init>(r10, r3, r15)     // Catch:{ Exception -> 0x0223 }
            r1.Bse(r0)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0228
        L_0x021d:
            X.8uv r0 = r4.A07     // Catch:{ Exception -> 0x0223 }
            r0.Bse(r8)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0228
        L_0x0223:
            long r0 = r9.A06
            long r0 = r0 + r13
            r9.A06 = r0
        L_0x0228:
            android.media.MediaCodec$BufferInfo r0 = r8.A00
            long r0 = r0.presentationTimeUs
            r9.A03 = r0
            long r0 = r9.A07
            long r0 = r0 + r13
            r9.A07 = r0
            goto L_0x02e1
        L_0x0235:
            r12 = 0
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x02e1
            X.7RI r0 = r4.A00
            X.7aZ r0 = r0.A00
            android.media.MediaFormat r1 = r0.A00
            X.8uv r6 = r4.A07
            r6.Bll(r1)
            r6.start()
            java.lang.String r0 = "csd-0"
            java.nio.ByteBuffer r3 = r1.getByteBuffer(r0)
            boolean r1 = X.AnonymousClass000.A1W(r3)
            java.lang.String r0 = "CSD should not be null. Verify encoder was configured properly."
            X.C159297la.A02(r1, r0)
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0290
            java.nio.ByteBuffer r2 = r4.A09
            if (r2 == 0) goto L_0x0264
            android.media.MediaCodec$BufferInfo r0 = r4.A04
            r1 = 1
            if (r0 != 0) goto L_0x0265
        L_0x0264:
            r1 = 0
        L_0x0265:
            java.lang.String r0 = "Temporary buffers are null"
            X.C159297la.A02(r1, r0)
            android.media.MediaCodec$BufferInfo r11 = r4.A04
            int r13 = r3.limit()
            r14 = 0
            r16 = 2
            r11.set(r12, r13, r14, r16)
            r2.clear()
            int r0 = r3.limit()
            r2.limit(r0)
            r3.position(r12)
            r2.put(r3)
            r1 = -1
            X.85a r0 = new X.85a
            r0.<init>(r1, r2, r11)
            r6.Bse(r0)
        L_0x0290:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x02dc
            byte[] r6 = r4.A0D
            byte r0 = r3.get(r12)
            r9 = 3
            int r0 = r0 >> r9
            r2 = r0 & 31
            byte r0 = r3.get(r12)
            r8 = r0 & 7
            r1 = 1
            int r8 = r8 << r1
            byte r0 = r3.get(r1)
            int r0 = r0 >> 7
            r0 = r0 & 1
            r8 = r8 | r0
            byte r0 = r3.get(r1)
            int r0 = r0 >> r9
            r7 = r0 & 15
            r0 = -1
            r6[r12] = r0
            r0 = -15
            r6[r1] = r0
            r3 = 6
            int r2 = r2 << r3
            byte r0 = (byte) r2
            r2 = 2
            r6[r2] = r0
            int r8 = r8 << r2
            r0 = r0 | r8
            byte r1 = (byte) r0
            r6[r2] = r1
            int r0 = r7 >> 2
            X.AnonymousClass6C8.A0u(r1, r6, r0, r2)
            r0 = r7 & 3
            int r0 = r0 << r3
            byte r0 = (byte) r0
            r6[r9] = r0
            r0 = 4
            r6[r0] = r12
            r0 = 5
            r6[r0] = r12
            r0 = -4
            r6[r3] = r0
        L_0x02dc:
            X.7kM r1 = r4.A06
            r0 = 1
            r1.A0J = r0
        L_0x02e1:
            r3 = 0
            goto L_0x017b
        L_0x02e4:
            X.8uv r0 = r4.A07
            r0.stop()
        L_0x02e9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91G.call():java.lang.Object");
    }
}
