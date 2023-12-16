package X;

/* renamed from: X.7Ze  reason: invalid class name and case insensitive filesystem */
public final class C152517Ze {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C152517Ze)) {
            return false;
        }
        C152517Ze r4 = (C152517Ze) obj;
        return this.A00 == r4.A00 && this.A04 == r4.A04 && this.A03.equals(r4.A03) && this.A02.equals(r4.A02) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 0;
        if (this.A04) {
            i2 = 64;
        }
        return i + i2 + (this.A03.hashCode() * this.A02.hashCode() * this.A01.hashCode());
    }

    public C152517Ze(String str, String str2, String str3, int i, boolean z) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = z;
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A03);
        A0o.append('.');
        A0o.append(this.A02);
        A0o.append(this.A01);
        A0o.append(" (");
        A0o.append(this.A00);
        if (this.A04) {
            str = " itf";
        } else {
            str = "";
        }
        return C18260x0.A07(str, A0o);
    }
}
