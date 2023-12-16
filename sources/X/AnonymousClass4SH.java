package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.4SH  reason: invalid class name */
public class AnonymousClass4SH extends AnonymousClass00Q {
    public FrameLayout A00;
    public FrameLayout A01;
    public CoordinatorLayout A02;
    public AnonymousClass7XV A03;
    public BottomSheetBehavior A04;
    public C88624aI A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public void setContentView(View view) {
        super.setContentView(A03(view, (ViewGroup.LayoutParams) null, 0));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4SH(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0016
            android.util.TypedValue r3 = X.AnonymousClass4L0.A0B()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130968776(0x7f0400c8, float:1.7546215E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r3, r0)
            if (r0 == 0) goto L_0x0047
            int r6 = r3.resourceId
        L_0x0016:
            r4.<init>(r5, r6)
            r1 = 1
            r4.A06 = r1
            r4.A07 = r1
            r3 = 0
            X.8zf r0 = new X.8zf
            r0.<init>(r4, r3)
            r4.A03 = r0
            X.0Wy r0 = r4.A01()
            r0.A0J(r1)
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int[] r1 = new int[r1]
            r0 = 2130969261(0x7f0402ad, float:1.7547199E38)
            r1[r3] = r0
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r1)
            boolean r0 = r0.getBoolean(r3, r3)
            r4.A09 = r0
            return
        L_0x0047:
            r6 = 2132083875(0x7f1504a3, float:1.9807905E38)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4SH.<init>(android.content.Context, int):void");
    }

    public final void A04() {
        if (this.A01 == null) {
            FrameLayout frameLayout = (FrameLayout) C86654Ky.A0G(getContext(), R.layout.f8nameremoved);
            this.A01 = frameLayout;
            this.A02 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout A0s = C86664Kz.A0s(this.A01, R.id.design_bottom_sheet);
            this.A00 = A0s;
            BottomSheetBehavior A012 = BottomSheetBehavior.A01(A0s);
            this.A04 = A012;
            A012.A0Z(this.A03);
            this.A04.A0d(this.A06);
        }
    }

    public void cancel() {
        if (this.A04 == null) {
            A04();
        }
        super.cancel();
    }

    public void onDetachedFromWindow() {
        C88624aI r1 = this.A05;
        if (r1 != null) {
            r1.A05((Window) null);
        }
    }

    public final View A03(View view, ViewGroup.LayoutParams layoutParams, int i) {
        A04();
        ViewGroup A0J = C86644Kx.A0J(this.A01, R.id.coordinator);
        if (i != 0 && view == null) {
            view = AnonymousClass001.A0R(getLayoutInflater(), A0J, i);
        }
        if (this.A09) {
            AnonymousClass6B8.A00(this.A00, this, 0);
        }
        this.A00.removeAllViews();
        FrameLayout frameLayout = this.A00;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        C18280x3.A0p(A0J.findViewById(R.id.touch_outside), this, 1);
        C06560Yg.A0O(this.A00, new C188778zT(this, 1));
        C86654Ky.A19(this.A00, this, 0);
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (android.graphics.Color.alpha(r3.getNavigationBarColor()) >= 255) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L_0x0039
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x001a
            int r0 = r3.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 < r0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            android.widget.FrameLayout r1 = r4.A01
            if (r1 == 0) goto L_0x0024
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x0024:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A02
            if (r1 == 0) goto L_0x002d
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L_0x002d:
            r0 = r2 ^ 1
            X.AnonymousClass0ID.A00(r3, r0)
            X.4aI r0 = r4.A05
            if (r0 == 0) goto L_0x0039
            r0.A05(r3)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4SH.onAttachedToWindow():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A04;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0O == 5) {
            bottomSheetBehavior.A0S(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.A06 != z) {
            this.A06 = z;
            BottomSheetBehavior bottomSheetBehavior = this.A04;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0d(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A06) {
            this.A06 = true;
        }
        this.A07 = z;
        this.A08 = true;
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A03(view, layoutParams, 0));
    }

    public void setContentView(int i) {
        super.setContentView(A03((View) null, (ViewGroup.LayoutParams) null, i));
    }
}
