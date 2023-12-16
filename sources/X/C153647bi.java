package X;

/* renamed from: X.7bi  reason: invalid class name and case insensitive filesystem */
public final class C153647bi {
    public final float A00;
    public final float A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C153647bi) {
                C153647bi r5 = (C153647bi) obj;
                if (!(C162457s7.A0P(this.A03, r5.A03) && C162457s7.A0P(this.A04, r5.A04) && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A00() {
        return this.A00;
    }

    public final float A01() {
        return this.A01;
    }

    public final float A02() {
        return this.A00;
    }

    public final float A03() {
        return this.A01;
    }

    public final int A04() {
        return this.A02;
    }

    public final int A05() {
        return this.A02;
    }

    public final String A06() {
        return this.A04;
    }

    public final String A07() {
        return this.A04;
    }

    public int hashCode() {
        return ((AnonymousClass6C9.A07((AnonymousClass0x2.A07(this.A04, C18310x6.A09(this.A03)) + 400) * 31, this.A00) + this.A02) * 31) + Float.floatToIntBits(this.A01);
    }

    public C153647bi(String str, String str2, float f, float f2, int i) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = f;
        this.A02 = i;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CdsTypographyData(accessibilityRole=");
        A0o.append(this.A03);
        A0o.append(", fontFamily=");
        A0o.append(this.A04);
        A0o.append(", fontWeight=");
        A0o.append(400);
        A0o.append(", letterSpacing=");
        A0o.append(this.A00);
        A0o.append(", fontSize=");
        A0o.append(this.A02);
        A0o.append(", lineHeightMultiplier=");
        A0o.append(this.A01);
        return AnonymousClass000.A0c(A0o);
    }
}
