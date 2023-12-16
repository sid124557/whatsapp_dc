package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.937  reason: invalid class name */
public class AnonymousClass937 implements AnonymousClass4C1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass937(View view, C133316h8 r2, C620733j r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = view;
    }

    public final Object get() {
        int right;
        int i;
        int right2;
        int i2 = this.A03;
        C133316h8 r4 = (C133316h8) this.A00;
        C620733j r1 = (C620733j) this.A01;
        if (i2 != 0) {
            View view = (View) this.A02;
            Resources resources = r4.A02;
            float A012 = C86664Kz.A01(resources, R.dimen.f6nameremoved) + AnonymousClass8P2.A00(r4.A0I);
            boolean A0U = r1.A0U();
            int left = view.getLeft();
            if (A0U) {
                i = (int) (A012 + 0.5f);
                right2 = (int) (((((float) view.getRight()) - AnonymousClass8P2.A00(r4.A0E)) - C86664Kz.A01(resources, R.dimen.f6nameremoved)) + 0.5f);
            } else {
                left = (int) (((float) left) + AnonymousClass8P2.A00(r4.A0E) + C86664Kz.A01(resources, R.dimen.f6nameremoved) + 0.5f);
                i = (int) (A012 + 0.5f);
                right2 = view.getRight();
            }
            return new Rect(left, i, right2, (int) (A012 + AnonymousClass8P2.A00(r4.A0G) + 0.5f));
        }
        View view2 = (View) this.A02;
        Resources resources2 = r4.A02;
        int dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.f6nameremoved);
        boolean A0U2 = r1.A0U();
        int left2 = view2.getLeft();
        if (A0U2) {
            right = (int) (((((float) view2.getRight()) - AnonymousClass8P2.A00(r4.A0E)) - C86664Kz.A01(resources2, R.dimen.f6nameremoved)) + 0.5f);
        } else {
            left2 = (int) (((float) left2) + AnonymousClass8P2.A00(r4.A0E) + C86664Kz.A01(resources2, R.dimen.f6nameremoved) + 0.5f);
            right = view2.getRight();
        }
        return new Rect(left2, dimensionPixelSize, right, (int) (((float) dimensionPixelSize) + AnonymousClass8P2.A00(r4.A0I) + 0.5f));
    }
}
