package X;

/* renamed from: X.2ka  reason: invalid class name and case insensitive filesystem */
public final class C51912ka {
    public final int A00;
    public final C369120f A01;

    public C51912ka(C369120f r2, int i) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51912ka) {
                C51912ka r5 = (C51912ka) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18300x5.A04(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MetaData(position=");
        A0o.append(this.A01);
        A0o.append(", index=");
        return C18260x0.A09(A0o, this.A00);
    }
}
