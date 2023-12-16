package X;

import android.os.Looper;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5Mo  reason: invalid class name and case insensitive filesystem */
public final class C103355Mo {
    public final Set A00 = AnonymousClass002.A0K();

    public void A00() {
        Thread thread = C1000959k.A00;
        if (thread == null) {
            thread = Looper.getMainLooper().getThread();
            C1000959k.A00 = thread;
        }
        if (Thread.currentThread() == thread) {
            Iterator it = this.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0g("onCleared");
            }
            return;
        }
        throw AnonymousClass001.A0e("Must be called on the Main thread.");
    }
}
