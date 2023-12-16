package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.5Y3  reason: invalid class name */
public abstract class AnonymousClass5Y3 {
    public AnonymousClass33C A00;
    public final int A01;

    public static int A01(AnonymousClass5Y3 r2) {
        int i;
        AnonymousClass5NR r0;
        int i2 = r2.A01;
        if (r2 instanceof C93944pb) {
            i = 72;
        } else if (r2 instanceof C94014pi) {
            C94014pi r22 = (C94014pi) r2;
            if (r22.A07()) {
                r0 = r22.A01;
            } else {
                r0 = r22.A00;
            }
            i = r0.A02;
        } else {
            i = 100;
        }
        C626936e.A0B(true);
        return Math.round((((float) i2) * ((float) i)) / 100.0f);
    }

    public RectF A03(int i, int i2) {
        AnonymousClass33C r1;
        float f;
        float f2;
        if (this instanceof C93944pb) {
            throw new UnsupportedOperationException();
        } else if (this instanceof C94014pi) {
            C94014pi r9 = (C94014pi) this;
            if (r9 instanceof C94004ph) {
                throw new UnsupportedOperationException();
            } else if (r9 instanceof C93974pe) {
                throw new UnsupportedOperationException();
            } else if (r9 instanceof C93994pg) {
                throw new UnsupportedOperationException();
            } else {
                AnonymousClass33C r12 = r9.A00;
                if (r12 == null || i2 <= 0 || i <= 0) {
                    return null;
                }
                float f3 = (float) r12.A08;
                float f4 = (float) r12.A06;
                PointF A08 = AnonymousClass4L0.A08(f3 / 2.0f, f4 / 2.0f);
                float f5 = (float) i;
                float f6 = (float) i2;
                PointF A082 = AnonymousClass4L0.A08(f5 / 2.0f, f6 / 2.0f);
                if (r9.A07()) {
                    int i3 = r9.A00.A03;
                    if (i3 > 0) {
                        f2 = (float) i3;
                    } else {
                        f2 = f4 / 3.0f;
                    }
                    A08.y = f2;
                    A082.y = f6 / 3.0f;
                }
                float f7 = f3 / f5;
                float f8 = f6 * f7;
                float f9 = f3 / f4;
                if (f9 > 4.0f / 1.0f) {
                    f7 = f4 / f6;
                    f = f5 * f7;
                    f8 = f4;
                } else {
                    f = f3;
                }
                PointF A083 = AnonymousClass4L0.A08(A082.x * f7, A082.y * f7);
                RectF A07 = AnonymousClass002.A07();
                float f10 = A08.x - A083.x;
                A07.left = f10;
                float f11 = A08.y - A083.y;
                A07.top = f11;
                A07.right = f10 + f;
                float f12 = f11 + f8;
                A07.bottom = f12;
                if (f11 < 0.0f) {
                    A07.top = 0.0f;
                    A07.bottom = f8;
                    f12 = f8;
                }
                if (f12 > f4) {
                    A07.bottom = f4;
                    A07.top = f4 - f8;
                }
                Locale locale = Locale.US;
                Object[] objArr = new Object[12];
                AnonymousClass001.A1P(objArr, f3, 0);
                AnonymousClass001.A1P(objArr, f4, 1);
                AnonymousClass001.A1P(objArr, f9, 2);
                AnonymousClass33C r13 = r9.A00;
                AnonymousClass000.A1O(objArr, r13.A02);
                C18280x3.A1P(objArr, r13.A03);
                AnonymousClass000.A1P(objArr, i, 5);
                AnonymousClass000.A1P(objArr, i2, 6);
                objArr[7] = Float.valueOf(f5 / f6);
                AnonymousClass001.A1P(objArr, f, 8);
                AnonymousClass001.A1P(objArr, f8, 9);
                objArr[10] = Float.valueOf(f / f8);
                AnonymousClass0x7.A1E(A07, objArr, 11);
                Log.d(String.format(locale, "ConversationRowSingleImagePreviewCalculator/getSourceRect bitmap=%f,%f(%f) face=%d,%d preview=%d,%d(%f) scaled=%f,%f(%f) rect=%s", objArr));
                return A07;
            }
        } else if (!(this instanceof C93964pd) || (r1 = this.A00) == null) {
            return null;
        } else {
            int i4 = r1.A08;
            int i5 = r1.A06;
            int i6 = i4 * i2;
            float f13 = (float) i;
            float f14 = (float) i4;
            float f15 = f14;
            if (i6 > i5 * i) {
                f13 = (float) i2;
                f14 = (float) i5;
            }
            return C86664Kz.A0b(f15, ((float) i2) / (f13 / f14));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r5 == null) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A04(int r10, int r11) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C93944pb
            if (r0 == 0) goto L_0x000d
            int r0 = A01(r9)
            android.util.Pair r0 = r9.A05(r10, r11, r0)
            return r0
        L_0x000d:
            boolean r0 = r9 instanceof X.C94014pi
            if (r0 == 0) goto L_0x00e5
            r4 = r9
            X.4pi r4 = (X.C94014pi) r4
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x00e1
            X.5NR r6 = r4.A01
        L_0x001c:
            int r0 = r4.A01
            float r3 = (float) r0
            int r0 = r6.A02
            float r0 = (float) r0
            float r1 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            java.lang.Float r8 = X.C94014pi.A00(r1, r10)
            if (r8 == 0) goto L_0x007c
            float r7 = r8.floatValue()
            X.33C r2 = r4.A00
            int r0 = r2.A06
            float r1 = (float) r0
            float r1 = r1 * r7
            int r0 = r2.A08
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r5 = X.C94014pi.A00(r1, r11)
            if (r5 == 0) goto L_0x007c
            X.33C r1 = r4.A00
            int r0 = r1.A08
            float r2 = (float) r0
            float r7 = r7 / r2
            float r5 = r5.floatValue()
            int r0 = r1.A06
            float r0 = (float) r0
            float r1 = r5 / r0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
            float r2 = r2 * r1
            java.lang.Float r8 = java.lang.Float.valueOf(r2)
        L_0x0059:
            float r2 = r8.floatValue()
            float r0 = r6.A00
            float r1 = r2 * r0
            float r0 = r6.A01
            float r1 = r1 / r0
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x00dc
            float r0 = java.lang.Math.min(r5, r1)
        L_0x006e:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            android.util.Pair r5 = A02(r2, r0)
            if (r5 != 0) goto L_0x0090
        L_0x007c:
            X.5NR r0 = r4.A00
            int r0 = r0.A02
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            android.util.Pair r5 = A02(r3, r1)
        L_0x0090:
            java.util.Locale r6 = java.util.Locale.US
            r0 = 8
            java.lang.Object[] r3 = new java.lang.Object[r0]
            X.33C r2 = r4.A00
            int r1 = r2.A08
            X.AnonymousClass000.A1L(r3, r1)
            int r0 = r2.A06
            X.AnonymousClass000.A1M(r3, r0)
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0 = 2
            r3[r0] = r1
            int r0 = r2.A02
            X.AnonymousClass000.A1O(r3, r0)
            int r0 = r2.A03
            X.C18280x3.A1P(r3, r0)
            java.lang.Object r1 = r5.first
            r0 = 5
            r3[r0] = r1
            r0 = 6
            java.lang.Object r2 = r5.second
            r3[r0] = r2
            int r0 = X.AnonymousClass001.A0K(r1)
            float r1 = (float) r0
            int r0 = X.AnonymousClass001.A0K(r2)
            float r0 = (float) r0
            float r1 = r1 / r0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0 = 7
            r3[r0] = r1
            java.lang.String r0 = "ConversationRowSingleImagePreviewCalculator/getPreviewDimension bitmap=%d,%d(%f) face=%d,%d preview=%d,%d(%f)"
            java.lang.String r0 = java.lang.String.format(r6, r0, r3)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            return r5
        L_0x00dc:
            float r0 = java.lang.Math.max(r5, r1)
            goto L_0x006e
        L_0x00e1:
            X.5NR r6 = r4.A00
            goto L_0x001c
        L_0x00e5:
            boolean r0 = r9 instanceof X.C93964pd
            if (r0 == 0) goto L_0x00f8
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            float r1 = (float) r0
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            float r0 = (float) r0
            android.util.Pair r0 = A02(r1, r0)
            return r0
        L_0x00f8:
            r1 = r9
            X.4pc r1 = (X.C93954pc) r1
            int r4 = r1.A00
            if (r4 > 0) goto L_0x0108
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            android.util.Pair r0 = r1.A05(r10, r11, r0)
            return r0
        L_0x0108:
            X.33C r1 = r1.A00
            int r0 = r1.A08
            float r3 = (float) r0
            int r0 = r1.A06
            float r1 = (float) r0
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            float r2 = (float) r0
            int r0 = r4 * 2
            float r0 = (float) r0
            float r1 = r1 * r2
            float r1 = X.C86664Kz.A00(r1, r3, r0)
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            if (r0 == 0) goto L_0x012c
            int r0 = android.view.View.MeasureSpec.getSize(r11)
            float r0 = (float) r0
            float r1 = java.lang.Math.min(r0, r1)
        L_0x012c:
            android.util.Pair r0 = A02(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Y3.A04(int, int):android.util.Pair");
    }

    public final Pair A05(int i, int i2, int i3) {
        C626936e.A07(this.A00, "setMediaData() must be called prior.");
        AnonymousClass33C r1 = this.A00;
        float f = (float) r1.A08;
        float f2 = (float) r1.A06;
        float f3 = (float) i3;
        if (View.MeasureSpec.getMode(i) != 0) {
            f3 = Math.min((float) View.MeasureSpec.getSize(i), f3);
        }
        float f4 = (f2 * f3) / f;
        if (View.MeasureSpec.getMode(i2) != 0) {
            f4 = Math.min((float) View.MeasureSpec.getSize(i2), f4);
        }
        return A02(f3, f4);
    }

    public void A06(int i, int i2) {
        AnonymousClass33C r0 = new AnonymousClass33C();
        r0.A08 = i;
        r0.A06 = i2;
        this.A00 = r0;
    }

    public boolean A07() {
        boolean z = this instanceof C94004ph;
        AnonymousClass33C r3 = this.A00;
        C626936e.A0C(AnonymousClass000.A1W(r3));
        int i = r3.A06;
        int i2 = r3.A08;
        if (z) {
            if (i >= i2) {
                return true;
            }
            return false;
        } else if (i > i2) {
            return true;
        } else {
            return false;
        }
    }

    public AnonymousClass5Y3(int i) {
        this.A01 = i;
    }

    public static Pair A02(float f, float f2) {
        return Pair.create(Integer.valueOf(Math.round(f)), Integer.valueOf(Math.round(f2)));
    }
}
