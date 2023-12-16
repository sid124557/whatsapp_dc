package X;

/* renamed from: X.7le  reason: invalid class name and case insensitive filesystem */
public final class C159327le {
    public static String A00(String str, int i, int i2) {
        Object[] A1X;
        String str2;
        if (i < 0) {
            A1X = new Object[2];
            A1X[0] = str;
            AnonymousClass000.A1P(A1X, i, 1);
            str2 = "%s (%s) must not be negative";
        } else if (i2 >= 0) {
            A1X = AnonymousClass0x9.A1X();
            A1X[0] = str;
            C86604Kt.A1X(A1X, i, 1, i2, 2);
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            throw AnonymousClass000.A0G("negative size: ", AnonymousClass001.A0o(), i2);
        }
        return AnonymousClass72W.A00(str2, A1X);
    }

    public static void A01(int i, int i2) {
        Object[] objArr;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                objArr = new Object[2];
                objArr[0] = "index";
                AnonymousClass000.A1P(objArr, i, 1);
                str = "%s (%s) must not be negative";
            } else if (i2 < 0) {
                throw AnonymousClass000.A0G("negative size: ", AnonymousClass001.A0o(), i2);
            } else {
                objArr = AnonymousClass0x9.A1X();
                objArr[0] = "index";
                C86604Kt.A1X(objArr, i, 1, i2, 2);
                str = "%s (%s) must be less than size (%s)";
            }
            throw new IndexOutOfBoundsException(AnonymousClass72W.A00(str, objArr));
        }
    }

    public static void A02(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = A00("end index", i2, i3);
                } else {
                    Object[] A0M = AnonymousClass002.A0M();
                    C18270x1.A1Q(A0M, i2);
                    AnonymousClass000.A1P(A0M, i, 1);
                    str = AnonymousClass72W.A00("end index (%s) must not be less than start index (%s)", A0M);
                }
                throw new IndexOutOfBoundsException(str);
            }
        }
        str = A00("start index", i, i3);
        throw new IndexOutOfBoundsException(str);
    }
}
