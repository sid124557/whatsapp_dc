package com.whatsapp.bloks;

import X.C18290x4;
import X.C86604Kt;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.whatsapp.R;

public class BloksCameraOverlay extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Path A08;
    public Path A09;
    public String A0A;
    public final Paint A0B = C86604Kt.A0B();

    public void A00(String str) {
        String str2 = str;
        this.A0A = str2;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.A07 = i;
        int i2 = displayMetrics.heightPixels;
        this.A03 = i2;
        this.A01 = 125;
        if (TextUtils.equals(str2, "card")) {
            i = (this.A07 * 3) / 4;
            i2 = this.A03 / 4;
        } else if (TextUtils.equals(str2, "square")) {
            i = this.A07 - ((int) (displayMetrics.density * 32.0f));
            this.A01 = 255;
            i2 = i;
        } else if (TextUtils.equals(str2, "selfie")) {
            i = (this.A07 * 4) / 5;
            i2 = (this.A03 * 3) / 5;
            this.A01 = 255;
        }
        int i3 = (this.A07 - i) / 2;
        this.A04 = i3;
        int i4 = (this.A03 - i2) / 2;
        this.A06 = i4;
        this.A05 = i3 + i;
        this.A02 = i4 + i2;
        this.A00 = C18290x4.A0G(this).getDimension(R.dimen.f6nameremoved);
        Path path = new Path();
        this.A08 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.A08.addRect(new RectF(0.0f, 0.0f, (float) this.A07, (float) this.A03), Path.Direction.CW);
        Path path2 = this.A08;
        RectF rectF = new RectF((float) this.A04, (float) this.A06, (float) this.A05, (float) this.A02);
        float f = displayMetrics.density * 16.0f;
        path2.addRoundRect(rectF, f, f, Path.Direction.CW);
        if (TextUtils.equals(str2, "selfie")) {
            int i5 = this.A04;
            int i6 = this.A06;
            int i7 = this.A05;
            int i8 = this.A02;
            float f2 = (float) i5;
            float f3 = (((float) (i7 - i5)) / 2.0f) + f2;
            float f4 = (float) i6;
            float f5 = (float) (i8 - i6);
            float f6 = 0.4f * f5;
            float f7 = f4 + f6;
            float f8 = 0.5f * f5;
            float f9 = (0.8f * f5) + f4;
            float f10 = f5 * 0.25f;
            float f11 = f10 / 10.0f;
            float f12 = f6 / 2.0f;
            float f13 = f8 / 2.0f;
            RectF rectF2 = new RectF(f3 - f12, f7 - f13, f12 + f3, f7 + f13);
            float f14 = (1.5f * f10) / 2.0f;
            float f15 = f10 / 2.0f;
            RectF rectF3 = new RectF(f3 - f14, f9 - f15, f3 + f14, f9 + f15);
            Path path3 = new Path();
            this.A09 = path3;
            path3.setFillType(Path.FillType.EVEN_ODD);
            Path path4 = this.A09;
            Path.Direction direction = Path.Direction.CW;
            path4.addOval(rectF2, direction);
            this.A09.addRoundRect(rectF3, f11, f11, direction);
            this.A09.addRect(f2, f4, (float) i7, (float) i8, direction);
        }
    }

    public void onDraw(Canvas canvas) {
        Paint paint = this.A0B;
        paint.setARGB(this.A01, 45, 52, 54);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(this.A08, paint);
        if (TextUtils.equals(this.A0A, "selfie")) {
            paint.setARGB(180, 50, 50, 50);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.A09, paint);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-2147418368);
        paint.setStrokeWidth(this.A00 * 2.0f);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i, String str) {
        super(context, attributeSet, i);
        A00(str);
    }

    public BloksCameraOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00((String) null);
    }

    public BloksCameraOverlay(Context context) {
        super(context);
        A00((String) null);
    }
}
