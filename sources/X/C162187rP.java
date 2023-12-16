package X;

import com.google.common.base.Strings;

/* renamed from: X.7rP  reason: invalid class name and case insensitive filesystem */
public final class C162187rP {
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
            throw AnonymousClass000.A0G("negative size: ", AnonymousClass6CA.A0Y(26), i2);
        }
        return Strings.A00(str2, A1X);
    }

    public static void A01(int i, int i2) {
        Object[] A1X;
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                A1X = new Object[2];
                A1X[0] = "index";
                AnonymousClass000.A1P(A1X, i, 1);
                str = "%s (%s) must not be negative";
            } else if (i2 >= 0) {
                A1X = AnonymousClass0x9.A1X();
                A1X[0] = "index";
                C86604Kt.A1X(A1X, i, 1, i2, 2);
                str = "%s (%s) must be less than size (%s)";
            } else {
                throw AnonymousClass000.A0G("negative size: ", AnonymousClass6CA.A0Y(26), i2);
            }
            throw new IndexOutOfBoundsException(Strings.A00(str, A1X));
        }
    }

    public static void A02(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(A00("index", i, i2));
        }
    }

    public static void A03(int i, int i2, int i3) {
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
                    str = Strings.A00("end index (%s) must not be less than start index (%s)", A0M);
                }
                throw new IndexOutOfBoundsException(str);
            }
        }
        str = A00("start index", i, i3);
        throw new IndexOutOfBoundsException(str);
    }

    public static void A04(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0g(String.valueOf(obj2));
        }
    }

    public static void A05(Object obj, boolean z) {
        if (!z) {
            throw AnonymousClass001.A0e(String.valueOf(obj));
        }
    }

    public static void A06(boolean z) {
        if (!z) {
            throw AnonymousClass6CA.A0N();
        }
    }
}
