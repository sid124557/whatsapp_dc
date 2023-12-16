package com.google.android.material.behavior;

import X.AnonymousClass0WM;
import X.AnonymousClass0YY;
import X.AnonymousClass6C8;
import X.AnonymousClass6FH;
import X.AnonymousClass6Gd;
import X.C04810Qt;
import X.C05630Ug;
import X.C06220Ws;
import X.C06560Yg;
import X.C1451874n;
import X.C181188mL;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

public class SwipeDismissBehavior extends C05630Ug {
    public float A00 = 0.5f;
    public float A01 = 0.0f;
    public int A02 = 2;
    public AnonymousClass0WM A03;
    public C181188mL A04;
    public boolean A05;
    public boolean A06;
    public final C04810Qt A07 = new AnonymousClass6Gd(this);

    public boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        if (AnonymousClass0YY.A00(view) == 0) {
            AnonymousClass0YY.A06(view, 1);
            C06560Yg.A0K(view, 1048576);
            if (!(this instanceof BaseTransientBottomBar$Behavior) || (view instanceof AnonymousClass6FH)) {
                C06560Yg.A0R(view, C06220Ws.A0D, new C1451874n(this, 0), (CharSequence) null);
            }
        }
        return false;
    }

    public boolean A0E(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z = this.A05;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = AnonymousClass6C8.A1R(motionEvent, view, coordinatorLayout);
            this.A05 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A05 = false;
        }
        if (!z) {
            return false;
        }
        AnonymousClass0WM r1 = this.A03;
        if (r1 == null) {
            r1 = AnonymousClass0WM.A00(coordinatorLayout, this.A07);
            this.A03 = r1;
        }
        if (this.A06 || !r1.A0E(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean A0F(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A03 == null) {
            return false;
        }
        if (this.A06 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.A03.A08(motionEvent);
        return true;
    }
}
