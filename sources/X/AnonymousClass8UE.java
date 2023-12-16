package X;

import java.util.List;

/* renamed from: X.8UE  reason: invalid class name */
public class AnonymousClass8UE extends C73743g0 {
    public static final int A0i(List list, int i) {
        C175698Zj r1 = new C175698Zj(0, AnonymousClass002.A03(list));
        if (r1.A00 <= i && i <= r1.A01) {
            return AnonymousClass002.A03(list) - i;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Element index ");
        A0o.append(i);
        A0o.append(" must be in range [");
        A0o.append(new C175698Zj(0, AnonymousClass002.A03(list)));
        throw new IndexOutOfBoundsException(AnonymousClass000.A0X("].", A0o));
    }

    public static final int A0j(List list, int i) {
        C175698Zj r1 = new C175698Zj(0, list.size());
        if (r1.A00 <= i && i <= r1.A01) {
            return AnonymousClass002.A04(list, i);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Position index ");
        A0o.append(i);
        A0o.append(" must be in range [");
        A0o.append(new C175698Zj(0, list.size()));
        throw new IndexOutOfBoundsException(AnonymousClass000.A0X("].", A0o));
    }
}
