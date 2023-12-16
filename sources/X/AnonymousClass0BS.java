package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0BS  reason: invalid class name */
public final class AnonymousClass0BS extends AnonymousClass0QP {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    public void A00(C05970Vr r2, C05970Vr r3) {
        this.A02.lazySet(r2, r3);
    }

    public void A01(C05970Vr r2, Thread thread) {
        this.A03.lazySet(r2, thread);
    }

    public boolean A02(AnonymousClass0TD r2, AnonymousClass0TD r3, C10090hN r4) {
        return AnonymousClass0H6.A00(r4, r2, r3, this.A00);
    }

    public boolean A03(C05970Vr r2, C05970Vr r3, C10090hN r4) {
        return AnonymousClass0H6.A00(r4, r2, r3, this.A04);
    }

    public boolean A04(C10090hN r2, Object obj, Object obj2) {
        return AnonymousClass0H6.A00(r2, obj, obj2, this.A01);
    }

    public AnonymousClass0BS(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }
}
