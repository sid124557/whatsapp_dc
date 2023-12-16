package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.7ZQ  reason: invalid class name */
public final class AnonymousClass7ZQ {
    public final Drawable A00;
    public final C141616vr A01;
    public final CharSequence A02;
    public final CharSequence A03;

    public AnonymousClass7ZQ(Drawable drawable, C141616vr r3, CharSequence charSequence, CharSequence charSequence2) {
        C162457s7.A0J(r3, 1);
        this.A01 = r3;
        this.A00 = drawable;
        this.A03 = charSequence;
        this.A02 = charSequence2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7ZQ) {
                AnonymousClass7ZQ r5 = (AnonymousClass7ZQ) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C18300x5.A04(this.A01) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass000.A07(this.A03)) * 31) + C18310x6.A07(this.A02);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("HeaderViewState(headerSize=");
        A0o.append(this.A01);
        A0o.append(", headerImage=");
        A0o.append(this.A00);
        A0o.append(", headline=");
        A0o.append(this.A03);
        A0o.append(", description=");
        return C18260x0.A04(this.A02, A0o);
    }
}
