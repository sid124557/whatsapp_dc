package X;

import android.util.Pair;

/* renamed from: X.86y  reason: invalid class name and case insensitive filesystem */
public final class C1688386y implements C187608xW {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static Pair A00(long[] jArr, long[] jArr2, long j) {
        double d;
        Long valueOf;
        Long valueOf2;
        int A04 = C162387ry.A04(jArr, j, true);
        long j2 = jArr[A04];
        long j3 = jArr2[A04];
        int i = A04 + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            if (j4 == j2) {
                d = 0.0d;
            } else {
                d = (((double) j) - ((double) j2)) / ((double) (j4 - j2));
            }
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * ((double) (j5 - j3)))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    public long B6k() {
        return -1;
    }

    public long B7B() {
        return this.A00;
    }

    public C152177Xv BCb(long j) {
        Pair A002 = A00(this.A02, this.A01, C161207pD.A01(AnonymousClass6C9.A0M(j, this.A00)));
        C158437jy r1 = new C158437jy(C161207pD.A00(C18310x6.A0B(A002.first)), AnonymousClass6C8.A0R(A002));
        return new C152177Xv(r1, r1);
    }

    public long BDg(long j) {
        return C161207pD.A00(AnonymousClass6C8.A0R(A00(this.A01, this.A02, j)));
    }

    public boolean BIq() {
        return true;
    }

    public C1688386y(long[] jArr, long[] jArr2, long j) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j == -9223372036854775807L ? C161207pD.A00(jArr2[jArr2.length - 1]) : j;
    }
}
