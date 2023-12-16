package X;

/* renamed from: X.6W9  reason: invalid class name */
public final class AnonymousClass6W9 extends AnonymousClass6WD implements Cloneable {
    public static volatile AnonymousClass6W9[] A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass6W9) {
                AnonymousClass6WD r5 = (AnonymousClass6WD) obj;
                AnonymousClass8LR r1 = this.A00;
                if (r1 != null && r1.A00 != 0) {
                    return r1.equals(r5.A00);
                }
                AnonymousClass8LR r0 = r5.A00;
                if (r0 == null || r0.A00 == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (AnonymousClass6W9.class.getName().hashCode() + 527) * 31 * 31 * 31;
        AnonymousClass8LR r1 = this.A00;
        if (!(r1 == null || r1.A00 == 0)) {
            i = r1.hashCode();
        }
        return hashCode + i;
    }

    public AnonymousClass6W9() {
        this.A00 = null;
        this.A00 = -1;
    }

    public final int A02() {
        return super.A02();
    }

    public final /* synthetic */ Object clone() {
        try {
            return super.A05();
        } catch (CloneNotSupportedException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public final void A04(C161777qQ r1) {
        super.A04(r1);
    }
}
