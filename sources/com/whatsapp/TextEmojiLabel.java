package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass066;
import X.AnonymousClass0YI;
import X.AnonymousClass1VX;
import X.AnonymousClass487;
import X.AnonymousClass4L0;
import X.AnonymousClass5Y0;
import X.AnonymousClass7IU;
import X.C06560Yg;
import X.C102805Ki;
import X.C106285Yi;
import X.C107075ae;
import X.C107345b9;
import X.C107635bd;
import X.C162457s7;
import X.C179048iW;
import X.C18260x0;
import X.C58422vE;
import X.C60152y5;
import X.C620633i;
import X.C86614Ku;
import X.C86644Kx;
import X.C86664Kz;
import X.C86964Mo;
import X.C89824fB;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.List;

public class TextEmojiLabel extends C89824fB {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public TextView.BufferType A05;
    public AnonymousClass066 A06;
    public C86964Mo A07;
    public C179048iW A08;
    public C620633i A09;
    public AnonymousClass487 A0A;
    public AnonymousClass5Y0 A0B;
    public C60152y5 A0C;
    public CharSequence A0D;

    public CharSequence A0D(C107075ae r10, CharSequence charSequence, List list, float f, int i, boolean z) {
        CharSequence charSequence2;
        int A062;
        C107075ae r5 = r10;
        if (charSequence == null) {
            return null;
        }
        if (z) {
            charSequence2 = C107635bd.A07(this.A09, this.A0C, charSequence);
        } else {
            charSequence2 = charSequence;
        }
        if (i != 0 && charSequence2.length() > i) {
            if (charSequence.length() == 0) {
                A062 = 0;
            } else {
                A062 = C86644Kx.A06(charSequence, i);
            }
            if (charSequence2 instanceof Editable) {
                charSequence2 = ((Editable) charSequence2).delete(A062, charSequence2.length());
            } else {
                charSequence2 = charSequence2.subSequence(0, A062);
            }
        }
        Context context = getContext();
        TextPaint paint = getPaint();
        AnonymousClass5Y0 r1 = this.A0B;
        C18260x0.A0Q(context, paint);
        C162457s7.A0J(r1, 4);
        CharSequence A042 = C107345b9.A04(context, paint, r1, charSequence2, f);
        if (r10 == null) {
            r5 = C107075ae.A03;
        }
        AnonymousClass7IU A002 = C107075ae.A00(getContext(), this.A01, r5, A042, list, false);
        if (A002 != null) {
            return (CharSequence) A002.A00;
        }
        return null;
    }

