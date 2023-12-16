package X;

import java.io.IOException;

/* renamed from: X.87q  reason: invalid class name and case insensitive filesystem */
public final class C1690187q implements C187628xY, C187618xX {
    public long A00 = -9223372036854775807L;
    public C187618xX A01;
    public C187628xY A02;
    public C186428vI A03;
    public final long A04;
    public final AnonymousClass6PS A05;
    public final C183888qp A06;

    public void A00(AnonymousClass6PS r9) {
        long j = this.A04;
        long j2 = this.A00;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        C186428vI r1 = this.A03;
        r1.getClass();
        C187628xY B0w = r1.B0w(r9, this.A06, j);
        this.A02 = B0w;
        if (this.A01 != null) {
            B0w.BhI(this, j);
        }
    }

    public boolean Azd(long j) {
        C187628xY r0 = this.A02;
        if (r0 == null || !r0.Azd(j)) {
            return false;
        }
        return true;
    }

    public void B1k(long j, boolean z) {
        this.A02.B1k(j, z);
    }

    public long B4G(C158027jJ r3, long j) {
        return this.A02.B4G(r3, j);
    }

    public long B4y() {
        return this.A02.B4y();
    }

    public long BA0() {
        return this.A02.BA0();
    }

    public C166387yb BDt() {
        return this.A02.BDt();
    }

    public boolean BHy() {
        C187628xY r0 = this.A02;
        if (r0 == null || !r0.BHy()) {
            return false;
        }
        return true;
    }

    public void BL2() {
        try {
            C187628xY r0 = this.A02;
            if (r0 != null) {
                r0.BL2();
                return;
            }
            C186428vI r02 = this.A03;
            if (r02 != null) {
                r02.BL3();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public /* bridge */ /* synthetic */ void BQ8(C185348tV r2) {
        this.A01.BQ8(this);
    }

    public void BYn(C187628xY r2) {
        this.A01.BYn(this);
    }

    public void BhI(C187618xX r9, long j) {
        this.A01 = r9;
        C187628xY r7 = this.A02;
        if (r7 != null) {
            long j2 = this.A04;
            long j3 = this.A00;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            r7.BhI(this, j2);
        }
    }

    public long BiL() {
        return this.A02.BiL();
    }

    public long Bl5(long j) {
        return this.A02.Bl5(j);
    }

    public long BlC(C185338tU[] r8, C187638xZ[] r9, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = this.A00;
        if (j2 == -9223372036854775807L || j != this.A04) {
            j2 = j;
        } else {
            this.A00 = -9223372036854775807L;
        }
        return this.A02.BlC(r8, r9, zArr, zArr2, j2);
    }

    public C1690187q(AnonymousClass6PS r3, C183888qp r4, long j) {
        this.A05 = r3;
        this.A06 = r4;
        this.A04 = j;
    }
}
