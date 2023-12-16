package X;

/* renamed from: X.7po  reason: invalid class name and case insensitive filesystem */
public final class C161507po {
    public static Object[] checkElementsNotNull(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            checkElementNotNull(objArr[i2], i2);
        }
        return objArr;
    }

    public static Object[] toArrayImpl(Object[] objArr, int i, int i2, Object[] objArr2) {
        C162187rP.A03(0, i2, objArr.length);
        int length = objArr2.length;
        if (length < i2) {
            objArr2 = newArray(objArr2, i2);
        } else if (length > i2) {
            objArr2[i2] = null;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        return objArr2;
    }

    public static Object checkElementNotNull(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass001.A0g(AnonymousClass000.A0Y("at index ", AnonymousClass6CA.A0Y(20), i));
    }

    public static Object[] newArray(Object[] objArr, int i) {
        return C161517pp.newArray(objArr, i);
    }

    public static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }
}
