package X;

import java.util.Set;

/* renamed from: X.7dK  reason: invalid class name and case insensitive filesystem */
public class C154537dK {
    public static final Set A07() {
        return new AnonymousClass8UB();
    }

    public static final Set A08(Set set) {
        AnonymousClass8UB r2 = (AnonymousClass8UB) set;
        AnonymousClass8OR r1 = r2.backing;
        r1.A02();
        r1.isReadOnly = true;
        if (r1.size() <= 0) {
            C162457s7.A0K(AnonymousClass8OR.A00, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        if (r2.size() <= 0) {
            return AnonymousClass8UB.A00;
        }
        return r2;
    }
}
