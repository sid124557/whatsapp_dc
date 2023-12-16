package X;

import android.text.SpannableString;

/* renamed from: X.2kY  reason: invalid class name and case insensitive filesystem */
public final class C51892kY {
    public final SpannableString A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51892kY) {
                C51892kY r5 = (C51892kY) obj;
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

    public C51892kY(SpannableString spannableString, boolean z) {
        this.A01 = z;
        this.A00 = spannableString;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("SecureBadge(shouldShowSecureBadge=");
        A0o.append(this.A01);
        A0o.append(", secureContent=");
        return C18260x0.A04(this.A00, A0o);
    }
}
