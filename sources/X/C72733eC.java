package X;

/* renamed from: X.3eC  reason: invalid class name and case insensitive filesystem */
public final class C72733eC implements C84834Dw {
    public final boolean A00;

    public C72733eC(boolean z) {
        this.A00 = z;
    }

    public C833246z B98() {
        return null;
    }

    public boolean BGz() {
        return this.A00;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Empty{");
        if (this.A00) {
            str = "Active";
        } else {
            str = "New";
        }
        A0o.append(str);
        return AnonymousClass000.A0d(A0o);
    }
}
