package X;

import java.util.List;

/* renamed from: X.5SL  reason: invalid class name */
public final class AnonymousClass5SL {
    public final C997458a A00;
    public final List A01;
    public final boolean A02;

    public AnonymousClass5SL(C997458a r2, List list, boolean z) {
        C162457s7.A0J(r2, 2);
        this.A01 = list;
        this.A00 = r2;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SL) {
                AnonymousClass5SL r5 = (AnonymousClass5SL) obj;
                if (!(C162457s7.A0P(this.A01, r5.A01) && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A00, C18300x5.A04(this.A01)), this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RemoteSearchResults(newsletters=");
        A0o.append(this.A01);
        A0o.append(", state=");
        A0o.append(this.A00);
        A0o.append(", resetScroll=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
