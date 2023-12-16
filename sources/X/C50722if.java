package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.2if  reason: invalid class name and case insensitive filesystem */
public class C50722if {
    public final List A00 = AnonymousClass002.A0I(4);

    public void A01(String... strArr) {
        if (strArr.length != 0) {
            this.A00.add(new AnonymousClass15R(strArr));
            return;
        }
        throw AnonymousClass001.A0c("Cannot set 0 domains");
    }

    public AnonymousClass2UQ A00() {
        List list = this.A00;
        int size = list.size();
        if (size == 0) {
            return AnonymousClass2AY.A00;
        }
        if (size != 1) {
            return new AnonymousClass15P((AnonymousClass2UQ[]) list.toArray(new AnonymousClass2UQ[size]));
        }
        return (AnonymousClass2UQ) C18290x4.A0k(list);
    }

    public void A02(String... strArr) {
        List asList = Arrays.asList(strArr);
        if (!asList.isEmpty()) {
            this.A00.add(new AnonymousClass15Q(asList));
            return;
        }
        throw AnonymousClass001.A0c("Cannot set 0 schemes");
    }
}
