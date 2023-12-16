package X;

/* renamed from: X.7ZI  reason: invalid class name */
public final class AnonymousClass7ZI {
    public final int A00;
    public final long A01;
    public final C141536vj A02;
    public final Integer A03;

    public AnonymousClass7ZI(C141536vj r2, Integer num, int i, long j) {
        C162457s7.A0J(r2, 2);
        this.A01 = j;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZI) {
                AnonymousClass7ZI r8 = (AnonymousClass7ZI) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00 && C162457s7.A0P(this.A03, r8.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A08(this.A02, AnonymousClass0x2.A02(this.A01)) + this.A00) * 31) + AnonymousClass000.A07(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PopupMenuListItem(id=");
        A0o.append(this.A01);
        A0o.append(", type=");
        A0o.append(this.A02);
        A0o.append(", textId=");
        A0o.append(this.A00);
        A0o.append(", iconResourceId=");
        return C18260x0.A04(this.A03, A0o);
    }
}
