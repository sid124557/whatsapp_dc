package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.7eT  reason: invalid class name and case insensitive filesystem */
public final class C155217eT {
    public static final AnonymousClass2XH A00 = new AnonymousClass2XH("CLOSED");

    public static final Object A00(AnonymousClass4GR r5, C175778Zr r6, long j) {
        while (true) {
            if (r6.A00 >= j && !r6.A03()) {
                return r6;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C158747kU.A00;
            Object obj = atomicReferenceFieldUpdater.get(r6);
            AnonymousClass2XH r0 = A00;
            if (obj == r0) {
                return r0;
            }
            C175778Zr r1 = (C175778Zr) ((C158747kU) obj);
            if (r1 == null) {
                r1 = (C175778Zr) r5.invoke(AnonymousClass0x9.A0n(r6.A00, 1), r6);
                if (AnonymousClass0H6.A00(r6, (Object) null, r1, atomicReferenceFieldUpdater)) {
                    if (r6.A03()) {
                        r6.A02();
                    }
                }
            }
            r6 = r1;
        }
    }
}
