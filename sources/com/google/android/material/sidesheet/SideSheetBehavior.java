package com.google.android.material.sidesheet;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0WM;
import X.AnonymousClass0x9;
import X.AnonymousClass6D7;
import X.AnonymousClass6GX;
import X.AnonymousClass7TQ;
import X.C002002f;
import X.C04810Qt;
import X.C05630Ug;
import X.C06220Ws;
import X.C06360Xi;
import X.C06560Yg;
import X.C1453074z;
import X.C1463179t;
import X.C155777fU;
import X.C160917of;
import X.C161877ql;
import X.C188788zU;
import X.C86664Kz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;

public class SideSheetBehavior extends C05630Ug {
    public float A00;
    public float A01 = 0.1f;
    public int A02;
    public int A03 = -1;
    public int A04;
    public int A05;
    public int A06 = 5;
    public ColorStateList A07;
    public VelocityTracker A08;
    public AnonymousClass0WM A09;
    public AnonymousClass6D7 A0A;
    public C161877ql A0B;
    public C155777fU A0C;
    public WeakReference A0D;
    public WeakReference A0E;
    public boolean A0F = true;
    public boolean A0G;
    public final C04810Qt A0H = new C188788zU(this, 1);
    public final AnonymousClass7TQ A0I = new AnonymousClass7TQ(this);
    public final Set A0J = AnonymousClass0x9.A17();

    public void A08() {
        this.A0E = null;
        this.A09 = null;
    }

    public void A0D(C002002f r2) {
        this.A0E = null;
        this.A09 = null;
    }

    public Parcelable A07(View view, CoordinatorLayout coordinatorLayout) {
        return new AnonymousClass6GX((Parcelable) View.BaseSavedState.EMPTY_STATE, this);
    }

    public void A09(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
        int i = ((AnonymousClass6GX) parcelable).A00;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.A06 = i;
    }

    public final void A0K() {
        View A0j;
        WeakReference weakReference = this.A0E;
        if (weakReference != null && (A0j = C86664Kz.A0j(weakReference)) != null) {
            C06560Yg.A0K(A0j, 262144);
            C06560Yg.A0K(A0j, 1048576);
            if (this.A06 != 5) {
                C06560Yg.A0R(A0j, C06220Ws.A0D, new C1453074z(this, 5, 1), (CharSequence) null);
            }
            if (this.A06 != 3) {
                C06560Yg.A0R(A0j, C06220Ws.A0H, new C1453074z(this, 3, 1), (CharSequence) null);
            }
        }
    }

