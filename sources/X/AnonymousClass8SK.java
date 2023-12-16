package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.8SK  reason: invalid class name */
public final class AnonymousClass8SK extends WeakReference {
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == AnonymousClass8SK.class) {
            if (this != obj) {
                AnonymousClass8SK r5 = (AnonymousClass8SK) obj;
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

    public AnonymousClass8SK(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        this.A00 = System.identityHashCode(th);
    }
}
