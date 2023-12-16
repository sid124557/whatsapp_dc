package X;

import android.os.Handler;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Wy  reason: invalid class name and case insensitive filesystem */
public class C69423Wy implements AnonymousClass4FS {
    public static C55682qk A04;
    public static C174368Tz A05;
    public static final C54632p2 A06;
    public static final BlockingQueue A07;
    public static final Executor A08 = new C1895491s(0);
    public static final ThreadPoolExecutor A09;
    public Handler A00;
    public final Map A01 = AnonymousClass001.A0t();
    public final Set A02 = AnonymousClass002.A0K();
    public final Set A03 = AnonymousClass002.A0K();

    public ThreadPoolExecutor B18(String str, BlockingQueue blockingQueue, int i, int i2, int i3, long j) {
        BlockingQueue blockingQueue2 = blockingQueue;
        C34091uD r1 = new C34091uD(this, str, blockingQueue2, new C117985so(i3, str), TimeUnit.SECONDS, i, i2, j, true);
        A06.A00(r1);
        return r1;
    }

    public synchronized void BjN(Runnable runnable) {
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public void BkN(Runnable runnable, String str) {
        Set set = this.A03;
        synchronized (set) {
            String str2 = str;
            if (set.add(str)) {
                BkM(new AnonymousClass54K(this, runnable, AnonymousClass000.A0T("WaWorkers/runIfNotRunning/", str), str2, set));
            } else {
                C18260x0.A0q("WaWorkers/runIfNotRunning skipping running task id:", str, AnonymousClass001.A0o());
            }
        }
    }

    public boolean BkQ(Runnable runnable, String str) {
        Set set = this.A02;
        synchronized (set) {
            String str2 = str;
            if (set.add(str)) {
                BkP(new AnonymousClass54K(this, runnable, AnonymousClass000.A0T("WaWorkers/runLatencySensitiveIfNotRunning/", str), str2, set));
                return true;
            }
            C18260x0.A0q("WaWorkers/runLatencySensitiveIfNotRunning skipping running task id:", str, AnonymousClass001.A0o());
            return false;
        }
    }

    public synchronized Runnable Bkn(Runnable runnable, String str, long j) {
        C70153a2 r0;
        Handler handler = this.A00;
        if (handler == null) {
            handler = C18290x4.A0I("WhatsApp Worker Scheduler");
            this.A00 = handler;
        }
        r0 = new C70153a2(this, 0, runnable);
        handler.postDelayed(r0, j);
        return r0;
    }

    static {
        C118495td r3 = new C118495td();
        A07 = r3;
        C54632p2 r5 = new C54632p2();
        A06 = r5;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A05 = new C34081uC(r3, new C117985so(10, "WhatsApp Worker"), timeUnit);
        C138246q0 r2 = new C138246q0(new SynchronousQueue(), new C117985so(0, "High Pri Worker"), timeUnit);
        A09 = r2;
        A05.setRejectedExecutionHandler(new C72193dK());
        r5.A00(A05);
        r5.A00(r2);
    }

    public ThreadPoolExecutor A00(String str, int i) {
        return new C34091uD(this, str, new LinkedBlockingQueue(), new C117985so(i, str), TimeUnit.SECONDS, 1, 1, 0, false);
    }

    public final void BkL(AnonymousClass5ZM r3, Object... objArr) {
        r3.A02.executeOnExecutor(A05, objArr);
    }

    public void BkM(Runnable runnable) {
        A05.execute(runnable);
    }

    public final void BkO(AnonymousClass5ZM r3, Object... objArr) {
        r3.A02.executeOnExecutor(A09, objArr);
    }

    public void BkP(Runnable runnable) {
        A09.execute(runnable);
    }

    public void BkV(Runnable runnable, String str) {
        C72173dI r0;
        Map map = this.A01;
        synchronized (map) {
            r0 = (C72173dI) map.get(str);
            if (r0 == null) {
                r0 = C72173dI.A00(this);
                map.put(str, r0);
            }
        }
        r0.execute(runnable);
    }
}
