package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.7aZ  reason: invalid class name and case insensitive filesystem */
public class C153037aZ {
    public MediaFormat A00;
    public String A01;
    public ByteBuffer[] A02;
    public ByteBuffer[] A03;
    public final MediaCodec A04;
    public final Surface A05;
    public final C142306wz A06;
    public final boolean A07;

    public C1683385a A00(long j) {
        C159297la.A02(AnonymousClass000.A1X(this.A05), (String) null);
        int dequeueInputBuffer = this.A04.dequeueInputBuffer(j);
        if (dequeueInputBuffer >= 0) {
            return new C1683385a(dequeueInputBuffer, this.A02[dequeueInputBuffer], (MediaCodec.BufferInfo) null);
        }
        return null;
    }

    public C1683385a A01(long j) {
        C1683385a r0;
        Trace.beginSection("MediaCodecWrapper.dequeueNextOutputBuffer()");
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            Trace.beginSection("MediaCodecWrapper.dequeueOutputBuffer()");
            MediaCodec mediaCodec = this.A04;
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer >= 0) {
                r0 = new C1683385a(dequeueOutputBuffer, this.A03[dequeueOutputBuffer], bufferInfo);
            } else {
                if (dequeueOutputBuffer == -3) {
                    Trace.beginSection("MediaCodecWrapper.buffersChanged()");
                    this.A03 = mediaCodec.getOutputBuffers();
                    Trace.endSection();
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    this.A00 = outputFormat;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append(this.A01);
                    this.A01 = AnonymousClass000.A0X(String.format(Locale.US, "New output format: %s", AnonymousClass6C9.A1Z(outputFormat, 1)), A0o);
                    r0 = new C1683385a(-1, (ByteBuffer) null, (MediaCodec.BufferInfo) null);
                    r0.A01 = true;
                }
                Trace.endSection();
                return null;
            }
            Trace.endSection();
            return r0;
        } finally {
            Trace.endSection();
        }
    }

    public void A02() {
        MediaCodec mediaCodec = this.A04;
        mediaCodec.start();
        if (this.A05 == null) {
            this.A02 = mediaCodec.getInputBuffers();
        }
        this.A03 = mediaCodec.getOutputBuffers();
    }

    public void A03(C1683385a r9) {
        MediaCodec mediaCodec = this.A04;
        int i = r9.A02;
        MediaCodec.BufferInfo bufferInfo = r9.A00;
        mediaCodec.queueInputBuffer(i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 == X.C142306wz.ENCODER) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C153037aZ(android.media.MediaCodec r3, android.view.Surface r4, X.C142306wz r5, java.lang.String r6, boolean r7) {
        /*
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L_0x000a
            X.6wz r0 = X.C142306wz.ENCODER
            r1 = 0
            if (r5 != r0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C159297la.A02(r1, r0)
            r2.A06 = r5
            r2.A04 = r3
            r2.A05 = r4
            r2.A07 = r7
            r2.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153037aZ.<init>(android.media.MediaCodec, android.view.Surface, X.6wz, java.lang.String, boolean):void");
    }
}