    public void A0L(int i) {
        View A0j;
        if (this.A06 != i) {
            this.A06 = i;
            WeakReference weakReference = this.A0E;
            if (weakReference != null && (A0j = C86664Kz.A0j(weakReference)) != null) {
                int i2 = 0;
                if (i == 5) {
                    i2 = 4;
                }
                if (A0j.getVisibility() != i2) {
                    A0j.setVisibility(i2);
                }
                Iterator it = this.A0J.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass001.A0g("onStateChanged");
                } else {
                    A0K();
                }
            }
        }
    }

    public final void A0M(View view, int i, boolean z) {
        int max;
        boolean A0H2;
        SideSheetBehavior sideSheetBehavior = this.A0C.A00;
        if (i == 3) {
            SideSheetBehavior sideSheetBehavior2 = sideSheetBehavior.A0C.A00;
            max = Math.max(0, sideSheetBehavior2.A05 - sideSheetBehavior2.A02);
        } else if (i == 5) {
            max = sideSheetBehavior.A0C.A00.A05;
        } else {
            throw AnonymousClass000.A0G("Invalid state to get outward edge offset: ", AnonymousClass001.A0o(), i);
        }
        AnonymousClass0WM r1 = sideSheetBehavior.A09;
        if (r1 != null) {
            int top = view.getTop();
            if (z) {
                A0H2 = r1.A0C(max, top);
            } else {
                A0H2 = r1.A0H(view, max, top);
            }
            if (A0H2) {
                A0L(2);
                this.A0I.A00(i);
                return;
            }
        }
        A0L(i);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1463179t.A0a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.A07 = C160917of.A00(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.A0B = new C161877ql(C161877ql.A01(context, attributeSet, 0, R.style.f12nameremoved));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.A03 = resourceId;
            WeakReference weakReference = this.A0D;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.A0D = null;
            WeakReference weakReference2 = this.A0E;
            if (weakReference2 != null) {
                View A0j = C86664Kz.A0j(weakReference2);
                if (resourceId != -1 && C06360Xi.A05(A0j)) {
                    A0j.requestLayout();
                }
            }
        }
        C161877ql r1 = this.A0B;
        if (r1 != null) {
            AnonymousClass6D7 r0 = new AnonymousClass6D7(r1);
            this.A0A = r0;
            r0.A05(context);
            ColorStateList colorStateList = this.A07;
            if (colorStateList != null) {
                this.A0A.A06(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.A0A.setTint(typedValue.data);
            }
        }
        this.A00 = obtainStyledAttributes.getDimension(2, -1.0f);
        this.A0F = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.A0C == null) {
            this.A0C = new C155777fU(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r4.A0F == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(android.view.MotionEvent r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            boolean r0 = r6.isShown()
            if (r0 != 0) goto L_0x000c
            java.lang.CharSequence r0 = X.C06560Yg.A09(r6)
            if (r0 == 0) goto L_0x0011
        L_0x000c:
            boolean r1 = r4.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r4.A0G = r3
            return r2
        L_0x0019:
            int r1 = r5.getActionMasked()
            if (r1 != 0) goto L_0x0029
            android.view.VelocityTracker r0 = r4.A08
            if (r0 == 0) goto L_0x0029
            r0.recycle()
            r0 = 0
            r4.A08 = r0
        L_0x0029:
            android.view.VelocityTracker r0 = r4.A08
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A08 = r0
        L_0x0033:
            r0.addMovement(r5)
            if (r1 == 0) goto L_0x0053
            if (r1 == r3) goto L_0x004c
            r0 = 3
            if (r1 == r0) goto L_0x004c
        L_0x003d:
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x005b
            X.0WM r0 = r4.A09
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.A0E(r5)
            if (r0 == 0) goto L_0x005b
            return r3
        L_0x004c:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x003d
            r4.A0G = r2
            return r2
        L_0x0053:
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.A04 = r0
            goto L_0x003d
        L_0x005b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.A0E(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z;
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.A06;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        AnonymousClass0WM r1 = this.A09;
        if (r1 != null && (this.A0F || i == 1)) {
            r1.A08(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.A08) != null) {
            velocityTracker.recycle();
            this.A08 = null;
        }
        VelocityTracker velocityTracker2 = this.A08;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A08 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A09 != null && (((z = this.A0F) || this.A06 == 1) && actionMasked == 2 && !this.A0G && (z || this.A06 == 1))) {
            float A002 = AnonymousClass002.A00((float) this.A04, motionEvent.getX());
            AnonymousClass0WM r12 = this.A09;
            if (A002 > ((float) r12.A06)) {
                r12.A0A(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0G;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        if (r6.getWindowVisibility() != 0) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7, int r8) {
        /*
            r5 = this;
            boolean r0 = X.AnonymousClass0YY.A0B(r7)
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = X.AnonymousClass0YY.A0B(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r2)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r5.A0E
            if (r0 != 0) goto L_0x0090
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r6)
            r5.A0E = r0
            X.6D7 r3 = r5.A0A
            if (r3 == 0) goto L_0x0102
            X.AnonymousClass0YY.A04(r3, r6)
            float r1 = r5.A00
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x002d
            float r1 = X.AnonymousClass0YZ.A00(r6)
        L_0x002d:
            r3.A04(r1)
        L_0x0030:
            int r3 = r5.A06
            r0 = 5
            r1 = 0
            if (r3 != r0) goto L_0x0037
            r1 = 4
        L_0x0037:
            int r0 = r6.getVisibility()
            if (r0 == r1) goto L_0x0040
            r6.setVisibility(r1)
        L_0x0040:
            r5.A0K()
            int r0 = X.AnonymousClass0YY.A00(r6)
            if (r0 != 0) goto L_0x004c
            X.AnonymousClass0YY.A06(r6, r2)
        L_0x004c:
            java.lang.CharSequence r0 = X.C06560Yg.A09(r6)
            if (r0 != 0) goto L_0x0090
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131896339(0x7f122813, float:1.9427536E38)
            java.lang.String r1 = r1.getString(r0)
            X.0vm r0 = new X.0vm
            r0.<init>(r2)
            r0.A03(r6, r1)
            X.0aY r4 = X.C06560Yg.A08
            if (r1 == 0) goto L_0x00f2
            java.util.WeakHashMap r3 = r4.A00
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x0078
            int r1 = r6.getWindowVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.put(r6, r0)
            r6.addOnAttachStateChangeListener(r4)
            boolean r0 = X.C06360Xi.A04(r6)
            if (r0 == 0) goto L_0x0090
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r4)
        L_0x0090:
            X.0WM r0 = r5.A09
            if (r0 != 0) goto L_0x009c
            X.0Qt r0 = r5.A0H
            X.0WM r0 = X.AnonymousClass0WM.A00(r7, r0)
            r5.A09 = r0
        L_0x009c:
            int r1 = r6.getLeft()
            r7.A0B(r6, r8)
            int r0 = r7.getWidth()
            r5.A05 = r0
            int r0 = r6.getWidth()
            r5.A02 = r0
            int r3 = r5.A06
            if (r3 == r2) goto L_0x00ec
            r0 = 2
            if (r3 == r0) goto L_0x00ec
            r0 = 3
            if (r3 == r0) goto L_0x00ea
            r0 = 5
            if (r3 != r0) goto L_0x010c
            X.7fU r0 = r5.A0C
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r0.A00
            int r1 = r0.A05
        L_0x00c2:
            X.C06560Yg.A0I(r6, r1)
            java.lang.ref.WeakReference r0 = r5.A0D
            if (r0 != 0) goto L_0x00da
            int r1 = r5.A03
            r0 = -1
            if (r1 == r0) goto L_0x00da
            android.view.View r0 = r7.findViewById(r1)
            if (r0 == 0) goto L_0x00da
            java.lang.ref.WeakReference r0 = X.AnonymousClass0x9.A14(r0)
            r5.A0D = r0
        L_0x00da:
            java.util.Set r0 = r5.A0J
            java.util.Iterator r1 = r0.iterator()
        L_0x00e0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010b
            r1.next()
            goto L_0x00e0
        L_0x00ea:
            r1 = 0
            goto L_0x00c2
        L_0x00ec:
            int r0 = r6.getLeft()
            int r1 = r1 - r0
            goto L_0x00c2
        L_0x00f2:
            java.util.WeakHashMap r0 = r4.A00
            r0.remove(r6)
            r6.removeOnAttachStateChangeListener(r4)
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            X.AnonymousClass0YY.A0A(r4, r0)
            goto L_0x0090
        L_0x0102:
            android.content.res.ColorStateList r0 = r5.A07
            if (r0 == 0) goto L_0x0030
            X.C06560Yg.A0C(r0, r6)
            goto L_0x0030
        L_0x010b:
            return r2
        L_0x010c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unexpected value: "
            java.lang.IllegalStateException r0 = X.C86604Kt.A0h(r0, r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.A0I(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public boolean A0J(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        view.measure(ViewGroup.getChildMeasureSpec(i, AnonymousClass000.A02(coordinatorLayout) + A0T.leftMargin + A0T.rightMargin + i2, A0T.width), ViewGroup.getChildMeasureSpec(i3, AnonymousClass000.A03(coordinatorLayout) + A0T.topMargin + A0T.bottomMargin, A0T.height));
        return true;
    }

    public SideSheetBehavior() {
    }
}
