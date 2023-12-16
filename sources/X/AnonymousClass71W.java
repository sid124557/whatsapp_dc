package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.71W  reason: invalid class name */
public final /* synthetic */ class AnonymousClass71W {
    public static /* synthetic */ boolean A00(Object obj, Object obj2, AtomicReferenceArray atomicReferenceArray, int i) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
