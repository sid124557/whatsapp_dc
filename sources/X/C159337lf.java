package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.7lf  reason: invalid class name and case insensitive filesystem */
public class C159337lf {
    public static PorterDuff.Mode A01(PorterDuff.Mode mode, int i) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static float A00(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static void A02(View view, C181208mN r6) {
        AnonymousClass0YZ.A0E(view, new AnonymousClass92C(r6, 0, new C156617gv(AnonymousClass0YH.A03(view), view.getPaddingTop(), AnonymousClass0YH.A02(view), view.getPaddingBottom())));
        if (C06360Xi.A04(view)) {
            AnonymousClass0V0.A02(view);
        } else {
            view.addOnAttachStateChangeListener(new C166757zD());
        }
    }
}
