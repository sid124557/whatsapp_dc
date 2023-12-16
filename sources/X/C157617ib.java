package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.7ib  reason: invalid class name and case insensitive filesystem */
public class C157617ib {
    public static final AtomicIntegerFieldUpdater A01;
    public static final AtomicLongFieldUpdater A02;
    public static final AtomicLongFieldUpdater A03;
    public static final AtomicReferenceFieldUpdater A04;
    public static final AtomicReferenceFieldUpdater A05;
    public final AnonymousClass4GQ A00 = new C175368Yc(this);
    public volatile int _availablePermits = 1;
    public volatile long deqIdx;
    public volatile long enqIdx;
    public volatile Object head;
    public volatile Object tail;

    public C157617ib() {
        C175758Zp r0 = new C175758Zp((C175758Zp) null, 2, 0);
        this.head = r0;
        this.tail = r0;
    }

    static {
        Class<C157617ib> cls = C157617ib.class;
        Class<Object> cls2 = Object.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        A02 = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        A05 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        A03 = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        A01 = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public void A00() {
        int i;
        Object A002;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1 || atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                    }
                    i = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw C86604Kt.A0h("The number of released permits cannot be greater than ", AnonymousClass001.A0o(), 1);
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
                C175778Zr r13 = (C175778Zr) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = A02.getAndIncrement(this);
                long j = (long) AnonymousClass79Y.A01;
                long j2 = andIncrement2 / j;
                C174528Uw r17 = C174528Uw.A00;
                while (true) {
                    A002 = C155217eT.A00(r17, r13, j2);
                    if (A002 == C155217eT.A00) {
                        break;
                    }
                    C175778Zr A003 = C1453675f.A00(A002);
                    while (true) {
                        C175778Zr r6 = (C175778Zr) atomicReferenceFieldUpdater.get(this);
                        if (r6.A00 >= A003.A00) {
                            break;
                        } else if (A003.A06()) {
                            if (AnonymousClass0H6.A00(this, r6, A003, atomicReferenceFieldUpdater)) {
                                AnonymousClass6C7.A1R(r6);
                                break;
                            }
                            AnonymousClass6C7.A1R(A003);
                        }
                    }
                }
                C175758Zp r1 = (C175758Zp) C1453675f.A00(A002);
                r1.A01();
                if (r1.A00 <= j2) {
                    int i2 = (int) (andIncrement2 % j);
                    AnonymousClass2XH r5 = AnonymousClass79Y.A04;
                    AtomicReferenceArray atomicReferenceArray = r1.A00;
                    Object andSet = atomicReferenceArray.getAndSet(i2, r5);
                    if (andSet == null) {
                        int i3 = AnonymousClass79Y.A00;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (atomicReferenceArray.get(i2) != AnonymousClass79Y.A05) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                        if (!AnonymousClass71W.A00(r5, AnonymousClass79Y.A02, atomicReferenceArray, i2)) {
                            return;
                        }
                    } else if (andSet == AnonymousClass79Y.A03) {
                        continue;
                    } else if (andSet instanceof AnonymousClass4GW) {
                        AnonymousClass4GW r3 = (AnonymousClass4GW) andSet;
                        Object BrC = r3.BrC(C59022wD.A00, (Object) null, this.A00);
                        if (BrC != null) {
                            r3.AzI(BrC);
                            return;
                        }
                    } else if (!(andSet instanceof AnonymousClass466)) {
                        throw AnonymousClass000.A0H(andSet, "unexpected: ", AnonymousClass001.A0o());
                    } else if (((AnonymousClass466) andSet).A01(this, C59022wD.A00) == 0) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }
}
