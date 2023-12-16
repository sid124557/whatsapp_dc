package X;

/* renamed from: X.1UQ  reason: invalid class name */
public final class AnonymousClass1UQ extends C50902ix {
    public final AnonymousClass2UW A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1UQ) {
                AnonymousClass1UQ r5 = (AnonymousClass1UQ) obj;
                if (this.A04 != r5.A04 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((AnonymousClass0x2.A07(this.A01, AnonymousClass000.A08(this.A00, AnonymousClass0x9.A04(this.A04))) + C18270x1.A00(this.A02)) * 31, this.A03);
    }

    public AnonymousClass1UQ(AnonymousClass2UW r1, String str, String str2, boolean z, boolean z2) {
        super(r1);
        this.A04 = z;
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Installed(selected=");
        A0o.append(this.A04);
        A0o.append(", section=");
        A0o.append(this.A00);
        A0o.append(", contentDescription=");
        A0o.append(this.A01);
        A0o.append(", trayIconPath=");
        A0o.append(this.A02);
        A0o.append(", isNew=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
