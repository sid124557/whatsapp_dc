package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.7iY  reason: invalid class name and case insensitive filesystem */
public final class C157587iY {
    public final int A00;
    public final int A01;
    public final C181328ma A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public String toString() {
        StringBuilder A0A = C18330xA.A0A("Component<");
        C18320x8.A1P(A0A, this.A04.toArray());
        A0A.append(">{");
        A0A.append(this.A00);
        A0A.append(", type=");
        A0A.append(this.A01);
        A0A.append(", deps=");
        C18320x8.A1P(A0A, this.A03.toArray());
        return AnonymousClass000.A0g(A0A);
    }

    public C157587iY(C181328ma r2, Set set, Set set2, Set set3, int i, int i2) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A05 = Collections.unmodifiableSet(set3);
    }
}
