package com.google.android.material.appbar;

import X.AnonymousClass001;
import X.AnonymousClass0YY;
import X.AnonymousClass7GQ;
import X.AnonymousClass7TO;
import X.C04910Rd;
import X.C125086Fc;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public int A00 = -1;
    public int A01;
    public int A02 = -1;
    public VelocityTracker A03;
    public OverScroller A04;
    public Runnable A05;
    public boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r10.A0F(r9, r4, r3) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(android.view.MotionEvent r8, android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10) {
        /*
            r7 = this;
            int r0 = r7.A02
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r10.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.A02 = r0
        L_0x0012:
            int r1 = r8.getActionMasked()
            r0 = 2
            r6 = 1
            r5 = -1
            r2 = 0
            if (r1 != r0) goto L_0x003c
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x003c
            int r0 = r7.A00
            if (r0 == r5) goto L_0x00a0
            int r0 = r8.findPointerIndex(r0)
            if (r0 == r5) goto L_0x00a0
            float r0 = r8.getY(r0)
            int r3 = (int) r0
            int r0 = r7.A01
            int r1 = X.AnonymousClass001.A0A(r3, r0)
            int r0 = r7.A02
            if (r1 <= r0) goto L_0x003c
            r7.A01 = r3
            return r6
        L_0x003c:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0099
            r7.A00 = r5
            float r0 = r8.getX()
            int r4 = (int) r0
            float r0 = r8.getY()
            int r3 = (int) r0
            r1 = r7
            boolean r0 = r7 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L_0x0072
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r1 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r1
            java.lang.ref.WeakReference r0 = r1.A04
            if (r0 == 0) goto L_0x006b
            android.view.View r1 = X.C86664Kz.A0j(r0)
            if (r1 == 0) goto L_0x0072
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1.canScrollVertically(r5)
            if (r0 != 0) goto L_0x0072
        L_0x006b:
            boolean r1 = r10.A0F(r9, r4, r3)
            r0 = 1
            if (r1 != 0) goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            r7.A06 = r0
            if (r0 == 0) goto L_0x0099
            r7.A01 = r3
            int r0 = r8.getPointerId(r2)
            r7.A00 = r0
            android.view.VelocityTracker r0 = r7.A03
            if (r0 != 0) goto L_0x0089
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A03 = r0
        L_0x0089:
            android.widget.OverScroller r0 = r7.A04
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0099
            android.widget.OverScroller r0 = r7.A04
            r0.abortAnimation()
            return r6
        L_0x0099:
            android.view.VelocityTracker r0 = r7.A03
            if (r0 == 0) goto L_0x00a0
            r0.addMovement(r8)
        L_0x00a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0E(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0F(android.view.MotionEvent r20, android.view.View r21, androidx.coordinatorlayout.widget.CoordinatorLayout r22) {
        /*
            r19 = this;
            r4 = r20
            r5 = r21
            int r1 = r4.getActionMasked()
            r6 = -1
            r3 = 1
            r11 = 0
            r2 = r19
            r7 = r22
            if (r1 == r3) goto L_0x0073
            r0 = 2
            if (r1 == r0) goto L_0x0042
            r0 = 3
            if (r1 == r0) goto L_0x0109
            r0 = 6
            if (r1 != r0) goto L_0x0032
            int r0 = r4.getActionIndex()
            boolean r1 = X.AnonymousClass000.A1T(r0)
            int r0 = r4.getPointerId(r1)
            r2.A00 = r0
            float r1 = r4.getY(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A01 = r0
        L_0x0032:
            r1 = 0
        L_0x0033:
            android.view.VelocityTracker r0 = r2.A03
            if (r0 == 0) goto L_0x003a
            r0.addMovement(r4)
        L_0x003a:
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0041
            if (r1 != 0) goto L_0x0041
            r3 = 0
        L_0x0041:
            return r3
        L_0x0042:
            int r0 = r2.A00
            int r0 = r4.findPointerIndex(r0)
            if (r0 != r6) goto L_0x004b
            return r11
        L_0x004b:
            float r0 = r4.getY(r0)
            int r0 = (int) r0
            int r1 = r2.A01
            int r1 = r1 - r0
            r2.A01 = r0
            boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r0 == 0) goto L_0x006e
            r0 = r5
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
        L_0x0060:
            int r0 = -r0
            int r9 = r2.A0K()
            int r9 = r9 - r1
            r8 = r7
            r10 = r0
            r6 = r2
            r7 = r5
            r6.A0L(r7, r8, r9, r10, r11)
            goto L_0x0032
        L_0x006e:
            int r0 = r5.getHeight()
            goto L_0x0060
        L_0x0073:
            android.view.VelocityTracker r0 = r2.A03
            if (r0 == 0) goto L_0x0109
            r0.addMovement(r4)
            android.view.VelocityTracker r1 = r2.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            android.view.VelocityTracker r1 = r2.A03
            int r0 = r2.A00
            float r9 = r1.getYVelocity(r0)
            boolean r1 = r2 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
            if (r1 == 0) goto L_0x0104
            r0 = r5
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getTotalScrollRange()
        L_0x0094:
            int r8 = -r0
            java.lang.Runnable r0 = r2.A05
            if (r0 == 0) goto L_0x009f
            r5.removeCallbacks(r0)
            r0 = 0
            r2.A05 = r0
        L_0x009f:
            android.widget.OverScroller r10 = r2.A04
            if (r10 != 0) goto L_0x00ae
            android.content.Context r0 = r5.getContext()
            android.widget.OverScroller r10 = new android.widget.OverScroller
            r10.<init>(r0)
            r2.A04 = r10
        L_0x00ae:
            X.7TO r0 = r2.A01
            if (r0 == 0) goto L_0x0102
            int r12 = r0.A02
        L_0x00b4:
            int r14 = java.lang.Math.round(r9)
            r15 = r11
            r16 = r11
            r18 = r11
            r13 = r11
            r17 = r8
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r2.A04
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00e8
            r1 = 11
            X.8Mj r0 = new X.8Mj
            r0.<init>(r5, r7, r2, r1)
            r2.A05 = r0
            X.AnonymousClass0YY.A07(r5, r0)
        L_0x00d7:
            r1 = 1
        L_0x00d8:
            r2.A06 = r11
            r2.A00 = r6
            android.view.VelocityTracker r0 = r2.A03
            if (r0 == 0) goto L_0x0033
            r0.recycle()
            r0 = 0
            r2.A03 = r0
            goto L_0x0033
        L_0x00e8:
            if (r1 == 0) goto L_0x00d7
            r0 = r2
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            r0.A0P(r7, r5)
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x00d7
            android.view.View r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.A00(r7)
            boolean r0 = r5.A03(r0)
            r5.A04(r0)
            goto L_0x00d7
        L_0x0102:
            r12 = 0
            goto L_0x00b4
        L_0x0104:
            int r0 = r5.getHeight()
            goto L_0x0094
        L_0x0109:
            r1 = 0
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0F(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public int A0K() {
        int i;
        if (this instanceof AppBarLayout.BaseBehavior) {
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
            AnonymousClass7TO r0 = baseBehavior.A01;
            if (r0 != null) {
                i = r0.A02;
            } else {
                i = 0;
            }
            return i + baseBehavior.A01;
        }
        AnonymousClass7TO r02 = this.A01;
        if (r02 != null) {
            return r02.A02;
        }
        return 0;
    }

    public int A0L(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7 = i2;
        View view2 = view;
        int i8 = i;
        int i9 = i3;
        if (this instanceof AppBarLayout.BaseBehavior) {
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            int A0K = baseBehavior.A0K();
            int i10 = 0;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            if (i2 == 0 || A0K < i7 || A0K > i9) {
                baseBehavior.A01 = 0;
            } else {
                if (i8 >= i7) {
                    i7 = i8;
                    if (i8 > i9) {
                        i7 = i9;
                    }
                }
                if (A0K != i7) {
                    int i11 = i7;
                    if (appBarLayout.A0D) {
                        int abs = Math.abs(i7);
                        int childCount = appBarLayout.getChildCount();
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i13);
                            C125086Fc r8 = (C125086Fc) childAt.getLayoutParams();
                            Interpolator interpolator = r8.A01;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i13++;
                            } else if (interpolator != null) {
                                int i14 = r8.A00;
                                if ((i14 & 1) != 0) {
                                    i12 = childAt.getHeight() + r8.topMargin + r8.bottomMargin;
                                    if ((i14 & 2) != 0) {
                                        i12 -= AnonymousClass0YY.A01(childAt);
                                    }
                                }
                                if (AnonymousClass0YY.A0B(childAt)) {
                                    i12 -= appBarLayout.getTopInset();
                                }
                                if (i12 > 0) {
                                    float f = (float) i12;
                                    i11 = Integer.signum(i7) * (childAt.getTop() + AnonymousClass001.A07(f, interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                                }
                            }
                        }
                    }
                    AnonymousClass7TO r1 = baseBehavior.A01;
                    if (r1 != null) {
                        if (r1.A02 != i11) {
                            r1.A02 = i11;
                            r1.A00();
                            z = true;
                        }
                        z = false;
                    } else {
                        baseBehavior.A00 = i11;
                        z = false;
                    }
                    int i15 = A0K - i7;
                    baseBehavior.A01 = i7 - i11;
                    if (z) {
                        while (i10 < appBarLayout.getChildCount()) {
                            C125086Fc r0 = (C125086Fc) appBarLayout.getChildAt(i10).getLayoutParams();
                            AnonymousClass7GQ r7 = r0.A02;
                            if (!(r7 == null || (r0.A00 & 1) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i10);
                                AnonymousClass7TO r02 = baseBehavior.A01;
                                if (r02 != null) {
                                    i5 = r02.A02;
                                } else {
                                    i5 = 0;
                                }
                                Rect rect = r7.A01;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) rect.top) - Math.abs((float) i5);
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / ((float) rect.height()));
                                    if (abs3 < 0.0f) {
                                        abs3 = 0.0f;
                                    } else if (abs3 > 1.0f) {
                                        abs3 = 1.0f;
                                    }
                                    float f2 = 1.0f - abs3;
                                    float height = (-abs2) - ((((float) rect.height()) * 0.3f) * (1.0f - (f2 * f2)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = r7.A00;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    C04910Rd.A01(childAt2, rect2);
                                } else {
                                    C04910Rd.A01(childAt2, (Rect) null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                            i10++;
                        }
                    } else if (appBarLayout.A0D) {
                        coordinatorLayout2.A0A(appBarLayout);
                    }
                    AnonymousClass7TO r03 = baseBehavior.A01;
                    if (r03 != null) {
                        i6 = r03.A02;
                    } else {
                        i6 = 0;
                    }
                    appBarLayout.A01(i6);
                    int i16 = 1;
                    if (i7 < A0K) {
                        i16 = -1;
                    }
                    baseBehavior.A0S(coordinatorLayout2, appBarLayout, i7, i16, false);
                    i10 = i15;
                }
            }
            baseBehavior.A0Q(coordinatorLayout2, appBarLayout);
            return i10;
        }
        AnonymousClass7TO r2 = this.A01;
        if (r2 != null) {
            i4 = r2.A02;
        } else {
            i4 = 0;
        }
        if (i2 == 0 || i4 < i7 || i4 > i9) {
            return 0;
        }
        if (i8 >= i7) {
            i7 = i8;
            if (i8 > i9) {
                i7 = i9;
            }
        }
        if (i4 == i7) {
            return 0;
        }
        if (r2 == null) {
            this.A00 = i7;
        } else if (r2.A02 != i7) {
            r2.A02 = i7;
            r2.A00();
        }
        return i4 - i7;
    }

    public void A0M(View view, CoordinatorLayout coordinatorLayout, int i) {
        A0L(view, coordinatorLayout, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeaderBehavior() {
    }
}
