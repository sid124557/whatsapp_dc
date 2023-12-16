package X;

import java.util.Comparator;

/* renamed from: X.3cs  reason: invalid class name and case insensitive filesystem */
public class C71913cs implements Comparator {
    public final C71893cq A00;

    public static final C52882mC A00(AnonymousClass31A r6) {
        if (r6 == null || AnonymousClass32V.A00(r6.A05()) == null || r6.A07() == null) {
            return null;
        }
        return new C52882mC(AnonymousClass32V.A01(r6.A05()), r6.A07(), r6.A02, 0);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C52882mC A002 = A00((AnonymousClass31A) obj);
        C52882mC A003 = A00((AnonymousClass31A) obj2);
        if (A002 == null) {
            if (A003 == null) {
                return 0;
            }
            return -1;
        } else if (A003 == null) {
            return 1;
        } else {
            return this.A00.compare(A002, A003);
        }
    }

    public C71913cs(C56982ss r2) {
        this.A00 = new C71893cq(r2);
    }
}
