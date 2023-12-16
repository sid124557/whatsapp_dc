package com.whatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0Y8;
import X.AnonymousClass359;
import X.AnonymousClass3H6;
import X.AnonymousClass4SQ;
import X.AnonymousClass5Yj;
import X.AnonymousClass74Q;
import X.AnonymousClass973;
import X.AnonymousClass9M9;
import X.AnonymousClass9X0;
import X.AnonymousClass9h6;
import X.C106905aM;
import X.C18290x4;
import X.C1899793j;
import X.C202199lX;
import X.C203369na;
import X.C620733j;
import X.C626936e;
import X.C64333Db;
import X.C69263Wi;
import X.C85204Fi;
import X.C88864av;
import X.C97014xU;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.whatsapp.R;
import java.math.BigDecimal;
import java.util.HashSet;

public class PaymentAmountInputField extends C97014xU {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public ValueAnimator A06;
    public TextPaint A07;
    public View A08;
    public Animation A09;
    public TextView A0A;
    public C69263Wi A0B;
    public C620733j A0C;
    public C620733j A0D;
    public C85204Fi A0E;
    public C203369na A0F;
    public C202199lX A0G;
    public String A0H;
    public BigDecimal A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final Runnable A0O;

    public final void A0F(AttributeSet attributeSet) {
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass9M9.A02);
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            this.A0L = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            z = z2;
        } else {
            this.A0L = false;
        }
        this.A0D = this.A0C;
        this.A0H = C18290x4.A0m(this);
        this.A02 = -1;
        this.A04 = C18290x4.A0G(this).getConfiguration().orientation;
        setInputType(2);
        A0E();
        setFilterTouchesWhenObscured(true);
        setCursorVisible(true);
        setFocusable(true);
        setSingleLine(true);
        addTextChangedListener(this);
        setAutoScaleTextSize(z);
        this.A0N = true;
    }

    public void A04() {
        if (!this.A0M) {
            this.A0M = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            AnonymousClass4SQ.A01(A002, this);
            this.A0B = C64333Db.A04(A002);
            this.A0C = C64333Db.A2t(A002);
        }
    }

    public void A0B(boolean z) {
        C203369na r1 = this.A0F;
        if (r1 != null) {
            Editable text = getText();
            C626936e.A06(text);
            r1.BTg(text.toString(), z);
        }
    }

    public void A0D() {
        if (this.A08 != null) {
            ValueAnimator valueAnimator = this.A05;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else {
                float dimensionPixelSize = (float) getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                View view = this.A08;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.setRepeatCount(3);
                ofFloat.setRepeatMode(2);
                ofFloat.setDuration(65);
                ofFloat.addUpdateListener(new AnonymousClass9X0(view, dimensionPixelSize));
                this.A05 = ofFloat;
                ofFloat.addListener(new C1899793j(this));
            }
            this.A05.start();
        }
    }

    public final void A0E() {
        String str = "0123456789";
        if (this.A0J) {
            StringBuilder A0l = AnonymousClass000.A0l(str);
            A0l.append(AnonymousClass74Q.A00(this.A0D).charAt(0));
            str = A0l.toString();
        }
        setKeyListener(DigitsKeyListener.getInstance(str));
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i != this.A04) {
            this.A04 = i;
            this.A02 = -1;
        }
        super.onConfigurationChanged(configuration);
    }

    public void setAllowDecimal(boolean z) {
        this.A0J = z;
        A0E();
    }

    public final void setAmount(String str, String str2) {
        String substring;
        if (this.A0L) {
            char charAt = AnonymousClass74Q.A00(this.A0D).charAt(0);
            int indexOf = TextUtils.indexOf(str, charAt);
            C85204Fi r0 = this.A0E;
            if (r0 != null) {
                C620733j r5 = this.A0D;
                BigDecimal B3c = r0.B3c(r5, str2);
                AnonymousClass3H6 r02 = (AnonymousClass3H6) r0;
                this.A0H = AnonymousClass359.A02(r5, r02.A04, r02.A05, B3c, false);
            }
            if (indexOf != -1) {
                int indexOf2 = TextUtils.indexOf(this.A0H, charAt);
                StringBuilder A0o = AnonymousClass001.A0o();
                if (indexOf2 == -1) {
                    substring = this.A0H;
                } else {
                    substring = this.A0H.substring(0, indexOf2);
                }
                A0o.append(substring);
                str = AnonymousClass000.A0X(str.substring(indexOf), A0o);
            } else {
                return;
            }
        }
        this.A0H = str;
    }

    public void setAutoScaleTextSize(boolean z) {
        this.A0K = z;
        if (z) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
        }
    }

    public void setErrorTextView(TextView textView) {
        this.A0A = textView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A09 = alphaAnimation;
        alphaAnimation.setDuration(500);
        this.A09.setAnimationListener(new AnonymousClass973(textView, this));
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A04();
        this.A0O = new AnonymousClass9h6(this);
        this.A0N = false;
        this.A0J = true;
        A0F(attributeSet);
    }

    public static String A02(C620733j r2) {
        String A002 = AnonymousClass74Q.A00(r2);
        String str = ",";
        String str2 = str;
        if (A002.contains(str)) {
            str = ".";
        }
        if (str.equals(".")) {
            return "\\.";
        }
        return str2;
    }

    private ViewGroup getFirstNonWrapContentParent() {
        if (getParent() != null) {
            ViewParent parent = getParent();
            while (true) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup == null) {
                    break;
                } else if (viewGroup.getLayoutParams().width != -2) {
                    return viewGroup;
                } else {
                    parent = viewGroup.getParent();
                }
            }
        }
        return null;
    }

    public float A09(String str) {
        return A0C(str, getTextSize());
    }

    public final float A0C(String str, float f) {
        String str2;
        String str3;
        float f2 = 0.0f;
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (this.A07 == null) {
            TextPaint textPaint = new TextPaint();
            this.A07 = textPaint;
            getContext();
            textPaint.setTypeface(C106905aM.A02());
        }
        int indexOf = TextUtils.indexOf(str, AnonymousClass74Q.A00(this.A0D).charAt(0));
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str3 = str.substring(indexOf);
        } else {
            str2 = str;
            str3 = "";
        }
        this.A07.setTextSize(f);
        float measureText = this.A07.measureText(str2);
        if (!TextUtils.isEmpty(str3)) {
            this.A07.setTextSize(f * 1.0f);
            f2 = this.A07.measureText(str3);
        }
        return measureText + f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(java.lang.String r7) {
        /*
            r6 = this;
            float r5 = r6.getTextSize()
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0080
            int r0 = r6.A02
            if (r0 <= 0) goto L_0x0080
            r4 = 0
        L_0x000d:
            float r3 = r6.A00
            float r1 = (float) r4
            r0 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            float r3 = r3 * r0
            float r2 = r6.A0C(r7, r3)
            if (r4 != 0) goto L_0x006b
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0023:
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
        L_0x0028:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            android.animation.ValueAnimator r0 = r6.A06
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x003b
            android.animation.ValueAnimator r0 = r6.A06
            r0.cancel()
        L_0x003b:
            r0 = 2
            float[] r1 = new float[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r1)
            r6.A06 = r2
            r1 = 1073741824(0x40000000, float:2.0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r2.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r6.A06
            r0 = 100
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r6.A06
            X.9Wz r0 = new X.9Wz
            r0.<init>(r6)
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r6.A06
            r0.start()
        L_0x006a:
            return
        L_0x006b:
            r0 = 1
            if (r4 != r0) goto L_0x0074
            int r0 = r6.A02
            float r1 = (float) r0
            r0 = 1061158912(0x3f400000, float:0.75)
            goto L_0x0023
        L_0x0074:
            int r4 = r4 + 1
            r0 = 2
            if (r4 <= r0) goto L_0x000d
            float r0 = r6.A01
            float r3 = java.lang.Math.max(r3, r0)
            goto L_0x0028
        L_0x0080:
            float r3 = r6.A00
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.A0G(java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (r5 != false) goto L_0x007f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r11) {
        /*
            r10 = this;
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = r10.A0H
            boolean r0 = r1.equals(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0129
            X.9lX r0 = r10.A0G
            if (r0 == 0) goto L_0x0129
            java.lang.String r7 = r11.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x00a5
            r10.A0H = r7
            java.lang.String r0 = "0"
            r10.setHint(r0)
        L_0x0022:
            r5 = 0
        L_0x0023:
            java.lang.String r1 = r10.A0H
            X.33j r0 = r10.A0D
            java.lang.String r0 = X.AnonymousClass74Q.A00(r0)
            char r0 = r0.charAt(r6)
            int r3 = android.text.TextUtils.indexOf(r1, r0)
            java.lang.String r2 = r10.A0H
            r1 = r2
            r0 = -1
            if (r3 == r0) goto L_0x0056
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r1)
            int r0 = r2.length()
            java.lang.CharSequence r0 = r2.subSequence(r3, r0)
            java.lang.String r0 = r0.toString()
            X.942 r1 = new X.942
            r1.<init>(r0)
            int r0 = r2.length()
            r2.setSpan(r1, r3, r0, r6)
        L_0x0056:
            r10.setText(r2)
            java.lang.String r0 = r10.A0H
            int r0 = r0.length()
            r10.setSelection(r0)
            boolean r0 = r10.A0K
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r10.A0H
            r10.A0G(r0)
        L_0x006b:
            if (r5 != 0) goto L_0x007f
        L_0x006d:
            X.9na r1 = r10.A0F
            if (r1 == 0) goto L_0x007f
            android.text.Editable r0 = r10.getText()
            X.C626936e.A06(r0)
            java.lang.String r0 = r0.toString()
            r1.BMO(r0)
        L_0x007f:
            android.widget.TextView r0 = r10.A0A
            if (r0 == 0) goto L_0x00a4
            if (r5 != 0) goto L_0x0087
            r6 = 8
        L_0x0087:
            r0.setVisibility(r6)
            X.3Wi r0 = r10.A0B
            java.lang.Runnable r3 = r10.A0O
            r0.A0R(r3)
            if (r5 == 0) goto L_0x00a4
            android.view.animation.Animation r0 = r10.A09
            r0.cancel()
            android.view.animation.Animation r0 = r10.A09
            r0.reset()
            X.3Wi r2 = r10.A0B
            r0 = 1200(0x4b0, double:5.93E-321)
            r2.A0T(r3, r0)
        L_0x00a4:
            return
        L_0x00a5:
            X.33j r0 = r10.A0D
            java.lang.String r0 = A02(r0)
            java.lang.String r8 = ""
            java.lang.String r4 = r7.replaceAll(r0, r8)
            java.lang.String r1 = r10.A0H
            X.33j r0 = r10.A0D
            java.lang.String r0 = A02(r0)
            java.lang.String r0 = r1.replaceAll(r0, r8)
            X.9lX r9 = r10.A0G
            int r3 = r10.A03
            int r1 = r4.length()
            int r0 = r0.length()
            r5 = 1
            r2 = 0
            if (r1 >= r0) goto L_0x00ce
            r2 = 1
        L_0x00ce:
            X.9dU r9 = (X.C197549dU) r9
            java.lang.String r0 = "^([0]([.,]\\d{0,2})?|[1-9]\\d*([.,]\\d{0,2})?)"
            boolean r0 = r4.matches(r0)
            if (r0 == 0) goto L_0x00ef
            X.4Fi r1 = r9.A03
            X.33j r0 = r9.A02
            java.math.BigDecimal r0 = r1.B3c(r0, r4)
            if (r0 == 0) goto L_0x00ef
            X.9Oc r2 = r9.A00(r4, r0, r3, r2)
        L_0x00e6:
            int r1 = r2.A00
            if (r1 != 0) goto L_0x00f5
            r10.setAmount(r7, r4)
            goto L_0x0022
        L_0x00ef:
            X.9Oc r2 = new X.9Oc
            r2.<init>(r5, r8)
            goto L_0x00e6
        L_0x00f5:
            r10.A0D()
            r0 = 3
            if (r1 != r0) goto L_0x0022
            java.lang.String r3 = r2.A01
            if (r3 == 0) goto L_0x0022
            android.widget.TextView r0 = r10.A0A
            if (r0 == 0) goto L_0x010b
            r0.setText(r3)
            X.33i r0 = r10.A02
            X.C106755a7.A03(r0)
        L_0x010b:
            java.math.BigDecimal r2 = r10.A0I
            if (r2 == 0) goto L_0x0120
            X.4Fi r1 = r10.A0E
            X.33j r0 = r10.A0D
            java.math.BigDecimal r0 = r1.B3c(r0, r4)
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L_0x0120
            r10.setAmount(r7, r4)
        L_0x0120:
            X.9na r0 = r10.A0F
            if (r0 == 0) goto L_0x0023
            r0.BSF(r3)
            goto L_0x0023
        L_0x0129:
            r5 = 0
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.widget.PaymentAmountInputField.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.A0I = this.A0E.B3c(this.A0D, charSequence.toString());
        }
    }

    public int getCursorColor() {
        return AnonymousClass0Y8.A04(getContext(), AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
    }

    public int getCursorVerticalPadding() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public int getCursorWidth() {
        return getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A0K && this.A02 == -1) {
            if (getLayoutParams().width == -2) {
                ViewGroup firstNonWrapContentParent = getFirstNonWrapContentParent();
                if (firstNonWrapContentParent == null) {
                    width = Resources.getSystem().getDisplayMetrics().widthPixels;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    HashSet A0K2 = AnonymousClass002.A0K();
                    i5 = firstNonWrapContentParent.getWidth();
                    while (!A0K2.contains(firstNonWrapContentParent)) {
                        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                            View childAt = viewGroup.getChildAt(i6);
                            if (childAt != this && !A0K2.contains(childAt)) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                                i5 -= (childAt.getWidth() + marginLayoutParams.rightMargin) + marginLayoutParams.leftMargin;
                                A0K2.add(childAt);
                            }
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                        i5 -= ((marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin) + viewGroup.getPaddingRight()) + viewGroup.getPaddingLeft();
                        A0K2.add(viewGroup);
                        viewGroup = (ViewGroup) viewGroup.getParent();
                    }
                    this.A02 = i5;
                }
            } else {
                width = getWidth();
            }
            i5 = (width - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            this.A02 = i5;
        }
    }

    public void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if (TextUtils.isEmpty(text) || (i == text.length() && i2 == text.length())) {
            super.onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if ((i == 4 || i == 8) && this.A0A != null) {
            this.A0B.A0R(this.A0O);
            this.A09.cancel();
            this.A09.reset();
            this.A0A.setVisibility(8);
        }
    }

    public void setTextSize(float f) {
        super.setTextSize(f);
        if (this.A0K) {
            float textSize = getTextSize();
            this.A00 = textSize;
            this.A01 = textSize * 0.7f;
            A0G(this.A0H);
        }
    }

    public C620733j getWhatsAppLocale() {
        return this.A0D;
    }

    public void setCurrency(C85204Fi r1) {
        this.A0E = r1;
    }

    public void setFormatWithCommas(boolean z) {
        this.A0L = z;
    }

    public void setInputAmountType(int i) {
        this.A03 = i;
    }

    public void setInputAmountValidator(C202199lX r1) {
        this.A0G = r1;
    }

    public void setOnAmountChangedLister(C203369na r1) {
        this.A0F = r1;
    }

    public void setPaymentAmountContainer(View view) {
        this.A08 = view;
    }

    public void setWhatsAppLocale(C620733j r1) {
        this.A0D = r1;
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    public PaymentAmountInputField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        this.A0O = new AnonymousClass9h6(this);
        this.A0N = false;
        this.A0J = true;
        A0F(attributeSet);
    }

    public PaymentAmountInputField(Context context) {
        super(context);
        A04();
        this.A0O = new AnonymousClass9h6(this);
        this.A0N = false;
        this.A0J = true;
        A0F((AttributeSet) null);
    }
}
