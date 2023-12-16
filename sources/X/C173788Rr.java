package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.8Rr  reason: invalid class name and case insensitive filesystem */
public final class C173788Rr extends Thread {
    public static final AtomicIntegerFieldUpdater A08 = AtomicIntegerFieldUpdater.newUpdater(C173788Rr.class, "workerCtl");
    public int A00 = C158997kv.A01.A00();
    public long A01;
    public long A02;
    public C142046wY A03 = C142046wY.DORMANT;
    public boolean A04;
    public final C69903Yy A05 = new C69903Yy();
    public final C157577iX A06 = new C157577iX();
    public final /* synthetic */ C172268Ki A07;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker = C172268Ki.A0A;
    public volatile int workerCtl;

    public void run() {
        C142046wY r9;
        long j;
        int i;
        loop0:
        while (true) {
            boolean z = false;
            while (true) {
                C172268Ki r4 = this.A07;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C172268Ki.A07;
                if (atomicIntegerFieldUpdater.get(r4) != 0 || this.A03 == (r9 = C142046wY.TERMINATED)) {
                    A04(C142046wY.TERMINATED);
                } else {
                    C71253bo A022 = A02(this.A04);
                    if (A022 != null) {
                        this.A01 = 0;
                        int i2 = A022.A01.A00;
                        this.A02 = 0;
                        if (this.A03 == C142046wY.PARKING) {
                            this.A03 = C142046wY.BLOCKING;
                        }
                        if (i2 != 0 && A04(C142046wY.BLOCKING) && !r4.A04() && !r4.A05(C172268Ki.A08.get(r4))) {
                            r4.A04();
                        }
                        C172268Ki.A00(A022);
                        if (i2 != 0) {
                            C172268Ki.A08.addAndGet(r4, -2097152);
                            if (this.A03 != r9) {
                                this.A03 = C142046wY.DORMANT;
                            }
                        }
                    } else {
                        this.A04 = false;
                        if (this.A01 != 0) {
                            if (z) {
                                A04(C142046wY.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.A01);
                                this.A01 = 0;
                                break;
                            }
                            z = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            AnonymousClass2XH r11 = C172268Ki.A0A;
                            if (obj != r11) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = A08;
                                atomicIntegerFieldUpdater2.set(this, -1);
                                while (this.nextParkedWorker != r11 && atomicIntegerFieldUpdater2.get(this) == -1 && atomicIntegerFieldUpdater.get(r4) == 0 && this.A03 != r9) {
                                    A04(C142046wY.PARKING);
                                    Thread.interrupted();
                                    if (this.A02 == 0) {
                                        this.A02 = System.nanoTime() + r4.A02;
                                    }
                                    LockSupport.parkNanos(r4.A02);
                                    if (System.nanoTime() - this.A02 >= 0) {
                                        this.A02 = 0;
                                        AnonymousClass7VP r6 = r4.A04;
                                        synchronized (r6) {
                                            if (atomicIntegerFieldUpdater.get(r4) == 0) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = C172268Ki.A08;
                                                if (((int) (atomicLongFieldUpdater.get(r4) & 2097151)) > r4.A00 && atomicIntegerFieldUpdater2.compareAndSet(this, -1, 1)) {
                                                    int i3 = this.indexInArray;
                                                    A03(0);
                                                    r4.A03(this, i3, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(r4) & 2097151);
                                                    if (andDecrement != i3) {
                                                        Object A002 = r6.A00(andDecrement);
                                                        C162457s7.A0H(A002);
                                                        C173788Rr r0 = (C173788Rr) A002;
                                                        r6.A01(i3, r0);
                                                        r0.A03(i3);
                                                        r4.A03(r0, andDecrement, i3);
                                                    }
                                                    r6.A01(andDecrement, (Object) null);
                                                    this.A03 = r9;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (this.nextParkedWorker == r11) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = C172268Ki.A09;
                                do {
                                    j = atomicLongFieldUpdater2.get(r4);
                                    i = this.indexInArray;
                                    this.nextParkedWorker = r4.A04.A00((int) (2097151 & j));
                                } while (!atomicLongFieldUpdater2.compareAndSet(r4, j, ((2097152 + j) & -2097152) | ((long) i)));
                            }
                        }
                    }
                }
            }
        }
        A04(C142046wY.TERMINATED);
    }

    public C173788Rr(C172268Ki r2, int i) {
        this.A07 = r2;
        setDaemon(true);
        A03(i);
    }

    public final C71253bo A00() {
        AnonymousClass473 r0;
        int i = this.A00;
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >> 17);
        int i4 = i3 ^ (i3 << 5);
        this.A00 = i4;
        int i5 = i4 & 1;
        C172268Ki r1 = this.A07;
        if (i5 == 0) {
            C71253bo r02 = (C71253bo) r1.A06.A01();
            if (r02 != null) {
                return r02;
            }
            r0 = r1.A05;
        } else {
            C71253bo r03 = (C71253bo) r1.A05.A01();
            if (r03 != null) {
                return r03;
            }
            r0 = r1.A06;
        }
        return (C71253bo) r0.A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ad A[EDGE_INSN: B:67:0x00ad->B:40:0x00ad ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C71253bo A01(int r22) {
        /*
            r21 = this;
            r9 = r21
            X.8Ki r10 = r9.A07
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C172268Ki.A08
            long r2 = r0.get(r10)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r0
            int r8 = (int) r2
            r0 = 2
            r7 = 0
            if (r8 < r0) goto L_0x00f2
            int r6 = r9.A00
            int r0 = r6 << 13
            r6 = r6 ^ r0
            int r0 = r6 >> 17
            r6 = r6 ^ r0
            int r0 = r6 << 5
            r6 = r6 ^ r0
            r9.A00 = r6
            int r1 = r8 + -1
            r0 = r1 & r8
            if (r0 != 0) goto L_0x00e3
            r6 = r6 & r1
        L_0x0027:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0032:
            r17 = 0
            if (r11 >= r8) goto L_0x00ea
            int r6 = r6 + 1
            if (r6 <= r8) goto L_0x003b
            r6 = 1
        L_0x003b:
            X.7VP r0 = r10.A04
            java.lang.Object r0 = r0.A00(r6)
            X.8Rr r0 = (X.C173788Rr) r0
            if (r0 == 0) goto L_0x00ad
            if (r0 == r9) goto L_0x00ad
            X.7iX r5 = r0.A06
            X.3Yy r4 = r9.A05
            r1 = 3
            r0 = r22
            if (r0 != r1) goto L_0x005f
            X.3bo r1 = r5.A00()
            if (r1 == 0) goto L_0x007b
        L_0x0056:
            r4.element = r1
        L_0x0058:
            java.lang.Object r0 = r4.element
            X.3bo r0 = (X.C71253bo) r0
            r4.element = r7
            return r0
        L_0x005f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A02
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A03
            int r14 = r0.get(r5)
            boolean r13 = X.AnonymousClass001.A1T(r22)
        L_0x006f:
            if (r1 == r14) goto L_0x007b
            if (r13 == 0) goto L_0x00b9
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A01
            int r0 = r0.get(r5)
            if (r0 != 0) goto L_0x00b9
        L_0x007b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = X.C157577iX.A04
            java.lang.Object r12 = r13.get(r5)
            X.3bo r12 = (X.C71253bo) r12
            if (r12 == 0) goto L_0x00ad
            X.2J8 r0 = r12.A01
            int r1 = r0.A00
            r0 = 1
            if (r1 == r0) goto L_0x008d
            r0 = 2
        L_0x008d:
            r0 = r0 & r22
            if (r0 == 0) goto L_0x00ad
            long r15 = java.lang.System.nanoTime()
            long r0 = r12.A00
            long r15 = r15 - r0
            long r0 = X.AnonymousClass2CC.A04
            int r14 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x00b0
            long r0 = r0 - r15
            r12 = -1
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0058
            int r4 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ad
            long r2 = java.lang.Math.min(r2, r0)
        L_0x00ad:
            int r11 = r11 + 1
            goto L_0x0032
        L_0x00b0:
            boolean r0 = X.AnonymousClass0H6.A00(r5, r12, r7, r13)
            if (r0 == 0) goto L_0x007b
            r4.element = r12
            goto L_0x0058
        L_0x00b9:
            int r16 = r1 + 1
            r15 = r1 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r5.A00
            java.lang.Object r1 = r12.get(r15)
            X.3bo r1 = (X.C71253bo) r1
            if (r1 == 0) goto L_0x00e0
            X.2J8 r0 = r1.A01
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass001.A1T(r0)
            if (r0 != r13) goto L_0x00e0
            boolean r0 = X.AnonymousClass71W.A00(r1, r7, r12, r15)
            if (r0 == 0) goto L_0x00e0
            if (r13 == 0) goto L_0x0056
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A01
            r0.decrementAndGet(r5)
            goto L_0x0056
        L_0x00e0:
            r1 = r16
            goto L_0x006f
        L_0x00e3:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r0
            int r6 = r6 % r8
            goto L_0x0027
        L_0x00ea:
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00f0
            r2 = 0
        L_0x00f0:
            r9.A01 = r2
        L_0x00f2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173788Rr.A01(int):X.3bo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        if (r3 == false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C71253bo A02(boolean r16) {
        /*
            r15 = this;
            X.6wY r0 = r15.A03
            X.6wY r3 = X.C142046wY.CPU_ACQUIRED
            if (r0 == r3) goto L_0x0087
            X.8Ki r10 = r15.A07
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = X.C172268Ki.A08
        L_0x000a:
            long r11 = r9.get(r10)
            r0 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r0 = r0 & r11
            r2 = 42
            long r0 = r0 >> r2
            int r2 = (int) r0
            if (r2 != 0) goto L_0x0078
            X.7iX r6 = r15.A06
            r5 = 1
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C157577iX.A04
            java.lang.Object r8 = r1.get(r6)
            X.3bo r8 = (X.C71253bo) r8
            r7 = 0
            if (r8 == 0) goto L_0x0035
            X.2J8 r0 = r8.A01
            int r0 = r0.A00
            if (r0 != r5) goto L_0x0035
            boolean r0 = X.AnonymousClass0H6.A00(r6, r8, r7, r1)
            if (r0 == 0) goto L_0x001d
        L_0x0034:
            return r8
        L_0x0035:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A02
            int r9 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A03
            int r4 = r0.get(r6)
        L_0x0041:
            if (r9 == r4) goto L_0x0069
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = X.C157577iX.A01
            int r0 = r3.get(r6)
            if (r0 == 0) goto L_0x0069
            int r4 = r4 + -1
            r2 = r4 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r6.A00
            java.lang.Object r8 = r1.get(r2)
            X.3bo r8 = (X.C71253bo) r8
            if (r8 == 0) goto L_0x0041
            X.2J8 r0 = r8.A01
            int r0 = r0.A00
            if (r0 != r5) goto L_0x0041
            boolean r0 = X.AnonymousClass71W.A00(r8, r7, r1, r2)
            if (r0 == 0) goto L_0x0041
            r3.decrementAndGet(r6)
            return r8
        L_0x0069:
            X.473 r0 = r10.A05
            java.lang.Object r8 = r0.A01()
            X.3bo r8 = (X.C71253bo) r8
            if (r8 != 0) goto L_0x0034
            X.3bo r8 = r15.A01(r5)
            return r8
        L_0x0078:
            r0 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r13 = r11 - r0
            boolean r0 = r9.compareAndSet(r10, r11, r13)
            if (r0 == 0) goto L_0x000a
            r15.A03 = r3
        L_0x0087:
            if (r16 == 0) goto L_0x00c9
            X.8Ki r0 = r15.A07
            int r0 = r0.A00
            int r3 = r0 * 2
            int r2 = r15.A00
            int r0 = r2 << 13
            r2 = r2 ^ r0
            int r0 = r2 >> 17
            r2 = r2 ^ r0
            int r0 = r2 << 5
            r2 = r2 ^ r0
            r15.A00 = r2
            int r1 = r3 + -1
            r0 = r1 & r3
            if (r0 != 0) goto L_0x00ae
            r2 = r2 & r1
        L_0x00a3:
            r3 = 0
            if (r2 != 0) goto L_0x00b4
            r3 = 1
            X.3bo r8 = r15.A00()
            if (r8 == 0) goto L_0x00b4
            return r8
        L_0x00ae:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            int r2 = r2 % r3
            goto L_0x00a3
        L_0x00b4:
            X.7iX r2 = r15.A06
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C157577iX.A04
            r0 = 0
            java.lang.Object r8 = r1.getAndSet(r2, r0)
            X.3bo r8 = (X.C71253bo) r8
            if (r8 != 0) goto L_0x0034
            X.3bo r8 = r2.A00()
            if (r8 != 0) goto L_0x0034
            if (r3 != 0) goto L_0x00d0
        L_0x00c9:
            X.3bo r8 = r15.A00()
            if (r8 == 0) goto L_0x00d0
            return r8
        L_0x00d0:
            r0 = 3
            X.3bo r8 = r15.A01(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173788Rr.A02(boolean):X.3bo");
    }

    public final boolean A04(C142046wY r7) {
        C142046wY r5 = this.A03;
        boolean z = false;
        if (r5 == C142046wY.CPU_ACQUIRED) {
            z = true;
            C172268Ki.A08.addAndGet(this.A07, 4398046511104L);
        }
        if (r5 != r7) {
            this.A03 = r7;
        }
        return z;
    }

    public final void A03(int i) {
        String valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A07.A03);
        A0o.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        setName(AnonymousClass000.A0X(valueOf, A0o));
        this.indexInArray = i;
    }
}
