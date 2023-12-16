package X;

import java.util.List;

/* renamed from: X.5Ry  reason: invalid class name and case insensitive filesystem */
public final class C104685Ry {
    public final C997057r A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104685Ry) {
                C104685Ry r5 = (C104685Ry) obj;
                if (this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public C104685Ry(C997057r r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Signal(signalType=");
        A0o.append(this.A00);
        A0o.append(", contactInfoList=");
        return C18260x0.A04(this.A01, A0o);
    }
}
