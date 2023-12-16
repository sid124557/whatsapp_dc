package X;

/* renamed from: X.7Zy  reason: invalid class name and case insensitive filesystem */
public final class C152697Zy {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass66R A04 = AnonymousClass8P7.A00(new C174828Wa(this));
    public final AnonymousClass66R A05 = AnonymousClass8P7.A00(new C174838Wb(this));
    public final AnonymousClass66R A06 = AnonymousClass8P7.A00(new C174848Wc(this));
    public final AnonymousClass66R A07 = AnonymousClass8P7.A00(new C174858Wd(this));
    public final AnonymousClass66R A08 = AnonymousClass8P7.A00(new C174868We(this));
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152697Zy) {
                C152697Zy r5 = (C152697Zy) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A09 == r5.A09 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass0x2.A01(((this.A03 * 31) + this.A02) * 31, this.A09) + this.A00) * 31) + this.A01;
    }

    public C152697Zy(boolean z, int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A09 = z;
        this.A00 = i3;
        this.A01 = i4;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CameraProcessorProperties(originalWidth=");
        A0o.append(this.A03);
        A0o.append(", originalHeight=");
        A0o.append(this.A02);
        A0o.append(", isFrontFacing=");
        A0o.append(this.A09);
        A0o.append(", cameraOrientationDegrees=");
        A0o.append(this.A00);
        A0o.append(", deviceOrientationDegrees=");
        return C18260x0.A09(A0o, this.A01);
    }
}
