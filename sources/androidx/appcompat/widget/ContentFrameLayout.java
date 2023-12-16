package androidx.appcompat.widget;

import X.AnonymousClass001;
import X.AnonymousClass040;
import X.C04830Qv;
import X.C07570bF;
import X.C07890cz;
import X.C14510po;
import X.C16930uG;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    public TypedValue A00;
    public TypedValue A01;
    public TypedValue A02;
    public TypedValue A03;
    public TypedValue A04;
    public TypedValue A05;
    public C14510po A06;
    public final Rect A07;

    public TypedValue getFixedHeightMajor() {
        TypedValue typedValue = this.A00;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A00 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedHeightMinor() {
        TypedValue typedValue = this.A01;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A01 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMajor() {
        TypedValue typedValue = this.A02;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A02 = typedValue2;
        return typedValue2;
    }

    public TypedValue getFixedWidthMinor() {
        TypedValue typedValue = this.A03;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A03 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMajor() {
        TypedValue typedValue = this.A04;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A04 = typedValue2;
        return typedValue2;
    }

    public TypedValue getMinWidthMinor() {
        TypedValue typedValue = this.A05;
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        this.A05 = typedValue2;
        return typedValue2;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = AnonymousClass001.A0N();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C14510po r0 = this.A06;
        if (r0 != null) {
            AnonymousClass040 r2 = ((C07570bF) r0).A00;
            C16930uG r02 = r2.A0L;
            if (r02 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) r02;
                actionBarOverlayLayout.A01();
                actionBarOverlayLayout.A0A.B1r();
            }
            if (r2.A09 != null) {
                r2.A08.getDecorView().removeCallbacks(r2.A0O);
                if (r2.A09.isShowing()) {
                    try {
                        r2.A09.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                r2.A09 = null;
            }
            C04830Qv r03 = r2.A0M;
            if (r03 != null) {
                r03.A01();
            }
            C07890cz r04 = r2.A0M(0).A0A;
            if (r04 != null) {
                r04.close();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.getContext()
            android.util.DisplayMetrics r6 = X.AnonymousClass000.A0B(r0)
            int r1 = r6.widthPixels
            int r0 = r6.heightPixels
            boolean r10 = X.AnonymousClass001.A1Y(r1, r0)
            int r7 = android.view.View.MeasureSpec.getMode(r12)
            int r4 = android.view.View.MeasureSpec.getMode(r13)
            r5 = 6
            r2 = 5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L_0x00cf
            if (r10 == 0) goto L_0x00cb
            android.util.TypedValue r8 = r11.A03
        L_0x0024:
            if (r8 == 0) goto L_0x00cf
            int r0 = r8.type
            if (r0 == 0) goto L_0x00cf
            if (r0 != r2) goto L_0x00c0
            float r0 = r8.getDimension(r6)
        L_0x0030:
            int r9 = (int) r0
            if (r9 <= 0) goto L_0x00cf
            android.graphics.Rect r0 = r11.A07
            int r8 = r0.left
            int r0 = r0.right
            int r8 = r8 + r0
            int r9 = r9 - r8
            int r0 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = java.lang.Math.min(r9, r0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r9 = 1
        L_0x0048:
            if (r4 != r1) goto L_0x0071
            if (r10 == 0) goto L_0x00bd
            android.util.TypedValue r4 = r11.A00
        L_0x004e:
            if (r4 == 0) goto L_0x0071
            int r0 = r4.type
            if (r0 == 0) goto L_0x0071
            if (r0 != r2) goto L_0x00b3
            float r0 = r4.getDimension(r6)
        L_0x005a:
            int r8 = (int) r0
            if (r8 <= 0) goto L_0x0071
            android.graphics.Rect r0 = r11.A07
            int r4 = r0.top
            int r0 = r0.bottom
            int r4 = r4 + r0
            int r8 = r8 - r4
            int r0 = android.view.View.MeasureSpec.getSize(r13)
            int r0 = java.lang.Math.min(r8, r0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L_0x0071:
            super.onMeasure(r12, r13)
            int r4 = r11.getMeasuredWidth()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            if (r9 != 0) goto L_0x00a3
            if (r7 != r1) goto L_0x00a3
            if (r10 == 0) goto L_0x00b0
            android.util.TypedValue r1 = r11.A05
        L_0x0083:
            if (r1 == 0) goto L_0x00a3
            int r0 = r1.type
            if (r0 == 0) goto L_0x00a3
            if (r0 != r2) goto L_0x00a4
            float r0 = r1.getDimension(r6)
        L_0x008f:
            int r2 = (int) r0
            if (r2 <= 0) goto L_0x009a
            android.graphics.Rect r0 = r11.A07
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r2 = r2 - r1
        L_0x009a:
            if (r4 >= r2) goto L_0x00a3
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            super.onMeasure(r0, r13)
        L_0x00a3:
            return
        L_0x00a4:
            if (r0 != r5) goto L_0x00ae
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r1.getFraction(r0, r0)
            goto L_0x008f
        L_0x00ae:
            r2 = 0
            goto L_0x009a
        L_0x00b0:
            android.util.TypedValue r1 = r11.A04
            goto L_0x0083
        L_0x00b3:
            if (r0 != r5) goto L_0x0071
            int r0 = r6.heightPixels
            float r0 = (float) r0
            float r0 = r4.getFraction(r0, r0)
            goto L_0x005a
        L_0x00bd:
            android.util.TypedValue r4 = r11.A01
            goto L_0x004e
        L_0x00c0:
            if (r0 != r5) goto L_0x00cf
            int r0 = r6.widthPixels
            float r0 = (float) r0
            float r0 = r8.getFraction(r0, r0)
            goto L_0x0030
        L_0x00cb:
            android.util.TypedValue r8 = r11.A02
            goto L_0x0024
        L_0x00cf:
            r9 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(C14510po r1) {
        this.A06 = r1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
