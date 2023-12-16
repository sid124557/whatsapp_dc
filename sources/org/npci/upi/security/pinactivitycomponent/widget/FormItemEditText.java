package org.npci.upi.security.pinactivitycomponent.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4L0;
import X.C100875Cp;
import X.C109405eZ;
import X.C162567sO;
import X.C180058kQ;
import X.C1891790h;
import X.C86604Kt;
import X.C86624Kv;
import X.C86664Kz;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import com.whatsapp.R;

public class FormItemEditText extends EditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Rect A0D;
    public Drawable A0E;
    public View.OnClickListener A0F;
    public String A0G;
    public String A0H;
    public StringBuilder A0I;
    public C180058kQ A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public float[] A0O;
    public int[] A0P;
    public RectF[] A0Q;
    public int[][] A0R;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A0N = false;
        RectF[] rectFArr = this.A0Q;
        if (rectFArr != null && this.A0M) {
            int i4 = this.A06;
            if (i4 == -1) {
                invalidate();
            } else if (i3 <= i2) {
            } else {
                if (i4 == 0) {
                    this.A0A.setAlpha(125);
                    int[] A1Z = C86664Kz.A1Z();
                    // fill-array-data instruction
                    A1Z[0] = 125;
                    A1Z[1] = 255;
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1Z);
                    ofInt.setDuration(150);
                    C86604Kt.A0w(ofInt, this, 39);
                    AnimatorSet A0O2 = C86664Kz.A0O();
                    charSequence.length();
                    A0O2.playTogether(new Animator[]{ofInt});
                    A0O2.start();
                    return;
                }
                float[] fArr = this.A0O;
                float f = rectFArr[i].bottom - this.A03;
                fArr[i] = f;
                float[] fArr2 = new float[2];
                fArr2[0] = f + getPaint().getTextSize();
                ValueAnimator A0P2 = C86664Kz.A0P(fArr2, this.A0O[i]);
                A0P2.setDuration(300);
                A0P2.setInterpolator(new OvershootInterpolator());
                A0P2.addUpdateListener(new C162567sO(this, i));
                this.A0A.setAlpha(255);
                ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, 255});
                ofInt2.setDuration(300);
                C86604Kt.A0w(ofInt2, this, 40);
                AnimatorSet A0O3 = C86664Kz.A0O();
                charSequence.length();
                A0O3.playTogether(C86664Kz.A1b(A0P2, ofInt2, 2, 0));
                A0O3.start();
            }
        }
    }

    public void setMaxLength(int i) {
        this.A02 = (float) i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    private CharSequence getFullText() {
        if (this.A0G == null) {
            return getText();
        }
        return getMaskChars();
    }

    private StringBuilder getMaskChars() {
        if (this.A0I == null) {
            this.A0I = AnonymousClass001.A0o();
        }
        int A032 = C86624Kv.A03(this);
        while (true) {
            StringBuilder sb = this.A0I;
            if (sb.length() == A032) {
                return sb;
            }
            if (sb.length() < A032) {
                sb.append(this.A0G);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A00(Context context, AttributeSet attributeSet) {
        this.A04 = (float) C86604Kt.A04(this, this.A04);
        this.A05 = (float) C86604Kt.A04(this, this.A05);
        this.A00 = (float) C86604Kt.A04(this, this.A00);
        this.A03 = (float) C86604Kt.A04(this, this.A03);
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100875Cp.A00, 0, 0);
        try {
            TypedValue A0B2 = AnonymousClass4L0.A0B();
            obtainStyledAttributes.getValue(0, A0B2);
            this.A06 = A0B2.data;
            this.A0G = obtainStyledAttributes.getString(3);
            this.A0H = obtainStyledAttributes.getString(11);
            this.A04 = obtainStyledAttributes.getDimension(8, this.A04);
            this.A05 = obtainStyledAttributes.getDimension(10, this.A05);
            this.A0L = obtainStyledAttributes.getBoolean(9, false);
            this.A01 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A00 = obtainStyledAttributes.getDimension(5, this.A00);
            this.A03 = obtainStyledAttributes.getDimension(12, this.A03);
            this.A0K = obtainStyledAttributes.getBoolean(2, this.A0K);
            this.A0E = obtainStyledAttributes.getDrawable(1);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(7);
            if (colorStateList != null) {
                this.A07 = colorStateList;
            }
            obtainStyledAttributes.recycle();
            this.A09 = new Paint(getPaint());
            this.A0A = new Paint(getPaint());
            this.A0B = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A0C = paint;
            paint.setStrokeWidth(this.A04);
            setFontSize(this.A01);
            TypedValue A0B3 = AnonymousClass4L0.A0B();
            context.getTheme().resolveAttribute(R.attr.f3nameremoved, A0B3, true);
            int i = A0B3.data;
            int[] iArr = this.A0P;
            iArr[0] = i;
            iArr[1] = -7829368;
            iArr[2] = -7829368;
            setBackgroundResource(0);
            this.A02 = (float) attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 4);
            super.setOnClickListener(new C109405eZ(this, 38));
            super.setOnLongClickListener(new C1891790h(this, 6));
            if (((getInputType() & 128) == 128 && TextUtils.isEmpty(this.A0G)) || ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.A0G))) {
                this.A0G = "●";
            }
            if (!TextUtils.isEmpty(this.A0G)) {
                this.A0I = getMaskChars();
            }
            getPaint().getTextBounds("|", 0, 1, this.A0D);
            if (this.A06 > -1) {
                z = true;
            }
            this.A0M = z;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void onDraw(Canvas canvas) {
        float f;
        int i;
        Paint paint;
        int[] iArr;
        int i2;
        int i3;
        float f2;
        float f3;
        Paint paint2;
        int[] iArr2;
        int i4;
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(fullText, 0, length, fArr);
        String str = this.A0H;
        float f4 = 0.0f;
        if (str != null) {
            int length2 = str.length();
            float[] fArr2 = new float[length2];
            getPaint().getTextWidths(this.A0H, fArr2);
            for (int i5 = 0; i5 < length2; i5++) {
                f4 += fArr2[i5];
            }
        }
        for (int i6 = 0; ((float) i6) < this.A02; i6++) {
            Drawable drawable = this.A0E;
            boolean z = true;
            Canvas canvas2 = canvas;
            if (drawable != null) {
                boolean A1Y = AnonymousClass001.A1Y(i6, length);
                boolean A1U = AnonymousClass000.A1U(i6, length);
                if (this.A0N) {
                    iArr2 = new int[1];
                    i4 = 16842914;
                } else {
                    boolean isFocused = isFocused();
                    drawable = this.A0E;
                    iArr2 = new int[1];
                    if (isFocused) {
                        iArr2[0] = 16842908;
                        drawable.setState(iArr2);
                        if (A1U) {
                            drawable = this.A0E;
                            iArr2 = new int[]{16842908, 16842913};
                        } else {
                            if (A1Y) {
                                drawable = this.A0E;
                                iArr2 = new int[]{16842908, 16842912};
                            }
                            Drawable drawable2 = this.A0E;
                            RectF rectF = this.A0Q[i6];
                            drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            this.A0E.draw(canvas2);
                        }
                        drawable.setState(iArr2);
                        Drawable drawable22 = this.A0E;
                        RectF rectF2 = this.A0Q[i6];
                        drawable22.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        this.A0E.draw(canvas2);
                    } else {
                        i4 = -16842908;
                    }
                }
                iArr2[0] = i4;
                drawable.setState(iArr2);
                Drawable drawable222 = this.A0E;
                RectF rectF22 = this.A0Q[i6];
                drawable222.setBounds((int) rectF22.left, (int) rectF22.top, (int) rectF22.right, (int) rectF22.bottom);
                this.A0E.draw(canvas2);
            }
            float f5 = this.A0Q[i6].left + (this.A01 / 2.0f);
            if (length > i6) {
                if (!this.A0M || i6 != length - 1) {
                    i3 = i6 + 1;
                    f2 = f5 - (fArr[i6] / 2.0f);
                    f3 = this.A0O[i6];
                    paint2 = this.A09;
                } else {
                    i3 = i6 + 1;
                    f2 = f5 - (fArr[i6] / 2.0f);
                    f3 = this.A0O[i6];
                    paint2 = this.A0A;
                }
                canvas2.drawText(fullText, i6, i3, f2, f3, paint2);
            } else {
                String str2 = this.A0H;
                if (str2 != null) {
                    canvas2.drawText(str2, f5 - (f4 / 2.0f), this.A0O[i6], this.A0B);
                }
            }
            if (this.A0E == null) {
                boolean A1Y2 = AnonymousClass001.A1Y(i6, length);
                if (i6 != length) {
                    z = false;
                }
                if (this.A0N) {
                    paint = this.A0C;
                    iArr = new int[1];
                    i2 = 16842914;
                } else {
                    Paint paint3 = this.A0C;
                    if (isFocused()) {
                        f = this.A05;
                    } else {
                        f = this.A04;
                    }
                    paint3.setStrokeWidth(f);
                    if (A1Y2) {
                        paint = this.A0C;
                        iArr = new int[1];
                        i2 = 16842913;
                    } else {
                        boolean isFocused2 = isFocused();
                        int[] iArr3 = new int[1];
                        if (z) {
                            i = -16842918;
                            if (isFocused2) {
                                i = 16842918;
                            }
                        } else {
                            i = -16842908;
                            if (isFocused2) {
                                i = 16842908;
                            }
                        }
                        iArr3[0] = i;
                        this.A0C.setColor(this.A07.getColorForState(iArr3, -7829368));
                        RectF rectF3 = this.A0Q[i6];
                        canvas2.drawLine(rectF3.left, rectF3.top + 20.0f, rectF3.right, rectF3.bottom + 20.0f, this.A0C);
                    }
                }
                iArr[0] = i2;
                paint.setColor(this.A07.getColorForState(iArr, -7829368));
                RectF rectF32 = this.A0Q[i6];
                canvas2.drawLine(rectF32.left, rectF32.top + 20.0f, rectF32.right, rectF32.bottom + 20.0f, this.A0C);
            }
        }
    }

    public void setCharSize(float f) {
        this.A01 = f;
        invalidate();
    }

    public void setColorStates(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        invalidate();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    public void setFontSize(float f) {
        this.A09.setTextSize(f);
        this.A0A.setTextSize(f);
        this.A0B.setTextSize(f);
    }

    public void setLineStroke(float f) {
        this.A04 = f;
        invalidate();
    }

    public void setLineStrokeCentered(boolean z) {
        this.A0L = z;
        invalidate();
    }

    public void setLineStrokeSelected(float f) {
        this.A05 = f;
        invalidate();
    }

    public void setSpace(float f) {
        this.A00 = f;
        invalidate();
    }

    public FormItemEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int[] A1b = C86604Kt.A1b(this);
        // fill-array-data instruction
        A1b[0] = -16711936;
        A1b[1] = -65536;
        A1b[2] = -16777216;
        A1b[3] = -7829368;
        this.A0P = A1b;
        this.A07 = new ColorStateList(this.A0R, A1b);
        A00(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            super.onSizeChanged(r11, r12, r13, r14)
            android.content.res.ColorStateList r0 = r10.getTextColors()
            r10.A08 = r0
            if (r0 == 0) goto L_0x0028
            android.graphics.Paint r1 = r10.A0A
            int r0 = r0.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint r1 = r10.A09
            android.content.res.ColorStateList r0 = r10.A08
            int r0 = r0.getDefaultColor()
            r1.setColor(r0)
            android.graphics.Paint r1 = r10.A0B
            int r0 = r10.getCurrentHintTextColor()
            r1.setColor(r0)
        L_0x0028:
            int r1 = r10.getWidth()
            int r0 = X.AnonymousClass0YH.A02(r10)
            int r1 = r1 - r0
            int r0 = X.AnonymousClass0YH.A03(r10)
            int r1 = r1 - r0
            float r4 = r10.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ee
            float r2 = (float) r1
            float r0 = r10.A02
            float r0 = r0 * r8
            float r0 = r0 - r3
            float r2 = r2 / r0
        L_0x0047:
            r10.A01 = r2
        L_0x0049:
            float r0 = r10.A02
            int r1 = (int) r0
            android.graphics.RectF[] r0 = new android.graphics.RectF[r1]
            r10.A0Q = r0
            float[] r0 = new float[r1]
            r10.A0O = r0
            int r5 = X.AnonymousClass001.A0H(r10)
            int r0 = r10.getPaddingTop()
            int r5 = r5 - r0
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = X.AnonymousClass0I0.A00(r0)
            r4 = 0
            r3 = 1
            if (r0 != r3) goto L_0x00e9
            int r1 = r10.getWidth()
            int r0 = X.AnonymousClass0YH.A03(r10)
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = r10.A01
            float r1 = r1 - r0
            int r7 = (int) r1
            r3 = -1
        L_0x0078:
            float r1 = (float) r4
            float r0 = r10.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fe
            android.graphics.RectF[] r6 = r10.A0Q
            float r7 = (float) r7
            float r2 = (float) r5
            float r1 = r10.A01
            float r1 = r1 + r7
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r7, r2, r1, r2)
            r6[r4] = r0
            android.graphics.drawable.Drawable r0 = r10.A0E
            if (r0 == 0) goto L_0x00ab
            boolean r1 = r10.A0K
            android.graphics.RectF[] r0 = r10.A0Q
            r6 = r0[r4]
            if (r1 == 0) goto L_0x00d8
            int r0 = r10.getPaddingTop()
            float r0 = (float) r0
            r6.top = r0
            android.graphics.RectF[] r0 = r10.A0Q
            r1 = r0[r4]
            float r0 = r1.height()
            float r0 = r0 + r7
            r1.right = r0
        L_0x00ab:
            float r6 = r10.A00
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            float r1 = (float) r3
            float r0 = r10.A01
            if (r2 >= 0) goto L_0x00d5
            float r1 = r1 * r0
            float r1 = r1 * r8
        L_0x00b6:
            float r7 = r7 + r1
            int r7 = (int) r7
            float[] r6 = r10.A0O
            android.graphics.RectF[] r0 = r10.A0Q
            r2 = r0[r4]
            float r1 = r2.bottom
            float r0 = r10.A03
            float r0 = r1 - r0
            r6[r4] = r0
            boolean r0 = r10.A0L
            if (r0 == 0) goto L_0x00d2
            float r0 = r2.top
            float r0 = r0 / r8
            r2.top = r0
            float r1 = r1 / r8
            r2.bottom = r1
        L_0x00d2:
            int r4 = r4 + 1
            goto L_0x0078
        L_0x00d5:
            float r0 = r0 + r6
            float r1 = r1 * r0
            goto L_0x00b6
        L_0x00d8:
            float r2 = r6.top
            android.graphics.Rect r0 = r10.A0D
            int r0 = r0.height()
            float r1 = (float) r0
            float r0 = r10.A03
            float r0 = r0 * r8
            float r1 = r1 + r0
            float r2 = r2 - r1
            r6.top = r2
            goto L_0x00ab
        L_0x00e9:
            int r7 = X.AnonymousClass0YH.A03(r10)
            goto L_0x0078
        L_0x00ee:
            float r0 = r10.A01
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            float r2 = (float) r1
            float r1 = r10.A02
            float r0 = r1 - r3
            float r4 = r4 * r0
            float r2 = r2 - r4
            float r2 = r2 / r1
            goto L_0x0047
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText.onSizeChanged(int, int, int, int):void");
    }

    public void setAnimateText(boolean z) {
        this.A0M = z;
    }

    public void setError(boolean z) {
        this.A0N = z;
    }

    public void setMargin(int[] iArr) {
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(this);
        A0T.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        setLayoutParams(A0T);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A0F = onClickListener;
    }

    public void setOnPinEnteredListener(C180058kQ r1) {
        this.A0J = r1;
    }

    public FormItemEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] A1b = C86604Kt.A1b(this);
        // fill-array-data instruction
        A1b[0] = -16711936;
        A1b[1] = -65536;
        A1b[2] = -16777216;
        A1b[3] = -7829368;
        this.A0P = A1b;
        this.A07 = new ColorStateList(this.A0R, A1b);
        A00(context, attributeSet);
    }

    public FormItemEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int[] A1b = C86604Kt.A1b(this);
        // fill-array-data instruction
        A1b[0] = -16711936;
        A1b[1] = -65536;
        A1b[2] = -16777216;
        A1b[3] = -7829368;
        this.A0P = A1b;
        this.A07 = new ColorStateList(this.A0R, A1b);
        A00(context, attributeSet);
    }

    public FormItemEditText(Context context) {
        super(context);
        int[] A1b = C86604Kt.A1b(this);
        // fill-array-data instruction
        A1b[0] = -16711936;
        A1b[1] = -65536;
        A1b[2] = -16777216;
        A1b[3] = -7829368;
        this.A0P = A1b;
        this.A07 = new ColorStateList(this.A0R, A1b);
    }
}
