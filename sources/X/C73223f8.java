package X;

import android.os.Process;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3f8  reason: invalid class name and case insensitive filesystem */
public class C73223f8 extends Thread {
    public static final Runnable A05 = new C172578Lw(28);
    public static final String A06;
    public C55682qk A00;
    public final AnonymousClass5ZC A01 = new AnonymousClass5ZC(20, 20);
    public final BlockingQueue A02 = new ArrayBlockingQueue(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, true);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicInteger A04 = new AtomicInteger(0);

    public final void A00() {
        C55682qk r3;
        Object obj = null;
        do {
            try {
                obj = this.A02.take();
                continue;
            } catch (InterruptedException unused) {
            }
        } while (obj == null);
        if (obj instanceof String) {
            Log.doLogToFile((String) obj);
        } else if (obj instanceof FutureTask) {
            ((FutureTask) obj).run();
        } else {
            throw AnonymousClass001.A0e("Invalid log item type");
        }
        AtomicBoolean atomicBoolean = this.A03;
        if (atomicBoolean.get() && this.A02.isEmpty()) {
            Log.blockingLog(2, "==========log/emptyingqueue/end==========");
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("==========log/emptyingqueue/skipped ");
            AtomicInteger atomicInteger = this.A04;
            A0o.append(atomicInteger);
            Log.blockingLog(2, AnonymousClass000.A0X(" entries==========", A0o));
            atomicInteger.set(0);
            atomicBoolean.set(false);
            if (this.A01.A00()) {
                synchronized (this) {
                    r3 = this.A00;
                    if (r3 == null) {
                        throw new NullPointerException();
                    }
                }
                r3.A0A("Log/doLogLoop", true, "Logging queue became full");
            }
        }
    }

    public C73223f8() {
        super(A06);
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            A00();
        }
    }

    static {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Logger (");
        StringBuilder A0l = AnonymousClass000.A0l("2.23.26.14");
        A0l.append("(");
        A0l.append(546598543);
        A06 = C18260x0.A07(AnonymousClass000.A0e(A0l), A0o);
    }

    public final void A01(Object obj) {
        if (Thread.currentThread() != this) {
            AtomicBoolean atomicBoolean = this.A03;
            if (!atomicBoolean.get()) {
                if (this.A02.offer(obj)) {
                    return;
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    Log.blockingLog(2, "==========log/emptyingqueue/start==========");
                }
            }
            this.A04.incrementAndGet();
            return;
        }
        Log.blockingLog(1, "Cannot add a log item from the logging thread. Attempting to crash.");
        throw AnonymousClass0x9.A0i("Cannot add a log item from the logging thread.");
    }
}
