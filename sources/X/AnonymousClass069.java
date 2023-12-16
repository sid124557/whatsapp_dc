package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.069  reason: invalid class name */
public class AnonymousClass069 extends AnonymousClass0QF {
    public static final Interpolator A00 = new DecelerateInterpolator();
    public static final Interpolator A01 = new AnonymousClass087();
    public static final Interpolator A02 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    public static AnonymousClass0QA A00(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof C06960a6) {
            return ((C06960a6) tag).A01;
        }
        return null;
    }

    public static void A01(View view, WindowInsets windowInsets, C05820Vc r4, boolean z) {
        AnonymousClass0QA A002 = A00(view);
        if (A002 != null) {
            A002.A00 = windowInsets;
            if (!z) {
                A002.A02(r4);
                z = AnonymousClass000.A1T(A002.A01);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A01(viewGroup.getChildAt(i), windowInsets, r4, z);
            }
        }
    }

    public static void A02(View view, C06020Vx r3, C05820Vc r4) {
        AnonymousClass0QA A002 = A00(view);
        if (A002 != null) {
            A002.A00(r3, r4);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A02(viewGroup.getChildAt(i), r3, r4);
            }
        }
    }

    public static void A03(View view, C05820Vc r3) {
        AnonymousClass0QA A002 = A00(view);
        if (A002 != null) {
            A002.A03(r3);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A03(viewGroup.getChildAt(i), r3);
            }
        }
    }

    public static void A04(View view, AnonymousClass0XY r3, List list) {
        AnonymousClass0QA A002 = A00(view);
        if (A002 != null) {
            A002.A01(r3, list);
            if (A002.A01 == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A04(viewGroup.getChildAt(i), r3, list);
            }
        }
    }

    public AnonymousClass069(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }
}
