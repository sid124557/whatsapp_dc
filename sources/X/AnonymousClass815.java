package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.815  reason: invalid class name */
public final class AnonymousClass815 implements C184718sP {
    public final int A00;
    public final long A01;
    public final int[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long[] A05;

    public long B7B() {
        return this.A01;
    }

    public C152137Xr BCa(long j) {
        long[] jArr = this.A05;
        int A032 = Util.A03(jArr, j, true);
        long j2 = jArr[A032];
        long[] jArr2 = this.A04;
        C158407jv r5 = new C158407jv(j2, jArr2[A032]);
        if (r5.A01 >= j || A032 == this.A00 - 1) {
            return new C152137Xr(r5, r5);
        }
        int i = A032 + 1;
        return new C152137Xr(r5, new C158407jv(jArr[i], jArr2[i]));
    }

    public boolean BIq() {
        return true;
    }

    public AnonymousClass815(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
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
