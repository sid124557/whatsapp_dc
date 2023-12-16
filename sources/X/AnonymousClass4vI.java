package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import com.whatsapp.R;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: X.4vI  reason: invalid class name */
public class AnonymousClass4vI extends C135656l2 {
    public int A00;
    public int A01;
    public Paint A02;
    public Paint A03;
    public Picture A04;
    public Picture A05;
    public AnonymousClass7N3 A06;
    public AnonymousClass7N3 A07;
    public AnonymousClass7N3 A08;
    public AnonymousClass7N3 A09;
    public Boolean A0A;
    public final RectF A0B;
    public final C620733j A0C;
    public final C151687Vx A0D;
    public final C103105Lo A0E;
    public final AnonymousClass5QJ A0F;
    public final boolean A0G;

    public void A0I(float f, int i) {
        A0H(f, 2);
        this.A0F.A00(f);
    }

    public String A0B() {
        return "analog-clock";
    }

    public void A0E() {
        this.A0F.A00 = false;
    }

    public void A0K(Canvas canvas) {
        Picture picture;
        Paint paint;
        AnonymousClass7N3 r11;
        AnonymousClass7N3 r3;
        boolean z = this.A0G;
        Canvas canvas2 = canvas;
        if (!z) {
            canvas2.save();
            RectF rectF = this.A02;
            canvas2.scale(0.67f, 0.67f, rectF.centerX(), rectF.centerY());
        }
        C151687Vx r1 = this.A0D;
        float A002 = r1.A00();
        boolean booleanValue = this.A0A.booleanValue();
        if (r1.A01 && r1.A00 >= 0.0f) {
            booleanValue = !booleanValue;
        }
        if (booleanValue) {
            picture = this.A04;
        } else {
            picture = this.A05;
        }
        RectF rectF2 = this.A02;
        rectF2.sort();
        canvas2.save();
        C86604Kt.A16(canvas2, rectF2, this.A00);
        canvas2.scale(rectF2.width() / ((float) picture.getHeight()), rectF2.height() / ((float) picture.getWidth()), rectF2.left, rectF2.top);
        canvas2.translate(rectF2.left, rectF2.top);
        canvas2.scale(A002, A002, (float) (picture.getWidth() / 2), (float) (picture.getHeight() / 2));
        canvas2.save();
        canvas2.drawPicture(picture);
        canvas2.restore();
        float width = (float) (picture.getWidth() / 2);
        float height = (float) (picture.getHeight() / 2);
        if (booleanValue) {
            paint = this.A02;
        } else {
            paint = this.A03;
        }
        canvas2.drawCircle(width, height, 26.0f, paint);
        canvas2.save();
        if (booleanValue) {
            r11 = this.A06;
        } else {
            r11 = this.A08;
        }
        double d = (((((double) (this.A00 + 9)) % 12.0d) / 12.0d) * 360.0d) + (((double) (this.A01 * 30)) / 60.0d);
        RectF rectF3 = this.A0B;
        rectF3.set(r11.A03);
        canvas2.rotate((float) ((int) d), (float) (picture.getWidth() / 2), (float) (picture.getHeight() / 2));
        canvas2.drawRoundRect(rectF3, r11.A00, r11.A01, r11.A02);
        canvas2.restore();
        canvas2.save();
        if (booleanValue) {
            r3 = this.A07;
        } else {
            r3 = this.A09;
        }
        rectF3.set(r3.A03);
        canvas2.rotate((float) ((int) (((((double) (this.A01 + 45)) % 60.0d) / 60.0d) * 360.0d)), (float) (picture.getWidth() / 2), (float) (picture.getHeight() / 2));
        canvas2.drawRoundRect(rectF3, r3.A00, r3.A01, r3.A02);
        canvas2.restore();
        canvas2.restore();
        if (!z) {
            canvas2.restore();
            float width2 = (rectF2.width() * 0.67f) / 2.0f;
            this.A0F.A01(canvas2, AnonymousClass4L0.A09(rectF2.centerX() - width2, rectF2.centerY() - width2, rectF2.centerX() + width2, rectF2.centerY() + width2), this.A00);
        }
    }

    public boolean A0Q() {
        return false;
    }

    public boolean A0S() {
        return true;
    }

    public boolean A0U() {
        return this.A0D.A01;
    }

    public boolean A0V() {
        int i = this.A01;
        int i2 = this.A00;
        Calendar instance = Calendar.getInstance(C620733j.A02(this.A0C));
        this.A00 = instance.get(10);
        int i3 = instance.get(12);
        this.A01 = i3;
        if (i == i3 && i2 == this.A00) {
            return false;
        }
        return true;
    }

    public boolean A0W() {
        this.A0E.A00(this.A0D);
        return true;
    }

    public float A0X() {
        Picture picture = this.A04;
        if ((picture == null && (picture = this.A05) == null) || picture.getHeight() == 0) {
            return 0.0f;
        }
        return ((float) picture.getWidth()) / ((float) picture.getHeight());
    }

    public AnonymousClass4vI(Context context, C620733j r11, boolean z) {
        super(context);
        this.A0B = AnonymousClass002.A07();
        this.A02 = C86664Kz.A0a(1);
        this.A03 = C86664Kz.A0a(1);
        this.A0D = new AnonymousClass905(this, 0);
        this.A0C = r11;
        this.A0G = z;
        this.A0A = Boolean.FALSE;
        Calendar instance = Calendar.getInstance(C620733j.A02(r11));
        this.A00 = instance.get(10);
        this.A01 = instance.get(12);
        Context context2 = this.A00;
        this.A04 = C135656l2.A00(context2, "clockDarkTheme.svg");
        Paint paint = this.A02;
        paint.setColor(Color.parseColor("#ECB439"));
        this.A06 = new AnonymousClass7N3(190.0f, 249.0f, 398.0f, 263.0f, 7.0f, 7.0f, paint);
        this.A07 = new AnonymousClass7N3(185.0f, 251.0f, 479.0f, 261.0f, 5.0f, 5.0f, paint);
        this.A05 = C135656l2.A00(context2, "clockLightTheme.svg");
        Paint paint2 = this.A03;
        paint2.setColor(Color.parseColor("#DC5842"));
        this.A08 = new AnonymousClass7N3(201.0f, 248.0f, 370.0f, 264.0f, 8.0f, 8.0f, paint2);
        this.A09 = new AnonymousClass7N3(185.0f, 251.0f, 479.0f, 262.0f, 5.5f, 5.5f, paint2);
        this.A0F = new AnonymousClass5QJ(context, r11);
        this.A0E = new C103105Lo();
    }

    public String A0C(Context context) {
        return context.getString(R.string.f11nameremoved);
    }

    public void A0L(Canvas canvas) {
        A0K(canvas);
    }

    public void A0M(RectF rectF, float f, float f2, float f3, float f4) {
        super.A0M(rectF, f, f2, f3, f4);
        this.A0F.A00(rectF.width() / 1020.0f);
    }

    public void A0P(JSONObject jSONObject) {
        super.A0P(jSONObject);
        jSONObject.put("hour", this.A00);
        jSONObject.put("minute", this.A01);
        jSONObject.put("theme", this.A0A);
    }

    public AnonymousClass4vI(Context context, C620733j r3, JSONObject jSONObject) {
        this(context, r3, false);
        this.A00 = jSONObject.getInt("hour");
        this.A01 = jSONObject.getInt("minute");
        this.A0A = Boolean.valueOf(jSONObject.getBoolean("theme"));
        super.A0O(jSONObject);
    }
}
