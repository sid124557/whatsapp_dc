package X;

import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.3cp  reason: invalid class name and case insensitive filesystem */
public class C71883cp implements Comparator {
    public final C56982ss A00;
    public final C56062rM A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C27991fJ r1;
        AnonymousClass31A r9 = (AnonymousClass31A) obj;
        AnonymousClass31A r10 = (AnonymousClass31A) obj2;
        C27991fJ r4 = null;
        if (r9 == null || r9.A02 != 1) {
            r1 = null;
        } else {
            r1 = AnonymousClass34R.A01(r9.A05());
        }
        if (r10 != null && r10.A02 == 1) {
            r4 = AnonymousClass34R.A01(r10.A05());
        }
        if (r1 == null) {
            if (r4 == null) {
                return 0;
            }
            return -1;
        } else if (r4 == null) {
            return 1;
        } else {
            C56062rM r7 = this.A01;
            Iterator it = r7.A03(r1).iterator();
            long j = 0;
            while (it.hasNext()) {
                long A09 = this.A00.A09(AnonymousClass0x7.A0O(it).A02);
                if (A09 > j) {
                    j = A09;
                }
            }
            Iterator it2 = r7.A03(r4).iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                long A092 = this.A00.A09(AnonymousClass0x7.A0O(it2).A02);
                if (A092 > j2) {
                    j2 = A092;
                }
            }
            return Long.compare(j2, j);
        }
    }

    public C71883cp(C56982ss r1, C56062rM r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
