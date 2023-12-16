package X;

/* renamed from: X.87p  reason: invalid class name and case insensitive filesystem */
public final class C1690087p implements C187628xY, C187618xX {
    public long A00;
    public long A01 = 0;
    public C187618xX A02;
    public AnonymousClass885[] A03 = new AnonymousClass885[0];
    public final C187628xY A04;

    public boolean Azd(long j) {
        return this.A04.Azd(j);
    }

    public void B1k(long j, boolean z) {
        this.A04.B1k(j, z);
    }

    public long B4G(C158027jJ r18, long j) {
        long j2;
        C158027jJ r10 = r18;
        long j3 = j;
        if (j == 0) {
            return 0;
        }
        long j4 = r10.A01;
        long max = Math.max(0, Math.min(j4, j - 0));
        long j5 = r10.A00;
        long j6 = this.A00;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long max2 = Math.max(0, Math.min(j5, j2));
        if (!(max == j4 && max2 == j5)) {
            r10 = new C158027jJ(max, max2);
        }
        return this.A04.B4G(r10, j3);
    }

    public long B4y() {
        long B4y = this.A04.B4y();
        if (B4y != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || B4y < j) {
                return B4y;
            }
        }
        return Long.MIN_VALUE;
    }

    public long BA0() {
        long BA0 = this.A04.BA0();
        if (BA0 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || BA0 < j) {
                return BA0;
            }
        }
        return Long.MIN_VALUE;
    }

    public C166387yb BDt() {
        return this.A04.BDt();
    }

    public boolean BHy() {
        return this.A04.BHy();
    }

    public void BL2() {
        this.A04.BL2();
    }

    public /* bridge */ /* synthetic */ void BQ8(C185348tV r2) {
        C187618xX r0 = this.A02;
        r0.getClass();
        r0.BQ8(this);
    }

    public void BYn(C187628xY r2) {
        C187618xX r0 = this.A02;
        r0.getClass();
        r0.BYn(this);
    }

    public void BhI(C187618xX r2, long j) {
        this.A02 = r2;
        this.A04.BhI(this, j);
    }

    public long BiL() {
        if (AnonymousClass000.A1S((this.A01 > -9223372036854775807L ? 1 : (this.A01 == -9223372036854775807L ? 0 : -1)))) {
            long j = this.A01;
            this.A01 = -9223372036854775807L;
            long BiL = BiL();
            if (BiL != -9223372036854775807L) {
                return BiL;
            }
            return j;
        }
        long BiL2 = this.A04.BiL();
        if (BiL2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C161487pm.A04(AnonymousClass001.A1U((BiL2 > 0 ? 1 : (BiL2 == 0 ? 0 : -1))));
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && BiL2 > j2) {
            z = false;
        }
        C161487pm.A04(z);
        return BiL2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r10 > r0) goto L_0x006f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BlC(X.C185338tU[] r19, X.C187638xZ[] r20, boolean[] r21, boolean[] r22, long r23) {
        /*
            r18 = this;
            r6 = r19
            int r5 = r6.length
            X.885[] r7 = new X.AnonymousClass885[r5]
            r4 = r18
            r4.A03 = r7
            X.8tU[] r12 = new X.C185338tU[r5]
            r3 = 0
            r1 = 0
        L_0x000d:
            r2 = 0
            if (r1 >= r5) goto L_0x001f
            r0 = r19[r1]
            X.885 r0 = (X.AnonymousClass885) r0
            r7[r1] = r0
            if (r0 == 0) goto L_0x001a
            X.8tU r2 = r0.A01
        L_0x001a:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L_0x000d
        L_0x001f:
            X.8xY r11 = r4.A04
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            long r10 = r11.BlC(r12, r13, r14, r15, r16)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A01 = r0
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x006f
            long r0 = r4.A00
            r8 = -9223372036854775808
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x004a
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x006f
        L_0x004a:
            r0 = 1
        L_0x004b:
            X.C161487pm.A04(r0)
        L_0x004e:
            if (r3 >= r5) goto L_0x0071
            r7 = r12[r3]
            X.885[] r1 = r4.A03
            if (r7 != 0) goto L_0x005f
            r1[r3] = r2
        L_0x0058:
            r0 = r1[r3]
            r19[r3] = r0
            int r3 = r3 + 1
            goto L_0x004e
        L_0x005f:
            r0 = r1[r3]
            if (r0 == 0) goto L_0x0067
            X.8tU r0 = r0.A01
            if (r0 == r7) goto L_0x0058
        L_0x0067:
            X.885 r0 = new X.885
            r0.<init>(r4, r7)
            r1[r3] = r0
            goto L_0x0058
        L_0x006f:
            r0 = 0
            goto L_0x004b
        L_0x0071:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690087p.BlC(X.8tU[], X.8xZ[], boolean[], boolean[], long):long");
    }

    public C1690087p(C187628xY r3, long j) {
        this.A04 = r3;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5 > r3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Bl5(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.885[] r3 = r8.A03
            int r2 = r3.length
            r7 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r2) goto L_0x0017
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0014
            r0.A00 = r7
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            X.8xY r0 = r8.A04
            long r5 = r0.Bl5(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0034
        L_0x0033:
            r7 = 1
        L_0x0034:
            X.C161487pm.A04(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690087p.Bl5(long):long");
    }
}
