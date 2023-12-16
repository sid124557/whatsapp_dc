package X;

import android.view.View;

/* renamed from: X.7YW  reason: invalid class name */
public final class AnonymousClass7YW {
    public final View.OnClickListener A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YW) {
                AnonymousClass7YW r5 = (AnonymousClass7YW) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C18310x6.A09(this.A01) + AnonymousClass000.A07(this.A00);
    }

    public AnonymousClass7YW(View.OnClickListener onClickListener, String str) {
        this.A01 = str;
        this.A00 = onClickListener;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ButtonSpec(buttonText=");
        A0o.append(this.A01);
        A0o.append(", clickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
