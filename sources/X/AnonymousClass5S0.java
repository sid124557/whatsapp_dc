package X;

import android.graphics.Rect;

/* renamed from: X.5S0  reason: invalid class name */
public final class AnonymousClass5S0 {
    public final Rect A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5S0) {
                AnonymousClass5S0 r5 = (AnonymousClass5S0) obj;
                if (this.A01 != r5.A01 || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, AnonymousClass0x9.A04(this.A01));
    }

    public AnonymousClass5S0(Rect rect, boolean z) {
        this.A01 = z;
        this.A00 = rect;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LeafData(isVisible=");
        A0o.append(this.A01);
        A0o.append(", boundsOnScreen=");
        return C18260x0.A04(this.A00, A0o);
    }
}
