package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.88K  reason: invalid class name */
public final class AnonymousClass88K implements C185358tW {
    public final long[] A00;
    public final C157037hc[] A01;

    public long B7R(int i) {
        boolean z = true;
        C161487pm.A03(AnonymousClass001.A1U(i));
        long[] jArr = this.A00;
        if (i >= jArr.length) {
            z = false;
        }
        C161487pm.A03(z);
        return jArr[i];
    }

    public List B6I(long j) {
        C157037hc r1;
        int A04 = C162387ry.A04(this.A00, j, false);
        if (A04 == -1 || (r1 = this.A01[A04]) == C157037hc.A0G) {
            return Collections.emptyList();
        }
        return Collections.singletonList(r1);
    }

    public int B7S() {
        return this.A00.length;
    }

    public int B9y(long j) {
        long[] jArr = this.A00;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] != j);
        }
        if (binarySearch >= jArr.length) {
            return -1;
        }
        return binarySearch;
    }

    public AnonymousClass88K(long[] jArr, C157037hc[] r2) {
        this.A01 = r2;
        this.A00 = jArr;
    }
}
