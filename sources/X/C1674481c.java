package X;

/* renamed from: X.81c  reason: invalid class name and case insensitive filesystem */
public class C1674481c implements C185998ua {
    public final C185998ua[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r4 > r17) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Aze(long r17, long r19) {
        /*
            r16 = this;
            r15 = 0
        L_0x0001:
            r0 = r16
            X.8ua[] r8 = r0.A00
            int r7 = r8.length
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = -9223372036854775808
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r9 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775808
        L_0x0019:
            if (r9 >= r7) goto L_0x0030
            r0 = r8[r9]
            long r0 = r0.BA0()
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x002d
            long r4 = java.lang.Math.min(r4, r0)
            long r2 = java.lang.Math.max(r2, r0)
        L_0x002d:
            int r9 = r9 + 1
            goto L_0x0019
        L_0x0030:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r10, r10)
        L_0x0039:
            java.lang.Object r0 = r0.first
            long r11 = X.C18310x6.A0B(r0)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            r0 = 0
        L_0x0044:
            if (r0 >= r7) goto L_0x0056
            int r0 = r0 + 1
            goto L_0x0044
        L_0x0049:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r1, r0)
            goto L_0x0039
        L_0x0056:
            r10 = 0
            r9 = 0
        L_0x0058:
            if (r10 >= r7) goto L_0x007d
            r6 = r8[r10]
            long r4 = r6.BA0()
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r2 = r17
            if (r0 == 0) goto L_0x006b
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0075
        L_0x0072:
            int r10 = r10 + 1
            goto L_0x0058
        L_0x0075:
            r0 = r19
            boolean r0 = r6.Aze(r2, r0)
            r9 = r9 | r0
            goto L_0x0072
        L_0x007d:
            r15 = r15 | r9
            if (r9 != 0) goto L_0x0001
        L_0x0080:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1674481c.Aze(long, long):boolean");
    }

    public void Aye(long j) {
        for (C185998ua Aye : this.A00) {
            Aye.Aye(j);
        }
    }

    public final long B4w(long j) {
        long j2 = Long.MAX_VALUE;
        for (C185998ua B4w : this.A00) {
            long B4w2 = B4w.B4w(j);
            if (B4w2 != Long.MIN_VALUE) {
                if (B4w2 <= 0) {
                    return 0;
                }
                j2 = Math.min(j2, B4w2);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return 0;
        }
        return j2;
    }

    public final long B4y() {
        long j = Long.MAX_VALUE;
        for (C185998ua B4y : this.A00) {
            long B4y2 = B4y.B4y();
            if (B4y2 != Long.MIN_VALUE) {
                j = Math.min(j, B4y2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long BA0() {
        long j = Long.MAX_VALUE;
        for (C185998ua BA0 : this.A00) {
            long BA02 = BA0.BA0();
            if (BA02 != Long.MIN_VALUE) {
                j = Math.min(j, BA02);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void Bmw(boolean z) {
        for (C185998ua Bmw : this.A00) {
            Bmw.Bmw(z);
        }
    }

    public void Brk(byte b, boolean z) {
        for (C185998ua Brk : this.A00) {
            Brk.Brk(b, z);
        }
    }

    public C1674481c(C185998ua[] r1) {
        this.A00 = r1;
    }
}
