package androidx.core.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02T;
import X.AnonymousClass061;
import X.AnonymousClass0II;
import X.AnonymousClass0IK;
import X.AnonymousClass0L7;
import X.AnonymousClass0V2;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.AnonymousClass35S;
import X.C04680Qf;
import X.C06560Yg;
import X.C14990qb;
import X.C15870s6;
import X.C17240vC;
import X.C17260vE;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.whatsapp.R;

public class NestedScrollView extends FrameLayout implements C17260vE, C17240vC, C14990qb {
    public static final float A0R = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final AnonymousClass061 A0S = new AnonymousClass061();
    public static final int[] A0T = {16843130};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public VelocityTracker A09;
    public View A0A;
    public EdgeEffect A0B;
    public EdgeEffect A0C;
    public OverScroller A0D;
    public C15870s6 A0E;
    public AnonymousClass02T A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final float A0L;
    public final Rect A0M;
    public final C04680Qf A0N;
    public final AnonymousClass0L7 A0O;
    public final int[] A0P;
    public final int[] A0Q;

    public static boolean A02(View view, View view2) {
        if (view != view2) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A02((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    public final void A06(int i) {
        A07(-getScrollX(), i - getScrollY(), false);
    }

    public final boolean A0F(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float A002 = A00(edgeEffect) * ((float) getHeight());
        float f = this.A0L * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) A0R;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * log))) < A002;
    }

    public void BWu(View view, int[] iArr, int i, int i2, int i3) {
        this.A0N.A06(iArr, (int[]) null, i, i2, i3);
    }

    public void BWv(View view, int i, int i2, int i3, int i4, int i5) {
        A08(i4, (int[]) null, i5);
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0N.A06(iArr, iArr2, i, i2, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        BWu(view, iArr, i, i2, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A08(i4, (int[]) null, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        BWx(view, view2, i, 0);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = instance.findNextFocus(this, (View) null, i);
        } else {
            findNextFocusFromRect = instance.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (!A0E(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    public void onStopNestedScroll(View view) {
        Bcp(view, 0);
    }

    public void requestLayout() {
        this.A0J = true;
        super.requestLayout();
    }

    public boolean startNestedScroll(int i) {
        return this.A0N.A05(i, 0);
    }

    public void stopNestedScroll() {
        this.A0N.A02(0);
    }

    public static float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AnonymousClass0V2.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AnonymousClass0V2.A01(edgeEffect, f, f2);
        }
        AnonymousClass0II.A00(edgeEffect, f, f2);
        return f;
    }

    private float getVerticalScrollFactorCompat() {
        float f = this.A00;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            float dimension = typedValue.getDimension(AnonymousClass000.A0B(context));
            this.A00 = dimension;
            return dimension;
        }
        throw AnonymousClass001.A0e("Expected theme to define listPreferredItemHeight.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r32 != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(int r29, int r30, int r31, boolean r32) {
        /*
            r28 = this;
            r10 = r29
            r8 = 1
            r7 = r28
            r9 = r31
            if (r9 != r8) goto L_0x000f
            r1 = 2
            X.0Qf r0 = r7.A0N
            r0.A05(r1, r8)
        L_0x000f:
            r25 = 0
            int[] r6 = r7.A0P
            int[] r5 = r7.A0Q
            X.0Qf r4 = r7.A0N
            r22 = r4
            r23 = r6
            r24 = r5
            r26 = r10
            r27 = r9
            boolean r0 = r22.A06(r23, r24, r25, r26, r27)
            r3 = 0
            if (r0 == 0) goto L_0x002e
            r0 = r6[r8]
            int r10 = r29 - r0
            r25 = r5[r8]
        L_0x002e:
            int r2 = r7.getScrollY()
            int r1 = r7.getScrollRange()
            int r0 = r7.getOverScrollMode()
            if (r0 == 0) goto L_0x0044
            if (r0 != r8) goto L_0x0048
            int r0 = r7.getScrollRange()
            if (r0 <= 0) goto L_0x0048
        L_0x0044:
            r16 = 1
            if (r32 == 0) goto L_0x004a
        L_0x0048:
            r16 = 0
        L_0x004a:
            r15 = 0
            r13 = 0
            r7.getOverScrollMode()
            r7.computeHorizontalScrollRange()
            r7.computeHorizontalScrollExtent()
            r7.computeVerticalScrollRange()
            r7.computeVerticalScrollExtent()
            r12 = 0
            int r11 = r2 + r10
            int r0 = -r3
            if (r3 >= r0) goto L_0x0063
            r13 = r0
            r12 = 1
        L_0x0063:
            if (r11 <= r1) goto L_0x011c
            r11 = r1
        L_0x0066:
            r0 = 1
            android.view.ViewParent r14 = r4.A00
            if (r14 != 0) goto L_0x0080
            android.widget.OverScroller r14 = r7.A0D
            int r23 = r7.getScrollRange()
            r21 = r3
            r22 = r3
            r18 = r13
            r19 = r11
            r20 = r3
            r17 = r14
            r17.springBack(r18, r19, r20, r21, r22, r23)
        L_0x0080:
            r7.onOverScrolled(r13, r11, r12, r0)
            if (r12 != 0) goto L_0x0087
            if (r0 == 0) goto L_0x008e
        L_0x0087:
            if (r31 == 0) goto L_0x0118
            android.view.ViewParent r0 = r4.A00
        L_0x008b:
            if (r0 != 0) goto L_0x008e
            r15 = 1
        L_0x008e:
            int r21 = r7.getScrollY()
            int r21 = r21 - r2
            int r23 = r10 - r21
            r6[r8] = r3
            r20 = r3
            r24 = r9
            r22 = r3
            r19 = r6
            r18 = r5
            r17 = r4
            r17.A07(r18, r19, r20, r21, r22, r23, r24)
            r0 = r5[r8]
            int r25 = r25 + r0
            r0 = r6[r8]
            int r10 = r10 - r0
            int r2 = r2 + r10
            r5 = r30
            if (r2 >= 0) goto L_0x00fd
            if (r16 == 0) goto L_0x00d2
            android.widget.EdgeEffect r2 = r7.A0C
            int r0 = -r10
            float r1 = (float) r0
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = (float) r5
            float r0 = X.AnonymousClass001.A04(r7, r0)
            A01(r2, r1, r0)
            android.widget.EdgeEffect r1 = r7.A0B
        L_0x00c9:
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00d2
            r1.onRelease()
        L_0x00d2:
            android.widget.EdgeEffect r1 = r7.A0C
            boolean r0 = r1.isFinished()
            if (r0 == 0) goto L_0x00ec
            android.widget.EdgeEffect r0 = r7.A0B
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00ec
            if (r15 == 0) goto L_0x00ef
            if (r31 != 0) goto L_0x00ef
            android.view.VelocityTracker r0 = r7.A09
            r0.clear()
        L_0x00eb:
            return r25
        L_0x00ec:
            X.AnonymousClass0YY.A05(r7)
        L_0x00ef:
            if (r9 != r8) goto L_0x00eb
            r4.A02(r8)
            r1.onRelease()
            android.widget.EdgeEffect r0 = r7.A0B
            r0.onRelease()
            return r25
        L_0x00fd:
            if (r2 <= r1) goto L_0x00d2
            if (r16 == 0) goto L_0x00d2
            android.widget.EdgeEffect r3 = r7.A0B
            float r2 = (float) r10
            int r0 = r7.getHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            float r0 = (float) r5
            float r1 = X.AnonymousClass001.A04(r7, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            A01(r3, r2, r0)
            android.widget.EdgeEffect r1 = r7.A0C
            goto L_0x00c9
        L_0x0118:
            android.view.ViewParent r0 = r4.A01
            goto L_0x008b
        L_0x011c:
            if (r11 >= r0) goto L_0x0121
            r11 = r0
            goto L_0x0066
        L_0x0121:
            r0 = 0
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A03(int, int, int, boolean):int");
    }

    public final void A07(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.A08 > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int A052 = AnonymousClass000.A05(this, getHeight());
                int scrollY = getScrollY();
                OverScroller overScroller = this.A0D;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, AnonymousClass001.A0D(i2 + scrollY, AnonymousClass001.A0C(height, A052, 0), 0) - scrollY, 250);
                if (z) {
                    this.A0N.A05(2, 1);
                } else {
                    this.A0N.A02(1);
                }
                this.A03 = getScrollY();
                AnonymousClass0YY.A05(this);
            } else {
                OverScroller overScroller2 = this.A0D;
                if (!overScroller2.isFinished()) {
                    overScroller2.abortAnimation();
                    this.A0N.A02(1);
                }
                scrollBy(i, i2);
            }
            this.A08 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r2 >= r0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(int r19, int r20, int r21) {
        /*
            r18 = this;
            r13 = r20
            r11 = r18
            int r10 = r11.getHeight()
            int r9 = r11.getScrollY()
            int r10 = r10 + r9
            r0 = 33
            r8 = 0
            r7 = 1
            r12 = r19
            boolean r17 = X.AnonymousClass000.A1U(r12, r0)
            r0 = 2
            java.util.ArrayList r6 = r11.getFocusables(r0)
            int r5 = r6.size()
            r4 = 0
            r3 = 0
            r16 = 0
        L_0x0024:
            r0 = r21
            if (r3 >= r5) goto L_0x0065
            android.view.View r15 = X.AnonymousClass001.A0S(r6, r3)
            int r14 = r15.getTop()
            int r2 = r15.getBottom()
            if (r13 >= r2) goto L_0x0043
            if (r14 >= r0) goto L_0x0043
            if (r13 >= r14) goto L_0x003d
            r1 = 1
            if (r2 < r0) goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r4 != 0) goto L_0x0046
            r4 = r15
            r16 = r1
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0046:
            if (r17 == 0) goto L_0x005d
            int r0 = r4.getTop()
            if (r14 < r0) goto L_0x0063
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r16 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0043
        L_0x0053:
            if (r0 == 0) goto L_0x0043
            r4 = r15
            goto L_0x0043
        L_0x0057:
            if (r1 == 0) goto L_0x0053
            r4 = r15
            r16 = 1
            goto L_0x0043
        L_0x005d:
            int r0 = r4.getBottom()
            if (r2 <= r0) goto L_0x004e
        L_0x0063:
            r0 = 1
            goto L_0x004f
        L_0x0065:
            if (r4 != 0) goto L_0x0068
            r4 = r11
        L_0x0068:
            if (r13 < r9) goto L_0x0076
            if (r0 > r10) goto L_0x0076
        L_0x006c:
            android.view.View r0 = r11.findFocus()
            if (r4 == r0) goto L_0x0075
            r4.requestFocus(r12)
        L_0x0075:
            return r8
        L_0x0076:
            int r13 = r20 - r9
            if (r17 != 0) goto L_0x007c
            int r13 = r21 - r10
        L_0x007c:
            r11.A03(r13, r8, r7, r7)
            r8 = 1
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0B(int, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        if (r0 < 0) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(android.view.KeyEvent r9) {
        /*
            r8 = this;
            android.graphics.Rect r3 = r8.A0M
            r3.setEmpty()
            int r0 = r8.getChildCount()
            r6 = 0
            if (r0 <= 0) goto L_0x002b
            android.view.View r0 = r8.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r1 = r0.getHeight()
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            int r1 = r1 + r0
            int r0 = r8.getHeight()
            int r0 = X.AnonymousClass000.A05(r8, r0)
            if (r1 <= r0) goto L_0x002b
            r6 = 1
        L_0x002b:
            r5 = 0
            r4 = 130(0x82, float:1.82E-43)
            if (r6 != 0) goto L_0x0058
            boolean r0 = r8.isFocused()
            if (r0 == 0) goto L_0x0057
            int r1 = r9.getKeyCode()
            r0 = 4
            if (r1 == r0) goto L_0x0057
            android.view.View r1 = r8.findFocus()
            if (r1 != r8) goto L_0x0044
            r1 = 0
        L_0x0044:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocus(r8, r1, r4)
            if (r0 == 0) goto L_0x0057
            if (r0 == r8) goto L_0x0057
            boolean r0 = r0.requestFocus(r4)
            if (r0 == 0) goto L_0x0057
            r5 = 1
        L_0x0057:
            return r5
        L_0x0058:
            int r0 = r9.getAction()
            if (r0 != 0) goto L_0x0057
            int r2 = r9.getKeyCode()
            r0 = 19
            r1 = 33
            if (r2 == r0) goto L_0x0100
            r0 = 20
            if (r2 == r0) goto L_0x00c1
            r0 = 62
            if (r2 != r0) goto L_0x0057
            boolean r0 = r9.isShiftPressed()
            if (r0 == 0) goto L_0x0078
            r4 = 33
        L_0x0078:
            r7 = 1
            r1 = 0
            r0 = 130(0x82, float:1.82E-43)
            boolean r6 = X.AnonymousClass000.A1U(r4, r0)
            int r2 = r8.getHeight()
            int r0 = r8.getScrollY()
            if (r6 == 0) goto L_0x00bb
            int r0 = r0 + r2
            r3.top = r0
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L_0x00b2
            int r0 = r0 - r7
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r1.getBottom()
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r0 = r8.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r3.top
            int r0 = r0 + r2
            if (r0 <= r1) goto L_0x00b2
            int r1 = r1 - r2
        L_0x00b0:
            r3.top = r1
        L_0x00b2:
            int r0 = r3.top
            int r2 = r2 + r0
            r3.bottom = r2
            r8.A0B(r4, r0, r2)
            return r5
        L_0x00bb:
            int r0 = r0 - r2
            r3.top = r0
            if (r0 >= 0) goto L_0x00b2
            goto L_0x00b0
        L_0x00c1:
            boolean r0 = r9.isAltPressed()
            if (r0 != 0) goto L_0x00cc
            boolean r5 = r8.A0A(r4)
            return r5
        L_0x00cc:
            r1 = 1
            int r2 = r8.getHeight()
            r3.top = r5
            r3.bottom = r2
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L_0x00f7
            int r0 = r0 - r1
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r1.getBottom()
            int r0 = r0.bottomMargin
            int r1 = r1 + r0
            int r0 = r8.getPaddingBottom()
            int r1 = r1 + r0
            r3.bottom = r1
            int r1 = r1 - r2
            r3.top = r1
        L_0x00f7:
            int r1 = r3.top
            int r0 = r3.bottom
            boolean r5 = r8.A0B(r4, r1, r0)
            return r5
        L_0x0100:
            boolean r0 = r9.isAltPressed()
            if (r0 != 0) goto L_0x010b
            boolean r5 = r8.A0A(r1)
            return r5
        L_0x010b:
            int r0 = r8.getHeight()
            r3.top = r5
            r3.bottom = r0
            boolean r5 = r8.A0B(r1, r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0C(android.view.KeyEvent):boolean");
    }

    public final boolean A0D(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A0C;
        if (A00(edgeEffect) != 0.0f) {
            A01(edgeEffect, 0.0f, AnonymousClass001.A04(this, motionEvent.getX()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A0B;
        if (A00(edgeEffect2) == 0.0f) {
            return z;
        }
        A01(edgeEffect2, 0.0f, 1.0f - AnonymousClass001.A04(this, motionEvent.getX()));
        return true;
    }

    public final boolean A0E(View view, int i, int i2) {
        Rect rect = this.A0M;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i < getScrollY() || rect.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    public void BWx(View view, View view2, int i, int i2) {
        AnonymousClass0L7 r1 = this.A0O;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A0N.A05(2, i2);
    }

    public boolean BcD(View view, View view2, int i, int i2) {
        return AnonymousClass000.A1S(i & 2);
    }

    public void Bcp(View view, int i) {
        AnonymousClass0L7 r2 = this.A0O;
        if (i == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        this.A0N.A02(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r22 = this;
            r2 = r22
            android.widget.OverScroller r3 = r2.A0D
            boolean r0 = r3.isFinished()
            if (r0 != 0) goto L_0x00de
            r3.computeScrollOffset()
            int r7 = r3.getCurrY()
            int r0 = r2.A03
            int r1 = r7 - r0
            int r4 = r2.getHeight()
            r8 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r9 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x00ec
            android.widget.EdgeEffect r6 = r2.A0C
            float r0 = A00(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            int r0 = -r1
            float r5 = (float) r0
            float r5 = r5 * r9
            float r0 = (float) r4
            float r5 = r5 / r0
            int r0 = -r4
            float r4 = (float) r0
            float r4 = r4 / r9
            float r0 = A01(r6, r5, r8)
        L_0x0036:
            int r0 = X.AnonymousClass001.A07(r4, r0)
            if (r0 == r1) goto L_0x003f
            r6.finish()
        L_0x003f:
            int r1 = r1 - r0
        L_0x0040:
            r2.A03 = r7
            int[] r13 = r2.A0P
            r4 = 1
            r14 = 0
            r13[r4] = r14
            r17 = 0
            X.0Qf r11 = r2.A0N
            r9 = 0
            r15 = r11
            r16 = r13
            r18 = r14
            r19 = r1
            r20 = r4
            r15.A06(r16, r17, r18, r19, r20)
            r0 = r13[r4]
            int r1 = r1 - r0
            int r6 = r2.getScrollRange()
            if (r1 == 0) goto L_0x00d5
            int r10 = r2.getScrollY()
            int r8 = r2.getScrollX()
            r2.getOverScrollMode()
            r2.computeHorizontalScrollRange()
            r2.computeHorizontalScrollExtent()
            r2.computeVerticalScrollRange()
            r2.computeVerticalScrollExtent()
            int r7 = r10 + r1
            int r0 = -r14
            if (r8 <= r14) goto L_0x00e8
            r8 = 0
        L_0x007f:
            r9 = 1
        L_0x0080:
            if (r7 <= r6) goto L_0x00e2
            r7 = r6
        L_0x0083:
            r5 = 1
            android.view.ViewParent r0 = r11.A00
            if (r0 != 0) goto L_0x0098
            int r21 = r2.getScrollRange()
            r19 = r14
            r20 = r14
            r17 = r7
            r16 = r8
            r15 = r3
            r15.springBack(r16, r17, r18, r19, r20, r21)
        L_0x0098:
            r2.onOverScrolled(r8, r7, r9, r5)
            int r15 = r2.getScrollY()
            int r15 = r15 - r10
            int r1 = r1 - r15
            r13[r4] = r14
            int[] r12 = r2.A0Q
            r16 = r14
            r18 = r4
            r17 = r1
            r11.A07(r12, r13, r14, r15, r16, r17, r18)
            r0 = r13[r4]
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x00d5
            int r0 = r2.getOverScrollMode()
            if (r0 == 0) goto L_0x00bd
            if (r0 != r4) goto L_0x00cf
            if (r6 <= 0) goto L_0x00cf
        L_0x00bd:
            if (r1 >= 0) goto L_0x00df
            android.widget.EdgeEffect r1 = r2.A0C
        L_0x00c1:
            boolean r0 = r1.isFinished()
            if (r0 == 0) goto L_0x00cf
            float r0 = r3.getCurrVelocity()
            int r0 = (int) r0
            r1.onAbsorb(r0)
        L_0x00cf:
            r3.abortAnimation()
            r11.A02(r4)
        L_0x00d5:
            boolean r0 = r3.isFinished()
            if (r0 != 0) goto L_0x0103
            X.AnonymousClass0YY.A05(r2)
        L_0x00de:
            return
        L_0x00df:
            android.widget.EdgeEffect r1 = r2.A0B
            goto L_0x00c1
        L_0x00e2:
            if (r7 >= r0) goto L_0x00e6
            r7 = r0
            goto L_0x0083
        L_0x00e6:
            r5 = 0
            goto L_0x0098
        L_0x00e8:
            if (r8 >= r0) goto L_0x0080
            r8 = r0
            goto L_0x007f
        L_0x00ec:
            if (r1 >= 0) goto L_0x0040
            android.widget.EdgeEffect r6 = r2.A0B
            float r0 = A00(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            float r0 = (float) r1
            float r0 = r0 * r9
            float r4 = (float) r4
            float r0 = r0 / r4
            float r4 = r4 / r9
            float r0 = A01(r6, r0, r8)
            goto L_0x0036
        L_0x0103:
            r11.A02(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0N.A04(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0N.A03(f, f2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0N.A07(iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public int getNestedScrollAxes() {
        AnonymousClass0L7 r0 = this.A0O;
        return r0.A01 | r0.A00;
    }

    public boolean hasNestedScrollingParent() {
        return AnonymousClass000.A1W(this.A0N.A01);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A0N.A02;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A05((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0N.A03(f, f2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass02T)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass02T r2 = (AnonymousClass02T) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0F = r2;
        requestLayout();
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return AnonymousClass000.A1S(i & 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0159, code lost:
        if (A0F(r1, r4) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0174, code lost:
        if (getChildCount() > 0) goto L_0x0176;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            android.view.VelocityTracker r0 = r12.A09
            if (r0 != 0) goto L_0x000a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.A09 = r0
        L_0x000a:
            int r1 = r13.getActionMasked()
            r4 = 0
            if (r1 != 0) goto L_0x0013
            r12.A06 = r4
        L_0x0013:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r13)
            int r0 = r12.A06
            float r0 = (float) r0
            r5 = 0
            r3.offsetLocation(r5, r0)
            r2 = 1
            if (r1 == 0) goto L_0x0191
            if (r1 == r2) goto L_0x00fc
            r0 = 2
            if (r1 == r0) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x016c
            r0 = 5
            if (r1 == r0) goto L_0x004a
            r0 = 6
            if (r1 != r0) goto L_0x003f
            r12.A09(r13)
            int r0 = r12.A01
            int r0 = r13.findPointerIndex(r0)
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            r12.A02 = r0
        L_0x003f:
            android.view.VelocityTracker r0 = r12.A09
            if (r0 == 0) goto L_0x0046
            r0.addMovement(r3)
        L_0x0046:
            r3.recycle()
            return r2
        L_0x004a:
            int r1 = r13.getActionIndex()
            float r0 = r13.getY(r1)
            int r0 = (int) r0
            r12.A02 = r0
            int r0 = r13.getPointerId(r1)
            r12.A01 = r0
            goto L_0x003f
        L_0x005c:
            int r0 = r12.A01
            int r8 = r13.findPointerIndex(r0)
            r0 = -1
            if (r8 != r0) goto L_0x007f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid pointerId="
            r1.append(r0)
            int r0 = r12.A01
            r1.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r1)
            goto L_0x003f
        L_0x007f:
            float r0 = r13.getY(r8)
            int r6 = (int) r0
            int r7 = r12.A02
            int r7 = r7 - r6
            float r0 = r13.getX(r8)
            float r10 = X.AnonymousClass001.A04(r12, r0)
            float r11 = (float) r7
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r11 = r11 / r0
            android.widget.EdgeEffect r9 = r12.A0C
            float r0 = A00(r9)
            r1 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00ea
            float r0 = -r11
            float r0 = A01(r9, r0, r10)
            float r1 = -r0
        L_0x00a7:
            float r0 = A00(r9)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
            r9.onRelease()
        L_0x00b2:
            int r0 = r12.getHeight()
            float r0 = (float) r0
            int r0 = X.AnonymousClass001.A07(r1, r0)
            if (r0 == 0) goto L_0x00c0
            r12.invalidate()
        L_0x00c0:
            int r7 = r7 - r0
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x00d5
            int r1 = java.lang.Math.abs(r7)
            int r0 = r12.A07
            if (r1 <= r0) goto L_0x003f
            X.AnonymousClass001.A17(r12)
            r12.A0H = r2
            if (r7 <= 0) goto L_0x00e8
            int r7 = r7 - r0
        L_0x00d5:
            float r0 = r13.getX(r8)
            int r0 = (int) r0
            int r1 = r12.A03(r7, r0, r4, r4)
            int r6 = r6 - r1
            r12.A02 = r6
            int r0 = r12.A06
            int r0 = r0 + r1
            r12.A06 = r0
            goto L_0x003f
        L_0x00e8:
            int r7 = r7 + r0
            goto L_0x00d5
        L_0x00ea:
            android.widget.EdgeEffect r9 = r12.A0B
            float r0 = A00(r9)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00b2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r10
            float r1 = A01(r9, r11, r0)
            goto L_0x00a7
        L_0x00fc:
            android.view.VelocityTracker r4 = r12.A09
            int r0 = r12.A04
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r0, r1)
            int r0 = r12.A01
            float r0 = r4.getYVelocity(r0)
            int r4 = (int) r0
            int r1 = java.lang.Math.abs(r4)
            int r0 = r12.A05
            if (r1 < r0) goto L_0x0176
            android.widget.EdgeEffect r1 = r12.A0C
            float r0 = A00(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x014a
            boolean r0 = r12.A0F(r1, r4)
            if (r0 != 0) goto L_0x015b
            int r4 = -r4
        L_0x0126:
            r12.A05(r4)
        L_0x0129:
            r0 = -1
            r12.A01 = r0
            r1 = 0
            r12.A0H = r1
            android.view.VelocityTracker r0 = r12.A09
            if (r0 == 0) goto L_0x0139
            r0.recycle()
            r0 = 0
            r12.A09 = r0
        L_0x0139:
            X.0Qf r0 = r12.A0N
            r0.A02(r1)
            android.widget.EdgeEffect r0 = r12.A0C
            r0.onRelease()
            android.widget.EdgeEffect r0 = r12.A0B
            r0.onRelease()
            goto L_0x003f
        L_0x014a:
            android.widget.EdgeEffect r1 = r12.A0B
            float r0 = A00(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            int r4 = -r4
            if (r0 == 0) goto L_0x015f
            boolean r0 = r12.A0F(r1, r4)
            if (r0 == 0) goto L_0x0126
        L_0x015b:
            r1.onAbsorb(r4)
            goto L_0x0129
        L_0x015f:
            float r1 = (float) r4
            X.0Qf r0 = r12.A0N
            boolean r0 = r0.A03(r5, r1)
            if (r0 != 0) goto L_0x0129
            r12.dispatchNestedFling(r5, r1, r2)
            goto L_0x0126
        L_0x016c:
            boolean r0 = r12.A0H
            if (r0 == 0) goto L_0x0129
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L_0x0129
        L_0x0176:
            android.widget.OverScroller r4 = r12.A0D
            int r5 = r12.getScrollX()
            int r6 = r12.getScrollY()
            r7 = 0
            int r10 = r12.getScrollRange()
            r9 = r7
            r8 = r7
            boolean r0 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x0129
            X.AnonymousClass0YY.A05(r12)
            goto L_0x0129
        L_0x0191:
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L_0x0198
            return r4
        L_0x0198:
            boolean r0 = r12.A0H
            if (r0 == 0) goto L_0x019f
            X.AnonymousClass001.A17(r12)
        L_0x019f:
            android.widget.OverScroller r1 = r12.A0D
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x01af
            r1.abortAnimation()
            X.0Qf r0 = r12.A0N
            r0.A02(r2)
        L_0x01af:
            float r0 = r13.getY()
            int r1 = (int) r0
            int r0 = r13.getPointerId(r4)
            r12.A02 = r1
            r12.A01 = r0
            r1 = 2
            X.0Qf r0 = r12.A0N
            r0.A05(r1, r4)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.A0J) {
            Rect rect = this.A0M;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A042 = A04(rect);
            if (A042 != 0) {
                scrollBy(0, A042);
            }
        } else {
            this.A0A = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A09) != null) {
            velocityTracker.recycle();
            this.A09 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0G) {
            this.A0G = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        C04680Qf r1 = this.A0N;
        if (r1.A02) {
            AnonymousClass0YZ.A0A(r1.A04);
        }
        r1.A02 = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.A0M = AnonymousClass001.A0N();
        this.A0J = true;
        this.A0I = false;
        this.A0A = null;
        this.A0H = false;
        this.A0K = true;
        this.A01 = -1;
        this.A0Q = new int[2];
        this.A0P = new int[2];
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = AnonymousClass0V2.A02(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.A0C = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = AnonymousClass0V2.A02(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.A0B = edgeEffect2;
        this.A0L = AnonymousClass000.A0B(context).density * 160.0f * 386.0878f * 0.84f;
        this.A0D = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A05 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A04 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0T, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0O = new AnonymousClass0L7();
        this.A0N = new C04680Qf(this);
        setNestedScrollingEnabled(true);
        C06560Yg.A0O(this, A0S);
    }

    public int A04(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = i3 - verticalFadingEdgeLength;
        if (rect.bottom >= childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i4 = i3;
        }
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public void A05(int i) {
        if (getChildCount() > 0) {
            this.A0D.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.A0N.A05(2, 1);
            this.A03 = getScrollY();
            AnonymousClass0YY.A05(this);
        }
    }

    public final void A08(int i, int[] iArr, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A0N.A07((int[]) null, iArr2, 0, scrollY2, 0, i - scrollY2, i2);
    }

    public final void A09(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A01) {
            boolean A1T = AnonymousClass000.A1T(actionIndex);
            this.A02 = (int) motionEvent.getY(A1T ? 1 : 0);
            this.A01 = motionEvent.getPointerId(A1T);
            VelocityTracker velocityTracker = this.A09;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean A0A(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A0E(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A03(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.A0M;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A03(A04(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!A0E(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(AnonymousClass35S.A0F);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw AnonymousClass001.A0e("ScrollView can host only one direct child");
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int A0H2 = AnonymousClass001.A0H(this) - getPaddingTop();
        if (childCount == 0) {
            return A0H2;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int A0C2 = AnonymousClass001.A0C(bottom, A0H2, 0);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > A0C2) {
            return bottom + (scrollY - A0C2);
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || A0C(keyEvent)) {
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A0C;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (AnonymousClass0IK.A00(this)) {
                width -= AnonymousClass000.A02(this);
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (AnonymousClass0IK.A00(this)) {
                height -= AnonymousClass000.A03(this);
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                AnonymousClass0YY.A05(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.A0B;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (AnonymousClass0IK.A00(this)) {
                width2 -= AnonymousClass000.A02(this);
                i2 = 0 + getPaddingLeft();
            }
            if (AnonymousClass0IK.A00(this)) {
                height2 -= AnonymousClass000.A03(this);
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                AnonymousClass0YY.A05(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - AnonymousClass001.A0H(this);
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return AnonymousClass001.A0C(childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin, AnonymousClass000.A05(this, getHeight()), 0);
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A02(this), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(view);
        AnonymousClass001.A19(view, A0T2.topMargin + A0T2.bottomMargin, 0, ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A02(this) + A0T2.leftMargin + A0T2.rightMargin + i2, A0T2.width));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0I = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int width;
        if (motionEvent.getAction() != 8 || this.A0H) {
            return false;
        }
        if (AnonymousClass000.A1U(motionEvent.getSource() & 2, 2)) {
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) != 4194304) {
            return false;
        } else {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
        A03(-verticalScrollFactorCompat, width, 1, AnonymousClass000.A1U(motionEvent.getSource() & 8194, 8194));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.A0H) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.A01;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Invalid pointerId=");
                            A0o.append(i2);
                            Log.e("NestedScrollView", AnonymousClass000.A0X(" in onInterceptTouchEvent", A0o));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (AnonymousClass001.A0A(y, this.A02) > this.A07 && (2 & getNestedScrollAxes()) == 0) {
                                this.A0H = true;
                                this.A02 = y;
                                VelocityTracker velocityTracker = this.A09;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A09 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A06 = 0;
                                AnonymousClass001.A17(this);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        A09(motionEvent);
                    }
                }
            }
            this.A0H = false;
            this.A01 = -1;
            VelocityTracker velocityTracker2 = this.A09;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A09 = null;
            }
            if (this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                AnonymousClass0YY.A05(this);
            }
            this.A0N.A02(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A02 = y2;
                    this.A01 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A09;
                    if (velocityTracker3 == null) {
                        this.A09 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A09.addMovement(motionEvent);
                    OverScroller overScroller = this.A0D;
                    overScroller.computeScrollOffset();
                    if (!A0D(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.A0H = z;
                    this.A0N.A05(2, 0);
                }
            }
            if (!A0D(motionEvent) && this.A0D.isFinished()) {
                z = false;
            }
            this.A0H = z;
            VelocityTracker velocityTracker4 = this.A09;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A09 = null;
            }
        }
        return this.A0H;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.A0J = false;
        View view = this.A0A;
        if (view != null && A02(view, this)) {
            View view2 = this.A0A;
            Rect rect = this.A0M;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A042 = A04(rect);
            if (A042 != 0) {
                scrollBy(0, A042);
            }
        }
        this.A0A = null;
        if (!this.A0I) {
            if (this.A0F != null) {
                scrollTo(getScrollX(), this.A0F.A00);
                this.A0F = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int A052 = AnonymousClass000.A05(this, i4 - i2);
            int scrollY = getScrollY();
            int i6 = scrollY;
            if (A052 >= i5 || scrollY < 0) {
                i6 = 0;
            } else if (A052 + scrollY > i5) {
                i6 = i5 - A052;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0I = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0G && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int A052 = (AnonymousClass000.A05(this, getMeasuredHeight()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < A052) {
                AnonymousClass001.A19(childAt, A052, 1073741824, ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A02(this) + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width));
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass02T r1 = new AnonymousClass02T(super.onSaveInstanceState());
        r1.A00 = getScrollY();
        return r1;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C15870s6 r0 = this.A0E;
        if (r0 != null) {
            r0.Bat(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && A0E(findFocus, 0, i4)) {
            Rect rect = this.A0M;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int A042 = A04(rect);
            if (A042 == 0) {
                return;
            }
            if (this.A0K) {
                A07(0, A042, false);
            } else {
                scrollBy(0, A042);
            }
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A042 = A04(rect);
        boolean z2 = false;
        if (A042 != 0) {
            z2 = true;
            if (z) {
                scrollBy(0, A042);
            } else {
                A07(0, A042, false);
                return true;
            }
        }
        return z2;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int A062 = AnonymousClass000.A06(this, getWidth());
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int A052 = AnonymousClass000.A05(this, getHeight());
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (A062 >= width || i < 0) {
                i = 0;
            } else if (A062 + i > width) {
                i = width - A062;
            }
            if (A052 >= height || i2 < 0) {
                i2 = 0;
            } else if (A052 + i2 > height) {
                i2 = height - A052;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setOnScrollChangeListener(C15870s6 r1) {
        this.A0E = r1;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0K = z;
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public void BWw(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A08(i4, iArr, i5);
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw AnonymousClass001.A0e("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw AnonymousClass001.A0e("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw AnonymousClass001.A0e("ScrollView can host only one direct child");
    }
}
