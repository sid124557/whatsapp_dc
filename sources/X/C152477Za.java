package X;

/* renamed from: X.7Za  reason: invalid class name and case insensitive filesystem */
public final class C152477Za {
    public final int A00;
    public final C165977xw A01;
    public final C166107y9 A02;
    public final Integer A03;
    public final boolean A04;

    public C152477Za(C165977xw r2, C166107y9 r3, Integer num, int i, boolean z) {
        C162457s7.A0J(r3, 4);
        this.A04 = z;
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152477Za) {
                C152477Za r5 = (C152477Za) obj;
                if (this.A04 != r5.A04 || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A08(this.A02, (((AnonymousClass0x9.A04(this.A04) + this.A00) * 31) + AnonymousClass000.A07(this.A01)) * 31) + C18310x6.A07(this.A03);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("VariantsCarouselDisplayData(showLoadingState=");
        A0o.append(this.A04);
        A0o.append(", selectedPosition=");
        A0o.append(this.A00);
        A0o.append(", selectedOption=");
        A0o.append(this.A01);
        A0o.append(", displayData=");
        A0o.append(this.A02);
        A0o.append(", type=");
        return C18260x0.A04(this.A03, A0o);
    }
}
