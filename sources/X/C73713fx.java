package X;

import java.util.Arrays;

/* renamed from: X.3fx  reason: invalid class name and case insensitive filesystem */
public class C73713fx extends AnonymousClass8UD {
    public static final Object[] A06(Object[] objArr, Object[] objArr2) {
        C18270x1.A14(objArr, objArr2);
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        C162457s7.A0H(copyOf);
        return copyOf;
    }
}
