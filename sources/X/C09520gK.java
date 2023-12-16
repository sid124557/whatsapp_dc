package X;

import android.graphics.Color;
import java.util.ArrayList;

/* renamed from: X.0gK  reason: invalid class name and case insensitive filesystem */
public class C09520gK implements C16250si {
    public int A00;

    public C09520gK(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object BgT(C10470hz r21, float f) {
        int i;
        double d;
        ArrayList A0s = AnonymousClass001.A0s();
        int i2 = 0;
        boolean z = false;
        if (r21.A0C() == AnonymousClass0G4.BEGIN_ARRAY) {
            z = true;
            r21.A0G();
        }
        while (r21.A0N()) {
            A0s.add(Float.valueOf(C10470hz.A03(r21)));
        }
        if (z) {
            r21.A0I();
        }
        int i3 = this.A00;
        if (i3 == -1) {
            i3 = A0s.size() / 4;
            this.A00 = i3;
        }
        float[] fArr = new float[i3];
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i = this.A00 * 4;
            if (i2 >= i) {
                break;
            }
            int i6 = i2 / 4;
            double A05 = (double) AnonymousClass001.A05(A0s.get(i2));
            int i7 = i2 % 4;
            if (i7 == 0) {
                if (i6 > 0) {
                    float f2 = (float) A05;
                    if (fArr[i6 - 1] >= f2) {
                        fArr[i6] = f2 + 0.01f;
                    }
                }
                fArr[i6] = (float) A05;
            } else if (i7 == 1) {
                i4 = (int) (A05 * 255.0d);
            } else if (i7 == 2) {
                i5 = (int) (A05 * 255.0d);
            } else if (i7 == 3) {
                iArr[i6] = Color.argb(255, i4, i5, (int) (A05 * 255.0d));
            }
            i2++;
        }
        AnonymousClass0LJ r10 = new AnonymousClass0LJ(fArr, iArr);
        if (A0s.size() > i) {
            int size = (A0s.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i8 = 0;
            int i9 = 0;
            while (i < A0s.size()) {
                int i10 = i % 2;
                double A052 = (double) AnonymousClass001.A05(A0s.get(i));
                if (i10 == 0) {
                    dArr[i9] = A052;
                } else {
                    dArr2[i9] = A052;
                    i9++;
                }
                i++;
            }
            while (true) {
                int[] iArr2 = r10.A01;
                if (i8 >= iArr2.length) {
                    break;
                }
                int i11 = iArr2[i8];
                double d2 = (double) r10.A00[i8];
                int i12 = 1;
                while (true) {
                    if (i12 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i13 = i12 - 1;
                    double d3 = dArr[i13];
                    double d4 = dArr[i12];
                    if (d4 >= d2) {
                        double max = Math.max(0.0d, Math.min(1.0d, (d2 - d3) / (d4 - d3)));
                        double d5 = dArr2[i13];
                        d = d5 + (max * (dArr2[i12] - d5));
                        break;
                    }
                    i12++;
                }
                iArr2[i8] = Color.argb((int) (d * 255.0d), Color.red(i11), Color.green(i11), Color.blue(i11));
                i8++;
            }
        }
        return r10;
    }
}
