package X;

import android.os.MessageQueue;

/* renamed from: X.6B4  reason: invalid class name */
public class AnonymousClass6B4 implements MessageQueue.IdleHandler {
    public Object A00;
    public final int A01;

    public AnonymousClass6B4(C89704el r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        int i = this.A01;
        C89704el r0 = (C89704el) this.A00;
        switch (i) {
            case 0:
                C89704el.A53(r0);
                return false;
            case 1:
                r0.A04.BkP(new C70043Zq(r0, 15));
                return false;
            default:
                r0.A04.BkP(new C70043Zq(r0, 16));
                return false;
        }
    }
}
