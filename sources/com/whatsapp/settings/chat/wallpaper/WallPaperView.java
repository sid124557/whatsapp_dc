package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4GJ;
import X.AnonymousClass5ZT;
import X.AnonymousClass8JZ;
import X.C116855qy;
import X.C162457s7;
import X.C179668jW;
import X.C18260x0;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public final class WallPaperView extends AppCompatImageView implements AnonymousClass4GJ {
    public RectF A00;
    public C179668jW A01;
    public C116855qy A02;
    public boolean A03;
    public boolean A04;
    public float[] A05;
    public final Path A06;

    public void onDraw(Canvas canvas) {
        boolean z;
        C179668jW r0;
        AnonymousClass5ZT r02;
        C162457s7.A0J(canvas, 0);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = this.A00;
        boolean z2 = true;
        if (rectF == null) {
            if (!isInEditMode()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("redraw:");
                A0o.append(measuredWidth);
                C18260x0.A0y(" | ", A0o, measuredHeight);
            }
            rectF = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight);
            this.A00 = rectF;
        } else {
            float f = (float) measuredWidth;
            if (rectF.width() == f && rectF.height() == ((float) measuredHeight)) {
                z = false;
                Path path = this.A06;
                path.rewind();
                path.addRoundRect(rectF, this.A05, Path.Direction.CW);
                canvas.clipPath(path);
                super.onDraw(canvas);
                if (measuredHeight <= 0 || measuredWidth <= 0) {
                    z2 = false;
                }
                if ((z || this.A04) && z2 && (r0 = this.A01) != null && (r02 = ((AnonymousClass8JZ) r0).A00.A5q) != null) {
                    r02.A0n.A0D();
                }
                return;
            }
            rectF.set(0.0f, 0.0f, f, (float) measuredHeight);
            if (!isInEditMode()) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("redraw changed:");
                A0o2.append(measuredWidth);
                C18260x0.A0y(" | ", A0o2, measuredHeight);
            }
        }
        z = true;
        Path path2 = this.A06;
        path2.rewind();
        path2.addRoundRect(rectF, this.A05, Path.Direction.CW);
        canvas.clipPath(path2);
        super.onDraw(canvas);
        z2 = false;
        if (z || this.A04) {
            r02.A0n.A0D();
        }
    }

    public final void setDrawable(Drawable drawable) {
        this.A04 = true;
        setImageDrawable(drawable);
        invalidate();
    }

    public final void setRadii(float[] fArr) {
        C162457s7.A0J(fArr, 0);
        this.A05 = fArr;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A02;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public WallPaperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float intrinsicWidth = ((float) (i3 - i)) / ((float) drawable.getIntrinsicWidth());
            float intrinsicHeight = ((float) (i4 - i2)) / ((float) drawable.getIntrinsicHeight());
            if (intrinsicWidth < intrinsicHeight) {
                intrinsicWidth = intrinsicHeight;
            }
            imageMatrix.setScale(intrinsicWidth, intrinsicWidth, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public final void setOnSizeChangedListener(C179668jW r1) {
        this.A01 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WallPaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C162457s7.A0J(context, 1);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        setScaleType(ImageView.ScaleType.MATRIX);
        this.A06 = AnonymousClass002.A06();
        float A012 = C86664Kz.A01(getResources(), R.dimen.f6nameremoved);
        float[] fArr = new float[8];
        fArr[0] = A012;
        fArr[1] = A012;
        fArr[2] = A012;
        fArr[3] = A012;
        C86624Kv.A1U(fArr, A012);
        this.A05 = fArr;
    }
}
