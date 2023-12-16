package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.2zk  reason: invalid class name and case insensitive filesystem */
public class C61122zk {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C61122zk.class, Object.class, "_cur");
    public volatile Object _cur = new AnonymousClass309(8, false);

    public final int A00() {
        long j = AnonymousClass309.A04.get(A00.get(this));
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - AnonymousClass0x7.A01(j));
    }

    public final Object A01() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            AnonymousClass309 r2 = (AnonymousClass309) atomicReferenceFieldUpdater.get(this);
            Object A02 = r2.A02();
            if (A02 != AnonymousClass309.A06) {
                return A02;
            }
            AnonymousClass0H6.A00(this, r2, r2.A03(r2.A01()), atomicReferenceFieldUpdater);
        }
    }

    public final void A02() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            AnonymousClass309 r2 = (AnonymousClass309) atomicReferenceFieldUpdater.get(this);
            if (!r2.A04()) {
                AnonymousClass0H6.A00(this, r2, r2.A03(r2.A01()), atomicReferenceFieldUpdater);
            } else {
                return;
            }
        }
    }

    public final boolean A03(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            AnonymousClass309 r2 = (AnonymousClass309) atomicReferenceFieldUpdater.get(this);
            int A002 = r2.A00(obj);
            if (A002 == 0) {
                return true;
            }
            if (A002 != 1) {
                return false;
            }
            AnonymousClass0H6.A00(this, r2, r2.A03(r2.A01()), atomicReferenceFieldUpdater);
        }
    }
}
