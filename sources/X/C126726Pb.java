package X;

/* renamed from: X.6Pb  reason: invalid class name and case insensitive filesystem */
public final class C126726Pb extends C126476Oa implements Comparable {
    public long A00;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C126726Pb r8 = (C126726Pb) obj;
        boolean A1U = AnonymousClass000.A1U(this.flags & 4, 4);
        if (A1U == AnonymousClass000.A1U(r8.flags & 4, 4)) {
            long j = this.A00 - r8.A00;
            if (j == 0) {
                j = this.A00 - r8.A00;
                if (j == 0) {
                    return 0;
                }
            }
            if (j > 0) {
                return 1;
            }
            return -1;
        } else if (A1U) {
            return 1;
        } else {
            return -1;
        }
    }
}
