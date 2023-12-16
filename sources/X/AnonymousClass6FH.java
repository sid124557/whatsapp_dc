package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.6FH  reason: invalid class name */
public class AnonymousClass6FH extends FrameLayout {
    public static final View.OnTouchListener A0B = new C154417d8(0);
    public int A00;
    public ColorStateList A01;
    public PorterDuff.Mode A02;
    public Rect A03;
    public C161877ql A04;
    public C159097l7 A05;
    public boolean A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.6D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6FH(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r4 = 0
            android.content.Context r0 = X.C105515Vh.A00(r6, r7, r4, r4)
            r5.<init>(r0, r7)
            android.content.Context r2 = r5.getContext()
            int[] r0 = X.C1463179t.A0b
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r7, r0)
            r1 = 6
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x0021
            int r0 = r3.getDimensionPixelSize(r1, r4)
            float r0 = (float) r0
            X.AnonymousClass0YZ.A0B(r5, r0)
        L_0x0021:
            r0 = 2
            int r0 = r3.getInt(r0, r4)
            r5.A00 = r0
            r0 = 8
            boolean r0 = r3.hasValue(r0)
            if (r0 != 0) goto L_0x0038
            r0 = 9
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0043
        L_0x0038:
            X.7jd r1 = X.C161877ql.A01(r2, r7, r4, r4)
            X.7ql r0 = new X.7ql
            r0.<init>(r1)
            r5.A04 = r0
        L_0x0043:
            r0 = 3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.getFloat(r0, r4)
            r5.A08 = r0
            r0 = 4
            android.content.res.ColorStateList r0 = X.C160917of.A00(r2, r3, r0)
            r5.setBackgroundTintList(r0)
            r0 = 5
            r2 = -1
            int r1 = r3.getInt(r0, r2)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = X.C159337lf.A01(r0, r1)
            r5.setBackgroundTintMode(r0)
            r0 = 1
            float r0 = r3.getFloat(r0, r4)
            r5.A07 = r0
            r0 = 0
            int r0 = r3.getDimensionPixelSize(r0, r2)
            r5.A0A = r0
            r0 = 7
            int r0 = r3.getDimensionPixelSize(r0, r2)
            r5.A09 = r0
            r3.recycle()
            android.view.View$OnTouchListener r0 = A0B
            r5.setOnTouchListener(r0)
            r0 = 1
            r5.setFocusable(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x00be
            float r2 = r5.A08
            r1 = 2130969032(0x7f0401c8, float:1.7546734E38)
            r0 = 2130969012(0x7f0401b4, float:1.7546694E38)
            int r1 = X.AnonymousClass5ZV.A02(r5, r1)
            int r0 = X.AnonymousClass5ZV.A02(r5, r0)
            int r3 = X.AnonymousClass5ZV.A00(r2, r1, r0)
            X.7ql r0 = r5.A04
            if (r0 == 0) goto L_0x00bf
            X.6D7 r2 = new X.6D7
            r2.<init>((X.C161877ql) r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r3)
            r2.A06(r0)
        L_0x00ae:
            android.content.res.ColorStateList r0 = r5.A01
            android.graphics.drawable.Drawable r1 = X.C06130Wj.A01(r2)
            if (r0 == 0) goto L_0x00bb
            android.content.res.ColorStateList r0 = r5.A01
            X.AnonymousClass0YG.A01(r0, r1)
        L_0x00bb:
            X.AnonymousClass0YY.A04(r1, r5)
        L_0x00be:
            return
        L_0x00bf:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131167517(0x7f07091d, float:1.794931E38)
            float r1 = r1.getDimension(r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r0 = 0
            r2.setShape(r0)
            r2.setCornerRadius(r1)
            r2.setColor(r3)
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6FH.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setBaseTransientBottomBar(C159097l7 r1) {
        this.A05 = r1;
    }

    public float getActionTextColorAlpha() {
        return this.A07;
    }

    public int getAnimationMode() {
        return this.A00;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.A08;
    }

    public int getMaxInlineActionWidth() {
        return this.A09;
    }

    public int getMaxWidth() {
        return this.A0A;
    }

    public void setAnimationMode(int i) {
        this.A00 = i;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.A01 == null)) {
            drawable = C06130Wj.A01(drawable.mutate());
            AnonymousClass0YG.A01(this.A01, drawable);
            AnonymousClass0YG.A04(this.A02, drawable);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        if (getBackground() != null) {
            Drawable A012 = C06130Wj.A01(getBackground().mutate());
            AnonymousClass0YG.A01(colorStateList, A012);
            AnonymousClass0YG.A04(this.A02, A012);
            if (A012 != getBackground()) {
                super.setBackgroundDrawable(A012);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A02 = mode;
        if (getBackground() != null) {
            Drawable A012 = C06130Wj.A01(getBackground().mutate());
            AnonymousClass0YG.A04(mode, A012);
            if (A012 != getBackground()) {
                super.setBackgroundDrawable(A012);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = A0B;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C159097l7 r0 = this.A05;
        if (r0 != null) {
            r0.A03();
        }
        AnonymousClass0V0.A02(this);
    }

    public void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        C159097l7 r4 = this.A05;
        if (r4 != null) {
            C158937ko A002 = C158937ko.A00();
            C178918iJ r2 = r4.A07;
            synchronized (A002.A03) {
                if (!A002.A05(r2)) {
                    AnonymousClass7K0 r0 = A002.A01;
                    if (r0 == null || r2 == null || r0.A02.get() != r2) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                C172668Mf.A00(C159097l7.A0P, r4, 37);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C159097l7 r1 = this.A05;
        if (r1 != null && r1.A09) {
            r1.A06();
            r1.A09 = false;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A0A;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(C86664Kz.A05(i3), i2);
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.A06 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.A03 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            C159097l7 r0 = this.A05;
            if (r0 != null) {
                r0.A07();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }
}
