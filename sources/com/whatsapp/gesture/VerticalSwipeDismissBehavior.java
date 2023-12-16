package com.whatsapp.gesture;

import X.AnonymousClass001;
import X.AnonymousClass0WM;
import X.AnonymousClass0YY;
import X.AnonymousClass0YZ;
import X.AnonymousClass0x9;
import X.AnonymousClass6C8;
import X.AnonymousClass6Ge;
import X.C05630Ug;
import X.C06560Yg;
import X.C117665sI;
import X.C185708u7;
import X.C86664Kz;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

public class VerticalSwipeDismissBehavior extends C05630Ug {
    public float A00;
    public float A01 = 0.0f;
    public int A02;
    public VelocityTracker A03;
    public AnonymousClass0WM A04;
    public C185708u7 A05;
    public WeakReference A06;
    public boolean A07 = true;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public boolean A0G(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        this.A09 = false;
        return (i & 2) != 0;
    }

    public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        float yVelocity;
        WeakReference weakReference = this.A06;
        if (weakReference != null && view2 == weakReference.get() && this.A09) {
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker == null) {
                yVelocity = 0.0f;
            } else {
                velocityTracker.computeCurrentVelocity(1000, this.A00);
                yVelocity = this.A03.getYVelocity(this.A02);
            }
            if (Math.abs(yVelocity) <= ((float) (view.getHeight() * 2))) {
                int top = view.getTop();
                if (Math.abs(top) < AnonymousClass001.A07(C86664Kz.A02(view), 0.2f)) {
                    if (this.A04.A0H(view, view.getLeft(), 0)) {
                        AnonymousClass0YY.A07(view, new C117665sI(this, view, 30, false));
                    }
                    this.A09 = false;
                }
            }
            this.A05.BRJ(view);
            this.A09 = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.view.View r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int[] r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.A06
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L_0x003f
            int r2 = r5.getTop()
            r1 = 1
            if (r10 <= 0) goto L_0x0040
            boolean r0 = r6.canScrollVertically(r1)
            if (r0 == 0) goto L_0x0050
            if (r2 <= 0) goto L_0x0021
            int r0 = java.lang.Math.min(r10, r2)
        L_0x001b:
            r8[r1] = r0
            int r0 = -r0
            X.C06560Yg.A0J(r5, r0)
        L_0x0021:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x003f
            X.8u7 r3 = r4.A05
            int r0 = r5.getTop()
            int r0 = java.lang.Math.abs(r0)
            float r2 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            float r0 = X.C86664Kz.A02(r5)
            float r2 = r2 / r0
            float r0 = java.lang.Math.min(r1, r2)
            r3.Bbl(r5, r0)
        L_0x003f:
            return
        L_0x0040:
            if (r10 >= 0) goto L_0x0021
            r0 = -1
            boolean r0 = r6.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0050
            if (r2 >= 0) goto L_0x0021
            int r0 = java.lang.Math.max(r10, r2)
            goto L_0x001b
        L_0x0050:
            r8[r1] = r10
            int r0 = -r10
            X.C06560Yg.A0J(r5, r0)
            r4.A09 = r1
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gesture.VerticalSwipeDismissBehavior.A0B(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public boolean A0H(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        this.A06.get();
        return false;
    }

    public VerticalSwipeDismissBehavior(Context context) {
        this.A00 = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        View A0j;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A02 = -1;
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A03 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A03;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A03 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        boolean z = this.A08;
        if (actionMasked == 0) {
            z = AnonymousClass6C8.A1R(motionEvent, view, coordinatorLayout);
            this.A08 = z;
            WeakReference weakReference = this.A06;
            if (!(weakReference == null || (A0j = C86664Kz.A0j(weakReference)) == null || !AnonymousClass6C8.A1R(motionEvent, A0j, coordinatorLayout))) {
                this.A02 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.A0B = true;
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A0B = false;
            this.A08 = false;
            this.A02 = -1;
        }
        if (!z) {
            return false;
        }
        AnonymousClass0WM r3 = this.A04;
        if (r3 == null) {
            if (this.A0A) {
                float f = this.A01;
                r3 = AnonymousClass0WM.A00(coordinatorLayout, new AnonymousClass6Ge(coordinatorLayout, this));
                r3.A06 = (int) (((float) r3.A06) * (1.0f / f));
            } else {
                r3 = AnonymousClass0WM.A00(coordinatorLayout, new AnonymousClass6Ge(coordinatorLayout, this));
            }
            this.A04 = r3;
        }
        return r3.A0E(motionEvent);
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (motionEvent.getActionMasked() == 0) {
            this.A02 = -1;
            VelocityTracker velocityTracker = this.A03;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A03 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A03;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A03 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        AnonymousClass0WM r0 = this.A04;
        if (r0 == null) {
            return false;
        }
        try {
            r0.A08(motionEvent);
            return true;
        } catch (IllegalArgumentException e) {
            Log.e("VerticalSwipeDismissBehavior/onTouchEvent", e);
            return false;
        }
    }

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        int top = view.getTop();
        coordinatorLayout.A0B(view, i);
        if (this.A09) {
            C06560Yg.A0J(view, top - view.getTop());
        }
        this.A06 = AnonymousClass0x9.A14(A0K(view));
        return true;
    }

    public final View A0K(View view) {
        if (AnonymousClass0YZ.A0H(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A0K = A0K(viewGroup.getChildAt(i));
                if (A0K != null) {
                    return A0K;
                }
            }
        }
        return null;
    }
}
