package com.google.android.material.bottomsheet;

import X.AnonymousClass0x9;
import X.AnonymousClass7XV;
import X.C002002f;
import X.C05630Ug;
import X.C06560Yg;
import X.C105515Vh;
import X.C188778zT;
import X.C188898zf;
import X.C86664Kz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public BottomSheetBehavior A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AccessibilityManager A04;
    public final AnonymousClass7XV A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r5) {
        /*
            r4 = this;
            r1 = 4
            r0 = 1
            if (r5 == r1) goto L_0x0008
            r0 = 3
            if (r5 != r0) goto L_0x000a
            r0 = 0
        L_0x0008:
            r4.A02 = r0
        L_0x000a:
            X.0Ws r3 = X.C06220Ws.A08
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x001c
            java.lang.String r2 = r4.A08
        L_0x0012:
            r1 = 1
            X.74n r0 = new X.74n
            r0.<init>(r4, r1)
            X.C06560Yg.A0R(r4, r3, r0, r2)
            return
        L_0x001c:
            java.lang.String r2 = r4.A07
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.A01(int):void");
    }

    private void setBottomSheetBehavior(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.A00;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0u.remove(this.A05);
            BottomSheetBehavior bottomSheetBehavior3 = this.A00;
            WeakReference weakReference = bottomSheetBehavior3.A0V;
            if (weakReference != null) {
                bottomSheetBehavior3.A0W(C86664Kz.A0j(weakReference), 1);
                bottomSheetBehavior3.A0V = null;
            } else {
                bottomSheetBehavior3.A0V = AnonymousClass0x9.A14((Object) null);
            }
        }
        this.A00 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0V = AnonymousClass0x9.A14(this);
            bottomSheetBehavior.A0X(this, 1);
            A01(this.A00.A0O);
            this.A00.A0Z(this.A05);
        }
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A00 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            boolean r0 = r3.A01
            r2 = 1
            if (r0 == 0) goto L_0x000a
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A00
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            r3.A03 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A00
            if (r0 != 0) goto L_0x0012
            r2 = 2
        L_0x0012:
            X.AnonymousClass0YY.A06(r3, r2)
            boolean r0 = r3.A03
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetDragHandleView.A00():void");
    }

    public final boolean A02() {
        boolean z = false;
        if (!this.A03) {
            return false;
        }
        String str = this.A06;
        AccessibilityManager accessibilityManager = this.A04;
        if (accessibilityManager != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(str);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        if (!bottomSheetBehavior.A0b) {
            z = true;
        }
        int i = bottomSheetBehavior.A0O;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (!z) {
                i2 = 3;
            }
        } else if (i != 3) {
            if (!this.A02) {
                i3 = 4;
            }
            i2 = i3;
        } else if (!z) {
            i2 = 4;
        }
        bottomSheetBehavior.A0S(i2);
        return true;
    }

    public void onAccessibilityStateChanged(boolean z) {
        this.A01 = z;
        A00();
    }

    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.A04;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior((BottomSheetBehavior) null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(C105515Vh.A00(context, attributeSet, i, R.style.f12nameremoved), attributeSet, i);
        this.A08 = getResources().getString(R.string.f11nameremoved);
        this.A07 = getResources().getString(R.string.f11nameremoved);
        this.A06 = getResources().getString(R.string.f11nameremoved);
        this.A05 = new C188898zf(this, 1);
        this.A04 = (AccessibilityManager) getContext().getSystemService("accessibility");
        A00();
        C06560Yg.A0O(this, new C188778zT(this, 2));
    }

    public void onAttachedToWindow() {
        BottomSheetBehavior bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                bottomSheetBehavior = null;
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof C002002f) {
                    C05630Ug r1 = ((C002002f) layoutParams).A0A;
                    if (r1 instanceof BottomSheetBehavior) {
                        bottomSheetBehavior = (BottomSheetBehavior) r1;
                        break;
                    }
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.A04;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, (AttributeSet) null);
    }
}
