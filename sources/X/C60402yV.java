package X;

/* renamed from: X.2yV  reason: invalid class name and case insensitive filesystem */
public final class C60402yV {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60402yV) && C162457s7.A0P(this.A00, ((C60402yV) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C60402yV(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ErrorState(messageResId=");
        return C18260x0.A04(this.A00, A0o);
    }

    public C60402yV() {
        this((Integer) null);
    }
}
