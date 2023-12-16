package X;

/* renamed from: X.6jW  reason: invalid class name and case insensitive filesystem */
public final class C134726jW extends C1450974d {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134726jW) && C162457s7.A0P(this.A00, ((C134726jW) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134726jW(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(errorMessage=");
        return C18260x0.A07(this.A00, A0o);
    }
}
