package com.whatsapp;

import X.AnonymousClass0x2;
import X.C100905Cs;
import X.C107635bd;
import X.C181588n0;
import X.C18330xA;
import X.C184988ss;
import X.C620633i;
import X.C66433Lk;
import X.C69263Wi;
import X.C85244Fm;
import X.C86614Ku;
import X.C88944b3;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;

public class FAQTextView extends TextEmojiLabel {
    public C69263Wi A00;
    public C85244Fm A01;
    public C66433Lk A02;
    public boolean A03;

    public void setEducationText(Spannable spannable, String str, String str2, int i, C181588n0 r17) {
        C88944b3 r5;
        setLinksClickable(true);
        setFocusable(false);
        AnonymousClass0x2.A14(this.A02, this);
        if (str2 == null) {
            str2 = getContext().getString(R.string.f11nameremoved);
        }
        SpannableStringBuilder A002 = C18330xA.A00(str2);
        Context context = getContext();
        C69263Wi r8 = this.A00;
        C620633i r9 = this.A09;
        C85244Fm r7 = this.A01;
        String str3 = str;
        int i2 = i;
        if (i != 0) {
            r5 = new C88944b3(context, (C184988ss) r7, r8, r9, str3, i2);
        }
        A002.setSpan(r5, 0, str2.length(), 33);
        setText(C107635bd.A03(getContext().getString(R.string.f11nameremoved), spannable, A002));
        C181588n0 r0 = r17;
        if (r17 != null) {
            r5.A02 = r0;
        }
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str, String str2) {
        setEducationText(spannable, C66433Lk.A00(this.A02, str).toString(), str2, (C181588n0) null);
    }

    public void setEducationTextFromNamedArticle(Spannable spannable, String str, String str2) {
        setEducationText(spannable, this.A02.A04(str, str2).toString(), (String) null, (C181588n0) null);
    }

    public FAQTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet, C100905Cs.A08, 0, 0);
            try {
                String A0G = this.A01.A0G(obtainStyledAttributes, 1);
                String string = obtainStyledAttributes.getString(0);
                if (!(A0G == null || string == null)) {
                    setEducationTextFromArticleID(C18330xA.A00(A0G), string);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        AnonymousClass0x2.A12(this, this.A09);
        setClickable(true);
    }

    public FAQTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setEducationText(Spannable spannable, String str, String str2, C181588n0 r10) {
        setEducationText(spannable, str, str2, 0, r10);
    }

    public void setEducationTextFromArticleID(Spannable spannable, String str) {
        setEducationText(spannable, C66433Lk.A00(this.A02, str).toString(), (String) null, (C181588n0) null);
    }
}
