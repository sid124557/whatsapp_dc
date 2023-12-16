package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.88L  reason: invalid class name */
public final class AnonymousClass88L implements C185358tW {
    public final List A00;
    public final long[] A01;
    public final long[] A02;

    public long B7R(int i) {
        boolean z = true;
        C161487pm.A03(AnonymousClass001.A1U(i));
        long[] jArr = this.A02;
        if (i >= jArr.length) {
            z = false;
        }
        C161487pm.A03(z);
        return jArr[i];
    }

    public int B7S() {
        return this.A02.length;
    }

    public int B9y(long j) {
        long[] jArr = this.A02;
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

    public AnonymousClass88L(List list) {
        this.A00 = Collections.unmodifiableList(AnonymousClass002.A0J(list));
        this.A01 = new long[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            C148687Ji r4 = (C148687Ji) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.A01;
            jArr[i2] = r4.A01;
            jArr[i2 + 1] = r4.A00;
        }
        long[] jArr2 = this.A01;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.A02 = copyOf;
        Arrays.sort(copyOf);
    }

    public List B6I(long j) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int i = 0;
        while (true) {
            List list = this.A00;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.A01;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C148687Ji r6 = (C148687Ji) list.get(i);
                C157037hc r2 = r6.A02;
                if (r2.A01 == -3.4028235E38f) {
                    A0s2.add(r6);
                } else {
                    A0s.add(r2);
                }
            }
            i++;
        }
        C86614Ku.A1U(A0s2, 10);
        for (int i3 = 0; i3 < A0s2.size(); i3++) {
            C157757ip r22 = new C157757ip(((C148687Ji) A0s2.get(i3)).A02);
            r22.A01 = (float) (-1 - i3);
            r22.A07 = 1;
            A0s.add(r22.A00());
        }
        return A0s;
    }
}
