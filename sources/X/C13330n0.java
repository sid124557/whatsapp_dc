package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0n0  reason: invalid class name and case insensitive filesystem */
public final class C13330n0 implements Runnable {
    public static C001501v A07;
    public static final BlockingQueue A08;
    public static final Executor A09;
    public static final ThreadFactory A0A;
    public static volatile Executor A0B;
    public final C17900wQ A00;
    public final CountDownLatch A01;
    public final FutureTask A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public volatile C02170Fd A05;
    public final /* synthetic */ AnonymousClass08c A06;

    static {
        C02460Gg r7 = new C02460Gg(0);
        A0A = r7;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        A08 = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, r7);
        A09 = threadPoolExecutor;
        A0B = threadPoolExecutor;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13330n0(AnonymousClass08c r3) {
        this();
        this.A06 = r3;
        this.A01 = new CountDownLatch(1);
    }

    public void A00(Object obj) {
        C001501v r3;
        synchronized (C13330n0.class) {
            r3 = A07;
            if (r3 == null) {
                r3 = new C001501v();
                A07 = r3;
            }
        }
        r3.obtainMessage(1, new AnonymousClass0LA(this, obj)).sendToTarget();
    }

    public void run() {
        this.A06.A08();
    }

    public C13330n0() {
        this.A05 = C02170Fd.PENDING;
        this.A03 = new AtomicBoolean();
        this.A04 = new AtomicBoolean();
        C17900wQ r1 = new C17900wQ(this, 0);
        this.A00 = r1;
        this.A02 = new C13970o2(this, r1);
    }
}
