package X;

import android.text.SpannableString;

/* renamed from: X.2kX  reason: invalid class name and case insensitive filesystem */
public final class C51882kX {
    public final SpannableString A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51882kX) {
                C51882kX r5 = (C51882kX) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x9.A04(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public C51882kX(SpannableString spannableString, boolean z) {
        this.A01 = z;
        this.A00 = spannableString;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PaymentOptionRichSubtext(shouldShowOptionSubtext=");
        A0o.append(this.A01);
        A0o.append(", subtextContent=");
        return C18260x0.A04(this.A00, A0o);
    }
}
