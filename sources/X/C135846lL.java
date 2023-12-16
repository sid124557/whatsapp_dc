package X;

import java.util.List;

/* renamed from: X.6lL  reason: invalid class name and case insensitive filesystem */
public abstract class C135846lL extends C96284w7 {
    public final C182758ow A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C135846lL r5 = (C135846lL) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C135846lL(C182758ow r1, AnonymousClass65P r2, List list, int i) {
        super(r2, i);
        this.A01 = list;
        this.A00 = r1;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        return C18310x6.A08(this.A01, A0M, 1);
    }
}
