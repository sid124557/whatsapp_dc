package X;

/* renamed from: X.8LV  reason: invalid class name */
public final class AnonymousClass8LV implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final C153097af A03;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass8LV r6 = (AnonymousClass8LV) obj;
        Object obj2 = this.A02;
        if (AnonymousClass000.A1X(obj2) != AnonymousClass000.A1X(r6.A02)) {
            if (obj2 != null) {
                return -1;
            }
            return 1;
        } else if (obj2 == null) {
            return 0;
        } else {
            int i = this.A00 - r6.A00;
            if (i != 0) {
                return i;
            }
            int i2 = (this.A01 > r6.A01 ? 1 : (this.A01 == r6.A01 ? 0 : -1));
            if (i2 >= 0) {
                if (i2 == 0) {
                    return 0;
                }
                return 1;
            }
        }
        return -1;
    }

    public AnonymousClass8LV(C153097af r1) {
        this.A03 = r1;
    }
}
