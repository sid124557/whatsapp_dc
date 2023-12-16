package X;

/* renamed from: X.2j1  reason: invalid class name and case insensitive filesystem */
public final class C50942j1 {
    public final AnonymousClass4GP A00;

    public C50942j1(AnonymousClass4GP r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50942j1) && C162457s7.A0P(this.A00, ((C50942j1) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(onClick=");
        return C18260x0.A04(this.A00, A0o);
    }
}
