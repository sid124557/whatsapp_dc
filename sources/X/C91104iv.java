package X;

/* renamed from: X.4iv  reason: invalid class name and case insensitive filesystem */
public final class C91104iv extends AnonymousClass5AG {
    public final AnonymousClass5AF A00;

    public C91104iv(AnonymousClass5AF r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91104iv) && C162457s7.A0P(this.A00, ((C91104iv) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Suspended(reason=");
        return C18260x0.A04(this.A00, A0o);
    }
}
