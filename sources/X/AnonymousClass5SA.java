package X;

/* renamed from: X.5SA  reason: invalid class name */
public final class AnonymousClass5SA {
    public final C66513Ls A00;
    public final AnonymousClass59D A01;
    public final String A02;

    public AnonymousClass5SA(C66513Ls r2, AnonymousClass59D r3, String str) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SA) {
                AnonymousClass5SA r5 = (AnonymousClass5SA) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass0x7.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PreviewLoadingInfo(state=");
        A0o.append(this.A01);
        A0o.append(", webPageInfo=");
        A0o.append(this.A00);
        A0o.append(", host=");
        return C18260x0.A07(this.A02, A0o);
    }
}
