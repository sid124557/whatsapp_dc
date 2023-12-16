package X;

/* renamed from: X.7Yi  reason: invalid class name and case insensitive filesystem */
public final class C152297Yi {
    public final C147147Cz A00;
    public final C91824lC A01;
    public final boolean A02;

    public C152297Yi(C147147Cz r2, C91824lC r3, boolean z) {
        C162457s7.A0J(r2, 2);
        this.A02 = z;
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152297Yi) {
                C152297Yi r5 = (C152297Yi) obj;
                if (this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, AnonymousClass000.A08(this.A00, AnonymousClass0x9.A04(this.A02)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MapViewFilterItem(isSelected=");
        A0o.append(this.A02);
        A0o.append(", clickListener=");
        A0o.append(this.A00);
        A0o.append(", bizDirectoryCategory=");
        return C18260x0.A04(this.A01, A0o);
    }
}
