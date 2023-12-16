package X;

import android.view.View;

/* renamed from: X.3AQ  reason: invalid class name */
public abstract class AnonymousClass3AQ implements AnonymousClass0u4 {
    public abstract void BMQ(View view);

    public abstract void BMS(View view);

    public void BMP(View view) {
        if (this instanceof AnonymousClass1PE) {
            AnonymousClass1PE r2 = (AnonymousClass1PE) this;
            if (r2.A00 != 0) {
                view.setTranslationX(0.0f);
            }
            if (r2.A01 != 0) {
                view.setTranslationY(0.0f);
            }
        } else if ((this instanceof AnonymousClass4HA) && 1 - ((AnonymousClass4HA) this).A03 == 0) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }
}
