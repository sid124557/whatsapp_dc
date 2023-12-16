package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7pp  reason: invalid class name and case insensitive filesystem */
public final class C161517pp {
    public static Object[] copy(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Object[] newArray(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static Map newHashMapWithExpectedSize(int i) {
        return AnonymousClass8TF.createWithExpectedSize(i);
    }

    public static Set preservesInsertionOrderOnAddsSet() {
        return AnonymousClass8TM.create();
    }

    public static Map preservesInsertionOrderOnPutsMap() {
        return AnonymousClass8TF.create();
    }
}
