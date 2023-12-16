package X;

/* renamed from: X.6t7  reason: invalid class name and case insensitive filesystem */
public final class C140076t7 extends AnonymousClass75U {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C140076t7) && this.A00 == ((C140076t7) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C140076t7(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Resource(layout=");
        return C18260x0.A09(A0o, this.A00);
    }
}
