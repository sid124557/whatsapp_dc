package com.whatsapp.inappsupport.ui;

import X.AnonymousClass4SX;
import X.AnonymousClass5Yj;
import X.C86614Ku;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public class AddScreenshotImageView extends WaImageView {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Bitmap A07;
    public BitmapShader A08;
    public Matrix A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public RectF A0E;
    public RectF A0F;
    public boolean A0G;
    public final ImageView.ScaleType A0H;

    public final void A07() {
        super.setScaleType(this.A0H);
        Resources resources = getResources();
        Drawable drawable = resources.getDrawable(R.drawable.ic_action_add);
        drawable.setColorFilter(resources.getColor(AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved)), PorterDuff.Mode.SRC_IN);
        super.setImageDrawable(drawable);
        super.setContentDescription(getContext().getString(R.string.f11nameremoved));
    }

    public final void A08() {
        C86614Ku.A10(getContext(), this.A0A, AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        C86614Ku.A10(getContext(), this.A0B, R.color.f5nameremoved);
        C86614Ku.A10(getContext(), this.A0C, R.color.f5nameremoved);
        this.A06 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A05 = dimensionPixelSize;
        float f = (float) this.A04;
        float f2 = (float) this.A06;
        this.A00 = f * ((f2 - (((float) dimensionPixelSize) * 2.0f)) / f2);
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.A07;
        RectF rectF = this.A0E;
        float f = (float) this.A04;
        if (bitmap == null) {
            canvas.drawRoundRect(rectF, f, f, this.A0A);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (this.A03 / 2), this.A0C);
            super.onDraw(canvas);
            return;
        }
        canvas.drawRoundRect(rectF, f, f, this.A0B);
        RectF rectF2 = this.A0F;
        float f2 = this.A00;
        canvas.drawRoundRect(rectF2, f2, f2, this.A0D);
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A0H = ImageView.ScaleType.CENTER;
        AnonymousClass4SX.A02(this);
    }

    public final void A09() {
        float width;
        float height;
        if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A07;
            if (bitmap == null) {
                A07();
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A08 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A0D;
                paint.setAntiAlias(true);
                paint.setShader(this.A08);
                this.A01 = this.A07.getHeight();
                this.A02 = this.A07.getWidth();
                Matrix matrix = this.A09;
                matrix.set((Matrix) null);
                RectF rectF = this.A0F;
                float f = 0.0f;
                if (((float) this.A02) * rectF.height() > rectF.width() * ((float) this.A01)) {
                    width = rectF.height() / ((float) this.A01);
                    f = (rectF.width() - (((float) this.A02) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A02);
                    height = (rectF.height() - (((float) this.A01) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                this.A08.setLocalMatrix(matrix);
            }
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RectF rectF = this.A0E;
        float f = (float) this.A06;
        rectF.set(0.0f, 0.0f, f, f);
        RectF rectF2 = this.A0F;
        int i3 = this.A05;
        float f2 = (float) i3;
        float f3 = (float) (this.A06 - i3);
        rectF2.set(f2, f2, f3, f3);
        int i4 = this.A06;
        setMeasuredDimension(i4, i4);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A09();
    }

    public void setScreenshot(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.A07 = bitmap;
        A09();
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A0H = ImageView.ScaleType.CENTER;
        AnonymousClass4SX.A02(this);
    }

    public AddScreenshotImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public AddScreenshotImageView(Context context) {
        super(context);
        A05();
        this.A0H = ImageView.ScaleType.CENTER;
        AnonymousClass4SX.A02(this);
    }
}
