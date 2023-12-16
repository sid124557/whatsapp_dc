package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.8SL  reason: invalid class name */
public final class AnonymousClass8SL extends WeakReference {
    public final int A00;

    public AnonymousClass8SL(Throwable th) {
        super(th, (ReferenceQueue) null);
        this.A00 = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == AnonymousClass8SL.class) {
            if (this != obj) {
                AnonymousClass8SL r5 = (AnonymousClass8SL) obj;
                if (!(this.A00 == r5.A00 && get() == r5.get())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }
}
