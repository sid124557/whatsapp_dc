package X;

import java.util.Arrays;

/* renamed from: X.86p  reason: invalid class name and case insensitive filesystem */
public final class C1687486p implements C184868sg {
    public final int A00;
    public final long A01;
    public final int[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long[] A05;

    public long B7B() {
        return this.A01;
    }

    public C152177Xv BCb(long j) {
        long[] jArr = this.A05;
        int A042 = C162387ry.A04(jArr, j, true);
        long j2 = jArr[A042];
        long[] jArr2 = this.A04;
        C158437jy r4 = new C158437jy(j2, jArr2[A042]);
        if (r4.A01 >= j || A042 == this.A00 - 1) {
            return new C152177Xv(r4, r4);
        }
        int i = A042 + 1;
        return C152177Xv.A00(r4, jArr[i], jArr2[i]);
    }

    public boolean BIq() {
        return true;
    }

    public C1687486p(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A02 = iArr;
        this.A04 = jArr;
        this.A03 = jArr2;
        this.A05 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A01 = jArr2[i] + jArr3[i];
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ChunkIndex(length=");
        A0o.append(this.A00);
        A0o.append(", sizes=");
        A0o.append(Arrays.toString(this.A02));
        A0o.append(", offsets=");
        A0o.append(Arrays.toString(this.A04));
        A0o.append(", timeUs=");
        A0o.append(Arrays.toString(this.A05));
        A0o.append(", durationsUs=");
        A0o.append(Arrays.toString(this.A03));
        return AnonymousClass000.A0e(A0o);
    }
}
