package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass0R4;
import X.AnonymousClass0YY;
import X.AnonymousClass4L0;
import X.AnonymousClass6FZ;
import X.AnonymousClass6GP;
import X.AnonymousClass80W;
import X.C06560Yg;
import X.C100905Cs;
import X.C109695f2;
import X.C124846Ec;
import X.C16870uA;
import X.C181598n1;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;

public class PagerSlidingTabStrip extends AnonymousClass6FZ {
    public static final int[] A0R;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public Paint A0H;
    public Paint A0I;
    public LinearLayout.LayoutParams A0J;
    public LinearLayout.LayoutParams A0K;
    public LinearLayout A0L;
    public C16870uA A0M;
    public ViewPager A0N;
    public Locale A0O;
    public boolean A0P;
    public final AnonymousClass80W A0Q;

    public final void A03() {
        for (int i = 0; i < this.A0A; i++) {
            View childAt = this.A0L.getChildAt(i);
            childAt.setBackgroundResource(this.A09);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, (float) this.A0D);
                textView.setTypeface((Typeface) null, this.A0E);
                textView.setTextColor(this.A0C);
                textView.setAllCaps(true);
            }
        }
    }

    public void A04(View view, int i) {
        LinearLayout.LayoutParams layoutParams;
        view.setFocusable(true);
        C109695f2.A00(view, this, i, 0);
        int i2 = this.A0B;
        view.setPadding(i2, 0, i2, 0);
        C06560Yg.A0O(view, new AnonymousClass6GP(this));
        LinearLayout linearLayout = this.A0L;
        if (this.A0P) {
            layoutParams = this.A0K;
        } else {
            layoutParams = this.A0J;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    public void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A0A != 0) {
            int height = getHeight();
            Paint paint = this.A0I;
            paint.setColor(this.A05);
            LinearLayout linearLayout = this.A0L;
            View childAt = linearLayout.getChildAt(this.A01);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.A00 > 0.0f && (i = this.A01) < this.A0A - 1) {
                View childAt2 = linearLayout.getChildAt(i + 1);
                float left2 = (float) childAt2.getLeft();
                float right2 = (float) childAt2.getRight();
                float f = this.A00;
                float f2 = 1.0f - f;
                left = (left2 * f) + (f2 * left);
                right = (right2 * f) + (f2 * right);
            }
            float f3 = (float) height;
            canvas2.drawRect(left, (float) (height - this.A06), right, f3, paint);
            paint.setColor(this.A0F);
            canvas2.drawRect(0.0f, (float) (height - this.A0G), AnonymousClass4L0.A00(linearLayout), f3, paint);
            Paint paint2 = this.A0H;
            paint2.setColor(this.A02);
            for (int i2 = 0; i2 < this.A0A - 1; i2++) {
                View childAt3 = linearLayout.getChildAt(i2);
                int i3 = this.A03;
                canvas2.drawLine((float) childAt3.getRight(), (float) i3, (float) childAt3.getRight(), (float) (height - i3), paint2);
            }
        }
    }

    public static /* synthetic */ void A00(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        if (pagerSlidingTabStrip.A0A != 0) {
            int left = pagerSlidingTabStrip.A0L.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= pagerSlidingTabStrip.A08;
            }
            if (left != pagerSlidingTabStrip.A07) {
                pagerSlidingTabStrip.A07 = left;
                pagerSlidingTabStrip.scrollTo(left, 0);
            }
        }
    }

    public LinearLayout A02(Context context) {
        return new LinearLayout(context);
    }

    public int getTextColor() {
        return this.A0C;
    }

    public int getTextSize() {
        return this.A0D;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C124846Ec r2 = (C124846Ec) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A01 = r2.A00;
        requestLayout();
    }

    public void setShouldExpand(boolean z) {
        this.A0P = z;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.A0C = i;
        A03();
    }

    public void setTextSize(int i) {
        this.A0D = i;
        A03();
    }

    public void setUnderlineColor(int i) {
        this.A0F = i;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.A0N = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.A0W = this.A0Q;
            this.A0L.removeAllViews();
            this.A0A = this.A0N.getAdapter().A0C();
            for (int i = 0; i < this.A0A; i++) {
                AnonymousClass0R4 adapter = this.A0N.getAdapter();
                if (adapter instanceof C181598n1) {
                    A04(((C181598n1) adapter).BAT(i), i);
                } else {
                    String charSequence = adapter.A04(i).toString();
                    TextView textView = new TextView(getContext());
                    textView.setText(charSequence);
                    textView.setGravity(17);
                    textView.setSingleLine();
                    A04(textView, i);
                }
            }
            A03();
            C86614Ku.A1J(getViewTreeObserver(), this, 1);
            return;
        }
        throw AnonymousClass001.A0e("ViewPager does not have adapter instance.");
    }

    static {
        int[] A1Z = C86664Kz.A1Z();
        // fill-array-data instruction
        A1Z[0] = 16842901;
        A1Z[1] = 16842904;
        A0R = A1Z;
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0Q = new AnonymousClass80W(this);
        this.A01 = 0;
        this.A00 = 0.0f;
        this.A05 = -10066330;
        this.A0F = 436207616;
        this.A02 = 436207616;
        this.A0P = true;
        this.A08 = 52;
        this.A06 = 3;
        this.A0G = 1;
        this.A03 = 12;
        this.A0B = 8;
        this.A04 = 1;
        this.A0D = 12;
        this.A0C = -10066330;
        this.A0E = 1;
        this.A07 = 0;
        this.A09 = R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout A022 = A02(context);
        this.A0L = A022;
        A022.setOrientation(0);
        C86624Kv.A0x(this.A0L, -1);
        addView(this.A0L);
        AnonymousClass0YY.A06(this.A0L, 2);
        DisplayMetrics A0E2 = C86614Ku.A0E(this);
        this.A08 = (int) TypedValue.applyDimension(1, (float) this.A08, A0E2);
        this.A06 = (int) TypedValue.applyDimension(1, (float) this.A06, A0E2);
        this.A0G = (int) TypedValue.applyDimension(1, (float) this.A0G, A0E2);
        this.A03 = (int) TypedValue.applyDimension(1, (float) this.A03, A0E2);
        this.A0B = (int) TypedValue.applyDimension(1, (float) this.A0B, A0E2);
        this.A04 = (int) TypedValue.applyDimension(1, (float) this.A04, A0E2);
        this.A0D = (int) TypedValue.applyDimension(2, (float) this.A0D, A0E2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R);
        this.A0D = obtainStyledAttributes.getDimensionPixelSize(0, this.A0D);
        this.A0C = obtainStyledAttributes.getColor(1, this.A0C);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C100905Cs.A0E);
        this.A05 = obtainStyledAttributes2.getColor(1, this.A05);
        this.A02 = obtainStyledAttributes2.getColor(0, this.A02);
        this.A0B = obtainStyledAttributes2.getDimensionPixelSize(2, this.A0B);
        obtainStyledAttributes2.recycle();
        Paint A0Z = C86664Kz.A0Z();
        this.A0I = A0Z;
        A0Z.setAntiAlias(true);
        AnonymousClass001.A10(this.A0I);
        Paint A0Z2 = C86664Kz.A0Z();
        this.A0H = A0Z2;
        A0Z2.setAntiAlias(true);
        this.A0H.setStrokeWidth((float) this.A04);
        this.A0J = new LinearLayout.LayoutParams(-2, -1);
        this.A0K = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.A0O == null) {
            this.A0O = C86634Kw.A0E(this).locale;
        }
    }

    public Parcelable onSaveInstanceState() {
        C124846Ec r1 = new C124846Ec(super.onSaveInstanceState());
        r1.A00 = this.A01;
        return r1;
    }

    public void setOnPageChangeListener(C16870uA r1) {
        this.A0M = r1;
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }
}
