package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Zd  reason: invalid class name */
public class AnonymousClass4Zd extends C110815h5 {
    public float A00;
    public C156807hE A01;
    public final float A02;
    public final Paint A03;
    public final Rect A04 = AnonymousClass001.A0N();
    public final RectF A05 = AnonymousClass002.A07();
    public final RectF A06 = AnonymousClass002.A07();
    public final Drawable A07;
    public final C142776xk A08;

    public void A0B(Canvas canvas) {
        Drawable drawable = this.A07;
        Rect rect = this.A04;
        drawable.setBounds(rect);
        canvas.drawCircle((float) rect.centerX(), (float) rect.centerY(), (float) (rect.width() >> 1), this.A03);
        drawable.setAlpha(76);
        drawable.draw(canvas);
    }

    public AnonymousClass4Zd(Drawable drawable, C110885hC r6, C142776xk r7, C156807hE r8) {
        super(r6);
        Paint A0Z = C86664Kz.A0Z();
        this.A03 = A0Z;
        this.A01 = r8;
        this.A07 = drawable;
        float f = this.A05;
        this.A02 = (48.0f * f) / 2.0f;
        this.A00 = (float) ((int) (f * 8.0f));
        this.A03 = 5;
        this.A02 = 4.0f;
        this.A08 = r7 == null ? C142776xk.BOTTOM_RIGHT : r7;
        A0Z.setColor(-1);
        A0Z.setAlpha(178);
    }
}
