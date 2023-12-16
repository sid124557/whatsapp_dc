package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: X.5e4  reason: invalid class name and case insensitive filesystem */
public final class C109095e4 implements InputFilter {
    public final int A00;

    public static void A00(TextView textView, InputFilter[] inputFilterArr, int i) {
        inputFilterArr[0] = new C109095e4(i);
        textView.setFilters(inputFilterArr);
    }

    public C109095e4(int i) {
        this.A00 = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int A01 = AnonymousClass5VB.A01(spanned, 0, spanned.length());
        int A012 = AnonymousClass5VB.A01(spanned, i3, i4);
        int A013 = AnonymousClass5VB.A01(charSequence, i, i2);
        int i5 = (this.A00 - A01) + A012;
        if (i5 <= 0) {
            return "";
        }
        if (i5 >= A013) {
            return null;
        }
        return C106815aD.A01(charSequence, i, i2, i5);
    }
}
