package X;

/* renamed from: X.46o  reason: invalid class name and case insensitive filesystem */
public class C832146o extends C54752pE implements C85534Gq, C85554Gs, C85514Go {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Object[] A04;
    public final int A05;
    public final int A06;
    public final C369720l A07;

    /* JADX WARNING: type inference failed for: r13v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r3 = (X.C832346q) r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C84814Du[] A0B(X.C84814Du[] r13) {
        /*
            r12 = this;
            int r7 = r13.length
            int r0 = r12.A00
            if (r0 == 0) goto L_0x003e
            X.2dp[] r6 = r12.A03
            if (r6 == 0) goto L_0x003e
            int r5 = r6.length
            r4 = 0
        L_0x000b:
            if (r4 >= r5) goto L_0x003e
            r3 = r6[r4]
            if (r3 == 0) goto L_0x003b
            X.46q r3 = (X.C832346q) r3
            X.4Du r2 = r3.A01
            if (r2 == 0) goto L_0x003b
            long r10 = r12.A04(r3)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            int r0 = r13.length
            if (r7 < r0) goto L_0x0033
            int r0 = r13.length
            r1 = 2
            int r0 = r0 * 2
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r0)
            X.C162457s7.A0D(r13)
        L_0x0033:
            int r1 = r7 + 1
            r13[r7] = r2
            r0 = 0
            r3.A01 = r0
            r7 = r1
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x003e:
            X.4Du[] r13 = (X.C84814Du[]) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C832146o.A0B(X.4Du[]):X.4Du[]");
    }

    public Object B2K(Object obj, C84814Du r13) {
        C72693e8 r5;
        Object obj2 = obj;
        if (!BrA(obj)) {
            AnonymousClass46G A032 = C57702u4.A03(r13);
            C84814Du[] r4 = C39232Be.A00;
            synchronized (this) {
                if (A09(obj)) {
                    A032.BkD(C59022wD.A00);
                    r4 = A0B(r4);
                    r5 = null;
                } else {
                    long min = Math.min(this.A02, this.A03);
                    int i = this.A00;
                    int i2 = this.A01;
                    r5 = new C72693e8(obj2, A032, this, ((long) (i + i2)) + min);
                    A08(r5);
                    this.A01 = i2 + 1;
                    if (this.A05 == 0) {
                        r4 = A0B(r4);
                    }
                }
            }
            if (r5 != null) {
                A032.BGs(new AnonymousClass463(r5));
            }
            for (C84814Du r1 : r4) {
                if (r1 != null) {
                    r1.BkD(C59022wD.A00);
                }
            }
            Object A062 = A032.A06();
            AnonymousClass218 r0 = AnonymousClass218.COROUTINE_SUSPENDED;
            if (A062 != r0) {
                A062 = C59022wD.A00;
            }
            if (A062 == r0) {
                return A062;
            }
        }
        return C59022wD.A00;
    }

    public void Bjz() {
        synchronized (this) {
            long j = this.A02;
            long min = Math.min(j, this.A03) + ((long) this.A00);
            A07(min, j, min, min + ((long) this.A01));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static /* synthetic */ java.lang.Object A01(X.C84814Du r13, X.AnonymousClass4C9 r14, X.C832146o r15) {
        /*
            boolean r0 = r13 instanceof X.C74623hQ
            if (r0 == 0) goto L_0x0028
            r8 = r13
            X.3hQ r8 = (X.C74623hQ) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r2 = r8.result
            X.218 r9 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 == r1) goto L_0x0042
            if (r0 == r6) goto L_0x002e
            if (r0 == r7) goto L_0x002e
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x0028:
            X.3hQ r8 = new X.3hQ
            r8.<init>(r13, r15)
            goto L_0x0012
        L_0x002e:
            java.lang.Object r5 = r8.L$3
            X.4Gj r5 = (X.C85474Gj) r5
            java.lang.Object r4 = r8.L$2
            X.46q r4 = (X.C832346q) r4
            java.lang.Object r14 = r8.L$1
            X.4C9 r14 = (X.AnonymousClass4C9) r14
            java.lang.Object r15 = r8.L$0
            X.46o r15 = (X.C832146o) r15
            X.C57682u2.A01(r2)     // Catch:{ all -> 0x010c }
            goto L_0x0079
        L_0x0042:
            java.lang.Object r4 = r8.L$2
            X.46q r4 = (X.C832346q) r4
            java.lang.Object r14 = r8.L$1
            X.4C9 r14 = (X.AnonymousClass4C9) r14
            java.lang.Object r15 = r8.L$0
            X.46o r15 = (X.C832146o) r15
            goto L_0x006e
        L_0x004f:
            X.C57682u2.A01(r2)
            X.2dp r4 = r15.A02()
            X.46q r4 = (X.C832346q) r4
            boolean r0 = r14 instanceof X.C72853eP     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x0071
            r0 = r14
            X.3eP r0 = (X.C72853eP) r0     // Catch:{ all -> 0x010c }
            r8.L$0 = r15     // Catch:{ all -> 0x010c }
            r8.L$1 = r14     // Catch:{ all -> 0x010c }
            r8.L$2 = r4     // Catch:{ all -> 0x010c }
            r8.label = r1     // Catch:{ all -> 0x010c }
            java.lang.Object r0 = r0.A00(r8)     // Catch:{ all -> 0x010c }
            if (r0 != r9) goto L_0x0071
            return r9
        L_0x006e:
            X.C57682u2.A01(r2)     // Catch:{ all -> 0x010c }
        L_0x0071:
            X.4Gl r0 = r8.B5w()     // Catch:{ all -> 0x010c }
            X.4Gj r5 = X.C18310x6.A0v(r0)     // Catch:{ all -> 0x010c }
        L_0x0079:
            X.4Du[] r11 = X.C39232Be.A00     // Catch:{ all -> 0x010c }
            monitor-enter(r15)     // Catch:{ all -> 0x010c }
            long r2 = r15.A04(r4)     // Catch:{ all -> 0x0109 }
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            X.2XH r10 = X.C39222Bd.A00     // Catch:{ all -> 0x0109 }
            goto L_0x00a8
        L_0x0089:
            long r0 = r4.A00     // Catch:{ all -> 0x0109 }
            java.lang.Object[] r12 = r15.A04     // Catch:{ all -> 0x0109 }
            X.C162457s7.A0H(r12)     // Catch:{ all -> 0x0109 }
            int r11 = (int) r2     // Catch:{ all -> 0x0109 }
            int r10 = r12.length     // Catch:{ all -> 0x0109 }
            int r10 = r10 + -1
            r10 = r10 & r11
            r10 = r12[r10]     // Catch:{ all -> 0x0109 }
            boolean r11 = r10 instanceof X.C72693e8     // Catch:{ all -> 0x0109 }
            if (r11 == 0) goto L_0x009f
            X.3e8 r10 = (X.C72693e8) r10     // Catch:{ all -> 0x0109 }
            java.lang.Object r10 = r10.A01     // Catch:{ all -> 0x0109 }
        L_0x009f:
            r11 = 1
            long r2 = r2 + r11
            r4.A00 = r2     // Catch:{ all -> 0x0109 }
            X.4Du[] r11 = r15.A0A(r0)     // Catch:{ all -> 0x0109 }
        L_0x00a8:
            monitor-exit(r15)     // Catch:{ all -> 0x010c }
            int r3 = r11.length     // Catch:{ all -> 0x010c }
            r2 = 0
        L_0x00ab:
            if (r2 >= r3) goto L_0x00b9
            r1 = r11[r2]     // Catch:{ all -> 0x010c }
            if (r1 == 0) goto L_0x00b6
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x010c }
            r1.BkD(r0)     // Catch:{ all -> 0x010c }
        L_0x00b6:
            int r2 = r2 + 1
            goto L_0x00ab
        L_0x00b9:
            X.2XH r0 = X.C39222Bd.A00     // Catch:{ all -> 0x010c }
            if (r10 != r0) goto L_0x00eb
            r8.L$0 = r15     // Catch:{ all -> 0x010c }
            r8.L$1 = r14     // Catch:{ all -> 0x010c }
            r8.L$2 = r4     // Catch:{ all -> 0x010c }
            r8.L$3 = r5     // Catch:{ all -> 0x010c }
            r8.label = r6     // Catch:{ all -> 0x010c }
            X.46G r3 = X.C57702u4.A03(r8)     // Catch:{ all -> 0x010c }
            monitor-enter(r15)     // Catch:{ all -> 0x010c }
            long r10 = r15.A04(r4)     // Catch:{ all -> 0x0109 }
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00db
            r4.A01 = r3     // Catch:{ all -> 0x0109 }
        L_0x00d8:
            X.2wD r1 = X.C59022wD.A00     // Catch:{ all -> 0x0109 }
            goto L_0x00e1
        L_0x00db:
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x0109 }
            r3.BkD(r0)     // Catch:{ all -> 0x0109 }
            goto L_0x00d8
        L_0x00e1:
            monitor-exit(r15)     // Catch:{ all -> 0x010c }
            java.lang.Object r0 = r3.A06()     // Catch:{ all -> 0x010c }
            if (r0 == r9) goto L_0x00ea
            if (r1 != r9) goto L_0x0079
        L_0x00ea:
            return r9
        L_0x00eb:
            if (r5 == 0) goto L_0x00f8
            boolean r0 = r5.BGz()     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x00f8
            java.util.concurrent.CancellationException r0 = r5.B5G()     // Catch:{ all -> 0x010c }
            goto L_0x010b
        L_0x00f8:
            r8.L$0 = r15     // Catch:{ all -> 0x010c }
            r8.L$1 = r14     // Catch:{ all -> 0x010c }
            r8.L$2 = r4     // Catch:{ all -> 0x010c }
            r8.L$3 = r5     // Catch:{ all -> 0x010c }
            r8.label = r7     // Catch:{ all -> 0x010c }
            java.lang.Object r0 = r14.B2K(r10, r8)     // Catch:{ all -> 0x010c }
            if (r0 != r9) goto L_0x0079
            return r9
        L_0x0109:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x010c }
        L_0x010b:
            throw r0     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            r15.A03(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C832146o.A01(X.4Du, X.4C9, X.46o):java.lang.Object");
    }

    public final long A04(C832346q r10) {
        long j = r10.A00;
        long min = Math.min(this.A02, this.A03);
        if (j < min + ((long) this.A00) || (this.A05 <= 0 && j <= min && this.A01 != 0)) {
            return j;
        }
        return -1;
    }

    public final void A05() {
        if (this.A05 != 0 || this.A01 > 1) {
            Object[] objArr = this.A04;
            C162457s7.A0H(objArr);
            while (true) {
                int i = this.A01;
                if (i > 0) {
                    long min = Math.min(this.A02, this.A03);
                    int i2 = this.A00;
                    int length = objArr.length - 1;
                    if (objArr[length & ((int) ((min + ((long) (i2 + i))) - 1))] == C39222Bd.A00) {
                        int i3 = i - 1;
                        this.A01 = i3;
                        objArr[length & ((int) (min + ((long) (i2 + i3))))] = null;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void A06() {
        C47792dp[] r10;
        Object[] objArr = this.A04;
        C162457s7.A0H(objArr);
        long j = this.A02;
        long j2 = this.A03;
        long min = Math.min(j, j2);
        objArr[(objArr.length - 1) & ((int) min)] = null;
        this.A00--;
        long j3 = min + 1;
        if (j2 < j3) {
            this.A03 = j3;
        }
        if (j < j3) {
            if (!(this.A00 == 0 || (r10 = this.A03) == null)) {
                for (C47792dp r7 : r10) {
                    if (r7 != null) {
                        C832346q r72 = (C832346q) r7;
                        long j4 = r72.A00;
                        if (j4 >= 0 && j4 < j3) {
                            r72.A00 = j3;
                        }
                    }
                }
            }
            this.A02 = j3;
        }
    }

    public final void A08(Object obj) {
        int i = this.A00 + this.A01;
        Object[] objArr = this.A04;
        if (objArr == null) {
            objArr = AnonymousClass002.A0M();
            this.A04 = objArr;
        } else {
            int length = objArr.length;
            if (i >= length) {
                int i2 = length * 2;
                if (i2 > 0) {
                    Object[] objArr2 = new Object[i2];
                    this.A04 = objArr2;
                    long min = Math.min(this.A02, this.A03);
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = (int) (((long) i3) + min);
                        objArr2[(i2 - 1) & i4] = objArr[(objArr.length - 1) & i4];
                    }
                    objArr = objArr2;
                } else {
                    throw AnonymousClass001.A0e("Buffer size overflow");
                }
            }
        }
        objArr[(objArr.length - 1) & ((int) (Math.min(this.A02, this.A03) + ((long) i)))] = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1 != 2) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(java.lang.Object r20) {
        /*
            r19 = this;
            r10 = r19
            int r0 = r10.A00
            r9 = r20
            if (r0 != 0) goto L_0x002a
            int r1 = r10.A06
            if (r1 == 0) goto L_0x0028
            r10.A08(r9)
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            if (r0 <= r1) goto L_0x001a
            r10.A06()
        L_0x001a:
            long r2 = r10.A02
            long r0 = r10.A03
            long r2 = java.lang.Math.min(r2, r0)
            int r0 = r10.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            r10.A02 = r2
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        L_0x002a:
            int r8 = r10.A00
            int r7 = r10.A05
            r6 = 1
            r5 = 0
            if (r8 < r7) goto L_0x0046
            long r3 = r10.A02
            long r1 = r10.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            X.20l r0 = r10.A07
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r5) goto L_0x0029
            r0 = 2
            if (r1 == r0) goto L_0x0070
        L_0x0046:
            r10.A08(r9)
            int r0 = r8 + 1
            r10.A00 = r0
            if (r0 <= r7) goto L_0x0052
            r10.A06()
        L_0x0052:
            long r13 = r10.A02
            long r11 = r10.A03
            long r15 = java.lang.Math.min(r13, r11)
            int r0 = r10.A00
            long r0 = (long) r0
            long r15 = r15 + r0
            long r2 = r15 - r11
            int r1 = (int) r2
            int r0 = r10.A06
            if (r1 <= r0) goto L_0x0070
            r0 = 1
            long r11 = r11 + r0
            int r0 = r10.A01
            long r0 = (long) r0
            long r17 = r15 + r0
            r10.A07(r11, r13, r15, r17)
        L_0x0070:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C832146o.A09(java.lang.Object):boolean");
    }

    public final C84814Du[] A0A(long j) {
        int i;
        int i2;
        long j2;
        C47792dp[] r13;
        long j3 = this.A02;
        if (j <= j3) {
            long min = Math.min(j3, this.A03);
            long j4 = ((long) this.A00) + min;
            long j5 = j4;
            int i3 = this.A05;
            if (i3 == 0 && this.A01 > 0) {
                j4++;
            }
            int i4 = this.A00;
            if (!(i4 == 0 || (r13 = this.A03) == null)) {
                for (C47792dp r2 : r13) {
                    if (r2 != null) {
                        long j6 = ((C832346q) r2).A00;
                        if (j6 >= 0 && j6 < j4) {
                            j4 = j6;
                        }
                    }
                }
            }
            if (j4 > j3) {
                if (i4 > 0) {
                    i2 = this.A01;
                    i = Math.min(i2, i3 - ((int) (j5 - j4)));
                } else {
                    i = this.A01;
                    i2 = i;
                }
                C84814Du[] r132 = C39232Be.A00;
                long j7 = ((long) i2) + j5;
                if (i > 0) {
                    r132 = new C84814Du[i];
                    Object[] objArr = this.A04;
                    C162457s7.A0H(objArr);
                    long j8 = j5;
                    int i5 = 0;
                    while (j5 < j7) {
                        int length = objArr.length - 1;
                        Object obj = objArr[length & ((int) j5)];
                        AnonymousClass2XH r3 = C39222Bd.A00;
                        if (obj != r3) {
                            C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C72693e8 r4 = (C72693e8) obj;
                            r132[i5] = r4.A02;
                            objArr[length & ((int) j5)] = r3;
                            objArr[length & ((int) j8)] = r4.A01;
                            j2 = 1;
                            j8++;
                            int i6 = i5 + 1;
                            if (i6 >= i) {
                                break;
                            }
                            i5 = i6;
                        } else {
                            j2 = 1;
                        }
                        j5 += j2;
                    }
                    j5 = j8;
                }
                int i7 = (int) (j5 - min);
                if (this.A00 == 0) {
                    j4 = j5;
                }
                long max = Math.max(this.A03, j5 - ((long) Math.min(this.A06, i7)));
                if (i3 == 0 && max < j7) {
                    Object[] objArr2 = this.A04;
                    C162457s7.A0H(objArr2);
                    if (C162457s7.A0P(objArr2[(objArr2.length - 1) & ((int) max)], C39222Bd.A00)) {
                        j5++;
                        max++;
                    }
                }
                A07(max, j4, j5, j7);
                A05();
                if (r132.length != 0) {
                    return A0B(r132);
                }
                return r132;
            }
        }
        return C39232Be.A00;
    }

    public AnonymousClass4C8 B3e(C85494Gl r2, C369720l r3, int i) {
        if ((i == 0 || i == -3) && r3 == C369720l.SUSPEND) {
            return this;
        }
        return new C832846v(r2, r3, this, i);
    }

    public boolean BrA(Object obj) {
        int i;
        boolean z;
        C84814Du[] r5 = C39232Be.A00;
        synchronized (this) {
            if (A09(obj)) {
                r5 = A0B(r5);
                z = true;
            } else {
                z = false;
            }
        }
        for (C84814Du r1 : r5) {
            if (r1 != null) {
                r1.BkD(C59022wD.A00);
            }
        }
        return z;
    }

    public C832146o(C369720l r1, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        this.A07 = r1;
    }

    public final void A07(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long min2 = Math.min(this.A02, this.A03); min2 < min; min2++) {
            Object[] objArr = this.A04;
            C162457s7.A0H(objArr);
            objArr[(objArr.length - 1) & ((int) min2)] = null;
        }
        this.A03 = j;
        this.A02 = j2;
        this.A00 = (int) (j3 - min);
        this.A01 = (int) (j4 - j3);
    }

    public Object Az8(C84814Du r2, AnonymousClass4C9 r3) {
        return A01(r2, r3, this);
    }
}
