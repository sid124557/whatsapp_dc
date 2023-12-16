package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4p2  reason: invalid class name and case insensitive filesystem */
public final class C93704p2 extends AnonymousClass5RO {
    public C997257y A01(int i) {
        if (i == 8 || i == 21) {
            return C997257y.NO_PREFERENCE;
        }
        if (i == 32 || i == 33) {
            return C997257y.TOP_LEVEL;
        }
        return super.A01(i);
    }

    public List A02() {
        List A02 = super.A02();
        Integer[] numArr = new Integer[6];
        AnonymousClass000.A1L(numArr, 1);
        AnonymousClass000.A1P(numArr, 33, 1);
        AnonymousClass000.A1N(numArr, 32);
        AnonymousClass000.A1O(numArr, 21);
        C18280x3.A1P(numArr, 5);
        AnonymousClass000.A1P(numArr, 8, 5);
        List A0o = AnonymousClass8UF.A0o(numArr);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : A02) {
            C86624Kv.A1Q(next, A0s, AnonymousClass0x7.A1U(A0o, AnonymousClass001.A0K(next)) ? 1 : 0);
        }
        return C73723fy.A0K(A0s, A0o);
    }
}
