package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4zv  reason: invalid class name and case insensitive filesystem */
public abstract class C98164zv extends C98174zw {
    public C132256ex A00;

    public abstract String getDefaultMessageText();

    public abstract int getDrawableRes();

    public void setThumbnailOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setId(R.id.thumb_view);
        this.A00.setOnClickListener(onClickListener);
    }

    public /* bridge */ /* synthetic */ CharSequence A04(AnonymousClass3ZH r11, C624134x r12) {
        Drawable A01 = C107335b8.A01(getContext(), getDrawableRes());
        TextPaint paint = this.A01.getPaint();
        int textSize = ((int) paint.getTextSize()) + getIconSizeIncrease();
        SpannableStringBuilder A002 = C18330xA.A00(AnonymousClass000.A0P("", "  ", AnonymousClass001.A0o()));
        C87044Mw.A04(paint, A01, A002, textSize, 0, 1);
        CharSequence A003 = AnonymousClass4Qv.A00(r11, r12, this);
        if (TextUtils.isEmpty(A003)) {
            return A002;
        }
        boolean A0C = C107555bV.A0C(A002);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = A003;
        char c = 8207;
        if (A0C) {
            c = 8206;
        }
        String valueOf = String.valueOf(c);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = A002;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }

    public int getIconSizeIncrease() {
        return C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void setUpThumbView(C132256ex r3) {
        r3.setRadius(getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        C86624Kv.A10(r3, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), C86614Ku.A05(this, R.dimen.f6nameremoved));
        C107555bV.A03(r3, C86634Kw.A06(this), 0);
    }

    public C98164zv(Context context, C103445Mz r2) {
        super(context, r2);
    }
}
