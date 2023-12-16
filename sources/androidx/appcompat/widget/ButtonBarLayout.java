package androidx.appcompat.widget;

import X.AnonymousClass0KC;
import X.C06560Yg;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class ButtonBarLayout extends LinearLayout {
    public int A00 = -1;
    public boolean A01;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = AnonymousClass0KC.A0A;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C06560Yg.A0B(context, obtainStyledAttributes, attributeSet, this, iArr, 0);
        this.A01 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    public void setAllowStacking(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        int i = 80;
        if (z) {
            i = 8388613;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c3, code lost:
        if (r4 != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r4 = android.view.View.MeasureSpec.getSize(r6)
            boolean r0 = r5.A01
            r3 = 0
            if (r0 == 0) goto L_0x0019
            int r0 = r5.A00
            if (r4 <= r0) goto L_0x0017
            int r1 = r5.getOrientation()
            r0 = 1
            if (r1 != r0) goto L_0x0017
            r5.setStacked(r3)
        L_0x0017:
            r5.A00 = r4
        L_0x0019:
            int r0 = r5.getOrientation()
            boolean r0 = X.AnonymousClass001.A1T(r0)
            r2 = 1
            if (r0 != 0) goto L_0x00c6
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00c6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            r4 = 1
        L_0x0033:
            super.onMeasure(r0, r7)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x00c3
            int r0 = r5.getOrientation()
            if (r0 == r2) goto L_0x00c3
            int r1 = r5.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto L_0x00c3
            r5.setStacked(r2)
        L_0x004e:
            super.onMeasure(r6, r7)
        L_0x0051:
            r4 = 0
            int r1 = r5.getChildCount()
        L_0x0056:
            if (r4 >= r1) goto L_0x00ad
            android.view.View r0 = r5.getChildAt(r4)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00c0
            if (r4 < 0) goto L_0x00ad
            android.view.View r0 = r5.getChildAt(r4)
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass001.A0U(r0)
            int r3 = r5.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            int r0 = r1.topMargin
            int r3 = r3 + r0
            int r0 = r1.bottomMargin
            int r3 = r3 + r0
            int r0 = r5.getOrientation()
            if (r0 != r2) goto L_0x00ba
            int r2 = r4 + 1
            int r1 = r5.getChildCount()
        L_0x0087:
            if (r2 >= r1) goto L_0x00ad
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b7
            if (r2 < 0) goto L_0x00ad
            android.view.View r0 = r5.getChildAt(r2)
            int r2 = r0.getPaddingTop()
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 + r0
            int r3 = r3 + r2
        L_0x00ad:
            int r0 = X.AnonymousClass0YY.A01(r5)
            if (r0 == r3) goto L_0x00b6
            r5.setMinimumHeight(r3)
        L_0x00b6:
            return
        L_0x00b7:
            int r2 = r2 + 1
            goto L_0x0087
        L_0x00ba:
            int r0 = r5.getPaddingBottom()
            int r3 = r3 + r0
            goto L_0x00ad
        L_0x00c0:
            int r4 = r4 + 1
            goto L_0x0056
        L_0x00c3:
            if (r4 == 0) goto L_0x0051
            goto L_0x004e
        L_0x00c6:
            r0 = r6
            r4 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
