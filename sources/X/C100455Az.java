package X;

import android.animation.ValueAnimator;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.5Az  reason: invalid class name and case insensitive filesystem */
public class C100455Az implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public int A01;
    public Object A02;
    public final int A03;

    public C100455Az(C105305Uj r1, float f, int i, int i2) {
        this.A03 = i2;
        this.A02 = r1;
        this.A00 = f;
        this.A01 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass4Lt r0;
        int i = this.A03;
        float f = this.A00;
        int i2 = this.A01;
        TitleBarView titleBarView = ((C105305Uj) this.A02).A0I;
        float A032 = AnonymousClass001.A03(valueAnimator);
        if (i != 0) {
            r0 = titleBarView.A0K;
            if (r0 == null) {
                throw C18270x1.A0S("penToolDrawable");
            }
        } else {
            r0 = titleBarView.A0L;
            if (r0 == null) {
                throw C18270x1.A0S("shapeToolDrawable");
            }
        }
        r0.A02 = f;
        r0.A03 = i2;
        r0.A01 = A032;
        r0.invalidateSelf();
    }
}
