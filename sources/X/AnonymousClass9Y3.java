package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.9Y3  reason: invalid class name */
public class AnonymousClass9Y3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public View A00;
    public C153427bI A01;
    public AnonymousClass84O A02;
    public C835248t A03;
    public C835248t A04;
    public String A05;
    public boolean A06;

    public final void A00() {
        if (this.A01 != null) {
            this.A06 = false;
            C835248t r4 = this.A04;
            if (r4 != null) {
                AnonymousClass84O r3 = this.A02;
                C152057Xj r2 = new C152057Xj();
                r2.A04(this.A05, 0);
                r2.A04(this.A01, 1);
                C159377lj.A01(this.A01, r3, r2.A03(), r4);
            }
        }
    }

    public void onGlobalLayout() {
        int visibility;
        int visibility2;
        View view = this.A00;
        if (view != null && this.A01 != null) {
            if (this.A06 && ((visibility2 = view.getVisibility()) == 4 || visibility2 == 8)) {
                A00();
            } else if (!this.A06 && (visibility = this.A00.getVisibility()) != 4 && visibility != 8 && this.A01 != null) {
                this.A06 = true;
                C835248t r4 = this.A03;
                if (r4 != null) {
                    AnonymousClass84O r3 = this.A02;
                    C152057Xj r2 = new C152057Xj();
                    r2.A04(this.A05, 0);
                    r2.A04(this.A01, 1);
                    C159377lj.A01(this.A01, r3, r2.A03(), r4);
                }
            }
        }
    }
}
