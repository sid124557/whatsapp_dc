package X;

/* renamed from: X.6jx  reason: invalid class name and case insensitive filesystem */
public final class C134996jx extends C1451174f {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134996jx) && C162457s7.A0P(this.A00, ((C134996jx) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134996jx(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DebugInfo(debugInfoJson=");
        return C18260x0.A07(this.A00, A0o);
    }
}
