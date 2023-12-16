package X;

/* renamed from: X.1IJ  reason: invalid class name */
public final class AnonymousClass1IJ extends AnonymousClass252 {
    public final AnonymousClass251 A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1IJ) {
                AnonymousClass1IJ r5 = (AnonymousClass1IJ) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && this.A02 == r5.A02 && C162457s7.A0P(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x9.A04(this.A03), this.A01), this.A02));
    }

    public AnonymousClass1IJ(AnonymousClass251 r1, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarDetails(isDeleting=");
        A0o.append(this.A03);
        A0o.append(", deleteError=");
        A0o.append(this.A01);
        A0o.append(", isBottomSheetDraggable=");
        A0o.append(this.A02);
        A0o.append(", avatarPreviewBitmapState=");
        return C18260x0.A04(this.A00, A0o);
    }

    public AnonymousClass1IJ() {
        this(AnonymousClass1IG.A00, false, false, false);
    }
}
