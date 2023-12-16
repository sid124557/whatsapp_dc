package X;

/* renamed from: X.7YB  reason: invalid class name */
public final class AnonymousClass7YB {
    public final C141346vQ A00;
    public final C141936wN A01;

    public AnonymousClass7YB(C141346vQ r2, C141936wN r3) {
        C162457s7.A0J(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass7YB) && this.A01 == ((AnonymousClass7YB) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18300x5.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallTooltipState(useCase=");
        A0o.append(this.A00);
        A0o.append(", stage=");
        return C18260x0.A04(this.A01, A0o);
    }
}
