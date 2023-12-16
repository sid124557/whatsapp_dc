package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2dq  reason: invalid class name and case insensitive filesystem */
public abstract class C47802dq {
    public Object A00(Object obj) {
        boolean z;
        C612930b r1;
        AnonymousClass474 r4 = (AnonymousClass474) this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass474.A00;
        Object obj2 = atomicReferenceFieldUpdater.get(r4);
        Object obj3 = C39252Bg.A00;
        if (obj2 == obj3) {
            Object A01 = r4.A01(obj);
            obj2 = atomicReferenceFieldUpdater.get(r4);
            if (obj2 == obj3) {
                if (!AnonymousClass0H6.A00(r4, obj3, A01, atomicReferenceFieldUpdater)) {
                    A01 = atomicReferenceFieldUpdater.get(r4);
                }
                obj2 = A01;
            }
        }
        C833146y r42 = (C833146y) r4;
        if (obj2 == null) {
            z = true;
            r1 = r42.A01;
        } else {
            z = false;
            r1 = r42.A00;
        }
        if (r1 != null && AnonymousClass0H6.A00(obj, r42, r1, C612930b.A00) && z) {
            C612930b r12 = r42.A01;
            C612930b r0 = r42.A00;
            C162457s7.A0H(r0);
            r12.A03(r0);
        }
        return obj2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        C18270x1.A18(this, A0o, '@');
        return A0o.toString();
    }
}
