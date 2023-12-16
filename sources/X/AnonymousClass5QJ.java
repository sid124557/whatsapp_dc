package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.whatsapp.R;

/* renamed from: X.5QJ  reason: invalid class name */
public class AnonymousClass5QJ {
    public boolean A00 = true;
    public final TextPaint A01;
    public final TextPaint A02;
    public final String A03;

    public void A00(float f) {
        if (this.A00) {
            TextPaint textPaint = this.A02;
            textPaint.setTextSize(textPaint.getTextSize() * f);
            TextPaint textPaint2 = this.A01;
            textPaint2.setTextSize(textPaint2.getTextSize() * f);
        }
    }

    public void A01(Canvas canvas, RectF rectF, float f) {
        if (this.A00) {
            Rect A0N = AnonymousClass001.A0N();
            TextPaint textPaint = this.A02;
            String str = this.A03;
            textPaint.getTextBounds(str, 0, str.length(), A0N);
            canvas.save();
            float width = rectF.left + (rectF.width() / 2.0f);
            float height = rectF.top + rectF.height() + ((float) (A0N.height() * 2));
            C86604Kt.A16(canvas, rectF, f);
            canvas.drawText(str, width, height, this.A01);
            canvas.drawText(str, width, height, textPaint);
            canvas.restore();
        }
    }

    public AnonymousClass5QJ(Context context, C620733j r9) {
        TextPaint textPaint = new TextPaint(1);
        this.A02 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.A01 = textPaint2;
        textPaint.setColor(-1);
        textPaint.setTextSize(40.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(C106905aM.A02());
        textPaint.setShadowLayer(0.5f, 0.0f, 1.0f, Color.parseColor("#73000000"));
        textPaint2.setColor(0);
        textPaint2.setTextSize(40.0f);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        textPaint2.setTypeface(C106905aM.A02());
        textPaint2.setShadowLayer(7.0f, 0.0f, 0.0f, Color.parseColor("#4D000000"));
        this.A03 = context.getString(R.string.f11nameremoved).toUpperCase(C620733j.A02(r9));
    }
}
