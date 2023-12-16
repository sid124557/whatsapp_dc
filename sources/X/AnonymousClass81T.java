package X;

import java.io.IOException;

/* renamed from: X.81T  reason: invalid class name */
public final class AnonymousClass81T implements C187418xB, C187408xA {
    public long A00 = -9223372036854775807L;
    public long A01;
    public C187408xA A02;
    public C187418xB A03;
    public final AnonymousClass7Z2 A04;
    public final C185778uE A05;
    public final AnonymousClass7ZV A06;

    public void Aye(long j) {
        C187418xB r0 = this.A03;
        if (r0 != null) {
            r0.Aye(j);
        }
    }

    public boolean Aze(long j, long j2) {
        C187418xB r0 = this.A03;
        if (r0 == null || !r0.Aze(j, j2)) {
            return false;
        }
        return true;
    }

    public void B1k(long j, boolean z) {
        this.A03.B1k(j, z);
    }

    public long B4F(C158037jK r3, long j) {
        return this.A03.B4F(r3, j);
    }

    public long B4w(long j) {
        return this.A03.B4w(j);
    }

    public long B4y() {
        return this.A03.B4y();
    }

    public long BA0() {
        return this.A03.BA0();
    }

    public C166607yy BDs() {
        return this.A03.BDs();
    }

    public void BL2() {
        try {
            C187418xB r0 = this.A03;
            if (r0 != null) {
                r0.BL2();
            } else {
                this.A05.BL3();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public /* bridge */ /* synthetic */ void BQ7(C185998ua r2) {
        this.A02.BQ7(this);
    }

    public void BYl(C187418xB r2) {
        this.A02.BYl(this);
    }

    public void BhH(C187408xA r2, long j) {
        this.A02 = r2;
        this.A01 = j;
        C187418xB r0 = this.A03;
        if (r0 != null) {
            r0.BhH(this, j);
        }
    }

    public long BiL() {
        return this.A03.BiL();
    }

    public long Bl6(long j, boolean z) {
        return this.A03.Bl6(j, z);
    }

    public long BlB(C185238tJ[] r8, C187428xC[] r9, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = this.A00;
        if (j2 == -9223372036854775807L || j != 0) {
            j2 = j;
        } else {
            this.A00 = -9223372036854775807L;
        }
        return this.A03.BlB(r8, r9, zArr, zArr2, j2);
    }

    public void Bmw(boolean z) {
        C187418xB r0 = this.A03;
        if (r0 != null) {
            r0.Bmw(z);
        }
    }

    public void Brk(byte b, boolean z) {
        C187418xB r0 = this.A03;
        if (r0 != null) {
            r0.Brk(b, z);
        }
    }

    public AnonymousClass81T(AnonymousClass7Z2 r3, C185778uE r4, AnonymousClass7ZV r5) {
        this.A04 = r3;
        this.A06 = r5;
        this.A05 = r4;
    }
}
