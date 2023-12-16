package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.8UF  reason: invalid class name */
public class AnonymousClass8UF extends C159507lx {
    public static final int A0l(Comparable comparable, List list, int i) {
        int i2 = 0;
        int size = list.size();
        if (0 > i) {
            StringBuilder A0W = C18270x1.A0W(0, "fromIndex (");
            A0W.append(") is greater than toIndex (");
            A0W.append(i);
            throw AnonymousClass000.A0F(").", A0W);
        } else if (i <= size) {
            int i3 = i - 1;
            while (i2 <= i3) {
                int i4 = (i2 + i3) >>> 1;
                int A00 = AnonymousClass2A6.A00((Comparable) list.get(i4), comparable);
                if (A00 < 0) {
                    i2 = i4 + 1;
                } else if (A00 <= 0) {
                    return i4;
                } else {
                    i3 = i4 - 1;
                }
            }
            return -(i2 + 1);
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("toIndex (");
            A0o.append(i);
            C18270x1.A19(") is greater than size (", ").", A0o, size);
            throw new IndexOutOfBoundsException(A0o.toString());
        }
    }

    public static final ArrayList A0m(Object... objArr) {
        if (objArr.length == 0) {
            return AnonymousClass001.A0s();
        }
        return AnonymousClass002.A0J(new C71803ch(objArr, true));
    }

    public static final List A0o(Object... objArr) {
        if (objArr.length <= 0) {
            return C72023d3.A00;
        }
        List asList = Arrays.asList(objArr);
        C162457s7.A0D(asList);
        return asList;
    }

    public static final List A0p(Object... objArr) {
        C162457s7.A0J(objArr, 0);
        if (objArr.length == 0) {
            return AnonymousClass001.A0s();
        }
        return AnonymousClass002.A0J(new C71803ch(objArr, true));
    }

    public static final List A0n() {
        return C72023d3.A00;
    }

    public static final void A0q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void A0r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
