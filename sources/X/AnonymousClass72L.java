package X;

/* renamed from: X.72L  reason: invalid class name */
public final class AnonymousClass72L {
    public static boolean A00(Object obj, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (!AnonymousClass72K.A00(objArr[i], obj)) {
                    i++;
                } else if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
