package X;

/* renamed from: X.2nV  reason: invalid class name and case insensitive filesystem */
public final class C53692nV {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53692nV) {
                C53692nV r5 = (C53692nV) obj;
                if (!(this.A00 == r5.A00 && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A03 == r5.A03 && this.A01 == r5.A01 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(this.A00 * 31, this.A04), this.A02), this.A06), this.A03), this.A01), this.A05);
    }

    public C53692nV(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = i;
        this.A04 = z;
        this.A02 = z2;
        this.A06 = z3;
        this.A03 = z4;
        this.A01 = z5;
        this.A05 = z6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("MediaDownloadLogData(mediaType=");
        A0o.append(this.A00);
        A0o.append(", isMidScan=");
        A0o.append(this.A04);
        A0o.append(", isFullImage=");
        A0o.append(this.A02);
        A0o.append(", isViewOnce=");
        A0o.append(this.A06);
        A0o.append(", isMediaAsDoc=");
        A0o.append(this.A03);
        A0o.append(", isCommunity=");
        A0o.append(this.A01);
        A0o.append(", isVideoHD=");
        return C18260x0.A0A(A0o, this.A05);
    }
}
