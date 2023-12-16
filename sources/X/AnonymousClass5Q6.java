package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.5Q6  reason: invalid class name */
public class AnonymousClass5Q6 {
    public final int A00;
    public final View A01;
    public final View A02;

    public void A00() {
        AnonymousClass6AE.A00(this.A02.getViewTreeObserver(), this, 8);
    }

    public AnonymousClass5Q6(View view, View view2, int i) {
        this.A02 = view;
        this.A01 = view2;
        this.A00 = i;
        view.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass698(this, 4));
    }

    public void A01(Context context, ClickableSpan clickableSpan, TextView textView, String str, int i) {
        SpannableString A0A = AnonymousClass4L0.A0A(str);
        int length = str.length();
        A0A.setSpan(clickableSpan, 0, length, 0);
        A0A.setSpan(new TextAppearanceSpan(context, i), 0, length, 0);
        A0A.setSpan(new AnonymousClass6EI(this), 0, length, 0);
        C86654Ky.A1E(textView);
        C86664Kz.A1T(textView, A0A);
    }
}
