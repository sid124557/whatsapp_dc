package X;

import java.util.Map;

/* renamed from: X.8UG  reason: invalid class name */
public class AnonymousClass8UG extends C57692u3 {
    public static final int A0I(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map A0J() {
        return new AnonymousClass8OR();
    }

    public static final Map A0K(Map map) {
        AnonymousClass8OR r1 = (AnonymousClass8OR) map;
        r1.A02();
        r1.isReadOnly = true;
        if (r1.size() > 0) {
            return r1;
        }
        AnonymousClass8OR r12 = AnonymousClass8OR.A00;
        C162457s7.A0K(r12, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return r12;
    }
}
