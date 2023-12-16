package X;

/* renamed from: X.7Zt  reason: invalid class name */
public final class AnonymousClass7Zt {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7Zt) {
                AnonymousClass7Zt r8 = (AnonymousClass7Zt) obj;
                if (!C162457s7.A0P(this.A06, r8.A06) || !C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A03, r8.A03) || !C162457s7.A0P(this.A02, r8.A02) || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A07 != r8.A07 || !C162457s7.A0P(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.A05, AnonymousClass0x2.A01(AnonymousClass000.A00(AnonymousClass000.A00((AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A07(this.A04, C18310x6.A09(this.A06))) + C18270x1.A00(this.A02)) * 31, this.A00), this.A01), this.A07));
    }

    public AnonymousClass7Zt(String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
        C18260x0.A0V(str, str2, str3);
        this.A06 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A00 = j;
        this.A01 = j2;
        this.A07 = z;
        this.A05 = str5;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AIBotEmbodimentVideoData(videoId=");
        A0o.append(this.A06);
        A0o.append(", sdProgressiveUrl=");
        A0o.append(this.A04);
        A0o.append(", hdProgressiveUrl=");
        A0o.append(this.A03);
        A0o.append(", dashManifest=");
        A0o.append(this.A02);
        A0o.append(", durationMs=");
        A0o.append(this.A00);
        A0o.append(", expiry=");
        A0o.append(this.A01);
        A0o.append(", fallback=");
        A0o.append(this.A07);
        A0o.append(", uniqueId=");
        return C18260x0.A07(this.A05, A0o);
    }
}
