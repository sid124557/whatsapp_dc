package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.46p  reason: invalid class name and case insensitive filesystem */
public final class C832246p extends C54752pE implements C85524Gp, C85554Gs, C85514Go {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C832246p.class, Object.class, "_state");
    public int A00;
    public volatile Object _state;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = (X.C832446r[]) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r7 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r6 = r7.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r5 >= r6) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r4 = r7[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r4 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r3 = X.C832446r.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2 = r3.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r1 = X.C39432By.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r2 == r1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r0 = X.C39432By.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        if (r2 != r0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (X.AnonymousClass0H6.A00(r4, r2, r1, r3) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        if (X.AnonymousClass0H6.A00(r4, r2, r0, r3) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0054, code lost:
        ((X.AnonymousClass46G) r2).BkD(X.C59022wD.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r0 != r8) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        r7 = r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0064, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r0 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = A01     // Catch:{ all -> 0x0070 }
            java.lang.Object r2 = r3.get(r10)     // Catch:{ all -> 0x0070 }
            r1 = 0
            if (r11 == 0) goto L_0x0012
            boolean r0 = X.C162457s7.A0P(r2, r11)     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0012
            monitor-exit(r10)
            return r1
        L_0x0012:
            boolean r0 = X.C162457s7.A0P(r2, r12)     // Catch:{ all -> 0x0070 }
            r9 = 1
            if (r0 != 0) goto L_0x006e
            r3.set(r10, r12)     // Catch:{ all -> 0x0070 }
            int r1 = r10.A00     // Catch:{ all -> 0x0070 }
            r0 = r1 & 1
            if (r0 != 0) goto L_0x006a
            int r8 = r1 + 1
            r10.A00 = r8     // Catch:{ all -> 0x0070 }
            X.2dp[] r7 = r10.A03     // Catch:{ all -> 0x0070 }
            monitor-exit(r10)
        L_0x0029:
            X.46r[] r7 = (X.C832446r[]) r7
            if (r7 == 0) goto L_0x005c
            int r6 = r7.length
            r5 = 0
        L_0x002f:
            if (r5 >= r6) goto L_0x005c
            r4 = r7[r5]
            if (r4 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C832446r.A00
        L_0x0037:
            java.lang.Object r2 = r3.get(r4)
            if (r2 == 0) goto L_0x004b
            X.2XH r1 = X.C39432By.A01
            if (r2 == r1) goto L_0x004b
            X.2XH r0 = X.C39432By.A00
            if (r2 != r0) goto L_0x004e
            boolean r0 = X.AnonymousClass0H6.A00(r4, r2, r1, r3)
            if (r0 == 0) goto L_0x0037
        L_0x004b:
            int r5 = r5 + 1
            goto L_0x002f
        L_0x004e:
            boolean r0 = X.AnonymousClass0H6.A00(r4, r2, r0, r3)
            if (r0 == 0) goto L_0x0037
            X.46G r2 = (X.AnonymousClass46G) r2
            X.2wD r0 = X.C59022wD.A00
            r2.BkD(r0)
            goto L_0x004b
        L_0x005c:
            monitor-enter(r10)
            int r0 = r10.A00     // Catch:{ all -> 0x0070 }
            if (r0 != r8) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            X.2dp[] r7 = r10.A03     // Catch:{ all -> 0x0070 }
            monitor-exit(r10)
            r8 = r0
            goto L_0x0029
        L_0x0067:
            int r0 = r8 + 1
            goto L_0x006c
        L_0x006a:
            int r0 = r1 + 2
        L_0x006c:
            r10.A00 = r0     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r10)
            return r9
        L_0x0070:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C832246p.A04(java.lang.Object, java.lang.Object):boolean");
    }

    public AnonymousClass4C8 B3e(C85494Gl r3, C369720l r4, int i) {
        if ((i >= 0 || (i != -2 && i == -3)) && r4 == C369720l.SUSPEND) {
            return this;
        }
        return new C832846v(r3, r4, this, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
        if (X.C59022wD.A00 != r9) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[ADDED_TO_REGION, Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d8 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Az8(X.C84814Du r14, X.AnonymousClass4C9 r15) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C74683hW
            if (r0 == 0) goto L_0x0037
            r8 = r14
            X.3hW r8 = (X.C74683hW) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0037
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r10 = r8.result
            X.218 r9 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r12 = 0
            r7 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0066
            if (r0 == r1) goto L_0x0059
            if (r0 == r6) goto L_0x0046
            if (r0 != r7) goto L_0x0041
            java.lang.Object r5 = r8.L$4
            java.lang.Object r4 = r8.L$3
            X.4Gj r4 = (X.C85474Gj) r4
            java.lang.Object r3 = r8.L$2
            X.2dp r3 = (X.C47792dp) r3
            java.lang.Object r15 = r8.L$1
            X.4C9 r15 = (X.AnonymousClass4C9) r15
            java.lang.Object r2 = r8.L$0
            X.2pE r2 = (X.C54752pE) r2
            goto L_0x003d
        L_0x0037:
            X.3hW r8 = new X.3hW
            r8.<init>(r14, r13)
            goto L_0x0012
        L_0x003d:
            X.C57682u2.A01(r10)     // Catch:{ all -> 0x0101 }
            goto L_0x0091
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0046:
            java.lang.Object r5 = r8.L$4
            java.lang.Object r4 = r8.L$3
            X.4Gj r4 = (X.C85474Gj) r4
            java.lang.Object r3 = r8.L$2
            X.2dp r3 = (X.C47792dp) r3
            java.lang.Object r15 = r8.L$1
            X.4C9 r15 = (X.AnonymousClass4C9) r15
            java.lang.Object r2 = r8.L$0
            X.2pE r2 = (X.C54752pE) r2
            goto L_0x00c6
        L_0x0059:
            java.lang.Object r3 = r8.L$2
            X.2dp r3 = (X.C47792dp) r3
            java.lang.Object r15 = r8.L$1
            X.4C9 r15 = (X.AnonymousClass4C9) r15
            java.lang.Object r2 = r8.L$0
            X.2pE r2 = (X.C54752pE) r2
            goto L_0x0085
        L_0x0066:
            X.C57682u2.A01(r10)
            X.2dp r3 = r13.A02()
            boolean r0 = r15 instanceof X.C72853eP     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x0083
            r0 = r15
            X.3eP r0 = (X.C72853eP) r0     // Catch:{ all -> 0x00fe }
            r8.L$0 = r13     // Catch:{ all -> 0x00fe }
            r8.L$1 = r15     // Catch:{ all -> 0x00fe }
            r8.L$2 = r3     // Catch:{ all -> 0x00fe }
            r8.label = r1     // Catch:{ all -> 0x00fe }
            java.lang.Object r0 = r0.A00(r8)     // Catch:{ all -> 0x00fe }
            if (r0 != r9) goto L_0x0083
            return r9
        L_0x0083:
            r2 = r13
            goto L_0x0088
        L_0x0085:
            X.C57682u2.A01(r10)     // Catch:{ all -> 0x0101 }
        L_0x0088:
            X.4Gl r0 = r8.B5w()     // Catch:{ all -> 0x0101 }
            X.4Gj r4 = X.C18310x6.A0v(r0)     // Catch:{ all -> 0x0101 }
            r5 = r12
        L_0x0091:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01     // Catch:{ all -> 0x0101 }
            java.lang.Object r10 = r0.get(r2)     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x00a4
            boolean r0 = r4.BGz()     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00a4
            java.util.concurrent.CancellationException r0 = r4.B5G()     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x00a4:
            if (r5 == 0) goto L_0x00ac
            boolean r0 = r5.equals(r10)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00c9
        L_0x00ac:
            X.2XH r1 = X.AnonymousClass2C3.A01     // Catch:{ all -> 0x0101 }
            r0 = r10
            if (r10 != r1) goto L_0x00b2
            r0 = r12
        L_0x00b2:
            r8.L$0 = r2     // Catch:{ all -> 0x0101 }
            r8.L$1 = r15     // Catch:{ all -> 0x0101 }
            r8.L$2 = r3     // Catch:{ all -> 0x0101 }
            r8.L$3 = r4     // Catch:{ all -> 0x0101 }
            r8.L$4 = r10     // Catch:{ all -> 0x0101 }
            r8.label = r6     // Catch:{ all -> 0x0101 }
            java.lang.Object r0 = r15.B2K(r0, r8)     // Catch:{ all -> 0x0101 }
            if (r0 == r9) goto L_0x00fd
            r5 = r10
            goto L_0x00c9
        L_0x00c6:
            X.C57682u2.A01(r10)     // Catch:{ all -> 0x0101 }
        L_0x00c9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = X.C832446r.A00     // Catch:{ all -> 0x0101 }
            X.2XH r10 = X.C39432By.A00     // Catch:{ all -> 0x0101 }
            java.lang.Object r1 = r11.getAndSet(r3, r10)     // Catch:{ all -> 0x0101 }
            X.C162457s7.A0H(r1)     // Catch:{ all -> 0x0101 }
            X.2XH r0 = X.C39432By.A01     // Catch:{ all -> 0x0101 }
            if (r1 == r0) goto L_0x0091
            r8.L$0 = r2     // Catch:{ all -> 0x0101 }
            r8.L$1 = r15     // Catch:{ all -> 0x0101 }
            r8.L$2 = r3     // Catch:{ all -> 0x0101 }
            r8.L$3 = r4     // Catch:{ all -> 0x0101 }
            r8.L$4 = r5     // Catch:{ all -> 0x0101 }
            r8.label = r7     // Catch:{ all -> 0x0101 }
            X.46G r1 = X.C57702u4.A03(r8)     // Catch:{ all -> 0x0101 }
            boolean r0 = X.AnonymousClass0H6.A00(r3, r10, r1, r11)     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x00f3
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0101 }
            r1.BkD(r0)     // Catch:{ all -> 0x0101 }
        L_0x00f3:
            java.lang.Object r0 = r1.A06()     // Catch:{ all -> 0x0101 }
            if (r0 == r9) goto L_0x00fd
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0101 }
            if (r0 != r9) goto L_0x0091
        L_0x00fd:
            return r9
        L_0x00fe:
            r0 = move-exception
            r2 = r13
            goto L_0x0102
        L_0x0101:
            r0 = move-exception
        L_0x0102:
            r2.A03(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C832246p.Az8(X.4Du, X.4C9):java.lang.Object");
    }

    public boolean AzD(Object obj, Object obj2) {
        if (obj == null) {
            obj = AnonymousClass2C3.A01;
        }
        if (obj2 == null) {
            obj2 = AnonymousClass2C3.A01;
        }
        return A04(obj, obj2);
    }

    public void Bjz() {
        throw AnonymousClass002.A0G("MutableStateFlow.resetReplayCache is not supported");
    }

    public Object getValue() {
        AnonymousClass2XH r1 = AnonymousClass2C3.A01;
        Object obj = A01.get(this);
        if (obj == r1) {
            return null;
        }
        return obj;
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = AnonymousClass2C3.A01;
        }
        A04((Object) null, obj);
    }

    public C832246p(Object obj) {
        this._state = obj;
    }

    public Object B2K(Object obj, C84814Du r3) {
        setValue(obj);
        return C59022wD.A00;
    }

    public boolean BrA(Object obj) {
        setValue(obj);
        return true;
    }
}
