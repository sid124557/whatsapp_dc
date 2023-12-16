package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import com.whatsapp.R;
import com.whatsapp.SerializablePoint;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.4vJ  reason: invalid class name */
public class AnonymousClass4vJ extends C135656l2 implements C184488ru {
    public double A00;
    public double A01;
    public float A02;
    public Picture A03;
    public Picture A04;
    public String A05;
    public String A06;
    public boolean A07;
    public AnonymousClass7N3[] A08;
    public AnonymousClass7N3[] A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final TextPaint A0D;
    public final C151687Vx A0E;
    public final C103105Lo A0F;
    public final AnonymousClass5QJ A0G;
    public final boolean A0H;

    public AnonymousClass4vJ(Context context, C620733j r7, JSONObject jSONObject) {
        this(context, r7, context.getString(R.string.f11nameremoved), false);
        super.A0O(jSONObject);
        this.A00 = jSONObject.getDouble("latitude");
        this.A01 = jSONObject.getDouble("longitude");
        this.A06 = jSONObject.getString("Location");
        this.A05 = jSONObject.getString("displayLocation");
        this.A07 = jSONObject.getBoolean("theme");
        A0Y();
        RectF rectF = this.A02;
        float width = rectF.width();
        float height = rectF.height();
        float f = rectF.left;
        float f2 = rectF.top;
        rectF.set(f, f2, width + f, height + f2);
        rectF.sort();
    }

