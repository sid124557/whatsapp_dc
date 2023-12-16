package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.46L  reason: invalid class name */
public abstract class AnonymousClass46L extends AnonymousClass46M implements C84824Dv {
    public static final AtomicIntegerFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public static final AtomicReferenceFieldUpdater A02;
    public volatile Object _delayed;
    public volatile int _isCompleted = 0;
    public volatile Object _queue;

    static {
        Class<AnonymousClass46L> cls = AnonymousClass46L.class;
        Class<Object> cls2 = Object.class;
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        A00 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    public void A05() {
        C834648m r0;
        boolean A002;
        C57992uX.A00.set((Object) null);
        A00.set(this, 1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A02;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof AnonymousClass309)) {
                    if (obj == C39422Bx.A00) {
                        break;
                    }
                    AnonymousClass309 r02 = new AnonymousClass309(8, true);
                    r02.A00(obj);
                    A002 = AnonymousClass0H6.A00(this, obj, r02, atomicReferenceFieldUpdater);
                    continue;
                } else {
                    ((AnonymousClass309) obj).A04();
                    break;
                }
            } else {
                A002 = AnonymousClass0H6.A00(this, (Object) null, C39422Bx.A00, atomicReferenceFieldUpdater);
                continue;
            }
            if (A002) {
                break;
            }
        }
        do {
        } while (A04() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C60632ys r4 = (C60632ys) A01.get(this);
            if (r4 != null) {
                synchronized (r4) {
                    r0 = null;
                    if (C60632ys.A01.get(r4) > 0) {
                        r0 = r4.A01(0);
                    }
                }
                C71783cf r03 = (C71783cf) r0;
                if (r03 != null) {
                    A0A(r03, nanoTime);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.3cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: X.3cf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.3cf} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if ((r12 - r0) > 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b4, code lost:
        r2 = (X.C60632ys) r5.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1 = r2.A00;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c0, code lost:
        if (r1 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c2, code lost:
        r0 = r1[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c5, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c6, code lost:
        if (r0 != r11) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c8, code lost:
        r1 = A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d0, code lost:
        if (java.lang.Thread.currentThread() == r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d2, code lost:
        java.util.concurrent.locks.LockSupport.unpark(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.C71783cf r11, long r12) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = A00
            int r0 = r2.get(r10)
            if (r0 != 0) goto L_0x00e7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = A01
            java.lang.Object r3 = r5.get(r10)
            X.479 r3 = (X.AnonymousClass479) r3
            if (r3 != 0) goto L_0x0024
            X.479 r1 = new X.479
            r1.<init>(r12)
            r0 = 0
            X.AnonymousClass0H6.A00(r10, r0, r1, r5)
            java.lang.Object r3 = r5.get(r10)
            X.C162457s7.A0H(r3)
            X.479 r3 = (X.AnonymousClass479) r3
        L_0x0024:
            monitor-enter(r11)
            java.lang.Object r0 = r11._heap     // Catch:{ all -> 0x00e3 }
            X.2XH r4 = X.C39422Bx.A01     // Catch:{ all -> 0x00e3 }
            if (r0 != r4) goto L_0x002d
            monitor-exit(r11)
            return
        L_0x002d:
            monitor-enter(r3)     // Catch:{ all -> 0x00e3 }
            X.48m[] r1 = r3.A00     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x003e
            r0 = 0
            r1 = r1[r0]     // Catch:{ all -> 0x00e0 }
        L_0x0035:
            X.3cf r1 = (X.C71783cf) r1     // Catch:{ all -> 0x00e0 }
            int r0 = r2.get(r10)     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0043
            goto L_0x0040
        L_0x003e:
            r1 = 0
            goto L_0x0035
        L_0x0040:
            monitor-exit(r3)     // Catch:{ all -> 0x00e3 }
            goto L_0x00e6
        L_0x0043:
            r8 = 0
            if (r1 == 0) goto L_0x0058
            long r0 = r1.A01     // Catch:{ all -> 0x00e0 }
            long r6 = r0 - r12
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0050
            r12 = r0
        L_0x0050:
            long r0 = r3.A00     // Catch:{ all -> 0x00e0 }
            long r6 = r12 - r0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x005b
        L_0x0058:
            r3.A00 = r12     // Catch:{ all -> 0x00e0 }
            r0 = r12
        L_0x005b:
            long r6 = r11.A01     // Catch:{ all -> 0x00e0 }
            long r6 = r6 - r0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0064
            r11.A01 = r0     // Catch:{ all -> 0x00e0 }
        L_0x0064:
            java.lang.Object r0 = r11._heap     // Catch:{ all -> 0x00e0 }
            if (r0 == r4) goto L_0x00d9
            r11._heap = r3     // Catch:{ all -> 0x00e0 }
            X.48m[] r0 = r3.A00     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x0083
            r0 = 4
            X.48m[] r0 = new X.C834648m[r0]     // Catch:{ all -> 0x00e0 }
        L_0x0071:
            r3.A00 = r0     // Catch:{ all -> 0x00e0 }
        L_0x0073:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.C60632ys.A01     // Catch:{ all -> 0x00e0 }
            int r4 = r2.get(r3)     // Catch:{ all -> 0x00e0 }
            int r1 = r4 + 1
            r2.set(r3, r1)     // Catch:{ all -> 0x00e0 }
            r0[r4] = r11     // Catch:{ all -> 0x00e0 }
            r11.A00 = r4     // Catch:{ all -> 0x00e0 }
            goto L_0x009c
        L_0x0083:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = X.C60632ys.A01     // Catch:{ all -> 0x00e0 }
            int r2 = r4.get(r3)     // Catch:{ all -> 0x00e0 }
            int r1 = r0.length     // Catch:{ all -> 0x00e0 }
            if (r2 < r1) goto L_0x0073
            int r1 = r4.get(r3)     // Catch:{ all -> 0x00e0 }
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x00e0 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x00e0 }
            X.48m[] r0 = (X.C834648m[]) r0     // Catch:{ all -> 0x00e0 }
            goto L_0x0071
        L_0x009c:
            if (r4 <= 0) goto L_0x00b2
            X.48m[] r2 = r3.A00     // Catch:{ all -> 0x00e0 }
            X.C162457s7.A0H(r2)     // Catch:{ all -> 0x00e0 }
            int r0 = r4 + -1
            int r1 = r0 / 2
            int r0 = X.C60632ys.A00(r2, r1, r4)     // Catch:{ all -> 0x00e0 }
            if (r0 <= 0) goto L_0x00b2
            r3.A02(r4, r1)     // Catch:{ all -> 0x00e0 }
            r4 = r1
            goto L_0x009c
        L_0x00b2:
            monitor-exit(r3)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)
            java.lang.Object r2 = r5.get(r10)
            X.2ys r2 = (X.C60632ys) r2
            if (r2 == 0) goto L_0x00ea
            monitor-enter(r2)
            X.48m[] r1 = r2.A00     // Catch:{ all -> 0x00d6 }
            r0 = 0
            if (r1 == 0) goto L_0x00c5
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x00d6 }
        L_0x00c5:
            monitor-exit(r2)
            if (r0 != r11) goto L_0x00ea
            java.lang.Thread r1 = r10.A09()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L_0x00ea
            java.util.concurrent.locks.LockSupport.unpark(r1)
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d9:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x00e0 }
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x00e6:
            monitor-exit(r11)
        L_0x00e7:
            r10.A0A(r11, r12)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass46L.A0C(X.3cf, long):void");
    }

    public boolean A0D() {
        boolean z;
        Object obj;
        C73693fv r0 = this.A01;
        if (r0 != null) {
            z = r0.isEmpty();
        } else {
            z = true;
        }
        if (z && ((obj = A01.get(this)) == null || C60632ys.A01.get(obj) == 0)) {
            Object obj2 = A02.get(this);
            if (obj2 == null) {
                return true;
            }
            if (obj2 instanceof AnonymousClass309) {
                long j = AnonymousClass309.A04.get(obj2);
                if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    return true;
                }
                return false;
            } else if (obj2 == C39422Bx.A00) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(java.lang.Runnable r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = A02
        L_0x0002:
            java.lang.Object r5 = r4.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = A00
            int r0 = r0.get(r6)
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r1 = 0
            if (r0 != 0) goto L_0x004f
            r3 = 1
            if (r5 != 0) goto L_0x001e
            r0 = 0
            boolean r0 = X.AnonymousClass0H6.A00(r6, r0, r7, r4)
        L_0x001b:
            if (r0 == 0) goto L_0x0002
        L_0x001d:
            return r3
        L_0x001e:
            boolean r0 = r5 instanceof X.AnonymousClass309
            if (r0 == 0) goto L_0x0039
            r2 = r5
            X.309 r2 = (X.AnonymousClass309) r2
            int r0 = r2.A00(r7)
            if (r0 == 0) goto L_0x001d
            if (r0 != r3) goto L_0x004f
            long r0 = r2.A01()
            X.309 r0 = r2.A03(r0)
            X.AnonymousClass0H6.A00(r6, r5, r0, r4)
            goto L_0x0002
        L_0x0039:
            X.2XH r0 = X.C39422Bx.A00
            if (r5 == r0) goto L_0x004f
            r1 = 8
            X.309 r0 = new X.309
            r0.<init>(r1, r3)
            r0.A00(r5)
            r0.A00(r7)
            boolean r0 = X.AnonymousClass0H6.A00(r6, r5, r0, r4)
            goto L_0x001b
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass46L.A0E(java.lang.Runnable):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 < 4611686018427387903L) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4C7 BGx(java.lang.Runnable r6, X.C85494Gl r7, long r8) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass46K
            if (r0 == 0) goto L_0x0031
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            r1 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r8
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
        L_0x0020:
            long r3 = java.lang.System.nanoTime()
            long r1 = r1 + r3
            X.46H r0 = new X.46H
            r0.<init>(r6, r1)
            r5.A0C(r0, r3)
            return r0
        L_0x002e:
            X.3eA r0 = X.C72713eA.A00
            return r0
        L_0x0031:
            X.4Dv r0 = X.C39212Bc.A00
            X.4C7 r0 = r0.BGx(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass46L.BGx(java.lang.Runnable, X.4Gl, long):X.4C7");
    }

    public void Bkq(AnonymousClass4GW r7, long j) {
        long j2 = 0;
        if (j > 0) {
            if (j < 9223372036854L) {
                j2 = SearchActionVerificationClientService.MS_TO_NS * j;
                if (j2 >= 4611686018427387903L) {
                    return;
                }
            } else {
                return;
            }
        }
        long nanoTime = System.nanoTime();
        AnonymousClass46I r3 = new AnonymousClass46I(r7, this, j2 + nanoTime);
        A0C(r3, nanoTime);
        r7.BGs(new AnonymousClass463(r3));
    }

    public void A0B(Runnable runnable) {
        if (A0E(runnable)) {
            Thread A09 = A09();
            if (Thread.currentThread() != A09) {
                LockSupport.unpark(A09);
                return;
            }
            return;
        }
        AnonymousClass46K.A01.A0B(runnable);
    }
}
