package X;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: X.8Ki  reason: invalid class name and case insensitive filesystem */
public final class C172268Ki implements Closeable, Executor {
    public static final AtomicIntegerFieldUpdater A07;
    public static final AtomicLongFieldUpdater A08;
    public static final AtomicLongFieldUpdater A09;
    public static final AnonymousClass2XH A0A = new AnonymousClass2XH("NOT_IN_STACK");
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final AnonymousClass7VP A04;
    public final AnonymousClass473 A05;
    public final AnonymousClass473 A06;
    public volatile int _isTerminated;
    public volatile long controlState;
    public volatile long parkedWorkersStack;

    static {
        Class<C172268Ki> cls = C172268Ki.class;
        A09 = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        A08 = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        A07 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01() {
        /*
            r11 = this;
            X.7VP r6 = r11.A04
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = A07     // Catch:{ all -> 0x0069 }
            int r0 = r0.get(r11)     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r6)
            r0 = -1
            return r0
        L_0x000e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = A08     // Catch:{ all -> 0x0069 }
            long r1 = r8.get(r11)     // Catch:{ all -> 0x0069 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r9 = r1 & r3
            int r5 = (int) r9     // Catch:{ all -> 0x0069 }
            r9 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r9
            r0 = 21
            long r1 = r1 >> r0
            int r0 = (int) r1     // Catch:{ all -> 0x0069 }
            int r7 = r5 - r0
            r1 = 0
            if (r7 >= r1) goto L_0x002a
            r7 = 0
        L_0x002a:
            int r0 = r11.A00     // Catch:{ all -> 0x0069 }
            if (r7 >= r0) goto L_0x0067
            int r0 = r11.A01     // Catch:{ all -> 0x0069 }
            if (r5 >= r0) goto L_0x0067
            long r1 = r8.get(r11)     // Catch:{ all -> 0x0069 }
            long r1 = r1 & r3
            int r0 = (int) r1     // Catch:{ all -> 0x0069 }
            int r5 = r0 + 1
            if (r5 <= 0) goto L_0x0059
            java.lang.Object r0 = r6.A00(r5)     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0059
            X.8Rr r2 = new X.8Rr     // Catch:{ all -> 0x0069 }
            r2.<init>(r11, r5)     // Catch:{ all -> 0x0069 }
            r6.A01(r5, r2)     // Catch:{ all -> 0x0069 }
            long r0 = r8.incrementAndGet(r11)     // Catch:{ all -> 0x0069 }
            long r3 = r3 & r0
            int r0 = (int) r3     // Catch:{ all -> 0x0069 }
            if (r5 != r0) goto L_0x0060
            int r0 = r7 + 1
            monitor-exit(r6)
            r2.start()
            return r0
        L_0x0059:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0066
        L_0x0060:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0069 }
        L_0x0066:
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0067:
            monitor-exit(r6)
            return r1
        L_0x0069:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172268Ki.A01():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C173788Rr r10, int r11, int r12) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = A09
        L_0x0002:
            r4 = r9
            long r5 = r3.get(r9)
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r2 = (int) r0
            r7 = 2097152(0x200000, double:1.0361308E-317)
            long r7 = r7 + r5
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r7 = r7 & r0
            if (r2 != r11) goto L_0x0033
            if (r12 != 0) goto L_0x002b
            r1 = r10
        L_0x0019:
            java.lang.Object r1 = r1.nextParkedWorker
            X.2XH r0 = A0A
            if (r1 == r0) goto L_0x0002
            if (r1 != 0) goto L_0x002d
            r2 = 0
        L_0x0022:
            long r0 = (long) r2
            long r7 = r7 | r0
            boolean r0 = r3.compareAndSet(r4, r5, r7)
            if (r0 == 0) goto L_0x0002
            return
        L_0x002b:
            r2 = r12
            goto L_0x0033
        L_0x002d:
            X.8Rr r1 = (X.C173788Rr) r1
            int r2 = r1.indexInArray
            if (r2 == 0) goto L_0x0019
        L_0x0033:
            if (r2 < 0) goto L_0x0002
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172268Ki.A03(X.8Rr, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r6.compareAndSet(r7, r8, ((long) r0) | r3) == false) goto L_0x0002;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r5.nextParkedWorker = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r12 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = A09
        L_0x0002:
            r7 = r12
            long r8 = r6.get(r12)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r1 = (int) r2
            X.7VP r0 = r12.A04
            java.lang.Object r5 = r0.A00(r1)
            X.8Rr r5 = (X.C173788Rr) r5
            if (r5 != 0) goto L_0x0029
            r5 = 0
        L_0x0017:
            r2 = 0
            if (r5 != 0) goto L_0x001b
            return r2
        L_0x001b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = X.C173788Rr.A08
            r0 = -1
            boolean r0 = r1.compareAndSet(r5, r0, r2)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r0 = 1
            return r0
        L_0x0029:
            r3 = 2097152(0x200000, double:1.0361308E-317)
            long r3 = r3 + r8
            r0 = -2097152(0xffffffffffe00000, double:NaN)
            long r3 = r3 & r0
            r2 = r5
        L_0x0032:
            java.lang.Object r2 = r2.nextParkedWorker
            X.2XH r1 = A0A
            if (r2 == r1) goto L_0x0002
            if (r2 != 0) goto L_0x0046
            r0 = 0
        L_0x003b:
            long r10 = (long) r0
            long r10 = r10 | r3
            boolean r0 = r6.compareAndSet(r7, r8, r10)
            if (r0 == 0) goto L_0x0002
            r5.nextParkedWorker = r1
            goto L_0x0017
        L_0x0046:
            X.8Rr r2 = (X.C173788Rr) r2
            int r0 = r2.indexInArray
            if (r0 == 0) goto L_0x0032
            if (r0 < 0) goto L_0x0002
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172268Ki.A04():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r4.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r0 = r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r12 = this;
            r2 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = A07
            r0 = 0
            r8 = 1
            boolean r0 = r1.compareAndSet(r12, r0, r8)
            if (r0 == 0) goto L_0x00a2
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            boolean r0 = r1 instanceof X.C173788Rr
            r7 = 0
            if (r0 == 0) goto L_0x0022
            X.8Rr r1 = (X.C173788Rr) r1
            if (r1 == 0) goto L_0x0022
            X.8Ki r0 = r1.A07
            boolean r0 = X.C162457s7.A0P(r0, r12)
            if (r0 == 0) goto L_0x0022
            r7 = r1
        L_0x0022:
            X.7VP r9 = r12.A04
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = A08     // Catch:{ all -> 0x009f }
            long r0 = r6.get(r12)     // Catch:{ all -> 0x009f }
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r4
            int r10 = (int) r0
            monitor-exit(r9)
            if (r8 > r10) goto L_0x0067
            r11 = 1
        L_0x0034:
            java.lang.Object r1 = r9.A00(r11)
            X.C162457s7.A0H(r1)
            X.8Rr r1 = (X.C173788Rr) r1
            if (r1 == r7) goto L_0x0062
        L_0x003f:
            boolean r0 = r1.isAlive()
            if (r0 == 0) goto L_0x004c
            java.util.concurrent.locks.LockSupport.unpark(r1)
            r1.join(r2)
            goto L_0x003f
        L_0x004c:
            X.7iX r5 = r1.A06
            X.473 r4 = r12.A05
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C157577iX.A04
            r0 = 0
            java.lang.Object r0 = r1.getAndSet(r5, r0)
            if (r0 == 0) goto L_0x005c
        L_0x0059:
            r4.A03(r0)
        L_0x005c:
            X.3bo r0 = r5.A00()
            if (r0 != 0) goto L_0x0059
        L_0x0062:
            if (r11 == r10) goto L_0x0067
            int r11 = r11 + 1
            goto L_0x0034
        L_0x0067:
            X.473 r2 = r12.A05
            r2.A02()
            X.473 r1 = r12.A06
            r1.A02()
        L_0x0071:
            if (r7 == 0) goto L_0x0079
            X.3bo r0 = r7.A02(r8)
            if (r0 != 0) goto L_0x009b
        L_0x0079:
            java.lang.Object r0 = r1.A01()
            X.3bo r0 = (X.C71253bo) r0
            if (r0 != 0) goto L_0x009b
            java.lang.Object r0 = r2.A01()
            X.3bo r0 = (X.C71253bo) r0
            if (r0 != 0) goto L_0x009b
            if (r7 == 0) goto L_0x0090
            X.6wY r0 = X.C142046wY.TERMINATED
            r7.A04(r0)
        L_0x0090:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = A09
            r0 = 0
            r2.set(r12, r0)
            r6.set(r12, r0)
            return
        L_0x009b:
            A00(r0)
            goto L_0x0071
        L_0x009f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172268Ki.close():void");
    }

    public void execute(Runnable runnable) {
        A02(runnable, AnonymousClass2CC.A07, false);
    }

    public C172268Ki(int i, int i2, String str, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = str;
        boolean z = true;
        if (i >= 1) {
            if (!(i2 < i ? false : z)) {
                throw AnonymousClass000.A0G(" should be greater than or equals to core pool size ", C18270x1.A0W(i2, "Max pool size "), i);
            } else if (i2 > 2097150) {
                throw AnonymousClass000.A0F(" should not exceed maximal supported number of threads 2097150", C18270x1.A0W(i2, "Max pool size "));
            } else if (j > 0) {
                this.A06 = new AnonymousClass473();
                this.A05 = new AnonymousClass473();
                this.A04 = new AnonymousClass7VP((i + 1) * 2);
                this.controlState = ((long) i) << 42;
                this._isTerminated = 0;
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Idle worker keep alive time ");
                A0o.append(j);
                throw AnonymousClass000.A0F(" must be positive", A0o);
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Core pool size ");
            A0o2.append(i);
            throw AnonymousClass000.A0F(" should be at least 1", A0o2);
        }
    }

    public static final void A00(C71253bo r2) {
        try {
            r2.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Runnable r11, X.AnonymousClass2J8 r12, boolean r13) {
        /*
            r10 = this;
            long r0 = java.lang.System.nanoTime()
            boolean r2 = r11 instanceof X.C71253bo
            if (r2 == 0) goto L_0x00e5
            X.3bo r11 = (X.C71253bo) r11
            r11.A00 = r0
            r11.A01 = r12
        L_0x000e:
            X.2J8 r0 = r11.A01
            int r1 = r0.A00
            r9 = 0
            r0 = 1
            if (r1 != r0) goto L_0x00e0
            r8 = 1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = A08
            r0 = 2097152(0x200000, double:1.0361308E-317)
            long r1 = r2.addAndGet(r10, r0)
        L_0x0020:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            boolean r0 = r3 instanceof X.C173788Rr
            r6 = 0
            if (r0 == 0) goto L_0x0046
            X.8Rr r3 = (X.C173788Rr) r3
            if (r3 == 0) goto L_0x0046
            X.8Ki r0 = r3.A07
            boolean r0 = X.C162457s7.A0P(r0, r10)
            if (r0 == 0) goto L_0x0046
            r6 = r3
            X.6wY r3 = r3.A03
            X.6wY r0 = X.C142046wY.TERMINATED
            if (r3 == r0) goto L_0x0046
            X.2J8 r0 = r11.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x006d
            X.6wY r0 = X.C142046wY.BLOCKING
            if (r3 != r0) goto L_0x006d
        L_0x0046:
            X.2J8 r0 = r11.A01
            int r3 = r0.A00
            r0 = 1
            if (r3 != r0) goto L_0x006a
            X.473 r0 = r10.A05
        L_0x004f:
            boolean r0 = r0.A03(r11)
            if (r0 != 0) goto L_0x00da
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r10.A03
            r1.append(r0)
            java.lang.String r0 = " was terminated"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            r0.<init>(r1)
            throw r0
        L_0x006a:
            X.473 r0 = r10.A06
            goto L_0x004f
        L_0x006d:
            r0 = 1
            r6.A04 = r0
            X.7iX r5 = r6.A06
            if (r13 != 0) goto L_0x00a5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C157577iX.A04
            java.lang.Object r11 = r0.getAndSet(r5, r11)
            X.3bo r11 = (X.C71253bo) r11
            if (r11 != 0) goto L_0x00a5
        L_0x007e:
            if (r8 == 0) goto L_0x0092
            if (r9 != 0) goto L_0x0091
            boolean r0 = r10.A04()
            if (r0 != 0) goto L_0x0091
            boolean r0 = r10.A05(r1)
        L_0x008c:
            if (r0 != 0) goto L_0x0091
            r10.A04()
        L_0x0091:
            return
        L_0x0092:
            if (r9 != 0) goto L_0x0091
            boolean r0 = r10.A04()
            if (r0 != 0) goto L_0x0091
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A08
            long r0 = r0.get(r10)
            boolean r0 = r10.A05(r0)
            goto L_0x008c
        L_0x00a5:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = X.C157577iX.A03
            int r3 = r7.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A02
            int r0 = r0.get(r5)
            int r3 = r3 - r0
            r0 = 127(0x7f, float:1.78E-43)
            if (r3 == r0) goto L_0x0046
            X.2J8 r0 = r11.A01
            int r3 = r0.A00
            r0 = 1
            if (r3 != r0) goto L_0x00c2
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C157577iX.A01
            r0.incrementAndGet(r5)
        L_0x00c2:
            int r0 = r7.get(r5)
            r4 = r0 & 127(0x7f, float:1.78E-43)
        L_0x00c8:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.A00
            java.lang.Object r0 = r3.get(r4)
            if (r0 == 0) goto L_0x00d4
            java.lang.Thread.yield()
            goto L_0x00c8
        L_0x00d4:
            r3.lazySet(r4, r11)
            r7.incrementAndGet(r5)
        L_0x00da:
            if (r13 == 0) goto L_0x007e
            if (r6 == 0) goto L_0x007e
            r9 = 1
            goto L_0x007e
        L_0x00e0:
            r8 = 0
            r1 = 0
            goto L_0x0020
        L_0x00e5:
            X.47A r2 = new X.47A
            r2.<init>(r11, r12, r0)
            r11 = r2
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172268Ki.A02(java.lang.Runnable, X.2J8, boolean):void");
    }

    public final boolean A05(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.A00;
        if (i < i2) {
            int A012 = A01();
            if (A012 == 1) {
                if (i2 > 1) {
                    A01();
                }
                return true;
            } else if (A012 > 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        char c;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass7VP r11 = this.A04;
        int length = r11.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C173788Rr r3 = (C173788Rr) r11.A00(i6);
            if (r3 != null) {
                C157577iX r13 = r3.A06;
                Object obj = C157577iX.A04.get(r13);
                int i7 = C157577iX.A03.get(r13) - C157577iX.A02.get(r13);
                if (obj != null) {
                    i7++;
                }
                int ordinal = r3.A03.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 1) {
                        i2++;
                        sb = C18320x8.A0j(i7);
                        c = 'b';
                    } else if (ordinal == 0) {
                        i++;
                        sb = C18320x8.A0j(i7);
                        c = 'c';
                    } else if (ordinal == 3) {
                        i4++;
                        if (i7 > 0) {
                            sb = C18320x8.A0j(i7);
                            c = 'd';
                        }
                    } else if (ordinal == 4) {
                        i5++;
                    }
                    sb.append(c);
                    AnonymousClass0x7.A1D(sb, A0s);
                } else {
                    i3++;
                }
            }
        }
        long j = A08.get(this);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A03);
        C18270x1.A18(this, A0o, '@');
        A0o.append("[Pool Size {core = ");
        int i8 = this.A00;
        A0o.append(i8);
        A0o.append(", max = ");
        A0o.append(this.A01);
        A0o.append("}, Worker States {CPU = ");
        A0o.append(i);
        A0o.append(", blocking = ");
        A0o.append(i2);
        A0o.append(", parked = ");
        A0o.append(i3);
        A0o.append(", dormant = ");
        A0o.append(i4);
        A0o.append(", terminated = ");
        A0o.append(i5);
        A0o.append("}, running workers queues = ");
        A0o.append(A0s);
        A0o.append(", global CPU queue size = ");
        A0o.append(this.A06.A00());
        A0o.append(", global blocking queue size = ");
        A0o.append(this.A05.A00());
        A0o.append(", Control State {created workers= ");
        A0o.append((int) (2097151 & j));
        A0o.append(", blocking tasks = ");
        A0o.append((int) ((4398044413952L & j) >> 21));
        A0o.append(", CPUs acquired = ");
        A0o.append(i8 - ((int) ((9223367638808264704L & j) >> 42)));
        return AnonymousClass000.A0X("}]", A0o);
    }
}
