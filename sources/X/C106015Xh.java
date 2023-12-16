package X;

/* renamed from: X.5Xh  reason: invalid class name and case insensitive filesystem */
public final class C106015Xh {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C104515Rg A03;
    public final AnonymousClass58U A04;
    public final AnonymousClass7ND A05;
    public final boolean A06;
    public final boolean A07;

    public C106015Xh(C104515Rg r2, AnonymousClass58U r3, AnonymousClass7ND r4, int i, int i2, int i3, boolean z, boolean z2) {
        C162457s7.A0J(r3, 5);
        this.A03 = r2;
        this.A07 = z;
        this.A02 = i;
        this.A06 = z2;
        this.A04 = r3;
        this.A05 = r4;
        this.A01 = i2;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106015Xh) {
                C106015Xh r5 = (C106015Xh) obj;
                if (!(C162457s7.A0P(this.A03, r5.A03) && this.A07 == r5.A07 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A04 == r5.A04 && C162457s7.A0P(this.A05, r5.A05) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C106015Xh A00(AnonymousClass58U r9, C106015Xh r10) {
        C104515Rg r1 = r10.A03;
        boolean z = r10.A07;
        return new C106015Xh(r1, r9, r10.A05, r10.A02, r10.A01, r10.A00, z, r10.A06);
    }

    public final int A01() {
        int ordinal = this.A04.ordinal();
        if (ordinal == 0 || ordinal == 4) {
            return 1;
        }
        if (ordinal == 1 || ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return this.A02;
        }
        throw C73153f1.A00();
    }

    public int hashCode() {
        return ((((AnonymousClass000.A08(this.A04, AnonymousClass0x2.A01((AnonymousClass0x2.A01(AnonymousClass000.A07(this.A03) * 31, this.A07) + this.A02) * 31, this.A06)) + C18310x6.A07(this.A05)) * 31) + this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("State(mediaSource=");
        A0o.append(this.A03);
        A0o.append(", playWhenReady=");
        A0o.append(this.A07);
        A0o.append(", videoPlayerPlaybackState=");
        A0o.append(this.A02);
        A0o.append(", mute=");
        A0o.append(this.A06);
        A0o.append(", preparePhase=");
        A0o.append(this.A04);
        A0o.append(", videoPlayer=");
        A0o.append(this.A05);
        A0o.append(", seekPositionWhenCreated=");
        A0o.append(this.A01);
        A0o.append(", resizeMode=");
        return C18260x0.A09(A0o, this.A00);
    }

    public C106015Xh() {
        this((C104515Rg) null, AnonymousClass58U.UNINITIALIZED, (AnonymousClass7ND) null, 1, 0, 4, false, true);
    }
}
