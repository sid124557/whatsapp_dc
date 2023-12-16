package X;

import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.7lh  reason: invalid class name and case insensitive filesystem */
public final class C159357lh {
    public static int A00(long j) {
        int i = (int) j;
        if (AnonymousClass000.A1T((((long) i) > j ? 1 : (((long) i) == j ? 0 : -1)))) {
            return i;
        }
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1Q(A0L, 0, j);
        throw AnonymousClass001.A0c(Strings.A00("Out of range: %s", A0L));
    }

    public static int[] A02(Collection collection) {
        if (collection instanceof AnonymousClass8T8) {
            AnonymousClass8T8 r4 = (AnonymousClass8T8) collection;
            return Arrays.copyOfRange(r4.array, r4.start, r4.end);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = AnonymousClass001.A0K(obj);
        }
        return iArr;
    }

    public static int A01(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
