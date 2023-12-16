package X;

/* renamed from: X.4z7  reason: invalid class name and case insensitive filesystem */
public final class C97714z7 extends C100555Bj {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97714z7) && C162457s7.A0P(this.A00, ((C97714z7) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C97714z7(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Ok(result=");
        return C18260x0.A04(this.A00, A0o);
    }
}
