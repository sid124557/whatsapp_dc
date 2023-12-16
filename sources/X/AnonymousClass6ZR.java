package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.whatsapp.R;

/* renamed from: X.6ZR  reason: invalid class name */
public class AnonymousClass6ZR extends C153787c0 {
    public long A00 = Long.MAX_VALUE;
    public ValueAnimator A01;
    public ValueAnimator A02;
    public AccessibilityManager A03;
    public AutoCompleteTextView A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final TimeInterpolator A0A;
    public final View.OnClickListener A0B = new C109415ea(this, 6);
    public final View.OnFocusChangeListener A0C = new C1892090k(this, 1);
    public final C15850s3 A0D = new AnonymousClass805(this);

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r4 > 300) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r6 = this;
            android.widget.AutoCompleteTextView r0 = r6.A04
            if (r0 == 0) goto L_0x0037
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r6.A00
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0018
            r2 = 300(0x12c, double:1.48E-321)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r1 = 0
            if (r0 == 0) goto L_0x001e
            r6.A05 = r1
        L_0x001e:
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.A07
            r0 = r0 ^ 1
            r6.A0A(r0)
            boolean r1 = r6.A07
            android.widget.AutoCompleteTextView r0 = r6.A04
            if (r1 == 0) goto L_0x0038
            r0.requestFocus()
            android.widget.AutoCompleteTextView r0 = r6.A04
            r0.showDropDown()
        L_0x0037:
            return
        L_0x0038:
            r0.dismissDropDown()
            return
        L_0x003c:
            r6.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZR.A09():void");
    }

    public final void A0A(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            this.A01.cancel();
            this.A02.start();
        }
    }

    public AnonymousClass6ZR(AnonymousClass6Ff r4) {
        super(r4);
        this.A08 = C160907oe.A00(r4.getContext(), R.attr.f3nameremoved, 67);
        this.A09 = C160907oe.A00(r4.getContext(), R.attr.f3nameremoved, 50);
        this.A0A = AnonymousClass5YH.A01(C159917mg.A03, r4.getContext(), R.attr.f3nameremoved);
    }
}
