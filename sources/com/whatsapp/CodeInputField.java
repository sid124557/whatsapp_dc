package com.whatsapp;

import X.AnonymousClass2AT;
import X.AnonymousClass3CT;
import X.AnonymousClass4T9;
import X.AnonymousClass8r2;
import X.C06400Xn;
import X.C06560Yg;
import X.C100295Aj;
import X.C106755a7;
import X.C109155eA;
import X.C109415ea;
import X.C181538mv;
import X.C18290x4;
import X.C18330xA;
import X.C188628zE;
import X.C86644Kx;
import X.C86664Kz;
import X.C86974Mp;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;

public final class CodeInputField extends WaEditText {
    public static Typeface A08;
    public static Typeface A09;
    public char A00;
    public char A01;
    public int A02;
    public ValueAnimator A03;
    public C109155eA A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;

    public void A0A(AnonymousClass8r2 r10, int i) {
        A0C(r10, new AnonymousClass2AT(this, 0), (String) null, (String) null, 8211, 8226, i);
    }

    public void A09() {
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            float x = getX();
            float A012 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved);
            float[] fArr = new float[2];
            fArr[0] = x;
            ValueAnimator A0P = C86664Kz.A0P(fArr, A012 + x);
            C86644Kx.A0j(A0P);
            A0P.setRepeatCount(3);
            A0P.setRepeatMode(2);
            A0P.setDuration(50);
            C100295Aj.A03(A0P, this, 1);
            A0P.addListener(new C188628zE(this, x, 0));
            this.A03 = A0P;
        }
        this.A03.start();
        C106755a7.A03(this.A02);
    }

    public void A0B(AnonymousClass8r2 r11, int i, int i2) {
        AnonymousClass3CT r4 = new AnonymousClass3CT(this, i2);
        setPasswordTransformationEnabled(true);
        setOnClickListener(new C109415ea(this, 11));
        setCursorVisible(false);
        A0C(r11, r4, "pin_font", (String) null, ')', '(', i);
    }

    public void A0C(AnonymousClass8r2 r3, C181538mv r4, String str, String str2, char c, char c2, int i) {
        Typeface typeface;
        this.A02 = i;
        this.A01 = c;
        this.A00 = c2;
        C109155eA r0 = new C109155eA(r3, r4, this);
        this.A04 = r0;
        addTextChangedListener(r0);
        setCode("");
        if (TextUtils.equals(str, "pin_font")) {
            typeface = A08;
            if (typeface == null) {
                typeface = C06400Xn.A02(getContext(), R.font.payment_icons_regular);
                A08 = typeface;
            }
        } else {
            typeface = A09;
            if (typeface == null) {
                typeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/RobotoMono-Regular.ttf");
                A09 = typeface;
            }
        }
        setTypeface(typeface);
        setTextDirection(3);
        if (str2 != null) {
            C06560Yg.A0O(this, new AnonymousClass4T9(this, str2));
        }
    }

    public boolean getErrorState() {
        return this.A05;
    }

    public void onDetachedFromWindow() {
        removeTextChangedListener(this.A04);
        super.onDetachedFromWindow();
    }

    public void onSelectionChanged(int i, int i2) {
        int indexOf;
        if (i == i2 && (indexOf = C18290x4.A0m(this).indexOf(this.A01)) > -1 && i > indexOf) {
            setSelection(indexOf);
        }
        super.onSelectionChanged(i, i2);
    }

    public void setErrorState(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            setCode("");
        }
    }

    public void setPasswordTransformationEnabled(boolean z) {
        C86974Mp r0;
        if (z) {
            r0 = new C86974Mp(this);
        } else {
            r0 = null;
        }
        setTransformationMethod(r0);
    }

    public CodeInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        this.A07 = context;
    }

    public String getCode() {
        return getText().toString().replaceAll("[^0-9]", "");
    }

    public void setCode(String str) {
        StringBuilder A0A = C18330xA.A0A(str);
        int i = this.A02;
        int length = str.length();
        int i2 = length;
        if (i > 4) {
            while (length < i + 1) {
                A0A.append(this.A01);
                length++;
            }
            A0A.insert(i / 2, 160);
        } else {
            while (length < i) {
                A0A.append(this.A01);
                length++;
            }
        }
        this.A04.A01 = true;
        setText(A0A);
        if (this.A02 > 4) {
            setSelection(i2 + 1);
        } else {
            setSelection(i2);
        }
        this.A04.A01 = false;
    }

    public void setRegistrationVoiceCodeLength(int i) {
        this.A02 = i;
    }

    public CodeInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A07 = context;
    }

    public CodeInputField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    public CodeInputField(Context context) {
        super(context);
        A04();
        this.A07 = context;
    }
}
