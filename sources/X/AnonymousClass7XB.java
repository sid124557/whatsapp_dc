package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.7XB  reason: invalid class name */
public class AnonymousClass7XB {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public Paint A04 = new Paint(2);
    public C160697o9 A05 = null;
    public C160697o9 A06 = null;
    public C160697o9[] A07 = new C160697o9[4];
    public final Rect A08 = AnonymousClass001.A0N();
    public final RectF A09 = AnonymousClass002.A07();

    public void A00(Canvas canvas, float f, float f2) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap A012;
        C160697o9 r0 = this.A06;
        if (r0 != null) {
            bitmap = r0.A01();
        } else {
            bitmap = null;
        }
        Bitmap bitmap3 = C160697o9.A0F;
        if (bitmap != bitmap3) {
            float f3 = f;
            float f4 = f2;
            Canvas canvas2 = canvas;
            if (AnonymousClass000.A1W(bitmap)) {
                Paint paint = this.A04;
                paint.setAlpha(255);
                canvas2.drawBitmap(bitmap, f3, f4, paint);
                return;
            }
            Paint paint2 = this.A04;
            paint2.setAlpha(255);
            C160697o9[] r5 = this.A07;
            int i = 0;
            int i2 = 0;
            do {
                C160697o9 r2 = r5[i];
                if (!(r2 == null || r2.A04 != this.A02 + 1 || r2.A01() == null)) {
                    i2++;
                }
                i++;
            } while (i < 4);
            C160697o9 r02 = this.A05;
            if (r02 != null) {
                bitmap2 = r02.A01();
            } else {
                bitmap2 = null;
            }
            if (i2 != 4) {
                if (!(bitmap2 == null || bitmap2 == bitmap3)) {
                    int i3 = this.A02;
                    C160697o9 r1 = this.A05;
                    int i4 = i3 - r1.A04;
                    int i5 = r1.A00 >> i4;
                    int i6 = (1 << i4) - 1;
                    int i7 = (this.A00 & i6) * i5;
                    int i8 = (i6 & this.A01) * i5;
                    Rect rect = this.A08;
                    rect.set(i7, i8, i7 + i5, i5 + i8);
                    RectF rectF = this.A09;
                    C160697o9 r22 = this.A05;
                    rectF.set(f3, f4, ((float) r22.A01) + f, ((float) r22.A00) + f2);
                    canvas2.drawBitmap(bitmap2, rect, rectF, paint2);
                }
                if (i2 <= 0) {
                    return;
                }
            }
            int i9 = 0;
            do {
                int i10 = 0;
                do {
                    C160697o9 r15 = r5[(i9 << 1) + i10];
                    if (!(r15 == null || r15.A04 != this.A02 + 1 || (A012 = r15.A01()) == null || A012 == bitmap3)) {
                        int i11 = r15.A00;
                        int i12 = i11 >> 1;
                        float f5 = ((float) (i12 * i9)) + f;
                        float f6 = ((float) (i12 * i10)) + f2;
                        Rect rect2 = this.A08;
                        rect2.set(0, 0, r15.A01, i11);
                        RectF rectF2 = this.A09;
                        float f7 = (float) i12;
                        rectF2.set(f5, f6, f5 + f7, f7 + f6);
                        canvas2.drawBitmap(A012, rect2, rectF2, paint2);
                    }
                    i10++;
                } while (i10 < 2);
                i9++;
            } while (i9 < 2);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        A0o.append("{tile=");
        Object obj = this.A06;
        Object obj2 = "{x}";
        if (obj == null) {
            obj = obj2;
        }
        A0o.append(obj);
        A0o.append(", mParentTile=");
        Object obj3 = this.A05;
        if (obj3 != null) {
            obj2 = obj3;
        }
        A0o.append(obj2);
        A0o.append(", status=");
        A0o.append(this.A03);
        return AnonymousClass000.A0g(A0o);
    }
}
