package X;

/* renamed from: X.7k7  reason: invalid class name and case insensitive filesystem */
public final class C158527k7 {
    public final float A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158527k7) {
                C158527k7 r5 = (C158527k7) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass6C9.A07((AnonymousClass0x9.A04(this.A02) + this.A01) * 31, this.A00), this.A03);
    }

    public C158527k7(float f, int i, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = f;
        this.A03 = z2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallTooltipInternalState(isPictureInPicture=");
        A0o.append(this.A02);
        A0o.append(", deviceOrientation=");
        A0o.append(this.A01);
        A0o.append(", bottomSheetSlideRatio=");
        A0o.append(this.A00);
        A0o.append(", isScreenShareButtonVisibleAndEnabled=");
        return C18260x0.A0A(A0o, this.A03);
    }

    public C158527k7() {
        this(0.0f, 0, false, false);
    }
}
