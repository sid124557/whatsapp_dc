package X;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: X.5av  reason: invalid class name and case insensitive filesystem */
public class C107235av {
    public static void A05(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
        int i6 = i2 + A0T.leftMargin + A0T.rightMargin;
        int i7 = i5 + A0T.topMargin + A0T.bottomMargin;
        int mode = View.MeasureSpec.getMode(i);
        int A0C = AnonymousClass001.A0C(View.MeasureSpec.getSize(i), i6, 0);
        if (i3 > 0) {
            A0C = Math.min(A0C, i3);
        }
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(A0C, mode), 0, A0T.width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(AnonymousClass001.A0C(View.MeasureSpec.getSize(i4), i7, 0), View.MeasureSpec.getMode(i4)), 0, A0T.height));
    }

    public static void A01(View view) {
        view.setOutlineProvider(new C124976Er());
        view.setClipToOutline(true);
    }

    public static void A06(LottieAnimationView lottieAnimationView, int i) {
        lottieAnimationView.A0F.A0C(new AnonymousClass0WB("**"), new C01720By(lottieAnimationView, new AnonymousClass80Z(i)), C17150ue.A00);
    }

    public static int A00(View view, C620733j r4) {
        int[] A1Z = C86664Kz.A1Z();
        view.getLocationInWindow(A1Z);
        int i = A1Z[0];
        if (C620733j.A04(r4)) {
            return i;
        }
        return (C08940fM.A00.AzJ(C111095hX.A04(view)).A00().width() - view.getWidth()) + i;
    }

    public static void A02(View view) {
        C86614Ku.A1C(AnonymousClass4L0.A0B(), view);
    }

    public static void A03(View view, float f) {
        if (!view.getClipToOutline()) {
            view.setClipToOutline(true);
        }
        view.setOutlineProvider(new C124986Es(f));
    }

    public static void A04(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }
    }
}
