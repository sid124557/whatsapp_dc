package X;

import java.util.AbstractCollection;

/* renamed from: X.5Pd  reason: invalid class name and case insensitive filesystem */
public class C103975Pd {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C103975Pd r5 = (C103975Pd) obj;
            if (this.A00 != r5.A00 || !AnonymousClass75J.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C103975Pd(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public static C103975Pd A00(AnonymousClass4VQ r2, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return new C103975Pd(8, (String) null);
        }
        return new C103975Pd(0, r2.A0j.A0M().format((long) abstractCollection.size()));
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        return C18310x6.A08(this.A01, A0M, 1);
    }
}
