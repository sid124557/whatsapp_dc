package X;

import android.text.SpannableString;

/* renamed from: X.5j5  reason: invalid class name and case insensitive filesystem */
public final class C112035j5 implements C179068iY {
    public final long A00;
    public final long A01;
    public final SpannableString A02;
    public final C109015dw A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C112035j5(SpannableString spannableString, C109015dw r3, String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C162457s7.A0J(str2, 5);
        this.A05 = str;
        this.A0A = z;
        this.A02 = spannableString;
        this.A08 = z2;
        this.A04 = str2;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = r3;
        this.A07 = z3;
        this.A09 = z4;
        this.A06 = z5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C112035j5) {
                C112035j5 r8 = (C112035j5) obj;
                if (!(C162457s7.A0P(this.A05, r8.A05) && this.A0A == r8.A0A && C162457s7.A0P(this.A02, r8.A02) && this.A08 == r8.A08 && C162457s7.A0P(this.A04, r8.A04) && this.A01 == r8.A01 && this.A00 == r8.A00 && C162457s7.A0P(this.A03, r8.A03) && this.A07 == r8.A07 && this.A09 == r8.A09 && this.A06 == r8.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass0x2.A01(AnonymousClass0x2.A01((AnonymousClass000.A00(AnonymousClass000.A00(AnonymousClass0x2.A07(this.A04, AnonymousClass0x2.A01(AnonymousClass000.A08(this.A02, AnonymousClass0x2.A01(C18310x6.A09(this.A05), this.A0A)), this.A08)), this.A01), this.A00) + AnonymousClass000.A07(this.A03)) * 31, this.A07), this.A09), this.A06);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ProductBottomSheetUiStateProductLoaded(title=");
        A0o.append(this.A05);
        A0o.append(", useOrderRequestVariant=");
        A0o.append(this.A0A);
        A0o.append(", price=");
        A0o.append(this.A02);
        A0o.append(", showCartControls=");
        A0o.append(this.A08);
        A0o.append(", cartitemQuantityString=");
        A0o.append(this.A04);
        A0o.append(", maxAvailable=");
        A0o.append(this.A01);
        A0o.append(", cartItemCount=");
        A0o.append(this.A00);
        A0o.append(", product=");
        A0o.append(this.A03);
        A0o.append(", inStock=");
        A0o.append(this.A07);
        A0o.append(", updateCarousel=");
        A0o.append(this.A09);
        A0o.append(", hasFullProductInfo=");
        return C18260x0.A0A(A0o, this.A06);
    }
}
