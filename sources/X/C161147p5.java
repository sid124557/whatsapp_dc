package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7p5  reason: invalid class name and case insensitive filesystem */
public class C161147p5 {
    public static Handler A00;
    public static final List A01 = AnonymousClass001.A0s();

    public static synchronized Handler A00() {
        Handler handler;
        synchronized (C161147p5.class) {
            if (A00 == null) {
                HandlerThread handlerThread = new HandlerThread("BackgroundLayoutPreparer", 5);
                handlerThread.start();
                A00 = AnonymousClass6C9.A0R(handlerThread);
                handlerThread.getThreadId();
            }
            handler = A00;
        }
        return handler;
    }

    public static synchronized C146467Aj A01(List list, int i, boolean z) {
        C146467Aj r10;
        synchronized (C161147p5.class) {
            Handler A002 = A00();
            List list2 = A01;
            Iterator it = list2.iterator();
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    C71663cT r4 = (C71663cT) it.next();
                    if (r4.A00 == i) {
                        ((C146467Aj) r4.A01).A00.compareAndSet(false, true);
                    }
                    C146467Aj r1 = (C146467Aj) r4.A01;
                    if (r1.A00.get()) {
                        A002.removeCallbacksAndMessages(r1);
                        it.remove();
                    }
                } else {
                    r10 = new C146467Aj();
                    C71663cT r8 = new C71663cT(list, r10, i2, 0, z);
                    list2.add(r8);
                    A002.postAtTime(new C172668Mf(r8, 10), r10, 0);
                }
            }
        }
        return r10;
    }
}
