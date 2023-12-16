package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.8Zr  reason: invalid class name and case insensitive filesystem */
public abstract class C175778Zr extends C158747kU implements C834548l {
    public static final AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C175778Zr.class, "cleanedAndPointers");
    public final long A00;
    public volatile int cleanedAndPointers;

    public final void A04() {
        int i;
        int incrementAndGet = A01.incrementAndGet(this);
        if (this instanceof C175758Zp) {
            i = AnonymousClass79Y.A01;
        } else {
            i = C1462879o.A01;
        }
        if (incrementAndGet == i) {
            A02();
        }
    }

    public void A05(int i) {
        AnonymousClass2XH r0;
        if (this instanceof C175758Zp) {
            C175758Zp r2 = (C175758Zp) this;
            r2.A00.set(i, AnonymousClass79Y.A03);
            r2.A04();
            return;
        }
        C175768Zq r3 = (C175768Zq) this;
        int i2 = C1462879o.A01;
        boolean z = false;
        if (i >= i2) {
            z = true;
            i -= i2;
        }
        AtomicReferenceArray atomicReferenceArray = r3.A00;
        int i3 = i * 2;
        atomicReferenceArray.get(i3);
        while (true) {
            Object obj = atomicReferenceArray.get(i3 + 1);
            if ((obj instanceof C183558qE) || (obj instanceof C150667Rs)) {
                if (z) {
                    r0 = C1462879o.A0A;
                } else {
                    r0 = C1462879o.A09;
                }
                if (r3.A08(i, obj, r0)) {
                    atomicReferenceArray.lazySet(i3, (Object) null);
                    r3.A07(i, !z);
                    break;
                }
            } else if (obj == C1462879o.A0A || obj == C1462879o.A09) {
                atomicReferenceArray.lazySet(i3, (Object) null);
            } else if (!(obj == C1462879o.A0F || obj == C1462879o.A0G)) {
                if (obj != C1462879o.A07 && obj != C1462879o.A03 && obj != C1462879o.A04) {
                    throw AnonymousClass000.A0H(obj, "unexpected state: ", AnonymousClass001.A0o());
                }
                return;
            }
        }
        atomicReferenceArray.lazySet(i3, (Object) null);
        if (z) {
            C162457s7.A0H(r3.A01);
        }
    }

    public final boolean A06() {
        int i;
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (this instanceof C175758Zp) {
                i2 = AnonymousClass79Y.A01;
            } else {
                i2 = C1462879o.A01;
            }
            if (i == i2 && A00() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public C175778Zr(C175778Zr r2, int i, long j) {
        super(r2);
        this.A00 = j;
        this.cleanedAndPointers = i << 16;
    }
}
