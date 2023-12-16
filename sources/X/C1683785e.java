package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.85e  reason: invalid class name and case insensitive filesystem */
public class C1683785e implements C186218uw {
    public boolean A00;
    public final /* synthetic */ C1684285j A01;

    public C1683785e(C1684285j r1) {
        this.A01 = r1;
    }

    public long B1K(long j) {
        C1684285j r5 = this.A01;
        C1683385a r1 = r5.A01;
        if (r1 != null) {
            r5.A04.offer(r1);
            r5.A01 = null;
        }
        C1683385a r4 = (C1683385a) r5.A06.poll();
        r5.A01 = r4;
        if (r4 != null) {
            MediaCodec.BufferInfo bufferInfo = r4.A00;
            if (bufferInfo == null || (bufferInfo.flags & 4) == 0) {
                return bufferInfo.presentationTimeUs;
            }
            this.A00 = true;
            r5.A04.offer(r4);
            r5.A01 = null;
        }
        return -1;
    }

    public C1683385a B1T(long j) {
        return (C1683385a) this.A01.A04.poll(j, TimeUnit.MICROSECONDS);
    }

    public long B6n() {
        C1683385a r0 = this.A01.A01;
        if (r0 == null) {
            return -1;
        }
        return r0.A00.presentationTimeUs;
    }

    public String B6p() {
        return "VideoTranscoderPassThrough";
    }

    public boolean BJA() {
        return this.A00;
    }

    public void BhK(MediaFormat mediaFormat, C151367Um r8, List list, int i) {
        C1684285j r5 = this.A01;
        r5.A00 = mediaFormat;
        r5.A03.countDown();
        int i2 = 0;
        do {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = r5.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                r5.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            r5.A04.offer(new C1683385a(0, allocateDirect, new MediaCodec.BufferInfo()));
            i2++;
        } while (i2 < 5);
    }

    public void Bi6(C1683385a r2) {
        this.A01.A06.offer(r2);
    }

    public void finish() {
        C1684285j r1 = this.A01;
        ArrayList arrayList = r1.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
        r1.A04.clear();
        r1.A06.clear();
        r1.A04 = null;
    }

    public void Brb(int i, Bitmap bitmap) {
    }
}
