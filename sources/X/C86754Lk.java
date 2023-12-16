package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.whatsapp.R;
import java.text.DecimalFormat;

/* renamed from: X.4Lk  reason: invalid class name and case insensitive filesystem */
public class C86754Lk extends Drawable {
    public double A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A05;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A04.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A04.setColorFilter(colorFilter);
    }

    public C86754Lk(Context context) {
        TextPaint textPaint = new TextPaint();
        this.A04 = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(36.0f);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        Rect A0N = AnonymousClass001.A0N();
        this.A05 = A0N;
        textPaint.getTextBounds("9.9B", 0, 4, A0N);
        Paint A0B = C86604Kt.A0B();
        this.A03 = A0B;
        C86604Kt.A0u(-1, A0B);
        int A042 = AnonymousClass5YI.A04(context, 4.0f);
        this.A02 = A042;
        A0B.setShadowLayer((float) A042, 0.0f, 0.0f, context.getResources().getColor(R.color.f5nameremoved));
        int width = A0N.width() + AnonymousClass5YI.A04(context, 24.0f) + A042;
        this.A01 = width;
        setBounds(0, 0, width, width);
    }

    public void draw(Canvas canvas) {
        String A0X;
        StringBuilder A0o;
        Rect bounds = getBounds();
        float centerX = (float) bounds.centerX();
        canvas.drawCircle(centerX, (float) bounds.centerY(), (float) ((bounds.width() / 2) - this.A02), this.A03);
        int i = this.A01;
        Rect rect = this.A05;
        float height = (float) (((i - rect.height()) / 2) + rect.height());
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        double d = this.A00;
        if (d < 0.0d || d > 999.0d) {
            String str = "k";
            double d2 = 1000.0d;
            if (d < 1000.0d || d > 9999.0d) {
                if (d < 10000.0d || d > 99999.0d) {
                    str = "M";
                    d2 = 1000000.0d;
                    if (d < 100000.0d || d > 9999999.0d) {
                        if (d < 1.0E7d || d > 9.9999999E7d) {
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append(decimalFormat.format(d / 1.0E9d));
                            A0X = AnonymousClass000.A0X("B", A0o2);
                        }
                    }
                }
                A0o = AnonymousClass001.A0o();
                A0o.append(Math.round((float) ((int) (d / d2))));
                A0X = AnonymousClass000.A0X(str, A0o);
            }
            A0o = AnonymousClass001.A0o();
            A0o.append(decimalFormat.format(d / d2));
            A0X = AnonymousClass000.A0X(str, A0o);
        } else {
            A0X = String.valueOf((int) d);
        }
        canvas.drawText(A0X, centerX, height, this.A04);
    }
}
