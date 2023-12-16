package com.whatsapp.payments.ui.widget;

import X.AnonymousClass002;
import X.AnonymousClass34K;
import X.AnonymousClass4SQ;
import X.AnonymousClass9M9;
import X.C1899593h;
import X.C86604Kt;
import X.C88864av;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import com.whatsapp.R;
import com.whatsapp.WaEditText;

public class CardInputText extends WaEditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public Paint A07;
    public Paint A08;
    public boolean A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public RectF[] A0D;
    public final int A0E;
    public final int A0F;

    public final void A0A(Canvas canvas, float f) {
        int i;
        Canvas canvas2 = canvas;
        float height = (float) canvas.getHeight();
        float textSize = getTextSize();
        Paint paint = new Paint(getPaint());
        if (this.A09) {
            i = this.A0F;
        } else {
            i = this.A0E;
        }
        paint.setColor(i);
        this.A09 = !this.A09;
        paint.setStrokeWidth(5.0f);
        float f2 = f + 5.0f;
        float f3 = height / 2.0f;
        float f4 = textSize / 2.0f;
        canvas2.drawLine(f2, f3 - f4, f2, f3 + f4, paint);
    }

    private void setFontSize(float f) {
        this.A07.setTextSize(f);
    }

    public void A04() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass4SQ.A01(C88864av.A00(generatedComponent()), this);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A09(Context context, AttributeSet attributeSet) {
        this.A01 = (float) C86604Kt.A04(this, this.A01);
        this.A02 = (float) C86604Kt.A04(this, this.A02);
        this.A03 = (float) C86604Kt.A04(this, this.A03);
        this.A04 = (float) C86604Kt.A04(this, this.A04);
        int i = this.A0F;
        this.A05 = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9M9.A00, 0, 0);
        try {
            this.A01 = obtainStyledAttributes.getDimension(3, this.A01);
            this.A00 = obtainStyledAttributes.getDimension(0, 0.0f);
            this.A03 = obtainStyledAttributes.getDimension(1, this.A03);
            this.A04 = obtainStyledAttributes.getDimension(6, this.A04);
            this.A06 = obtainStyledAttributes.getInteger(5, 4);
            this.A05 = obtainStyledAttributes.getInteger(2, this.A05);
            int integer = obtainStyledAttributes.getInteger(4, i);
            obtainStyledAttributes.recycle();
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A06)});
            this.A07 = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A08 = paint;
            paint.setStrokeWidth(this.A01);
            this.A08.setColor(integer);
            setFontSize(this.A00);
            setBackgroundResource(0);
            setFilterTouchesWhenObscured(true);
            setCursorVisible(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw AnonymousClass002.A0E("setCustomSelectionActionModeCallback() not supported.");
    }

    public CardInputText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int A032 = C1899593h.A03(this);
        this.A0F = getResources().getColor(AnonymousClass34K.A01(getContext(), R.attr.f3nameremoved));
        this.A0E = getResources().getColor(R.color.f5nameremoved);
        this.A09 = false;
        this.A0C = new float[A032];
        A09(context, attributeSet);
    }

    private CharSequence getFullText() {
        return getText();
    }

    public void onDraw(Canvas canvas) {
        int i;
        Editable text = getText();
        int length = text.length();
        float[] fArr = this.A0C;
        int length2 = fArr.length;
        if (length2 < length) {
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, length2);
            fArr = fArr2;
        }
        this.A0C = fArr;
        getPaint().getTextWidths(text, 0, length, this.A0C);
        int i2 = 0;
        while (true) {
            i = this.A06;
            Canvas canvas2 = canvas;
            if (i2 >= i) {
                break;
            }
            float f = this.A0D[i2].left + (this.A00 / 2.0f);
            if (length > i2) {
                canvas2.drawText(text, i2, i2 + 1, f - (this.A0C[i2] / 2.0f), this.A0B[i2], this.A07);
            }
            if (length == i2 && hasFocus()) {
                A0A(canvas, this.A0D[i2].left);
            }
            RectF rectF = this.A0D[i2];
            canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A08);
            i2++;
        }
        if (length == i && hasFocus()) {
            A0A(canvas, this.A0D[i2 - 1].right);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            super.onSizeChanged(r11, r12, r13, r14)
            android.graphics.Paint r1 = r10.A07
            int r0 = r10.A05
            r1.setColor(r0)
            int r1 = r10.getWidth()
            int r0 = X.AnonymousClass0YH.A02(r10)
            int r1 = r1 - r0
            int r0 = X.AnonymousClass0YH.A03(r10)
            int r1 = r1 - r0
            float r4 = r10.A03
            r3 = 1065353216(0x3f800000, float:1.0)
            r9 = 1073741824(0x40000000, float:2.0)
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
            float r2 = (float) r1
            int r0 = r10.A06
            float r0 = (float) r0
            float r0 = r0 * r9
            float r0 = r0 - r3
            float r2 = r2 / r0
        L_0x002a:
            r10.A00 = r2
        L_0x002c:
            int r1 = r10.A06
            android.graphics.RectF[] r0 = new android.graphics.RectF[r1]
            r10.A0D = r0
            float[] r0 = new float[r1]
            r10.A0B = r0
            int r6 = r10.getHeight()
            int r0 = r10.getPaddingTop()
            int r6 = r6 - r0
            X.33j r0 = r10.A03
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x0089
            int r1 = r10.getWidth()
            int r0 = X.AnonymousClass0YH.A03(r10)
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r10.A00
            float r1 = r1 - r0
            int r7 = (int) r1
            r5 = -1
        L_0x0056:
            r4 = 0
        L_0x0057:
            int r0 = r10.A06
            if (r4 >= r0) goto L_0x009f
            android.graphics.RectF[] r3 = r10.A0D
            float r7 = (float) r7
            float r2 = (float) r6
            float r1 = r10.A00
            float r1 = r1 + r7
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r2, r1, r2)
            r3[r4] = r0
            float r3 = r10.A03
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            float r1 = (float) r5
            float r0 = r10.A00
            if (r2 >= 0) goto L_0x0086
            float r1 = r1 * r0
            float r1 = r1 * r9
        L_0x0074:
            float r7 = r7 + r1
            int r7 = (int) r7
            float[] r2 = r10.A0B
            android.graphics.RectF[] r0 = r10.A0D
            r0 = r0[r4]
            float r1 = r0.bottom
            float r0 = r10.A04
            float r1 = r1 - r0
            r2[r4] = r1
            int r4 = r4 + 1
            goto L_0x0057
        L_0x0086:
            float r0 = r0 + r3
            float r1 = r1 * r0
            goto L_0x0074
        L_0x0089:
            int r7 = X.AnonymousClass0YH.A03(r10)
            r5 = 1
            goto L_0x0056
        L_0x008f:
            float r0 = r10.A00
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x002c
            float r2 = (float) r1
            int r0 = r10.A06
            float r1 = (float) r0
            float r0 = r1 - r3
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r2 = r2 / r1
            goto L_0x002a
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.CardInputText.onSizeChanged(int, int, int, int):void");
    }

    public int getMaxNumberOfChars() {
        return this.A06;
    }

    public CardInputText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    public CardInputText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int A032 = C1899593h.A03(this);
        this.A0F = getResources().getColor(AnonymousClass34K.A01(getContext(), R.attr.f3nameremoved));
        this.A0E = getResources().getColor(R.color.f5nameremoved);
        this.A09 = false;
        this.A0C = new float[A032];
        A09(context, attributeSet);
    }

    public CardInputText(Context context) {
        super(context);
        int A032 = C1899593h.A03(this);
        this.A0F = getResources().getColor(AnonymousClass34K.A01(getContext(), R.attr.f3nameremoved));
        this.A0E = getResources().getColor(R.color.f5nameremoved);
        this.A09 = false;
        this.A0C = new float[A032];
    }
}
