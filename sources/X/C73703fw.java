package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3fw  reason: invalid class name and case insensitive filesystem */
public final class C73703fw extends C73713fx {
    public static final int A00(Object obj, Object[] objArr) {
        int i = 0;
        int length = objArr.length;
        if (obj == null) {
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                }
            }
            return -1;
        }
        while (i < length) {
            if (!obj.equals(objArr[i])) {
                i++;
            }
        }
        return -1;
        return i;
    }

    public static final List A04(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C72023d3.A00;
        }
        if (length != 1) {
            return AnonymousClass002.A0J(new C71803ch(objArr, false));
        }
        return C18290x4.A12(objArr[0]);
    }

    public static final Set A05(Object[] objArr) {
        int i = 0;
        int length = objArr.length;
        if (length == 0) {
            return C72063d7.A00;
        }
        if (length == 1) {
            return C18290x4.A13(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AnonymousClass8UG.A0I(length));
        do {
            linkedHashSet.add(objArr[i]);
            i++;
        } while (i < length);
        return linkedHashSet;
    }

    public static final String A01(CharSequence charSequence, Object[] objArr) {
        C18260x0.A0O(objArr, charSequence);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                A0o.append(charSequence);
            }
            AnonymousClass2AB.A03(A0o, obj, (AnonymousClass4GQ) null);
        }
        A0o.append("");
        return C18290x4.A0o(A0o);
    }

    public static final List A03(Object[] objArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : objArr) {
            if (obj != null) {
                A0s.add(obj);
            }
        }
        return A0s;
    }
}
