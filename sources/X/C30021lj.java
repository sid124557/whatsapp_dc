package X;

/* renamed from: X.1lj  reason: invalid class name and case insensitive filesystem */
public final class C30021lj extends AnonymousClass28O {
    public final C51042jB A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C30021lj) && C162457s7.A0P(this.A00, ((C30021lj) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C30021lj(C51042jB r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RemoteSticker(stableId=");
        return C18260x0.A04(this.A00, A0o);
    }
}
