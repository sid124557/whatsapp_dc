package X;

import java.util.Set;

/* renamed from: X.5Nx  reason: invalid class name and case insensitive filesystem */
public final class C103675Nx {
    public final Set A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;

    public C103675Nx(Set set, Set set2, Set set3, Set set4) {
        this.A01 = set;
        this.A02 = set2;
        this.A00 = set3;
        this.A03 = set4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sending = ");
        A0o.append(this.A02.size());
        A0o.append(", send = ");
        A0o.append(this.A03.size());
        A0o.append(", deleting = ");
        A0o.append(this.A00.size());
        A0o.append(", failed = ");
        return AnonymousClass000.A0h(A0o, this.A01.size());
    }
}
