package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.88J  reason: invalid class name */
public final class AnonymousClass88J implements C185358tW {
    public final List A00;
    public final List A01;

    public long B7R(int i) {
        boolean z = true;
        C161487pm.A03(AnonymousClass001.A1U(i));
        List list = this.A00;
        if (i >= list.size()) {
            z = false;
        }
        C161487pm.A03(z);
        return AnonymousClass6C7.A0K(list, i);
    }

    public List B6I(long j) {
        int i;
        List list = this.A00;
        Long valueOf = Long.valueOf(j);
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || ((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0);
            i = binarySearch + 1;
        }
        if (i == -1) {
            return Collections.emptyList();
        }
        return (List) this.A01.get(i);
    }

    public int B7S() {
        return this.A00.size();
    }

    public int B9y(long j) {
        List list = this.A00;
        Long valueOf = Long.valueOf(j);
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0);
        }
        if (binarySearch >= list.size()) {
            return -1;
        }
        return binarySearch;
    }

    public AnonymousClass88J(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
