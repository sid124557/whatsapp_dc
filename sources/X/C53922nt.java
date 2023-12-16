package X;

/* renamed from: X.2nt  reason: invalid class name and case insensitive filesystem */
public final class C53922nt {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53922nt) {
                C53922nt r5 = (C53922nt) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A08 == r5.A08 && this.A05 == r5.A05 && this.A03 == r5.A03 && this.A07 == r5.A07 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(((this.A00 * 31) + this.A01) * 31, this.A02), this.A04), this.A08), this.A05), this.A03), this.A07), this.A06);
    }

    public C53922nt(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = z;
        this.A04 = z2;
        this.A08 = z3;
        this.A05 = z4;
        this.A03 = z5;
        this.A07 = z6;
        this.A06 = z7;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaSentLogData(mediaType=");
        A0o.append(this.A00);
        A0o.append(", origin=");
        A0o.append(this.A01);
        A0o.append(", isChat=");
        A0o.append(this.A02);
        A0o.append(", isGroup=");
        A0o.append(this.A04);
        A0o.append(", isStatus=");
        A0o.append(this.A08);
        A0o.append(", isLargeDoc=");
        A0o.append(this.A05);
        A0o.append(", isCommunity=");
        A0o.append(this.A03);
        A0o.append(", isOriginalQuality=");
        A0o.append(this.A07);
        A0o.append(", isMediaAsDoc=");
        return C18260x0.A0A(A0o, this.A06);
    }
}
