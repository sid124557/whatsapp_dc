package X;

/* renamed from: X.6jJ  reason: invalid class name and case insensitive filesystem */
public final class C134606jJ extends AnonymousClass74Z {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134606jJ) && C162457s7.A0P(this.A00, ((C134606jJ) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C134606jJ(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Success(data=");
        return C18260x0.A04(this.A00, A0o);
    }
}
