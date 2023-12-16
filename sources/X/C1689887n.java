package X;

/* renamed from: X.87n  reason: invalid class name and case insensitive filesystem */
public final class C1689887n implements C187628xY, C187618xX {
    public C187618xX A00;
    public final long A01;
    public final C187628xY A02;

    public boolean Azd(long j) {
        return this.A02.Azd(j - this.A01);
    }

    public void B1k(long j, boolean z) {
        this.A02.B1k(j - this.A01, z);
    }

    public long B4G(C158027jJ r5, long j) {
        C187628xY r0 = this.A02;
        long j2 = this.A01;
        return r0.B4G(r5, j - j2) + j2;
    }

    public long B4y() {
        long B4y = this.A02.B4y();
        if (B4y != Long.MIN_VALUE) {
            return this.A01 + B4y;
        }
        return Long.MIN_VALUE;
    }

    public long BA0() {
        long BA0 = this.A02.BA0();
        if (BA0 != Long.MIN_VALUE) {
            return this.A01 + BA0;
        }
        return Long.MIN_VALUE;
    }

    public C166387yb BDt() {
        return this.A02.BDt();
    }

    public boolean BHy() {
        return this.A02.BHy();
    }

    public void BL2() {
        this.A02.BL2();
    }

    public /* bridge */ /* synthetic */ void BQ8(C185348tV r2) {
        C187618xX r0 = this.A00;
        r0.getClass();
        r0.BQ8(this);
    }

    public void BYn(C187628xY r2) {
        C187618xX r0 = this.A00;
        r0.getClass();
        r0.BYn(this);
    }

    public void BhI(C187618xX r4, long j) {
        this.A00 = r4;
        this.A02.BhI(this, j - this.A01);
    }

    public long BiL() {
        long BiL = this.A02.BiL();
        if (BiL != -9223372036854775807L) {
            return this.A01 + BiL;
        }
        return -9223372036854775807L;
    }

    public long Bl5(long j) {
        C187628xY r0 = this.A02;
        long j2 = this.A01;
        return r0.Bl5(j - j2) + j2;
    }

    public long BlC(C185338tU[] r18, C187638xZ[] r19, boolean[] zArr, boolean[] zArr2, long j) {
        int length = r18.length;
        C185338tU[] r11 = new C185338tU[length];
        int i = 0;
        while (true) {
            C185338tU r6 = null;
            if (i >= length) {
                break;
            }
            AnonymousClass883 r0 = r18[i];
            if (r0 != null) {
                r6 = r0.A01;
            }
            r11[i] = r6;
            i++;
        }
        C187628xY r10 = this.A02;
        long j2 = this.A01;
        long BlC = r10.BlC(r11, r19, zArr, zArr2, j - j2);
        for (int i2 = 0; i2 < length; i2++) {
            C185338tU r3 = r11[i2];
            if (r3 == null) {
                r18[i2] = null;
            } else {
                AnonymousClass883 r02 = r18[i2];
                if (r02 == null || r02.A01 != r3) {
                    r18[i2] = new AnonymousClass883(r3, j2);
                }
            }
        }
        return BlC + j2;
    }

    public C1689887n(C187628xY r1, long j) {
        this.A02 = r1;
        this.A01 = j;
    }
}
