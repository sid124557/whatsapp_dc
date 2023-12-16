package com.whatsapp.text;

import X.C107385bE;
import X.C71563cJ;
import X.C86614Ku;
import X.C87424Sh;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.whatsapp.WaTextView;

public class AutoSizeTextView extends WaTextView {
    public float A00;
    public float A01;
    public int A02;
    public boolean A03;
    public int[] A04;

    public final void A0D() {
        int i;
        int compoundPaddingLeft = (this.A02 - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        int[] iArr = this.A04;
        if (iArr != null && iArr.length != 0) {
            TextPaint textPaint = new TextPaint(getPaint());
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.A04;
                int length = iArr2.length;
                if (i2 >= length) {
                    i = iArr2[length - 1];
                    break;
                }
                textPaint.setTextSize((float) iArr2[i2]);
                if (textPaint.measureText(C86614Ku.A0u(this)) <= ((float) compoundPaddingLeft)) {
                    i = this.A04[i2];
                    break;
                }
                i2++;
            }
            if (i >= 0) {
                post(new C71563cJ((Object) this, i, 14));
            }
        }
    }

    public final void A0E() {
        float f;
        float f2;
        float f3 = this.A00;
        boolean A0B = C107385bE.A0B();
        DisplayMetrics A0E = C86614Ku.A0E(this);
        if (A0B) {
            f = TypedValue.convertPixelsToDimension(2, f3, A0E);
        } else {
            f = f3 / A0E.scaledDensity;
        }
        int round = Math.round(f);
        float f4 = this.A01;
        boolean A0B2 = C107385bE.A0B();
        DisplayMetrics A0E2 = C86614Ku.A0E(this);
        if (A0B2) {
            f2 = TypedValue.convertPixelsToDimension(2, f4, A0E2);
        } else {
            f2 = f4 / A0E2.scaledDensity;
        }
        int round2 = (round - Math.round(f2)) + 1;
        this.A04 = new int[round2];
        for (int i = 0; i < round2; i++) {
            this.A04[i] = Math.round(TypedValue.applyDimension(2, (float) (round - i), C86614Ku.A0E(this)));
        }
    }

    public void A0F(int i) {
        this.A01 = TypedValue.applyDimension(2, (float) 11, C86614Ku.A0E(this));
        this.A02 = Math.round(TypedValue.applyDimension(1, (float) i, C86614Ku.A0E(this)));
        if (this.A00 == 0.0f) {
            this.A00 = getTextSize();
        }
        A0E();
        A0D();
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87424Sh.A06(this);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i != i3 && i2 != i4) {
            A0D();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A0D();
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A00 = getPaint().getTextSize();
        A0E();
        A0D();
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87424Sh.A06(this);
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A08();
    }

    public AutoSizeTextView(Context context) {
        super(context);
        C87424Sh.A06(this);
    }
}
