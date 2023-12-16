package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.C100895Cr;
import X.C116855qy;
import X.C623834u;
import X.C86624Kv;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class WallpaperImagePreview extends AppCompatImageView implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;
    public boolean A02;
    public final Path A03;
    public final RectF A04;
    public final float[] A05;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A02) {
            canvas.clipPath(this.A03);
        }
        super.onDraw(canvas);
    }

    public void setRoundBottomCorners(boolean z) {
        this.A02 = z;
        invalidate();
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = AnonymousClass002.A06();
        this.A04 = AnonymousClass002.A07();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.A05 = fArr;
        this.A02 = false;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        C86624Kv.A1U(fArr, C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100895Cr.A0C);
        try {
            this.A02 = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02) {
            Path path = this.A03;
            path.reset();
            RectF rectF = this.A04;
            rectF.right = (float) getMeasuredWidth();
            rectF.bottom = (float) getMeasuredHeight();
            path.addRoundRect(rectF, this.A05, Path.Direction.CW);
            path.close();
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Point A012 = C623834u.A01(getContext());
            float f = (float) A012.x;
            float f2 = (float) A012.y;
            float f3 = ((float) (i3 - i)) / f;
            float max = Math.max(f / intrinsicWidth, f2 / intrinsicHeight) * f3;
            Matrix imageMatrix = getImageMatrix();
            float f4 = 0.0f;
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            float f5 = ((f * f3) - (intrinsicWidth * max)) / 2.0f;
            float f6 = ((f2 * f3) - (intrinsicHeight * max)) / 2.0f;
            if (C86634Kw.A0E(this).orientation != 2) {
                f4 = f6;
            }
            imageMatrix.postTranslate(f5, f4);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WallpaperImagePreview(Context context) {
        this(context, (AttributeSet) null);
    }
}
