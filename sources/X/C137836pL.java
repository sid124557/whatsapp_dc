package X;

/* renamed from: X.6pL  reason: invalid class name and case insensitive filesystem */
public final class C137836pL extends AnonymousClass7V0 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C137836pL(int i, int i2, String str, String str2) {
        C162457s7.A0J(str2, 4);
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137836pL) {
                C137836pL r5 = (C137836pL) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A03, r5.A03) || this.A00 != r5.A00 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.A01 * 31;
        return AnonymousClass0x7.A08(this.A02, (AnonymousClass0x2.A07(this.A03, i) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarStickerHeaderIconItem(index=");
        A0o.append(this.A01);
        A0o.append(", pageId=");
        A0o.append(this.A03);
        A0o.append(", icon=");
        A0o.append(this.A00);
        A0o.append(", accessibilityLabel=");
        return C18260x0.A07(this.A02, A0o);
    }
}
