package X;

/* renamed from: X.4id  reason: invalid class name and case insensitive filesystem */
public final class C90934id extends C118255tF {
    public final AnonymousClass23V error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C90934id) && C162457s7.A0P(this.error, ((C90934id) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public C90934id(AnonymousClass23V r1) {
        this.error = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EffectFetchFailed(error=");
        return C18260x0.A04(this.error, A0o);
    }
}
