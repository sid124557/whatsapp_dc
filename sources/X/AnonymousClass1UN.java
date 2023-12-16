package X;

/* renamed from: X.1UN  reason: invalid class name */
public final class AnonymousClass1UN extends C50902ix {
    public final int A00;
    public final AnonymousClass2UW A01;
    public final String A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1UN(AnonymousClass2UW r2, String str, int i, boolean z) {
        super(r2);
        C162457s7.A0J(r2, 2);
        this.A03 = z;
        this.A01 = r2;
        this.A02 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1UN) {
                AnonymousClass1UN r5 = (AnonymousClass1UN) obj;
                if (this.A03 != r5.A03 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A02, AnonymousClass000.A08(this.A01, AnonymousClass0x9.A04(this.A03))) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CustomIcon(selected=");
        A0o.append(this.A03);
        A0o.append(", section=");
        A0o.append(this.A01);
        A0o.append(", contentDescription=");
        A0o.append(this.A02);
        A0o.append(", trayIconResource=");
        return C18260x0.A09(A0o, this.A00);
    }
}
