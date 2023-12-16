package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.6E7  reason: invalid class name */
public class AnonymousClass6E7 extends InputFilter.AllCaps {
    public final /* synthetic */ C131116d4 A00;

    public AnonymousClass6E7(C131116d4 r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return String.valueOf(charSequence).toLowerCase(this.A00.A00.BEW());
    }
}
