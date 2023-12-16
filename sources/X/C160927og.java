package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.7og  reason: invalid class name and case insensitive filesystem */
public class C160927og {
    public static C150377Qk A00(int i) {
        if (i == 0 || i != 1) {
            return new AnonymousClass6ZB();
        }
        return new AnonymousClass6ZA();
    }

    public static void A03(View view, AnonymousClass6D7 r3) {
        C157567iW r0 = r3.A03.A0J;
        if (r0 != null && r0.A04) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += AnonymousClass0YZ.A00((View) parent);
            }
            AnonymousClass6Cs r1 = r3.A03;
            if (r1.A02 != f) {
                r1.A02 = f;
                r3.A03();
            }
        }
    }

    public static void A01(View view) {
        Drawable background = view.getBackground();
        if (background instanceof AnonymousClass6D7) {
            A03(view, (AnonymousClass6D7) background);
        }
    }

    public static void A02(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof AnonymousClass6D7) {
            ((AnonymousClass6D7) background).A04(f);
        }
    }
}
