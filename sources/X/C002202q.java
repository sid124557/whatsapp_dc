package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.02q  reason: invalid class name and case insensitive filesystem */
public final class C002202q extends ViewGroup implements C14980qa {
    public int A00 = -1;
    public int A01;
    public View A02;
    public AnonymousClass0J8 A03;
    public C03490Kk A04;
    public AnonymousClass0OC A05;
    public C16290sm A06;
    public AnonymousClass0UZ A07;
    public List A08;
    public boolean A09 = true;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = true;
    public C16290sm[] A0G;
    public final AnonymousClass0L7 A0H = new AnonymousClass0L7();
    public final boolean A0I = true;

    public C002202q(Context context) {
        super(context);
        C01730Bz r2 = new C01730Bz(this);
        if (this.A07 == null) {
            this.A07 = new AnonymousClass0UZ(getContext(), this, r2);
        }
    }

    public void A03(C16290sm[] r5, boolean z) {
        this.A0G = (C16290sm[]) Arrays.copyOf(r5, r5.length);
        C16290sm r1 = this.A06;
        if (r1 != null) {
            if (this.A02 == null) {
                this.A06 = null;
                r1 = null;
            } else {
                int height = getHeight();
                List emptyList = Collections.emptyList();
                View view = this.A02;
                r1 = A01(view, emptyList, this.A06.BBV(view, height), height);
                this.A06 = r1;
            }
        }
        if (z) {
            if (r1 == null) {
                List emptyList2 = Collections.emptyList();
                View view2 = this.A02;
                if (view2 != null && C06360Xi.A05(view2)) {
                    int height2 = getHeight();
                    r1 = A01(view2, emptyList2, height2 - view2.getTop(), height2);
                    if (r1 == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            A02(r1, this.A00);
        }
    }

    public static void A00(AnonymousClass0UZ r7) {
        VelocityTracker velocityTracker = r7.A07;
        float f = r7.A00;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = r7.A07.getXVelocity(r7.A02);
        float f2 = r7.A01;
        float f3 = f;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            f3 = 0.0f;
        } else if (abs <= f) {
            f3 = xVelocity;
        } else if (xVelocity <= 0.0f) {
            f3 = -f;
        }
        float yVelocity = r7.A07.getYVelocity(r7.A02);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        r7.A03(f3, f);
    }

    public final C16290sm A01(View view, List list, int i, int i2) {
        int A0A2;
        C16290sm[] r6 = this.A0G;
        C16290sm r5 = null;
        if (!(r6 == null || view == null)) {
            int i3 = Integer.MAX_VALUE;
            for (C16290sm r1 : r6) {
                if (!list.contains(r1) && (A0A2 = AnonymousClass001.A0A(r1.BBV(view, i2), i)) < i3) {
                    r5 = r1;
                    i3 = A0A2;
                }
            }
        }
        return r5;
    }

    public void A02(C16290sm r5, int i) {
        View view = this.A02;
        if (view != null) {
            this.A06 = r5;
            C12730m2 r3 = new C12730m2(view, this, i);
            if (C06360Xi.A05(this)) {
                r3.run();
                return;
            }
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new C18190wt(this, viewTreeObserver, r3, 1));
        }
    }

    public final boolean A04(int i, int i2) {
        int i3;
        View view = this.A02;
        if (getNestedScrollAxes() == 1) {
            if (i2 == 0 || ((float) (Math.abs(i) / Math.abs(i2))) > 0.7f) {
                return false;
            }
        } else if (view == null) {
            return false;
        } else {
            int height = getHeight();
            C16290sm[] r1 = this.A0G;
            if (r1 == null || r1.length <= 0) {
                i3 = 0;
            } else {
                i3 = height - r1[0].BBV(view, height);
                int length = this.A0G.length;
                for (int i4 = 1; i4 < length; i4++) {
                    i3 = Math.min(i3, height - this.A0G[i4].BBV(view, height));
                }
            }
            if (view.getBottom() <= height || view.getTop() <= i3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r3.A0A.isFinished() == false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r10 = this;
            X.0UZ r3 = r10.A07
            int r0 = r3.A03
            r6 = 0
            r2 = 2
            if (r0 != r2) goto L_0x0059
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L_0x0060
            android.widget.Scroller r0 = r3.A0A
            boolean r1 = r0.computeScrollOffset()
            android.widget.Scroller r0 = r3.A0A
            int r7 = r0.getCurrY()
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r0 = r7 - r0
            if (r0 <= 0) goto L_0x0061
            int r0 = r3.A04
            int r7 = java.lang.Math.min(r7, r0)
        L_0x0028:
            android.view.View r0 = r3.A08
            int r0 = r0.getTop()
            int r9 = r7 - r0
            if (r9 == 0) goto L_0x003f
            android.view.View r0 = r3.A08
            r0.offsetTopAndBottom(r9)
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r4 = r3.A0H
            android.view.View r5 = r3.A08
            r8 = r6
            r4.A05(r5, r6, r7, r8, r9)
        L_0x003f:
            if (r1 == 0) goto L_0x0052
            int r0 = r3.A04
            if (r7 != r0) goto L_0x0059
            android.widget.Scroller r0 = r3.A0A
            r0.abortAnimation()
            android.widget.Scroller r0 = r3.A0A
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0059
        L_0x0052:
            android.view.ViewGroup r1 = r3.A0G
            java.lang.Runnable r0 = r3.A0I
            r1.post(r0)
        L_0x0059:
            int r0 = r3.A03
            if (r0 != r2) goto L_0x0060
            X.AnonymousClass0YY.A05(r10)
        L_0x0060:
            return
        L_0x0061:
            if (r0 >= 0) goto L_0x0028
            int r0 = r3.A04
            int r7 = java.lang.Math.max(r7, r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002202q.computeScroll():void");
    }

    public int getNestedScrollAxes() {
        AnonymousClass0L7 r0 = this.A0H;
        return r0.A01 | r0.A00;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View A002;
        if (this.A0C) {
            if (this.A0E || !this.A09) {
                return false;
            }
            AnonymousClass0UZ r3 = this.A07;
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                r3.A01();
            }
            VelocityTracker velocityTracker = r3.A07;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                r3.A07 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (r3.A0C == null || r3.A0D == null) {
                            r3.A06(motionEvent.getPointerId(0), motionEvent.getX(), motionEvent.getY());
                        }
                        int pointerCount = motionEvent.getPointerCount();
                        for (int i = 0; i < pointerCount; i++) {
                            int pointerId = motionEvent.getPointerId(i);
                            if (((1 << pointerId) & r3.A05) != 0) {
                                motionEvent.getX(i);
                                float y = motionEvent.getY(i);
                                float f = r3.A0C[pointerId];
                                float f2 = r3.A0D[pointerId];
                                float f3 = y - f2;
                                if (r3.A03 != 1) {
                                    View A003 = r3.A00((int) f, (int) f2);
                                    if (A003 != null && r3.A0H.A00(A003) > 0 && Math.abs(f3) > ((float) r3.A06) && r3.A0A(A003, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        r3.A08(motionEvent);
                    } else if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId2 = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            r3.A06(pointerId2, x, y2);
                            if (r3.A03 == 2 && (A002 = r3.A00((int) x, (int) y2)) == r3.A08) {
                                r3.A0A(A002, pointerId2);
                            }
                        } else if (actionMasked == 6) {
                            r3.A05(motionEvent.getPointerId(actionIndex));
                        }
                    }
                }
                r3.A01();
            } else {
                float x2 = motionEvent.getX();
                float y3 = motionEvent.getY();
                int pointerId3 = motionEvent.getPointerId(0);
                r3.A06(pointerId3, x2, y3);
                View A004 = r3.A00((int) x2, (int) y3);
                if (A004 == r3.A08 && r3.A03 == 2) {
                    r3.A0A(A004, pointerId3);
                }
            }
            if (r3.A03 == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        C16290sm r1;
        View view = this.A02;
        if (view != null) {
            if (!this.A0F) {
                height = view.getTop();
            } else {
                height = getHeight();
            }
            int measuredHeight = view.getMeasuredHeight() + height;
            if (this.A0I) {
                measuredHeight = Math.max(getHeight(), measuredHeight);
            }
            view.layout(0, height, getWidth(), measuredHeight);
            boolean A1X = AnonymousClass001.A1X(view.getMeasuredHeight(), this.A01);
            this.A01 = view.getMeasuredHeight();
            if ((z || A1X) && (r1 = this.A06) != null) {
                A02(r1, this.A00);
            }
            AnonymousClass0OC r12 = this.A05;
            if (r12 != null) {
                r12.A00(view, getHeight());
            }
            this.A0F = false;
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A09 || z) {
            return false;
        }
        AnonymousClass0UZ r5 = this.A07;
        View view2 = this.A02;
        r5.A08 = view2;
        r5.A0B = true;
        r5.A0H.A04(view2, 0.0f, -f2);
        r5.A0B = false;
        if (r5.A03 != 1) {
            return true;
        }
        r5.A04(0);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.A09 || !A04((int) f, (int) f2)) {
            return false;
        }
        AnonymousClass0UZ r5 = this.A07;
        View view2 = this.A02;
        r5.A08 = view2;
        r5.A0B = true;
        r5.A0H.A04(view2, 0.0f, -f2);
        r5.A0B = false;
        if (r5.A03 != 1) {
            return true;
        }
        r5.A04(0);
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (this.A09 && A04(i, i2)) {
            AnonymousClass0UZ r5 = this.A07;
            int i3 = -i;
            int i4 = -i2;
            View view2 = r5.A08;
            if (view2 != null) {
                int left = view2.getLeft() + i3;
                int top = r5.A08.getTop() + i4;
                r5.A07(i3, i4);
                View view3 = r5.A08;
                if (!(view3 == null || iArr == null)) {
                    iArr[0] = (left - view3.getLeft()) - i3;
                    iArr[1] = (top - r5.A08.getTop()) - i4;
                }
            }
            if (getNestedScrollAxes() == 1 && iArr[1] != 0) {
                iArr[0] = i;
            }
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A09) {
            AnonymousClass0UZ r3 = this.A07;
            int i5 = -i3;
            int i6 = -i4;
            View view2 = r3.A08;
            if (view2 != null) {
                view2.getLeft();
                r3.A08.getTop();
                r3.A07(i5, i6);
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0H.A01 = i;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z = false;
        if (!this.A0E) {
            z = true;
            this.A0E = true;
            AnonymousClass0UZ r2 = this.A07;
            View view3 = this.A02;
            if (r2.A07 == null) {
                r2.A07 = VelocityTracker.obtain();
            }
            r2.A04(1);
            r2.A08 = view3;
        }
        return z;
    }

    public void onStopNestedScroll(View view) {
        this.A0H.A01 = 0;
        this.A0E = false;
        AnonymousClass0UZ r2 = this.A07;
        r2.A08 = this.A02;
        if (r2.A03 != 2) {
            r2.A03(0.0f, 0.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r5.A02 == -1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0074, code lost:
        A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        if (r2 > ((float) r6.getBottom())) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bc, code lost:
        if (r1 != 3) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.A0C
            r7 = 1
            if (r0 == 0) goto L_0x01e8
            android.view.View r6 = r10.A02
            if (r6 != 0) goto L_0x000c
            boolean r0 = r10.A0A
            return r0
        L_0x000c:
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x007a
            X.0UZ r5 = r10.A07
            int r2 = r11.getActionMasked()
            int r1 = r11.getActionIndex()
            if (r2 != 0) goto L_0x001f
            r5.A01()
        L_0x001f:
            android.view.VelocityTracker r0 = r5.A07
            if (r0 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r5.A07 = r0
        L_0x0029:
            r0.addMovement(r11)
            r8 = 0
            if (r2 == 0) goto L_0x01ce
            if (r2 == r7) goto L_0x01c2
            r0 = 2
            r3 = -1
            if (r2 == r0) goto L_0x0132
            r0 = 3
            if (r2 == r0) goto L_0x0128
            r0 = 5
            if (r2 == r0) goto L_0x00eb
            r0 = 6
            if (r2 != r0) goto L_0x007a
            int r2 = r11.getPointerId(r1)
            int r0 = r5.A03
            if (r0 != r7) goto L_0x0077
            int r0 = r5.A02
            if (r2 != r0) goto L_0x0077
            int r4 = r11.getPointerCount()
        L_0x004e:
            if (r8 >= r4) goto L_0x0074
            int r9 = r11.getPointerId(r8)
            int r0 = r5.A02
            if (r9 == r0) goto L_0x00e7
            float r1 = r11.getX(r8)
            float r0 = r11.getY(r8)
            int r1 = (int) r1
            int r0 = (int) r0
            android.view.View r1 = r5.A00(r1, r0)
            android.view.View r0 = r5.A08
            if (r1 != r0) goto L_0x00e7
            boolean r0 = r5.A0A(r0, r9)
            if (r0 == 0) goto L_0x00e7
            int r0 = r5.A02
            if (r0 != r3) goto L_0x0077
        L_0x0074:
            A00(r5)
        L_0x0077:
            r5.A05(r2)
        L_0x007a:
            float r0 = r11.getX()
            int r2 = java.lang.Math.round(r0)
            float r0 = r11.getY()
            int r0 = java.lang.Math.round(r0)
            int r1 = r11.getActionMasked()
            float r3 = (float) r2
            float r2 = (float) r0
            int r0 = r6.getLeft()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
            int r0 = r6.getRight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00b5
            int r0 = r6.getTop()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
            int r0 = r6.getBottom()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            r2 = 0
            if (r1 == 0) goto L_0x00e2
            if (r1 == r7) goto L_0x00c6
            r0 = 3
            if (r1 == r0) goto L_0x00df
        L_0x00be:
            if (r3 != 0) goto L_0x01e8
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x01e8
            r7 = 0
            return r7
        L_0x00c6:
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            X.0Kk r0 = r10.A04
            if (r0 == 0) goto L_0x00df
            X.00P r1 = r0.A00
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x00df
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00df
            X.0FG r0 = X.AnonymousClass0FG.TOUCH_OUTSIDE
            r1.A03(r0)
        L_0x00df:
            r10.A0D = r2
            goto L_0x00be
        L_0x00e2:
            r0 = r3 ^ 1
            r10.A0D = r0
            goto L_0x00be
        L_0x00e7:
            int r8 = r8 + 1
            goto L_0x004e
        L_0x00eb:
            int r4 = r11.getPointerId(r1)
            float r2 = r11.getX(r1)
            float r1 = r11.getY(r1)
            r5.A06(r4, r2, r1)
            int r0 = r5.A03
            int r3 = (int) r2
            int r2 = (int) r1
            if (r0 != 0) goto L_0x0109
            android.view.View r0 = r5.A00(r3, r2)
        L_0x0104:
            r5.A0A(r0, r4)
            goto L_0x007a
        L_0x0109:
            android.view.View r1 = r5.A08
            if (r1 == 0) goto L_0x007a
            int r0 = r1.getLeft()
            if (r3 < r0) goto L_0x007a
            int r0 = r1.getRight()
            if (r3 >= r0) goto L_0x007a
            int r0 = r1.getTop()
            if (r2 < r0) goto L_0x007a
            int r0 = r1.getBottom()
            if (r2 >= r0) goto L_0x007a
            android.view.View r0 = r5.A08
            goto L_0x0104
        L_0x0128:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x01c9
            r0 = 0
            r5.A03(r0, r0)
            goto L_0x01c9
        L_0x0132:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x0163
            int r2 = r5.A02
            int r1 = r5.A05
            int r0 = r7 << r2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x007a
            int r0 = r11.findPointerIndex(r2)
            if (r0 == r3) goto L_0x007a
            float r1 = r11.getX(r0)
            float r3 = r11.getY(r0)
            float[] r0 = r5.A0E
            int r2 = r5.A02
            r0 = r0[r2]
            float r1 = r1 - r0
            int r1 = (int) r1
            float[] r0 = r5.A0F
            r0 = r0[r2]
            float r3 = r3 - r0
            int r0 = (int) r3
            r5.A07(r1, r0)
        L_0x015e:
            r5.A08(r11)
            goto L_0x007a
        L_0x0163:
            float[] r0 = r5.A0C
            if (r0 == 0) goto L_0x016b
            float[] r0 = r5.A0D
            if (r0 != 0) goto L_0x017a
        L_0x016b:
            float r2 = r11.getX()
            float r1 = r11.getY()
            int r0 = r11.getPointerId(r8)
            r5.A06(r0, r2, r1)
        L_0x017a:
            int r3 = r11.getPointerCount()
        L_0x017e:
            if (r8 >= r3) goto L_0x015e
            int r4 = r11.getPointerId(r8)
            int r1 = r5.A05
            int r0 = r7 << r4
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01bf
            float r1 = r11.getX(r8)
            float r2 = r11.getY(r8)
            float[] r0 = r5.A0D
            r0 = r0[r4]
            float r9 = r2 - r0
            int r0 = r5.A03
            if (r0 == r7) goto L_0x015e
            int r1 = (int) r1
            int r0 = (int) r2
            android.view.View r2 = r5.A00(r1, r0)
            if (r2 == 0) goto L_0x01bf
            com.bloks.foa.components.bottomsheet.ViewDragHelper$Callback r0 = r5.A0H
            int r0 = r0.A00(r2)
            if (r0 <= 0) goto L_0x01bf
            float r1 = java.lang.Math.abs(r9)
            int r0 = r5.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bf
            boolean r0 = r5.A0A(r2, r4)
            if (r0 == 0) goto L_0x01bf
            goto L_0x015e
        L_0x01bf:
            int r8 = r8 + 1
            goto L_0x017e
        L_0x01c2:
            int r0 = r5.A03
            if (r0 != r7) goto L_0x01c9
            A00(r5)
        L_0x01c9:
            r5.A01()
            goto L_0x007a
        L_0x01ce:
            float r4 = r11.getX()
            float r3 = r11.getY()
            int r2 = r11.getPointerId(r8)
            int r1 = (int) r4
            int r0 = (int) r3
            android.view.View r0 = r5.A00(r1, r0)
            r5.A06(r2, r4, r3)
            r5.A0A(r0, r2)
            goto L_0x007a
        L_0x01e8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002202q.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setInteractable(boolean z) {
        this.A0C = z;
        if (!z) {
            this.A07.A01();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            if (this.A01 > 0) {
                view.setTop(getHeight() - this.A01);
            }
            this.A01 = 0;
            super.addView(view, i, layoutParams);
            this.A02 = view;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(C002202q.class.getSimpleName());
        throw AnonymousClass000.A0I(" only supports a single child", A0o);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        if (this.A0B) {
            View view = this.A02;
            if (this.A0G == null || view == null) {
                i3 = 0;
            } else {
                int measuredHeight = getMeasuredHeight();
                i3 = 0;
                for (C16290sm BBV : this.A0G) {
                    i3 = Math.max(i3, BBV.BBV(view, measuredHeight));
                }
            }
            measureChildren(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        }
    }
}
