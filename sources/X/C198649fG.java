package X;

import android.media.ImageReader;

/* renamed from: X.9fG  reason: invalid class name and case insensitive filesystem */
public class C198649fG implements Runnable {
    public final /* synthetic */ AnonymousClass9XL A00;

    public C198649fG(AnonymousClass9XL r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass9XL r2 = this.A00;
        ImageReader imageReader = r2.A03;
        if (imageReader == null || imageReader.getWidth() != r2.A02 || r2.A03.getHeight() != r2.A01) {
            r2.A01();
            r2.A00();
        }
    }
}
