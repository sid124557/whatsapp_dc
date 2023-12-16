package X;

/* renamed from: X.1UP  reason: invalid class name */
public final class AnonymousClass1UP extends C50902ix {
    public final int A00;
    public final AnonymousClass2UW A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1UP) {
                AnonymousClass1UP r5 = (AnonymousClass1UP) obj;
                if (this.A04 != r5.A04 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A00 != r5.A00 || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A07(this.A02, AnonymousClass000.A08(this.A01, AnonymousClass0x9.A04(this.A04))) + this.A00) * 31) + C18270x1.A00(this.A03);
    }

    public AnonymousClass1UP(AnonymousClass2UW r1, String str, String str2, int i, boolean z) {
        super(r1);
        this.A04 = z;
        this.A01 = r1;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Downloading(selected=");
        A0o.append(this.A04);
        A0o.append(", section=");
        A0o.append(this.A01);
        A0o.append(", contentDescription=");
        A0o.append(this.A02);
        A0o.append(", progress=");
        A0o.append(this.A00);
        A0o.append(", trayIconPath=");
        return C18260x0.A07(this.A03, A0o);
    }
}
