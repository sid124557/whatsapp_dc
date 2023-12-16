package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3dx  reason: invalid class name and case insensitive filesystem */
public final class C72583dx implements AnonymousClass4C5 {
    public final AtomicReference A00;

    public Iterator iterator() {
        AnonymousClass4C5 r0 = (AnonymousClass4C5) this.A00.getAndSet((Object) null);
        if (r0 != null) {
            return r0.iterator();
        }
        throw AnonymousClass001.A0e("This sequence can be consumed only once.");
    }

    public C72583dx(AnonymousClass4C5 r2) {
        this.A00 = new AtomicReference(r2);
    }
}
