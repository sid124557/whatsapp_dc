package X;

/* renamed from: X.4z6  reason: invalid class name and case insensitive filesystem */
public final class C97704z6 extends C100555Bj {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97704z6) && C162457s7.A0P(this.A00, ((C97704z6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97704z6(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Err(error=");
        return C18260x0.A04(this.A00, A0o);
    }
}
