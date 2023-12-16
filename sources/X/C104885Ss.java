package X;

/* renamed from: X.5Ss  reason: invalid class name and case insensitive filesystem */
public final class C104885Ss {
    public final C150477Qw A00;
    public final C150477Qw A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104885Ss) {
                C104885Ss r5 = (C104885Ss) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A05 != r5.A05 || !C162457s7.A0P(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A00, AnonymousClass0x2.A01((C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A02)) * 31, this.A05)), this.A03), this.A04);
    }

    public C104885Ss(C150477Qw r1, C150477Qw r2, Integer num, boolean z, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A02 = num;
        this.A05 = z;
        this.A00 = r2;
        this.A03 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioChatCallingBannerViewState(title=");
        A0o.append(this.A01);
        A0o.append(", participantColorIndex=");
        A0o.append(this.A02);
        A0o.append(", shouldShowAudioWave=");
        A0o.append(this.A05);
        A0o.append(", subTitle=");
        A0o.append(this.A00);
        A0o.append(", isMuted=");
        A0o.append(this.A03);
        A0o.append(", shouldShowAnimatedWave=");
        return C18260x0.A0A(A0o, this.A04);
    }
}
