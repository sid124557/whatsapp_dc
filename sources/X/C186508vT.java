package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.8vT  reason: invalid class name and case insensitive filesystem */
public interface C186508vT {
    @Deprecated
    void AzS(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i);

    int B1S();

    int B1W(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer B8O(int i);

    ByteBuffer BAG(int i);

    MediaFormat BAI();

    void Bi5(int i, int i2, int i3, long j, int i4);

    void Bi8(C150147Pk r1, int i, int i2, int i3, long j);

    void Biq(int i, long j);

    void Bir(int i, boolean z);

    void Bmh(Handler handler, AnonymousClass7R5 r2);

    void Bmo(Surface surface);

    void Bnn(int i);

    void flush();

    void release();

    @Deprecated
    void reset();

    @Deprecated
    void start();

    @Deprecated
    void stop();
}
