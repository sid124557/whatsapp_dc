package X;

/* renamed from: X.6lq  reason: invalid class name and case insensitive filesystem */
public final class C136096lq extends C136186lz {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C136096lq) && this.A00 == ((C136096lq) obj).A00);
    }

    public C136096lq(int i) {
        super(65);
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VerticalSpaceViewItemData(height=");
        return C18260x0.A09(A0o, this.A00);
    }
}
