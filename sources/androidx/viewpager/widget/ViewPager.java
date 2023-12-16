package androidx.viewpager.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass02a;
import X.AnonymousClass062;
import X.AnonymousClass0MR;
import X.AnonymousClass0R4;
import X.AnonymousClass0RP;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.C000800q;
import X.C009107e;
import X.C06560Yg;
import X.C08120dM;
import X.C11090j5;
import X.C13410n8;
import X.C16070sQ;
import X.C16080sR;
import X.C16870uA;
import X.C17940wU;
import X.C18250wz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final Interpolator A0p = new C18250wz(4);
    public static final C13410n8 A0q = new C13410n8();
    public static final Comparator A0r = new C17940wU(4);
    public static final int[] A0s = {16842931};
    public float A00 = -3.4028235E38f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = Float.MAX_VALUE;
    public int A06 = -1;
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
    public int A0H;
    public int A0I;
    public int A0J = 1;
    public int A0K;
    public int A0L;
    public int A0M = -1;
    public int A0N = 0;
    public int A0O;
    public int A0P;
    public Drawable A0Q;
    public Parcelable A0R = null;
    public VelocityTracker A0S;
    public EdgeEffect A0T;
    public EdgeEffect A0U;
    public AnonymousClass0R4 A0V;
    public C16870uA A0W;
    public C16080sR A0X;
    public C000800q A0Y;
    public ClassLoader A0Z = null;
    public ArrayList A0a;
    public List A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e = true;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final Rect A0l = AnonymousClass001.A0N();
    public final AnonymousClass0MR A0m = new AnonymousClass0MR();
    public final Runnable A0n = new C11090j5(this);
    public final ArrayList A0o = AnonymousClass001.A0s();
    public Scroller mScroller;

    public @interface DecorView {
    }

    public AnonymousClass0MR A03(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i2 >= arrayList.size()) {
                return null;
            }
            AnonymousClass0MR A0a2 = AnonymousClass001.A0a(arrayList, i2);
            if (A0a2.A02 == i) {
                return A0a2;
            }
            i2++;
        }
    }

    public AnonymousClass0MR A05(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i >= arrayList.size()) {
                return null;
            }
            AnonymousClass0MR A0a2 = AnonymousClass001.A0a(arrayList, i);
            if (this.A0V.A0F(view, A0a2.A03)) {
                return A0a2;
            }
            i++;
        }
    }

    public void A07() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, A0p);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = AnonymousClass000.A0B(context).density;
        this.A0P = viewConfiguration.getScaledPagingTouchSlop();
        this.A0I = (int) (400.0f * f);
        this.A0H = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0T = new EdgeEffect(context);
        this.A0U = new EdgeEffect(context);
        this.A0F = (int) (25.0f * f);
        this.A09 = (int) (2.0f * f);
        this.A0C = (int) (f * 16.0f);
        C06560Yg.A0O(this, new AnonymousClass062(this));
        if (AnonymousClass0YY.A00(this) == 0) {
            AnonymousClass0YY.A06(this, 1);
        }
        AnonymousClass0YZ.A0E(this, new C08120dM(this));
    }

    public void A0F(int i, boolean z) {
        this.A0j = false;
        A0D(i, 0, z, false);
    }

    public void A0H(C16080sR r7, boolean z) {
        int i = 1;
        boolean A1W = AnonymousClass000.A1W(r7);
        boolean z2 = false;
        if (A1W != AnonymousClass000.A1W(this.A0X)) {
            z2 = true;
        }
        this.A0X = r7;
        setChildrenDrawingOrderEnabled(A1W);
        if (A1W) {
            if (z) {
                i = 2;
            }
            this.A0D = i;
            this.A0L = 2;
        } else {
            this.A0D = 0;
        }
        if (z2) {
            A09(this.A0A);
        }
    }

    public final boolean A0J() {
        this.A06 = -1;
        this.A0g = false;
        this.A0i = false;
        VelocityTracker velocityTracker = this.A0S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0S = null;
        }
        this.A0T.onRelease();
        this.A0U.onRelease();
        if (this.A0T.isFinished() || this.A0U.isFinished()) {
            return true;
        }
        return false;
    }

    public void addTouchables(ArrayList arrayList) {
        AnonymousClass0MR A052;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void computeScroll() {
        this.A0h = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            A0I(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A0M(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        AnonymousClass0YY.A05(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        if (r3 == 80) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009d, code lost:
        if (r12 == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r16, int r17) {
        /*
            r15 = this;
            r8 = 0
            r0 = r16
            int r1 = android.view.View.getDefaultSize(r8, r0)
            r0 = r17
            int r0 = android.view.View.getDefaultSize(r8, r0)
            r15.setMeasuredDimension(r1, r0)
            int r2 = r15.getMeasuredWidth()
            int r1 = r2 / 10
            int r0 = r15.A0C
            int r0 = java.lang.Math.min(r1, r0)
            r15.A0G = r0
            int r7 = X.AnonymousClass000.A06(r15, r2)
            int r0 = r15.getMeasuredHeight()
            int r11 = X.AnonymousClass000.A05(r15, r0)
            int r10 = r15.getChildCount()
            r9 = 0
        L_0x002f:
            r6 = 8
            r12 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r9 >= r10) goto L_0x00a0
            android.view.View r13 = r15.getChildAt(r9)
            int r0 = r13.getVisibility()
            if (r0 == r6) goto L_0x008b
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            X.02a r1 = (X.AnonymousClass02a) r1
            if (r1 == 0) goto L_0x008b
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x008b
            int r0 = r1.A02
            r2 = r0 & 7
            r3 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r3 == r0) goto L_0x005b
            r0 = 80
            r14 = 0
            if (r3 != r0) goto L_0x005c
        L_0x005b:
            r14 = 1
        L_0x005c:
            r0 = 3
            if (r2 == r0) goto L_0x0063
            r0 = 5
            if (r2 == r0) goto L_0x0063
            r12 = 0
        L_0x0063:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 == 0) goto L_0x009b
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x0069:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x006b:
            int r3 = r1.width
            r2 = -1
            r0 = -2
            if (r3 == r0) goto L_0x0099
            if (r3 != r2) goto L_0x0074
            r3 = r7
        L_0x0074:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x0076:
            int r1 = r1.height
            if (r1 == r0) goto L_0x0096
            if (r1 != r2) goto L_0x007d
            r1 = r11
        L_0x007d:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r6)
            X.AnonymousClass001.A19(r13, r1, r5, r0)
            if (r14 == 0) goto L_0x008e
            int r0 = r13.getMeasuredHeight()
            int r11 = r11 - r0
        L_0x008b:
            int r9 = r9 + 1
            goto L_0x002f
        L_0x008e:
            if (r12 == 0) goto L_0x008b
            int r0 = r13.getMeasuredWidth()
            int r7 = r7 - r0
            goto L_0x008b
        L_0x0096:
            r1 = r11
            r5 = r4
            goto L_0x007d
        L_0x0099:
            r3 = r7
            goto L_0x0076
        L_0x009b:
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 != 0) goto L_0x006b
            goto L_0x0069
        L_0x00a0:
            android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r5)
            r15.A08 = r0
            r15.A0f = r12
            int r0 = r15.A0A
            r15.A09(r0)
            r15.A0f = r8
            int r4 = r15.getChildCount()
        L_0x00b6:
            if (r8 >= r4) goto L_0x00df
            android.view.View r3 = r15.getChildAt(r8)
            int r0 = r3.getVisibility()
            if (r0 == r6) goto L_0x00dc
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.02a r2 = (X.AnonymousClass02a) r2
            if (r2 == 0) goto L_0x00ce
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x00dc
        L_0x00ce:
            float r1 = (float) r7
            float r0 = r2.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            int r0 = r15.A08
            r3.measure(r1, r0)
        L_0x00dc:
            int r8 = r8 + 1
            goto L_0x00b6
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r2 = 1
            int r0 = r8.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x000f
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            return r1
        L_0x000f:
            X.0R4 r0 = r7.A0V
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A0C()
            if (r0 == 0) goto L_0x000e
            android.view.VelocityTracker r0 = r7.A0S
            if (r0 != 0) goto L_0x0023
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A0S = r0
        L_0x0023:
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r3 = r0 & 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0155
            if (r3 == r2) goto L_0x0056
            r0 = 2
            if (r3 == r0) goto L_0x00d6
            r0 = 3
            if (r3 == r0) goto L_0x004c
            r0 = 5
            if (r3 == r0) goto L_0x014a
            r0 = 6
            if (r3 != r0) goto L_0x004b
            r7.A00(r8)
            int r0 = r7.A06
            int r0 = r8.findPointerIndex(r0)
            float r0 = r8.getX(r0)
            r7.A03 = r0
        L_0x004b:
            return r2
        L_0x004c:
            boolean r0 = r7.A0g
            if (r0 == 0) goto L_0x004b
            int r0 = r7.A0A
            r7.A0E(r0, r1, r2, r1)
            goto L_0x00d1
        L_0x0056:
            boolean r0 = r7.A0g
            if (r0 == 0) goto L_0x004b
            android.view.VelocityTracker r3 = r7.A0S
            int r0 = r7.A0H
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.computeCurrentVelocity(r0, r1)
            int r0 = r7.A06
            float r0 = r3.getXVelocity(r0)
            int r4 = (int) r0
            r7.A0j = r2
            int r0 = r7.getMeasuredWidth()
            int r3 = X.AnonymousClass000.A06(r7, r0)
            int r5 = r7.getScrollX()
            X.0MR r6 = r7.A02()
            int r0 = r7.A0K
            float r1 = (float) r0
            float r0 = (float) r3
            float r1 = r1 / r0
            int r3 = r6.A02
            float r5 = (float) r5
            float r5 = r5 / r0
            float r0 = r6.A00
            float r5 = r5 - r0
            float r0 = r6.A01
            float r0 = r0 + r1
            float r5 = r5 / r0
            int r0 = r7.A06
            int r0 = r8.findPointerIndex(r0)
            float r1 = r8.getX(r0)
            float r0 = r7.A01
            float r1 = r1 - r0
            int r0 = (int) r1
            int r1 = java.lang.Math.abs(r0)
            int r0 = r7.A0F
            if (r1 <= r0) goto L_0x013b
            int r1 = java.lang.Math.abs(r4)
            int r0 = r7.A0I
            if (r1 <= r0) goto L_0x013b
            if (r4 > 0) goto L_0x00af
            int r3 = r3 + 1
        L_0x00af:
            java.util.ArrayList r5 = r7.A0o
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x00ce
            r0 = 0
            X.0MR r1 = X.AnonymousClass001.A0a(r5, r0)
            int r0 = r5.size()
            int r0 = r0 + -1
            X.0MR r0 = X.AnonymousClass001.A0a(r5, r0)
            int r1 = r1.A02
            int r0 = r0.A02
            int r3 = X.AnonymousClass001.A0D(r3, r0, r1)
        L_0x00ce:
            r7.A0D(r3, r4, r2, r2)
        L_0x00d1:
            boolean r1 = r7.A0J()
            goto L_0x0133
        L_0x00d6:
            boolean r0 = r7.A0g
            if (r0 != 0) goto L_0x0120
            int r0 = r7.A06
            int r3 = r8.findPointerIndex(r0)
            r0 = -1
            if (r3 == r0) goto L_0x00d1
            float r6 = r8.getX(r3)
            float r0 = r7.A03
            float r4 = X.AnonymousClass002.A00(r6, r0)
            float r5 = r8.getY(r3)
            float r0 = r7.A04
            float r3 = X.AnonymousClass002.A00(r5, r0)
            int r0 = r7.A0P
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0120
            r7.A0g = r2
            X.AnonymousClass001.A17(r7)
            float r4 = r7.A01
            float r6 = r6 - r4
            r0 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            int r0 = r7.A0P
            float r0 = (float) r0
            if (r3 <= 0) goto L_0x0139
            float r4 = r4 + r0
        L_0x0113:
            r7.A03 = r4
            r7.A04 = r5
            r7.setScrollState(r2)
            r7.setScrollingCacheEnabled(r2)
            X.AnonymousClass001.A17(r7)
        L_0x0120:
            boolean r0 = r7.A0g
            if (r0 == 0) goto L_0x004b
            int r0 = r7.A06
            int r0 = r8.findPointerIndex(r0)
            float r0 = r8.getX(r0)
            boolean r0 = r7.A0K(r0)
            r1 = r1 | r0
        L_0x0133:
            if (r1 == 0) goto L_0x004b
            X.AnonymousClass0YY.A05(r7)
            return r2
        L_0x0139:
            float r4 = r4 - r0
            goto L_0x0113
        L_0x013b:
            int r1 = r7.A0A
            r0 = 1058642330(0x3f19999a, float:0.6)
            if (r3 < r1) goto L_0x0145
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0145:
            float r5 = r5 + r0
            int r0 = (int) r5
            int r3 = r3 + r0
            goto L_0x00af
        L_0x014a:
            int r1 = r8.getActionIndex()
            float r0 = r8.getX(r1)
            r7.A03 = r0
            goto L_0x0171
        L_0x0155:
            android.widget.Scroller r0 = r7.mScroller
            r0.abortAnimation()
            r7.A0j = r1
            int r0 = r7.A0A
            r7.A09(r0)
            float r0 = r8.getX()
            r7.A01 = r0
            r7.A03 = r0
            float r0 = r8.getY()
            r7.A02 = r0
            r7.A04 = r0
        L_0x0171:
            int r0 = r8.getPointerId(r1)
            r7.A06 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentItem(int i) {
        this.A0j = false;
        A0D(i, 0, !this.A0e, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Requested offscreen page limit ");
            A0o2.append(i);
            Log.w("ViewPager", AnonymousClass000.A0Y(" too small; defaulting to ", A0o2, 1));
            i = 1;
        }
        if (i != this.A0J) {
            this.A0J = i;
            A09(this.A0A);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0k != z) {
            this.A0k = z;
        }
    }

    public final Rect A01(Rect rect, View view) {
        if (rect == null) {
            rect = AnonymousClass001.A0N();
        }
        if (view != null) {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            int bottom = view.getBottom();
            while (true) {
                rect.bottom = bottom;
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup) || parent == this) {
                    break;
                }
                view = (View) parent;
                rect.left += view.getLeft();
                rect.right += view.getRight();
                rect.top += view.getTop();
                bottom = rect.bottom + view.getBottom();
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
        return rect;
    }

    public AnonymousClass0MR A04(int i, int i2) {
        AnonymousClass0MR r2 = new AnonymousClass0MR();
        r2.A02 = i;
        r2.A03 = this.A0V.A0D(this, i);
        r2.A01 = this.A0V.A01(i);
        if (i2 >= 0) {
            ArrayList arrayList = this.A0o;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, r2);
                return r2;
            }
        }
        this.A0o.add(r2);
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r3.size() >= r7) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r11 = this;
            X.0R4 r0 = r11.A0V
            int r7 = r0.A0C()
            r11.A0E = r7
            java.util.ArrayList r3 = r11.A0o
            int r1 = r3.size()
            int r0 = r11.A0J
            int r0 = r0 * 2
            int r0 = r0 + 1
            r4 = 0
            if (r1 >= r0) goto L_0x001e
            int r0 = r3.size()
            r10 = 1
            if (r0 < r7) goto L_0x001f
        L_0x001e:
            r10 = 0
        L_0x001f:
            int r5 = r11.A0A
            r6 = 0
            r9 = 0
        L_0x0023:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x006d
            X.0MR r8 = X.AnonymousClass001.A0a(r3, r6)
            X.0R4 r1 = r11.A0V
            java.lang.Object r0 = r8.A03
            int r2 = r1.A02(r0)
            r0 = -1
            if (r2 == r0) goto L_0x005e
            r0 = -2
            if (r2 != r0) goto L_0x0061
            r3.remove(r6)
            int r6 = r6 + -1
            if (r9 != 0) goto L_0x0048
            X.0R4 r0 = r11.A0V
            r0.A0A(r11)
            r9 = 1
        L_0x0048:
            X.0R4 r2 = r11.A0V
            int r1 = r8.A02
            java.lang.Object r0 = r8.A03
            r2.A0E(r11, r0, r1)
            int r1 = r11.A0A
            int r0 = r8.A02
            if (r1 != r0) goto L_0x005d
            int r0 = r7 + -1
            int r5 = X.AnonymousClass001.A0D(r1, r0, r4)
        L_0x005d:
            r10 = 1
        L_0x005e:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0061:
            int r1 = r8.A02
            if (r1 == r2) goto L_0x005e
            int r0 = r11.A0A
            if (r1 != r0) goto L_0x006a
            r5 = r2
        L_0x006a:
            r8.A02 = r2
            goto L_0x005d
        L_0x006d:
            if (r9 == 0) goto L_0x0074
            X.0R4 r0 = r11.A0V
            r0.A09(r11)
        L_0x0074:
            java.util.Comparator r0 = A0r
            java.util.Collections.sort(r3, r0)
            if (r10 == 0) goto L_0x009d
            int r3 = r11.getChildCount()
            r2 = 0
        L_0x0080:
            if (r2 >= r3) goto L_0x0096
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.02a r1 = (X.AnonymousClass02a) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0093
            r0 = 0
            r1.A00 = r0
        L_0x0093:
            int r2 = r2 + 1
            goto L_0x0080
        L_0x0096:
            r0 = 1
            r11.A0D(r5, r4, r4, r0)
            r11.requestLayout()
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A06():void");
    }

    public final void A08() {
        if (this.A0D != 0) {
            ArrayList arrayList = this.A0a;
            if (arrayList == null) {
                this.A0a = AnonymousClass001.A0s();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0a.add(getChildAt(i));
            }
            Collections.sort(this.A0a, A0q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r0 == r1) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(int r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A0A
            r1 = r19
            if (r0 == r1) goto L_0x00ce
            X.0MR r7 = r3.A03(r0)
            r3.A0A = r1
        L_0x000e:
            X.0R4 r0 = r3.A0V
            if (r0 == 0) goto L_0x0320
            boolean r0 = r3.A0j
            if (r0 != 0) goto L_0x0320
            android.os.IBinder r0 = r3.getWindowToken()
            if (r0 == 0) goto L_0x0323
            X.0R4 r0 = r3.A0V
            r0.A0A(r3)
            int r5 = r3.A0J
            int r1 = r3.A0A
            int r1 = r1 - r5
            r0 = 0
            int r10 = java.lang.Math.max(r0, r1)
            X.0R4 r0 = r3.A0V
            int r4 = r0.A0C()
            int r2 = r4 + -1
            int r1 = r3.A0A
            int r0 = r1 + r5
            int r12 = java.lang.Math.min(r2, r0)
            int r0 = r3.A0E
            if (r4 != r0) goto L_0x02cd
            r2 = 0
        L_0x0040:
            java.util.ArrayList r11 = r3.A0o
            int r0 = r11.size()
            if (r2 >= r0) goto L_0x00c6
            X.0MR r9 = X.AnonymousClass001.A0a(r11, r2)
            int r0 = r9.A02
            if (r0 < r1) goto L_0x00c2
            if (r0 != r1) goto L_0x00c6
        L_0x0052:
            r17 = 0
            if (r9 == 0) goto L_0x024d
            int r8 = r2 + -1
            if (r8 < 0) goto L_0x00c0
            X.0MR r13 = X.AnonymousClass001.A0a(r11, r8)
        L_0x005e:
            int r0 = r3.getMeasuredWidth()
            int r6 = X.AnonymousClass000.A06(r3, r0)
            r16 = 1073741824(0x40000000, float:2.0)
            if (r6 > 0) goto L_0x00b3
            r5 = 0
        L_0x006b:
            int r0 = r3.A0A
            int r14 = r0 + -1
            r15 = 0
        L_0x0070:
            if (r14 < 0) goto L_0x00d1
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x009b
            if (r14 >= r10) goto L_0x009b
            if (r13 == 0) goto L_0x00d1
            int r0 = r13.A02
            if (r14 != r0) goto L_0x0096
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0096
            r11.remove(r8)
            X.0R4 r1 = r3.A0V
            java.lang.Object r0 = r13.A03
            r1.A0E(r3, r0, r14)
            int r8 = r8 + -1
            int r2 = r2 + -1
        L_0x0090:
            if (r8 < 0) goto L_0x0099
            X.0MR r13 = X.AnonymousClass001.A0a(r11, r8)
        L_0x0096:
            int r14 = r14 + -1
            goto L_0x0070
        L_0x0099:
            r13 = 0
            goto L_0x0096
        L_0x009b:
            if (r13 == 0) goto L_0x00a7
            int r0 = r13.A02
            if (r14 != r0) goto L_0x00a7
            float r0 = r13.A01
            float r15 = r15 + r0
            int r8 = r8 + -1
            goto L_0x0090
        L_0x00a7:
            int r0 = r8 + 1
            X.0MR r0 = r3.A04(r14, r0)
            float r0 = r0.A01
            float r15 = r15 + r0
            int r2 = r2 + 1
            goto L_0x0090
        L_0x00b3:
            float r0 = r9.A01
            float r5 = r16 - r0
            int r0 = r3.getPaddingLeft()
            float r1 = (float) r0
            float r0 = (float) r6
            float r1 = r1 / r0
            float r5 = r5 + r1
            goto L_0x006b
        L_0x00c0:
            r13 = 0
            goto L_0x005e
        L_0x00c2:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00c6:
            r9 = 0
            if (r4 <= 0) goto L_0x0052
            X.0MR r9 = r3.A04(r1, r2)
            goto L_0x0052
        L_0x00ce:
            r7 = 0
            goto L_0x000e
        L_0x00d1:
            float r8 = r9.A01
            int r5 = r2 + 1
            r10 = r5
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0136
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x0134
            X.0MR r13 = X.AnonymousClass001.A0a(r11, r5)
        L_0x00e4:
            if (r6 > 0) goto L_0x012a
            r1 = 0
        L_0x00e7:
            int r6 = r3.A0A
        L_0x00e9:
            int r6 = r6 + 1
            if (r6 >= r4) goto L_0x0136
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0114
            if (r6 <= r12) goto L_0x0114
            if (r13 == 0) goto L_0x0136
            int r0 = r13.A02
            if (r6 != r0) goto L_0x00e9
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x00e9
            r11.remove(r5)
            X.0R4 r14 = r3.A0V
            java.lang.Object r0 = r13.A03
            r14.A0E(r3, r0, r6)
        L_0x0107:
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x0112
            X.0MR r13 = X.AnonymousClass001.A0a(r11, r5)
            goto L_0x00e9
        L_0x0112:
            r13 = 0
            goto L_0x00e9
        L_0x0114:
            if (r13 == 0) goto L_0x0120
            int r0 = r13.A02
            if (r6 != r0) goto L_0x0120
            float r0 = r13.A01
            float r8 = r8 + r0
            int r5 = r5 + 1
            goto L_0x0107
        L_0x0120:
            X.0MR r0 = r3.A04(r6, r5)
            int r5 = r5 + 1
            float r0 = r0.A01
            float r8 = r8 + r0
            goto L_0x0107
        L_0x012a:
            int r0 = r3.getPaddingRight()
            float r1 = (float) r0
            float r0 = (float) r6
            float r1 = r1 / r0
            float r1 = r1 + r16
            goto L_0x00e7
        L_0x0134:
            r13 = 0
            goto L_0x00e4
        L_0x0136:
            X.0R4 r0 = r3.A0V
            int r13 = r0.A0C()
            int r0 = r3.getMeasuredWidth()
            int r1 = X.AnonymousClass000.A06(r3, r0)
            if (r1 <= 0) goto L_0x0191
            int r0 = r3.A0K
            float r8 = (float) r0
            float r0 = (float) r1
            float r8 = r8 / r0
        L_0x014b:
            if (r7 == 0) goto L_0x01c8
            int r6 = r7.A02
            int r0 = r9.A02
            if (r6 >= r0) goto L_0x0193
            float r1 = r7.A00
            float r0 = r7.A01
            float r1 = r1 + r0
            float r1 = r1 + r8
            int r5 = r6 + 1
            r4 = 0
        L_0x015c:
            int r0 = r9.A02
            if (r5 > r0) goto L_0x01c8
            int r0 = r11.size()
            if (r4 >= r0) goto L_0x01c8
        L_0x0166:
            X.0MR r6 = X.AnonymousClass001.A0a(r11, r4)
            int r0 = r6.A02
            if (r5 <= r0) goto L_0x0179
            int r0 = r11.size()
            int r0 = r0 + -1
            if (r4 >= r0) goto L_0x0179
            int r4 = r4 + 1
            goto L_0x0166
        L_0x0179:
            int r0 = r6.A02
            if (r5 >= r0) goto L_0x0188
            X.0R4 r0 = r3.A0V
            float r0 = r0.A01(r5)
            float r0 = r0 + r8
            float r1 = r1 + r0
            int r5 = r5 + 1
            goto L_0x0179
        L_0x0188:
            r6.A00 = r1
            float r0 = r6.A01
            float r0 = r0 + r8
            float r1 = r1 + r0
            int r5 = r5 + 1
            goto L_0x015c
        L_0x0191:
            r8 = 0
            goto L_0x014b
        L_0x0193:
            if (r6 <= r0) goto L_0x01c8
            int r0 = r11.size()
            int r5 = r0 + -1
            float r4 = r7.A00
        L_0x019d:
            int r6 = r6 + -1
            int r0 = r9.A02
            if (r6 < r0) goto L_0x01c8
            if (r5 < 0) goto L_0x01c8
        L_0x01a5:
            X.0MR r1 = X.AnonymousClass001.A0a(r11, r5)
            int r0 = r1.A02
            if (r6 >= r0) goto L_0x01b2
            if (r5 <= 0) goto L_0x01b2
            int r5 = r5 + -1
            goto L_0x01a5
        L_0x01b2:
            int r0 = r1.A02
            if (r6 <= r0) goto L_0x01c1
            X.0R4 r0 = r3.A0V
            float r0 = r0.A01(r6)
            float r0 = r0 + r8
            float r4 = r4 - r0
            int r6 = r6 + -1
            goto L_0x01b2
        L_0x01c1:
            float r0 = r1.A01
            float r0 = r0 + r8
            float r4 = r4 - r0
            r1.A00 = r4
            goto L_0x019d
        L_0x01c8:
            int r7 = r11.size()
            float r5 = r9.A00
            int r1 = r9.A02
            int r12 = r1 + -1
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r1 != 0) goto L_0x01d8
            r0 = r5
        L_0x01d8:
            r3.A00 = r0
            int r6 = r13 + -1
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r6) goto L_0x020d
            float r0 = r9.A01
            float r0 = r0 + r5
            float r0 = r0 - r13
        L_0x01e4:
            r3.A05 = r0
            int r4 = r2 + -1
        L_0x01e8:
            if (r4 < 0) goto L_0x0211
            X.0MR r2 = X.AnonymousClass001.A0a(r11, r4)
        L_0x01ee:
            int r1 = r2.A02
            if (r12 <= r1) goto L_0x01fe
            X.0R4 r0 = r3.A0V
            int r1 = r12 + -1
            float r0 = r0.A01(r12)
            float r0 = r0 + r8
            float r5 = r5 - r0
            r12 = r1
            goto L_0x01ee
        L_0x01fe:
            float r0 = r2.A01
            float r0 = r0 + r8
            float r5 = r5 - r0
            r2.A00 = r5
            if (r1 != 0) goto L_0x0208
            r3.A00 = r5
        L_0x0208:
            int r4 = r4 + -1
            int r12 = r12 + -1
            goto L_0x01e8
        L_0x020d:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x01e4
        L_0x0211:
            float r5 = r9.A00
            float r0 = r9.A01
            float r5 = r5 + r0
            float r5 = r5 + r8
            int r0 = r9.A02
            int r4 = r0 + 1
        L_0x021b:
            if (r10 >= r7) goto L_0x0244
            X.0MR r2 = X.AnonymousClass001.A0a(r11, r10)
        L_0x0221:
            int r0 = r2.A02
            if (r4 >= r0) goto L_0x0231
            X.0R4 r0 = r3.A0V
            int r1 = r4 + 1
            float r0 = r0.A01(r4)
            float r0 = r0 + r8
            float r5 = r5 + r0
            r4 = r1
            goto L_0x0221
        L_0x0231:
            if (r0 != r6) goto L_0x0239
            float r0 = r2.A01
            float r0 = r0 + r5
            float r0 = r0 - r13
            r3.A05 = r0
        L_0x0239:
            r2.A00 = r5
            float r0 = r2.A01
            float r0 = r0 + r8
            float r5 = r5 + r0
            int r10 = r10 + 1
            int r4 = r4 + 1
            goto L_0x021b
        L_0x0244:
            X.0R4 r2 = r3.A0V
            int r1 = r3.A0A
            java.lang.Object r0 = r9.A03
            r2.A0B(r3, r0, r1)
        L_0x024d:
            X.0R4 r0 = r3.A0V
            r0.A09(r3)
            int r5 = r3.getChildCount()
            r4 = 0
        L_0x0257:
            if (r4 >= r5) goto L_0x0280
            android.view.View r1 = r3.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            X.02a r2 = (X.AnonymousClass02a) r2
            r2.A01 = r4
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x027d
            float r0 = r2.A00
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x027d
            X.0MR r1 = r3.A05(r1)
            if (r1 == 0) goto L_0x027d
            float r0 = r1.A01
            r2.A00 = r0
            int r0 = r1.A02
            r2.A03 = r0
        L_0x027d:
            int r4 = r4 + 1
            goto L_0x0257
        L_0x0280:
            r3.A08()
            boolean r0 = r3.hasFocus()
            if (r0 == 0) goto L_0x0323
            android.view.View r0 = r3.findFocus()
            if (r0 == 0) goto L_0x02ab
        L_0x028f:
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == r3) goto L_0x029f
            if (r1 == 0) goto L_0x02ab
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x02ab
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            goto L_0x028f
        L_0x029f:
            X.0MR r0 = r3.A05(r0)
            if (r0 == 0) goto L_0x02ab
            int r1 = r0.A02
            int r0 = r3.A0A
            if (r1 == r0) goto L_0x0323
        L_0x02ab:
            r4 = 0
        L_0x02ac:
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto L_0x0323
            android.view.View r2 = r3.getChildAt(r4)
            X.0MR r0 = r3.A05(r2)
            if (r0 == 0) goto L_0x02ca
            int r1 = r0.A02
            int r0 = r3.A0A
            if (r1 != r0) goto L_0x02ca
            r0 = 2
            boolean r0 = r2.requestFocus(r0)
            if (r0 == 0) goto L_0x02ca
            return
        L_0x02ca:
            int r4 = r4 + 1
            goto L_0x02ac
        L_0x02cd:
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ NotFoundException -> 0x02da }
            int r0 = r3.getId()     // Catch:{ NotFoundException -> 0x02da }
            java.lang.String r2 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x02da }
            goto L_0x02e2
        L_0x02da:
            int r0 = r3.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
        L_0x02e2:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r1.append(r0)
            int r0 = r3.A0E
            r1.append(r0)
            java.lang.String r0 = ", found: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " Pager id: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " Pager class: "
            r1.append(r0)
            java.lang.Class r0 = r3.getClass()
            r1.append(r0)
            java.lang.String r0 = " Problematic adapter: "
            r1.append(r0)
            X.0R4 r0 = r3.A0V
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = X.AnonymousClass000.A0R(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)
            throw r0
        L_0x0320:
            r3.A08()
        L_0x0323:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A09(int):void");
    }

    public final void A0A(int i) {
        C16870uA r0 = this.A0W;
        if (r0 != null) {
            r0.BXf(i);
        }
        List list = this.A0c;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C16870uA r02 = (C16870uA) this.A0c.get(i2);
                if (r02 != null) {
                    r02.BXf(i);
                }
            }
        }
    }

    public void A0B(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.A0B > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                AnonymousClass02a r7 = (AnonymousClass02a) childAt.getLayoutParams();
                if (r7.A04) {
                    int i6 = r7.A02 & 7;
                    if (i6 == 1) {
                        i3 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    } else if (i6 == 3) {
                        i4 = childAt.getWidth() + paddingLeft;
                    } else if (i6 != 5) {
                        i4 = paddingLeft;
                    } else {
                        i3 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i4;
                }
            }
        }
        C16870uA r0 = this.A0W;
        if (r0 != null) {
            r0.BXe(i, f, i2);
        }
        List list = this.A0c;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C16870uA r02 = (C16870uA) this.A0c.get(i7);
                if (r02 != null) {
                    r02.BXe(i, f, i2);
                }
            }
        }
        if (this.A0X != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((AnonymousClass02a) childAt2.getLayoutParams()).A04) {
                    this.A0X.Br5(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) AnonymousClass000.A06(this, getMeasuredWidth())));
                }
            }
        }
        this.A0d = true;
    }

    public final void A0C(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        if (i2 <= 0 || this.A0o.isEmpty()) {
            AnonymousClass0MR A032 = A03(this.A0A);
            if (A032 != null) {
                f = Math.min(A032.A00, this.A05);
            } else {
                f = 0.0f;
            }
            i5 = (int) (f * ((float) AnonymousClass000.A06(this, i)));
            if (i5 != getScrollX()) {
                A0I(false);
            } else {
                return;
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * AnonymousClass000.A06(this, getMeasuredWidth()));
            return;
        } else {
            i5 = (int) ((((float) getScrollX()) / ((float) (AnonymousClass000.A06(this, i2) + i4))) * ((float) (AnonymousClass000.A06(this, i) + i3)));
        }
        scrollTo(i5, getScrollY());
    }

    public void A0D(int i, int i2, boolean z, boolean z2) {
        AnonymousClass0R4 r0 = this.A0V;
        boolean z3 = false;
        if (r0 == null || r0.A0C() <= 0 || (!z2 && this.A0A == i && this.A0o.size() != 0)) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A0V.A0C()) {
            i = this.A0V.A0C() - 1;
        }
        int i3 = this.A0J;
        int i4 = this.A0A;
        if (i > i4 + i3 || i < i4 - i3) {
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.A0o;
                if (i5 >= arrayList.size()) {
                    break;
                }
                AnonymousClass001.A0a(arrayList, i5).A04 = true;
                i5++;
            }
        }
        if (i4 != i) {
            z3 = true;
        }
        if (this.A0e) {
            this.A0A = i;
            if (z3) {
                A0A(i);
            }
            requestLayout();
            return;
        }
        A09(i);
        A0E(i, i2, z, z3);
    }

    public void A0G(C16870uA r2) {
        List list = this.A0c;
        if (list == null) {
            list = AnonymousClass001.A0s();
            this.A0c = list;
        }
        list.add(r2);
    }

    public final void A0I(boolean z) {
        boolean z2 = false;
        if (this.A0N == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0M(currX);
                    }
                }
            }
        }
        this.A0j = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i >= arrayList.size()) {
                break;
            }
            AnonymousClass0MR A0a2 = AnonymousClass001.A0a(arrayList, i);
            if (A0a2.A04) {
                A0a2.A04 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.A0n;
            if (z) {
                AnonymousClass0YY.A07(this, runnable);
            } else {
                runnable.run();
            }
        }
    }

    public final boolean A0K(float f) {
        boolean z;
        boolean z2;
        this.A03 = f;
        float scrollX = ((float) getScrollX()) + (this.A03 - f);
        float A062 = (float) AnonymousClass000.A06(this, getMeasuredWidth());
        float f2 = this.A00 * A062;
        float f3 = this.A05 * A062;
        ArrayList arrayList = this.A0o;
        boolean z3 = false;
        AnonymousClass0MR A0a2 = AnonymousClass001.A0a(arrayList, 0);
        AnonymousClass0MR A0a3 = AnonymousClass001.A0a(arrayList, arrayList.size() - 1);
        if (A0a2.A02 != 0) {
            f2 = A0a2.A00 * A062;
            z = false;
        } else {
            z = true;
        }
        if (A0a3.A02 != this.A0V.A0C() - 1) {
            f3 = A0a3.A00 * A062;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.A0T.onPull(Math.abs(f2 - scrollX) / A062);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.A0U.onPull(Math.abs(scrollX - f3) / A062);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.A03 += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        A0M(i);
        return z3;
    }

    public final boolean A0M(int i) {
        if (this.A0o.size() == 0) {
            if (!this.A0e) {
                this.A0d = false;
                A0B(0, 0.0f, 0);
                if (!this.A0d) {
                    throw AnonymousClass001.A0e("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        AnonymousClass0MR A022 = A02();
        int A062 = AnonymousClass000.A06(this, getMeasuredWidth());
        int i2 = this.A0K;
        int i3 = A062 + i2;
        float f = (float) i2;
        float f2 = (float) A062;
        int i4 = A022.A02;
        float f3 = ((((float) i) / f2) - A022.A00) / (A022.A01 + (f / f2));
        this.A0d = false;
        A0B(i4, f3, (int) (((float) i3) * f3));
        if (this.A0d) {
            return true;
        }
        throw AnonymousClass001.A0e("onPageScrolled did not call superclass implementation");
    }

    public boolean A0N(View view, int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (A0N(childAt, i5, i6 - childAt.getLeft(), i4 - childAt.getTop(), true)) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.A0V == null) {
            return false;
        }
        int A062 = AnonymousClass000.A06(this, getMeasuredWidth());
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) A062) * this.A00))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) A062) * this.A05))) {
            return false;
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof AnonymousClass02a) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass02a();
    }

    public AnonymousClass0R4 getAdapter() {
        return this.A0V;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.A0D == 2) {
            i2 = (i - 1) - i2;
        }
        return ((AnonymousClass02a) AnonymousClass001.A0S(this.A0a, i2).getLayoutParams()).A01;
    }

    public int getCurrentItem() {
        return this.A0A;
    }

    public int getOffscreenPageLimit() {
        return this.A0J;
    }

    public int getPageMargin() {
        return this.A0K;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0n);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r11 = r19
            r18 = r20
            r0 = r18
            super.onDraw(r0)
            int r0 = r11.A0K
            if (r0 <= 0) goto L_0x0095
            android.graphics.drawable.Drawable r0 = r11.A0Q
            if (r0 == 0) goto L_0x0095
            java.util.ArrayList r12 = r11.A0o
            int r0 = r12.size()
            if (r0 <= 0) goto L_0x0095
            X.0R4 r0 = r11.A0V
            if (r0 == 0) goto L_0x0095
            int r10 = r11.getScrollX()
            int r9 = r11.getWidth()
            int r0 = r11.A0K
            float r8 = (float) r0
            float r7 = (float) r9
            float r8 = r8 / r7
            r6 = 0
            X.0MR r5 = X.AnonymousClass001.A0a(r12, r6)
            float r2 = r5.A00
            int r4 = r12.size()
            int r3 = r5.A02
            int r0 = r4 + -1
            X.0MR r0 = X.AnonymousClass001.A0a(r12, r0)
            int r0 = r0.A02
            r17 = r0
        L_0x0041:
            r0 = r17
            if (r3 >= r0) goto L_0x0095
        L_0x0045:
            int r0 = r5.A02
            if (r3 <= r0) goto L_0x0052
            if (r6 >= r4) goto L_0x0052
            int r6 = r6 + 1
            X.0MR r5 = X.AnonymousClass001.A0a(r12, r6)
            goto L_0x0045
        L_0x0052:
            if (r3 != r0) goto L_0x0088
            float r2 = r5.A00
            float r0 = r5.A01
            float r2 = r2 + r0
            float r16 = r2 * r7
            float r2 = r2 + r8
        L_0x005c:
            int r0 = r11.A0K
            float r0 = (float) r0
            float r0 = r0 + r16
            float r1 = (float) r10
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x007e
            android.graphics.drawable.Drawable r15 = r11.A0Q
            int r14 = java.lang.Math.round(r16)
            int r13 = r11.A0O
            int r1 = java.lang.Math.round(r0)
            int r0 = r11.A07
            r15.setBounds(r14, r13, r1, r0)
            android.graphics.drawable.Drawable r1 = r11.A0Q
            r0 = r18
            r1.draw(r0)
        L_0x007e:
            int r0 = r10 + r9
            float r0 = (float) r0
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0095
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0088:
            X.0R4 r0 = r11.A0V
            float r0 = r0.A01(r3)
            float r16 = r2 + r0
            float r16 = r16 * r7
            float r0 = r0 + r8
            float r2 = r2 + r0
            goto L_0x005c
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent2.getAction() & 255;
        if (action == 3 || action == 1) {
            A0J();
            return false;
        }
        if (action != 0) {
            if (this.A0g) {
                return true;
            }
            if (this.A0i) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent2.getX();
            this.A01 = x;
            this.A03 = x;
            float y = motionEvent2.getY();
            this.A02 = y;
            this.A04 = y;
            this.A06 = motionEvent2.getPointerId(0);
            this.A0i = false;
            this.A0h = true;
            this.mScroller.computeScrollOffset();
            if (this.A0N != 2 || AnonymousClass001.A0A(this.mScroller.getFinalX(), this.mScroller.getCurrX()) <= this.A09) {
                A0I(false);
                this.A0g = false;
            } else {
                this.mScroller.abortAnimation();
                this.A0j = false;
                A09(this.A0A);
                this.A0g = true;
                AnonymousClass001.A17(this);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.A06;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.A03;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float A002 = AnonymousClass002.A00(y2, this.A02);
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    float f3 = this.A03;
                    if ((f3 >= ((float) this.A0G) || f2 <= 0.0f) && (f3 <= ((float) (getWidth() - this.A0G)) || f2 >= 0.0f)) {
                        if (A0N(this, (int) f2, (int) x2, (int) y2, false)) {
                            this.A03 = x2;
                            this.A04 = y2;
                            this.A0i = true;
                            return false;
                        }
                    }
                }
                float f4 = (float) this.A0P;
                if (abs > f4 && abs * 0.5f > A002) {
                    this.A0g = true;
                    AnonymousClass001.A17(this);
                    setScrollState(1);
                    float f5 = this.A01;
                    float f6 = (float) this.A0P;
                    if (i2 > 0) {
                        f = f5 + f6;
                    } else {
                        f = f5 - f6;
                    }
                    this.A03 = f;
                    this.A04 = y2;
                    setScrollingCacheEnabled(true);
                } else if (A002 > f4) {
                    this.A0i = true;
                }
                if (this.A0g && A0K(x2)) {
                    AnonymousClass0YY.A05(this);
                }
            }
        } else if (action == 6) {
            A00(motionEvent2);
        }
        VelocityTracker velocityTracker = this.A0S;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.A0S = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent2);
        return this.A0g;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        AnonymousClass0MR A052;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                AnonymousClass02a r3 = (AnonymousClass02a) childAt.getLayoutParams();
                if (r3.A04) {
                    int i13 = r3.A02;
                    int i14 = i13 & 7;
                    int i15 = i13 & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    } else if (i14 == 3) {
                        i6 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i14 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i5 = (i9 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    }
                    if (i15 == 16) {
                        i7 = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i8 = paddingTop;
                        paddingTop = i7;
                    } else if (i15 == 48) {
                        i8 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i15 != 80) {
                        i8 = paddingTop;
                    } else {
                        i7 = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i8 = paddingTop;
                        paddingTop = i7;
                    }
                    int i16 = paddingLeft + scrollX;
                    childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i6;
                }
            }
        }
        int i17 = (i9 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                AnonymousClass02a r2 = (AnonymousClass02a) childAt2.getLayoutParams();
                if (!r2.A04 && (A052 = A05(childAt2)) != null) {
                    float f = (float) i17;
                    int i19 = ((int) (A052.A00 * f)) + paddingLeft;
                    if (r2.A05) {
                        r2.A05 = false;
                        AnonymousClass001.A19(childAt2, (i10 - paddingTop) - paddingBottom, 1073741824, View.MeasureSpec.makeMeasureSpec((int) (f * r2.A00), 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.A0O = paddingTop;
        this.A07 = i10 - paddingBottom;
        this.A0B = i11;
        if (this.A0e) {
            z2 = false;
            A0E(this.A0A, 0, false, false);
        } else {
            z2 = false;
        }
        this.A0e = z2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C009107e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C009107e r4 = (C009107e) parcelable;
        super.onRestoreInstanceState(r4.A00);
        AnonymousClass0R4 r2 = this.A0V;
        if (r2 != null) {
            r2.A08(r4.A01, r4.A02);
            A0D(r4.A00, 0, false, true);
            return;
        }
        this.A0M = r4.A00;
        this.A0R = r4.A01;
        this.A0Z = r4.A02;
    }

    public void removeView(View view) {
        if (this.A0f) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AnonymousClass0R4 r8) {
        ArrayList arrayList;
        AnonymousClass0R4 r0 = this.A0V;
        if (r0 != null) {
            synchronized (r0) {
                r0.A00 = null;
            }
            this.A0V.A0A(this);
            int i = 0;
            while (true) {
                arrayList = this.A0o;
                if (i >= arrayList.size()) {
                    break;
                }
                AnonymousClass0MR A0a2 = AnonymousClass001.A0a(arrayList, i);
                this.A0V.A0E(this, A0a2.A03, A0a2.A02);
                i++;
            }
            this.A0V.A09(this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((AnonymousClass02a) getChildAt(i2).getLayoutParams()).A04) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.A0A = 0;
            scrollTo(0, 0);
        }
        AnonymousClass0R4 r3 = this.A0V;
        this.A0V = r8;
        this.A0E = 0;
        if (r8 != null) {
            C000800q r1 = this.A0Y;
            if (r1 == null) {
                r1 = new C000800q(this);
                this.A0Y = r1;
            }
            AnonymousClass0R4 r02 = this.A0V;
            synchronized (r02) {
                r02.A00 = r1;
            }
            this.A0j = false;
            boolean z = this.A0e;
            this.A0e = true;
            this.A0E = this.A0V.A0C();
            if (this.A0M >= 0) {
                this.A0V.A08(this.A0R, this.A0Z);
                A0D(this.A0M, 0, false, true);
                this.A0M = -1;
                this.A0R = null;
                this.A0Z = null;
            } else if (!z) {
                A09(this.A0A);
            } else {
                requestLayout();
            }
        }
        List list = this.A0b;
        if (list != null && !list.isEmpty()) {
            int size = this.A0b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C16070sQ) this.A0b.get(i3)).BM4(r3, r8, this);
            }
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.A0K;
        this.A0K = i;
        int width = getWidth();
        A0C(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.A0Q = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        int i2;
        if (this.A0N != i) {
            this.A0N = i;
            if (this.A0X != null) {
                boolean A1S = AnonymousClass000.A1S(i);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (A1S) {
                        i2 = this.A0L;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, (Paint) null);
                }
            }
            C16870uA r0 = this.A0W;
            if (r0 != null) {
                r0.BXd(i);
            }
            List list = this.A0c;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C16870uA r02 = (C16870uA) this.A0c.get(i4);
                    if (r02 != null) {
                        r02.BXd(i);
                    }
                }
            }
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A07();
    }

    private void A00(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A06) {
            boolean A1T = AnonymousClass000.A1T(actionIndex);
            this.A03 = motionEvent.getX(A1T ? 1 : 0);
            this.A06 = motionEvent.getPointerId(A1T);
            VelocityTracker velocityTracker = this.A0S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private int getClientWidth() {
        return AnonymousClass000.A06(this, getMeasuredWidth());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0MR A02() {
        /*
            r12 = this;
            int r0 = r12.getMeasuredWidth()
            int r1 = X.AnonymousClass000.A06(r12, r0)
            r9 = 0
            if (r1 <= 0) goto L_0x0061
            int r0 = r12.getScrollX()
            float r7 = (float) r0
            float r1 = (float) r1
            float r7 = r7 / r1
            int r0 = r12.A0K
            float r6 = (float) r0
            float r6 = r6 / r1
        L_0x0016:
            r11 = 1
            r10 = 0
            r8 = 0
            r1 = -1
            r5 = 0
            r4 = 1
        L_0x001c:
            java.util.ArrayList r3 = r12.A0o
            int r0 = r3.size()
            if (r5 >= r0) goto L_0x0065
            X.0MR r2 = X.AnonymousClass001.A0a(r3, r5)
            if (r4 != 0) goto L_0x0042
            int r0 = r2.A02
            int r1 = r1 + 1
            if (r0 == r1) goto L_0x0042
            X.0MR r2 = r12.A0m
            float r9 = r9 + r8
            float r9 = r9 + r6
            r2.A00 = r9
            r2.A02 = r1
            X.0R4 r0 = r12.A0V
            float r0 = r0.A01(r1)
            r2.A01 = r0
            int r5 = r5 + -1
        L_0x0042:
            float r9 = r2.A00
            float r8 = r2.A01
            float r1 = r8 + r9
            float r1 = r1 + r6
            if (r4 != 0) goto L_0x004f
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
        L_0x004f:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0064
            int r0 = r3.size()
            int r0 = r0 - r11
            if (r5 == r0) goto L_0x0064
            int r1 = r2.A02
            int r5 = r5 + 1
            r4 = 0
            r10 = r2
            goto L_0x001c
        L_0x0061:
            r7 = 0
            r6 = 0
            goto L_0x0016
        L_0x0064:
            return r2
        L_0x0065:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A02():X.0MR");
    }

    public final void A0E(int i, int i2, boolean z, boolean z2) {
        int i3;
        int scrollX;
        int A012;
        AnonymousClass0MR A032 = A03(i);
        if (A032 != null) {
            i3 = (int) (((float) AnonymousClass000.A06(this, getMeasuredWidth())) * AnonymousClass001.A01(A032.A00, this.A05, this.A00));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.mScroller;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    boolean z3 = this.A0h;
                    Scroller scroller2 = this.mScroller;
                    if (z3) {
                        scrollX = scroller2.getCurrX();
                    } else {
                        scrollX = scroller2.getStartX();
                    }
                    this.mScroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = -scrollY;
                if (i4 == 0 && i5 == 0) {
                    A0I(false);
                    A09(this.A0A);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int A062 = AnonymousClass000.A06(this, getMeasuredWidth());
                    int i6 = A062 / 2;
                    float abs = (float) Math.abs(i4);
                    float f = (float) A062;
                    float A022 = AnonymousClass001.A02((abs * 1.0f) / f, i6);
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        A012 = AnonymousClass001.A09(abs2, A022);
                    } else {
                        A012 = (int) (((abs / ((f * this.A0V.A01(this.A0A)) + ((float) this.A0K))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(A012, 600);
                    this.A0h = false;
                    this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
                    AnonymousClass0YY.A05(this);
                }
            }
            if (z2) {
                A0A(i);
                return;
            }
            return;
        }
        if (z2) {
            A0A(i);
        }
        A0I(false);
        scrollTo(i3, 0);
        A0M(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r1 >= r0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r1 <= r0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r6 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if (r8 != 2) goto L_0x0080;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(int r8) {
        /*
            r7 = this;
            android.view.View r4 = r7.findFocus()
            r3 = 1
            r6 = 0
            r5 = 0
            if (r4 == r7) goto L_0x004b
            if (r4 == 0) goto L_0x004c
            android.view.ViewParent r1 = r4.getParent()
        L_0x000f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001a
            if (r1 == r7) goto L_0x004c
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x000f
        L_0x001a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A1A(r4, r2)
            android.view.ViewParent r1 = r4.getParent()
        L_0x0025:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = " => "
            r2.append(r0)
            X.AnonymousClass000.A1A(r1, r2)
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0025
        L_0x0036:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            r1.append(r0)
            X.AnonymousClass000.A1B(r2, r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewPager"
            android.util.Log.e(r0, r1)
        L_0x004b:
            r4 = r5
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r7, r4, r8)
            r1 = 66
            r0 = 17
            if (r5 == 0) goto L_0x009d
            if (r5 == r4) goto L_0x009d
            if (r8 != r0) goto L_0x0081
            android.graphics.Rect r2 = r7.A0l
            android.graphics.Rect r0 = r7.A01(r2, r5)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A01(r2, r4)
            int r0 = r0.left
            if (r4 == 0) goto L_0x0096
            if (r1 < r0) goto L_0x0096
        L_0x0070:
            int r0 = r7.A0A
            if (r0 <= 0) goto L_0x0080
            int r0 = r0 - r3
        L_0x0075:
            r7.A0F(r0, r3)
            r6 = 1
        L_0x0079:
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r0)
        L_0x0080:
            return r6
        L_0x0081:
            if (r8 != r1) goto L_0x0080
            android.graphics.Rect r2 = r7.A0l
            android.graphics.Rect r0 = r7.A01(r2, r5)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A01(r2, r4)
            int r0 = r0.left
            if (r4 == 0) goto L_0x0096
            if (r1 > r0) goto L_0x0096
            goto L_0x00a6
        L_0x0096:
            boolean r6 = r5.requestFocus()
            if (r6 == 0) goto L_0x0080
            goto L_0x0079
        L_0x009d:
            if (r8 == r0) goto L_0x0070
            if (r8 == r3) goto L_0x0070
            if (r8 == r1) goto L_0x00a6
            r0 = 2
            if (r8 != r0) goto L_0x0080
        L_0x00a6:
            X.0R4 r0 = r7.A0V
            if (r0 == 0) goto L_0x0080
            int r1 = r7.A0A
            int r0 = r0.A0C()
            int r0 = r0 - r3
            if (r1 >= r0) goto L_0x0080
            int r0 = r7.A0A
            int r0 = r0 + 1
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0L(int):boolean");
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        AnonymousClass0MR A052;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new AnonymousClass02a();
        }
        AnonymousClass02a r3 = (AnonymousClass02a) layoutParams;
        boolean A1W = r3.A04 | AnonymousClass000.A1W(view.getClass().getAnnotation(DecorView.class));
        r3.A04 = A1W;
        if (!this.A0f) {
            super.addView(view, i, layoutParams);
        } else if (!A1W) {
            r3.A05 = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw AnonymousClass001.A0e("Cannot add pager decor view during layout");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        boolean A0L2;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        int i2 = 2;
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode != 61) {
                    return false;
                }
                if (!keyEvent.hasNoModifiers()) {
                    i2 = 1;
                    if (!keyEvent.hasModifiers(1)) {
                        return false;
                    }
                }
                A0L2 = A0L(i2);
            } else if (keyEvent.hasModifiers(2)) {
                AnonymousClass0R4 r0 = this.A0V;
                if (r0 == null || this.A0A >= r0.A0C() - 1) {
                    return false;
                }
                A0F(this.A0A + 1, true);
                return true;
            } else {
                i = 66;
                A0L2 = A0L(i);
            }
        } else if (keyEvent.hasModifiers(2)) {
            int i3 = this.A0A;
            if (i3 <= 0) {
                return false;
            }
            A0F(i3 - 1, true);
            return true;
        } else {
            i = 17;
            A0L2 = A0L(i);
        }
        if (A0L2) {
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AnonymousClass0MR A052;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        AnonymousClass0R4 r0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (r0 = this.A0V) != null && r0.A0C() > 1)) {
            if (!this.A0T.isFinished()) {
                int save = canvas.save();
                int A052 = AnonymousClass000.A05(this, getHeight());
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-A052) + getPaddingTop()), this.A00 * ((float) width));
                this.A0T.setSize(A052, width);
                z = false | this.A0T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.A0U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int A053 = AnonymousClass000.A05(this, getHeight());
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.A05 + 1.0f)) * ((float) width2));
                this.A0U.setSize(A053, width2);
                z |= this.A0U.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                AnonymousClass0YY.A05(this);
                return;
            }
            return;
        }
        this.A0T.finish();
        this.A0U.finish();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0Q;
        if (drawable != null) {
            AnonymousClass000.A0t(drawable, this);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass02a(getContext(), attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0e = true;
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        AnonymousClass0MR A052;
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 1;
        if ((i & 2) == 0) {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (A052 = A05(childAt)) != null && A052.A02 == this.A0A && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public Parcelable onSaveInstanceState() {
        C009107e r1 = new C009107e(super.onSaveInstanceState());
        r1.A00 = this.A0A;
        AnonymousClass0R4 r0 = this.A0V;
        if (r0 != null) {
            r1.A01 = r0.A03();
        }
        return r1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0K;
            A0C(i, i3, i5, i5);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0Q) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void setOnPageChangeListener(C16870uA r1) {
        this.A0W = r1;
    }

    public ViewPager(Context context) {
        super(context);
        A07();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass02a();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(AnonymousClass0RP.A00(getContext(), i));
    }
}
