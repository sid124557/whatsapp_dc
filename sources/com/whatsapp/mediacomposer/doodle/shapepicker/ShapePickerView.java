package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass001;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.C104435Qy;
import X.C116855qy;
import X.C179478jD;
import X.C22121Ep;
import X.C55682qk;
import X.C64333Db;
import X.C73173f3;
import X.C86604Kt;
import X.C88864av;
import X.C991854t;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class ShapePickerView extends RelativeLayout implements C179478jD, AnonymousClass4GJ {
    public ValueAnimator A00;
    public Bitmap A01;
    public Bitmap A02;
    public RectF A03;
    public C55682qk A04;
    public C104435Qy A05;
    public C991854t A06;
    public AnonymousClass4FS A07;
    public C116855qy A08;
    public boolean A09;
    public final Paint A0A;

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A04 = C64333Db.A01(A002);
            this.A07 = C64333Db.A8y(A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4.A02 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r4 = this;
            X.54t r0 = r4.A06
            X.C18290x4.A1L(r0)
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x000c
            r0.cancel()
        L_0x000c:
            r3 = 0
            r4.A03 = r3
            android.graphics.Bitmap r2 = r4.A01
            if (r2 != 0) goto L_0x0018
            android.graphics.Bitmap r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x0020
        L_0x0018:
            r1 = 1
            if (r2 == 0) goto L_0x0020
            r2.recycle()
            r4.A01 = r3
        L_0x0020:
            android.graphics.Bitmap r0 = r4.A02
            if (r0 == 0) goto L_0x0029
            r0.recycle()
            r4.A02 = r3
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView.A02():boolean");
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A0A);
        }
        super.draw(canvas);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A0A = C86604Kt.A0B();
    }

    public void A01(Bitmap bitmap, C104435Qy r11) {
        if (A02()) {
            invalidate();
        }
        if (r11.A04 <= 0 || r11.A03 <= 0) {
            C55682qk r3 = this.A04;
            ((C22121Ep) r3).A0E(new C73173f3("shape-picker-doodle-view-state-dimen"), "shape-picker-doodle-view-state-dimen", r11.toString(), AnonymousClass001.A0t(), true);
            return;
        }
        this.A05 = r11;
        this.A02 = bitmap;
        RectF rectF = r11.A0B;
        this.A03 = new RectF(rectF);
        C991854t r2 = new C991854t(r11.A0A, new Rect(0, 0, r11.A04, r11.A03), new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom), this);
        this.A06 = r2;
        this.A07.BkL(r2, bitmap);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C104435Qy r1 = this.A05;
        if (r1 != null && this.A02 != null && !r1.A0B.equals(this.A03)) {
            A01(this.A02.copy(Bitmap.Config.ARGB_8888, true), this.A05);
        }
    }

    public ShapePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0A = C86604Kt.A0B();
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public ShapePickerView(Context context) {
        super(context);
        A00();
        this.A0A = C86604Kt.A0B();
    }
}
