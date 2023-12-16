package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.whatsapp.R;

/* renamed from: X.0YZ  reason: invalid class name */
public class AnonymousClass0YZ {
    public static AnonymousClass0XY A05(View view) {
        if (AnonymousClass0K5.A03 && view.isAttachedToWindow()) {
            try {
                Object obj = AnonymousClass0K5.A02.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) AnonymousClass0K5.A01.get(obj);
                    Rect rect2 = (Rect) AnonymousClass0K5.A00.get(obj);
                    if (!(rect == null || rect2 == null)) {
                        C05290St r4 = new C05290St();
                        AnonymousClass0XU A00 = AnonymousClass0XU.A00(rect.left, rect.top, rect.right, rect.bottom);
                        AnonymousClass0UT r42 = r4.A00;
                        r42.A05(A00);
                        r42.A06(AnonymousClass0XU.A00(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        AnonymousClass0XY A002 = r42.A00();
                        C05640Uh r1 = A002.A00;
                        r1.A0G(A002);
                        r1.A0F(view.getRootView());
                        return A002;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", AnonymousClass000.A0a("Failed to get insets from AttachInfo. ", AnonymousClass001.A0o(), e), e);
            }
        }
        return null;
    }

    public static void A0E(View view, C15830s0 r3) {
        View.OnApplyWindowInsetsListener r0;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, r3);
        }
        if (r3 == null) {
            r0 = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        } else {
            r0 = new C06970a7(view, r3);
        }
        view.setOnApplyWindowInsetsListener(r0);
    }

    public static float A00(View view) {
        return view.getElevation();
    }

    public static float A01(View view) {
        return view.getTranslationZ();
    }

    public static float A02(View view) {
        return view.getZ();
    }

    public static ColorStateList A03(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode A04(View view) {
        return view.getBackgroundTintMode();
    }

    public static String A06(View view) {
        return view.getTransitionName();
    }

    public static void A07(ColorStateList colorStateList, View view) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void A08(PorterDuff.Mode mode, View view) {
        view.setBackgroundTintMode(mode);
    }

    public static void A09(Rect rect, View view, AnonymousClass0XY r3) {
        WindowInsets A06 = r3.A06();
        if (A06 != null) {
            AnonymousClass0XY.A01(view, view.computeSystemWindowInsets(A06, rect));
        } else {
            rect.setEmpty();
        }
    }

    public static void A0B(View view, float f) {
        view.setElevation(f);
    }

    public static void A0C(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void A0D(View view, WindowInsets windowInsets) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void A0F(View view, String str) {
        view.setTransitionName(str);
    }

    public static void A0G(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static boolean A0H(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void A0A(View view) {
        view.stopNestedScroll();
    }
}
