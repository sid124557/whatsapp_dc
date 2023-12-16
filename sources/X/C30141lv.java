package X;

/* renamed from: X.1lv  reason: invalid class name and case insensitive filesystem */
public final class C30141lv extends AnonymousClass28Q {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C30141lv) && this.A00 == ((C30141lv) obj).A00);
    }

    public C30141lv(int i) {
        this.A00 = i;
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Loading(progress=");
        return C18260x0.A09(A0o, this.A00);
    }
}
