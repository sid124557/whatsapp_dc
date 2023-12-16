package com.whatsapp.components.button;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4L0;
import X.C86634Kw;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.whatsapp.R;

public class ThumbnailPickerButton extends ThumbnailButton {
    public Path A00;
    public boolean A01;

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
        this.A00 = AnonymousClass002.A06();
    }

    public void A07(Canvas canvas) {
        super.A07(canvas);
        if (isEnabled()) {
            float f = this.A02;
            if (f > 0.0f) {
                float f2 = f * 7.0f;
                Path path = this.A00;
                path.reset();
                AnonymousClass001.A10(this.A05);
                RectF rectF = this.A09;
                path.moveTo(rectF.right, rectF.bottom - f2);
                path.lineTo(rectF.right, rectF.bottom - this.A02);
                float f3 = rectF.right;
                float f4 = this.A02 * 2.0f;
                float f5 = rectF.bottom;
                path.arcTo(AnonymousClass4L0.A09(f3 - f4, f5 - f4, f3, f5), 0.0f, 90.0f);
                path.lineTo(rectF.right - f2, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom - f2);
                this.A05.setColor(1409286144);
                canvas.drawPath(path, this.A05);
                path.reset();
                path.moveTo(rectF.right, rectF.bottom - f2);
                path.lineTo(rectF.right - f2, rectF.bottom);
                C86634Kw.A17(this.A05);
                this.A05.setStrokeJoin(Paint.Join.ROUND);
                this.A05.setStrokeCap(Paint.Cap.ROUND);
                this.A05.setStrokeWidth(getResources().getDimension(R.dimen.f6nameremoved));
                this.A05.setColor(-570425345);
                canvas.drawPath(path, this.A05);
            }
        }
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
        this.A00 = AnonymousClass002.A06();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public ThumbnailPickerButton(Context context) {
        super(context);
        A05();
        this.A00 = AnonymousClass002.A06();
    }
}
