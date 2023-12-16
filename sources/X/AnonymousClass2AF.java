package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2AF  reason: invalid class name */
public final class AnonymousClass2AF {
    public static final AnonymousClass46G A00(C84814Du r4) {
        int i;
        if (!(r4 instanceof AnonymousClass46F)) {
            i = 1;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass46F.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                if (obj == null) {
                    atomicReferenceFieldUpdater.set(r4, C58082ug.A00);
                    break;
                }
                boolean z = obj instanceof AnonymousClass46G;
                AnonymousClass2XH r0 = C58082ug.A00;
                if (z) {
                    if (AnonymousClass0H6.A00(r4, obj, r0, atomicReferenceFieldUpdater)) {
                        AnonymousClass46G r3 = (AnonymousClass46G) obj;
                        if (r3 != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = AnonymousClass46G.A04;
                            Object obj2 = atomicReferenceFieldUpdater2.get(r3);
                            if (!(obj2 instanceof C53372mz) || ((C53372mz) obj2).A00 == null) {
                                AnonymousClass46G.A02.set(r3, 536870911);
                                atomicReferenceFieldUpdater2.set(r3, C72763eF.A00);
                                return r3;
                            }
                            r3.A0B();
                        }
                    }
                } else if (obj != r0 && !(obj instanceof Throwable)) {
                    throw AnonymousClass000.A0H(obj, "Inconsistent state ", AnonymousClass001.A0o());
                }
            }
            i = 2;
        }
        return new AnonymousClass46G(r4, i);
    }
}
