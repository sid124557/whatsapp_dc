package com.google.android.material.timepicker;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0KO;
import X.AnonymousClass0VX;
import X.AnonymousClass0WH;
import X.AnonymousClass6CA;
import X.AnonymousClass91Y;
import X.C05650Ui;
import X.C06560Yg;
import X.C1463179t;
import X.C160917of;
import X.C178928iK;
import X.C18280x3;
import X.C188778zT;
import X.C86664Kz;
import X.C87454Ss;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Arrays;

public class ClockFaceView extends C87454Ss implements C178928iK {
    public float A00;
    public String[] A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final ColorStateList A06;
    public final Rect A07;
    public final Rect A08;
    public final RectF A09;
    public final SparseArray A0A;
    public final AnonymousClass0WH A0B;
    public final ClockHandView A0C;
    public final float[] A0D;
    public final int[] A0E;

    public final void A06() {
        SparseArray sparseArray;
        RadialGradient radialGradient;
        RectF rectF = this.A0C.A0C;
        float f = Float.MAX_VALUE;
        View view = null;
        int i = 0;
        while (true) {
            sparseArray = this.A0A;
            if (i >= sparseArray.size()) {
                break;
            }
            View view2 = (View) sparseArray.get(i);
            if (view2 != null) {
                Rect rect = this.A08;
                view2.getHitRect(rect);
                RectF rectF2 = this.A09;
                rectF2.set(rect);
                rectF2.union(rectF);
                float width = rectF2.width() * rectF2.height();
                if (width < f) {
                    view = view2;
                    f = width;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (textView != null) {
                textView.setSelected(AnonymousClass000.A1Y(textView, view));
                Rect rect2 = this.A08;
                textView.getHitRect(rect2);
                RectF rectF3 = this.A09;
                rectF3.set(rect2);
                Rect rect3 = this.A07;
                textView.getLineBounds(0, rect3);
                rectF3.inset((float) rect3.left, (float) rect3.top);
                if (!RectF.intersects(rectF, rectF3)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF3.left, rectF.centerY() - rectF3.top, rectF.width() * 0.5f, this.A0E, this.A0D, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }

    public void setRadius(int i) {
        if (i != this.A00) {
            super.setRadius(i);
            ClockHandView clockHandView = this.A0C;
            clockHandView.A02 = this.A00;
            clockHandView.invalidate();
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = AnonymousClass001.A0N();
        this.A09 = AnonymousClass002.A07();
        this.A07 = AnonymousClass001.A0N();
        this.A0A = AnonymousClass6CA.A0I();
        this.A0D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A07, i, R.style.f12nameremoved);
        Resources resources = getResources();
        ColorStateList A002 = C160917of.A00(context, obtainStyledAttributes, 1);
        this.A06 = A002;
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.A0C = clockHandView;
        this.A02 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        int colorForState = A002.getColorForState(new int[]{16842913}, A002.getDefaultColor());
        this.A0E = new int[]{colorForState, colorForState, A002.getDefaultColor()};
        clockHandView.A0D.add(this);
        int defaultColor = AnonymousClass0VX.A00(context, R.color.f5nameremoved).getDefaultColor();
        ColorStateList A003 = C160917of.A00(context, obtainStyledAttributes, 0);
        setBackgroundColor(A003 != null ? A003.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new AnonymousClass91Y(this, 0));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.A0B = new C188778zT(this, 11);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.A01 = strArr;
        LayoutInflater A0D2 = C18280x3.A0D(this);
        SparseArray sparseArray = this.A0A;
        int size = sparseArray.size();
        int i2 = 0;
        boolean z = false;
        while (true) {
            int length = this.A01.length;
            if (i2 >= Math.max(length, size)) {
                break;
            }
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) A0D2.inflate(R.layout.f8nameremoved, this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.A01[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                C06560Yg.A0O(textView, this.A0B);
                textView.setTextColor(this.A06);
            }
            i2++;
        }
        ClockHandView clockHandView2 = this.A0C;
        if (clockHandView2.A05 && !z) {
            clockHandView2.A03 = 1;
        }
        clockHandView2.A05 = z;
        clockHandView2.invalidate();
        this.A04 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A05 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A03 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public void A05() {
        super.A05();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A0A;
            if (i < sparseArray.size()) {
                ((View) sparseArray.get(i)).setVisibility(0);
                i++;
            } else {
                return;
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C05650Ui(accessibilityNodeInfo).A0F(new AnonymousClass0KO(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A01.length, false, 1)));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A06();
    }

    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.A03) / Math.max(Math.max(((float) this.A04) / ((float) displayMetrics.heightPixels), ((float) this.A05) / ((float) displayMetrics.widthPixels)), 1.0f));
        int A052 = C86664Kz.A05(max);
        setMeasuredDimension(max, max);
        super.onMeasure(A052, A052);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public ClockFaceView(Context context) {
        this(context, (AttributeSet) null);
    }
}
