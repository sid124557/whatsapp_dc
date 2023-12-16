package X;

import android.graphics.PointF;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;

/* renamed from: X.5Uy  reason: invalid class name and case insensitive filesystem */
public final class C105445Uy {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0052, code lost:
        if (r10 > (r1 * 0.7277778f)) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.InteractiveAnnotation A00(android.widget.ImageView r7, X.AnonymousClass1VX r8, X.C30471mV r9, float r10, float r11) {
        /*
            r6 = 0
            r4 = 1
            int r3 = X.C18300x5.A05(r7, r9, r4)
            android.graphics.drawable.Drawable r5 = r7.getDrawable()
            if (r5 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            android.graphics.Matrix r1 = X.AnonymousClass002.A05()
            android.graphics.Matrix r0 = r7.getImageMatrix()
            r0.invert(r1)
            float[] r2 = new float[r3]
            int r0 = r7.getLeft()
            float r0 = (float) r0
            float r0 = r10 - r0
            r2[r6] = r0
            int r0 = r7.getTop()
            float r0 = (float) r0
            float r11 = r11 - r0
            r2[r4] = r11
            float[] r3 = new float[r3]
            int r0 = r5.getIntrinsicWidth()
            float r0 = (float) r0
            r3[r6] = r0
            int r0 = r5.getIntrinsicHeight()
            float r0 = (float) r0
            r3[r4] = r0
            r1.mapPoints(r2)
            float r1 = X.AnonymousClass4L0.A00(r7)
            r0 = 1042983595(0x3e2aaaab, float:0.16666667)
            float r0 = r0 * r1
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0054
            r0 = 1060786085(0x3f3a4fa5, float:0.7277778)
            float r1 = r1 * r0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            com.whatsapp.InteractiveAnnotation r0 = A01(r8, r9, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105445Uy.A00(android.widget.ImageView, X.1VX, X.1mV, float, float):com.whatsapp.InteractiveAnnotation");
    }

    public static final InteractiveAnnotation A01(AnonymousClass1VX r21, C30471mV r22, float[] fArr, float[] fArr2, boolean z) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        AnonymousClass1VX r7 = r21;
        C162457s7.A0J(r7, 0);
        AnonymousClass33C r0 = r22.A01;
        if (!(r0 == null || (interactiveAnnotationArr = r0.A0X) == null || interactiveAnnotationArr.length == 0)) {
            PointF A08 = AnonymousClass4L0.A08(fArr2[0], fArr2[1]);
            SerializablePoint serializablePoint = new SerializablePoint((double) ((int) fArr[0]), (double) ((int) fArr[1]));
            SerializablePoint serializablePoint2 = new SerializablePoint(serializablePoint.x / ((double) A08.x), serializablePoint.y / ((double) A08.y));
            boolean A0X = r7.A0X(6444);
            for (InteractiveAnnotation interactiveAnnotation : interactiveAnnotationArr) {
                if (A0X || (interactiveAnnotation.data instanceof SerializableLocation)) {
                    SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                    C162457s7.A0C(serializablePointArr);
                    int length = serializablePointArr.length;
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        int i2 = length;
                        if (i >= i2) {
                            break;
                        }
                        SerializablePoint serializablePoint3 = serializablePointArr[i];
                        i++;
                        SerializablePoint serializablePoint4 = serializablePointArr[i % i2];
                        double d = serializablePoint3.x;
                        double d2 = serializablePoint2.x;
                        if ((d <= d2 && d2 < serializablePoint4.x) || (serializablePoint4.x <= d2 && d2 < d)) {
                            double d3 = serializablePoint4.y;
                            double d4 = serializablePoint3.y;
                            if (serializablePoint2.y < (((d3 - d4) * (d2 - d)) / (serializablePoint4.x - d)) + d4) {
                                z2 = !z2;
                            }
                        }
                    }
                    if (z2 && (!(interactiveAnnotation.data instanceof C53042mS) || !z)) {
                        return interactiveAnnotation;
                    }
                }
            }
        }
        return null;
    }
}
