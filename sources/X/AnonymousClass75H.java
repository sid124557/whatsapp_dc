package X;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* renamed from: X.75H  reason: invalid class name */
public abstract class AnonymousClass75H {
    public static void A00(int i, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        int i3 = width;
        int[] iArr2 = iArr;
        int i4 = width;
        int i5 = height;
        bitmap2.getPixels(iArr2, 0, i4, 0, 0, i3, i5);
        int i6 = width - 1;
        int i7 = height - 1;
        int i8 = i;
        int i9 = i + i + 1;
        int[] iArr3 = new int[i2];
        int[] iArr4 = new int[i2];
        int[] iArr5 = new int[i2];
        int[] iArr6 = new int[Math.max(width, height)];
        int i10 = (i9 + 1) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * 256;
        int[] iArr7 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr7[i13] = i13 / i11;
        }
        int[] A1Z = C86664Kz.A1Z();
        A1Z[1] = 3;
        A1Z[0] = i9;
        int[][] iArr8 = (int[][]) Array.newInstance(Integer.TYPE, A1Z);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < height; i16++) {
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            for (int i26 = -i8; i26 <= i8; i26++) {
                int i27 = iArr[i14 + Math.min(i6, Math.max(i26, 0))];
                int[] iArr9 = iArr8[i26 + i];
                iArr9[0] = (i27 & 16711680) >> 16;
                iArr9[1] = (i27 & 65280) >> 8;
                int i28 = i27 & 255;
                iArr9[2] = i28;
                int abs = (i + 1) - Math.abs(i26);
                int i29 = iArr9[0];
                i17 += i29 * abs;
                int i30 = iArr9[1];
                i18 += i30 * abs;
                i19 += abs * i28;
                if (i26 > 0) {
                    i23 += i29;
                    i24 += i30;
                    i25 += i28;
                } else {
                    i20 += i29;
                    i21 += i30;
                    i22 += i28;
                }
            }
            int i31 = i8;
            for (int i32 = 0; i32 < width; i32++) {
                iArr3[i14] = iArr7[i17];
                iArr4[i14] = iArr7[i18];
                iArr5[i14] = iArr7[i19];
                int i33 = i17 - i20;
                int i34 = i18 - i21;
                int i35 = i19 - i22;
                int[] iArr10 = iArr8[((i31 - i) + i9) % i9];
                int i36 = i20 - iArr10[0];
                int i37 = i21 - iArr10[1];
                int i38 = i22 - iArr10[2];
                if (i16 == 0) {
                    iArr6[i32] = Math.min(i32 + i + 1, i6);
                }
                int i39 = iArr[i15 + iArr6[i32]];
                int i40 = (i39 & 16711680) >> 16;
                iArr10[0] = i40;
                int i41 = (i39 & 65280) >> 8;
                iArr10[1] = i41;
                int i42 = i39 & 255;
                iArr10[2] = i42;
                int i43 = i23 + i40;
                int i44 = i24 + i41;
                int i45 = i25 + i42;
                i17 = i33 + i43;
                i18 = i34 + i44;
                i19 = i35 + i45;
                i31 = (i31 + 1) % i9;
                int[] iArr11 = iArr8[i31 % i9];
                int i46 = iArr11[0];
                i20 = i36 + i46;
                int i47 = iArr11[1];
                i21 = i37 + i47;
                int i48 = iArr11[2];
                i22 = i38 + i48;
                i23 = i43 - i46;
                i24 = i44 - i47;
                i25 = i45 - i48;
                i14++;
            }
            i15 += width;
        }
        for (int i49 = 0; i49 < width; i49++) {
            int i50 = -i8;
            int i51 = i50 * width;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            while (i50 <= i8) {
                int max = Math.max(0, i51) + i49;
                int[] iArr12 = iArr8[i50 + i];
                iArr12[0] = iArr3[max];
                iArr12[1] = iArr4[max];
                iArr12[2] = iArr5[max];
                int abs2 = (i + 1) - Math.abs(i50);
                i52 += iArr3[max] * abs2;
                i53 += iArr4[max] * abs2;
                i54 += iArr5[max] * abs2;
                if (i50 > 0) {
                    i58 += iArr12[0];
                    i59 += iArr12[1];
                    i60 += iArr12[2];
                } else {
                    i55 += iArr12[0];
                    i56 += iArr12[1];
                    i57 += iArr12[2];
                }
                if (i50 < i7) {
                    i51 += width;
                }
                i50++;
            }
            int i61 = i8;
            int i62 = i49;
            for (int i63 = 0; i63 < height; i63++) {
                iArr[i62] = (iArr[i62] & -16777216) | (iArr7[i52] << 16) | (iArr7[i53] << 8) | iArr7[i54];
                int i64 = i52 - i55;
                int i65 = i53 - i56;
                int i66 = i54 - i57;
                int[] iArr13 = iArr8[((i61 - i) + i9) % i9];
                int i67 = i55 - iArr13[0];
                int i68 = i56 - iArr13[1];
                int i69 = i57 - iArr13[2];
                if (i49 == 0) {
                    iArr6[i63] = Math.min(i63 + i + 1, i7) * width;
                }
                int i70 = iArr6[i63] + i49;
                int i71 = iArr3[i70];
                iArr13[0] = i71;
                int i72 = iArr4[i70];
                iArr13[1] = i72;
                int i73 = iArr5[i70];
                iArr13[2] = i73;
                int i74 = i58 + i71;
                int i75 = i59 + i72;
                int i76 = i60 + i73;
                i52 = i64 + i74;
                i53 = i65 + i75;
                i54 = i66 + i76;
                i61 = (i61 + 1) % i9;
                int[] iArr14 = iArr8[i61];
                int i77 = iArr14[0];
                i55 = i67 + i77;
                int i78 = iArr14[1];
                i56 = i68 + i78;
                int i79 = iArr14[2];
                i57 = i69 + i79;
                i58 = i74 - i77;
                i59 = i75 - i78;
                i60 = i76 - i79;
                i62 += width;
            }
        }
        bitmap2.setPixels(iArr2, 0, i4, 0, 0, i3, i5);
    }
}
