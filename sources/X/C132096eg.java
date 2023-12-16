package X;

/* renamed from: X.6eg  reason: invalid class name and case insensitive filesystem */
public final class C132096eg extends AnonymousClass73X {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132096eg) {
                C132096eg r5 = (C132096eg) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && C162457s7.A0P(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A02, AnonymousClass0x2.A01(((this.A00 * 31) + this.A01) * 31, this.A03));
    }

    public C132096eg(int i, int i2, String str, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = z;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarBackground(backgroundColor=");
        A0o.append(this.A00);
        A0o.append(", ringColor=");
        A0o.append(this.A01);
        A0o.append(", isSelected=");
        A0o.append(this.A03);
        A0o.append(", contentDescription=");
        return C18260x0.A07(this.A02, A0o);
    }
}
