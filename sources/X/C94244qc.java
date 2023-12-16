package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;

/* renamed from: X.4qc  reason: invalid class name and case insensitive filesystem */
public abstract class C94244qc extends AnonymousClass4SS {
    public float A00 = 3.0f;
    public float A01;
    public int A02 = -1;
    public int A03 = -1;
    public C179278it A04;
    public Runnable A05;
    public final Matrix A06 = AnonymousClass002.A05();
    public final Matrix A07 = AnonymousClass002.A05();
    public final Matrix A08 = AnonymousClass002.A05();
    public final Handler A09 = AnonymousClass000.A0A();
    public final C44892Xw A0A = new C44892Xw((Bitmap) null);
    public final float[] A0B = new float[9];

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || getScale() <= 1.0f) {
            return super.onKeyDown(i, keyEvent);
        }
        A02(1.0f, AnonymousClass4L0.A00(this) / 2.0f, C86664Kz.A02(this) / 2.0f);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (r1 < r2) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r8 = this;
            X.2Xw r3 = r8.A0A
            android.graphics.Bitmap r0 = r3.A00
            if (r0 == 0) goto L_0x0050
            android.graphics.Matrix r2 = r8.getImageViewMatrix()
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getWidth()
            float r1 = (float) r0
            android.graphics.Bitmap r0 = r3.A00
            int r0 = r0.getHeight()
            float r0 = (float) r0
            r5 = 0
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r5, r5, r1, r0)
            r2.mapRect(r7)
            float r1 = r7.height()
            float r6 = r7.width()
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = X.C86664Kz.A02(r8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
            float r3 = r3 - r1
            float r3 = r3 / r4
            float r0 = r7.top
        L_0x0037:
            float r3 = r3 - r0
        L_0x0038:
            float r2 = X.AnonymousClass4L0.A00(r8)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
            float r2 = r2 - r6
            float r2 = r2 / r4
            float r1 = r7.left
        L_0x0044:
            float r5 = r2 - r1
        L_0x0046:
            r8.A01(r5, r3)
            android.graphics.Matrix r0 = r8.getImageViewMatrix()
            r8.setImageMatrix(r0)
        L_0x0050:
            return
        L_0x0051:
            float r1 = r7.left
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            float r5 = -r1
            goto L_0x0046
        L_0x0059:
            float r1 = r7.right
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            goto L_0x0044
        L_0x0060:
            float r1 = r7.top
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
            float r3 = -r1
            goto L_0x0038
        L_0x0068:
            float r0 = r7.bottom
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            float r3 = X.C86664Kz.A02(r8)
            float r0 = r7.bottom
            goto L_0x0037
        L_0x0075:
            r3 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94244qc.A00():void");
    }

    public void A01(float f, float f2) {
        this.A08.postTranslate(f, f2);
    }

    public void A02(float f, float f2, float f3) {
        float f4 = this.A01;
        if (f > f4) {
            f = f4;
        }
        float scale = f / getScale();
        this.A08.postScale(scale, scale, f2, f3);
        setImageMatrix(getImageViewMatrix());
        A00();
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.A07;
        matrix.set(this.A06);
        matrix.postConcat(this.A08);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.A08;
        float[] fArr = this.A0B;
        matrix.getValues(fArr);
        return fArr[0];
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            A04(new C44892Xw(bitmap), true);
        }
    }

    public C94244qc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void A03(Matrix matrix, C44892Xw r11) {
        int width;
        int height;
        int width2;
        int height2;
        float A002 = AnonymousClass4L0.A00(this);
        float A022 = C86664Kz.A02(this);
        boolean A003 = r11.A00();
        Bitmap bitmap = r11.A00;
        if (A003) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        float f = (float) width;
        boolean A004 = r11.A00();
        Bitmap bitmap2 = r11.A00;
        if (A004) {
            height = bitmap2.getWidth();
        } else {
            height = bitmap2.getHeight();
        }
        float f2 = (float) height;
        matrix.reset();
        float f3 = this.A00;
        float min = Math.min(Math.min(A002 / f, f3), Math.min(A022 / f2, f3));
        Matrix A052 = AnonymousClass002.A05();
        if (r11.A01 != null) {
            A052.preTranslate((float) (-(r11.A00.getWidth() / 2)), (float) (-(r11.A00.getHeight() / 2)));
            A052.postConcat(r11.A01);
            boolean A005 = r11.A00();
            Bitmap bitmap3 = r11.A00;
            if (A005) {
                width2 = bitmap3.getHeight();
            } else {
                width2 = bitmap3.getWidth();
            }
            float f4 = (float) (width2 / 2);
            boolean A006 = r11.A00();
            Bitmap bitmap4 = r11.A00;
            if (A006) {
                height2 = bitmap4.getWidth();
            } else {
                height2 = bitmap4.getHeight();
            }
            A052.postTranslate(f4, (float) (height2 / 2));
        }
        matrix.postConcat(A052);
        matrix.postScale(min, min);
        matrix.postTranslate((A002 - (f * min)) / 2.0f, (A022 - (f2 * min)) / 2.0f);
    }

    public void A04(C44892Xw r6, boolean z) {
        int width;
        int height;
        float max;
        if (getWidth() <= 0) {
            this.A05 = new C117665sI(this, r6, 20, z);
            return;
        }
        Bitmap bitmap = r6.A00;
        Matrix matrix = this.A06;
        if (bitmap != null) {
            A03(matrix, r6);
            setImageBitmap(r6.A00, r6.A01);
        } else {
            matrix.reset();
            super.setImageBitmap((Bitmap) null);
        }
        if (z) {
            this.A08.reset();
        }
        setImageMatrix(getImageViewMatrix());
        C44892Xw r4 = this.A0A;
        if (r4.A00 == null) {
            max = 1.0f;
        } else {
            boolean A002 = r4.A00();
            Bitmap bitmap2 = r4.A00;
            if (A002) {
                width = bitmap2.getHeight();
            } else {
                width = bitmap2.getWidth();
            }
            float f = ((float) width) / ((float) this.A03);
            boolean A003 = r4.A00();
            Bitmap bitmap3 = r4.A00;
            if (A003) {
                height = bitmap3.getWidth();
            } else {
                height = bitmap3.getHeight();
            }
            max = Math.max(1.0f, Math.max(f, ((float) height) / ((float) this.A02)) * 4.0f);
        }
        this.A01 = max;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A03 = i3 - i;
        this.A02 = i4 - i2;
        Runnable runnable = this.A05;
        if (runnable != null) {
            this.A05 = null;
            runnable.run();
        }
        C44892Xw r1 = this.A0A;
        if (r1.A00 != null) {
            A03(this.A06, r1);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void setMaxProperScale(float f) {
        this.A00 = f;
    }

    public void setRecycler(C179278it r1) {
        this.A04 = r1;
    }

    public final void setImageBitmap(Bitmap bitmap, Matrix matrix) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
            drawable.setFilterBitmap(true);
        }
        C44892Xw r0 = this.A0A;
        r0.A00 = bitmap;
        r0.A01 = matrix;
    }
}
