package X;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3g9  reason: invalid class name and case insensitive filesystem */
public class C73833g9 extends C154537dK {
    public static final HashSet A03(Object... objArr) {
        HashSet hashSet = new HashSet(AnonymousClass8UG.A0I(r3));
        for (Object add : objArr) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static final Set A05(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass8UG.A0I(r3));
        for (Object add : objArr) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    public static final Set A06(Object... objArr) {
        C162457s7.A0J(objArr, 0);
        if (objArr.length > 0) {
            return C73703fw.A05(objArr);
        }
        return C72063d7.A00;
    }

    public static final Set A04() {
        return C72063d7.A00;
    }
}
