package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: X.6DL  reason: invalid class name */
public final class AnonymousClass6DL extends MediaCodec.Callback {
    public long A00;
    public MediaCodec.CodecException A01;
    public MediaFormat A02;
    public MediaFormat A03;
    public Handler A04;
    public IllegalStateException A05;
    public boolean A06;
    public final HandlerThread A07;
    public final C151047Tf A08;
    public final C151047Tf A09;
    public final Object A0A = AnonymousClass002.A0D();
    public final ArrayDeque A0B;
    public final ArrayDeque A0C;

    public static /* synthetic */ void A00(AnonymousClass6DL r6) {
        synchronized (r6.A0A) {
            if (!r6.A06) {
                long j = r6.A00 - 1;
                r6.A00 = j;
                if (j <= 0) {
                    if (j < 0) {
                        r6.A05 = AnonymousClass6CA.A0O();
                    } else {
                        r6.A01();
                    }
                }
            }
        }
    }

    public final void A01() {
        ArrayDeque arrayDeque = this.A0C;
        if (!arrayDeque.isEmpty()) {
            this.A03 = (MediaFormat) arrayDeque.getLast();
        }
        C151047Tf r0 = this.A08;
        r0.A00 = 0;
        r0.A02 = -1;
        r0.A01 = 0;
        C151047Tf r02 = this.A09;
        r02.A00 = 0;
        r02.A02 = -1;
        r02.A01 = 0;
        this.A0B.clear();
        arrayDeque.clear();
    }

    public void A02(MediaCodec mediaCodec) {
        C159197lM.A02(AnonymousClass000.A1X(this.A04));
        HandlerThread handlerThread = this.A07;
        handlerThread.start();
        Handler A0R = AnonymousClass6C9.A0R(handlerThread);
        mediaCodec.setCallback(this, A0R);
        this.A04 = A0R;
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.A0A) {
            this.A01 = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.A0A) {
            this.A08.A00(i);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.A0A) {
            MediaFormat mediaFormat = this.A03;
            if (mediaFormat != null) {
                this.A09.A00(-2);
                this.A0C.add(mediaFormat);
                this.A03 = null;
            }
            this.A09.A00(i);
            this.A0B.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.A0A) {
            this.A09.A00(-2);
            this.A0C.add(mediaFormat);
            this.A03 = null;
        }
    }

    public AnonymousClass6DL(HandlerThread handlerThread) {
        this.A07 = handlerThread;
        this.A08 = new C151047Tf();
        this.A09 = new C151047Tf();
        this.A0B = AnonymousClass6CA.A0a();
        this.A0C = AnonymousClass6CA.A0a();
    }
}
