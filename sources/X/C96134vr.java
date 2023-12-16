package X;

/* renamed from: X.4vr  reason: invalid class name and case insensitive filesystem */
public final class C96134vr extends C1000059a {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96134vr) && C162457s7.A0P(this.throwable, ((C96134vr) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public C96134vr(Throwable th) {
        this.throwable = th;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeliveryError(throwable=");
        return C18260x0.A04(this.throwable, A0o);
    }
}
