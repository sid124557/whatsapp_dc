package X;

import android.os.Handler;
import android.os.MessageQueue;

/* renamed from: X.92A  reason: invalid class name */
public class AnonymousClass92A implements MessageQueue.IdleHandler {
    public Object A00;
    public final int A01;

    public AnonymousClass92A(C150267Py r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        boolean z;
        int i = this.A01;
        C150267Py r2 = (C150267Py) this.A00;
        Handler handler = r2.A01;
        if (i != 0) {
            C172668Mf.A00(handler, r2, 19);
            synchronized (r2) {
                if (!r2.A06.isEmpty() || !r2.A05.isEmpty()) {
                    z = false;
                } else {
                    r2.A08 = false;
                    z = true;
                }
            }
            return !z;
        }
        C172668Mf.A00(handler, r2, 19);
        return true;
    }
}
