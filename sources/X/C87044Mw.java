package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.4Mw  reason: invalid class name and case insensitive filesystem */
public class C87044Mw extends ImageSpan {
    public WeakReference A00;

    public static CharSequence A01(Paint paint, Drawable drawable, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        Drawable drawable2 = drawable;
        if (charSequence instanceof SpannableStringBuilder) {
            A04(paint2, drawable2, (SpannableStringBuilder) charSequence2, -1, 0, 1);
            return charSequence2;
        }
        SpannableStringBuilder A002 = C18330xA.A00(AnonymousClass000.A0P(charSequence, "  ", AnonymousClass001.A0o()));
        A04(paint2, drawable2, A002, -1, 0, 1);
        return A002;
    }

    public static CharSequence A02(Paint paint, Drawable drawable, CharSequence charSequence, int i, int i2) {
        StringBuilder sb = new StringBuilder(" ".length() * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(" ");
        }
        SpannableStringBuilder A002 = C18330xA.A00(AnonymousClass000.A0P(charSequence, sb.toString(), AnonymousClass001.A0o()));
        A04(paint, drawable, A002, i, 0, 1);
        return A002;
    }

    public static void A04(Paint paint, Drawable drawable, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i <= 0) {
            i = (int) paint.getTextSize();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * i) / drawable.getIntrinsicHeight(), i);
        spannableStringBuilder.setSpan(new C87044Mw(drawable), i2, i3, 33);
    }

    public Drawable A06() {
        Drawable drawable;
        WeakReference weakReference = this.A00;
        if (weakReference != null && (drawable = (Drawable) weakReference.get()) != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.A00 = AnonymousClass0x9.A14(drawable2);
        return drawable2;
    }

    public C87044Mw(Drawable drawable) {
        super(drawable);
    }

    public static CharSequence A00(Context context, Paint paint, CharSequence charSequence, int i) {
        return A01(paint, C107335b8.A04(context, i, R.color.f5nameremoved), charSequence);
    }

    public static CharSequence A03(Paint paint, Drawable drawable, CharSequence charSequence, String str) {
        int indexOf = TextUtils.indexOf(charSequence, str);
        int A0L = C86664Kz.A0L(str, indexOf);
        SpannableStringBuilder A002 = C18330xA.A00(charSequence);
        A04(paint, drawable, A002, -1, indexOf, A0L);
        return A002;
    }

    public static void A05(Drawable drawable, TextView textView, CharSequence charSequence) {
        textView.setText(A03(textView.getPaint(), drawable, charSequence, "%s"));
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C86644Kx.A0p(canvas, paint, A06(), f, i4);
    }
}
