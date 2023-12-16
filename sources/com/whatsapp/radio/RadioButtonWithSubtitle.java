package com.whatsapp.radio;

import X.AnonymousClass000;
import X.AnonymousClass4L0;
import X.AnonymousClass6EB;
import X.C06070Wc;
import X.C06400Xn;
import X.C100905Cs;
import X.C162457s7;
import X.C18290x4;
import X.C18300x5;
import X.C378924l;
import X.C86614Ku;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;

public final class RadioButtonWithSubtitle extends AppCompatRadioButton {
    public CharSequence A00;
    public CharSequence A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        setParams(attributeSet);
        int dimensionPixelSize = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize2 = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, dimensionPixelSize);
        setLayoutParams(layoutParams);
        setPaddingRelative(dimensionPixelSize2, getPaddingTop(), dimensionPixelSize2, getPaddingBottom());
        setTextSize(0, getResources().getDimension(R.dimen.f6nameremoved));
        if (Build.VERSION.SDK_INT >= 28) {
            setLineHeight(AnonymousClass4L0.A01(getResources(), R.dimen.f6nameremoved));
        }
        int[] iArr = new int[2];
        iArr[0] = R.color.f5nameremoved;
        C06070Wc.A02(C86664Kz.A0W(iArr, new int[][]{new int[]{-16842912}, new int[]{16842912}}, C18300x5.A03(C18290x4.A0F(this), R.attr.f3nameremoved, R.color.f5nameremoved), 1), this);
        A00();
    }

    private final void setParams(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C86614Ku.A0C(this).obtainStyledAttributes(attributeSet, C100905Cs.A0H, 0, 0);
            C162457s7.A0D(obtainStyledAttributes);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    setTitle(getResources().getString(resourceId));
                }
                if (resourceId2 != 0) {
                    setSubTitle(getResources().getString(resourceId2));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void A00() {
        CharSequence charSequence = this.A01;
        CharSequence charSequence2 = this.A00;
        if (charSequence2 == null || charSequence2.length() == 0 || charSequence == null || charSequence.length() == 0) {
            setText(charSequence);
            return;
        }
        StringBuilder A0v = C18290x4.A0v(charSequence);
        A0v.append(10);
        String A0R = AnonymousClass000.A0R(this.A00, A0v);
        AnonymousClass6EB r4 = new AnonymousClass6EB(this, C06400Xn.A00((Resources.Theme) null, getResources(), R.color.f5nameremoved));
        SpannableString A0A = AnonymousClass4L0.A0A(A0R);
        A0A.setSpan(r4, charSequence.length() + 1, A0R.length(), 33);
        setText(A0A);
    }

    public final CharSequence getSubTitle() {
        return this.A00;
    }

    public final CharSequence getTitle() {
        return this.A01;
    }

    public final void setSubTitle(CharSequence charSequence) {
        this.A00 = charSequence;
        A00();
    }

    public final void setTitle(CharSequence charSequence) {
        this.A01 = charSequence;
        A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842878);
        C162457s7.A0J(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioButtonWithSubtitle(Context context, AttributeSet attributeSet, int i, int i2, C378924l r7) {
        this(context, C86624Kv.A09(attributeSet, i2), (i2 & 4) != 0 ? 16842878 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context) {
        this(context, (AttributeSet) null, 16842878);
        C162457s7.A0J(context, 1);
    }
}
