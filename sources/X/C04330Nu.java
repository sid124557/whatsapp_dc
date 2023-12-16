package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.0Nu  reason: invalid class name and case insensitive filesystem */
public class C04330Nu {
    public final Paint A00;
    public final Path A01 = AnonymousClass002.A06();
    public final AnonymousClass0LO A02 = new AnonymousClass0LO();
    public final AnonymousClass0LO A03 = new AnonymousClass0LO();
    public final AnonymousClass0LO A04 = new AnonymousClass0LO();
    public final AnonymousClass0LO A05 = new AnonymousClass0LO();
    public final AnonymousClass0LO A06 = new AnonymousClass0LO();

    public void A00() {
        Path path = this.A01;
        path.reset();
        AnonymousClass0LO r0 = this.A06;
        path.moveTo(r0.A00, r0.A01);
        AnonymousClass0LO r02 = this.A02;
        float f = r02.A00;
        float f2 = r02.A01;
        AnonymousClass0LO r03 = this.A03;
        float f3 = r03.A00;
        float f4 = r03.A01;
        AnonymousClass0LO r04 = this.A04;
        path.cubicTo(f, f2, f3, f4, r04.A00, r04.A01);
        AnonymousClass0LO r05 = this.A05;
        path.lineTo(r05.A00, r05.A01);
        path.close();
    }

    public C04330Nu(int i, int i2) {
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setAntiAlias(true);
        AnonymousClass001.A10(paint);
        paint.setDither(true);
        paint.setColor(i);
        paint.setMaskFilter(new BlurMaskFilter((float) i2, BlurMaskFilter.Blur.NORMAL));
    }
}
