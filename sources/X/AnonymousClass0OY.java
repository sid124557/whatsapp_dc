package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0OY  reason: invalid class name */
public final class AnonymousClass0OY {
    public Rect A00;
    public final Bitmap A01;
    public final List A02;
    public final List A03;

    public AnonymousClass0TJ A00() {
        C15140qq[] r0;
        float f;
        float f2;
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Bitmap bitmap2 = bitmap;
            int width = bitmap.getWidth() * bitmap.getHeight();
            if (width > 12544) {
                double sqrt = Math.sqrt(((double) 12544) / ((double) width));
                if (sqrt > 0.0d) {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * sqrt), (int) Math.ceil(((double) bitmap.getHeight()) * sqrt), false);
                }
            }
            Rect rect = this.A00;
            if (!(bitmap2 == bitmap || rect == null)) {
                double width2 = ((double) bitmap2.getWidth()) / ((double) bitmap.getWidth());
                rect.left = (int) Math.floor(((double) rect.left) * width2);
                rect.top = (int) Math.floor(((double) rect.top) * width2);
                rect.right = Math.min((int) Math.ceil(((double) rect.right) * width2), bitmap2.getWidth());
                rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width2), bitmap2.getHeight());
            }
            int width3 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[(width3 * height)];
            bitmap2.getPixels(iArr, 0, width3, 0, 0, width3, height);
            Rect rect2 = this.A00;
            if (rect2 != null) {
                int width4 = rect2.width();
                int height2 = this.A00.height();
                int[] iArr2 = new int[(width4 * height2)];
                for (int i = 0; i < height2; i++) {
                    Rect rect3 = this.A00;
                    System.arraycopy(iArr, ((rect3.top + i) * width3) + rect3.left, iArr2, i * width4, width4);
                }
                iArr = iArr2;
            }
            List list = this.A02;
            if (list.isEmpty()) {
                r0 = null;
            } else {
                r0 = (C15140qq[]) list.toArray(new C15140qq[list.size()]);
            }
            C06000Vu r1 = new C06000Vu(iArr, r0);
            if (bitmap2 != bitmap) {
                bitmap2.recycle();
            }
            AnonymousClass0TJ r8 = new AnonymousClass0TJ(r1.A00, this.A03);
            List list2 = r8.A03;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0TE r5 = (AnonymousClass0TE) list2.get(i2);
                float[] fArr = r5.A02;
                float f3 = 0.0f;
                for (float f4 : fArr) {
                    if (f4 > 0.0f) {
                        f3 += f4;
                    }
                }
                if (f3 != 0.0f) {
                    for (int i3 = 0; i3 < r11; i3++) {
                        float f5 = fArr[i3];
                        if (f5 > 0.0f) {
                            fArr[i3] = f5 / f3;
                        }
                    }
                }
                Map map = r8.A04;
                List list3 = r8.A02;
                int size2 = list3.size();
                float f6 = 0.0f;
                AnonymousClass0QX r3 = null;
                for (int i4 = 0; i4 < size2; i4++) {
                    AnonymousClass0QX r2 = (AnonymousClass0QX) list3.get(i4);
                    float[] A012 = r2.A01();
                    int i5 = 1;
                    float f7 = A012[1];
                    float[] fArr2 = r5.A01;
                    if (f7 >= fArr2[0] && f7 <= fArr2[2]) {
                        float f8 = A012[2];
                        float[] fArr3 = r5.A00;
                        if (f8 >= fArr3[0] && f8 <= fArr3[2] && !r8.A00.get(r2.A08)) {
                            float[] A013 = r2.A01();
                            AnonymousClass0QX r12 = r8.A01;
                            if (r12 != null) {
                                i5 = r12.A06;
                            }
                            float[] fArr4 = r5.A02;
                            float f9 = fArr4[0];
                            float f10 = 0.0f;
                            if (f9 > 0.0f) {
                                f = f9 * (1.0f - AnonymousClass002.A00(A013[1], fArr2[1]));
                            } else {
                                f = 0.0f;
                            }
                            float f11 = fArr4[1];
                            if (f11 > 0.0f) {
                                f2 = f11 * (1.0f - AnonymousClass002.A00(A013[2], fArr3[1]));
                            } else {
                                f2 = 0.0f;
                            }
                            float f12 = fArr4[2];
                            if (f12 > 0.0f) {
                                f10 = f12 * (((float) r2.A06) / ((float) i5));
                            }
                            float f13 = f + f2 + f10;
                            if (r3 == null || f13 > f6) {
                                r3 = r2;
                                f6 = f13;
                            }
                        }
                    }
                }
                if (r3 != null) {
                    r8.A00.append(r3.A08, true);
                }
                map.put(r5, r3);
            }
            r8.A00.clear();
            return r8;
        }
        throw new AssertionError();
    }

    public void A01(int i, int i2, int i3, int i4) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Rect rect = this.A00;
            if (rect == null) {
                rect = AnonymousClass001.A0N();
                this.A00 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A00.intersect(i, i2, i3, i4)) {
                throw AnonymousClass001.A0c("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }

    public AnonymousClass0OY(Bitmap bitmap) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A03 = A0s;
        ArrayList A0s2 = AnonymousClass001.A0s();
        this.A02 = A0s2;
        if (!bitmap.isRecycled()) {
            A0s2.add(AnonymousClass0TJ.A05);
            this.A01 = bitmap;
            A0s.add(AnonymousClass0TE.A06);
            A0s.add(AnonymousClass0TE.A08);
            A0s.add(AnonymousClass0TE.A04);
            A0s.add(AnonymousClass0TE.A05);
            A0s.add(AnonymousClass0TE.A07);
            A0s.add(AnonymousClass0TE.A03);
            return;
        }
        throw AnonymousClass001.A0c("Bitmap is not valid");
    }
}
