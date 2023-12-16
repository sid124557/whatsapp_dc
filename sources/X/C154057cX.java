package X;

import java.util.Map;

/* renamed from: X.7cX  reason: invalid class name and case insensitive filesystem */
public final class C154057cX {
    public static boolean equalsImpl(C185838uK r1, Object obj) {
        if (obj == r1) {
            return true;
        }
        if (obj instanceof C185838uK) {
            return r1.asMap().equals(((C185838uK) obj).asMap());
        }
        return false;
    }

    public static C187918y1 newListMultimap(Map map, C181318mZ r2) {
        return new AnonymousClass6Zw(map, r2);
    }
}
