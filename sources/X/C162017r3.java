package X;

import android.opengl.Matrix;
import java.util.Arrays;

/* renamed from: X.7r3  reason: invalid class name and case insensitive filesystem */
public abstract class C162017r3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass7TK A09;
    public final float[] A0A;
    public final float[] A0B;

    public static void A00(float[] fArr, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = (float) i;
        float f7 = (float) i2;
        float f8 = f6 / f7;
        float f9 = (float) i3;
        float f10 = (float) i4;
        float f11 = f9 / f10;
        if (i < i2) {
            f2 = f8;
            f = 1.0f;
        } else {
            f = f7 / f6;
            f2 = 1.0f;
        }
        if (i3 < i4) {
            f4 = f11;
            f3 = 1.0f;
        } else {
            f3 = f10 / f9;
            f4 = 1.0f;
        }
        if (f8 < f11) {
            f5 = f2 / f4;
        } else {
            f5 = f / f3;
        }
        Matrix.scaleM(fArr, 0, f5, f5, 1.0f);
    }

    public static void A01(float[] fArr, boolean z, boolean z2) {
        if (z || z2) {
            float f = -1.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = -1.0f;
            }
            if (!z2) {
                f = 1.0f;
            }
            Matrix.scaleM(fArr, 0, f2, f, 1.0f);
        }
    }

    public AnonymousClass7TK A02() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.A08) {
            this.A08 = false;
            AnonymousClass7TK r8 = this.A09;
            float[] fArr = this.A0B;
            int i = this.A04;
            int i2 = this.A03;
            int i3 = this.A01;
            int i4 = this.A00;
            int i5 = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A07;
            if (this instanceof C126196Mv) {
                C126196Mv r13 = (C126196Mv) this;
                int i6 = i;
                int i7 = i2;
                if (i5 % 180 != 0) {
                    i6 = i2;
                    i7 = i;
                }
                float[] fArr2 = r13.A00;
                System.arraycopy(fArr, 0, fArr2, 0, 16);
                Matrix.translateM(fArr2, 0, 0.5f, 0.5f, 0.0f);
                if (i < i2) {
                    f6 = ((float) i2) / ((float) i);
                    f5 = 1.0f;
                } else {
                    f5 = ((float) i) / ((float) i2);
                    f6 = 1.0f;
                }
                Matrix.scaleM(fArr2, 0, f6, f5, 1.0f);
                if (i5 != 0) {
                    Matrix.rotateM(fArr2, 0, (float) i5, 0.0f, 0.0f, -1.0f);
                }
                A00(fArr2, i6, i7, i3, i4);
                A01(fArr2, z, z2);
                Matrix.translateM(fArr2, 0, -0.5f, -0.5f, 0.0f);
                float[] fArr3 = r8.A03;
                System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
                float f7 = (float) i6;
                float f8 = (float) i7;
                float f9 = ((float) i3) / ((float) i4);
                if (f9 < f7 / f8) {
                    i6 = AnonymousClass001.A07(f8, f9);
                } else {
                    i7 = Math.round(f7 / f9);
                }
                r8.A01 = i6;
                r8.A00 = i7;
            } else {
                C126176Mt r6 = (C126176Mt) this;
                int i8 = i2;
                if (i5 % 180 == 0) {
                    i8 = i;
                    i = i2;
                }
                float[] fArr4 = r6.A00;
                System.arraycopy(fArr, 0, fArr4, 0, 16);
                Matrix.translateM(fArr4, 0, 0.5f, 0.5f, 0.0f);
                if (i5 != 0) {
                    Matrix.rotateM(fArr4, 0, (float) i5, 0.0f, 0.0f, -1.0f);
                }
                A00(fArr4, i8, i, i3, i4);
                A01(fArr4, z, z2);
                if (i3 < i4) {
                    f2 = (float) i3;
                    f = (float) i4;
                    f4 = f2 / f;
                    f3 = 1.0f;
                } else {
                    f = (float) i4;
                    f2 = (float) i3;
                    f3 = f / f2;
                    f4 = 1.0f;
                }
                Matrix.scaleM(fArr4, 0, f4, f3, 1.0f);
                Matrix.translateM(fArr4, 0, -0.5f, -0.5f, 0.0f);
                float[] fArr5 = r8.A03;
                System.arraycopy(fArr4, 0, fArr5, 0, fArr5.length);
                r8.A01 = i3;
                r8.A00 = i4;
                float[] fArr6 = r8.A02;
                Matrix.setIdentityM(fArr6, 0);
                Matrix.translateM(fArr6, 0, ((float) (i3 - i3)) / f2, ((float) (i4 - i4)) / f, 0.0f);
                Matrix.scaleM(fArr6, 0, (1.0f * f2) / f2, (1.0f * f) / f, 1.0f);
            }
        }
        return this.A09;
    }

    public void A03(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        if (i != this.A04 || i2 != this.A03 || i3 != this.A01 || i4 != this.A00 || i5 != this.A02 || z != this.A06 || z2 != this.A07) {
            this.A04 = i;
            this.A03 = i2;
            this.A01 = i3;
            this.A00 = i4;
            this.A02 = i5;
            this.A06 = z;
            this.A07 = z2;
            this.A08 = true;
        }
    }

    public C162017r3() {
        float[] fArr = new float[16];
        this.A0B = fArr;
        float[] fArr2 = new float[16];
        this.A0A = fArr2;
        AnonymousClass7TK r3 = new AnonymousClass7TK();
        this.A09 = r3;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        float[] fArr3 = r3.A03;
        System.arraycopy(fArr, 0, fArr3, 0, fArr3.length);
        float[] fArr4 = r3.A02;
        System.arraycopy(fArr2, 0, fArr4, 0, fArr4.length);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseScaleType{");
        String str = this.A05;
        if (str == null) {
            str = Arrays.toString(Arrays.copyOfRange(Thread.currentThread().getStackTrace(), 4, 15));
        }
        A0o.append(str);
        A0o.append(", mBaseMatrix=");
        A0o.append(Arrays.toString(this.A0B));
        A0o.append(", mBaseContentMatrix=");
        A0o.append(Arrays.toString(this.A0A));
        A0o.append(", mViewport=");
        A0o.append(this.A09);
        A0o.append(", mSrcWidth=");
        A0o.append(this.A04);
        A0o.append(", mSrcHeight=");
        A0o.append(this.A03);
        A0o.append(", mDstWidth=");
        A0o.append(this.A01);
        A0o.append(", mDstHeight=");
        A0o.append(this.A00);
        A0o.append(", mOrientation=");
        A0o.append(this.A02);
        A0o.append(", mFlipX=");
        A0o.append(this.A06);
        A0o.append(", mFlipY=");
        A0o.append(this.A07);
        return AnonymousClass000.A0d(A0o);
    }
}
