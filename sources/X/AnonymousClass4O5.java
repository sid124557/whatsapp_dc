package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.QrImageView;
import java.util.ArrayList;

/* renamed from: X.4O5  reason: invalid class name */
public class AnonymousClass4O5 extends Animation {
    public final /* synthetic */ QrImageView A00;

    public AnonymousClass4O5(QrImageView qrImageView) {
        this.A00 = qrImageView;
    }

    public void applyTransformation(float f, Transformation transformation) {
        float f2;
        QrImageView qrImageView = this.A00;
        C151137To r3 = qrImageView.A04;
        if (r3 != null) {
            if (f != 1.0f) {
                if (f > 0.25f) {
                    f2 = (f - 0.25f) / 0.75f;
                } else {
                    f2 = 0.0f;
                }
                C150907Sr r0 = r3.A04;
                int i = (int) (((float) (r0.A01 * r0.A00)) * (1.0f - f2));
                while (true) {
                    ArrayList arrayList = qrImageView.A06;
                    if (arrayList.size() <= i) {
                        break;
                    }
                    arrayList.remove(QrImageView.A09.nextInt(arrayList.size()));
                }
            } else {
                qrImageView.A06.clear();
            }
            qrImageView.invalidate();
        }
    }
}
