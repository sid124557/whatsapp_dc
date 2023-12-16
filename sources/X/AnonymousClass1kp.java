package X;

/* renamed from: X.1kp  reason: invalid class name */
public final class AnonymousClass1kp extends AnonymousClass28J {
    public final Throwable A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass1kp) && C162457s7.A0P(this.A00, ((AnonymousClass1kp) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass1kp(Throwable th) {
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeliveryError(throwable=");
        return C18260x0.A04(this.A00, A0o);
    }
}
