package X;

import java.util.Arrays;

/* renamed from: X.7Vf  reason: invalid class name and case insensitive filesystem */
public final class C151547Vf {
    public int A00;
    public long[] A01 = new long[32];

    public void A00(long j) {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            jArr = Arrays.copyOf(jArr, i * 2);
            this.A01 = jArr;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr[i2] = j;
    }
}
