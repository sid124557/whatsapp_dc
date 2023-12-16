package X;

/* renamed from: X.7ZW  reason: invalid class name */
public final class AnonymousClass7ZW {
    public final C108975ds A00;
    public final C108975ds A01;
    public final C108975ds A02;
    public final C108975ds A03;
    public final C108995du A04;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7ZW)) {
            return false;
        }
        AnonymousClass7ZW r4 = (AnonymousClass7ZW) obj;
        return this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01) && this.A04.equals(r4.A04);
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A04, AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A00, AnonymousClass000.A08(this.A03, AnonymousClass6C8.A04(this.A02.hashCode())))));
    }

    public AnonymousClass7ZW(C108975ds r1, C108975ds r2, C108975ds r3, C108975ds r4, C108995du r5) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass7ZW.class.getSimpleName());
        A0o.append("{nearLeft=");
        A0o.append(this.A02);
        A0o.append(", nearRight=");
        A0o.append(this.A03);
        A0o.append(", farLeft=");
        A0o.append(this.A00);
        A0o.append(", farRight=");
        A0o.append(this.A01);
        A0o.append(", latLngBounds=");
        A0o.append(this.A04);
        return AnonymousClass000.A0g(A0o);
    }
}