    public void A0E() {
        setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void A0I(CharSequence charSequence) {
        A0K((List) null, charSequence);
    }

    public void A0J(CharSequence charSequence, List list, int i, boolean z) {
        A0H((C107075ae) null, charSequence, list, i, z);
    }

    public void A0K(List list, CharSequence charSequence) {
        A0J(charSequence, list, 0, false);
    }

    public void A0H(C107075ae r9, CharSequence charSequence, List list, int i, boolean z) {
        setText(A0D(r9, charSequence, list, 1.0f, i, z));
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        AnonymousClass066 r0 = this.A06;
        if ((r0 == null || !r0.A0S(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AnonymousClass066 r0 = this.A06;
        if ((r0 == null || !r0.A0R(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this.A03 <= 0 || this.A04 == null) {
            try {
                super.onDraw(canvas);
            } catch (IndexOutOfBoundsException unused) {
                setText(getText());
            } catch (Exception e) {
                Log.e((Throwable) e);
                throw new RuntimeException(e);
            }
        } else {
            canvas2.drawRect((float) C86664Kz.A0F(this, getScrollX()), (float) ((AnonymousClass001.A0H(this) - this.A01) - this.A02), (float) AnonymousClass4L0.A03(this, getScrollX() + getWidth()), (float) (AnonymousClass001.A0H(this) - this.A01), this.A04);
        }
    }

    public void onMeasure(int i, int i2) {
        int measuredWidth;
        if (this.A03 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(i, i2);
            if (mode != 1073741824) {
                measuredWidth = (size * this.A03) / 100;
            } else {
                measuredWidth = getMeasuredWidth();
            }
            setMeasuredDimension(measuredWidth, getMeasuredHeight());
            return;
        }
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 0) {
            int size2 = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            TransformationMethod transformationMethod = getTransformationMethod();
            if (size2 > 0 && this.A00 != size2 && (this.A0D instanceof Spanned) && getEllipsize() != null && (transformationMethod instanceof SingleLineTransformationMethod)) {
                this.A00 = size2;
                CharSequence transformation = transformationMethod.getTransformation(this.A0D, this);
                CharSequence ellipsize = TextUtils.ellipsize(transformation, getPaint(), (float) size2, getEllipsize());
                if (ellipsize != null && !ellipsize.equals(transformation)) {
                    super.setText(ellipsize, this.A05);
                }
            }
        }
    }

    public void setAccessibilityHelper(AnonymousClass066 r1) {
        this.A06 = r1;
        C06560Yg.A0O(this, r1);
    }

    public void setLinkHandler(C86964Mo r4) {
        this.A07 = r4;
        AnonymousClass1VX r2 = this.A02;
        if (r2 != null && r2.A0Y(C58422vE.A01, 6882)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            setMovementMethod(r4);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    public void setPlaceholder(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            if (i > 0) {
                Paint.FontMetricsInt A002 = C106285Yi.A00(getPaint());
                this.A02 = ((-A002.ascent) * 6) / 10;
                this.A01 = A002.bottom;
                Paint paint = this.A04;
                if (paint == null) {
                    paint = C86664Kz.A0Z();
                    this.A04 = paint;
                }
                paint.setColor(AnonymousClass0YI.A06(getPaint().getColor(), (Color.alpha(getPaint().getColor()) * 12) / 255));
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object obj;
        this.A0D = charSequence;
        this.A05 = bufferType;
        this.A00 = 0;
        AnonymousClass1VX r2 = this.A02;
        if (r2 == null || !r2.A0Y(C58422vE.A01, 6882)) {
            obj = this.A07;
        } else {
            obj = getMovementMethod();
        }
        if (obj != null && (charSequence instanceof Spanned)) {
            bufferType = TextView.BufferType.SPANNABLE;
        }
        super.setText(charSequence, bufferType);
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public void A0F(int i, int i2) {
        Drawable A0C2 = C86644Kx.A0C(this, i);
        if (C102805Ki.A00(this.A01)) {
            setCompoundDrawablesWithIntrinsicBounds(A0C2, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A0C2, (Drawable) null);
        }
        setCompoundDrawablePadding(C86614Ku.A05(this, i2));
    }

    public void A0G(Drawable drawable) {
        if (C102805Ki.A00(this.A01)) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        setCompoundDrawablePadding(C86614Ku.A05(this, R.dimen.f6nameremoved));
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AnonymousClass066 r2 = this.A06;
        if (r2 != null) {
            int i2 = r2.A02;
            if (i2 != Integer.MIN_VALUE) {
                r2.A0N(i2);
            }
            if (z) {
                r2.A0Q(i, rect);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            super.onLayout(r11, r12, r13, r14, r15)
            X.8iW r0 = r10.A08
            if (r0 == 0) goto L_0x0043
            int r14 = r14 - r12
            X.8E4 r0 = (X.AnonymousClass8E4) r0
            X.5YB r8 = r0.A01
            android.text.Spannable r7 = r0.A00
            java.lang.CharSequence r6 = r0.A02
            java.lang.String r5 = r0.A03
            com.whatsapp.TextEmojiLabel r4 = r8.A02
            java.lang.CharSequence r3 = r4.getText()
            boolean r0 = r3 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x008f
            r9 = r3
            android.text.Spanned r9 = (android.text.Spanned) r9
            int r1 = r9.length()
            java.lang.Class<X.5Vm> r0 = X.C105565Vm.class
            r2 = 0
            java.lang.Object[] r1 = r9.getSpans(r2, r1, r0)
            X.5Vm[] r1 = (X.C105565Vm[]) r1
            if (r1 == 0) goto L_0x008f
            int r0 = r1.length
            if (r0 <= 0) goto L_0x008f
            r0 = r1[r2]
            java.lang.CharSequence r0 = r0.A00
        L_0x0035:
            boolean r0 = android.text.TextUtils.equals(r7, r0)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "textemojilabelviewcontroller/post-layout view recycled, don't update"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            r4.A08 = r0
        L_0x0043:
            return
        L_0x0044:
            android.text.TextPaint r9 = r4.getPaint()
            android.text.Spannable r2 = r8.A04(r6, r5)
            float r1 = android.text.Layout.getDesiredWidth(r2, r9)
            float r0 = (float) r14
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)
            float r0 = r9.measureText(r0)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            int r14 = r14 - r0
            if (r14 > 0) goto L_0x0083
            java.lang.String r0 = "textemojilabelviewcontroller/not enough space for name/number"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0071:
            r2 = r6
        L_0x0072:
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r2)
            X.C105565Vm.A00(r1, r7)
            boolean r0 = android.text.TextUtils.equals(r3, r1)
            if (r0 != 0) goto L_0x0043
            r4.setText(r1)
            return
        L_0x0083:
            float r1 = (float) r14
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r6, r9, r1, r0)
            android.text.Spannable r6 = r8.A04(r0, r5)
            goto L_0x0071
        L_0x008f:
            r0 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextEmojiLabel.onLayout(boolean, int, int, int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass1VX r2 = this.A02;
        if ((r2 == null || !r2.A0Y(C58422vE.A01, 6882)) && this.A07 != null) {
            CharSequence text = getText();
            if ((text instanceof Spannable) && getLayout() != null) {
                return onTouchEvent | this.A07.onTouchEvent(this, (Spannable) text, motionEvent);
            }
        }
        return onTouchEvent;
    }

    public void setOnPostLayoutListener(C179048iW r1) {
        this.A08 = r1;
    }

    public TextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }

    public TextEmojiLabel(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT == 29) {
            setBreakStrategy(0);
        }
    }
}
