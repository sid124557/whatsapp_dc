package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.6N6  reason: invalid class name */
public class AnonymousClass6N6 extends AnonymousClass6N7 implements C180498lA {
    public C151847Wn A00;
    public final C159167lF A01 = new C159167lF(this);

    public AnonymousClass6N6(Context context) {
        super(context, (AttributeSet) null);
    }

    public C151847Wn getCurrentRenderTree() {
        return this.A00;
    }

    public void offsetLeftAndRight(int i) {
        if (i != 0) {
            super.offsetLeftAndRight(i);
            C1443071a.A00(this, this.A01);
        }
    }

    public void offsetTopAndBottom(int i) {
        if (i != 0) {
            super.offsetTopAndBottom(i);
            C1443071a.A00(this, this.A01);
        }
    }

    public void onMeasure(int i, int i2) {
        C151847Wn r0 = this.A00;
        if (r0 == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(r0.A02(), this.A00.A01());
        }
    }

    public void setRenderTree(C151847Wn r2) {
        if (this.A00 != r2) {
            if (r2 == null) {
                this.A01.A04();
            }
            this.A00 = r2;
            requestLayout();
        }
    }

    public void setRenderTreeUpdateListener(C177898gd r4) {
        C159167lF r2 = this.A01;
        AnonymousClass7ON r1 = r2.A00;
        if (r1 == null) {
            r1 = new AnonymousClass7ON(r2, r2.A07);
            r2.A00 = r1;
        }
        r1.A00 = r4;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01.A02();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01.A03();
    }

    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            C1443071a.A00(this, this.A01);
        }
    }

    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            C1443071a.A00(this, this.A01);
        }
    }
}
