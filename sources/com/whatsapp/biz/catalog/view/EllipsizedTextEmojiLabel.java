package com.whatsapp.biz.catalog.view;

import X.AnonymousClass0x2;
import X.C18290x4;
import X.C18330xA;
import X.C88934b2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class EllipsizedTextEmojiLabel extends TextEmojiLabel {
    public int A00;
    public View.OnClickListener A01;
    public boolean A02;
    public boolean A03;

    public void A0J(CharSequence charSequence, List list, int i, boolean z) {
        CharSequence charSequence2 = charSequence;
        List list2 = list;
        if (i == 0 || !this.A03) {
            super.A0J(charSequence, list, 0, true);
            return;
        }
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        SpannableStringBuilder A002 = C18330xA.A00(charSequence);
        if (codePointCount > i) {
            SpannableStringBuilder A003 = C18330xA.A00(getContext().getString(R.string.f11nameremoved));
            A003.setSpan(new C88934b2(getContext(), this, charSequence2, list2, this.A00), 0, A003.length(), 18);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                i2 += Character.charCount(Character.codePointAt(charSequence, i2));
            }
            A002.delete(i2, A002.length()).append("... ").append(A003);
        }
        super.A0J(A002, list, 0, true);
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
        this.A03 = true;
        AnonymousClass0x2.A14(this.A02, this);
        this.A00 = C18290x4.A00(context);
    }

    public void setOnTextExpandClickListener(View.OnClickListener onClickListener) {
        this.A01 = onClickListener;
    }

    public void setReadMoreColor(int i) {
        this.A00 = i;
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A08();
        this.A03 = true;
        AnonymousClass0x2.A14(this.A02, this);
        this.A00 = C18290x4.A00(context);
    }

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A08();
    }

    public EllipsizedTextEmojiLabel(Context context) {
        super(context);
        A08();
        this.A03 = true;
        AnonymousClass0x2.A14(this.A02, this);
        this.A00 = C18290x4.A00(context);
    }
}
