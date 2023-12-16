package X;

import android.view.View;

/* renamed from: X.931  reason: invalid class name */
public class AnonymousClass931 implements C16080sR {
    public final int A00;

    public AnonymousClass931(int i) {
        this.A00 = i;
    }

    public final void Br5(View view, float f) {
        switch (this.A00) {
            case 0:
                if (f < 0.0f || f >= 1.0f) {
                    view.setTranslationX(0.0f);
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    return;
                }
                view.setTranslationX((-f) * AnonymousClass4L0.A00(view));
                view.setAlpha(Math.max(0.0f, 1.0f - f));
                float max = Math.max(0.0f, 1.0f - (f * 0.3f));
                view.setScaleX(max);
                view.setScaleY(max);
                return;
            case 1:
                boolean z = true;
                if (f != 0.0f) {
                    if (f == 1.0f || f == -1.0f) {
                        z = false;
                    } else {
                        return;
                    }
                }
                AnonymousClass0YZ.A0G(view, z);
                view.requestLayout();
                return;
            default:
                if (f >= -1.0f && f <= 1.0f) {
                    view.setPivotX(AnonymousClass4L0.A00(view) * 0.5f);
                    view.setPivotY(C86664Kz.A02(view));
                    view.setRotation(f * 18.75f);
                    return;
                }
                return;
        }
    }
}
