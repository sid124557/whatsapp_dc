package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.8NN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8NN implements Comparator {
    public final /* synthetic */ C162217rT A00;
    public final /* synthetic */ List A01;

    public final int compare(Object obj, Object obj2) {
        int i;
        List list = this.A01;
        Number number = (Number) obj2;
        AnonymousClass84O A02 = C162217rT.A02((C180488l9) list.get(((Number) obj).intValue()));
        if (A02 != null) {
            i = A02.A0E(81, 0);
        } else {
            i = 0;
        }
        AnonymousClass84O A022 = C162217rT.A02((C180488l9) list.get(number.intValue()));
        int i2 = 0;
        if (A022 != null) {
            i2 = A022.A0E(81, 0);
        }
        return Integer.compare(i, i2);
    }

    public /* synthetic */ AnonymousClass8NN(C162217rT r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }
}
