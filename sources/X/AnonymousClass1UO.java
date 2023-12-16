package X;

/* renamed from: X.1UO  reason: invalid class name */
public final class AnonymousClass1UO extends C50902ix {
    public final AnonymousClass2UW A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1UO) {
                AnonymousClass1UO r5 = (AnonymousClass1UO) obj;
                if (this.A03 != r5.A03 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A01, AnonymousClass000.A08(this.A00, AnonymousClass0x9.A04(this.A03))) + C18270x1.A00(this.A02);
    }

    public AnonymousClass1UO(AnonymousClass2UW r1, String str, String str2, boolean z) {
        super(r1);
        this.A03 = z;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Loading(selected=");
        A0o.append(this.A03);
        A0o.append(", section=");
        A0o.append(this.A00);
        A0o.append(", contentDescription=");
        A0o.append(this.A01);
        A0o.append(", trayIconPath=");
        return C18260x0.A07(this.A02, A0o);
    }
}
