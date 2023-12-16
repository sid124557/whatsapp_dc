package com.whatsapp.mediacomposer.doodle;

import X.AnonymousClass000;
import X.AnonymousClass4GJ;
import X.AnonymousClass8MU;
import X.C104435Qy;
import X.C109255eK;
import X.C114825nf;
import X.C116855qy;
import X.C172638Mc;
import X.C179458jB;
import X.C71413c4;
import X.C86614Ku;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class ImagePreviewContentLayout extends FrameLayout implements AnonymousClass4GJ {
    public Rect A00;
    public RectF A01;
    public C114825nf A02;
    public C179458jB A03;
    public C109255eK A04;
    public C116855qy A05;
    public boolean A06;

    public void A00() {
        C109255eK r3 = this.A04;
        C172638Mc r1 = r3.A0H;
        if (r1 != null) {
            r1.A06 = false;
            r1.A07 = true;
        }
        r3.A0H = null;
        AnonymousClass8MU r12 = r3.A0F;
        if (r12 != null) {
            r12.A05 = false;
            r12.A06 = true;
        }
        r3.A0F = null;
        AnonymousClass8MU r13 = r3.A0E;
        if (r13 != null) {
            r13.A05 = false;
            r13.A06 = true;
        }
        r3.A0E = null;
        C71413c4 r14 = r3.A0D;
        if (r14 != null) {
            r14.A03 = true;
        }
        r3.A0D = null;
        r3.A0B = null;
        r3.A0B = null;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public GestureDetector.OnGestureListener getActionHandler() {
        return this.A04;
    }

    public void onDraw(Canvas canvas) {
        canvas.setMatrix(this.A04.A06);
        Rect rect = this.A00;
        canvas.getClipBounds(rect);
        C114825nf r2 = this.A02;
        float f = this.A04.A00;
        C104435Qy r0 = r2.A0N;
        r0.A05 = rect;
        r0.A01 = f;
        super.onDraw(canvas);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A04.A0B = onClickListener;
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C86614Ku.A13(context, this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            RectF rectF = this.A01;
            rectF.set(0.0f, 0.0f, (float) AnonymousClass000.A06(this, getWidth()), (float) AnonymousClass000.A05(this, getHeight()));
            C109255eK r1 = this.A04;
            r1.A08.set(rectF);
            r1.A00();
            C109255eK r2 = this.A04;
            r2.A0J = true;
            Matrix matrix = r2.A05;
            if (matrix == null || matrix.equals(r2.A06)) {
                r2.A00();
            }
        }
    }

    public void setDoodleController(C114825nf r1) {
        this.A02 = r1;
    }

    public void setImagePreviewContentLayoutListener(C179458jB r1) {
        this.A03 = r1;
    }

    public void setZoomableViewController(C109255eK r1) {
        this.A04 = r1;
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C86614Ku.A13(context, this);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C86614Ku.A13(context, this);
    }

    public ImagePreviewContentLayout(Context context) {
        super(context);
        C86614Ku.A13(context, this);
    }

    public ImagePreviewContentLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }
}
