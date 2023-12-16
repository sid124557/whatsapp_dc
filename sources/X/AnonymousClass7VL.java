package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7VL  reason: invalid class name */
public abstract class AnonymousClass7VL {
    public final ThreadLocal A00 = new AnonymousClass8S9(this);

    public abstract Object A00();

    public synchronized Object A01() {
        Object obj;
        ThreadLocal threadLocal = this.A00;
        obj = ((WeakReference) threadLocal.get()).get();
        if (obj == null) {
            obj = A00();
            threadLocal.set(AnonymousClass0x9.A14(obj));
        }
        return obj;
    }
}
