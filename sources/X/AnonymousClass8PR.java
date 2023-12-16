package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.8PR  reason: invalid class name */
public class AnonymousClass8PR implements C85504Gn {
    public static final AtomicLongFieldUpdater A01;
    public static final AtomicLongFieldUpdater A02;
    public static final AtomicLongFieldUpdater A03;
    public static final AtomicLongFieldUpdater A04;
    public static final AtomicReferenceFieldUpdater A05;
    public static final AtomicReferenceFieldUpdater A06;
    public static final AtomicReferenceFieldUpdater A07;
    public static final AtomicReferenceFieldUpdater A08;
    public static final AtomicReferenceFieldUpdater A09;
    public final int A00;
    public volatile Object _closeCause;
    public volatile long bufferEnd;
    public volatile Object bufferEndSegment;
    public volatile Object closeHandler;
    public volatile long completedExpandBuffersAndPauseFlag;
    public volatile Object receiveSegment;
    public volatile long receivers;
    public volatile Object sendSegment;
    public volatile long sendersAndCloseStatus;

    public AnonymousClass8PR(int i) {
        long j;
        this.A00 = i;
        if (i >= 0) {
            if (i == 0) {
                j = 0;
            } else if (i != Integer.MAX_VALUE) {
                j = (long) i;
            } else {
                j = Long.MAX_VALUE;
            }
            this.bufferEnd = j;
            this.completedExpandBuffersAndPauseFlag = A01.get(this);
            C175768Zq r1 = new C175768Zq(this, (C175768Zq) null, 3, 0);
            this.sendSegment = r1;
            this.receiveSegment = r1;
            if (A0G()) {
                r1 = C1462879o.A02;
                C162457s7.A0K(r1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = r1;
            this._closeCause = C1462879o.A0C;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Invalid channel capacity: ");
        A0o.append(i);
        throw AnonymousClass000.A0F(", should be >=0", A0o);
    }

    public boolean A0L(Throwable th, boolean z) {
        long j;
        long j2;
        int i;
        Object obj;
        AnonymousClass2XH r0;
        long j3;
        long j4;
        if (z) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            do {
                j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (((long) 1) << 60) + (1152921504606846975L & j4)));
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        boolean A002 = AnonymousClass0H6.A00(this, C1462879o.A0C, th, atomicReferenceFieldUpdater);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        if (z) {
            do {
                j3 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, (((long) 3) << 60) + (1152921504606846975L & j3)));
        } else {
            do {
                j = atomicLongFieldUpdater2.get(this);
                int i2 = (int) (j >> 60);
                if (i2 != 0) {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    i = 3;
                } else {
                    j2 = j & 1152921504606846975L;
                    i = 2;
                }
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j, (((long) i) << 60) + j2));
        }
        BHE();
        if (A002) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A07;
            do {
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    r0 = C1462879o.A05;
                } else {
                    r0 = C1462879o.A06;
                }
            } while (!AnonymousClass0H6.A00(this, obj, r0, atomicReferenceFieldUpdater2));
            if (obj != null) {
                AnonymousClass360.A03(obj, 1);
                ((AnonymousClass4GQ) obj).invoke(atomicReferenceFieldUpdater.get(this));
            }
        }
        return A002;
    }

    public boolean Az4(Throwable th) {
        return A0L(th, false);
    }

    static {
        Class<AnonymousClass8PR> cls = AnonymousClass8PR.class;
        A04 = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        A03 = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        A01 = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        A02 = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        A09 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        A08 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        A06 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        A05 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        A07 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(X.C84814Du r18, X.AnonymousClass8PR r19) {
        /*
            r3 = r18
            boolean r0 = r3 instanceof X.AnonymousClass8UM
            r8 = r19
            if (r0 == 0) goto L_0x008f
            r15 = r3
            X.8UM r15 = (X.AnonymousClass8UM) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008f
            int r2 = r2 - r1
            r15.label = r2
        L_0x0016:
            java.lang.Object r1 = r15.result
            X.218 r6 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r15.label
            r5 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r5) goto L_0x0095
            X.C57682u2.A01(r1)
            X.2yc r1 = (X.C60472yc) r1
            java.lang.Object r1 = r1.A00
        L_0x0028:
            return r1
        L_0x0029:
            X.C57682u2.A01(r1)
            r9 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            java.lang.Object r4 = r0.get(r8)
            X.8Zq r4 = (X.C175768Zq) r4
        L_0x0035:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r0 = r0.get(r8)
            boolean r0 = r8.A0I(r0, r5)
            if (r0 == 0) goto L_0x0046
            X.46k r1 = X.AnonymousClass6C9.A0m(r8)
            return r1
        L_0x0046:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r12 = r0.getAndIncrement(r8)
            int r0 = X.C1462879o.A01
            long r2 = (long) r0
            long r0 = r12 / r2
            long r2 = r12 % r2
            int r11 = (int) r2
            long r2 = r4.A00
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0061
            X.8Zq r10 = r8.A08(r4, r0)
            if (r10 != 0) goto L_0x0062
            goto L_0x0035
        L_0x0061:
            r10 = r4
        L_0x0062:
            java.lang.Object r1 = r8.A04(r9, r10, r11, r12)
            X.2XH r0 = X.C1462879o.A0H
            if (r1 == r0) goto L_0x009e
            X.2XH r0 = X.C1462879o.A08
            if (r1 != r0) goto L_0x007b
            long r1 = r8.A03()
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
            r10.A01()
        L_0x0079:
            r4 = r10
            goto L_0x0035
        L_0x007b:
            X.2XH r0 = X.C1462879o.A0I
            if (r1 != r0) goto L_0x009a
            r15.label = r5
            r14 = r8
            r16 = r10
            r17 = r11
            r18 = r12
            java.lang.Object r1 = r14.A05(r15, r16, r17, r18)
            if (r1 != r6) goto L_0x0028
            return r6
        L_0x008f:
            X.8UM r15 = new X.8UM
            r15.<init>(r3, r8)
            goto L_0x0016
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x009a:
            r10.A01()
            return r1
        L_0x009e:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A00(X.4Du, X.8PR):java.lang.Object");
    }

    public static final /* synthetic */ void A01(AnonymousClass8PR r10, AnonymousClass466 r11) {
        AnonymousClass8PR r5 = r10;
        C175768Zq r7 = (C175768Zq) A08.get(r10);
        while (true) {
            AnonymousClass466 r6 = r11;
            if (r5.A0I(A04.get(r5), true)) {
                r11.A02 = C1462879o.A04;
                return;
            }
            long andIncrement = A03.getAndIncrement(r5);
            long j = (long) C1462879o.A01;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (r7.A00 != j2) {
                C175768Zq A082 = r5.A08(r7, j2);
                if (A082 != null) {
                    r7 = A082;
                } else {
                    continue;
                }
            }
            Object A042 = r5.A04(r6, r7, i, andIncrement);
            if (A042 == C1462879o.A0H) {
                if ((r11 instanceof C183558qE) && r11 != null) {
                    r11.BGt(r7, i);
                    return;
                }
                return;
            } else if (A042 == C1462879o.A08) {
                if (andIncrement < r5.A03()) {
                    r7.A01();
                }
            } else if (A042 != C1462879o.A0I) {
                r7.A01();
                r11.A02 = A042;
                return;
            } else {
                throw AnonymousClass001.A0e("unexpected");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r11 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        r0 = r12.A08(r13, (java.lang.Object) null, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(java.lang.Object r10, java.lang.Object r11, X.C175768Zq r12, int r13, long r14, boolean r16) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r12.A00
            int r1 = r13 * 2
            r3.lazySet(r1, r10)
            if (r16 != 0) goto L_0x0047
            int r4 = r1 + 1
            java.lang.Object r5 = r3.get(r4)
            r2 = 1
            if (r5 != 0) goto L_0x0029
            boolean r0 = r9.A0H(r14)
            r4 = 0
            if (r0 == 0) goto L_0x0022
            X.2XH r0 = X.C1462879o.A03
            boolean r0 = r12.A08(r13, r4, r0)
            if (r0 == 0) goto L_0x0047
            return r2
        L_0x0022:
            if (r11 == 0) goto L_0x009c
            boolean r0 = r12.A08(r13, r4, r11)
            goto L_0x006c
        L_0x0029:
            boolean r0 = r5 instanceof X.C183558qE
            if (r0 == 0) goto L_0x0047
            r0 = 0
            r3.lazySet(r1, r0)
            boolean r0 = r9.A0J(r5, r10)
            if (r0 == 0) goto L_0x003e
            X.2XH r0 = X.C1462879o.A07
            r3.set(r4, r0)
            r8 = 0
            return r8
        L_0x003e:
            X.2XH r1 = X.C1462879o.A09
            java.lang.Object r0 = r3.getAndSet(r4, r1)
            if (r0 == r1) goto L_0x00c3
            goto L_0x00c0
        L_0x0047:
            int r4 = r1 + 1
            java.lang.Object r6 = r3.get(r4)
            r8 = 0
            r2 = 1
            if (r6 != 0) goto L_0x0070
            boolean r0 = r9.A0H(r14)
            r2 = 0
            if (r0 == 0) goto L_0x0064
            if (r16 != 0) goto L_0x008f
            X.2XH r0 = X.C1462879o.A03
            boolean r0 = r12.A08(r13, r2, r0)
        L_0x0060:
            if (r0 == 0) goto L_0x0047
            r8 = 1
            return r8
        L_0x0064:
            if (r16 != 0) goto L_0x008f
            if (r11 == 0) goto L_0x009c
            boolean r0 = r12.A08(r13, r2, r11)
        L_0x006c:
            if (r0 == 0) goto L_0x0047
            r8 = 2
            return r8
        L_0x0070:
            X.2XH r0 = X.C1462879o.A0B
            if (r6 != r0) goto L_0x007b
            X.2XH r0 = X.C1462879o.A03
            boolean r0 = r12.A08(r13, r6, r0)
            goto L_0x0060
        L_0x007b:
            X.2XH r7 = X.C1462879o.A09
            if (r6 == r7) goto L_0x00b5
            X.2XH r0 = X.C1462879o.A0E
            if (r6 == r0) goto L_0x00b5
            X.2XH r5 = X.C1462879o.A04
            r0 = 0
            if (r6 != r5) goto L_0x009e
            r3.lazySet(r1, r0)
            r9.BHE()
            goto L_0x009a
        L_0x008f:
            X.2XH r0 = X.C1462879o.A0A
            boolean r0 = r12.A08(r13, r2, r0)
            if (r0 == 0) goto L_0x0047
            r12.A04()
        L_0x009a:
            r8 = 4
            return r8
        L_0x009c:
            r8 = 3
            return r8
        L_0x009e:
            r3.lazySet(r1, r0)
            boolean r0 = r6 instanceof X.C150667Rs
            if (r0 == 0) goto L_0x00a9
            X.7Rs r6 = (X.C150667Rs) r6
            X.8qE r6 = r6.A00
        L_0x00a9:
            boolean r0 = r9.A0J(r6, r10)
            if (r0 == 0) goto L_0x00ba
            X.2XH r0 = X.C1462879o.A07
            r3.set(r4, r0)
            return r8
        L_0x00b5:
            r0 = 0
            r3.lazySet(r1, r0)
            goto L_0x00c3
        L_0x00ba:
            java.lang.Object r0 = r3.getAndSet(r4, r7)
            if (r0 == r7) goto L_0x00c3
        L_0x00c0:
            r12.A07(r13, r2)
        L_0x00c3:
            r8 = 5
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A02(java.lang.Object, java.lang.Object, X.8Zq, int, long, boolean):int");
    }

    public final long A03() {
        return A04.get(this) & 1152921504606846975L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r10 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        r0 = r11.A08(r12, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        if (r1 != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        A0A();
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b7 A[EDGE_INSN: B:54:0x00b7->B:47:0x00b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7 A[EDGE_INSN: B:58:0x00a7->B:43:0x00a7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.lang.Object r10, X.C175768Zq r11, int r12, long r13) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r11.A00
            int r2 = r12 * 2
            int r4 = r2 + 1
            java.lang.Object r5 = r3.get(r4)
            if (r5 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r6 = r0.get(r9)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r6 = r6 & r0
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
            if (r10 == 0) goto L_0x00bd
            boolean r0 = r11.A08(r12, r5, r10)
        L_0x0022:
            if (r0 == 0) goto L_0x0042
            r9.A0A()
            X.2XH r1 = X.C1462879o.A0H
            return r1
        L_0x002a:
            X.2XH r0 = X.C1462879o.A03
            if (r5 != r0) goto L_0x0042
            X.2XH r0 = X.C1462879o.A07
            boolean r0 = r11.A08(r12, r5, r0)
        L_0x0034:
            if (r0 == 0) goto L_0x0042
            r9.A0A()
            java.lang.Object r1 = r3.get(r2)
            r0 = 0
            r3.lazySet(r2, r0)
            return r1
        L_0x0042:
            java.lang.Object r6 = r3.get(r4)
            if (r6 == 0) goto L_0x008e
            X.2XH r0 = X.C1462879o.A0B
            if (r6 == r0) goto L_0x008e
            X.2XH r0 = X.C1462879o.A03
            if (r6 != r0) goto L_0x0057
            X.2XH r0 = X.C1462879o.A07
            boolean r0 = r11.A08(r12, r6, r0)
            goto L_0x0034
        L_0x0057:
            X.2XH r5 = X.C1462879o.A0A
            if (r6 == r5) goto L_0x00ba
            X.2XH r0 = X.C1462879o.A0E
            if (r6 == r0) goto L_0x00ba
            X.2XH r0 = X.C1462879o.A04
            if (r6 == r0) goto L_0x00b7
            X.2XH r0 = X.C1462879o.A0F
            if (r6 == r0) goto L_0x0042
            X.2XH r0 = X.C1462879o.A0G
            boolean r0 = r11.A08(r12, r6, r0)
            if (r0 == 0) goto L_0x0042
            boolean r1 = r6 instanceof X.C150667Rs
            if (r1 == 0) goto L_0x0077
            X.7Rs r6 = (X.C150667Rs) r6
            X.8qE r6 = r6.A00
        L_0x0077:
            boolean r0 = r9.A0K(r6, r11, r12)
            if (r0 == 0) goto L_0x00af
            X.2XH r0 = X.C1462879o.A07
            r3.set(r4, r0)
            r9.A0A()
            java.lang.Object r1 = r3.get(r2)
            r0 = 0
            r3.lazySet(r2, r0)
            return r1
        L_0x008e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            long r7 = r0.get(r9)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r7 & r0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a7
            X.2XH r0 = X.C1462879o.A0E
            boolean r0 = r11.A08(r12, r6, r0)
            if (r0 == 0) goto L_0x0042
            goto L_0x00b7
        L_0x00a7:
            if (r10 == 0) goto L_0x00bd
            boolean r0 = r11.A08(r12, r6, r10)
            goto L_0x0022
        L_0x00af:
            r3.set(r4, r5)
            r11.A04()
            if (r1 == 0) goto L_0x00ba
        L_0x00b7:
            r9.A0A()
        L_0x00ba:
            X.2XH r1 = X.C1462879o.A08
            return r1
        L_0x00bd:
            X.2XH r1 = X.C1462879o.A0I
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A04(java.lang.Object, X.8Zq, int, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        if (r1 == X.C1462879o.A0I) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r12.A01();
        r0 = new X.C60472yc(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e2, code lost:
        throw X.AnonymousClass001.A0e("unexpected");
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C84814Du r11, X.C175768Zq r12, int r13, long r14) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C174388Ub
            if (r0 == 0) goto L_0x00d0
            r3 = r11
            X.8Ub r3 = (X.C174388Ub) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r2 = r3.result
            X.218 r7 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r1 = r3.label
            r0 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r0) goto L_0x00d7
            X.C57682u2.A01(r2)
        L_0x0020:
            X.2yc r2 = (X.C60472yc) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x0025:
            X.C57682u2.A01(r2)
            r3.L$0 = r10
            r3.L$1 = r12
            r3.I$0 = r13
            r3.J$0 = r14
            r3.label = r0
            X.4Du r0 = X.C57702u4.A01(r3)
            X.46G r4 = X.AnonymousClass2AF.A00(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>"
            X.C162457s7.A0K(r4, r0)     // Catch:{ all -> 0x00e3 }
            X.8PP r11 = new X.8PP     // Catch:{ all -> 0x00e3 }
            r11.<init>(r4)     // Catch:{ all -> 0x00e3 }
            java.lang.Object r1 = r10.A04(r11, r12, r13, r14)     // Catch:{ all -> 0x00e3 }
            X.2XH r6 = X.C1462879o.A0H     // Catch:{ all -> 0x00e3 }
            if (r1 == r6) goto L_0x00c6
            X.2XH r5 = X.C1462879o.A08     // Catch:{ all -> 0x00e3 }
            r8 = 0
            if (r1 != r5) goto L_0x00ad
            long r1 = r10.A03()     // Catch:{ all -> 0x00e3 }
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            r12.A01()     // Catch:{ all -> 0x00e3 }
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08     // Catch:{ all -> 0x00e3 }
            java.lang.Object r12 = r0.get(r10)     // Catch:{ all -> 0x00e3 }
            X.8Zq r12 = (X.C175768Zq) r12     // Catch:{ all -> 0x00e3 }
        L_0x0064:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04     // Catch:{ all -> 0x00e3 }
            long r0 = r0.get(r10)     // Catch:{ all -> 0x00e3 }
            r2 = 1
            boolean r0 = r10.A0I(r0, r2)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x007e
            X.46k r1 = X.AnonymousClass6C9.A0m(r10)     // Catch:{ all -> 0x00e3 }
            X.2yc r0 = new X.2yc     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e3 }
            r4.BkD(r0)     // Catch:{ all -> 0x00e3 }
            goto L_0x00c9
        L_0x007e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03     // Catch:{ all -> 0x00e3 }
            long r14 = r0.getAndIncrement(r10)     // Catch:{ all -> 0x00e3 }
            int r0 = X.C1462879o.A01     // Catch:{ all -> 0x00e3 }
            long r2 = (long) r0     // Catch:{ all -> 0x00e3 }
            long r0 = r14 / r2
            long r2 = r14 % r2
            int r13 = (int) r2     // Catch:{ all -> 0x00e3 }
            long r2 = r12.A00     // Catch:{ all -> 0x00e3 }
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0099
            X.8Zq r0 = r10.A08(r12, r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x0064
            r12 = r0
        L_0x0099:
            java.lang.Object r1 = r10.A04(r11, r12, r13, r14)     // Catch:{ all -> 0x00e3 }
            if (r1 == r6) goto L_0x00c6
            if (r1 != r5) goto L_0x00b6
            long r1 = r10.A03()     // Catch:{ all -> 0x00e3 }
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            r12.A01()     // Catch:{ all -> 0x00e3 }
            goto L_0x0064
        L_0x00ad:
            r12.A01()     // Catch:{ all -> 0x00e3 }
            X.2yc r0 = new X.2yc     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e3 }
            goto L_0x00c2
        L_0x00b6:
            X.2XH r0 = X.C1462879o.A0I     // Catch:{ all -> 0x00e3 }
            if (r1 == r0) goto L_0x00dc
            r12.A01()     // Catch:{ all -> 0x00e3 }
            X.2yc r0 = new X.2yc     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e3 }
        L_0x00c2:
            r4.BkA(r8, r0)     // Catch:{ all -> 0x00e3 }
            goto L_0x00c9
        L_0x00c6:
            r11.BGt(r12, r13)     // Catch:{ all -> 0x00e3 }
        L_0x00c9:
            java.lang.Object r2 = r4.A06()
            if (r2 != r7) goto L_0x0020
            return r7
        L_0x00d0:
            X.8Ub r3 = new X.8Ub
            r3.<init>(r11, r10)
            goto L_0x0012
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x00dc:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            r4.A0C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A05(X.4Du, X.8Zq, int, long):java.lang.Object");
    }

    public final Throwable A06() {
        Throwable th = (Throwable) A05.get(this);
        if (th == null) {
            return new C144006zq();
        }
        return th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a7, code lost:
        if (r6 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r8.A07(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        if ((r6 instanceof java.util.ArrayList) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b4, code lost:
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        r0 = X.AnonymousClass002.A0I(4);
        r0.add(r6);
        r0.add(r1);
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0118, code lost:
        r0 = (X.C175768Zq) ((X.C158747kU) X.C158747kU.A01.get(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C175768Zq A07(long r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A06
            java.lang.Object r5 = r0.get(r11)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            java.lang.Object r6 = r0.get(r11)
            X.8Zq r6 = (X.C175768Zq) r6
            long r3 = r6.A00
            r0 = r5
            X.8Zr r0 = (X.C175778Zr) r0
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r5 = r6
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            java.lang.Object r6 = r0.get(r11)
            X.8Zq r6 = (X.C175768Zq) r6
            long r3 = r6.A00
            r0 = r5
            X.8Zr r0 = (X.C175778Zr) r0
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            r5 = r6
        L_0x002e:
            X.7kU r5 = (X.C158747kU) r5
        L_0x0030:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.C158747kU.A00
            java.lang.Object r0 = r2.get(r5)
            X.2XH r1 = X.C155217eT.A00
            if (r0 == r1) goto L_0x0045
            X.7kU r0 = (X.C158747kU) r0
            if (r0 != 0) goto L_0x0126
            r0 = 0
            boolean r0 = X.AnonymousClass0H6.A00(r5, r0, r1, r2)
            if (r0 == 0) goto L_0x0030
        L_0x0045:
            X.8Zq r5 = (X.C175768Zq) r5
            r1 = r11
            boolean r0 = r11 instanceof X.C175748Zo
            if (r0 == 0) goto L_0x0071
            X.8Zo r1 = (X.C175748Zo) r1
            X.20l r1 = r1.A00
            X.20l r0 = X.C369720l.DROP_OLDEST
            boolean r0 = X.AnonymousClass000.A1Y(r1, r0)
            if (r0 == 0) goto L_0x0071
            r0 = r5
        L_0x0059:
            int r7 = X.C1462879o.A01
            r6 = r7
        L_0x005c:
            int r7 = r7 + -1
            r1 = -1
            if (r1 >= r7) goto L_0x0118
            long r1 = r0.A00
            long r3 = (long) r6
            long r1 = r1 * r3
            long r3 = (long) r7
            long r1 = r1 + r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = A03
            long r8 = r3.get(r11)
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ec
        L_0x0071:
            r8 = r5
            r7 = 1
            r6 = 0
        L_0x0074:
            r4 = -1
            if (r8 == 0) goto L_0x0129
            int r10 = X.C1462879o.A01
            int r9 = r10 - r7
        L_0x007b:
            if (r4 >= r9) goto L_0x00e1
            long r2 = r8.A00
            long r0 = (long) r10
            long r2 = r2 * r0
            long r0 = (long) r9
            long r2 = r2 + r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0129
        L_0x0087:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r8.A00
            int r0 = r9 * 2
            int r0 = r0 + 1
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x00d5
            X.2XH r0 = X.C1462879o.A0B
            if (r1 == r0) goto L_0x00d5
            boolean r0 = r1 instanceof X.C150667Rs
            if (r0 == 0) goto L_0x00c8
            X.2XH r0 = X.C1462879o.A04
            boolean r0 = r8.A08(r9, r1, r0)
            if (r0 == 0) goto L_0x0087
            X.7Rs r1 = (X.C150667Rs) r1
            X.8qE r1 = r1.A00
        L_0x00a7:
            if (r6 != 0) goto L_0x00b0
            r6 = r1
        L_0x00aa:
            r8.A07(r9, r7)
        L_0x00ad:
            int r9 = r9 + -1
            goto L_0x007b
        L_0x00b0:
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00bb
            r0 = r6
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L_0x00aa
        L_0x00bb:
            r0 = 4
            java.util.ArrayList r0 = X.AnonymousClass002.A0I(r0)
            r0.add(r6)
            r0.add(r1)
            r6 = r0
            goto L_0x00aa
        L_0x00c8:
            boolean r0 = r1 instanceof X.C183558qE
            if (r0 == 0) goto L_0x00ad
            X.2XH r0 = X.C1462879o.A04
            boolean r0 = r8.A08(r9, r1, r0)
            if (r0 == 0) goto L_0x0087
            goto L_0x00a7
        L_0x00d5:
            X.2XH r0 = X.C1462879o.A04
            boolean r0 = r8.A08(r9, r1, r0)
            if (r0 == 0) goto L_0x0087
            r8.A04()
            goto L_0x00ad
        L_0x00e1:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C158747kU.A01
            java.lang.Object r8 = r0.get(r8)
            X.7kU r8 = (X.C158747kU) r8
            X.8Zq r8 = (X.C175768Zq) r8
            goto L_0x0074
        L_0x00ec:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r0.A00
            int r3 = r7 * 2
            int r3 = r3 + 1
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x010b
            X.2XH r3 = X.C1462879o.A0B
            if (r4 == r3) goto L_0x010b
            X.2XH r3 = X.C1462879o.A03
            if (r4 != r3) goto L_0x005c
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            r11.A0B(r1)
            goto L_0x0071
        L_0x010b:
            X.2XH r3 = X.C1462879o.A04
            boolean r3 = r0.A08(r7, r4, r3)
            if (r3 == 0) goto L_0x00ec
            r0.A04()
            goto L_0x005c
        L_0x0118:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C158747kU.A01
            java.lang.Object r0 = r1.get(r0)
            X.7kU r0 = (X.C158747kU) r0
            X.8Zq r0 = (X.C175768Zq) r0
            if (r0 != 0) goto L_0x0059
            goto L_0x0071
        L_0x0126:
            r5 = r0
            goto L_0x0030
        L_0x0129:
            if (r6 == 0) goto L_0x0134
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x0135
            X.8qE r6 = (X.C183558qE) r6
            r11.A0E(r6, r7)
        L_0x0134:
            return r5
        L_0x0135:
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            int r1 = r6.size()
            int r1 = r1 - r7
        L_0x013c:
            if (r4 >= r1) goto L_0x0134
            java.lang.Object r0 = r6.get(r1)
            X.8qE r0 = (X.C183558qE) r0
            r11.A0E(r0, r7)
            int r1 = r1 + -1
            goto L_0x013c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A07(long):X.8Zq");
    }

    public final C175768Zq A08(C175768Zq r20, long j) {
        Object A002;
        boolean A1Y;
        long j2;
        long j3;
        C175768Zq r5 = r20;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A08;
        C174508Uu r10 = C174508Uu.A00;
        loop0:
        while (true) {
            A002 = C155217eT.A00(r10, r5, j);
            A1Y = AnonymousClass000.A1Y(A002, C155217eT.A00);
            if (A1Y) {
                break;
            }
            C175778Zr A003 = C1453675f.A00(A002);
            while (true) {
                C175778Zr r8 = (C175778Zr) atomicReferenceFieldUpdater.get(this);
                if (r8.A00 >= A003.A00) {
                    break loop0;
                } else if (A003.A06()) {
                    if (AnonymousClass0H6.A00(this, r8, A003, atomicReferenceFieldUpdater)) {
                        AnonymousClass6C7.A1R(r8);
                        break loop0;
                    }
                    AnonymousClass6C7.A1R(A003);
                }
            }
        }
        if (A1Y) {
            BHE();
            j2 = r5.A00 * ((long) C1462879o.A01);
        } else {
            r5 = (C175768Zq) C1453675f.A00(A002);
            if (!A0G() && j <= A01.get(this) / ((long) C1462879o.A01)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A06;
                while (true) {
                    C175778Zr r82 = (C175778Zr) atomicReferenceFieldUpdater2.get(this);
                    if (r82.A00 >= r5.A00 || !r5.A06()) {
                        break;
                    } else if (AnonymousClass0H6.A00(this, r82, r5, atomicReferenceFieldUpdater2)) {
                        AnonymousClass6C7.A1R(r82);
                        break;
                    } else {
                        AnonymousClass6C7.A1R(r5);
                    }
                }
            }
            long j4 = r5.A00;
            if (j4 <= j) {
                return r5;
            }
            j2 = j4 * ((long) C1462879o.A01);
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            do {
                j3 = atomicLongFieldUpdater.get(this);
                if (j3 >= j2) {
                    break;
                }
            } while (atomicLongFieldUpdater.compareAndSet(this, j3, j2));
        }
        if (j2 < A03()) {
            r5.A01();
        }
        return null;
    }

    public final C175768Zq A09(C175768Zq r20, long j) {
        Object A002;
        boolean A1Y;
        long j2;
        long j3;
        long j4;
        C175768Zq r5 = r20;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A09;
        C174508Uu r11 = C174508Uu.A00;
        loop0:
        while (true) {
            A002 = C155217eT.A00(r11, r5, j);
            A1Y = AnonymousClass000.A1Y(A002, C155217eT.A00);
            if (A1Y) {
                break;
            }
            C175778Zr A003 = C1453675f.A00(A002);
            while (true) {
                C175778Zr r8 = (C175778Zr) atomicReferenceFieldUpdater.get(this);
                if (r8.A00 >= A003.A00) {
                    break loop0;
                } else if (A003.A06()) {
                    if (AnonymousClass0H6.A00(this, r8, A003, atomicReferenceFieldUpdater)) {
                        AnonymousClass6C7.A1R(r8);
                        break loop0;
                    }
                    AnonymousClass6C7.A1R(A003);
                }
            }
        }
        if (A1Y) {
            BHE();
            j2 = r5.A00 * ((long) C1462879o.A01);
        } else {
            r5 = (C175768Zq) C1453675f.A00(A002);
            long j5 = r5.A00;
            if (j5 <= j) {
                return r5;
            }
            j2 = j5 * ((long) C1462879o.A01);
            AtomicLongFieldUpdater atomicLongFieldUpdater = A04;
            do {
                j3 = atomicLongFieldUpdater.get(this);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j2) {
                    break;
                }
            } while (atomicLongFieldUpdater.compareAndSet(this, j3, (((long) ((int) (j3 >> 60))) << 60) + j4));
        }
        if (j2 < A03.get(this)) {
            r5.A01();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (r17 >= A03.get(r10)) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r8.A08(r4, r2, X.C1462879o.A0F) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (A0K(r2, r8, r4) == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        r3.set(r1, X.C1462879o.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0110, code lost:
        r3.set(r1, X.C1462879o.A0A);
        r8.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0118, code lost:
        A0C(1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r19 = this;
            r10 = r19
            boolean r0 = r10.A0G()
            if (r0 != 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = A06
            java.lang.Object r8 = r9.get(r10)
            X.8Zq r8 = (X.C175768Zq) r8
        L_0x0010:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = A01
            long r17 = r11.getAndIncrement(r10)
            int r0 = X.C1462879o.A01
            long r4 = (long) r0
            long r6 = r17 / r4
            long r0 = r10.A03()
            int r3 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            long r0 = r8.A00
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0038
            if (r2 >= 0) goto L_0x0032
            X.7kU r0 = r8.A00()
            if (r0 == 0) goto L_0x0032
            r10.A0F(r8, r6)
        L_0x0032:
            r0 = 1
            r10.A0C(r0)
        L_0x0037:
            return
        L_0x0038:
            if (r2 == 0) goto L_0x0092
            X.8Uu r15 = X.C174508Uu.A00
        L_0x003c:
            java.lang.Object r14 = X.C155217eT.A00(r15, r8, r6)
            X.2XH r0 = X.C155217eT.A00
            if (r14 != r0) goto L_0x0050
            r10.BHE()
            r10.A0F(r8, r6)
        L_0x004a:
            r4 = 1
        L_0x004c:
            r10.A0C(r4)
            goto L_0x0010
        L_0x0050:
            X.8Zr r13 = X.C1453675f.A00(r14)
        L_0x0054:
            java.lang.Object r12 = r9.get(r10)
            X.8Zr r12 = (X.C175778Zr) r12
            long r2 = r12.A00
            long r0 = r13.A00
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x0071
            boolean r0 = r13.A06()
            if (r0 == 0) goto L_0x003c
            boolean r0 = X.AnonymousClass0H6.A00(r10, r12, r13, r9)
            if (r0 == 0) goto L_0x008d
            X.AnonymousClass6C7.A1R(r12)
        L_0x0071:
            X.8Zr r3 = X.C1453675f.A00(r14)
            X.8Zq r3 = (X.C175768Zq) r3
            long r0 = r3.A00
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0091
            r2 = 1
            long r13 = r17 + r2
            long r4 = r4 * r0
            r12 = r10
            r15 = r4
            boolean r0 = r11.compareAndSet(r12, r13, r15)
            if (r0 == 0) goto L_0x004a
            long r4 = r4 - r17
            goto L_0x004c
        L_0x008d:
            X.AnonymousClass6C7.A1R(r13)
            goto L_0x0054
        L_0x0091:
            r8 = r3
        L_0x0092:
            long r0 = r17 % r4
            int r4 = (int) r0
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r8.A00
            int r0 = r4 * 2
            int r1 = r0 + 1
            java.lang.Object r2 = r3.get(r1)
            boolean r0 = r2 instanceof X.C183558qE
            if (r0 == 0) goto L_0x00c2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r5 = r0.get(r10)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00c2
        L_0x00ad:
            X.2XH r0 = X.C1462879o.A0F
            boolean r0 = r8.A08(r4, r2, r0)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r10.A0K(r2, r8, r4)
            if (r0 == 0) goto L_0x0110
            X.2XH r0 = X.C1462879o.A03
            r3.set(r1, r0)
            goto L_0x0032
        L_0x00c2:
            java.lang.Object r2 = r3.get(r1)
            boolean r0 = r2 instanceof X.C183558qE
            if (r0 == 0) goto L_0x00e4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r5 = r0.get(r10)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ad
            r5 = r2
            X.8qE r5 = (X.C183558qE) r5
            X.7Rs r0 = new X.7Rs
            r0.<init>(r5)
        L_0x00dc:
            boolean r0 = r8.A08(r4, r2, r0)
            if (r0 == 0) goto L_0x00c2
            goto L_0x0032
        L_0x00e4:
            X.2XH r0 = X.C1462879o.A0A
            if (r2 == r0) goto L_0x0118
            if (r2 != 0) goto L_0x00ed
            X.2XH r0 = X.C1462879o.A0B
            goto L_0x00dc
        L_0x00ed:
            X.2XH r0 = X.C1462879o.A03
            if (r2 == r0) goto L_0x0032
            X.2XH r0 = X.C1462879o.A0E
            if (r2 == r0) goto L_0x0032
            X.2XH r0 = X.C1462879o.A07
            if (r2 == r0) goto L_0x0032
            X.2XH r0 = X.C1462879o.A09
            if (r2 == r0) goto L_0x0032
            X.2XH r0 = X.C1462879o.A04
            if (r2 == r0) goto L_0x0032
            X.2XH r0 = X.C1462879o.A0G
            if (r2 == r0) goto L_0x00c2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected cell state: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r2, r0, r1)
            throw r0
        L_0x0110:
            X.2XH r0 = X.C1462879o.A0A
            r3.set(r1, r0)
            r8.A04()
        L_0x0118:
            r0 = 1
            r10.A0C(r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A0A():void");
    }

    public final void A0B(long j) {
        C175768Zq r7 = (C175768Zq) A08.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(((long) this.A00) + j2, A01.get(this))) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    long j3 = (long) C1462879o.A01;
                    long j4 = j2 / j3;
                    int i = (int) (j2 % j3);
                    if (r7.A00 != j4) {
                        C175768Zq A082 = A08(r7, j4);
                        if (A082 != null) {
                            r7 = A082;
                        }
                    }
                    if (A04((Object) null, r7, i, j2) != C1462879o.A08 || j2 < A03()) {
                        r7.A01();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void A0C(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = A02;
        if ((atomicLongFieldUpdater.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
        }
    }

    public final void A0D(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (!A0G()) {
            do {
                atomicLongFieldUpdater = A01;
            } while (atomicLongFieldUpdater.get(this) <= j);
            int i = C1462879o.A00;
            int i2 = 0;
            while (i2 < i) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (j4 != (A02.get(this) & 4611686018427387903L) || j4 != atomicLongFieldUpdater.get(this)) {
                    i2++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = A02;
            do {
                j2 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                long j6 = atomicLongFieldUpdater2.get(this);
                long j7 = j6 & 4611686018427387903L;
                boolean A1S = AnonymousClass000.A1S(((4611686018427387904L & j6) > 0 ? 1 : ((4611686018427387904L & j6) == 0 ? 0 : -1)));
                if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                    break;
                } else if (!A1S) {
                    atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + j7);
                }
            }
            do {
                j3 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, 0 + (j3 & 4611686018427387903L)));
        }
    }

    public final void A0E(C183558qE r4, boolean z) {
        Object r0;
        Throwable A062;
        if (r4 instanceof AnonymousClass4GW) {
            C84814Du r42 = (C84814Du) r4;
            if (z) {
                A062 = (Throwable) A05.get(this);
                if (A062 == null) {
                    A062 = new C174298Ts();
                }
            } else {
                A062 = A06();
            }
            r42.BkD(C57682u2.A00(A062));
        } else if (r4 instanceof AnonymousClass8PP) {
            ((AnonymousClass8PP) r4).A00.BkD(new C60472yc(AnonymousClass6C9.A0m(this)));
        } else if (r4 instanceof AnonymousClass8PQ) {
            AnonymousClass8PQ r43 = (AnonymousClass8PQ) r4;
            AnonymousClass46G r2 = r43.A01;
            C162457s7.A0H(r2);
            r43.A01 = null;
            r43.A00 = C1462879o.A04;
            Throwable th = (Throwable) A05.get(r43.A02);
            if (th == null) {
                r0 = Boolean.FALSE;
            } else {
                r0 = new AnonymousClass3Z0(th);
            }
            r2.BkD(r0);
        } else if (r4 instanceof AnonymousClass466) {
            ((AnonymousClass466) r4).A01(this, C1462879o.A04);
        } else {
            throw AnonymousClass000.A0H(r4, "Unexpected waiter: ", AnonymousClass001.A0o());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=X.8Zq, code=X.8Zr, for r8v0, types: [X.8Zq] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C175778Zr r8, long r9) {
        /*
            r7 = this;
        L_0x0000:
            long r1 = r8.A00
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0010
            X.7kU r0 = r8.A00()
            X.8Zr r0 = (X.C175778Zr) r0
            if (r0 == 0) goto L_0x0010
            r8 = r0
            goto L_0x0000
        L_0x0010:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x0020
            X.7kU r0 = r8.A00()
            X.8Zr r0 = (X.C175778Zr) r0
            if (r0 == 0) goto L_0x0020
            r8 = r0
            goto L_0x0010
        L_0x0020:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = A06
        L_0x0022:
            java.lang.Object r5 = r6.get(r7)
            X.8Zr r5 = (X.C175778Zr) r5
            long r3 = r5.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            boolean r0 = r8.A06()
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass0H6.A00(r7, r5, r8, r6)
            if (r0 == 0) goto L_0x0040
            X.AnonymousClass6C7.A1R(r5)
        L_0x003f:
            return
        L_0x0040:
            X.AnonymousClass6C7.A1R(r8)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A0F(X.8Zq, long):void");
    }

    public final boolean A0G() {
        long j = A01.get(this);
        if (j == 0 || j == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean A0H(long j) {
        if (j < A01.get(this) || j < A03.get(this) + ((long) this.A00)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r2.A00.lazySet(r8 * 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        r2.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0142, code lost:
        r2 = (X.C175768Zq) ((X.C158747kU) X.C158747kU.A01.get(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0I(long r20, boolean r22) {
        /*
            r19 = this;
            r0 = 60
            long r3 = r20 >> r0
            int r5 = (int) r3
            r6 = 0
            if (r5 == 0) goto L_0x015a
            r0 = 1
            if (r5 == r0) goto L_0x015a
            r0 = 2
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            r14 = r19
            if (r5 == r0) goto L_0x00b8
            r0 = 3
            if (r5 != r0) goto L_0x0170
            long r1 = r20 & r3
            X.8Zq r2 = r14.A07(r1)
            r13 = 1
            r7 = 0
        L_0x0020:
            int r9 = X.C1462879o.A01
            int r8 = r9 - r13
        L_0x0024:
            r5 = -1
            if (r5 >= r8) goto L_0x0142
            long r3 = r2.A00
            long r0 = (long) r9
            long r3 = r3 * r0
            long r0 = (long) r8
            long r3 = r3 + r0
        L_0x002d:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.A00
            int r0 = r8 * 2
            int r0 = r0 + 1
            java.lang.Object r10 = r1.get(r0)
            X.2XH r0 = X.C1462879o.A07
            if (r10 == r0) goto L_0x014e
            X.2XH r0 = X.C1462879o.A03
            if (r10 != r0) goto L_0x005f
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r11 = r0.get(r14)
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x014e
            X.2XH r0 = X.C1462879o.A04
            boolean r0 = r2.A08(r8, r10, r0)
            if (r0 == 0) goto L_0x002d
        L_0x0051:
            r3 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.A00
            int r0 = r8 * 2
            r1.lazySet(r0, r3)
        L_0x0059:
            r2.A04()
        L_0x005c:
            int r8 = r8 + -1
            goto L_0x0024
        L_0x005f:
            X.2XH r0 = X.C1462879o.A0B
            if (r10 == r0) goto L_0x00af
            if (r10 == 0) goto L_0x00af
            boolean r0 = r10 instanceof X.C183558qE
            if (r0 != 0) goto L_0x0078
            boolean r0 = r10 instanceof X.C150667Rs
            if (r0 != 0) goto L_0x0078
            X.2XH r1 = X.C1462879o.A0F
            if (r10 == r1) goto L_0x014e
            X.2XH r0 = X.C1462879o.A0G
            if (r10 == r0) goto L_0x014e
            if (r10 == r1) goto L_0x002d
            goto L_0x005c
        L_0x0078:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r11 = r0.get(r14)
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x014e
            boolean r0 = r10 instanceof X.C150667Rs
            r1 = r10
            if (r0 == 0) goto L_0x008b
            X.7Rs r1 = (X.C150667Rs) r1
            X.8qE r1 = r1.A00
        L_0x008b:
            X.2XH r0 = X.C1462879o.A04
            boolean r0 = r2.A08(r8, r10, r0)
            if (r0 == 0) goto L_0x002d
            if (r7 != 0) goto L_0x0097
            r7 = r1
            goto L_0x0051
        L_0x0097:
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x00a2
            r0 = r7
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
            goto L_0x0051
        L_0x00a2:
            r0 = 4
            java.util.ArrayList r0 = X.AnonymousClass002.A0I(r0)
            r0.add(r7)
            r0.add(r1)
            r7 = r0
            goto L_0x0051
        L_0x00af:
            X.2XH r0 = X.C1462879o.A04
            boolean r0 = r2.A08(r8, r10, r0)
            if (r0 == 0) goto L_0x002d
            goto L_0x0059
        L_0x00b8:
            long r1 = r20 & r3
            r14.A07(r1)
            if (r22 == 0) goto L_0x0159
        L_0x00bf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = A08
            java.lang.Object r7 = r9.get(r14)
            X.8Zq r7 = (X.C175768Zq) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r13 = A03
            long r15 = r13.get(r14)
            long r1 = r14.A03()
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0159
            int r0 = X.C1462879o.A01
            long r4 = (long) r0
            long r2 = r15 / r4
            long r0 = r7.A00
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x00f3
            X.8Zq r7 = r14.A08(r7, r2)
            if (r7 != 0) goto L_0x00f3
            java.lang.Object r0 = r9.get(r14)
            X.8Zr r0 = (X.C175778Zr) r0
            long r4 = r0.A00
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            goto L_0x0159
        L_0x00f3:
            r7.A01()
            long r0 = r15 % r4
            int r2 = (int) r0
        L_0x00f9:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r7.A00
            int r0 = r2 * 2
            int r0 = r0 + 1
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L_0x012e
            X.2XH r0 = X.C1462879o.A0B
            if (r1 == r0) goto L_0x012e
            X.2XH r0 = X.C1462879o.A03
            if (r1 == r0) goto L_0x015a
            X.2XH r0 = X.C1462879o.A0A
            if (r1 == r0) goto L_0x0139
            X.2XH r0 = X.C1462879o.A04
            if (r1 == r0) goto L_0x0139
            X.2XH r0 = X.C1462879o.A07
            if (r1 == r0) goto L_0x0139
            X.2XH r0 = X.C1462879o.A0E
            if (r1 == r0) goto L_0x0139
            X.2XH r0 = X.C1462879o.A0F
            if (r1 == r0) goto L_0x015a
            X.2XH r0 = X.C1462879o.A0G
            if (r1 == r0) goto L_0x0139
            long r1 = r13.get(r14)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0139
            return r6
        L_0x012e:
            X.2XH r0 = X.C1462879o.A0E
            boolean r0 = r7.A08(r2, r1, r0)
            if (r0 == 0) goto L_0x00f9
            r14.A0A()
        L_0x0139:
            r0 = 1
            long r17 = r15 + r0
            r13.compareAndSet(r14, r15, r17)
            goto L_0x00bf
        L_0x0142:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C158747kU.A01
            java.lang.Object r2 = r0.get(r2)
            X.7kU r2 = (X.C158747kU) r2
            X.8Zq r2 = (X.C175768Zq) r2
            if (r2 != 0) goto L_0x0020
        L_0x014e:
            if (r7 == 0) goto L_0x0159
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x015b
            X.8qE r7 = (X.C183558qE) r7
            r14.A0E(r7, r6)
        L_0x0159:
            r6 = 1
        L_0x015a:
            return r6
        L_0x015b:
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            int r1 = r7.size()
            int r1 = r1 - r13
        L_0x0162:
            if (r5 >= r1) goto L_0x0159
            java.lang.Object r0 = r7.get(r1)
            X.8qE r0 = (X.C183558qE) r0
            r14.A0E(r0, r6)
            int r1 = r1 + -1
            goto L_0x0162
        L_0x0170:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unexpected close status: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.A0I(long, boolean):boolean");
    }

    public final boolean A0J(Object obj, Object obj2) {
        AnonymousClass46G r1;
        Object BrC;
        if (!(obj instanceof AnonymousClass466)) {
            if (obj instanceof AnonymousClass8PP) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
                r1 = ((AnonymousClass8PP) obj).A00;
                BrC = r1.BrC(new C60472yc(obj2), (Object) null, (AnonymousClass4GQ) null);
                if (BrC == null) {
                    return false;
                }
            } else if (obj instanceof AnonymousClass8PQ) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                AnonymousClass8PQ r4 = (AnonymousClass8PQ) obj;
                r1 = r4.A01;
                C162457s7.A0H(r1);
                r4.A01 = null;
                r4.A00 = obj2;
                BrC = r1.BrC(Boolean.TRUE, (Object) null, (AnonymousClass4GQ) null);
                if (BrC == null) {
                    return false;
                }
            } else if (obj instanceof AnonymousClass4GW) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                AnonymousClass4GW r42 = (AnonymousClass4GW) obj;
                Object BrC2 = r42.BrC(obj2, (Object) null, (AnonymousClass4GQ) null);
                if (BrC2 == null) {
                    return false;
                }
                r42.AzI(BrC2);
                return true;
            } else {
                throw AnonymousClass000.A0H(obj, "Unexpected receiver type: ", AnonymousClass001.A0o());
            }
            r1.AzI(BrC);
            return true;
        } else if (((AnonymousClass466) obj).A01(this, obj2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0K(Object obj, C175768Zq r6, int i) {
        C140876uf r3;
        if (obj instanceof AnonymousClass4GW) {
            C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            AnonymousClass4GW r5 = (AnonymousClass4GW) obj;
            Object BrC = r5.BrC(C59022wD.A00, (Object) null, (AnonymousClass4GQ) null);
            if (BrC == null) {
                return false;
            }
            r5.AzI(BrC);
            return true;
        } else if (obj instanceof AnonymousClass466) {
            C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            int A012 = ((AnonymousClass466) obj).A01(this, C59022wD.A00);
            if (A012 == 0) {
                r3 = C140876uf.SUCCESSFUL;
            } else if (A012 == 1) {
                r3 = C140876uf.REREGISTER;
            } else if (A012 != 2) {
                r3 = C140876uf.ALREADY_SELECTED;
            } else {
                r3 = C140876uf.CANCELLED;
            }
            if (r3 == C140876uf.REREGISTER) {
                r6.A00.lazySet(i * 2, (Object) null);
            }
            if (r3 == C140876uf.SUCCESSFUL) {
                return true;
            }
            return false;
        } else {
            throw AnonymousClass000.A0H(obj, "Unexpected waiter: ", AnonymousClass001.A0o());
        }
    }

    public final void AyX(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        A0L(cancellationException, true);
    }

    public AnonymousClass2PR BAA() {
        C174538Ux r3 = C174538Ux.A00;
        C162457s7.A0K(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        AnonymousClass360.A03(r3, 3);
        C174548Uy r1 = C174548Uy.A00;
        C162457s7.A0K(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        AnonymousClass360.A03(r1, 3);
        return new AnonymousClass2PR(this, r3, r1);
    }

    public AnonymousClass2PR BAB() {
        C174558Uz r3 = C174558Uz.A00;
        C162457s7.A0K(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        AnonymousClass360.A03(r3, 3);
        AnonymousClass8V0 r1 = AnonymousClass8V0.A00;
        C162457s7.A0K(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        AnonymousClass360.A03(r1, 3);
        return new AnonymousClass2PR(this, r3, r1);
    }

    public void BGu(AnonymousClass4GQ r5) {
        AnonymousClass2XH r1;
        AnonymousClass2XH r0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A07;
        if (!AnonymousClass0H6.A00(this, (Object) null, r5, atomicReferenceFieldUpdater)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                r1 = C1462879o.A05;
                r0 = C1462879o.A06;
                if (obj != r1) {
                    if (obj == r0) {
                        throw AnonymousClass001.A0e("Another handler was already registered and successfully invoked");
                    }
                    throw AnonymousClass000.A0H(obj, "Another handler is already registered: ", AnonymousClass001.A0o());
                }
            } while (!AnonymousClass0H6.A00(this, r1, r0, atomicReferenceFieldUpdater));
            r5.invoke(A05.get(this));
        }
    }

    public boolean BHE() {
        return A0I(A04.get(this), false);
    }

    public AnonymousClass8PQ BJP() {
        return new AnonymousClass8PQ(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r1 = X.C57702u4.A03(r33);
        r1.BkD(X.C57682u2.A00(A06()));
        r1 = r1.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r0 = X.AnonymousClass218.COROUTINE_SUSPENDED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        if (r1 == r0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r1 = X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r1 != r0) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0167 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BlD(java.lang.Object r32, X.C84814Du r33) {
        /*
            r31 = this;
            r6 = r31
            boolean r0 = r6 instanceof X.C175748Zo
            r24 = r32
            if (r0 == 0) goto L_0x001c
            X.8Zo r6 = (X.C175748Zo) r6
            r0 = r24
            java.lang.Object r0 = r6.A0M(r0)
            boolean r0 = r0 instanceof X.C831746k
            if (r0 == 0) goto L_0x0019
            java.lang.Throwable r0 = r6.A06()
            throw r0
        L_0x0019:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x001c:
            r18 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = A09
            java.lang.Object r9 = r10.get(r6)
            X.8Zq r9 = (X.C175768Zq) r9
        L_0x0026:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r15 = A04
            long r0 = r15.getAndIncrement(r6)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r21 = r0 & r2
            r2 = 0
            boolean r23 = r6.A0I(r0, r2)
            int r14 = X.C1462879o.A01
            long r0 = (long) r14
            long r2 = r21 / r0
            long r4 = r21 % r0
            int r8 = (int) r4
            long r4 = r9.A00
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x006a
            X.8Zq r7 = r6.A09(r9, r2)
            if (r7 != 0) goto L_0x006b
            if (r23 == 0) goto L_0x0026
        L_0x004e:
            X.46G r1 = X.C57702u4.A03(r33)
            java.lang.Throwable r0 = r6.A06()
            java.lang.Object r0 = X.C57682u2.A00(r0)
            r1.BkD(r0)
            java.lang.Object r1 = r1.A06()
        L_0x0061:
            X.218 r0 = X.AnonymousClass218.COROUTINE_SUSPENDED
            if (r1 == r0) goto L_0x0067
            X.2wD r1 = X.C59022wD.A00
        L_0x0067:
            if (r1 != r0) goto L_0x016a
            return r1
        L_0x006a:
            r7 = r9
        L_0x006b:
            r19 = r7
            r20 = r8
            r16 = r6
            r17 = r24
            int r3 = r16.A02(r17, r18, r19, r20, r21, r23)
            if (r3 == 0) goto L_0x0167
            r2 = 1
            if (r3 == r2) goto L_0x016a
            r2 = 2
            if (r3 == r2) goto L_0x0151
            r13 = 3
            if (r3 == r13) goto L_0x0098
            r0 = 4
            if (r3 == r0) goto L_0x008a
            r7.A01()
            r9 = r7
            goto L_0x0026
        L_0x008a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r1 = r0.get(r6)
            int r0 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r7.A01()
            goto L_0x004e
        L_0x0098:
            X.4Du r2 = X.C57702u4.A01(r33)
            X.46G r9 = X.AnonymousClass2AF.A00(r2)
            r23 = 0
            r18 = r9
            int r2 = r16.A02(r17, r18, r19, r20, r21, r23)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x0140
            r12 = 1
            if (r2 == r12) goto L_0x013d
            r11 = 2
            if (r2 == r11) goto L_0x0138
            r8 = 4
            if (r2 == r8) goto L_0x0122
            java.lang.String r17 = "unexpected"
            r3 = 5
            if (r2 != r3) goto L_0x0158
            r7.A01()     // Catch:{ all -> 0x0162 }
            java.lang.Object r7 = r10.get(r6)     // Catch:{ all -> 0x0162 }
            X.8Zq r7 = (X.C175768Zq) r7     // Catch:{ all -> 0x0162 }
        L_0x00c1:
            long r2 = r15.getAndIncrement(r6)     // Catch:{ all -> 0x0162 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r21 = r2 & r4
            r4 = 0
            boolean r30 = r6.A0I(r2, r4)     // Catch:{ all -> 0x0162 }
            long r2 = r21 / r0
            long r4 = r21 % r0
            int r10 = (int) r4     // Catch:{ all -> 0x0162 }
            long r4 = r7.A00     // Catch:{ all -> 0x0162 }
            int r16 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x00e6
            X.8Zq r2 = r6.A09(r7, r2)     // Catch:{ all -> 0x0162 }
            if (r2 != 0) goto L_0x00e5
            if (r30 == 0) goto L_0x00c1
            goto L_0x012f
        L_0x00e5:
            r7 = r2
        L_0x00e6:
            r25 = r9
            r26 = r7
            r27 = r10
            r23 = r6
            r28 = r21
            int r2 = r23.A02(r24, r25, r26, r27, r28, r30)     // Catch:{ all -> 0x0162 }
            if (r2 == 0) goto L_0x011c
            if (r2 == r12) goto L_0x0146
            if (r2 == r11) goto L_0x0109
            if (r2 == r13) goto L_0x015d
            if (r2 == r8) goto L_0x0102
            r7.A01()     // Catch:{ all -> 0x0162 }
            goto L_0x00c1
        L_0x0102:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03     // Catch:{ all -> 0x0162 }
            long r1 = r0.get(r6)     // Catch:{ all -> 0x0162 }
            goto L_0x0128
        L_0x0109:
            if (r30 == 0) goto L_0x010f
            r7.A04()     // Catch:{ all -> 0x0162 }
            goto L_0x012f
        L_0x010f:
            boolean r1 = r9 instanceof X.C183558qE     // Catch:{ all -> 0x0162 }
            r0 = 0
            if (r1 == 0) goto L_0x0115
            r0 = r9
        L_0x0115:
            if (r0 == 0) goto L_0x014b
            int r10 = r10 + r14
            r0.BGt(r7, r10)     // Catch:{ all -> 0x0162 }
            goto L_0x014b
        L_0x011c:
            r7.A01()     // Catch:{ all -> 0x0162 }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0162 }
            goto L_0x0148
        L_0x0122:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03     // Catch:{ all -> 0x0162 }
            long r1 = r0.get(r6)     // Catch:{ all -> 0x0162 }
        L_0x0128:
            int r0 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x012f
            r7.A01()     // Catch:{ all -> 0x0162 }
        L_0x012f:
            java.lang.Throwable r0 = r6.A06()     // Catch:{ all -> 0x0162 }
            java.lang.Object r0 = X.C57682u2.A00(r0)     // Catch:{ all -> 0x0162 }
            goto L_0x0148
        L_0x0138:
            int r8 = r8 + r14
            r9.BGt(r7, r8)     // Catch:{ all -> 0x0162 }
            goto L_0x014b
        L_0x013d:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0162 }
            goto L_0x0148
        L_0x0140:
            r7.A01()     // Catch:{ all -> 0x0162 }
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0162 }
            goto L_0x0148
        L_0x0146:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0162 }
        L_0x0148:
            r9.BkD(r0)     // Catch:{ all -> 0x0162 }
        L_0x014b:
            java.lang.Object r1 = r9.A06()
            goto L_0x0061
        L_0x0151:
            if (r23 == 0) goto L_0x016a
            r7.A04()
            goto L_0x004e
        L_0x0158:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r17)     // Catch:{ all -> 0x0162 }
            goto L_0x0161
        L_0x015d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r17)     // Catch:{ all -> 0x0162 }
        L_0x0161:
            throw r0     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            r9.A0C()
            throw r0
        L_0x0167:
            r7.A01()
        L_0x016a:
            X.2wD r1 = X.C59022wD.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.BlD(java.lang.Object, X.4Du):java.lang.Object");
    }

    public Object BrB() {
        C175768Zq r11;
        C183558qE r10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = A03;
        long j = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = A04;
        long j2 = atomicLongFieldUpdater2.get(this);
        if (!A0I(j2, true)) {
            if (j < (j2 & 1152921504606846975L)) {
                AnonymousClass2XH r102 = C1462879o.A09;
                C175768Zq r4 = (C175768Zq) A08.get(this);
                while (!A0I(atomicLongFieldUpdater2.get(this), true)) {
                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                    long j3 = (long) C1462879o.A01;
                    long j4 = andIncrement / j3;
                    int i = (int) (andIncrement % j3);
                    if (r4.A00 != j4) {
                        r11 = A08(r4, j4);
                        if (r11 == null) {
                            continue;
                        }
                    } else {
                        r11 = r4;
                    }
                    Object A042 = A04(r102, r11, i, andIncrement);
                    if (A042 == C1462879o.A0H) {
                        if ((r102 instanceof C183558qE) && (r10 = (C183558qE) r102) != null) {
                            r10.BGt(r11, i);
                        }
                        A0D(andIncrement);
                        r11.A04();
                    } else if (A042 == C1462879o.A08) {
                        if (andIncrement < A03()) {
                            r11.A01();
                        }
                        r4 = r11;
                    } else if (A042 != C1462879o.A0I) {
                        r11.A01();
                        return A042;
                    } else {
                        throw AnonymousClass001.A0e("unexpected");
                    }
                }
            }
            return C60472yc.A01;
        }
        return AnonymousClass6C9.A0m(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        return X.C59022wD.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BrD(java.lang.Object r17) {
        /*
            r16 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = A04
            r8 = r16
            long r2 = r6.get(r8)
            r5 = 0
            boolean r0 = r8.A0I(r2, r5)
            if (r0 != 0) goto L_0x0020
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r0
            boolean r0 = r8.A0H(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0020
        L_0x001d:
            X.2Ui r0 = X.C60472yc.A01
            return r0
        L_0x0020:
            X.2XH r10 = X.C1462879o.A0A
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            java.lang.Object r11 = r0.get(r8)
            X.8Zq r11 = (X.C175768Zq) r11
        L_0x002a:
            long r0 = r6.getAndIncrement(r8)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r0 & r2
            boolean r15 = r8.A0I(r0, r5)
            int r4 = X.C1462879o.A01
            long r0 = (long) r4
            long r2 = r13 / r0
            long r0 = r13 % r0
            int r12 = (int) r0
            long r0 = r11.A00
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x005a
            X.8Zq r0 = r8.A09(r11, r2)
            if (r0 != 0) goto L_0x0059
            if (r15 == 0) goto L_0x002a
        L_0x004f:
            java.lang.Throwable r1 = r8.A06()
            X.46k r0 = new X.46k
            r0.<init>(r1)
            return r0
        L_0x0059:
            r11 = r0
        L_0x005a:
            r9 = r17
            int r1 = r8.A02(r9, r10, r11, r12, r13, r15)
            if (r1 == 0) goto L_0x009d
            r0 = 1
            if (r1 == r0) goto L_0x00a0
            r0 = 2
            if (r1 == r0) goto L_0x0080
            r0 = 3
            if (r1 == r0) goto L_0x0096
            r0 = 4
            if (r1 == r0) goto L_0x0072
            r11.A01()
            goto L_0x002a
        L_0x0072:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r1 = r0.get(r8)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            r11.A01()
            goto L_0x004f
        L_0x0080:
            if (r15 == 0) goto L_0x0086
            r11.A04()
            goto L_0x004f
        L_0x0086:
            boolean r0 = r10 instanceof X.C183558qE
            if (r0 == 0) goto L_0x0092
            X.8qE r10 = (X.C183558qE) r10
            if (r10 == 0) goto L_0x0092
            int r12 = r12 + r4
            r10.BGt(r11, r12)
        L_0x0092:
            r11.A04()
            goto L_0x001d
        L_0x0096:
            java.lang.String r0 = "unexpected"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x009d:
            r11.A01()
        L_0x00a0:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.BrD(java.lang.Object):java.lang.Object");
    }

    public Object BiR(C84814Du r2) {
        return A00(r2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0185, code lost:
        r8 = (X.C175768Zq) r8.A00();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A04
            r9 = r16
            long r1 = r0.get(r9)
            r0 = 60
            long r1 = r1 >> r0
            int r0 = (int) r1
            r2 = 3
            r3 = 2
            if (r0 == r3) goto L_0x0070
            if (r0 != r2) goto L_0x001b
            java.lang.String r0 = "cancelled,"
        L_0x0018:
            r6.append(r0)
        L_0x001b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "capacity="
            r1.append(r0)
            int r0 = r9.A00
            r1.append(r0)
            r7 = 44
            r1.append(r7)
            X.AnonymousClass000.A1B(r1, r6)
            java.lang.String r0 = "data=["
            r6.append(r0)
            X.8Zq[] r2 = new X.C175768Zq[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A08
            java.lang.Object r1 = r0.get(r9)
            r0 = 0
            r2[r0] = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A09
            java.lang.Object r1 = r0.get(r9)
            r0 = 1
            r2[r0] = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A06
            java.lang.Object r0 = r0.get(r9)
            r2[r3] = r0
            java.util.List r0 = X.AnonymousClass8UF.A0o(r2)
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.Iterator r2 = r0.iterator()
        L_0x005e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r1 = r2.next()
            X.8Zq r0 = X.C1462879o.A02
            if (r1 == r0) goto L_0x005e
            r3.add(r1)
            goto L_0x005e
        L_0x0070:
            java.lang.String r0 = "closed,"
            goto L_0x0018
        L_0x0073:
            java.util.Iterator r10 = r3.iterator()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r8 = r10.next()
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a1
            r0 = r8
            X.8Zr r0 = (X.C175778Zr) r0
            long r4 = r0.A00
        L_0x008c:
            java.lang.Object r3 = r10.next()
            r0 = r3
            X.8Zr r0 = (X.C175778Zr) r0
            long r1 = r0.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            r8 = r3
            r4 = r1
        L_0x009b:
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L_0x008c
        L_0x00a1:
            X.8Zq r8 = (X.C175768Zq) r8
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = A03
            long r14 = r0.get(r9)
            long r12 = r9.A03()
        L_0x00ad:
            int r5 = X.C1462879o.A01
            r4 = 0
        L_0x00b0:
            if (r4 >= r5) goto L_0x0185
            long r2 = r8.A00
            long r0 = (long) r5
            long r2 = r2 * r0
            long r0 = (long) r4
            long r2 = r2 + r0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00c0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x018d
        L_0x00c0:
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r8.A00
            int r1 = r4 * 2
            int r0 = r1 + 1
            java.lang.Object r9 = r10.get(r0)
            java.lang.Object r1 = r10.get(r1)
            boolean r0 = r9 instanceof X.AnonymousClass4GW
            if (r0 == 0) goto L_0x010b
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0103
            if (r11 < 0) goto L_0x0108
            java.lang.String r3 = "receive"
        L_0x00da:
            if (r1 == 0) goto L_0x00fa
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            r0 = 40
            r2.append(r0)
            r2.append(r3)
            r2.append(r7)
            r2.append(r1)
            java.lang.String r0 = "),"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r2)
        L_0x00f4:
            r6.append(r0)
        L_0x00f7:
            int r4 = r4 + 1
            goto L_0x00b0
        L_0x00fa:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r3)
            java.lang.String r0 = X.AnonymousClass001.A0j(r0, r7)
            goto L_0x00f4
        L_0x0103:
            if (r11 >= 0) goto L_0x0108
            java.lang.String r3 = "send"
            goto L_0x00da
        L_0x0108:
            java.lang.String r3 = "cont"
            goto L_0x00da
        L_0x010b:
            boolean r0 = r9 instanceof X.AnonymousClass466
            if (r0 == 0) goto L_0x0120
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0118
            if (r11 < 0) goto L_0x011d
            java.lang.String r3 = "onReceive"
            goto L_0x00da
        L_0x0118:
            if (r11 >= 0) goto L_0x011d
            java.lang.String r3 = "onSend"
            goto L_0x00da
        L_0x011d:
            java.lang.String r3 = "select"
            goto L_0x00da
        L_0x0120:
            boolean r0 = r9 instanceof X.AnonymousClass8PP
            if (r0 == 0) goto L_0x0127
            java.lang.String r3 = "receiveCatching"
            goto L_0x00da
        L_0x0127:
            boolean r0 = r9 instanceof X.C150667Rs
            if (r0 == 0) goto L_0x0139
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EB("
            r2.append(r0)
            java.lang.String r3 = X.C18260x0.A04(r9, r2)
            goto L_0x00da
        L_0x0139:
            X.2XH r0 = X.C1462879o.A0G
            boolean r0 = X.C162457s7.A0P(r9, r0)
            if (r0 != 0) goto L_0x0181
            X.2XH r0 = X.C1462879o.A0F
            boolean r0 = X.C162457s7.A0P(r9, r0)
            if (r0 != 0) goto L_0x0181
            if (r9 == 0) goto L_0x00f7
            X.2XH r0 = X.C1462879o.A0B
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f7
            X.2XH r0 = X.C1462879o.A07
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f7
            X.2XH r0 = X.C1462879o.A0E
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f7
            X.2XH r0 = X.C1462879o.A09
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f7
            X.2XH r0 = X.C1462879o.A0A
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f7
            X.2XH r0 = X.C1462879o.A04
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00f7
            java.lang.String r3 = r9.toString()
            goto L_0x00da
        L_0x0181:
            java.lang.String r3 = "resuming_sender"
            goto L_0x00da
        L_0x0185:
            X.7kU r8 = r8.A00()
            X.8Zq r8 = (X.C175768Zq) r8
            if (r8 != 0) goto L_0x00ad
        L_0x018d:
            int r0 = r6.length()
            if (r0 != 0) goto L_0x019b
            java.lang.String r0 = "Char sequence is empty."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        L_0x019b:
            int r0 = r6.length()
            int r0 = r0 + -1
            char r0 = r6.charAt(r0)
            if (r0 != r7) goto L_0x01b0
            int r1 = r6.length()
            r0 = 1
            int r1 = r1 - r0
            r6.deleteCharAt(r1)
        L_0x01b0:
            java.lang.String r0 = X.AnonymousClass000.A0f(r6)
            return r0
        L_0x01b5:
            java.util.NoSuchElementException r1 = X.AnonymousClass6CA.A0c()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PR.toString():java.lang.String");
    }
}
