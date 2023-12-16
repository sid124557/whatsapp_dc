package X;

/* renamed from: X.0gh  reason: invalid class name and case insensitive filesystem */
public class C09750gh implements C16340sr {
    public String A00;
    public boolean A01;

    public boolean BKq(C02420Gc r7, C01780Ce r8) {
        String str;
        if (!this.A01 || this.A00 != null) {
            str = this.A00;
        } else {
            str = r8.A00();
        }
        C16810u0 r0 = r8.A00;
        if (r0 != null) {
            int i = 0;
            for (AnonymousClass0NJ r02 : r0.B5U()) {
                if (str == null || r02.A00().equals(str)) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public String toString() {
        if (!this.A01) {
            return String.format("only-child", new Object[0]);
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = this.A00;
        return String.format("only-of-type <%s>", A0L);
    }

    public C09750gh(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }
}
