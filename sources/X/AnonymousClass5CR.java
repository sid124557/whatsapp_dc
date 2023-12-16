package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;

/* renamed from: X.5CR  reason: invalid class name */
public final class AnonymousClass5CR {
    public static final SpannableStringBuilder A00(Context context, int i, int i2, int i3) {
        Drawable A00 = AnonymousClass0RP.A00(context, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (A00 != null) {
            spannableStringBuilder.append(' ').append(' ');
            A00.setBounds(0, 0, i, i);
            AnonymousClass001.A12(PorterDuff.Mode.SRC_ATOP, A00, i3);
            spannableStringBuilder.setSpan(new C87044Mw(A00), 1, 2, 33);
        }
        return spannableStringBuilder;
    }
}
