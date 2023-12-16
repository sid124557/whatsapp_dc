package X;

/* renamed from: X.2nr  reason: invalid class name and case insensitive filesystem */
public final class C53902nr {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C160117n4 A05;
    public final C152747a3 A06;
    public final String A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53902nr) {
                C53902nr r8 = (C53902nr) obj;
                if (!(C162457s7.A0P(this.A07, r8.A07) && this.A02 == r8.A02 && this.A01 == r8.A01 && this.A00 == r8.A00 && this.A03 == r8.A03 && this.A04 == r8.A04 && C162457s7.A0P(this.A05, r8.A05) && C162457s7.A0P(this.A06, r8.A06) && this.A08 == r8.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00((AnonymousClass000.A08(this.A05, AnonymousClass000.A00(AnonymousClass000.A00((AnonymousClass000.A00(AnonymousClass000.A00(C18310x6.A09(this.A07), this.A02), this.A01) + this.A00) * 31, this.A03), this.A04)) + AnonymousClass000.A07(this.A06)) * 31, this.A08);
    }

    public C53902nr(C160117n4 r1, C152747a3 r2, String str, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A07 = str;
        this.A02 = j;
        this.A01 = j2;
        this.A00 = i;
        this.A03 = j3;
        this.A04 = j4;
        this.A05 = r1;
        this.A06 = r2;
        this.A08 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VideoCompletedInfo(videoId=");
        A0o.append(this.A07);
        A0o.append(", playbackStartLatencyMs=");
        A0o.append(this.A02);
        A0o.append(", playbackStallTimeMs=");
        A0o.append(this.A01);
        A0o.append(", playbackStallCount=");
        A0o.append(this.A00);
        A0o.append(", playbackTime=");
        A0o.append(this.A03);
        A0o.append(", videoDuration=");
        A0o.append(this.A04);
        A0o.append(", playbackError=");
        A0o.append(this.A05);
        A0o.append(", videoQueuedContext=");
        A0o.append(this.A06);
        A0o.append(", isNextVideoPrepared=");
        return C18260x0.A0A(A0o, this.A08);
    }
}
