package X;

/* renamed from: X.7Zi  reason: invalid class name and case insensitive filesystem */
public final class C152557Zi {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152557Zi) {
                C152557Zi r8 = (C152557Zi) obj;
                if (!(C162457s7.A0P(this.A04, r8.A04) && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A02 == r8.A02 && this.A05 == r8.A05 && C162457s7.A0P(this.A03, r8.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A07(this.A03, AnonymousClass0x2.A01(AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass000.A00(C18310x6.A09(this.A04), this.A01) * 31, this.A00), this.A02), this.A05));
    }

    public C152557Zi(String str, String str2, long j, long j2, long j3, boolean z) {
        this.A04 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = j3;
        this.A05 = z;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoDownloadedInfo(videoId=");
        A0o.append(this.A04);
        A0o.append(", fetchedTimeMs=");
        A0o.append(this.A01);
        A0o.append(", retryCount=");
        A0o.append(0);
        A0o.append(", bytesDownloaded=");
        A0o.append(this.A00);
        A0o.append(", totalMediaBytes=");
        A0o.append(this.A02);
        A0o.append(", isPrefetch=");
        A0o.append(this.A05);
        A0o.append(", downloadError=");
        A0o.append(this.A03);
        A0o.append(", statusCode=");
        return C18260x0.A09(A0o, 0);
    }
}
