package X;

import android.text.TextUtils;

/* renamed from: X.5VB  reason: invalid class name */
public abstract class AnonymousClass5VB {
    public static int A00(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return A01(charSequence, 0, charSequence.length());
    }

    public static int A01(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        if (length != 0) {
            C94284qs r2 = new C94284qs(charSequence);
            while (i < i2) {
                r2.A00 = i;
                i += r2.A02(i, C86664Kz.A0N(r2));
                i3++;
            }
        }
        return i3;
    }
}