    public void A0I(float f, int i) {
        A0H(f, 2);
        this.A0G.A00(f);
    }

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f3 - f;
        float f7 = f4 - f2;
        boolean z = this.A0H;
        if (z) {
            f5 = f6;
        } else {
            f5 = this.A02;
        }
        float f8 = 105.0f;
        if (z) {
            f8 = C86664Kz.A00(105.0f * f6, this.A02, f6 / 3.0f);
        }
        float f9 = (f6 / 2.0f) + f;
        if (!z) {
            f = f9 - (f5 / 2.0f);
        }
        float f10 = f2 + ((f7 / 2.0f) - (f8 / 2.0f));
        RectF rectF2 = this.A02;
        rectF2.set(f, f10, f + f5, f8 + f10);
        float f11 = f6 * 2.0f;
        if (!z && f5 > f11) {
            A0F(f11 / (f5 + 75.0f));
        }
        rectF2.sort();
        this.A0G.A00(rectF.width() / 1020.0f);
    }

    public String A0B() {
        return "location";
    }

    public void A0D() {
        RectF rectF = this.A02;
        if (rectF.height() < C105425Uw.A03) {
            float width = rectF.width() / rectF.height();
            rectF.set(rectF.centerX() - ((C105425Uw.A03 * width) / 2.0f), rectF.centerY() - (C105425Uw.A03 / 2.0f), rectF.centerX() + ((C105425Uw.A03 * width) / 2.0f), rectF.centerY() + (C105425Uw.A03 / 2.0f));
        }
    }

    public void A0E() {
        this.A0G.A00 = false;
    }

    public void A0K(Canvas canvas) {
        AnonymousClass7N3[] r8;
        Picture picture;
        TextPaint textPaint;
        int i;
        float width;
        C151687Vx r1 = this.A0E;
        float A002 = r1.A00();
        boolean z = this.A07;
        if (r1.A01 && r1.A00 >= 0.0f) {
            z = !z;
        }
        canvas.save();
        RectF rectF = this.A02;
        rectF.sort();
        C86604Kt.A16(canvas, rectF, this.A00);
        canvas.scale(rectF.width() / this.A02, rectF.height() / 105.0f, rectF.left, rectF.top);
        canvas.translate(rectF.left, rectF.top);
        canvas.scale(A002, A002, this.A02 / 2.0f, 52.5f);
        if (z) {
            r8 = this.A08;
        } else {
            r8 = this.A09;
        }
        for (AnonymousClass7N3 r0 : r8) {
            canvas.drawRoundRect(r0.A03, r0.A00, r0.A01, r0.A02);
        }
        if (z) {
            picture = this.A04;
            textPaint = this.A0D;
            i = -1;
        } else {
            picture = this.A03;
            textPaint = this.A0D;
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = 0.0f;
        if (picture == null) {
            width = 0.0f;
        } else {
            width = (float) picture.getWidth();
            f = (float) picture.getHeight();
        }
        float f2 = ((26.0f + width) + this.A02) / 2.0f;
        float descent = 52.5f - ((textPaint.descent() + textPaint.ascent()) / 2.0f);
        boolean z2 = this.A0H;
        if (!z2) {
            canvas.drawText(this.A05, f2, descent, textPaint);
        }
        float f3 = 52.5f - ((1.0f * f) / 2.0f);
        if (picture != null) {
            canvas.save();
            canvas.translate(37.5f, f3);
            canvas.scale(1.0f, 1.0f);
            canvas.drawPicture(picture);
            canvas.restore();
        }
        if (z2) {
            Paint paint = this.A0B;
            C86614Ku.A10(this.A00, paint, R.color.f5nameremoved);
            float f4 = C86634Kw.A0J().density * 8.0f;
            float f5 = 37.5f + width + 26.0f;
            canvas.drawRoundRect(AnonymousClass4L0.A09(f5, 37.5f, f5 + 170.0f, 67.5f), f4, f4, paint);
        }
        canvas.restore();
        if (!z2) {
            this.A0G.A01(canvas, rectF, this.A00);
        }
    }

    public boolean A0Q() {
        return false;
    }

    public boolean A0U() {
        return this.A0E.A01;
    }

    public boolean A0W() {
        this.A0F.A00(this.A0E);
        return true;
    }

    public final void A0Y() {
        float f;
        Picture picture;
        float f2 = 0.0f;
        if (this.A03 == null || (picture = this.A04) == null) {
            Log.w("Location/initThemes/Error when loading pin");
            f = 0.0f;
        } else {
            f = ((float) picture.getWidth()) + 26.0f;
        }
        if (!this.A0H) {
            f2 = this.A0D.measureText(this.A05);
        }
        this.A02 = Math.max(300.0f, f + 75.0f + f2);
        float f3 = C86634Kw.A0J().density * 8.0f;
        Paint paint = this.A0C;
        paint.setColor(-1);
        float f4 = f3;
        this.A09 = new AnonymousClass7N3[]{new AnonymousClass7N3(0.0f, 0.0f, this.A02, 105.0f, f3, f4, paint)};
        Paint paint2 = this.A0A;
        C86614Ku.A10(this.A00, paint2, R.color.f5nameremoved);
        this.A08 = new AnonymousClass7N3[]{new AnonymousClass7N3(0.0f, 0.0f, this.A02, 105.0f, f3, f4, paint2)};
    }

    public SerializablePoint[] BEG(Matrix matrix, PointF pointF, RectF rectF) {
        RectF rectF2 = this.A02;
        rectF2.sort();
        Matrix A052 = AnonymousClass002.A05();
        A052.preConcat(matrix);
        RectF rectF3 = rectF;
        A052.preTranslate(-rectF3.left, -rectF3.top);
        A052.preRotate(this.A00, rectF2.centerX(), rectF2.centerY());
        float f = rectF2.left;
        float f2 = rectF2.top;
        float f3 = rectF2.right;
        float f4 = rectF2.bottom;
        float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
        A052.mapPoints(fArr);
        float f5 = fArr[0];
        PointF pointF2 = pointF;
        float f6 = pointF2.x;
        double d = (double) (f5 / f6);
        float f7 = fArr[1];
        float f8 = pointF2.y;
        return new SerializablePoint[]{new SerializablePoint(d, (double) (f7 / f8)), C105425Uw.A05(fArr, f6, f8, 2, 3), C105425Uw.A05(fArr, f6, f8, 4, 5), new SerializablePoint((double) (fArr[6] / f6), (double) (fArr[7] / f8))};
    }

    public boolean BpN() {
        return false;
    }

    public String A0C(Context context) {
        return context.getString(R.string.f11nameremoved);
    }

    public void A0J(int i) {
    }

    public void A0L(Canvas canvas) {
        A0K(canvas);
    }

    public void A0P(JSONObject jSONObject) {
        super.A0P(jSONObject);
        jSONObject.put("latitude", this.A00);
        jSONObject.put("longitude", this.A01);
        jSONObject.put("Location", this.A06);
        jSONObject.put("displayLocation", this.A05);
        jSONObject.put("theme", this.A07);
    }

    public AnonymousClass4vJ(Context context, C620733j r6, String str, boolean z) {
        super(context);
        this.A0B = C86664Kz.A0a(1);
        this.A0C = C86664Kz.A0a(1);
        this.A0A = C86664Kz.A0a(1);
        TextPaint textPaint = new TextPaint(1);
        this.A0D = textPaint;
        int i = 0;
        this.A07 = false;
        this.A0E = new AnonymousClass905(this, 2);
        this.A0H = z;
        Context context2 = this.A00;
        Picture A002 = C135656l2.A00(context2, "ic_content_sticker_location_emerald.svg");
        C626936e.A06(A002);
        this.A03 = A002;
        Picture A003 = C135656l2.A00(context2, "ic_content_sticker_location.svg");
        C626936e.A06(A003);
        this.A04 = A003;
        C626936e.A0C(AnonymousClass000.A1U(this.A03.getWidth(), this.A04.getWidth()));
        TextPaint textPaint2 = this.A0D;
        textPaint2.setTextSize(46.0f);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        textPaint2.setTypeface(C106905aM.A02());
        this.A06 = str;
        Picture picture = this.A04;
        this.A05 = C86654Ky.A0l(textPaint, str, ((1000.0f - ((float) (picture != null ? picture.getWidth() : i))) - 75.0f) - 26.0f);
        A0Y();
        this.A0G = new AnonymousClass5QJ(context, r6);
        this.A0F = new C103105Lo();
    }
}
