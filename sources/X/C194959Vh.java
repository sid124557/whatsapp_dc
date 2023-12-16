package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.9Vh  reason: invalid class name and case insensitive filesystem */
public class C194959Vh {
    public static final UUID A06 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;

    public synchronized C201799kk A00(AnonymousClass9SG r6, String str, Callable callable) {
        C201799kk r4;
        UUID uuid = this.A01;
        uuid.getClass();
        r4 = new C201799kk(this, str, uuid, callable);
        if (r6 != null) {
            r4.A00(r6);
        }
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis());
        return r4;
    }

    public synchronized C201799kk A02(String str, Callable callable, long j) {
        C201799kk r4;
        UUID uuid = this.A01;
        uuid.getClass();
        r4 = new C201799kk(this, str, uuid, callable);
        this.A03.postAtTime(r4, this.A01, SystemClock.uptimeMillis() + j);
        return r4;
    }

    public Object A03(String str, Callable callable) {
        C201799kk r1;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            r1 = new C201799kk(this, str, uuid, callable);
            this.A02.post(r1);
        }
        return r1.get();
    }

    public Object A04(String str, Callable callable) {
        C201799kk r1;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            r1 = new C201799kk(this, str, uuid, callable);
            this.A02.post(r1);
        }
        C202909mo r0 = (C202909mo) r1.get();
        r0.Ay4();
        return r0.BCH();
    }

    public synchronized void A05(Runnable runnable, UUID uuid) {
        UUID uuid2 = this.A01;
        if ((uuid2 != null && uuid2.equals(uuid)) || A06.equals(uuid)) {
            Handler handler = this.A00;
            if (handler != null) {
                handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (AnonymousClass9WU.class) {
                    AnonymousClass9WU.A00.postAtTime(runnable, uuid, uptimeMillis);
                }
            }
        }
    }

    public synchronized void A07(String str, Callable callable) {
        A00((AnonymousClass9SG) null, str, callable);
    }

    public synchronized void A08(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public synchronized C201799kk A01(AnonymousClass9SG r6, Callable callable) {
        C201799kk r3;
        UUID uuid = A06;
        r3 = new C201799kk(this, "load_camera_infos", uuid, callable);
        r3.A00(r6);
        this.A03.postAtTime(r3, uuid, SystemClock.uptimeMillis());
        return r3;
    }

    public boolean A09() {
        return AnonymousClass000.A1Y(this.A03.getLooper().getThread(), Thread.currentThread());
    }

    public C194959Vh() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        this.A05 = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A03 = new Handler(looper);
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        this.A04 = handlerThread2;
        handlerThread2.start();
        Looper looper2 = handlerThread2.getLooper();
        looper2.getClass();
        this.A02 = new Handler(looper2);
    }

    public void A06(String str) {
        if (!A09()) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(" Current thread: ");
            A0l.append(Thread.currentThread().getName());
            throw AnonymousClass6C7.A0e(A0l);
        }
    }

    public void finalize() {
        super.finalize();
        HandlerThread handlerThread = this.A04;
        handlerThread.quitSafely();
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        HandlerThread handlerThread2 = this.A05;
        handlerThread2.quitSafely();
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }
}
