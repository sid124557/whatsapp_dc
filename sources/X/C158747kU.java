package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.7kU  reason: invalid class name and case insensitive filesystem */
public abstract class C158747kU {
    public static final AtomicReferenceFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public volatile Object _next;
    public volatile Object _prev;

    public boolean A03() {
        int i;
        C175778Zr r2 = (C175778Zr) this;
        int i2 = C175778Zr.A01.get(r2);
        if (r2 instanceof C175758Zp) {
            i = AnonymousClass79Y.A01;
        } else {
            i = C1462879o.A01;
        }
        if (i2 != i || r2.A00() == null) {
            return false;
        }
        return true;
    }

    static {
        Class<C158747kU> cls = C158747kU.class;
        Class<Object> cls2 = Object.class;
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public final C158747kU A00() {
        Object obj = A00.get(this);
        if (obj == C155217eT.A00) {
            return null;
        }
        return (C158747kU) obj;
    }

    public final void A01() {
        A01.lazySet(this, (Object) null);
    }

    public C158747kU(C158747kU r1) {
        this._prev = r1;
    }

    public final void A02() {
        C158747kU r3;
        Object obj;
        C158747kU r0;
        C158747kU A002;
        if (A00() != null) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    r3 = (C158747kU) obj2;
                    if (r3 == null || !r3.A03()) {
                        C158747kU A003 = A00();
                        C162457s7.A0H(A003);
                    } else {
                        obj2 = atomicReferenceFieldUpdater.get(r3);
                    }
                }
                C158747kU A0032 = A00();
                C162457s7.A0H(A0032);
                while (A0032.A03() && (A002 = A0032.A00()) != null) {
                    A0032 = A002;
                }
                do {
                    obj = atomicReferenceFieldUpdater.get(A0032);
                    r0 = r3;
                    if (obj == null) {
                        r0 = null;
                    }
                } while (!AnonymousClass0H6.A00(A0032, obj, r0, atomicReferenceFieldUpdater));
                if (r3 != null) {
                    A00.set(r3, A0032);
                }
                if ((!A0032.A03() || A0032.A00() == null) && (r3 == null || !r3.A03())) {
                    return;
                }
            }
        }
    }
}
