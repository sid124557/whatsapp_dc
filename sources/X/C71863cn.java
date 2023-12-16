package X;

import java.util.Comparator;

/* renamed from: X.3cn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71863cn implements Comparator {
    public final /* synthetic */ boolean A00;

    public final int compare(Object obj, Object obj2) {
        boolean z = this.A00;
        int compare = Long.compare(((C56682sO) obj).A00.A0K, ((C56682sO) obj2).A00.A0K);
        if (z) {
            return -compare;
        }
        return compare;
    }

    public /* synthetic */ C71863cn(boolean z) {
        this.A00 = z;
    }
}
