package X;

/* renamed from: X.7Zq  reason: invalid class name and case insensitive filesystem */
public final class C152637Zq {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152637Zq) {
                C152637Zq r5 = (C152637Zq) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A06 == r5.A06 && this.A05 == r5.A05 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(((this.A01 * 31) + this.A00) * 31, this.A03), this.A04), this.A06), this.A05), this.A02);
    }

    public C152637Zq(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A02 = z5;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NetworkHealthEvent(previousState=");
        A0o.append(this.A01);
        A0o.append(", currentState=");
        A0o.append(this.A00);
        A0o.append(", shouldPlaySoundAlert=");
        A0o.append(this.A03);
        A0o.append(", shouldShowBannerSubtitle=");
        A0o.append(this.A04);
        A0o.append(", shouldShowPoorNetworkBanner=");
        A0o.append(this.A06);
        A0o.append(", shouldShowNoNetworkBanner=");
        A0o.append(this.A05);
        A0o.append(", isVersion2=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
