package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* renamed from: X.5e5  reason: invalid class name and case insensitive filesystem */
public class C109105e5 implements InputFilter {
    public final WeakReference A00;

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AnonymousClass5ZT r0 = (AnonymousClass5ZT) this.A00.get();
        if (r0 == null || r0.A0L == null) {
            return null;
        }
        return "";
    }

    public C109105e5(AnonymousClass5ZT r2) {
        this.A00 = AnonymousClass0x9.A14(r2);
    }
}
