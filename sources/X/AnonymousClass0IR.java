package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0IR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0IR {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReference atomicReference) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
