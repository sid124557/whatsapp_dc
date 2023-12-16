package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import com.whatsapp.R;

/* renamed from: X.0Vc  reason: invalid class name and case insensitive filesystem */
public final class C05820Vc {
    public AnonymousClass0QF A00;

    public static C05820Vc A00(WindowInsetsAnimation windowInsetsAnimation) {
        C05820Vc r2 = new C05820Vc(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            r2.A00 = new AnonymousClass068(windowInsetsAnimation);
        }
        return r2;
    }

    public static void A01(View view, AnonymousClass0QA r4) {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass068.A03(view, r4);
            return;
        }
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (r4 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, (Object) null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                return;
            }
            return;
        }
        C06960a6 r1 = new C06960a6(view, r4);
        view.setTag(R.id.tag_window_insets_animation_callback, r1);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(r1);
        }
    }

    public C05820Vc(int i, Interpolator interpolator, long j) {
        AnonymousClass0QF r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = new AnonymousClass068(i, interpolator, j);
        } else {
            r0 = new AnonymousClass069(i, interpolator, j);
        }
        this.A00 = r0;
    }
}
