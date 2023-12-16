package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.85g  reason: invalid class name and case insensitive filesystem */
public class C1683985g implements C186408vG {
    public final /* synthetic */ C1684285j A00;

    public void BhL(Context context, C151307Uf r2, C158247jf r3, AnonymousClass724 r4, C151367Um r5, int i) {
    }

    public C1683985g(C1684285j r1) {
        this.A00 = r1;
    }

    public void B1y(long j) {
        C1684285j r2 = this.A00;
        C1683385a r1 = r2.A01;
        if (r1 != null) {
            r1.A00.presentationTimeUs = j;
            r2.A05.offer(r1);
            r2.A01 = null;
        }
    }

    public String B7K() {
        return "VideoTranscoderPassThrough";
    }

    public MediaFormat BAI() {
        try {
            this.A00.A03.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.A00.A00;
    }

    public void Bis(C1683385a r2) {
        LinkedBlockingQueue linkedBlockingQueue;
        if (r2.A02 >= 0 && (linkedBlockingQueue = this.A00.A04) != null) {
            linkedBlockingQueue.offer(r2);
        }
    }

    public void BjW(long j) {
    }

    public void BpK() {
        C1683385a r2 = new C1683385a(0, (ByteBuffer) null, new MediaCodec.BufferInfo());
        r2.Blq(0, 0, 0, 4);
        this.A00.A05.offer(r2);
    }

    public void finish() {
        this.A00.A05.clear();
    }

    public void flush() {
    }

    public C1683385a B1U(long j) {
        C1684285j r6 = this.A00;
        if (r6.A08) {
            r6.A08 = false;
            C1683385a r0 = new C1683385a(-1, (ByteBuffer) null, new MediaCodec.BufferInfo());
            r0.A01 = true;
            return r0;
        }
        if (!r6.A07) {
            r6.A07 = true;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = r6.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                r6.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            C1683385a r02 = new C1683385a(0, allocateDirect, new MediaCodec.BufferInfo());
            if (AnonymousClass722.A00(r6.A00, r02)) {
                return r02;
            }
        }
        return (C1683385a) r6.A05.poll(250000, TimeUnit.MICROSECONDS);
    }

    public int BAL() {
        MediaFormat BAI = BAI();
        String str = "rotation-degrees";
        if (!BAI.containsKey(str)) {
            str = "rotation";
            if (!BAI.containsKey(str)) {
                return 0;
            }
        }
        return BAI.getInteger(str);
    }
}
