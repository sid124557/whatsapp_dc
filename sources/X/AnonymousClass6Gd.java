package X;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* renamed from: X.6Gd  reason: invalid class name */
public class AnonymousClass6Gd extends C04810Qt {
    public int A00 = -1;
    public int A01;
    public final /* synthetic */ SwipeDismissBehavior A02;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r3 <= 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (java.lang.Math.abs(r7.getLeft() - r6.A01) >= X.AnonymousClass001.A07(X.AnonymousClass4L0.A00(r7), 0.5f)) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r4 = r6.A01;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r8 < 0.0f) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r0 = -1
            r6.A00 = r0
            int r5 = r7.getWidth()
            r1 = 1
            r4 = 0
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x005d
            int r0 = X.AnonymousClass0YH.A01(r7)
            boolean r2 = X.AnonymousClass000.A1U(r0, r1)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r6.A02
            int r1 = r0.A02
            r0 = 2
            if (r1 == r0) goto L_0x0024
            if (r1 != 0) goto L_0x0058
            if (r2 == 0) goto L_0x005a
        L_0x0020:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
        L_0x0024:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            int r0 = r7.getLeft()
            int r4 = r6.A01
            if (r0 < r4) goto L_0x0054
            int r4 = r4 + r5
        L_0x0031:
            r3 = 1
        L_0x0032:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r6.A02
            X.0WM r1 = r2.A03
            int r0 = r7.getTop()
            boolean r0 = r1.A0C(r4, r0)
            if (r0 == 0) goto L_0x004a
            r1 = 0
            X.5sI r0 = new X.5sI
            r0.<init>(r2, r7, r1, r3)
            X.AnonymousClass0YY.A07(r7, r0)
        L_0x0049:
            return
        L_0x004a:
            if (r3 == 0) goto L_0x0049
            X.8mL r0 = r2.A04
            if (r0 == 0) goto L_0x0049
            r0.BRJ(r7)
            return
        L_0x0054:
            int r4 = r6.A01
            int r4 = r4 - r5
            goto L_0x0031
        L_0x0058:
            if (r2 == 0) goto L_0x0020
        L_0x005a:
            if (r3 <= 0) goto L_0x0075
            goto L_0x0024
        L_0x005d:
            int r2 = r7.getLeft()
            int r0 = r6.A01
            int r2 = r2 - r0
            float r1 = X.AnonymousClass4L0.A00(r7)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r1 = X.AnonymousClass001.A07(r1, r0)
            int r0 = java.lang.Math.abs(r2)
            if (r0 < r1) goto L_0x0075
            goto L_0x0024
        L_0x0075:
            int r4 = r6.A01
            r3 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gd.A06(android.view.View, float, float):void");
    }

    public AnonymousClass6Gd(SwipeDismissBehavior swipeDismissBehavior) {
        this.A02 = swipeDismissBehavior;
    }

    public void A05(int i) {
        C181188mL r0 = this.A02.A04;
        if (r0 != null) {
            C158937ko A002 = C158937ko.A00();
            C178918iJ r02 = ((C169978Bj) r0).A00.A07;
            if (i != 0) {
                A002.A02(r02);
            } else {
                A002.A03(r02);
            }
        }
    }

    public void A07(View view, int i) {
        this.A00 = i;
        this.A01 = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.A02;
            swipeDismissBehavior.A06 = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.A06 = false;
        }
    }

    public boolean A09(View view, int i) {
        boolean z;
        int i2 = this.A00;
        if (i2 == -1 || i2 == i) {
            if (this.A02 instanceof BaseTransientBottomBar$Behavior) {
                z = view instanceof AnonymousClass6FH;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int A01(View view) {
        return view.getWidth();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if (r1 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = r3.A01;
        r1 = r4.getWidth() + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(android.view.View r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = X.AnonymousClass0YH.A01(r4)
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1U(r0, r2)
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r3.A02
            int r0 = r0.A02
            if (r0 != 0) goto L_0x001f
            if (r1 == 0) goto L_0x0023
        L_0x0011:
            int r2 = r3.A01
            int r0 = r4.getWidth()
            int r2 = r2 - r0
            int r1 = r3.A01
        L_0x001a:
            int r0 = X.AnonymousClass6C9.A0B(r2, r5, r1)
            return r0
        L_0x001f:
            if (r0 != r2) goto L_0x002b
            if (r1 == 0) goto L_0x0011
        L_0x0023:
            int r2 = r3.A01
            int r1 = r4.getWidth()
            int r1 = r1 + r2
            goto L_0x001a
        L_0x002b:
            int r2 = r3.A01
            int r0 = r4.getWidth()
            int r2 = r2 - r0
            int r0 = r3.A01
            int r1 = r4.getWidth()
            int r1 = r1 + r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Gd.A03(android.view.View, int, int):int");
    }

    public int A04(View view, int i, int i2) {
        return view.getTop();
    }

    public void A08(View view, int i, int i2, int i3, int i4) {
        float A002 = AnonymousClass4L0.A00(view);
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        float f = A002 * swipeDismissBehavior.A01;
        float A003 = AnonymousClass4L0.A00(view) * swipeDismissBehavior.A00;
        float A0A = (float) AnonymousClass001.A0A(i, this.A01);
        if (A0A <= f) {
            view.setAlpha(1.0f);
        } else if (A0A >= A003) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((A0A - f) / (A003 - f))), 1.0f));
        }
    }
}
