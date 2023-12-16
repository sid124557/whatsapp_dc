package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2x3  reason: invalid class name and case insensitive filesystem */
public final class C59522x3 {
    public final AnonymousClass33p A00;
    public final C620733j A01;
    public final C54872pQ A02;
    public final List A03;

    public C59522x3(AnonymousClass33p r7, C620733j r8, C54872pQ r9) {
        int A05 = C18300x5.A05(r8, r7, 1);
        C162457s7.A0J(r9, 3);
        this.A01 = r8;
        this.A00 = r7;
        this.A02 = r9;
        AnonymousClass3Z1[] r5 = new AnonymousClass3Z1[A05];
        r5[0] = new AnonymousClass3Z1(Integer.valueOf(R.drawable.vec_ic_stickers_magic), Integer.valueOf(R.string.f11nameremoved), Integer.valueOf(R.string.f11nameremoved));
        this.A03 = AnonymousClass0x9.A19(new AnonymousClass3Z1(Integer.valueOf(R.drawable.vec_ic_stickers_expression), Integer.valueOf(R.string.f11nameremoved), Integer.valueOf(R.string.f11nameremoved)), r5, 1);
    }

    public static final View A00(Context context, AnonymousClass3Z1 r4, float f) {
        Drawable drawable;
        String str = null;
        C19230z1 r1 = new C19230z1(context);
        Number number = (Number) r4.first;
        if (number != null) {
            drawable = AnonymousClass0VX.A01(context, number.intValue());
        } else {
            drawable = null;
        }
        r1.setIconDrawableRes(drawable);
        Number number2 = (Number) r4.second;
        if (number2 != null) {
            str = context.getString(number2.intValue());
        }
        r1.setText(str);
        r1.setSecondaryText(context.getString(AnonymousClass001.A0K(r4.third)));
        if (f != -1.0f) {
            r1.setSecondaryTextSize(f);
        }
        return r1;
    }

    public final void A01(View view, LinearLayout linearLayout, Integer num, int i, int i2) {
        int i3;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        View view2 = view;
        view.setLayoutParams(layoutParams);
        int i4 = i;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = i;
        }
        C107555bV.A06(view2, this.A01, i3, layoutParams.topMargin, i4, i2);
        linearLayout.addView(view);
    }
}
