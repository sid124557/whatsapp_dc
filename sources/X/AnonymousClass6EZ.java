package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.TextureView;

/* renamed from: X.6EZ  reason: invalid class name */
public class AnonymousClass6EZ extends TextureView implements AnonymousClass4GJ {
    public int A00;
    public C116855qy A01;
    public boolean A02;
    public boolean A03;

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A03) {
            setTransform((Matrix) null);
        } else {
            int i5 = this.A00;
            if (i5 == 90 || i5 == 270) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Matrix matrix = new Matrix();
                float f = (float) i5;
                float f2 = (float) measuredWidth;
                float f3 = f2 / 2.0f;
                float f4 = (float) measuredHeight;
                float f5 = f4 / 2.0f;
                matrix.postRotate(f, f3, f5);
                matrix.postScale(f2 / f4, f4 / f2, f3, f5);
                setTransform(matrix);
            }
        }
        this.A03 = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setRotationAngle(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (!(i == 90 || i == 270)) {
                this.A00 = 0;
                this.A03 = true;
            }
            requestLayout();
        }
    }

    public AnonymousClass6EZ(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
