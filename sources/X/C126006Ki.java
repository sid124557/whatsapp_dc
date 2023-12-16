package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.6Ki  reason: invalid class name and case insensitive filesystem */
public abstract class C126006Ki extends AnonymousClass82B {
    public static Thread A02;
    public static final BlockingQueue A03 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A04 = new AtomicBoolean();
    public static volatile C172208Kc A05;
    public final AtomicLong A00 = new AtomicLong(0);
    public final AtomicLong A01 = new AtomicLong(0);

    public C126006Ki(Context context, int i) {
        super(i);
        if (A04.compareAndSet(false, true)) {
            C161847qe.A02(new C125956Kd(context, this));
        }
    }
}
