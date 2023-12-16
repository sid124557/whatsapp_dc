package com.whatsapp;

import X.AnonymousClass0x2;
import X.AnonymousClass66R;
import X.C106285Yi;
import X.C107075ae;
import X.C118785vv;
import X.C154517dI;
import X.C162457s7;
import X.C18330xA;
import X.C378924l;
import X.C86624Kv;
import X.C86634Kw;
import X.C87024Mu;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import java.util.List;

public final class WrapIconTextView extends TextEmojiLabel {
    public final AnonymousClass66R A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        this.A00 = C154517dI.A01(new C118785vv(this));
    }

    public final void A0L(Drawable drawable, Drawable drawable2, CharSequence charSequence) {
        CharSequence A0D = A0D((C107075ae) null, charSequence, (List) null, 1.0f, 0, true);
        if ((drawable == null && drawable2 == null) || A0D == null) {
            super.A0H((C107075ae) null, charSequence, (List) null, 0, true);
            return;
        }
        SpannableStringBuilder A002 = C18330xA.A00(A0D);
        A002.insert(0, " ");
        A0M(drawable, A002);
        A0M(drawable2, A002);
        setText(A002);
    }

    private final int getIconWidth() {
        return AnonymousClass0x2.A09(this.A00);
    }

    public final void A0M(Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        if (drawable != null) {
            Paint.FontMetricsInt A002 = C106285Yi.A00(getPaint());
            C162457s7.A0D(A002);
            int i = (A002.descent - A002.ascent) / 2;
            drawable.setBounds(0, -i, Math.max(drawable.getIntrinsicWidth(), AnonymousClass0x2.A09(this.A00)), drawable.getIntrinsicHeight() - i);
            C87024Mu r2 = new C87024Mu(drawable);
            spannableStringBuilder.insert(0, " ");
            spannableStringBuilder.setSpan(r2, 0, 1, 33);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C162457s7.A0J(context, 1);
    }

    public /* synthetic */ WrapIconTextView(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), C86634Kw.A02(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WrapIconTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C162457s7.A0J(context, 1);
    }
}
