package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.4Lt  reason: invalid class name */
public class AnonymousClass4Lt extends Drawable {
    public float A00;
    public float A01 = 1.0f;
    public float A02;
    public int A03;
    public Drawable A04;
    public boolean A05;
    public final int A06;
    public final Paint A07;

    public void A00(float f, int i) {
        this.A02 = f;
        this.A03 = i;
        this.A01 = 1.0f;
        invalidateSelf();
    }

    public void A01(int i) {
        this.A03 = i;
        this.A01 = 1.0f;
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.A06;
    }

    public int getIntrinsicWidth() {
        return this.A06;
    }

    public int getOpacity() {
        return -3;
    }

    public AnonymousClass4Lt(Context context, int i) {
        Drawable drawable;
        Paint A0B = C86604Kt.A0B();
        this.A07 = A0B;
        AnonymousClass001.A10(A0B);
        this.A00 = (C86604Kt.A00(context) * 3.0f) / 4.0f;
        this.A06 = (int) (C86604Kt.A00(context) * 48.0f);
        if (i != 0) {
            drawable = AnonymousClass0RP.A00(context, i);
        } else {
            drawable = null;
        }
        this.A04 = drawable;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float min = (float) ((Math.min(bounds.width(), bounds.height()) * 7) / 16);
        if (this.A05) {
            Paint paint = this.A07;
            AnonymousClass001.A10(paint);
            paint.setColor(this.A03);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), min, paint);
            AnonymousClass001.A10(paint);
            paint.setColor(-1);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
            if (Color.red(this.A03) > 240 && Color.green(this.A03) > 240 && Color.blue(this.A03) > 240) {
                C86634Kw.A17(paint);
                paint.setStrokeWidth(this.A00);
                int min2 = 255 - ((Math.min(Math.min(Color.red(this.A03), Color.green(this.A03)), Color.blue(this.A03)) - 240) * 3);
                paint.setColor(Color.argb(255, min2, min2, min2));
                canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
                return;
            }
            return;
        }
        if (this.A03 != 0) {
            Paint paint2 = this.A07;
            AnonymousClass001.A10(paint2);
            paint2.setColor(this.A03);
            canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), this.A01 * min, paint2);
        }
        Drawable drawable = this.A04;
        if (drawable != null) {
            drawable.setBounds(bounds.centerX() - (this.A04.getIntrinsicWidth() / 2), bounds.centerY() - (this.A04.getIntrinsicHeight() / 2), bounds.centerX() + (this.A04.getIntrinsicWidth() / 2), bounds.centerY() + (this.A04.getIntrinsicHeight() / 2));
            this.A04.draw(canvas);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
