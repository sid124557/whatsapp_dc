package com.whatsapp.components;

import X.AnonymousClass002;
import X.AnonymousClass4L0;
import X.C86624Kv;
import X.C86664Kz;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class InsetsDrawingView extends FrameLayout {
    public Paint A00;
    public final Path A01 = AnonymousClass002.A06();

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A00 != null) {
            int width = getWidth();
            int height = getHeight();
            Path path = this.A01;
            path.reset();
            float f = (float) width;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(0.0f, 0.0f, f, (float) getPaddingTop(), direction);
            float f2 = (float) height;
            path.addRect((float) AnonymousClass4L0.A03(this, width), 0.0f, f, f2, direction);
            float f3 = f2;
            path.addRect(0.0f, (float) (height - getPaddingBottom()), f, f3, direction);
            path.addRect(0.0f, 0.0f, (float) getPaddingLeft(), f3, direction);
            canvas2.drawPath(path, this.A00);
        }
    }

    public InsetsDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setColor(int i) {
        Paint A0Z = C86664Kz.A0Z();
        this.A00 = A0Z;
        C86624Kv.A0k(getResources(), A0Z, i);
        setBackgroundResource(R.color.f5nameremoved);
    }

    public InsetsDrawingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InsetsDrawingView(Context context) {
        super(context);
    }
}
