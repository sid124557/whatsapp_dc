package X;

import android.graphics.Color;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.5VG  reason: invalid class name */
public class AnonymousClass5VG {
    public static void A00(View view, int i) {
        Integer[] numArr = C106305Yl.A01;
        int i2 = -1;
        double d = Double.MAX_VALUE;
        for (int i3 = 0; i3 < numArr.length; i3++) {
            double[] A02 = C106305Yl.A02(C106305Yl.A01(numArr[i3].intValue()));
            double[] A022 = C106305Yl.A02(C106305Yl.A01(i));
            double d2 = A02[0] - A022[0];
            double d3 = A02[1];
            double d4 = A022[1];
            double d5 = A02[2];
            double d6 = A022[2];
            double d7 = d5 - d6;
            double sqrt = Math.sqrt(Math.pow(d3, 2.0d) + Math.pow(d5, 2.0d));
            double sqrt2 = sqrt - Math.sqrt(Math.pow(d4, 2.0d) + Math.pow(d6, 2.0d));
            double pow = (Math.pow(d3 - d4, 2.0d) + Math.pow(d7, 2.0d)) - Math.pow(sqrt2, 2.0d);
            double d8 = 0.0d;
            if (pow > 0.0d) {
                d8 = Math.sqrt(pow);
            }
            double sqrt3 = Math.sqrt((double) ((float) (Math.pow(d2 / 1.0d, 2.0d) + Math.pow(sqrt2 / ((0.045d * sqrt) + 1.0d), 2.0d) + Math.pow(d8 / ((sqrt * 0.015d) + 1.0d), 2.0d))));
            if (sqrt3 < d) {
                i2 = numArr[i3].intValue();
                d = sqrt3;
            }
        }
        View view2 = view;
        view2.setContentDescription(view2.getResources().getString(R.string.f11nameremoved, AnonymousClass000.A1b(view2.getResources().getString(((Number) AnonymousClass001.A0i(C106305Yl.A00, i2)).intValue()))));
    }

    public static int[] A01(int i) {
        int i2;
        int[] iArr = new int[i];
        int i3 = i / 10;
        int i4 = i / 30;
        int i5 = ((i - i3) - i4) - i3;
        int i6 = 0;
        while (true) {
            if (i6 >= i3) {
                break;
            }
            int i7 = (i6 * 255) / i3;
            iArr[i6] = i7 | (i7 << 16) | -16777216 | (i7 << 8);
            i6++;
        }
        for (i2 = 0; i2 < i4; i2++) {
            iArr[i3 + i2] = -1;
        }
        float[] fArr = new float[3];
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        for (int i8 = 0; i8 < i3; i8++) {
            fArr[1] = ((float) i8) / ((float) i3);
            iArr[i3 + i4 + i8] = Color.HSVToColor(fArr);
        }
        fArr[1] = 0.8f;
        fArr[2] = 1.0f;
        for (int i9 = 0; i9 < i5; i9++) {
            fArr[0] = (((float) i9) * 360.0f) / ((float) i5);
            iArr[i3 + i4 + i3 + i9] = Color.HSVToColor(fArr);
        }
        return iArr;
    }
}
