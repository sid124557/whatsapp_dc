package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.03n  reason: invalid class name */
public class AnonymousClass03n extends TextView implements C17170ug, C16620th, C15000qc {
    public Future A00;
    public boolean A01;
    public final C04780Qq A02;
    public final AnonymousClass0OE A03;
    public final AnonymousClass0WJ A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0UL A00(android.widget.TextView r5) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r2 < r0) goto L_0x0010
            android.text.PrecomputedText$Params r0 = X.C05080Rv.A00(r5)
            X.0UL r4 = new X.0UL
            r4.<init>(r0)
            return r4
        L_0x0010:
            android.text.TextPaint r1 = r5.getPaint()
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r1)
            X.0OW r4 = new X.0OW
            r4.<init>(r0)
            r0 = 23
            if (r2 < r0) goto L_0x0030
            int r0 = X.C06370Xj.A00(r5)
            r4.A00(r0)
            int r0 = X.C06370Xj.A01(r5)
            r4.A01(r0)
        L_0x0030:
            android.text.method.TransformationMethod r0 = r5.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 != 0) goto L_0x0066
            r2 = 0
            r1 = 1
            int r0 = X.AnonymousClass0X3.A00(r5)
            if (r0 != r1) goto L_0x0041
            r2 = 1
        L_0x0041:
            int r0 = X.AnonymousClass0X3.A01(r5)
            switch(r0) {
                case 2: goto L_0x005d;
                case 3: goto L_0x0066;
                case 4: goto L_0x005a;
                case 5: goto L_0x0060;
                case 6: goto L_0x0063;
                case 7: goto L_0x004a;
                default: goto L_0x0048;
            }
        L_0x0048:
            if (r2 == 0) goto L_0x0063
        L_0x004a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
        L_0x004c:
            r4.A02 = r3
            android.text.TextPaint r2 = r4.A03
            int r1 = r4.A00
            int r0 = r4.A01
            X.0UL r4 = new X.0UL
            r4.<init>(r3, r2, r1, r0)
            return r4
        L_0x005a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            goto L_0x004c
        L_0x005d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x004c
        L_0x0060:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x004c
        L_0x0063:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L_0x004c
        L_0x0066:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03n.A00(android.widget.TextView):X.0UL");
    }

    public static void A01(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw AnonymousClass001.A0g("getPrecomputedText");
        }
        A00(textView);
        throw AnonymousClass001.A0g("getParams");
    }

    public int getAutoSizeMaxTextSize() {
        if (C17170ug.A00) {
            return super.getAutoSizeMaxTextSize();
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C17170ug.A00) {
            return super.getAutoSizeMinTextSize();
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C17170ug.A00) {
            return super.getAutoSizeStepGranularity();
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C17170ug.A00) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            return r0.A0C.A07;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C17170ug.A00) {
            AnonymousClass0WJ r0 = this.A04;
            if (r0 != null) {
                return r0.A0C.A03;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C04780Qq r0 = this.A02;
        if (r0 != null) {
            return C04780Qq.A00(r0);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C04780Qq r0 = this.A02;
        if (r0 != null) {
            return C04780Qq.A01(r0);
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C03900Lz r0 = this.A04.A08;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C03900Lz r0 = this.A04.A08;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public CharSequence getText() {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A01(this);
                throw AnonymousClass000.A0L();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        AnonymousClass0OE r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A03) == null) {
            return super.getTextClassifier();
        }
        return r0.A00();
    }

    public void onMeasure(int i, int i2) {
        Future future = this.A00;
        if (future != null) {
            try {
                this.A00 = null;
                future.get();
                A01(this);
                throw AnonymousClass000.A0L();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C17170ug.A00) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A05(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C17170ug.A00) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A0C(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C17170ug.A00) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            AnonymousClass0Y9.A04(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            AnonymousClass0Y9.A05(this, i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C04780Qq r0 = this.A02;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C04780Qq r0 = this.A02;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        AnonymousClass0WJ r0 = this.A04;
        r0.A08(colorStateList);
        r0.A03();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        AnonymousClass0WJ r0 = this.A04;
        r0.A09(mode);
        r0.A03();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        AnonymousClass0OE r0;
        if (Build.VERSION.SDK_INT >= 28 || (r0 = this.A03) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r0.A01(textClassifier);
        }
    }

    public void setTextFuture(Future future) {
        this.A00 = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r3 != r2) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMetricsParamsCompat(X.AnonymousClass0UL r6) {
        /*
            r5 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            android.text.TextDirectionHeuristic r3 = r6.A03
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r3 == r2) goto L_0x0054
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r3 == r1) goto L_0x0054
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r3 != r0) goto L_0x003b
            r0 = 2
        L_0x0011:
            X.AnonymousClass0X3.A03(r5, r0)
            r0 = 23
            if (r4 >= r0) goto L_0x0056
            android.text.TextPaint r1 = r6.A04
            float r2 = r1.getTextScaleX()
            android.text.TextPaint r0 = r5.getPaint()
            r0.set(r1)
            float r0 = r5.getTextScaleX()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r5.setTextScaleX(r1)
        L_0x0037:
            r5.setTextScaleX(r2)
            return
        L_0x003b:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            if (r3 != r0) goto L_0x0041
            r0 = 3
            goto L_0x0011
        L_0x0041:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
            if (r3 != r0) goto L_0x0047
            r0 = 4
            goto L_0x0011
        L_0x0047:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LOCALE
            if (r3 != r0) goto L_0x004d
            r0 = 5
            goto L_0x0011
        L_0x004d:
            if (r3 != r1) goto L_0x0051
            r0 = 6
            goto L_0x0011
        L_0x0051:
            r0 = 7
            if (r3 == r2) goto L_0x0011
        L_0x0054:
            r0 = 1
            goto L_0x0011
        L_0x0056:
            android.text.TextPaint r1 = r5.getPaint()
            android.text.TextPaint r0 = r6.A04
            r1.set(r0)
            int r0 = r6.A00()
            X.C06370Xj.A04(r5, r0)
            int r0 = r6.A01()
            X.C06370Xj.A05(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03n.setTextMetricsParamsCompat(X.0UL):void");
    }

    public void setTextSize(int i, float f) {
        if (C17170ug.A00) {
            super.setTextSize(i, f);
            return;
        }
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            AnonymousClass0XX r1 = r0.A0C;
            if (!(!(r1.A09 instanceof AnonymousClass03A)) || r1.A03 == 0) {
                r1.A06(i, f);
            }
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (!this.A01) {
            if (typeface == null || i <= 0) {
                typeface2 = null;
            } else if (getContext() != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw AnonymousClass001.A0c("Context cannot be null");
            }
            this.A01 = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.A01 = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass03n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        this.A01 = false;
        AnonymousClass0XB.A04(this);
        C04780Qq r0 = new C04780Qq(this);
        this.A02 = r0;
        r0.A07(attributeSet, i);
        AnonymousClass0WJ r02 = new AnonymousClass0WJ(this);
        this.A04 = r02;
        r02.A0B(attributeSet, i);
        r02.A03();
        this.A03 = new AnonymousClass0OE(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C04780Qq r0 = this.A02;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0WJ r02 = this.A04;
        if (r02 != null) {
            r02.A03();
        }
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public AnonymousClass0UL getTextMetricsParamsCompat() {
        return A00(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0WJ.A02(editorInfo, onCreateInputConnection, this);
        C02540Gq.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass0WJ r1 = this.A04;
        if (r1 != null && !C17170ug.A00) {
            r1.A0C.A04();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AnonymousClass0WJ r1 = this.A04;
        if (r1 != null && !C17170ug.A00) {
            AnonymousClass0XX r12 = r1.A0C;
            if ((!(r12.A09 instanceof AnonymousClass03A)) && r12.A03 != 0) {
                r12.A04();
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C04780Qq r0 = this.A02;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C04780Qq r0 = this.A02;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass0XW.A01(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass0XW.A01(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass0XW.A01(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass0XW.A01(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = AnonymousClass0XW.A01(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = AnonymousClass0XW.A01(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = AnonymousClass0XW.A01(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = AnonymousClass0XW.A01(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass0Y9.A00(callback, this));
    }

    public void setLineHeight(int i) {
        C04890Rb.A00(i);
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    public void setPrecomputedText(AnonymousClass0Zq r2) {
        A01(this);
        throw AnonymousClass000.A0L();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A06(context, i);
        }
    }

    public AnonymousClass03n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AnonymousClass0WJ r0 = this.A04;
        if (r0 != null) {
            r0.A03();
        }
    }
}
