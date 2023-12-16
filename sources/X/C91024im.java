package X;

/* renamed from: X.4im  reason: invalid class name and case insensitive filesystem */
public final class C91024im extends AnonymousClass5AD {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C91024im) && this.A00 == ((C91024im) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C91024im(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Error(errorType=");
        return C18260x0.A09(A0o, this.A00);
    }
}
