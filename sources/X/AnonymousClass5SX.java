package X;

/* renamed from: X.5SX  reason: invalid class name */
public final class AnonymousClass5SX {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass5SX(int i, int i2, String str, boolean z) {
        C162457s7.A0J(str, 1);
        this.A02 = str;
        this.A01 = i;
        this.A03 = z;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SX) {
                AnonymousClass5SX r5 = (AnonymousClass5SX) obj;
                if (!(C162457s7.A0P(this.A02, r5.A02) && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01((C18310x6.A09(this.A02) + this.A01) * 31, this.A03) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiExpressionsSection(id=");
        A0o.append(this.A02);
        A0o.append(", icon=");
        A0o.append(this.A01);
        A0o.append(", selected=");
        A0o.append(this.A03);
        A0o.append(", accessibilityLabel=");
        return C18260x0.A09(A0o, this.A00);
    }
}
