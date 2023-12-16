package X;

import android.view.View;

/* renamed from: X.0aL  reason: invalid class name and case insensitive filesystem */
public class C07110aL implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;

    public C07110aL(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationY(((float) view.getHeight()) * this.A01 * f);
    }
}
