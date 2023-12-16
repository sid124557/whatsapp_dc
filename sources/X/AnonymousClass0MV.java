package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.0MV  reason: invalid class name */
public class AnonymousClass0MV {
    public final Paint A00;
    public final Path A01 = AnonymousClass002.A06();
    public final AnonymousClass0LO A02 = new AnonymousClass0LO();
    public final AnonymousClass0LO A03 = new AnonymousClass0LO();
    public final AnonymousClass0LO A04 = new AnonymousClass0LO();

    public AnonymousClass0MV() {
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        AnonymousClass001.A10(paint);
        paint.setDither(true);
        paint.setColor(-14298266);
        paint.setMaskFilter(new BlurMaskFilter(175.0f, BlurMaskFilter.Blur.NORMAL));
    }
}
