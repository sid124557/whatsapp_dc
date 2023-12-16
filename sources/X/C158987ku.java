package X;

import android.content.Context;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7ku  reason: invalid class name and case insensitive filesystem */
public final class C158987ku {
    public static final AtomicInteger A0J = AnonymousClass6CA.A0d();
    public int A00 = -1;
    public int A01 = -1;
    public int A02;
    public int A03;
    public long A04 = C157087hi.A00.A00(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public AnonymousClass6NJ A05;
    public C180488l9 A06;
    public C160247nJ A07;
    public C151847Wn A08;
    public AnonymousClass6NI A09;
    public C151097Tk A0A;
    public C146727Bj A0B;
    public Object A0C;
    public boolean A0D;
    public final Context A0E;
    public final C124696Dn A0F;
    public final C147897Gd A0G;
    public final Object A0H;
    public final List A0I = AnonymousClass001.A0s();

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        r1 = r8.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        if (X.C162457s7.A0P(r1.A01, r4) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b2, code lost:
        if (r4 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b4, code lost:
        r1.A04.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r1.A01 = r4;
        r1.A03.requestLayout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r8 = this;
            monitor-enter(r8)
            X.7Gd r1 = r8.A0G     // Catch:{ all -> 0x00c1 }
            X.7nJ r0 = r8.A07     // Catch:{ all -> 0x00c1 }
            r4 = 0
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x00c1 }
        L_0x000a:
            X.7Ge r0 = (X.C147907Ge) r0     // Catch:{ all -> 0x00c1 }
            r1.A00 = r0     // Catch:{ all -> 0x00c1 }
            X.7oM r1 = r1.A01     // Catch:{ all -> 0x00c1 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x00c1 }
            X.7P6 r2 = r0.A01     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "Committing Variables and Bound tree is only supported from the UI Thread"
            X.C161827qc.A03(r0)     // Catch:{ all -> 0x00c1 }
            r1.A05 = r2     // Catch:{ all -> 0x00c1 }
            java.util.Map r0 = r2.A06     // Catch:{ all -> 0x00c1 }
            r1.A09 = r0     // Catch:{ all -> 0x00c1 }
            java.lang.ref.WeakReference r0 = r1.A08     // Catch:{ all -> 0x00c1 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x00c1 }
            X.7bI r7 = (X.C153427bI) r7     // Catch:{ all -> 0x00c1 }
            java.util.List r0 = r1.A0G     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00c1 }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x003e
            r1.next()     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "onCommit"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)     // Catch:{ all -> 0x00c1 }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x003e:
            if (r7 == 0) goto L_0x008a
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0046:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x00c1 }
            X.7K7 r1 = (X.AnonymousClass7K7) r1     // Catch:{ all -> 0x00c1 }
            X.84O r0 = r1.A01     // Catch:{ all -> 0x00c1 }
            java.lang.Object r5 = X.C162377rs.A05(r7, r0)     // Catch:{ all -> 0x00c1 }
            if (r5 != 0) goto L_0x0062
            java.lang.String r1 = "BloksTreeManager"
            java.lang.String r0 = "Binding was targeting a controller but the returned controller was null"
        L_0x005e:
            X.C159737mN.A01(r1, r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x0046
        L_0x0062:
            int r3 = r0.A03     // Catch:{ all -> 0x00c1 }
            int r2 = r1.A00     // Catch:{ all -> 0x00c1 }
            java.lang.Object r1 = r1.A02     // Catch:{ all -> 0x00c1 }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r3 != r0) goto L_0x007a
            X.8Cv r5 = (X.C170348Cv) r5     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = "ViewTransformsBindControllerOverride"
            java.lang.String r0 = "Trying to set null value for a view transform property"
            goto L_0x005e
        L_0x0075:
            r0 = 0
            r5.Blj(r0, r1, r2)     // Catch:{ all -> 0x00c1 }
            goto L_0x0046
        L_0x007a:
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()     // Catch:{ all -> 0x00c1 }
            X.C18270x1.A1Q(r1, r3)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass6C7.A0W(r0, r1)     // Catch:{ all -> 0x00c1 }
            goto L_0x003d
        L_0x0088:
            r0 = r4
            goto L_0x000a
        L_0x008a:
            X.7Wn r1 = r8.A08     // Catch:{ all -> 0x00c1 }
            X.7nJ r0 = r8.A07     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x0097
            X.7Wn r0 = r0.A02     // Catch:{ all -> 0x00c1 }
        L_0x0092:
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x0099
        L_0x0097:
            r0 = r4
            goto L_0x0092
        L_0x0099:
            if (r0 == 0) goto L_0x009d
            monitor-exit(r8)
        L_0x009c:
            return
        L_0x009d:
            X.7nJ r0 = r8.A07     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00a3
            X.7Wn r4 = r0.A02     // Catch:{ all -> 0x00c1 }
        L_0x00a3:
            r8.A08 = r4     // Catch:{ all -> 0x00c1 }
            monitor-exit(r8)
            X.7Tk r1 = r8.A0A
            if (r1 == 0) goto L_0x009c
            X.7Wn r0 = r1.A01
            boolean r0 = X.C162457s7.A0P(r0, r4)
            if (r0 != 0) goto L_0x009c
            if (r4 != 0) goto L_0x00b9
            X.7lF r0 = r1.A04
            r0.A04()
        L_0x00b9:
            r1.A01 = r4
            X.6Ep r0 = r1.A03
            r0.requestLayout()
            return
        L_0x00c1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158987ku.A00():void");
    }

    public void A01(C147917Gf r4) {
        C146727Bj r0;
        synchronized (this) {
            this.A0I.add(r4);
            r0 = this.A0B;
        }
        if (r0 != null) {
            C124696Dn r2 = this.A0F;
            if (!r2.hasMessages(100)) {
                r2.sendEmptyMessage(100);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r1.A01 == r12.A04) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r5 = r6.A00();
        X.C162457s7.A0D(r5);
        r5 = (X.C160247nJ) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (X.AnonymousClass000.A1T((r6.A01 > r12.A04 ? 1 : (r6.A01 == r12.A04 ? 0 : -1))) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (r1 <= r12.A00) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (X.C162457s7.A0P(r12.A07, r5) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        r12.A00 = r1;
        r12.A07 = r5;
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (X.C162457s7.A0P(r12.A05, r6) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r12.A05 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        if (r13 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        r1 = r5.A02;
        r13[0] = r1.A02();
        r13[1] = r1.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        if (X.C161827qc.A04() == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        r2 = r12.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (r2.hasMessages(99) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        r2.sendEmptyMessage(99);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(int[] r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.A0D     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0007
            goto L_0x00a0
        L_0x0007:
            X.8l9 r5 = r12.A06     // Catch:{ all -> 0x00b0 }
            if (r5 == 0) goto L_0x00a9
            X.6NJ r1 = r12.A05     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x0024
            X.8l9 r0 = r1.A02     // Catch:{ all -> 0x00b0 }
            boolean r0 = X.C162457s7.A0P(r0, r5)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0024
            long r3 = r12.A04     // Catch:{ all -> 0x00b0 }
            long r1 = r1.A01     // Catch:{ all -> 0x00b0 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
        L_0x001f:
            X.6NJ r6 = r12.A05     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x00a2
            goto L_0x003c
        L_0x0024:
            android.content.Context r4 = r12.A0E     // Catch:{ all -> 0x00b0 }
            java.lang.Object r7 = r12.A0H     // Catch:{ all -> 0x00b0 }
            java.lang.Object r8 = r12.A0C     // Catch:{ all -> 0x00b0 }
            int r9 = r12.A02     // Catch:{ all -> 0x00b0 }
            int r0 = r9 + 1
            r12.A02 = r0     // Catch:{ all -> 0x00b0 }
            X.7nJ r6 = r12.A07     // Catch:{ all -> 0x00b0 }
            long r10 = r12.A04     // Catch:{ all -> 0x00b0 }
            X.6NJ r3 = new X.6NJ     // Catch:{ all -> 0x00b0 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00b0 }
            r12.A05 = r3     // Catch:{ all -> 0x00b0 }
            goto L_0x001f
        L_0x003c:
            monitor-exit(r12)
            java.lang.Object r5 = r6.A00()
            X.C162457s7.A0D(r5)
            X.7nJ r5 = (X.C160247nJ) r5
            monitor-enter(r12)
            long r2 = r12.A04     // Catch:{ all -> 0x00b0 }
            long r0 = r6.A01     // Catch:{ all -> 0x00b0 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1T(r4)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0069
            int r1 = r6.A00     // Catch:{ all -> 0x00b0 }
            int r0 = r12.A00     // Catch:{ all -> 0x00b0 }
            if (r1 <= r0) goto L_0x0069
            X.7nJ r0 = r12.A07     // Catch:{ all -> 0x00b0 }
            boolean r0 = X.C162457s7.A0P(r0, r5)     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0069
            r12.A00 = r1     // Catch:{ all -> 0x00b0 }
            r12.A07 = r5     // Catch:{ all -> 0x00b0 }
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            X.6NJ r0 = r12.A05     // Catch:{ all -> 0x00b0 }
            boolean r1 = X.C162457s7.A0P(r0, r6)     // Catch:{ all -> 0x00b0 }
            r0 = 0
            if (r1 == 0) goto L_0x0075
            r12.A05 = r0     // Catch:{ all -> 0x00b0 }
        L_0x0075:
            monitor-exit(r12)
            if (r13 == 0) goto L_0x0086
            X.7Wn r1 = r5.A02
            int r0 = r1.A02()
            r13[r4] = r0
            int r0 = r1.A01()
            r13[r3] = r0
        L_0x0086:
            if (r2 == 0) goto L_0x00a1
            boolean r0 = X.C161827qc.A04()
            if (r0 == 0) goto L_0x0092
            r12.A00()
            return
        L_0x0092:
            X.6Dn r2 = r12.A0F
            r1 = 99
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L_0x00a1
            r2.sendEmptyMessage(r1)
            return
        L_0x00a0:
            monitor-exit(r12)
        L_0x00a1:
            return
        L_0x00a2:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00af
        L_0x00a9:
            java.lang.String r0 = "Tried executing the layout step before resolving a tree"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158987ku.A03(int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (r1 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        r0 = r1.A00();
        X.C162457s7.A0D(r0);
        A05(r1, (X.C158047jL) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int[] r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.A0D     // Catch:{ all -> 0x0077 }
            r3 = 1
            if (r0 == 0) goto L_0x0016
            long r1 = r4.A04     // Catch:{ all -> 0x0077 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
        L_0x000c:
            X.7Wn r1 = r4.A08     // Catch:{ all -> 0x0077 }
            r2 = 0
            if (r1 == 0) goto L_0x002c
            boolean r0 = X.C151847Wn.A00(r1, r6)     // Catch:{ all -> 0x0077 }
            goto L_0x001b
        L_0x0016:
            r4.A0D = r3     // Catch:{ all -> 0x0077 }
            r4.A04 = r6     // Catch:{ all -> 0x0077 }
            goto L_0x000c
        L_0x001b:
            if (r0 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x0056
            int r0 = r1.A02()     // Catch:{ all -> 0x0077 }
            r5[r2] = r0     // Catch:{ all -> 0x0077 }
            int r0 = r1.A01()     // Catch:{ all -> 0x0077 }
            r5[r3] = r0     // Catch:{ all -> 0x0077 }
            goto L_0x0056
        L_0x002c:
            X.7nJ r1 = r4.A07     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x004c
            X.7Wn r0 = r1.A02     // Catch:{ all -> 0x0077 }
            boolean r0 = X.C151847Wn.A00(r0, r6)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x004c
            r4.A00()     // Catch:{ all -> 0x0077 }
            if (r5 == 0) goto L_0x0056
            X.7Wn r1 = r1.A02     // Catch:{ all -> 0x0077 }
            int r0 = r1.A02()     // Catch:{ all -> 0x0077 }
            r5[r2] = r0     // Catch:{ all -> 0x0077 }
            int r0 = r1.A01()     // Catch:{ all -> 0x0077 }
            r5[r3] = r0     // Catch:{ all -> 0x0077 }
            goto L_0x0056
        L_0x004c:
            X.7Bj r0 = r4.A0B     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0058
            if (r5 == 0) goto L_0x0056
            r5[r2] = r2     // Catch:{ all -> 0x0077 }
            r5[r3] = r2     // Catch:{ all -> 0x0077 }
        L_0x0056:
            monitor-exit(r4)
            return
        L_0x0058:
            X.8l9 r0 = r4.A06     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            X.6NI r1 = r4.A09     // Catch:{ all -> 0x0077 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0077 }
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0073
            java.lang.Object r0 = r1.A00()
            X.C162457s7.A0D(r0)
            X.7jL r0 = (X.C158047jL) r0
            r4.A05(r1, r0)
        L_0x0073:
            r4.A03(r5)
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158987ku.A04(int[], long):void");
    }

    public final synchronized boolean A05(AnonymousClass6NI r3, C158047jL r4) {
        boolean z;
        int i = r3.A00;
        if (i > this.A01) {
            this.A01 = i;
            this.A06 = r4.A00;
            this.A0C = r4.A01;
            this.A0I.removeAll(r3.A01);
            z = true;
        } else {
            z = false;
        }
        if (C162457s7.A0P(this.A09, r3)) {
            this.A09 = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r12 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        X.AnonymousClass8MF.A01(r2, r10, r12, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r0 = r3.A00();
        X.C162457s7.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (A05(r3, (X.C158047jL) r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        A03((int[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C146727Bj r11, java.util.concurrent.Executor r12) {
        /*
            r10 = this;
            X.3Yy r2 = new X.3Yy
            r2.<init>()
            monitor-enter(r10)
            if (r11 != 0) goto L_0x0012
            java.util.List r0 = r10.A0I     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r10)
            return
        L_0x0012:
            r10.A0B = r11     // Catch:{ all -> 0x0066 }
        L_0x0014:
            X.7Bj r6 = r10.A0B     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r0 = r10.A0H     // Catch:{ all -> 0x0066 }
            X.7S1 r5 = new X.7S1     // Catch:{ all -> 0x0066 }
            r5.<init>(r10, r0)     // Catch:{ all -> 0x0066 }
            X.8l9 r4 = r10.A06     // Catch:{ all -> 0x0066 }
            java.lang.Object r7 = r10.A0C     // Catch:{ all -> 0x0066 }
            java.util.List r1 = r10.A0I     // Catch:{ all -> 0x0066 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x003d
            X.3d3 r8 = X.C72023d3.A00     // Catch:{ all -> 0x0066 }
        L_0x002d:
            int r9 = r10.A03     // Catch:{ all -> 0x0066 }
            int r0 = r9 + 1
            r10.A03 = r0     // Catch:{ all -> 0x0066 }
            X.6NI r3 = new X.6NI     // Catch:{ all -> 0x0066 }
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0066 }
            r2.element = r3     // Catch:{ all -> 0x0066 }
            r10.A09 = r3     // Catch:{ all -> 0x0066 }
            goto L_0x0042
        L_0x003d:
            java.util.ArrayList r8 = X.AnonymousClass002.A0J(r1)     // Catch:{ all -> 0x0066 }
            goto L_0x002d
        L_0x0042:
            monitor-exit(r10)
            if (r12 == 0) goto L_0x004b
            r0 = 13
            X.AnonymousClass8MF.A01(r2, r10, r12, r0)
        L_0x004a:
            return
        L_0x004b:
            java.lang.Object r0 = r3.A00()
            X.C162457s7.A0D(r0)
            X.7jL r0 = (X.C158047jL) r0
            boolean r0 = r10.A05(r3, r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            r10.A03(r0)
            return
        L_0x005f:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158987ku.A02(X.7Bj, java.util.concurrent.Executor):void");
    }

    public C158987ku(Context context, C147897Gd r5, Object obj) {
        this.A0E = context;
        this.A0G = r5;
        this.A0H = obj;
        Looper mainLooper = Looper.getMainLooper();
        C162457s7.A0D(mainLooper);
        this.A0F = new C124696Dn(mainLooper, this);
        A0J.incrementAndGet();
    }
}
