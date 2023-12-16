package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.01v  reason: invalid class name and case insensitive filesystem */
public class C001501v extends Handler {
    public void handleMessage(Message message) {
        AnonymousClass0LA r2 = (AnonymousClass0LA) message.obj;
        if (message.what == 1) {
            C13330n0 r4 = r2.A00;
            Object obj = r2.A01[0];
            if (r4.A03.get()) {
                try {
                    r4.A06.A0A(r4, obj);
                } catch (Throwable th) {
                    r4.A01.countDown();
                    throw th;
                }
            } else {
                AnonymousClass08c r1 = r4.A06;
                if (r1.A02 != r4) {
                    r1.A0A(r4, obj);
                } else if (r1.A02) {
                    r1.A0B(obj);
                } else {
                    r1.A04 = false;
                    SystemClock.uptimeMillis();
                    r1.A02 = null;
                    r1.A04(obj);
                }
            }
            r4.A01.countDown();
            r4.A05 = C02170Fd.FINISHED;
        }
    }

    public C001501v() {
        super(Looper.getMainLooper());
    }
}
