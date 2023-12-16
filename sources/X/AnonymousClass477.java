package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.477  reason: invalid class name */
public final class AnonymousClass477 extends C830645z {
    public static final AtomicIntegerFieldUpdater A00 = AtomicIntegerFieldUpdater.newUpdater(AnonymousClass477.class, "_decision");
    public volatile int _decision;

    public final boolean A13() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A00;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw AnonymousClass001.A0e("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean A14() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A00;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw AnonymousClass001.A0e("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 1));
        return true;
    }

    public void A0y(Object obj) {
        if (!A13()) {
            C84814Du A01 = C57702u4.A01(this.A00);
            if (obj instanceof AnonymousClass333) {
                obj = AnonymousClass3Z0.A01(((AnonymousClass333) obj).A00);
            }
            C58082ug.A00(obj, A01);
        }
    }

    public final Object A12() {
        if (A14()) {
            return AnonymousClass218.COROUTINE_SUSPENDED;
        }
        Object A01 = AnonymousClass36I.A01(A0A());
        if (!(A01 instanceof AnonymousClass333)) {
            return A01;
        }
        throw ((AnonymousClass333) A01).A00;
    }

    public void A0V(Object obj) {
        A0y(obj);
    }

    public AnonymousClass477(C84814Du r1, C85494Gl r2) {
        super(r1, r2);
    }
}
