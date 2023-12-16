package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.81F  reason: invalid class name */
public class AnonymousClass81F implements C186508vT {
    public final MediaCodec A00;

    public void AzS(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i) {
        this.A00.configure(mediaFormat, surface, mediaCrypto, 0);
    }

    public void Bi5(int i, int i2, int i3, long j, int i4) {
        this.A00.queueInputBuffer(i, 0, i3, j, i4);
    }

    public void Bi8(C150147Pk r8, int i, int i2, int i3, long j) {
        this.A00.queueSecureInputBuffer(i, 0, r8.A08, j, 0);
    }

    public void Bir(int i, boolean z) {
        this.A00.releaseOutputBuffer(i, false);
    }

    public int B1S() {
        return this.A00.dequeueInputBuffer(0);
    }

    public int B1W(MediaCodec.BufferInfo bufferInfo) {
        while (true) {
            int dequeueOutputBuffer = this.A00.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer != -3 && dequeueOutputBuffer != -3) {
                return dequeueOutputBuffer;
            }
        }
    }

    public ByteBuffer B8O(int i) {
        return this.A00.getInputBuffer(i);
    }

    public ByteBuffer BAG(int i) {
        return this.A00.getOutputBuffer(i);
    }

    public MediaFormat BAI() {
        return this.A00.getOutputFormat();
    }

    public void Biq(int i, long j) {
        this.A00.releaseOutputBuffer(i, j);
    }

    public void Bmh(Handler handler, AnonymousClass7R5 r4) {
        this.A00.setOnFrameRenderedListener(new C162897sw(this, r4), handler);
    }

    public void Bmo(Surface surface) {
        this.A00.setOutputSurface(surface);
    }

    public void Bnn(int i) {
        this.A00.setVideoScalingMode(i);
    }

    public void flush() {
        this.A00.flush();
    }

    public void release() {
        this.A00.release();
    }

    public void reset() {
        this.A00.reset();
    }

    public void start() {
        this.A00.start();
    }

    public void stop() {
        this.A00.stop();
    }

    public AnonymousClass81F(String str) {
        this.A00 = MediaCodec.createByCodecName(str);
    }
}
