package X;

import java.util.Collection;

/* renamed from: X.7pn  reason: invalid class name and case insensitive filesystem */
public final class C161497pn {
    public static Collection filter(Collection collection, C181308mY r2) {
        if (collection instanceof C174058Su) {
            return ((C174058Su) collection).createCombined(r2);
        }
        collection.getClass();
        return new C174058Su(collection, r2);
    }

    public static StringBuilder newStringBuilderForCollection(int i) {
        C160937oh.checkNonnegative(i, "size");
        return AnonymousClass6CA.A0Y(AnonymousClass6CA.A02(((long) i) * 8, 1073741824));
    }

    public static Collection transform(Collection collection, C181298mX r2) {
        return new C174038Ss(collection, r2);
    }

    public static boolean containsAllImpl(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public static boolean safeContains(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
