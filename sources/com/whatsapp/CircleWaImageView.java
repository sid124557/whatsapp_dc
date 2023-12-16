package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1Hh;
import X.AnonymousClass4L0;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CircleWaImageView extends AnonymousClass1Hh {
    public static final Bitmap.Config A0A = Bitmap.Config.ARGB_8888;
    public static final ImageView.ScaleType A0B = ImageView.ScaleType.CENTER_CROP;
    public float A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public BitmapShader A04;
    public Matrix A05;
    public Paint A06;
    public boolean A07;
    public boolean A08;
    public final RectF A09;

    public final void A08() {
        float width;
        float height;
        if (!this.A07) {
            this.A08 = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.A03;
            if (bitmap != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.A04 = new BitmapShader(bitmap, tileMode, tileMode);
                Paint paint = this.A06;
                paint.setAntiAlias(true);
                paint.setShader(this.A04);
                this.A01 = this.A03.getHeight();
                this.A02 = this.A03.getWidth();
                RectF rectF = this.A09;
                int A062 = AnonymousClass000.A06(this, getWidth());
                int A052 = AnonymousClass000.A05(this, getHeight());
                int min = Math.min(A062, A052);
                float paddingLeft = ((float) getPaddingLeft()) + (((float) (A062 - min)) / 2.0f);
                float paddingTop = ((float) getPaddingTop()) + (((float) (A052 - min)) / 2.0f);
                float f = (float) min;
                rectF.set(AnonymousClass4L0.A09(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop));
                this.A00 = C86664Kz.A00(rectF.width(), 2.0f, rectF.height() / 2.0f);
                Matrix matrix = this.A05;
                matrix.set((Matrix) null);
                float f2 = 0.0f;
                if (((float) this.A02) * rectF.height() > rectF.width() * ((float) this.A01)) {
                    width = rectF.height() / ((float) this.A01);
                    f2 = (rectF.width() - (((float) this.A02) * width)) * 0.5f;
                    height = 0.0f;
                } else {
                    width = rectF.width() / ((float) this.A02);
                    height = (rectF.height() - (((float) this.A01) * width)) * 0.5f;
                }
                matrix.setScale(width, width);
                matrix.postTranslate(((float) ((int) (f2 + 0.5f))) + rectF.left, ((float) ((int) (height + 0.5f))) + rectF.top);
                this.A04.setLocalMatrix(matrix);
            }
            invalidate();
        }
    }

    public ImageView.ScaleType getScaleType() {
        return A0B;
    }

    public void onDraw(Canvas canvas) {
        if (this.A03 != null) {
            RectF rectF = this.A09;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A00, this.A06);
        }
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw AnonymousClass001.A0c("adjustViewBounds not supported.");
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != A0B) {
            throw AnonymousClass001.A0c(String.format("ScaleType %s not supported.", AnonymousClass000.A1b(scaleType)));
        }
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = AnonymousClass002.A07();
        this.A06 = C86664Kz.A0Z();
        this.A05 = AnonymousClass002.A05();
        super.setScaleType(A0B);
        this.A07 = true;
        if (this.A08) {
            A08();
            this.A08 = false;
        }
    }

    public final void A07() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), A0A);
                    Canvas A062 = AnonymousClass4L0.A06(createBitmap);
                    drawable.setBounds(0, 0, A062.getWidth(), A062.getHeight());
                    drawable.draw(A062);
                    bitmap = createBitmap;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.A03 = bitmap;
        A08();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A08();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A07();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        A07();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        A07();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A07();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        A08();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        A08();
    }

    public CircleWaImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleWaImageView(Context context) {
        this(context, (AttributeSet) null);
    }
}
