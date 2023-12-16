package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.3dI  reason: invalid class name and case insensitive filesystem */
public class C72173dI implements Executor {
    public Runnable A00;
    public final AnonymousClass4FS A01;
    public final Object A02 = AnonymousClass002.A0D();
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;
    public volatile long A05;

    public static C72173dI A00(AnonymousClass4FS r2) {
        return new C72173dI(r2, false);
    }

    public synchronized void A02() {
        this.A03.clear();
    }

    public final synchronized void A03() {
        Runnable runnable = (Runnable) this.A03.poll();
        this.A00 = runnable;
        if (runnable != null) {
            if (this.A04) {
                this.A01.BkP(runnable);
            } else {
                this.A01.BkM(runnable);
            }
        }
    }

    public synchronized void A04(Runnable runnable, long j) {
        AnonymousClass4FS r4 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1T(A0o, "SerialExecutor/executeDelayed/", runnable);
        r4.Bkn(new C33241sg(this, runnable, A0o.toString(), 6), "SerialExecutor/executeDelayed", j);
    }

    public synchronized void execute(Runnable runnable) {
        Queue queue = this.A03;
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1T(A0o, "SerialExecutor/execute/", runnable);
        queue.offer(new C33241sg(this, runnable, A0o.toString(), 5));
        if (this.A00 == null) {
            A03();
        }
    }

    public void A01() {
        C626936e.A0D(AnonymousClass000.A1T((this.A05 > Thread.currentThread().getId() ? 1 : (this.A05 == Thread.currentThread().getId() ? 0 : -1))), "Not running on this SerialExecutor");
    }

    public C72173dI(AnonymousClass4FS r2, boolean z) {
        this.A01 = r2;
        this.A04 = z;
    }
}
