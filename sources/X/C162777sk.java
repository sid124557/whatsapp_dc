package X;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.7sk  reason: invalid class name and case insensitive filesystem */
public class C162777sk implements SurfaceTexture.OnFrameAvailableListener {
    public static final long A06 = TimeUnit.MILLISECONDS.toNanos(10000);
    public long A00 = 0;
    public boolean A01;
    public final SurfaceTexture A02;
    public final Object A03 = AnonymousClass002.A0D();
    public final AtomicLong A04 = new AtomicLong(0);
    public volatile boolean A05;

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Class<C162777sk> cls = C162777sk.class;
        if (C162477s9.A01.BI0(2)) {
            C162477s9.A01.BsD(cls.getSimpleName(), "new frame available");
        }
        synchronized (this) {
            this.A00++;
        }
        Object obj = this.A03;
        synchronized (obj) {
            if (!this.A01) {
                this.A01 = true;
                obj.notifyAll();
            } else {
                throw AnonymousClass002.A0E("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public C162777sk(SurfaceTexture surfaceTexture) {
        System.nanoTime();
        this.A02 = surfaceTexture;
    }
}
