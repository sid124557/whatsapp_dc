package X;

/* renamed from: X.7Xn  reason: invalid class name and case insensitive filesystem */
public final class C152097Xn {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C152097Xn) && this.A00 == ((C152097Xn) obj).A00);
    }

    public int hashCode() {
        return this.A00 * 31;
    }

    public C152097Xn(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ScrollByState(distancePx=");
        A0o.append(this.A00);
        A0o.append(", durationMs=");
        return C18260x0.A09(A0o, 0);
    }
}
