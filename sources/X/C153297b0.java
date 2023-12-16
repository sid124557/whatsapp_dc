package X;

/* renamed from: X.7b0  reason: invalid class name and case insensitive filesystem */
public class C153297b0 {
    public int A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03 = -1;
    public C160697o9 A04;
    public C160697o9 A05;
    public C160697o9 A06;

    public final String A00(C160697o9 r8, int i) {
        if (i < 0) {
            return "<snip>";
        }
        if (r8 == null) {
            return "\n{x}";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18270x1.A1H(A0o, "\n", r8);
        String obj = A0o.toString();
        for (C160697o9 A002 : r8.A0A) {
            obj = AnonymousClass000.A0X(A00(A002, i - 1).replace("\n", "\n-"), AnonymousClass000.A0l(obj));
        }
        return obj;
    }

    public final void A03(C160697o9 r3) {
        if (r3 == this.A04) {
            this.A04 = r3.A08;
        }
        if (r3 == this.A05) {
            this.A05 = r3.A07;
        }
        C160697o9 r1 = r3.A08;
        if (r1 != null) {
            r1.A07 = r3.A07;
        }
        C160697o9 r0 = r3.A07;
        if (r0 != null) {
            r0.A08 = r1;
        }
        r3.A08 = null;
        r3.A07 = null;
    }

    public C153297b0() {
        C160697o9 r0 = new C160697o9(-1, -1);
        this.A06 = r0;
        r0.A02 = 0;
        r0.A03 = 0;
        r0.A04 = 0;
        this.A04 = r0;
        this.A05 = r0;
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x009e, code lost:
        X.C86614Ku.A1N(X.C158827kc.A0O, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a3, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r14 = this;
            long r2 = java.lang.System.nanoTime()
            int r5 = r14.A01     // Catch:{ all -> 0x009d }
            r4 = -1
            if (r5 == r4) goto L_0x004c
            int r0 = r14.A02     // Catch:{ all -> 0x009d }
            int r5 = r5 - r0
            int r1 = r14.A03     // Catch:{ all -> 0x009d }
            r11 = 1
            int r0 = r1 << r11
            int r0 = r11 << r0
            if (r1 != r4) goto L_0x0016
            r0 = 0
        L_0x0016:
            int r5 = r5 + r0
            int r0 = r14.A00     // Catch:{ all -> 0x009d }
            if (r0 <= r5) goto L_0x004c
            X.7o9 r4 = r14.A04     // Catch:{ all -> 0x009d }
        L_0x001d:
            int r0 = r14.A00     // Catch:{ all -> 0x009d }
            r10 = 0
            if (r0 <= r5) goto L_0x0052
            if (r4 == 0) goto L_0x0052
            android.graphics.Bitmap r0 = r4.A01()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0044
            int r1 = r4.A04     // Catch:{ all -> 0x009d }
            int r0 = r14.A03     // Catch:{ all -> 0x009d }
            if (r1 == r0) goto L_0x0044
            int r0 = r4.A0B     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0044
            monitor-enter(r4)     // Catch:{ all -> 0x009d }
            android.graphics.Bitmap r0 = r4.A05     // Catch:{ all -> 0x0047 }
            if (r0 == r10) goto L_0x003c
            r4.A04()     // Catch:{ all -> 0x0047 }
        L_0x003c:
            r4.A05 = r10     // Catch:{ all -> 0x0047 }
            monitor-exit(r4)     // Catch:{ all -> 0x009d }
            int r0 = r14.A00     // Catch:{ all -> 0x009d }
            int r0 = r0 - r11
            r14.A00 = r0     // Catch:{ all -> 0x009d }
        L_0x0044:
            X.7o9 r4 = r4.A08     // Catch:{ all -> 0x009d }
            goto L_0x001d
        L_0x0047:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x004a:
            if (r13 != 0) goto L_0x0052
        L_0x004c:
            X.7kc r0 = X.C158827kc.A0O
            X.C86614Ku.A1N(r0, r2)
            return
        L_0x0052:
            X.7o9 r9 = r14.A04     // Catch:{ all -> 0x009d }
            r13 = 0
        L_0x0055:
            if (r9 == 0) goto L_0x004a
            r8 = 0
        L_0x0058:
            r12 = 4
            if (r8 >= r12) goto L_0x009a
            X.7o9[] r0 = r9.A0A     // Catch:{ all -> 0x009d }
            r7 = r0[r8]     // Catch:{ all -> 0x009d }
            if (r7 == 0) goto L_0x0097
            int r0 = r7.A0B     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0097
            android.graphics.Bitmap r0 = r7.A01()     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x0097
            r6 = 0
            r1 = 0
            r5 = -1
        L_0x006e:
            X.7o9[] r4 = r7.A0A     // Catch:{ all -> 0x009d }
            r0 = r4[r6]     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0077
            int r1 = r1 + 1
            r5 = r6
        L_0x0077:
            int r6 = r6 + 1
            if (r6 < r12) goto L_0x006e
            if (r1 != r11) goto L_0x008a
            X.7o9[] r1 = r9.A0A     // Catch:{ all -> 0x009d }
            r0 = r4[r5]     // Catch:{ all -> 0x009d }
            r1[r8] = r0     // Catch:{ all -> 0x009d }
            r14.A03(r7)     // Catch:{ all -> 0x009d }
            r7.A02()     // Catch:{ all -> 0x009d }
            goto L_0x0096
        L_0x008a:
            if (r1 != 0) goto L_0x0097
            X.7o9[] r0 = r9.A0A     // Catch:{ all -> 0x009d }
            r0[r8] = r10     // Catch:{ all -> 0x009d }
            r14.A03(r7)     // Catch:{ all -> 0x009d }
            r7.A02()     // Catch:{ all -> 0x009d }
        L_0x0096:
            r13 = 1
        L_0x0097:
            int r8 = r8 + 1
            goto L_0x0058
        L_0x009a:
            X.7o9 r9 = r9.A08     // Catch:{ all -> 0x009d }
            goto L_0x0055
        L_0x009d:
            r1 = move-exception
            X.7kc r0 = X.C158827kc.A0O
            X.C86614Ku.A1N(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C153297b0.A01():void");
    }

    public void A02(C160697o9 r11) {
        int i;
        int i2;
        int i3;
        int A0A;
        C160697o9[] r3;
        int i4;
        if (r11.A01() != null) {
            this.A00++;
        }
        C160697o9 r1 = this.A06;
        while (true) {
            i = r11.A02;
            i2 = r11.A03;
            i3 = r11.A04;
            A0A = AnonymousClass6C8.A0A(i3, r1.A04, i, i2);
            r3 = r1.A0A;
            C160697o9 r5 = r3[A0A];
            if (r5 == null || i3 <= (i4 = r5.A04)) {
                break;
            }
            int i5 = i3 - i4;
            if ((i >> i5) != r5.A02 || (i2 >> i5) != r5.A03) {
                break;
            }
            r1 = r3[A0A];
        }
        C160697o9 r52 = r3[A0A];
        if (r52 == null) {
            r3[A0A] = r11;
        } else {
            int i6 = r52.A04;
            if (i3 < i6) {
                r3[A0A] = r11;
                r11.A0A[AnonymousClass6C8.A0A(i6, i3, r52.A02, r52.A03)] = r52;
            } else if (i6 == i3 && r52.A02 == i && r52.A03 == i2) {
                A03(r52);
                System.arraycopy(r52.A0A, 0, r11.A0A, 0, 4);
                r3[A0A] = r11;
                if (r52.A01() != null) {
                    this.A00--;
                }
                r52.A02();
            } else {
                int i7 = i3 - i6;
                int i8 = i >> i7;
                int i9 = i2 >> i7;
                int i10 = r52.A02;
                int i11 = r52.A03;
                while (true) {
                    if (i8 == i10 && i9 == i11) {
                        break;
                    }
                    i8 >>= 1;
                    i9 >>= 1;
                    i10 >>= 1;
                    i11 >>= 1;
                    i6--;
                }
                C160697o9 r4 = new C160697o9(-1, -1);
                r4.A02 = i8;
                r4.A03 = i9;
                r4.A04 = i6;
                r3[A0A] = r4;
                C160697o9[] r32 = r4.A0A;
                r32[AnonymousClass6C8.A0A(r52.A04, i6, r52.A02, r52.A03)] = r52;
                r32[AnonymousClass6C8.A0A(r11.A04, i6, r11.A02, r11.A03)] = r11;
                A03(r4);
                C160697o9 r0 = this.A05;
                r0.A08 = r4;
                r4.A07 = r0;
                this.A05 = r4;
            }
        }
        A03(r11);
        C160697o9 r02 = this.A05;
        r02.A08 = r11;
        r11.A07 = r02;
        this.A05 = r11;
        A01();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A00(this.A06, 10));
        return AnonymousClass000.A0X("\n", A0o);
    }
}
