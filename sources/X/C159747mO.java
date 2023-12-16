package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.7mO  reason: invalid class name and case insensitive filesystem */
public final class C159747mO {
    public static final float A00 = ((float) Math.sqrt(5.0d));

    public static void A00(View view, C153427bI r6, AnonymousClass84O r7) {
        C170348Cv r4 = (C170348Cv) C162377rs.A05(r6, r7);
        if (r4 == null) {
            C159737mN.A01("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
            return;
        }
        r4.A0D = false;
        view.getViewTreeObserver().removeOnPreDrawListener(r4.A0C);
        r4.A0B = null;
        view.setAlpha(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        float A002 = C86604Kt.A00(r6.A00);
        view.setCameraDistance(A002 * A002 * (-1280.0f) * A00);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        if (!r4.A0E) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            view.resetPivot();
            return;
        }
        view.setPivotX((AnonymousClass4L0.A00(view) * 50.0f) / 100.0f);
        view.setPivotY((C86664Kz.A02(view) * 50.0f) / 100.0f);
    }
}
