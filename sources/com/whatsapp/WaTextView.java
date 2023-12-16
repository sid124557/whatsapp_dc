package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0Zu;
import X.AnonymousClass1VX;
import X.AnonymousClass79W;
import X.C1001059l;
import X.C1001559t;
import X.C106905aM;
import X.C107575bX;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C58152un;
import X.C620733j;
import X.C87424Sh;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.TextView;

public class WaTextView extends C87424Sh {
    public int A00;
    public C620733j A01;
    public AnonymousClass1VX A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C162457s7.A0J(context, 1);
        A07(context, attributeSet);
    }

    public final void A0A() {
        getContext();
        setTypeface(C106905aM.A01(), 0);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setTextAsError(CharSequence charSequence, C620733j r5) {
        C162457s7.A0J(r5, 1);
        super.setContentDescription(r5.A0E(R.string.f11nameremoved, charSequence));
        super.setText(charSequence);
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    private final void A07(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass79W.A05);
            C162457s7.A0D(obtainStyledAttributes);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(7, 0);
                if (resourceId != 0) {
                    setContentDescription(getWhatsAppLocale().A0B(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 != 0) {
                    setHint(getWhatsAppLocale().A0B(resourceId2));
                }
                int resourceId3 = obtainStyledAttributes.getResourceId(6, 0);
                if (resourceId3 != 0) {
                    setImeActionLabel(getWhatsAppLocale().A0B(resourceId3), getImeActionId());
                }
                this.A03 = obtainStyledAttributes.getBoolean(8, false);
                int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId4 != 0) {
                    setText(getWhatsAppLocale().A0B(resourceId4));
                }
                if (C1001059l.A04) {
                    int resourceId5 = obtainStyledAttributes.getResourceId(4, 0);
                    int resourceId6 = obtainStyledAttributes.getResourceId(2, 0);
                    int resourceId7 = obtainStyledAttributes.getResourceId(5, 0);
                    int resourceId8 = obtainStyledAttributes.getResourceId(3, 0);
                    if (!(resourceId5 == 0 && resourceId6 == 0 && resourceId7 == 0 && resourceId8 == 0)) {
                        setCompoundDrawablesWithIntrinsicBounds(resourceId5, resourceId6, resourceId7, resourceId8);
                    }
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        A0B();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final int getItalicPadding() {
        return this.A00;
    }

    public final boolean getOverrideTextAllCaps() {
        return this.A03;
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r2.A03 == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAllCaps(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0007
            boolean r1 = r2.A03
            r0 = 1
            if (r1 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            super.setAllCaps(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.WaTextView.setAllCaps(boolean):void");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence != null && charSequence.length() >= 3000) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("WaTextView/maybePrintDebugInfoForLongText length=");
            A0o.append(charSequence.length() / 1000);
            A0o.append('k');
            C18280x3.A14(A0o);
            C1001559t.A00(this, "WaTextView/maybePrintDebugInfoForLongText/");
        }
        super.setText(C107575bX.A03(charSequence), bufferType);
        A0C();
    }

    public final void A09() {
        getContext();
        setTypeface(C106905aM.A01(), 2);
    }

    public final void A0B() {
        if (getTransformationMethod() == null) {
            return;
        }
        if (((getTransformationMethod() instanceof AnonymousClass0Zu) || C162457s7.A0P(AnonymousClass000.A0O(getTransformationMethod()), "android.text.method.AllCapsTransformationMethod")) && !this.A03) {
            setAllCaps(false);
        }
    }

    public final void A0C() {
        boolean z;
        int desiredWidth;
        if (getText() != null && (getText() instanceof Spanned)) {
            CharSequence text = getText();
            C162457s7.A0K(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            C162457s7.A0J(spanned, 0);
            Class<StyleSpan> cls = StyleSpan.class;
            StyleSpan[] styleSpanArr = (StyleSpan[]) spanned.getSpans(0, 1, cls);
            StyleSpan[] styleSpanArr2 = (StyleSpan[]) spanned.getSpans(spanned.length() - 1, spanned.length(), cls);
            if (styleSpanArr != null) {
                int length = styleSpanArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StyleSpan styleSpan = styleSpanArr[i];
                    if (styleSpan.getStyle() == 2 || styleSpan.getStyle() == 3) {
                        break;
                    }
                    i++;
                }
                z = true;
                if ((getTypeface() == null || !getTypeface().isItalic()) && !z) {
                    desiredWidth = 0;
                } else {
                    desiredWidth = (int) Layout.getDesiredWidth(C58152un.A09, getPaint());
                }
                this.A00 = desiredWidth;
                invalidate();
            }
            if (styleSpanArr2 != null) {
                int length2 = styleSpanArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    StyleSpan styleSpan2 = styleSpanArr2[i2];
                    if (styleSpan2.getStyle() == 2 || styleSpan2.getStyle() == 3) {
                        break;
                    }
                    i2++;
                }
                z = true;
                if (getTypeface() == null || !getTypeface().isItalic()) {
                    desiredWidth = 0;
                    this.A00 = desiredWidth;
                    invalidate();
                }
                desiredWidth = (int) Layout.getDesiredWidth(C58152un.A09, getPaint());
                this.A00 = desiredWidth;
                invalidate();
            }
        }
        z = false;
        desiredWidth = 0;
        this.A00 = desiredWidth;
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + this.A00, getMeasuredHeight());
    }

    public final void setItalicPadding(int i) {
        this.A00 = i;
    }

    public final void setOverrideTextAllCaps(boolean z) {
        this.A03 = z;
    }

    public void setTypeface(Typeface typeface, int i) {
        super.setTypeface(typeface, i);
        A0C();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        A07(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaTextView(Context context) {
        super(context);
        C162457s7.A0J(context, 1);
        A0B();
    }
}
