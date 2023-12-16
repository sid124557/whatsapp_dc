package X;

/* renamed from: X.2mW  reason: invalid class name and case insensitive filesystem */
public final class C53082mW {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass39M A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53082mW) {
                C53082mW r5 = (C53082mW) obj;
                if (!(C162457s7.A0P(this.A03, r5.A03) && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01(C18300x5.A04(this.A03), this.A00), this.A01), this.A02);
    }

    public C53082mW(AnonymousClass39M r2, boolean z) {
        boolean A1W = C18290x4.A1W(r2);
        this.A03 = r2;
        this.A00 = A1W;
        this.A01 = A1W;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerPreviewItem(sticker=");
        A0o.append(this.A03);
        A0o.append(", isLoading=");
        A0o.append(this.A00);
        A0o.append(", isPreviewImageLoaded=");
        A0o.append(this.A01);
        A0o.append(", isStarred=");
        return C18260x0.A0A(A0o, this.A02);
    }
}
