package X;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.309  reason: invalid class name */
public final class AnonymousClass309 {
    public static final AtomicLongFieldUpdater A04;
    public static final AtomicReferenceFieldUpdater A05;
    public static final AnonymousClass2XH A06 = new AnonymousClass2XH("REMOVE_FROZEN");
    public final int A00;
    public final int A01;
    public final AtomicReferenceArray A02;
    public final boolean A03;
    public volatile Object _next;
    public volatile long _state;

    static {
        Class<AnonymousClass309> cls = AnonymousClass309.class;
        A05 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        A04 = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public final int A00(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        while (true) {
            AnonymousClass309 r11 = this;
            long j = atomicLongFieldUpdater.get(r11);
            if ((3458764513820540928L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                int i2 = (int) ((1152921503533105152L & j) >> 30);
                int i3 = r11.A01;
                if (((i2 + 2) & i3) != (i & i3)) {
                    if (!r11.A03 && r11.A02.get(i2 & i3) != null) {
                        int i4 = r11.A00;
                        if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                            break;
                        }
                    } else if (atomicLongFieldUpdater.compareAndSet(r11, j, (j & (~1152921503533105152L)) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                        int i5 = i2 & i3;
                        Object obj2 = obj;
                        r11.A02.set(i5, obj2);
                        while ((atomicLongFieldUpdater.get(r11) & 1152921504606846976L) != 0) {
                            r11 = r11.A03(r11.A01());
                            AtomicReferenceArray atomicReferenceArray = r11.A02;
                            int i6 = r11.A01 & i2;
                            Object obj3 = atomicReferenceArray.get(i6);
                            if (!(obj3 instanceof AnonymousClass2J7) || ((AnonymousClass2J7) obj3).A00 != i2) {
                                break;
                            }
                            atomicReferenceArray.set(i6, obj2);
                        }
                        return 0;
                    }
                } else {
                    break;
                }
            } else {
                return C18280x3.A00(((j & 2305843009213693952L) > 0 ? 1 : ((j & 2305843009213693952L) == 0 ? 0 : -1)));
            }
        }
        return 1;
    }

    public final long A01() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    public final Object A02() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        while (true) {
            AnonymousClass309 r13 = this;
            long j = atomicLongFieldUpdater.get(r13);
            if ((1152921504606846976L & j) == 0) {
                int A012 = AnonymousClass0x7.A01(j);
                int i = r13.A01;
                int i2 = A012 & i;
                if ((((int) ((1152921503533105152L & j) >> 30)) & i) != i2) {
                    AtomicReferenceArray atomicReferenceArray = r13.A02;
                    Object obj = atomicReferenceArray.get(i2);
                    if (obj != null) {
                        if (obj instanceof AnonymousClass2J7) {
                            break;
                        }
                        long j2 = ~1073741823;
                        long j3 = ((long) ((A012 + 1) & 1073741823)) << 0;
                        if (atomicLongFieldUpdater.compareAndSet(r13, j, (j & j2) | j3)) {
                            atomicReferenceArray.set(i2, (Object) null);
                            return obj;
                        } else if (r13.A03) {
                            while (true) {
                                long j4 = atomicLongFieldUpdater.get(r13);
                                int A013 = AnonymousClass0x7.A01(j4);
                                if ((1152921504606846976L & j4) != 0) {
                                    r13 = r13.A03(r13.A01());
                                } else if (atomicLongFieldUpdater.compareAndSet(r13, j4, (j4 & j2) | j3)) {
                                    r13.A02.set(r13.A01 & A013, (Object) null);
                                    return obj;
                                }
                            }
                        }
                    } else if (r13.A03) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return A06;
            }
        }
        return null;
    }

    public final AnonymousClass309 A03(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        while (true) {
            AnonymousClass309 r0 = (AnonymousClass309) atomicReferenceFieldUpdater.get(this);
            if (r0 != null) {
                return r0;
            }
            AnonymousClass309 r5 = new AnonymousClass309(this.A00 * 2, this.A03);
            int A012 = AnonymousClass0x7.A01(j);
            int i = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i2 = this.A01;
                if ((A012 & i2) == (i & i2)) {
                    break;
                }
                Object obj = this.A02.get(i2 & A012);
                if (obj == null) {
                    obj = new AnonymousClass2J7(A012);
                }
                r5.A02.set(r5.A01 & A012, obj);
                A012++;
            }
            A04.set(r5, j & (~1152921504606846976L));
            AnonymousClass0H6.A00(this, (Object) null, r5, atomicReferenceFieldUpdater);
        }
    }

    public final boolean A04() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                break;
            } else if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public AnonymousClass309(int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        int i2 = i - 1;
        this.A01 = i2;
        this.A02 = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw AnonymousClass001.A0e("Check failed.");
        } else if ((i & i2) != 0) {
            throw AnonymousClass001.A0e("Check failed.");
        }
    }
}
