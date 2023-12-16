package X;

/* renamed from: X.2zA  reason: invalid class name and case insensitive filesystem */
public final class C60792zA {
    public final C61062ze A00;
    public final C27991fJ A01;
    public final Integer A02;
    public final boolean A03 = true;

    public C60792zA(C61062ze r2, C27991fJ r3, Integer num) {
        this.A01 = r3;
        this.A02 = num;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60792zA) {
                C60792zA r5 = (C60792zA) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A03 != r5.A03 || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A01(C18300x5.A04(this.A01), this.A03) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A00);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GroupInfoDataEnvelope {\n      |  isTruncated=");
        A0o.append(this.A03);
        A0o.append(",\n      |  size=");
        A0o.append(this.A02);
        A0o.append("\n      |  groupInfo=");
        A0o.append(this.A00);
        return C830345w.A09(AnonymousClass000.A0X("\n      |}", A0o));
    }

    public C60792zA(C27991fJ r3, Integer num) {
        this.A01 = r3;
        this.A02 = num;
        this.A00 = null;
    }
}
