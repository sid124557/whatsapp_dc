package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.0OX  reason: invalid class name */
public final class AnonymousClass0OX {
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public final Queue A03 = new ArrayDeque();

    public final void A00() {
        if (!this.A01) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    Queue queue = this.A03;
                    if (!(!queue.isEmpty()) || (!this.A00 && this.A02)) {
                        this.A01 = z;
                    } else {
                        Runnable runnable = (Runnable) queue.poll();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }
                this.A01 = z;
            } finally {
                this.A01 = z;
            }
        }
    }

    public final void A01(Runnable runnable, C85494Gl r4) {
        AnonymousClass46A A04 = AnonymousClass34M.A01().A04();
        if (A04.A03(r4) || this.A00 || !this.A02) {
            A04.A01(new C11890kd(this, runnable), r4);
        } else if (this.A03.offer(runnable)) {
            A00();
        } else {
            throw AnonymousClass001.A0e("cannot enqueue any more runnables");
        }
    }
}
