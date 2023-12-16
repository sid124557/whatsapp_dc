package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.39Y  reason: invalid class name */
public final class AnonymousClass39Y implements InputFilter {
    public final int A00;
    public final int A01;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        C162457s7.A0J(charSequence, 0);
        StringBuilder A0g = C18280x3.A0g(spanned, 3);
        A0g.append(spanned.subSequence(0, i3));
        A0g.append(charSequence.subSequence(i, i2));
        String A0R = AnonymousClass000.A0R(spanned.subSequence(i4, spanned.length()), A0g);
        Integer A06 = C829745q.A06(A0R);
        int i5 = this.A01;
        C175698Zj r2 = new C175698Zj(i5, this.A00);
        if (A06 != null) {
            int intValue = A06.intValue();
            if (r2.A00 > intValue || intValue > r2.A01) {
                return "";
            }
            z = true;
        } else {
            z = false;
        }
        if (z || (A06 == null && A0R.length() == 1 && i5 < 0 && A0R.charAt(0) == '-')) {
            return null;
        }
        return "";
    }

    public AnonymousClass39Y(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public AnonymousClass39Y() {
        this(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
