package X;

import java.util.Queue;

/* renamed from: X.6lf  reason: invalid class name and case insensitive filesystem */
public class C135986lf extends C136186lz {
    public final C184148rK A00;
    public final Queue A01;

    public C135986lf(C184148rK r2, Queue queue) {
        super(41);
        this.A01 = queue;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return AnonymousClass75J.A00(this.A01, ((C135986lf) obj).A01);
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        AnonymousClass000.A1L(A1X, super.hashCode());
        A1X[1] = this.A01;
        return C18310x6.A08(this.A00, A1X, 2);
    }
}
