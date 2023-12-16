package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.3dH  reason: invalid class name and case insensitive filesystem */
public class C72163dH implements Executor {
    public int A00;
    public final int A01;
    public final AnonymousClass4FS A02;
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;

    public synchronized void execute(Runnable runnable) {
        this.A03.offer(new C71573cK(this, 49, runnable));
        if (this.A00 < this.A01) {
            A00();
        }
    }

    public final void A00() {
        Runnable runnable = (Runnable) this.A03.poll();
        if (runnable != null) {
            this.A00++;
            boolean z = this.A04;
            AnonymousClass4FS r0 = this.A02;
            if (z) {
                r0.BkP(runnable);
            } else {
                r0.BkM(runnable);
            }
        }
    }

    public C72163dH(AnonymousClass4FS r2, int i, boolean z) {
        this.A02 = r2;
        this.A01 = i;
        this.A04 = z;
    }
}
