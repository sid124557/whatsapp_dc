package X;

import android.widget.ImageView;

/* renamed from: X.4a9  reason: invalid class name and case insensitive filesystem */
public class C88544a9 extends AnonymousClass84C {
    public int A00;
    public final /* synthetic */ C105235Uc A01;

    public C88544a9(C105235Uc r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void Bbv(C153317b2 r12) {
        C147647Fc r10 = r12.A07;
        double d = 1.0d - 0.0d;
        float f = (float) (0.5d + (((r10.A00 - 0.0d) / d) * (1.0d - 0.5d)));
        C105235Uc r7 = this.A01;
        ImageView imageView = r7.A0L;
        imageView.setScaleX(f);
        imageView.setScaleY(f);
        int i = this.A00;
        if (i != 0) {
            float f2 = (float) (0.0d + (((r10.A00 - 0.0d) / d) * (((double) i) - 0.0d)));
            int width = imageView.getWidth() / 4;
            if (C102805Ki.A00(r7.A0Q)) {
                width = -width;
            }
            imageView.setTranslationX(f2 + ((float) width));
        }
    }
}
