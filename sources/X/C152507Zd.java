package X;

import android.net.Uri;

/* renamed from: X.7Zd  reason: invalid class name and case insensitive filesystem */
public final class C152507Zd {
    public final Uri A00;
    public final Uri A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152507Zd) {
                C152507Zd r5 = (C152507Zd) obj;
                if (!(C162457s7.A0P(this.A00, r5.A00) && C162457s7.A0P(this.A01, r5.A01) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(((AnonymousClass000.A07(this.A00) * 31) + C18310x6.A07(this.A01)) * 31, this.A03), this.A02), this.A04);
    }

    public C152507Zd(Uri uri, Uri uri2, boolean z, boolean z2, boolean z3) {
        this.A00 = uri;
        this.A01 = uri2;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BloksVideoPlayerConfig(videoHdUri=");
        A0o.append(this.A00);
        A0o.append(", videoRegularUri=");
        A0o.append(this.A01);
        A0o.append(", loop=");
        A0o.append(this.A03);
        A0o.append(", autoplay=");
        A0o.append(this.A02);
        A0o.append(", muteOnMount=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
