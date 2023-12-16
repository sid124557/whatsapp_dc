package com.google.android.exoplayer2.ui;

import X.AnonymousClass000;
import X.AnonymousClass6CA;
import X.AnonymousClass6FL;
import X.C124916Ek;
import X.C156877hM;
import X.C157037hc;
import X.C157757ip;
import X.C180748lZ;
import X.C180758la;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout implements C180748lZ {
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public C156877hM A04;
    public C180758la A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    private List getCuesWithStylingPreferencesApplied() {
        C157757ip r6;
        CharSequence charSequence;
        if (this.A08 && this.A07) {
            return this.A06;
        }
        ArrayList A0p = AnonymousClass000.A0p(this.A06);
        for (int i = 0; i < this.A06.size(); i++) {
            C157037hc r1 = (C157037hc) this.A06.get(i);
            CharSequence charSequence2 = r1.A0E;
            if (!this.A08) {
                r6 = new C157757ip(r1);
                r6.A05 = -3.4028235E38f;
                r6.A09 = Integer.MIN_VALUE;
                r6.A0F = false;
                if (charSequence2 != null) {
                    charSequence = charSequence2.toString();
                }
                r1 = r6.A00();
                A0p.add(r1);
            } else {
                if (!this.A07 && charSequence2 != null) {
                    r6 = new C157757ip(r1);
                    r6.A05 = -3.4028235E38f;
                    r6.A09 = Integer.MIN_VALUE;
                    if (charSequence2 instanceof Spanned) {
                        SpannableString valueOf = SpannableString.valueOf(charSequence2);
                        for (AbsoluteSizeSpan removeSpan : (AbsoluteSizeSpan[]) valueOf.getSpans(0, valueOf.length(), AbsoluteSizeSpan.class)) {
                            valueOf.removeSpan(removeSpan);
                        }
                        for (RelativeSizeSpan removeSpan2 : (RelativeSizeSpan[]) valueOf.getSpans(0, valueOf.length(), RelativeSizeSpan.class)) {
                            valueOf.removeSpan(removeSpan2);
                        }
                        charSequence = valueOf;
                    }
                    r1 = r6.A00();
                }
                A0p.add(r1);
            }
            r6.A0E = charSequence;
            r1 = r6.A00();
            A0p.add(r1);
        }
        return A0p;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private void setView(View view) {
        removeView(this.A03);
        View view2 = this.A03;
        if (view2 instanceof AnonymousClass6FL) {
            ((AnonymousClass6FL) view2).A04.destroy();
        }
        this.A03 = view;
        this.A05 = (C180758la) view;
        addView(view);
    }

    public final void A02() {
        this.A05.BrX(this.A04, getCuesWithStylingPreferencesApplied(), this.A01, this.A00, 0);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.A07 = z;
        A02();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.A08 = z;
        A02();
    }

    public void setBottomPaddingFraction(float f) {
        this.A00 = f;
        A02();
    }

    public void setCues(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.A06 = list;
        A02();
    }

    public void setFractionalTextSize(float f) {
        this.A01 = f;
        A02();
    }

    public void setStyle(C156877hM r1) {
        this.A04 = r1;
        A02();
    }

    public void setViewType(int i) {
        View r2;
        if (this.A02 != i) {
            if (i == 1) {
                r2 = new C124916Ek(getContext(), (AttributeSet) null);
            } else if (i == 2) {
                r2 = new AnonymousClass6FL(getContext());
            } else {
                throw AnonymousClass6CA.A0N();
            }
            setView(r2);
            this.A02 = i;
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = Collections.emptyList();
        this.A04 = C156877hM.A06;
        this.A01 = 0.0533f;
        this.A00 = 0.08f;
        this.A08 = true;
        this.A07 = true;
        C124916Ek r0 = new C124916Ek(context, attributeSet);
        this.A05 = r0;
        this.A03 = r0;
        addView(r0);
        this.A02 = 1;
    }

    private C156877hM getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return C156877hM.A06;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = -1;
        }
        if (userStyle.hasBackgroundColor()) {
            i2 = userStyle.backgroundColor;
        } else {
            i2 = -16777216;
        }
        if (userStyle.hasWindowColor()) {
            i3 = userStyle.windowColor;
        } else {
            i3 = 0;
        }
        if (userStyle.hasEdgeType()) {
            i4 = userStyle.edgeType;
        } else {
            i4 = 0;
        }
        if (userStyle.hasEdgeColor()) {
            i5 = userStyle.edgeColor;
        } else {
            i5 = -1;
        }
        return new C156877hM(userStyle.getTypeface(), i, i2, i3, i4, i5);
    }

    public void A00() {
        setStyle(getUserCaptionStyle());
    }

    public void A01() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void BQU(List list) {
        setCues(list);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }
}
